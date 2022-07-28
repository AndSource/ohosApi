/*     */ package ohos.data.rdb;
/*     */ 
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import ohos.data.resultset.ResultSet;
/*     */ import ohos.data.resultset.ResultSetHook;
/*     */ import ohos.utils.Pair;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public interface RdbStore
/*     */ {
/*     */   public static final int MAX_BATCH_INSERT_SIZE = 1000;
/*     */   
/*     */   long insert(String paramString, ValuesBucket paramValuesBucket);
/*     */   
/*     */   long insertOrThrowException(String paramString, ValuesBucket paramValuesBucket);
/*     */   
/*     */   List<Long> batchInsertOrThrowException(String paramString, List<ValuesBucket> paramList, ConflictResolution paramConflictResolution);
/*     */   
/*     */   long replace(String paramString, ValuesBucket paramValuesBucket);
/*     */   
/*     */   long replaceOrThrowException(String paramString, ValuesBucket paramValuesBucket);
/*     */   
/*     */   long insertWithConflictResolution(String paramString, ValuesBucket paramValuesBucket, ConflictResolution paramConflictResolution);
/*     */   
/*     */   int delete(AbsRdbPredicates paramAbsRdbPredicates);
/*     */   
/*     */   int update(ValuesBucket paramValuesBucket, AbsRdbPredicates paramAbsRdbPredicates);
/*     */   
/*     */   int updateWithConflictResolution(ValuesBucket paramValuesBucket, AbsRdbPredicates paramAbsRdbPredicates, ConflictResolution paramConflictResolution);
/*     */   
/*     */   ResultSet query(AbsRdbPredicates paramAbsRdbPredicates, String[] paramArrayOfString);
/*     */   
/*     */   ResultSet queryWithHook(AbsRdbPredicates paramAbsRdbPredicates, String[] paramArrayOfString, ResultSetHook paramResultSetHook);
/*     */   
/*     */   ResultSet querySql(String paramString, String[] paramArrayOfString);
/*     */   
/*     */   ResultSet querySqlWithHook(String paramString, String[] paramArrayOfString, ResultSetHook paramResultSetHook);
/*     */   
/*     */   ResultSet queryByStep(AbsRdbPredicates paramAbsRdbPredicates, String[] paramArrayOfString);
/*     */   
/*     */   ResultSet querySqlByStep(String paramString, String[] paramArrayOfString);
/*     */   
/*     */   void executeSql(String paramString);
/*     */   
/*     */   void executeSql(String paramString, Object[] paramArrayOfObject);
/*     */   
/*     */   Statement buildStatement(String paramString);
/*     */   
/*     */   long count(String paramString1, String paramString2, String[] paramArrayOfString);
/*     */   
/*     */   long count(AbsRdbPredicates paramAbsRdbPredicates);
/*     */   
/*     */   void addAttach(String paramString1, String paramString2, byte[] paramArrayOfbyte);
/*     */   
/*     */   List<Pair<String, String>> listAttached();
/*     */   
/*     */   void changeEncryptKey(byte[] paramArrayOfbyte);
/*     */   
/*     */   int getVersion();
/*     */   
/*     */   void setVersion(int paramInt);
/*     */   
/*     */   void beginTransaction();
/*     */   
/*     */   void beginTransactionWithObserver(TransactionObserver paramTransactionObserver);
/*     */   
/*     */   void markAsCommit();
/*     */   
/*     */   void endTransaction();
/*     */   
/*     */   boolean isInTransaction();
/*     */   
/*     */   void giveConnectionTemporarily(long paramLong);
/*     */   
/*     */   boolean isHoldingConnection();
/*     */   
/*     */   boolean isOpen();
/*     */   
/*     */   String getPath();
/*     */   
/*     */   boolean isReadOnly();
/*     */   
/*     */   boolean isMemoryRdb();
/*     */   
/*     */   boolean checkIntegrity();
/*     */   
/*     */   void close();
/*     */   
/*     */   boolean backup(String paramString);
/*     */   
/*     */   boolean restore(String paramString);
/*     */   
/*     */   boolean backup(String paramString, byte[] paramArrayOfbyte);
/*     */   
/*     */   boolean restore(String paramString, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2);
/*     */   
/*     */   void configLocale(Locale paramLocale);
/*     */   
/*     */   String toString();
/*     */   
/*     */   public enum ConflictResolution
/*     */   {
/* 631 */     ON_CONFLICT_NONE,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 637 */     ON_CONFLICT_ROLLBACK,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 645 */     ON_CONFLICT_ABORT,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 654 */     ON_CONFLICT_FAIL,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 661 */     ON_CONFLICT_IGNORE,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 667 */     ON_CONFLICT_REPLACE;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getValue() {
/* 675 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/data/rdb/RdbStore.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */