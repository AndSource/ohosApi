package ohos.media.camera.device;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import ohos.agp.graphics.Surface;
import ohos.media.camera.device.CameraConfig;
import ohos.media.camera.device.FrameConfig;

/* loaded from: ohos2.0.1.95.jar:ohos/media/camera/device/Camera.class */
public interface Camera {
    public static final int CAPTURE_TRIGGER_ERROR_ID = -1;

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: ohos2.0.1.95.jar:ohos/media/camera/device/Camera$FrameConfigType.class */
    public @interface FrameConfigType {
        public static final int FRAME_CONFIG_PICTURE = 2;
        public static final int FRAME_CONFIG_PREVIEW = 1;
        public static final int FRAME_CONFIG_RECORD = 3;
    }

    String getCameraId();

    CameraConfig.Builder getCameraConfigBuilder();

    FrameConfig.Builder getFrameConfigBuilder(int i);

    void configure(CameraConfig cameraConfig);

    void release();

    int triggerLoopingCapture(FrameConfig frameConfig);

    int triggerLoopingGroupCapture(List<FrameConfig> list);

    void stopLoopingCapture();

    int triggerSingleCapture(FrameConfig frameConfig);

    int triggerMultiCapture(List<FrameConfig> list);

    void flushCaptures();

    void allocateBuffers(Surface surface, int i);

    void freeBuffers(Surface surface);
}
