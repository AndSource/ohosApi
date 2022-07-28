package ohos.media.camera.params;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public interface ParametersResult {
  int getState();
  
  List<ResultKey.Key<?>> getAvailableResultKeys();
  
  <T> T getResultValue(ResultKey.Key<T> paramKey);
  
  @Retention(RetentionPolicy.CLASS)
  public static @interface State {
    public static final int ERROR_UNKNOWN = -1;
    
    public static final int PARAMETERS_RESULT = 1;
  }
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/media/camera/params/ParametersResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */