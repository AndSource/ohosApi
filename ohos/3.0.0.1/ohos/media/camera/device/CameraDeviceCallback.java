/*    */ package ohos.media.camera.device;
/*    */ 
/*    */ import java.lang.annotation.Retention;
/*    */ import java.lang.annotation.RetentionPolicy;
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
/*    */ public abstract class CameraDeviceCallback
/*    */ {
/*    */   public CameraDeviceCallback() {
/* 34 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void onCameraStatus(String cameraId, int status) {
/* 44 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void onPhysicalCameraStatus(String cameraId, int status) {
/* 54 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void onFlashlightStatus(String cameraId, int status) {
/* 64 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   @Retention(RetentionPolicy.CLASS)
/*    */   public static @interface FlashlightStatus {
/*    */     public static final int FLASHLIGHT_OFF = 1;
/*    */     public static final int FLASHLIGHT_OPEN = 2;
/*    */     public static final int FLASHLIGHT_UNAVAILABLE = 0;
/*    */   }
/*    */   
/*    */   @Retention(RetentionPolicy.CLASS)
/*    */   public static @interface CameraStatus {
/*    */     public static final int CAMERA_DEVICE_AVAILABLE = 1;
/*    */     public static final int CAMERA_DEVICE_UNAVAILABLE = 0;
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/media/camera/device/CameraDeviceCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */