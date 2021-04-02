// File managed by WebFX (DO NOT EDIT MANUALLY)

module webfx.platform.java.windowhistory.impl {

    // Direct dependencies modules
    requires webfx.platform.client.windowhistory;

    // Exported packages
    exports dev.webfx.platform.java.services.windowhistory.spi.impl;

    // Provided services
    provides dev.webfx.platform.client.services.windowhistory.spi.WindowHistoryProvider with dev.webfx.platform.java.services.windowhistory.spi.impl.JavaWindowHistoryProvider;

}