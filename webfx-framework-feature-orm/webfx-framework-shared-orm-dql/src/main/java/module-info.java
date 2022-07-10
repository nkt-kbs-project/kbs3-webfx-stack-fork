// File managed by WebFX (DO NOT EDIT MANUALLY)

module webfx.framework.shared.orm.dql {

    // Direct dependencies modules
    requires java.base;
    requires webfx.extras.type;
    requires webfx.framework.shared.orm.expression;
    requires webfx.platform.shared.json;
    requires webfx.platform.shared.util;

    // Exported packages
    exports dev.webfx.stack.framework.shared.orm.dql;
    exports dev.webfx.stack.framework.shared.orm.dql.sqlcompiler;
    exports dev.webfx.stack.framework.shared.orm.dql.sqlcompiler.lci;
    exports dev.webfx.stack.framework.shared.orm.dql.sqlcompiler.lci.mock;
    exports dev.webfx.stack.framework.shared.orm.dql.sqlcompiler.mapping;
    exports dev.webfx.stack.framework.shared.orm.dql.sqlcompiler.sql;
    exports dev.webfx.stack.framework.shared.orm.dql.sqlcompiler.sql.dbms;
    exports dev.webfx.stack.framework.shared.orm.dql.sqlcompiler.terms;

}