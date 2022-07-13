package dev.webfx.stack.querypush;


import dev.webfx.stack.db.datascope.DataScope;

/**
 * @author Bruno Salmon
 */
public final class PulseArgument {

    private final Object dataSourceId;
    private final DataScope dataScope;

    public PulseArgument(Object dataSourceId, DataScope dataScope) {
        this.dataSourceId = dataSourceId;
        this.dataScope = dataScope;
    }

    public Object getDataSourceId() {
        return dataSourceId;
    }

    public DataScope getDataScope() {
        return dataScope;
    }

    // Static factory methods

    public static PulseArgument createToRefreshAllQueriesImpactedByDataScope(Object dataSourceId, DataScope dataScope) {
        return new PulseArgument(dataSourceId, dataScope);
    }
}
