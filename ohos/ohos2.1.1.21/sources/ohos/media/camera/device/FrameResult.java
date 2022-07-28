package ohos.media.camera.device;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import ohos.media.camera.params.AeResult;
import ohos.media.camera.params.AfResult;
import ohos.media.camera.params.FaceDetectionResult;
import ohos.media.camera.params.ParametersResult;

/* loaded from: ohos2.1.1.21.jar:ohos/media/camera/device/FrameResult.class */
public interface FrameResult {

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: ohos2.1.1.21.jar:ohos/media/camera/device/FrameResult$State.class */
    public @interface State {
        public static final int ERROR_BUFFER_DROPPED = -4;
        public static final int ERROR_FLUSHED = -2;
        public static final int ERROR_FRAME_CONFIG = -3;
        public static final int ERROR_FRAME_RESULT = -5;
        public static final int ERROR_UNKNOWN = -1;
        public static final int FRAME_FULL_RESULT = 1;
        public static final int FRAME_PARTIAL_RESULT = 2;
    }

    long getFrameNumber();

    int getState();

    boolean isFullResult();

    long getTimestamp();

    int getCaptureTriggerId();

    FrameConfig getFrameConfig();

    AfResult getAfResult();

    AeResult getAeResult();

    FaceDetectionResult getFaceDetectionResult();

    ParametersResult getParametersResult();
}
