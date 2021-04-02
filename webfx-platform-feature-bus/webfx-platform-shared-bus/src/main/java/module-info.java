// File managed by WebFX (DO NOT EDIT MANUALLY)

module webfx.platform.shared.bus {

    // Direct dependencies modules
    requires java.base;
    requires webfx.platform.shared.json;
    requires webfx.platform.shared.log;
    requires webfx.platform.shared.scheduler;
    requires webfx.platform.shared.util;

    // Exported packages
    exports dev.webfx.platform.shared.services.bus;
    exports dev.webfx.platform.shared.services.bus.spi;
    exports dev.webfx.platform.shared.services.bus.spi.impl;

    // Used services
    uses dev.webfx.platform.shared.services.bus.spi.BusServiceProvider;

}