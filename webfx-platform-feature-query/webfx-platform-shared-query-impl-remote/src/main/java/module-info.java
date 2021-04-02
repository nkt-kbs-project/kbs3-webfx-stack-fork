// File managed by WebFX (DO NOT EDIT MANUALLY)

module webfx.platform.shared.query.impl.remote {

    // Direct dependencies modules
    requires webfx.platform.shared.query;

    // Exported packages
    exports dev.webfx.platform.shared.services.query.spi.impl.remote;

    // Provided services
    provides dev.webfx.platform.shared.services.query.spi.QueryServiceProvider with dev.webfx.platform.shared.services.query.spi.impl.remote.RemoteQueryServiceProvider;

}