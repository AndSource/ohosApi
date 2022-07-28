package ohos.media.camera.device;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: ohos2.2.0.3.jar:ohos/media/camera/device/CameraStateCallback.class */
public abstract class CameraStateCallback {

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: ohos2.2.0.3.jar:ohos/media/camera/device/CameraStateCallback$ErrorCode.class */
    public @interface ErrorCode {
        public static final int ERROR_CAMERA_ALREADY_IN_USE = -2;
        public static final int ERROR_CAMERA_DEVICE_DISABLED = -4;
        public static final int ERROR_CAMERA_DEVICE_FATAL = -5;
        public static final int ERROR_CAMERA_RESOURCE_LIMITED = -3;
        public static final int ERROR_CAMERA_SERVICE_FATAL = -6;
        public static final int ERROR_CAMERA_UNKNOWN = -1;
    }

    public CameraStateCallback() {
        throw new RuntimeException("Stub!");
    }

    public void onCreated(Camera camera) {
        throw new RuntimeException("Stub!");
    }

    public void onCreateFailed(String cameraId, int errorCode) {
        throw new RuntimeException("Stub!");
    }

    public void onConfigured(Camera camera) {
        throw new RuntimeException("Stub!");
    }

    public void onPartialConfigured(Camera camera) {
        throw new RuntimeException("Stub!");
    }

    public void onConfigureFailed(Camera camera, int errorCode) {
        throw new RuntimeException("Stub!");
    }

    public void onReleased(Camera camera) {
        throw new RuntimeException("Stub!");
    }

    public void onFatalError(Camera camera, int errorCode) {
        throw new RuntimeException("Stub!");
    }

    public void onCaptureRun(Camera camera) {
        throw new RuntimeException("Stub!");
    }

    public void onCaptureIdle(Camera camera) {
        throw new RuntimeException("Stub!");
    }
}
