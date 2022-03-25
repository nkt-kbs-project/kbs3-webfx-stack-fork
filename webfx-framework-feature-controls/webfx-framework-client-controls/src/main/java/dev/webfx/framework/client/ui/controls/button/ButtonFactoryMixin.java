package dev.webfx.framework.client.ui.controls.button;

import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import dev.webfx.framework.client.ui.action.Action;
import dev.webfx.framework.client.ui.util.background.BackgroundFactory;
import dev.webfx.framework.client.ui.util.border.BorderFactory;
import dev.webfx.framework.client.ui.controls.ControlFactoryMixin;
import dev.webfx.framework.client.ui.util.layout.LayoutUtil;

/**
 * @author Bruno Salmon
 */
public interface ButtonFactoryMixin extends ControlFactoryMixin {

    int LARGE_BUTTON_HEIGHT = 45;
    int COLOR_BUTTON_BORDER_WIDTH = 4;

    default Button newButton(Object i18nKey, Runnable handler) {
        return newButtonBuilder(i18nKey, handler).build();
    }

    default ButtonBuilder newButtonBuilder(Object i18nKey, Runnable handler) {
        return newButtonBuilder(newAction(i18nKey, handler));
    }

    default Button newLargeGreenButton(Object i18nKey) {
        return LayoutUtil.setMaxWidthToInfinite(newLargeGreenButtonBuilder(i18nKey).build());
    }

    default Button newLargeGreenButton(Action action) {
        return LayoutUtil.setMaxWidthToInfinite(newLargeGreenButtonBuilder(action).build());
    }

    default ButtonBuilder newLargeGreenButtonBuilder(Object i18nKey) {
        return newGreenButtonBuilder(i18nKey).setHeight(LARGE_BUTTON_HEIGHT);
    }

    default ButtonBuilder newLargeGreenButtonBuilder(Action action) {
        return newGreenButtonBuilder(null).setAction(action).setHeight(LARGE_BUTTON_HEIGHT);
    }

    default Button newGreenButton(Object i18nKey) {
        return newGreenButtonBuilder(i18nKey).build();
    }

    default Button newGreenButton(Action action) {
        return newGreenButtonBuilder(null).setAction(action).build();
    }

    default ButtonBuilder newGreenButtonBuilder(Object i18nKey) {
        return newColorButtonBuilder(i18nKey, "#B7CA79", "#7D9563");
    }

    default Button newTransparentButton(Object i18nKey) {
        return newTransparentButtonBuilder(i18nKey).build();
    }

    default ButtonBuilder newTransparentButtonBuilder(Object i18nKey) {
        return transparent(newButtonBuilder(i18nKey));
    }

    default Button newTransparentButton(Action action) {
        return newTransparentButtonBuilder(action).build();
    }

    default ButtonBuilder newTransparentButtonBuilder(Action action) {
        return transparent(newButtonBuilder(action));
    }

    default ButtonBuilder newColorButtonBuilder(Object i18nKey, String topColor, String bottomColor) {
        return colorize(newButtonBuilder(i18nKey), topColor, bottomColor);
    }

    default ButtonBuilder transparent(ButtonBuilder buttonBuilder) {
        return colorize(buttonBuilder, null, null);
    }

    default ButtonBuilder colorize(ButtonBuilder buttonBuilder, String topColor, String bottomColor) {
        double buttonHeight = LARGE_BUTTON_HEIGHT;
        double borderWidth = COLOR_BUTTON_BORDER_WIDTH;
        Paint textFill = Color.WHITE, pressedTextFill = textFill;
        Background background, pressedBackground;
        if (topColor != null && bottomColor != null) {
            background = BackgroundFactory.newVerticalLinearGradientBackground(topColor, bottomColor, buttonHeight / 2, borderWidth);
            pressedBackground = BackgroundFactory.newVerticalLinearGradientBackground(bottomColor, topColor, buttonHeight / 2, borderWidth);
        } else {
            background = BackgroundFactory.newBackground(Color.TRANSPARENT, buttonHeight / 2, borderWidth - 1);
            pressedBackground = BackgroundFactory.newBackground(textFill, buttonHeight / 2, borderWidth - 1);
            pressedTextFill = Color.BLACK;
        }
        return buttonBuilder
                .setBorder(BorderFactory.newBorder(textFill, buttonHeight / 2, borderWidth))
                .setBackground(background)
                .setPressedBackground(pressedBackground)
                .setTextFill(textFill)
                .setPressedTextFill(pressedTextFill)
                //.setHeight(buttonHeight)
                ;
    }

    default Button newOkButton(Runnable handler) {
        return newOkButtonBuilder(handler).build();
    }

    default ButtonBuilder newOkButtonBuilder(Runnable handler) {
        return newButtonBuilder(newOkAction(handler));
    }

    default Button newCancelButton(Runnable handler) {
        return newCancelButtonBuilder(handler).build();
    }

    default ButtonBuilder newCancelButtonBuilder(Runnable handler) {
        return newButtonBuilder(newCancelAction(handler));
    }

    default Button newRemoveButton(Runnable handler) {
        return newRemoveButtonBuilder(handler).build();
    }

    default ButtonBuilder newRemoveButtonBuilder(Runnable handler) {
        return newButtonBuilder(newRemoveAction(handler));
    }

}
