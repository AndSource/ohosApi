/*     */ package ohos.media.camera.device;
/*     */ 
/*     */ import java.lang.annotation.Retention;
/*     */ import java.lang.annotation.RetentionPolicy;
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
/*     */ public abstract class CameraStateCallback
/*     */ {
/*     */   public CameraStateCallback() {
/*  27 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onCreated(Camera camera) {
/*  37 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onCreateFailed(String cameraId, int errorCode) {
/*  47 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onConfigured(Camera camera) {
/*  56 */     throw new RuntimeException("Stub!");
/*     */   }
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
/*     */   public void onPartialConfigured(Camera camera) {
/*  69 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onConfigureFailed(Camera camera, int errorCode) {
/*  81 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onReleased(Camera camera) {
/*  90 */     throw new RuntimeException("Stub!");
/*     */   }
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
/*     */   public void onFatalError(Camera camera, int errorCode) {
/* 103 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onCaptureRun(Camera camera) {
/* 112 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onCaptureIdle(Camera camera) {
/* 121 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   @Retention(RetentionPolicy.CLASS)
/*     */   public static @interface ErrorCode {
/*     */     public static final int ERROR_CAMERA_ALREADY_IN_USE = -2;
/*     */     public static final int ERROR_CAMERA_DEVICE_DISABLED = -4;
/*     */     public static final int ERROR_CAMERA_DEVICE_FATAL = -5;
/*     */     public static final int ERROR_CAMERA_RESOURCE_LIMITED = -3;
/*     */     public static final int ERROR_CAMERA_SERVICE_FATAL = -6;
/*     */     public static final int ERROR_CAMERA_UNKNOWN = -1;
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/media/camera/device/CameraStateCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */