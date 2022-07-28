package ohos.media.camera;

import ohos.app.Context;
import ohos.eventhandler.EventHandler;
import ohos.media.camera.device.CameraAbility;
import ohos.media.camera.device.CameraDeviceCallback;
import ohos.media.camera.device.CameraInfo;
import ohos.media.camera.device.CameraStateCallback;

/* loaded from: ohos2.1.1.21.jar:ohos/media/camera/CameraKit.class */
public final class CameraKit {
    CameraKit(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static synchronized CameraKit getInstance(Context context) {
        throw new RuntimeException("Stub!");
    }

    public String[] getCameraIds() {
        throw new RuntimeException("Stub!");
    }

    public CameraInfo getCameraInfo(String cameraId) {
        throw new RuntimeException("Stub!");
    }

    public CameraAbility getCameraAbility(String cameraId) {
        throw new RuntimeException("Stub!");
    }

    public void createCamera(String cameraId, CameraStateCallback callback, EventHandler handler) {
        throw new RuntimeException("Stub!");
    }

    public void setFlashlight(String cameraId, boolean isEnable) {
        throw new RuntimeException("Stub!");
    }

    public void registerCameraDeviceCallback(CameraDeviceCallback callback, EventHandler handler) {
        throw new RuntimeException("Stub!");
    }

    public void unregisterCameraDeviceCallback(CameraDeviceCallback callback) {
        throw new RuntimeException("Stub!");
    }
}
