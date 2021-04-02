// File managed by WebFX (DO NOT EDIT MANUALLY)

module webfx.platform.java.submit.impl.jdbc {

    // Direct dependencies modules
    requires webfx.platform.java.queryupdate;
    requires webfx.platform.shared.datasource;
    requires webfx.platform.shared.submit;

    // Exported packages
    exports dev.webfx.platform.java.services.submit.spi.impl.jdbc;

    // Provided services
    provides dev.webfx.platform.shared.services.submit.spi.SubmitServiceProvider with dev.webfx.platform.java.services.submit.spi.impl.jdbc.JdbcSubmitServiceProvider;

}