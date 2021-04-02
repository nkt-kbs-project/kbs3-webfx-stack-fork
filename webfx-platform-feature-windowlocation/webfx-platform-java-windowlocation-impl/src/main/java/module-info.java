// File managed by WebFX (DO NOT EDIT MANUALLY)

module webfx.platform.java.windowlocation.impl {

    // Direct dependencies modules
    requires webfx.platform.client.websocketbus;
    requires webfx.platform.client.windowhistory;
    requires webfx.platform.client.windowlocation;
    requires webfx.platform.shared.bus;

    // Exported packages
    exports dev.webfx.platform.java.services.windowlocation.spi.impl;

    // Provided services
    provides dev.webfx.platform.client.services.windowlocation.spi.WindowLocationProvider with dev.webfx.platform.java.services.windowlocation.spi.impl.JavaWindowLocationProvider;

}