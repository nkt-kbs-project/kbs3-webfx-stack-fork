// File managed by WebFX (DO NOT EDIT MANUALLY)

module webfx.platform.shared.submit {

    // Direct dependencies modules
    requires java.base;
    requires webfx.platform.shared.buscall;
    requires webfx.platform.shared.datascope;
    requires webfx.platform.shared.datasource;
    requires webfx.platform.shared.json;
    requires webfx.platform.shared.serial;
    requires webfx.platform.shared.util;

    // Exported packages
    exports dev.webfx.platform.shared.services.submit;
    exports dev.webfx.platform.shared.services.submit.spi;
    exports dev.webfx.platform.shared.services.submit.spi.impl;

    // Used services
    uses dev.webfx.platform.shared.services.submit.spi.SubmitServiceProvider;

    // Provided services
    provides dev.webfx.platform.shared.services.buscall.spi.BusCallEndpoint with dev.webfx.platform.shared.services.submit.ExecuteSubmitBusCallEndpoint, dev.webfx.platform.shared.services.submit.ExecuteSubmitBatchBusCallEndpoint;
    provides dev.webfx.platform.shared.services.serial.spi.SerialCodec with dev.webfx.platform.shared.services.submit.SubmitArgument.ProvidedSerialCodec, dev.webfx.platform.shared.services.submit.SubmitResult.ProvidedSerialCodec, dev.webfx.platform.shared.services.submit.GeneratedKeyBatchIndex.ProvidedSerialCodec;

}