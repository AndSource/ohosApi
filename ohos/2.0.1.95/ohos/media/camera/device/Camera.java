package ohos.media.camera.device;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import ohos.agp.graphics.Surface;

public interface Camera {
  public static final int CAPTURE_TRIGGER_ERROR_ID = -1;
  
  String getCameraId();
  
  CameraConfig.Builder getCameraConfigBuilder();
  
  FrameConfig.Builder getFrameConfigBuilder(int paramInt);
  
  void configure(CameraConfig paramCameraConfig);
  
  void release();
  
  int triggerLoopingCapture(FrameConfig paramFrameConfig);
  
  int triggerLoopingGroupCapture(List<FrameConfig> paramList);
  
  void stopLoopingCapture();
  
  int triggerSingleCapture(FrameConfig paramFrameConfig);
  
  int triggerMultiCapture(List<FrameConfig> paramList);
  
  void flushCaptures();
  
  void allocateBuffers(Surface paramSurface, int paramInt);
  
  void freeBuffers(Surface paramSurface);
  
  @Retention(RetentionPolicy.CLASS)
  public static @interface FrameConfigType {
    public static final int FRAME_CONFIG_PICTURE = 2;
    
    public static final int FRAME_CONFIG_PREVIEW = 1;
    
    public static final int FRAME_CONFIG_RECORD = 3;
  }
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/media/camera/device/Camera.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */