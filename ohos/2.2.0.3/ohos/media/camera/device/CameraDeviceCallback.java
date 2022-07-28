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
/*    */ public abstract class CameraDeviceCallback
/*    */ {
/*    */   public CameraDeviceCallback() {
/* 26 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void onCameraStatus(String cameraId, int status) {
/* 36 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void onPhysicalCameraStatus(String cameraId, int status) {
/* 46 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void onFlashlightStatus(String cameraId, int status) {
/* 55 */     throw new RuntimeException("Stub!");
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


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/media/camera/device/CameraDeviceCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */