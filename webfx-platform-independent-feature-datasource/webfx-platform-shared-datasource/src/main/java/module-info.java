// File managed by WebFX (DO NOT EDIT MANUALLY)

module webfx.platform.shared.datasource {

    // Direct dependencies modules
    requires java.base;
    requires webfx.platform.shared.util;

    // Exported packages
    exports dev.webfx.platform.shared.services.datasource;
    exports dev.webfx.platform.shared.services.datasource.jdbc;
    exports dev.webfx.platform.shared.services.datasource.spi;
    exports dev.webfx.platform.shared.services.datasource.spi.simple;

    // Used services
    uses dev.webfx.platform.shared.services.datasource.spi.LocalDataSourceProvider;

}