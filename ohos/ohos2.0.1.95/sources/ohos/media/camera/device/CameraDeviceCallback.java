package ohos.media.camera.device;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: ohos2.0.1.95.jar:ohos/media/camera/device/CameraDeviceCallback.class */
public abstract class CameraDeviceCallback {

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: ohos2.0.1.95.jar:ohos/media/camera/device/CameraDeviceCallback$CameraStatus.class */
    public @interface CameraStatus {
        public static final int CAMERA_DEVICE_AVAILABLE = 1;
        public static final int CAMERA_DEVICE_UNAVAILABLE = 0;
    }

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: ohos2.0.1.95.jar:ohos/media/camera/device/CameraDeviceCallback$FlashlightStatus.class */
    public @interface FlashlightStatus {
        public static final int FLASHLIGHT_OFF = 1;
        public static final int FLASHLIGHT_OPEN = 2;
        public static final int FLASHLIGHT_UNAVAILABLE = 0;
    }

    public CameraDeviceCallback() {
        throw new RuntimeException("Stub!");
    }

    public void onCameraStatus(String cameraId, int status) {
        throw new RuntimeException("Stub!");
    }

    public void onPhysicalCameraStatus(String cameraId, int status) {
        throw new RuntimeException("Stub!");
    }

    public void onFlashlightStatus(String cameraId, int status) {
        throw new RuntimeException("Stub!");
    }
}
