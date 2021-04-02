// File managed by WebFX (DO NOT EDIT MANUALLY)

module webfx.platform.java.websocket.impl {

    // Direct dependencies modules
    requires Java.WebSocket;
    requires java.base;
    requires webfx.platform.client.websocket;
    requires webfx.platform.shared.json;
    requires webfx.platform.shared.log;

    // Exported packages
    exports dev.webfx.platform.java.services.websocket.spi.impl;

    // Provided services
    provides dev.webfx.platform.client.services.websocket.spi.WebSocketServiceProvider with dev.webfx.platform.java.services.websocket.spi.impl.JavaWebSocketServiceProvider;

}