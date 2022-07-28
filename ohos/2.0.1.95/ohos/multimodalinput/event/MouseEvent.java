/*    */ package ohos.multimodalinput.event;
/*    */ 
/*    */ public abstract class MouseEvent
/*    */   extends CompositeEvent
/*    */ {
/*    */   public static final int AXIS_X = 0;
/*    */   public static final int AXIS_Y = 1;
/*    */   public static final int AXIS_Z = 2;
/*    */   public static final int BACK_BUTTON = 8;
/*    */   public static final int FORWARD_BUTTON = 16;
/*    */   public static final int HOVER_ENTER = 4;
/*    */   public static final int HOVER_EXIT = 6;
/*    */   public static final int HOVER_MOVE = 5;
/*    */   public static final int LEFT_BUTTON = 1;
/*    */   public static final int MIDDLE_BUTTON = 4;
/*    */   public static final int MOVE = 3;
/*    */   public static final int NONE = 0;
/*    */   public static final int NONE_BUTTON = 0;
/*    */   public static final int PRESS = 1;
/*    */   public static final int RELEASE = 2;
/*    */   public static final int RIGHT_BUTTON = 2;
/*    */   
/*    */   public MouseEvent() {
/* 24 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract int getAction();
/*    */   
/*    */   public abstract int getActionButton();
/*    */   
/*    */   public abstract int getPressedButtons();
/*    */   
/*    */   public abstract MmiPoint getCursor();
/*    */   
/*    */   public abstract void setCursorOffset(float paramFloat1, float paramFloat2);
/*    */   
/*    */   public abstract float getCursorDelta(int paramInt);
/*    */   
/*    */   public abstract float getScrollingDelta(int paramInt);
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/multimodalinput/event/MouseEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */