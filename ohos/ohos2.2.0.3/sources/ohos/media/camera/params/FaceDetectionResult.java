package ohos.media.camera.params;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

/* loaded from: ohos2.2.0.3.jar:ohos/media/camera/params/FaceDetectionResult.class */
public interface FaceDetectionResult {

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: ohos2.2.0.3.jar:ohos/media/camera/params/FaceDetectionResult$State.class */
    public @interface State {
        public static final int ERROR_UNKNOWN = -1;
        public static final int FACE_DETECTED = 1;
        public static final int FACE_SMILE_DETECTED = 2;
    }

    int getState();

    Face[] getFaces();

    Map<Integer, Integer> getSmiles();
}
