/*    */ package ohos.media.camera.params;
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
/*    */ public final class Metadata
/*    */ {
/*    */   Metadata() {
/* 26 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   @Retention(RetentionPolicy.CLASS)
/*    */   public static @interface FlashMode {
/*    */     public static final int FLASH_ALWAYS_OPEN = 3;
/*    */     public static final int FLASH_AUTO = 0;
/*    */     public static final int FLASH_CLOSE = 1;
/*    */     public static final int FLASH_OPEN = 2;
/*    */   }
/*    */   
/*    */   @Retention(RetentionPolicy.CLASS)
/*    */   public static @interface FaceDetectionType {
/*    */     public static final int FACE_DETECTION = 1;
/*    */     public static final int FACE_DETECTION_OFF = 0;
/*    */     public static final int FACE_SMILE_DETECTION = 2;
/*    */   }
/*    */   
/*    */   @Retention(RetentionPolicy.CLASS)
/*    */   public static @interface AwbMode {
/*    */     public static final int AWB_AUTOMATIC = 1;
/*    */     public static final int AWB_INACTIVE = 0;
/*    */   }
/*    */   
/*    */   @Retention(RetentionPolicy.CLASS)
/*    */   public static @interface AfTrigger {
/*    */     public static final int AF_TRIGGER_CANCEL = 2;
/*    */     public static final int AF_TRIGGER_NONE = 0;
/*    */     public static final int AF_TRIGGER_START = 1;
/*    */   }
/*    */   
/*    */   @Retention(RetentionPolicy.CLASS)
/*    */   public static @interface AfMode {
/*    */     public static final int AF_MODE_CONTINUOUS = 1;
/*    */     public static final int AF_MODE_OFF = 0;
/*    */     public static final int AF_MODE_TOUCH_LOCK = 2;
/*    */   }
/*    */   
/*    */   @Retention(RetentionPolicy.CLASS)
/*    */   public static @interface AeTrigger {
/*    */     public static final int AE_TRIGGER_CANCEL = 2;
/*    */     public static final int AE_TRIGGER_NONE = 0;
/*    */     public static final int AE_TRIGGER_START = 1;
/*    */   }
/*    */   
/*    */   @Retention(RetentionPolicy.CLASS)
/*    */   public static @interface AeMode {
/*    */     public static final int AE_MODE_OFF = 0;
/*    */     public static final int AE_MODE_ON = 1;
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/media/camera/params/Metadata.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */