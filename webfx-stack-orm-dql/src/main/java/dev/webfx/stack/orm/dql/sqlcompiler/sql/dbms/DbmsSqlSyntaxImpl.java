package dev.webfx.stack.orm.dql.sqlcompiler.sql.dbms;

/**
 * @author Bruno Salmon
 */
public class DbmsSqlSyntaxImpl implements DbmsSqlSyntax {

    private final boolean repeatTableAliasAfterDelete;
    private final boolean hasInsertReturningClause;

    public DbmsSqlSyntaxImpl(boolean repeatTableAliasAfterDelete, boolean hasInsertReturningClause) {
        this.repeatTableAliasAfterDelete = repeatTableAliasAfterDelete;
        this.hasInsertReturningClause = hasInsertReturningClause;
    }

    public boolean repeatTableAliasAfterDelete() {
        return repeatTableAliasAfterDelete;
    }

    public boolean hasInsertReturningClause() {
        return hasInsertReturningClause;
    }

    public boolean isReservedIdentifier(String identifier) {
        switch (identifier.toLowerCase()) {
            case "abs":
            case "absolute":
            case "action":
            case "add":
            case "all":
            case "allocate":
            case "alter":
            case "and":
            case "any":
            case "are":
            case "array":
            case "array_agg":
            case "as":
            case "asc":
            case "asensitive":
            case "assertion":
            case "asymmetric":
            case "at":
            case "atomic":
            case "authorization":
            case "avg":
            case "begin":
            case "begin_frame":
            case "begin_partition":
            case "between":
            case "bigint":
            case "binary":
            case "bit":
            case "bit_length":
            case "blob":
            case "boolean":
            case "both":
            case "by":
            case "call":
            case "called":
            case "cardinality":
            case "cascade":
            case "cascaded":
            case "case":
            case "cast":
            case "catalog":
            case "ceil":
            case "ceiling":
            case "char":
            case "character":
            case "character_length":
            case "char_length":
            case "check":
            case "clob":
            case "close":
            case "coalesce":
            case "collate":
            case "collation":
            case "collect":
            case "column":
            case "commit":
            case "condition":
            case "connect":
            case "connection":
            case "constraint":
            case "constraints":
            case "contains":
            case "continue":
            case "convert":
            case "corr":
            case "corresponding":
            case "count":
            case "covar_pop":
            case "covar_samp":
            case "create":
            case "cross":
            case "cube":
            case "cume_dist":
            case "current":
            case "current_catalog":
            case "current_date":
            case "current_path":
            case "current_role":
            case "current_row":
            case "current_schema":
            case "current_time":
            case "current_timestamp":
            case "current_user":
            case "cursor":
            case "cycle":
            case "datalink":
            case "date":
            case "day":
            case "deallocate":
            case "dec":
            case "decimal":
            case "declare":
            case "default":
            case "deferrable":
            case "deferred":
            case "delete":
            case "dense_rank":
            case "deref":
            case "desc":
            case "describe":
            case "descriptor":
            case "deterministic":
            case "diagnostics":
            case "disconnect":
            case "distinct":
            case "dlnewcopy":
            case "dlpreviouscopy":
            case "dlurlcomplete":
            case "dlurlcompleteonly":
            case "dlurlcompletewrite":
            case "dlurlpath":
            case "dlurlpathonly":
            case "dlurlpathwrite":
            case "dlurlscheme":
            case "dlurlserver":
            case "dlvalue":
            case "domain":
            case "double":
            case "drop":
            case "dynamic":
            case "each":
            case "element":
            case "else":
            case "end":
            case "end-exec":
            case "end_frame":
            case "end_partition":
            case "equals":
            case "escape":
            case "every":
            case "except":
            case "exception":
            case "excec":
            case "excecute":
            case "exists":
            case "exp":
            case "external":
            case "extract":
            case "false":
            case "fetch":
            case "filter":
            case "first":
            case "first_value":
            case "float":
            case "floor":
            case "for":
            case "foreign":
            case "found":
            case "frame_raw":
            case "from":
            case "full":
            case "function":
            case "fusion":
            case "get":
            case "global":
            case "go":
            case "goto":
            case "grant":
            case "group":
            case "grouping":
            case "groups":
            case "having":
            case "hold":
            case "hour":
            case "identity":
            case "immediate":
            case "import":
            case "in":
            case "indicator":
            case "initially":
            case "inner":
            case "inout":
            case "input":
            case "insensitive":
            case "insert":
            case "int":
            case "integer":
            case "intersect":
            case "intersection":
            case "interval":
            case "into":
            case "is":
            case "isolation":
            case "join":
            case "key":
            case "lag":
            case "language":
            case "large":
            case "last":
            case "last_value":
            case "lateral":
            case "lead":
            case "leading":
            case "left":
            case "level":
            case "like":
            case "like_regex":
            case "ln":
            case "local":
            case "localtime":
            case "localtimestamp":
            case "lower":
            case "match":
            case "max":
            case "max_cardinality":
            case "member":
            case "merge":
            case "method":
            case "min":
            case "minute":
            case "mod":
            case "modifies":
            case "module":
            case "month":
            case "multiset":
            case "names":
            case "national":
            case "natural":
            case "nchar":
            case "nclob":
            case "new":
            case "next":
            case "no":
            case "none":
            case "normalize":
            case "not":
            case "nth_value":
            case "ntile":
            case "null":
            case "nullif":
            case "numeric":
            case "occurrences_regex":
            case "octet_length":
            case "of":
            case "offset":
            case "old":
            case "on":
            case "only":
            case "open":
            case "option":
            case "or":
            case "order":
            case "out":
            case "outer":
            case "output":
            case "over":
            case "overlaps":
            case "overlay":
            case "parameter":
            case "partial":
            case "partition":
            case "percent":
            case "percentile_cont":
            case "percentile_disc":
            case "percent_rank":
            case "period":
            case "portion":
            case "position":
            case "position_regex":
            case "power":
            case "precedes":
            case "precision":
            case "prepare":
            case "preserve":
            case "primary":
            case "privileges":
            case "procedure":
            case "public":
            case "range":
            case "rank":
            case "read":
            case "reads":
            case "real":
            case "recursive":
            case "ref":
            case "references":
            case "referencing":
            case "regr_avgx":
            case "regr_avgy":
            case "regr_count":
            case "regr_intercept":
            case "regr_r2":
            case "regr_slope":
            case "regr_sxx":
            case "regr_sxy":
            case "regr_syy":
            case "relative":
            case "release":
            case "restrict":
            case "result":
            case "return":
            case "returns":
            case "revoke":
            case "right":
            case "rollback":
            case "rollup":
            case "row":
            case "rows":
            case "row_number":
            case "save_point":
            case "schema":
            case "scope":
            case "scroll":
            case "search":
            case "second":
            case "section":
            case "select":
            case "sensitive":
            case "session":
            case "session_user":
            case "set":
            case "similar":
            case "size":
            case "smallint":
            case "some":
            case "space":
            case "specific":
            case "specifictype":
            case "sql":
            case "sqlcode":
            case "sqlerror":
            case "sqlexception":
            case "sqlstate":
            case "sqlwarning":
            case "sqrt":
            case "start":
            case "static":
            case "stddev_pop":
            case "stddev_samp":
            case "submultiset":
            case "substring":
            case "substring_regex":
            case "succeeds":
            case "sum":
            case "symetric":
            case "system":
            case "system_time":
            case "system_user":
            case "table":
            case "tablesample":
            case "temporary":
            case "then":
            case "time":
            case "timestamp":
            case "timezone_hour":
            case "timezone_minute":
            case "to":
            case "trailing":
            case "transaction":
            case "translate":
            case "translate_regex":
            case "translation":
            case "treat":
            case "trigger":
            case "trim":
            case "trim_array":
            case "true":
            case "truncate":
            case "uescape":
            case "union":
            case "unique":
            case "unknown":
            case "unnest":
            case "updated":
            case "upper":
            case "usage":
            case "user":
            case "using":
            case "value":
            case "values":
            case "value_of":
            case "varbinary":
            case "varchar":
            case "varying":
            case "var_pop":
            case "var_samp":
            case "versioning":
            case "view":
            case "when":
            case "whenever":
            case "where":
            case "width_bucket":
            case "window":
            case "with":
            case "within":
            case "without":
            case "work":
            case "write":
            case "xml":
            case "xmlagg":
            case "xmlattributes":
            case "xmlbinary":
            case "xmlcast":
            case "xmlcomment":
            case "xmlconcat":
            case "xmldocument":
            case "xmlelement":
            case "xmlexists":
            case "xmlforest":
            case "xmliterate":
            case "xmlnamespaces":
            case "xmlparse":
            case "xmlpi":
            case "xmlquery":
            case "xmlserialize":
            case "xmltable":
            case "xmlvalidate":
            case "year":
            case "zone":
                return true;
        }
        return false;
    }

}
