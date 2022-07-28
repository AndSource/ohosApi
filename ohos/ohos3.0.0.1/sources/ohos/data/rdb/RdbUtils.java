package ohos.data.rdb;

/* loaded from: ohos3.0.0.1.jar:ohos/data/rdb/RdbUtils.class */
public class RdbUtils {
    RdbUtils() {
        throw new RuntimeException("Stub!");
    }

    public static void appendStringToSqlAndEscapeQuote(StringBuilder sqlbuilder, String escapeVar) {
        throw new RuntimeException("Stub!");
    }

    public static String escapeQuote(String sqlString) {
        throw new RuntimeException("Stub!");
    }

    public static void verifySql(RdbStore rdbStore, String sql) {
        throw new RuntimeException("Stub!");
    }

    public static void verifyPredicates(RdbStore rdbStore, OperationType type, AbsRdbPredicates absRdbPredicates) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/data/rdb/RdbUtils$OperationType.class */
    public enum OperationType {
        QUERY_TYPE,
        DELETE_TYPE,
        COUNT_TYPE;

        public String getValue() {
            throw new RuntimeException("Stub!");
        }
    }
}
