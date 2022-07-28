package ohos.data.rdb;

import java.util.List;
import java.util.Locale;
import ohos.data.resultset.ResultSet;
import ohos.data.resultset.ResultSetHook;
import ohos.utils.Pair;

/* loaded from: ohos3.0.0.1.jar:ohos/data/rdb/RdbStore.class */
public interface RdbStore {
    public static final int MAX_BATCH_INSERT_SIZE = 1000;

    long insert(String str, ValuesBucket valuesBucket);

    long insertOrThrowException(String str, ValuesBucket valuesBucket);

    List<Long> batchInsertOrThrowException(String str, List<ValuesBucket> list, ConflictResolution conflictResolution);

    long replace(String str, ValuesBucket valuesBucket);

    long replaceOrThrowException(String str, ValuesBucket valuesBucket);

    long insertWithConflictResolution(String str, ValuesBucket valuesBucket, ConflictResolution conflictResolution);

    int delete(AbsRdbPredicates absRdbPredicates);

    int update(ValuesBucket valuesBucket, AbsRdbPredicates absRdbPredicates);

    int updateWithConflictResolution(ValuesBucket valuesBucket, AbsRdbPredicates absRdbPredicates, ConflictResolution conflictResolution);

    ResultSet query(AbsRdbPredicates absRdbPredicates, String[] strArr);

    ResultSet queryWithHook(AbsRdbPredicates absRdbPredicates, String[] strArr, ResultSetHook resultSetHook);

    ResultSet querySql(String str, String[] strArr);

    ResultSet querySqlWithHook(String str, String[] strArr, ResultSetHook resultSetHook);

    ResultSet queryByStep(AbsRdbPredicates absRdbPredicates, String[] strArr);

    ResultSet querySqlByStep(String str, String[] strArr);

    void executeSql(String str);

    void executeSql(String str, Object[] objArr);

    Statement buildStatement(String str);

    long count(String str, String str2, String[] strArr);

    long count(AbsRdbPredicates absRdbPredicates);

    void addAttach(String str, String str2, byte[] bArr);

    List<Pair<String, String>> listAttached();

    void changeEncryptKey(byte[] bArr);

    int getVersion();

    void setVersion(int i);

    void beginTransaction();

    void beginTransactionWithObserver(TransactionObserver transactionObserver);

    void markAsCommit();

    void endTransaction();

    boolean isInTransaction();

    void giveConnectionTemporarily(long j);

    boolean isHoldingConnection();

    boolean isOpen();

    String getPath();

    boolean isReadOnly();

    boolean isMemoryRdb();

    boolean checkIntegrity();

    void close();

    boolean backup(String str);

    boolean restore(String str);

    boolean backup(String str, byte[] bArr);

    boolean restore(String str, byte[] bArr, byte[] bArr2);

    void configLocale(Locale locale);

    String toString();

    /* loaded from: ohos3.0.0.1.jar:ohos/data/rdb/RdbStore$ConflictResolution.class */
    public enum ConflictResolution {
        ON_CONFLICT_NONE,
        ON_CONFLICT_ROLLBACK,
        ON_CONFLICT_ABORT,
        ON_CONFLICT_FAIL,
        ON_CONFLICT_IGNORE,
        ON_CONFLICT_REPLACE;

        public int getValue() {
            throw new RuntimeException("Stub!");
        }
    }
}
