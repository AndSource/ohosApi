package ohos.media.camera.params;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

public interface SceneDetectionResult {
  int getState();
  
  Map<Integer, Float> getScenes();
  
  @Retention(RetentionPolicy.CLASS)
  public static @interface State {
    public static final int ERROR_UNKNOWN = -1;
    
    public static final int SCENE_DETECTED = 1;
  }
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/media/camera/params/SceneDetectionResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */