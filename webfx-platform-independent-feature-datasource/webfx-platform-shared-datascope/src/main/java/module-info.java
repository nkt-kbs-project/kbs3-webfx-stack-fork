// File managed by WebFX (DO NOT EDIT MANUALLY)

module webfx.platform.shared.datascope {

    // Direct dependencies modules
    requires java.base;
    requires webfx.platform.shared.json;
    requires webfx.platform.shared.serial;

    // Exported packages
    exports dev.webfx.platform.shared.datascope;
    exports dev.webfx.platform.shared.datascope.aggregate;
    exports dev.webfx.platform.shared.datascope.schema;

    // Provided services
    provides dev.webfx.platform.shared.services.serial.spi.SerialCodec with dev.webfx.platform.shared.datascope.aggregate.AggregateScope.ProvidedSerialCodec;

}