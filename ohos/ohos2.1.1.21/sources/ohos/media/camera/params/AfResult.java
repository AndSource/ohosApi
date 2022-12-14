package ohos.media.camera.params;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: ohos2.1.1.21.jar:ohos/media/camera/params/AfResult.class */
public interface AfResult {

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: ohos2.1.1.21.jar:ohos/media/camera/params/AfResult$State.class */
    public @interface State {
        public static final int AF_STATE_AUTO_FOCUSED = 2;
        public static final int AF_STATE_AUTO_SCAN = 1;
        public static final int AF_STATE_AUTO_UNFOCUSED = 3;
        public static final int AF_STATE_INACTIVE = 0;
        public static final int AF_STATE_TRIGGER_FOCUSED = 5;
        public static final int AF_STATE_TRIGGER_SCAN = 4;
        public static final int AF_STATE_TRIGGER_UNFOCUSED = 6;
    }

    int getState();
}
