/*     */ package ohos.agp.render.render3d.resources;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public interface AnimationPlayback
/*     */ {
/*     */   public static final int REPEAT_COUNT_INFINITE = 2147483647;
/*     */   
/*     */   void release();
/*     */   
/*     */   void setPlaybackState(State paramState);
/*     */   
/*     */   State getPlaybackState();
/*     */   
/*     */   void setRepeatCount(int paramInt);
/*     */   
/*     */   int getRepeatCount();
/*     */   
/*     */   void setWeight(float paramFloat);
/*     */   
/*     */   float getWeight();
/*     */   
/*     */   boolean isCompleted();
/*     */   
/*     */   void setSpeed(float paramFloat);
/*     */   
/*     */   float getSpeed();
/*     */   
/*     */   public enum State
/*     */   {
/* 125 */     STOP,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 130 */     PLAY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 135 */     PAUSE;
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/agp/render/render3d/resources/AnimationPlayback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */