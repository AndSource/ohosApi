package ohos.media.camera.params;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: ohos2.1.1.21.jar:ohos/media/camera/params/AeResult.class */
public interface AeResult {

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: ohos2.1.1.21.jar:ohos/media/camera/params/AeResult$State.class */
    public @interface State {
        public static final int AE_STATE_AUTO_SCAN = 1;
        public static final int AE_STATE_CONVERGED = 2;
        public static final int AE_STATE_FLASH_REQUIRED = 3;
        public static final int AE_STATE_INACTIVE = 0;
        public static final int AE_STATE_TRIGGER_SCAN = 4;
    }

    int getState();
}
