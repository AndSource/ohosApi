package ohos.media.camera.params;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

public interface FaceDetectionResult {
  int getState();
  
  Face[] getFaces();
  
  Map<Integer, Integer> getSmiles();
  
  @Retention(RetentionPolicy.CLASS)
  public static @interface State {
    public static final int ERROR_UNKNOWN = -1;
    
    public static final int FACE_DETECTED = 1;
    
    public static final int FACE_SMILE_DETECTED = 2;
  }
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/media/camera/params/FaceDetectionResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */