package ohos.media.camera.params;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: ohos2.2.0.3.jar:ohos/media/camera/params/Metadata.class */
public final class Metadata {

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: ohos2.2.0.3.jar:ohos/media/camera/params/Metadata$AeMode.class */
    public @interface AeMode {
        public static final int AE_MODE_OFF = 0;
        public static final int AE_MODE_ON = 1;
    }

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: ohos2.2.0.3.jar:ohos/media/camera/params/Metadata$AeTrigger.class */
    public @interface AeTrigger {
        public static final int AE_TRIGGER_CANCEL = 2;
        public static final int AE_TRIGGER_NONE = 0;
        public static final int AE_TRIGGER_START = 1;
    }

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: ohos2.2.0.3.jar:ohos/media/camera/params/Metadata$AfMode.class */
    public @interface AfMode {
        public static final int AF_MODE_CONTINUOUS = 1;
        public static final int AF_MODE_OFF = 0;
        public static final int AF_MODE_TOUCH_LOCK = 2;
    }

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: ohos2.2.0.3.jar:ohos/media/camera/params/Metadata$AfTrigger.class */
    public @interface AfTrigger {
        public static final int AF_TRIGGER_CANCEL = 2;
        public static final int AF_TRIGGER_NONE = 0;
        public static final int AF_TRIGGER_START = 1;
    }

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: ohos2.2.0.3.jar:ohos/media/camera/params/Metadata$AwbMode.class */
    public @interface AwbMode {
        public static final int AWB_AUTOMATIC = 1;
        public static final int AWB_INACTIVE = 0;
    }

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: ohos2.2.0.3.jar:ohos/media/camera/params/Metadata$FaceDetectionType.class */
    public @interface FaceDetectionType {
        public static final int FACE_DETECTION = 1;
        public static final int FACE_DETECTION_OFF = 0;
        public static final int FACE_SMILE_DETECTION = 2;
    }

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: ohos2.2.0.3.jar:ohos/media/camera/params/Metadata$FlashMode.class */
    public @interface FlashMode {
        public static final int FLASH_ALWAYS_OPEN = 3;
        public static final int FLASH_AUTO = 0;
        public static final int FLASH_CLOSE = 1;
        public static final int FLASH_OPEN = 2;
    }

    Metadata() {
        throw new RuntimeException("Stub!");
    }
}
