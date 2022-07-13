package dev.webfx.stack.routing.router.session.impl;

import dev.webfx.stack.routing.router.RoutingContext;

/**
 * @author Bruno Salmon
 */
public final class UserHolder {
    RoutingContext context;
    Object userPrincipal;

    public UserHolder(RoutingContext context) {
        this.context = context;
    }

    public UserHolder(Object userPrincipal) {
        this.userPrincipal = userPrincipal;
    }
}
