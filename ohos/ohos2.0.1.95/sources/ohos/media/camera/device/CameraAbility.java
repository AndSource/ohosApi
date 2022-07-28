package ohos.media.camera.device;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import ohos.media.camera.params.ParameterKey;
import ohos.media.camera.params.PropertyKey;
import ohos.media.camera.params.ResultKey;
import ohos.media.image.common.Size;
import ohos.utils.Scope;

/* loaded from: ohos2.0.1.95.jar:ohos/media/camera/device/CameraAbility.class */
public interface CameraAbility {

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: ohos2.0.1.95.jar:ohos/media/camera/device/CameraAbility$CameraRunningMode.class */
    public @interface CameraRunningMode {
        public static final int CAMERA_RUNNING_MODE_HIGH_FRAME_RATE = 1;
        public static final int CAMERA_RUNNING_MODE_NORMAL = 0;
    }

    List<Integer> getSupportedFormats();

    List<Size> getSupportedSizes(int i);

    <T> List<Size> getSupportedSizes(Class<T> cls);

    int[] getSupportedAfMode();

    int[] getSupportedAeMode();

    float[] getSupportedZoom();

    int[] getSupportedFlashMode();

    int[] getSupportedFaceDetection();

    List<ParameterKey.Key<?>> getSupportedParameters();

    <T> List<T> getParameterRange(ParameterKey.Key<T> key);

    List<ResultKey.Key<?>> getSupportedResults();

    List<PropertyKey.Key<?>> getSupportedProperties();

    <T> T getPropertyValue(PropertyKey.Key<T> key);

    int[] getSupportedRunningModes();

    List<Scope<Integer>> getSupportedHighFrameRate(int i, Size size);

    <T> List<Scope<Integer>> getSupportedHighFrameRate(Class<T> cls, Size size);

    List<Size> getSupportedHighSizes(int i);

    long getMinCaptureDuration(int i, Size size);

    <T> long getMinCaptureDuration(Class<T> cls, Size size);
}
