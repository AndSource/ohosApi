/*    */ package ohos.multimodalinput.event;
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
/*    */ public abstract class ManipulationEvent
/*    */   extends MultimodalEvent
/*    */ {
/*    */   public static final int PHASE_CANCEL = 4;
/*    */   public static final int PHASE_COMPLETED = 3;
/*    */   public static final int PHASE_MOVE = 2;
/*    */   public static final int PHASE_NONE = 0;
/*    */   public static final int PHASE_START = 1;
/*    */   
/*    */   public ManipulationEvent() {
/* 31 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract long getStartTime();
/*    */   
/*    */   public abstract int getPhase();
/*    */   
/*    */   public abstract MmiPoint getPointerPosition(int paramInt);
/*    */   
/*    */   public abstract void setScreenOffset(float paramFloat1, float paramFloat2);
/*    */   
/*    */   public abstract MmiPoint getPointerScreenPosition(int paramInt);
/*    */   
/*    */   public abstract int getPointerCount();
/*    */   
/*    */   public abstract int getPointerId(int paramInt);
/*    */   
/*    */   public abstract float getForce(int paramInt);
/*    */   
/*    */   public abstract float getRadius(int paramInt);
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/multimodalinput/event/ManipulationEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */