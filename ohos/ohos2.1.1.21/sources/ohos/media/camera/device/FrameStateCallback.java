package ohos.media.camera.device;

/* loaded from: ohos2.1.1.21.jar:ohos/media/camera/device/FrameStateCallback.class */
public abstract class FrameStateCallback {
    public FrameStateCallback() {
        throw new RuntimeException("Stub!");
    }

    public void onFrameStarted(Camera camera, FrameConfig frameConfig, long frameNumber, long timestamp) {
        throw new RuntimeException("Stub!");
    }

    public void onFrameProgressed(Camera camera, FrameConfig frameConfig, FrameResult frameResult) {
        throw new RuntimeException("Stub!");
    }

    public void onFrameFinished(Camera camera, FrameConfig frameConfig, FrameResult frameResult) {
        throw new RuntimeException("Stub!");
    }

    public void onFrameError(Camera camera, FrameConfig frameConfig, int errorCode, FrameResult frameResult) {
        throw new RuntimeException("Stub!");
    }

    public void onCaptureTriggerStarted(Camera camera, int captureTriggerId, long firstFrameNumber) {
        throw new RuntimeException("Stub!");
    }

    public void onCaptureTriggerFinished(Camera camera, int captureTriggerId, long lastFrameNumber) {
        throw new RuntimeException("Stub!");
    }

    public void onCaptureTriggerInterrupted(Camera camera, int captureTriggerId) {
        throw new RuntimeException("Stub!");
    }
}
