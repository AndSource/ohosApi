package ohos.media.camera.params;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: ohos2.0.1.95.jar:ohos/media/camera/params/FocusResult.class */
public interface FocusResult {

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: ohos2.0.1.95.jar:ohos/media/camera/params/FocusResult$State.class */
    public @interface State {
        public static final int ERROR_UNKNOWN = -1;
        public static final int FOCUS_FAILED = 5;
        public static final int FOCUS_LOCKED = 3;
        public static final int FOCUS_MODE_CHANGED = 1;
        public static final int FOCUS_MOVING = 2;
        public static final int FOCUS_SUCCEED = 4;
    }

    int getState();
}
