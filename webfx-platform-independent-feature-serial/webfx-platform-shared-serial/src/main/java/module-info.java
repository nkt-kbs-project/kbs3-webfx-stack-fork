// File managed by WebFX (DO NOT EDIT MANUALLY)

module webfx.platform.shared.serial {

    // Direct dependencies modules
    requires java.base;
    requires webfx.platform.shared.appcontainer;
    requires webfx.platform.shared.json;
    requires webfx.platform.shared.log;
    requires webfx.platform.shared.util;

    // Exported packages
    exports dev.webfx.platform.shared.services.serial;
    exports dev.webfx.platform.shared.services.serial.spi;
    exports dev.webfx.platform.shared.services.serial.spi.impl;

    // Used services
    uses dev.webfx.platform.shared.services.serial.spi.SerialCodec;

    // Provided services
    provides dev.webfx.platform.shared.services.appcontainer.spi.ApplicationModuleInitializer with dev.webfx.platform.shared.services.serial.SerialCodecModuleInitializer;
    provides dev.webfx.platform.shared.services.serial.spi.SerialCodec with dev.webfx.platform.shared.services.serial.spi.impl.ProvidedBatchSerialCodec;

}