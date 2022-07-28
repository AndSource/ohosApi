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
/*    */ public interface IDownloadListener
/*    */ {
/*    */   default void onRemoved() {
/* 27 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   default void onCompleted() {
/* 33 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   default void onFailed(int errorCode) {
/* 41 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   default void onPaused() {
/* 47 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   default void onProgress(long receivedSize, long totalSize) {
/* 57 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/miscservices/download/IDownloadListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */