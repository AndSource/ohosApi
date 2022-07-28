package ohos.media.camera.device;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import ohos.media.camera.params.ParameterKey;
import ohos.media.camera.params.PropertyKey;
import ohos.media.camera.params.ResultKey;
import ohos.media.image.common.Size;
import ohos.utils.Scope;

public interface CameraAbility {
  List<Integer> getSupportedFormats();
  
  List<Size> getSupportedSizes(int paramInt);
  
  <T> List<Size> getSupportedSizes(Class<T> paramClass);
  
  int[] getSupportedAfMode();
  
  int[] getSupportedAeMode();
  
  float[] getSupportedZoom();
  
  int[] getSupportedFlashMode();
  
  int[] getSupportedFaceDetection();
  
  List<ParameterKey.Key<?>> getSupportedParameters();
  
  <T> List<T> getParameterRange(ParameterKey.Key<T> paramKey);
  
  List<ResultKey.Key<?>> getSupportedResults();
  
  List<PropertyKey.Key<?>> getSupportedProperties();
  
  <T> T getPropertyValue(PropertyKey.Key<T> paramKey);
  
  int[] getSupportedRunningModes();
  
  List<Scope<Integer>> getSupportedHighFrameRate(int paramInt, Size paramSize);
  
  <T> List<Scope<Integer>> getSupportedHighFrameRate(Class<T> paramClass, Size paramSize);
  
  List<Size> getSupportedHighSizes(int paramInt);
  
  long getMinCaptureDuration(int paramInt, Size paramSize);
  
  <T> long getMinCaptureDuration(Class<T> paramClass, Size paramSize);
  
  @Retention(RetentionPolicy.CLASS)
  public static @interface CameraRunningMode {
    public static final int CAMERA_RUNNING_MODE_HIGH_FRAME_RATE = 1;
    
    public static final int CAMERA_RUNNING_MODE_NORMAL = 0;
  }
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/media/camera/device/CameraAbility.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */