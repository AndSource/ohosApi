/*    */ package ohos.media.common;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BufferInfo
/*    */ {
/*    */   public static final int BUFFER_TYPE_CODEC_CONFIG = 2;
/*    */   public static final int BUFFER_TYPE_END_OF_STREAM = 4;
/*    */   public static final int BUFFER_TYPE_KEY_FRAME = 1;
/*    */   public static final int BUFFER_TYPE_MUXER_DATA = 16;
/*    */   public static final int BUFFER_TYPE_PARTIAL_FRAME = 8;
/*    */   public int bufferType;
/*    */   public int offset;
/*    */   public int size;
/*    */   public long timeStamp;
/*    */   
/*    */   public BufferInfo() {
/* 21 */     throw new RuntimeException("Stub!");
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
/*    */   public void setInfo(int offset, int size, long timeStamp, int bufferType) {
/* 33 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/media/common/BufferInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */