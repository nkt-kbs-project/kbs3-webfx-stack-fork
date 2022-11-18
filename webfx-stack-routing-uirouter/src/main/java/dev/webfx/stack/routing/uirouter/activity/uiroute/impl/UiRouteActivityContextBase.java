package dev.webfx.stack.routing.uirouter.activity.uiroute.impl;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ReadOnlyProperty;
import javafx.beans.property.SimpleBooleanProperty;
import dev.webfx.stack.routing.uirouter.activity.uiroute.UiRouteActivityContext;
import dev.webfx.stack.session.Session;
import dev.webfx.stack.routing.uirouter.UiRouter;
import dev.webfx.stack.routing.activity.ActivityContext;
import dev.webfx.stack.routing.activity.ActivityContextFactory;
import dev.webfx.stack.routing.activity.impl.ActivityContextBase;
import dev.webfx.platform.windowhistory.WindowHistory;
import dev.webfx.platform.windowhistory.spi.BrowsingHistory;
import dev.webfx.platform.json.Json;
import dev.webfx.platform.json.ReadOnlyJsonObject;

/**
 * @author Bruno Salmon
 */
public class UiRouteActivityContextBase
        <THIS extends UiRouteActivityContextBase<THIS>>

        extends ActivityContextBase<THIS>
        implements UiRouteActivityContext<THIS> {

    private UiRouter uiRouter;
    private ReadOnlyJsonObject params;
    private Session session;
    private String routingPath;

    protected UiRouteActivityContextBase(ActivityContext parentContext, ActivityContextFactory<THIS> contextFactory) {
        super(parentContext, contextFactory);
    }

    public void setUiRouter(UiRouter uiRouter) {
        this.uiRouter = uiRouter;
    }

    @Override
    public UiRouter getUiRouter() {
        UiRouter thisOrParentUiRouter = getThisOrParentUiRouter();
        if (thisOrParentUiRouter == null)
            setUiRouter(thisOrParentUiRouter = UiRouter.create(this));
        return thisOrParentUiRouter;
    }

    private UiRouter getThisOrParentUiRouter() {
        if (uiRouter != null)
            return uiRouter;
        ActivityContext parentContext = getParentContext();
        if (parentContext instanceof UiRouteActivityContext)
            return ((UiRouteActivityContext) parentContext).getUiRouter();
        return null;
    }

    @Override
    public BrowsingHistory getHistory() {
        UiRouter thisOrParentUiRouter = getThisOrParentUiRouter();
        if (thisOrParentUiRouter == null)
            return WindowHistory.getProvider();
        return thisOrParentUiRouter.getHistory();
    }

    public void setParams(ReadOnlyJsonObject params) {
        this.params = params;
    }

    @Override
    public ReadOnlyJsonObject getParams() {
        if (params == null)
            params = Json.createObject();
        return params;
    }

    @Override
    public <T> T getParameter(String key) {
        T value = getParams().get(key);
        if (value == null && !params.has(key)) {
            ActivityContext parentContext = getParentContext();
            if (parentContext instanceof UiRouteActivityContext)
                return ((UiRouteActivityContext<?>) parentContext).getParameter(key);
        }
        return value;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public String getRoutingPath() {
        String routingPath = this.routingPath;
        if (routingPath == null) {
            ActivityContext parentContext = getParentContext();
            if (parentContext instanceof UiRouteActivityContext)
                return ((UiRouteActivityContext<?>) parentContext).getRoutingPath();
        }
        return routingPath;
    }

    public void setRoutingPath(String routingPath) {
        this.routingPath = routingPath;
    }

    public static <IC extends ActivityContext<IC>, OC extends UiRouteActivityContextBase<OC>> OC toUiRouterActivityContextBase(IC activityContext) {
        return from(activityContext, ac -> ac instanceof UiRouteActivityContextBase);
    }

    private final BooleanProperty activeProperty = new SimpleBooleanProperty(false);
    @Override
    public ReadOnlyProperty<Boolean> activeProperty() {
        return activeProperty;
    }

}
