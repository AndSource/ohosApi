/*     */ package ohos.agp.animation;
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
/*     */ public abstract class Animator
/*     */ {
/*     */   public static final int INFINITE = -1;
/*     */   protected LoopedListener mLoopedListener;
/*     */   protected StateChangedListener mPauseListener;
/*     */   protected StateChangedListener mStartListener;
/*     */   
/*     */   public Animator() {
/*  34 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void start() {
/*  40 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void stop() {
/*  46 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void cancel() {
/*  52 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void end() {
/*  58 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void pause() {
/*  66 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void resume() {
/*  74 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isPaused() {
/*  82 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isRunning() {
/*  90 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getDuration() {
/*  98 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getDelay() {
/* 106 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getLoopedCount() {
/* 115 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getCurveType() {
/* 123 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void setDurationInternal(long duration) {
/* 132 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void setDelayInternal(long startDelay) {
/* 141 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void setLoopedCountInternal(int loopedCount) {
/* 150 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void setCurveTypeInternal(int curveType) {
/* 159 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void setCurveInternal(TimelineCurve curve) {
/* 168 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void setPauseListenerInternal(StateChangedListener listener) {
/* 176 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void setLoopedListenerInternal(LoopedListener listener) {
/* 184 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void setStartListenerInternal(StateChangedListener listener) {
/* 192 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void release() {
/* 198 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static interface TimelineCurve {
/*     */     float getCurvedTime(float param1Float); }
/*     */   
/*     */   public static interface StateChangedListener {
/*     */     void onStart(Animator param1Animator);
/*     */     
/*     */     void onStop(Animator param1Animator);
/*     */     
/*     */     void onCancel(Animator param1Animator);
/*     */     
/*     */     void onEnd(Animator param1Animator);
/*     */     
/*     */     void onPause(Animator param1Animator);
/*     */     
/*     */     void onResume(Animator param1Animator); }
/*     */   
/*     */   public static interface LoopedListener {
/*     */     void onRepeat(Animator param1Animator);
/*     */   }
/*     */   
/*     */   public static class CurveType {
/*     */     public static final int ACCELERATE = 0;
/*     */     public static final int ACCELERATE_DECELERATE = 1;
/*     */     public static final int ANTICIPATE = 2;
/*     */     public static final int ANTICIPATE_OVERSHOOT = 3;
/*     */     public static final int BOUNCE = 4;
/*     */     public static final int CUBIC_BEZIER_ACCELERATION = 16;
/*     */     public static final int CUBIC_BEZIER_DECELERATION = 15;
/*     */     public static final int CUBIC_BEZIER_EXTREME_DECELERATION = 18;
/*     */     public static final int CUBIC_BEZIER_FRICTION = 17;
/*     */     public static final int CUBIC_BEZIER_RHYTHM = 20;
/*     */     public static final int CUBIC_BEZIER_SHARP = 19;
/*     */     public static final int CUBIC_BEZIER_SMOOTH = 21;
/*     */     
/*     */     public CurveType() {
/* 236 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */     
/*     */     public static final int CUBIC_BEZIER_STANDARD = 14;
/*     */     
/*     */     public static final int CUBIC_HERMITE = 5;
/*     */     public static final int CUSTOMIZED = -2;
/*     */     
/*     */     public static boolean checkTypeValue(int type) {
/* 246 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/*     */     public static final int CYCLE = 6;
/*     */     public static final int DECELERATE = 7;
/*     */     public static final int INVALID = -1;
/*     */     public static final int LINEAR = 8;
/*     */     public static final int OVERSHOOT = 9;
/*     */     public static final int PHYSICAL_FLING = 13;
/*     */     public static final int PHYSICAL_SPRING = 12;
/*     */     public static final int SMOOTH_STEP = 10;
/*     */     public static final int SPRING = 11;
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/agp/animation/Animator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */