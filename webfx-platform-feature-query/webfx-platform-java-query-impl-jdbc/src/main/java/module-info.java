// File managed by WebFX (DO NOT EDIT MANUALLY)

module webfx.platform.java.query.impl.jdbc {

    // Direct dependencies modules
    requires webfx.platform.java.queryupdate;
    requires webfx.platform.shared.datasource;
    requires webfx.platform.shared.query;

    // Exported packages
    exports dev.webfx.platform.java.services.query.spi.impl.jdbc;

    // Provided services
    provides dev.webfx.platform.shared.services.query.spi.QueryServiceProvider with dev.webfx.platform.java.services.query.spi.impl.jdbc.JdbcQueryServiceProvider;

}