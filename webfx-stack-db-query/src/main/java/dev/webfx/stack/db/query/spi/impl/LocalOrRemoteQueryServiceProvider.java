package dev.webfx.stack.db.query.spi.impl;

import dev.webfx.stack.com.bus.call.BusCallService;
import dev.webfx.platform.async.Future;
import dev.webfx.stack.db.query.QueryArgument;
import dev.webfx.stack.db.query.QueryService;

/**
 * @author Bruno Salmon
 *
 * TODO Turn this service provider into a service interceptor (requires the build tool to provide the automatic conditional
 * TODO module inclusion (here: when both webfx-platform-shared-query and webfx-platform-shared-buscall are included)
 */
public class LocalOrRemoteQueryServiceProvider extends LocalQueryServiceProvider {

    protected <T> Future<T> executeRemoteQuery(QueryArgument argument) {
        return BusCallService.call(QueryService.QUERY_SERVICE_ADDRESS, argument);
    }
}
