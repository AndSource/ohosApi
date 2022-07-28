package ohos.media.camera.params;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

/* loaded from: ohos2.0.1.95.jar:ohos/media/camera/params/SceneDetectionResult.class */
public interface SceneDetectionResult {

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: ohos2.0.1.95.jar:ohos/media/camera/params/SceneDetectionResult$State.class */
    public @interface State {
        public static final int ERROR_UNKNOWN = -1;
        public static final int SCENE_DETECTED = 1;
    }

    int getState();

    Map<Integer, Float> getScenes();
}