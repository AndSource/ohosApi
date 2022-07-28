/*    */ package ohos.data;
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
/*    */ public enum DatabaseFileType
/*    */ {
/* 32 */   NORMAL,
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 37 */   BACKUP,
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 42 */   CORRUPT;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getValue() {
/* 50 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/data/DatabaseFileType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */