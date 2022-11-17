package dev.webfx.stack.routing.uirouter.uisession;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableBooleanValue;
import dev.webfx.stack.auth.authz.mixin.ObservableUserAuthorizationFactory;
import dev.webfx.stack.auth.authz.mixin.ObservableUserAuthorizationFactoryMixin;

/**
 * @author Bruno Salmon
 */
public interface UiSessionMixin extends UiSession, ObservableUserAuthorizationFactoryMixin {

    UiSession getUiSession();

    @Override
    default ObservableUserAuthorizationFactory getAuthorizationFactory() {
        return getUiSession();
    }

    default Property<Object> userPrincipalProperty() {
        return getUiSession().userPrincipalProperty();
    }

    default void setUserPrincipal(Object user) {
        getUiSession().setUserPrincipal(user);
    }

    default ObservableBooleanValue loggedInProperty() {
        return getUiSession().loggedInProperty();
    }

    default boolean isLoggedIn() {
        return getUiSession().isLoggedIn();
    }

}
