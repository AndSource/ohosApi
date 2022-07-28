/*    */ package ohos.miscservices.download;
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
/*    */ public interface IDownloadListener
/*    */ {
/*    */   default void onRemoved() {
/* 40 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   default void onCompleted() {
/* 46 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   default void onFailed(int errorCode) {
/* 54 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   default void onPaused() {
/* 60 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   default void onProgress(long receivedSize, long totalSize) {
/* 70 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/miscservices/download/IDownloadListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */