package dev.webfx.stack.routing.uirouter.activity.view;

import javafx.beans.property.Property;
import javafx.scene.Node;

/**
 * @author Bruno Salmon
 */
public interface HasMountNodeProperty {

    Property<Node> mountNodeProperty();
    default void setMountNode(Node node) { mountNodeProperty().setValue(node); }
    default Node getMountNode() { return mountNodeProperty().getValue(); }

}
