/*    */ package ohos.utils;
/*    */ 
/*    */ import java.nio.file.Path;
/*    */ import java.nio.file.WatchEvent;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class FileWatcher
/*    */ {
/*    */   public FileWatcher() {
/* 51 */     throw new RuntimeException("Stub!");
/*    */   }
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
/*    */   public void addWatch(Path directory, EventHandler eventHandler, boolean isRecursive, WatchEvent.Kind<?>... events) {
/* 67 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public static interface EventHandler {
/*    */     void onEvent(WatchEvent<?> param1WatchEvent);
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/utils/FileWatcher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */