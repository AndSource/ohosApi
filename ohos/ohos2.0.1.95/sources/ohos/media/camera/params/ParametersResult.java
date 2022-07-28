package ohos.media.camera.params;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import ohos.media.camera.params.ResultKey;

/* loaded from: ohos2.0.1.95.jar:ohos/media/camera/params/ParametersResult.class */
public interface ParametersResult {

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: ohos2.0.1.95.jar:ohos/media/camera/params/ParametersResult$State.class */
    public @interface State {
        public static final int ERROR_UNKNOWN = -1;
        public static final int PARAMETERS_RESULT = 1;
    }

    int getState();

    List<ResultKey.Key<?>> getAvailableResultKeys();

    <T> T getResultValue(ResultKey.Key<T> key);
}
