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
/*    */ public abstract class TouchEvent
/*    */   extends ManipulationEvent
/*    */ {
/*    */   public static final int CANCEL = 6;
/*    */   public static final int HOVER_POINTER_ENTER = 7;
/*    */   public static final int HOVER_POINTER_EXIT = 9;
/*    */   public static final int HOVER_POINTER_MOVE = 8;
/*    */   public static final int NONE = 0;
/*    */   public static final int OTHER_POINT_DOWN = 4;
/*    */   public static final int OTHER_POINT_UP = 5;
/*    */   public static final int POINT_MOVE = 3;
/*    */   public static final int PRIMARY_POINT_DOWN = 1;
/*    */   public static final int PRIMARY_POINT_UP = 2;
/*    */   
/*    */   public TouchEvent() {
/* 57 */     throw new RuntimeException("Stub!");
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
/*    */   public MultimodalEvent getMultimodalEvent() {
/* 71 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract int getAction();
/*    */   
/*    */   public abstract int getIndex();
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/multimodalinput/event/TouchEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */