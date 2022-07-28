/*    */ package ohos.global.resource;
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
/*    */ public abstract class Entry
/*    */ {
/*    */   public Entry() {
/* 22 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public abstract String getPath();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public abstract Type getType();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public enum Type
/*    */   {
/* 50 */     FOLDER,
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 55 */     FILE,
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 60 */     UNKNOWN;
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/global/resource/Entry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */