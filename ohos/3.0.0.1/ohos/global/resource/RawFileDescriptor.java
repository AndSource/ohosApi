/*    */ package ohos.global.resource;
/*    */ 
/*    */ import java.io.FileDescriptor;
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
/*    */ public abstract class RawFileDescriptor
/*    */   extends BaseFileDescriptor
/*    */ {
/*    */   public RawFileDescriptor() {
/* 35 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract FileDescriptor getFileDescriptor();
/*    */   
/*    */   public abstract long getFileSize();
/*    */   
/*    */   public abstract long getStartPosition();
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/global/resource/RawFileDescriptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */