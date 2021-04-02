// File managed by WebFX (DO NOT EDIT MANUALLY)

module webfx.platform.shared.webworker {

    // Direct dependencies modules
    requires java.base;
    requires webfx.platform.shared.util;

    // Exported packages
    exports dev.webfx.platform.shared.services.webworker;
    exports dev.webfx.platform.shared.services.webworker.pool;
    exports dev.webfx.platform.shared.services.webworker.spi;
    exports dev.webfx.platform.shared.services.webworker.spi.base;

    // Used services
    uses dev.webfx.platform.shared.services.webworker.spi.WorkerServiceProvider;

}