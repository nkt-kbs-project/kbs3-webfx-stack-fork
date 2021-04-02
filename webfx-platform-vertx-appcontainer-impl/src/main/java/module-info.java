// File managed by WebFX (DO NOT EDIT MANUALLY)

module webfx.platform.vertx.appcontainer.impl {

    // Direct dependencies modules
    requires java.base;
    requires vertx.bridge.common;
    requires vertx.core;
    requires vertx.web;
    requires webfx.platform.shared.appcontainer;
    requires webfx.platform.shared.shutdown;
    requires webfx.platform.shared.util;
    requires webfx.platform.vertx.instance;

    // Exported packages
    exports dev.webfx.platform.vertx.services.appcontainer.spi.impl;

    // Provided services
    provides dev.webfx.platform.shared.services.appcontainer.spi.ApplicationContainerProvider with dev.webfx.platform.vertx.services.appcontainer.spi.impl.VertxApplicationContainerVerticle;

}