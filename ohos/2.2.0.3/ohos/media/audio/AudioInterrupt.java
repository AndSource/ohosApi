/*    */ package ohos.media.audio;
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
/*    */ public class AudioInterrupt
/*    */ {
/*    */   public static final int INTERRUPT_HINT_DUCK = 4;
/*    */   public static final int INTERRUPT_HINT_NONE = 0;
/*    */   public static final int INTERRUPT_HINT_PAUSE = 2;
/*    */   public static final int INTERRUPT_HINT_RESUME = 1;
/*    */   public static final int INTERRUPT_HINT_STOP = 3;
/*    */   public static final int INTERRUPT_HINT_UNDUCK = 5;
/*    */   public static final int INTERRUPT_TYPE_BEGIN = 1;
/*    */   public static final int INTERRUPT_TYPE_END = 2;
/*    */   
/*    */   public AudioInterrupt() {
/* 30 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setInterruptListener(InterruptListener listener) {
/* 39 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setStreamInfo(AudioStreamInfo info) {
/* 49 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public InterruptListener getInterruptListener() {
/* 58 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public AudioStreamInfo getStreamInfo() {
/* 68 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isPauseWhenDucked() {
/* 77 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setPauseWhenDucked(boolean pauseWhenDucked) {
/* 87 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public static interface InterruptListener {
/*    */     void onInterrupt(int param1Int1, int param1Int2);
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/media/audio/AudioInterrupt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */