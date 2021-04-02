// File managed by WebFX (DO NOT EDIT MANUALLY)

module webfx.platform.client.webassembly {

    // Direct dependencies modules
    requires java.base;
    requires webfx.platform.shared.util;

    // Exported packages
    exports dev.webfx.platform.client.services.webassembly;
    exports dev.webfx.platform.client.services.webassembly.spi;

    // Used services
    uses dev.webfx.platform.client.services.webassembly.spi.WebAssemblyProvider;

}