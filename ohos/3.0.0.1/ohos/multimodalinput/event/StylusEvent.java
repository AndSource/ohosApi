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
/*    */ 
/*    */ public abstract class StylusEvent
/*    */   extends ManipulationEvent
/*    */ {
/*    */   public static final int BUTTON_PRESS = 1;
/*    */   public static final int BUTTON_RELEASE = 2;
/*    */   public static final int FIRST_BUTTON = 1;
/*    */   public static final int NONE = 0;
/*    */   public static final int NONE_BUTTON = 0;
/*    */   public static final int STYLUS_DOWN = 3;
/*    */   public static final int STYLUS_MOVE = 4;
/*    */   public static final int STYLUS_UP = 5;
/*    */   
/*    */   public StylusEvent() {
/* 35 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract int getAction();
/*    */   
/*    */   public abstract int getButtons();
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/multimodalinput/event/StylusEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */