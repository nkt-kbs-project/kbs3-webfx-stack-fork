// File managed by WebFX (DO NOT EDIT MANUALLY)

module webfx.platform.shared.submitlistener {

    // Direct dependencies modules
    requires java.base;
    requires webfx.platform.shared.appcontainer;
    requires webfx.platform.shared.log;
    requires webfx.platform.shared.submit;
    requires webfx.platform.shared.util;

    // Exported packages
    exports dev.webfx.platform.server.services.submitlistener;

    // Used services
    uses dev.webfx.platform.server.services.submitlistener.SubmitListener;

    // Provided services
    provides dev.webfx.platform.shared.services.appcontainer.spi.ApplicationModuleInitializer with dev.webfx.platform.server.services.submitlistener.SubmitListenerModuleInitializer;

}