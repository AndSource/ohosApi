/*    */ package ohos.global.resource;
/*    */ 
/*    */ import java.io.IOException;
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
/*    */ public abstract class RawFileEntry
/*    */ {
/*    */   public RawFileEntry() {
/* 27 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract Resource openRawFile() throws IOException;
/*    */   
/*    */   public abstract RawFileDescriptor openRawFileDescriptor() throws IOException;
/*    */   
/*    */   public abstract Entry[] getEntries() throws IOException;
/*    */   
/*    */   public abstract Entry.Type getType();
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/global/resource/RawFileEntry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */