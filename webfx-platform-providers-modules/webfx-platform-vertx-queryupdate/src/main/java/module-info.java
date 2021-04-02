// File managed by WebFX (DO NOT EDIT MANUALLY)

module webfx.platform.vertx.queryupdate {

    // Direct dependencies modules
    requires java.base;
    requires java.sql;
    requires vertx.core;
    requires vertx.jdbc.client;
    requires vertx.mysql.postgresql.client.jasync;
    requires vertx.sql.common;
    requires webfx.platform.shared.datasource;
    requires webfx.platform.shared.log;
    requires webfx.platform.shared.query;
    requires webfx.platform.shared.submit;
    requires webfx.platform.shared.submitlistener;
    requires webfx.platform.shared.util;
    requires webfx.platform.vertx.instance;

    // Exported packages
    exports dev.webfx.platform.vertx.services_shared_code.queryupdate;

}