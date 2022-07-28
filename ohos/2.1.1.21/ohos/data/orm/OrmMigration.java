/*    */ package ohos.data.orm;
/*    */ 
/*    */ import ohos.data.rdb.RdbStore;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class OrmMigration
/*    */ {
/*    */   public OrmMigration(int beginVersion, int endVersion) {
/* 45 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getBeginVersion() {
/* 53 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getEndVersion() {
/* 61 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract void onMigrate(RdbStore paramRdbStore);
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/data/orm/OrmMigration.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */