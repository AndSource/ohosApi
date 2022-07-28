/*    */ package ohos.aafwk.ability;
/*    */ 
/*    */ import ohos.utils.Parcel;
/*    */ import ohos.utils.Sequenceable;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DeviceConfigInfo
/*    */   implements Sequenceable
/*    */ {
/*    */   public static final int GLES_VERSION_DEFAULT = 0;
/*    */   public static final int INPUT_FLAG_FIVE_WAY_NAV = 2;
/*    */   public static final int INPUT_FLAG_HARD_KEYBOARD = 1;
/*    */   public static final int KEY_BOARD_12KEY = 3;
/*    */   public static final int KEY_BOARD_COMMON = 2;
/*    */   public static final int KEY_BOARD_DEFAULT = 0;
/*    */   public static final int KEY_BOARD_NOKEYS = 1;
/*    */   public static final int NAVIGATION_DEFAULT = 0;
/*    */   public static final int NAVIGATION_DPAD = 2;
/*    */   public static final int NAVIGATION_NONAV = 1;
/*    */   public static final int NAVIGATION_TRACKBALL = 3;
/*    */   public static final int NAVIGATION_WHEEL = 4;
/*    */   public static final int TOUCH_SCREEN_DEFAULT = 0;
/*    */   public static final int TOUCH_SCREEN_FINGER = 3;
/*    */   public static final int TOUCH_SCREEN_NOTOUCH = 1;
/*    */   
/*    */   DeviceConfigInfo() {
/* 28 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getTouchScreenType() {
/* 39 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getKeyBoardType() {
/* 50 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getNavigationType() {
/* 61 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getExternalInputDevices() {
/* 72 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getDeviceGLESVersion() {
/* 82 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean marshalling(Parcel out) {
/* 88 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean unmarshalling(Parcel in) {
/* 94 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/aafwk/ability/DeviceConfigInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */