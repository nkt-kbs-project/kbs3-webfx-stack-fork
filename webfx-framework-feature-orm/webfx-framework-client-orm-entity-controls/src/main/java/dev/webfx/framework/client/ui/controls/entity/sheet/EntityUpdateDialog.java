package dev.webfx.framework.client.ui.controls.entity.sheet;

import javafx.application.Platform;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import dev.webfx.framework.client.ui.controls.MaterialFactoryMixin;
import dev.webfx.framework.client.ui.controls.button.ButtonFactoryMixin;
import dev.webfx.framework.client.ui.controls.dialog.DialogContent;
import dev.webfx.framework.client.ui.controls.dialog.DialogUtil;
import dev.webfx.framework.shared.orm.expression.Expression;
import dev.webfx.framework.shared.orm.entity.Entity;
import dev.webfx.framework.shared.orm.entity.UpdateStore;

abstract class EntityUpdateDialog<E extends Entity> implements MaterialFactoryMixin, ButtonFactoryMixin {

    Pane dialogParent; // Keeping referenced only for transmission to the EntityRenderingContext
    Node node;
    E entity;
    Entity updateEntity;
    private DialogContent dialogContent;
    private UpdateStore updateStore;

    public E getEntity() {
        return entity;
    }

    public void setEntity(E entity) {
        this.entity = entity;
    }

    public Node getNode() {
        if (node == null) {
            node = buildNode();
            syncUiFromModel();
        }
        return node;
    }

    abstract Node buildNode();

    abstract void syncUiFromModel();

    void updateOkButton() {
        if (dialogContent != null)
            dialogContent.getOkButton().setDisable(!updateStore.hasChanges());
    }

    abstract Expression<? extends Entity> expressionToLoad();

    void showAsDialog(Pane parent) {
        dialogParent = parent;
        entity.onExpressionLoaded(expressionToLoad()).setHandler(ar -> {
            if (ar.failed())
                ar.cause().printStackTrace();
            else
                Platform.runLater(() -> {
                    if (entity.getStore() instanceof UpdateStore) {
                        updateStore = (UpdateStore) entity.getStore();
                        updateEntity = entity;
                    } else {
                        updateStore = UpdateStore.createAbove(entity.getStore());
                        updateEntity = updateStore.updateEntity(entity);
                    }
                    dialogContent = new DialogContent().setContent(getNode());
                    DialogUtil.showModalNodeInGoldLayout(dialogContent, parent);
                    DialogUtil.armDialogContentButtons(dialogContent, dialogCallback -> {
                        if (!updateStore.hasChanges())
                            dialogCallback.closeDialog();
                        else {
                            updateStore.submitChanges().setHandler(ar2 -> {
                                if (ar2.failed())
                                    dialogCallback.showException(ar2.cause());
                                else
                                    dialogCallback.closeDialog();
                            });
                        }
                    });
                    updateOkButton();
                });
        });
    }

}
