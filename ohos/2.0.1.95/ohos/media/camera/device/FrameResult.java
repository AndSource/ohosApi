package ohos.media.camera.device;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import ohos.agp.graphics.Surface;
import ohos.media.camera.params.AeResult;
import ohos.media.camera.params.AfResult;
import ohos.media.camera.params.FaceDetectionResult;
import ohos.media.camera.params.ParametersResult;

public interface FrameResult {
  long getFrameNumber();
  
  int getState();
  
  boolean isFullResult();
  
  long getTimestamp();
  
  int getCaptureTriggerId();
  
  FrameConfig getFrameConfig();
  
  AfResult getAfResult();
  
  AeResult getAeResult();
  
  FaceDetectionResult getFaceDetectionResult();
  
  ParametersResult getParametersResult();
  
  List<Surface> getDroppedBufferOwners();
  
  @Retention(RetentionPolicy.CLASS)
  public static @interface State {
    public static final int ERROR_BUFFER_DROPPED = -4;
    
    public static final int ERROR_FLUSHED = -2;
    
    public static final int ERROR_FRAME_CONFIG = -3;
    
    public static final int ERROR_FRAME_RESULT = -5;
    
    public static final int ERROR_UNKNOWN = -1;
    
    public static final int FRAME_FULL_RESULT = 1;
    
    public static final int FRAME_PARTIAL_RESULT = 2;
  }
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/media/camera/device/FrameResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */