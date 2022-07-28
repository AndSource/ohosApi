package ohos.media.camera.device;

import ohos.agp.graphics.Surface;
import ohos.eventhandler.EventHandler;
import ohos.media.image.common.Size;

public interface CameraConfig {
  public static interface Builder {
    Builder addSurface(Surface param1Surface);
    
    Builder removeSurface(Surface param1Surface);
    
    <T> Builder addDeferredSurfaceSize(Size param1Size, Class<T> param1Class);
    
    Builder addDeferredSurface(Surface param1Surface);
    
    Builder setFrameStateCallback(FrameStateCallback param1FrameStateCallback, EventHandler param1EventHandler);
    
    Builder setRunningMode(int param1Int);
    
    CameraConfig build();
  }
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/media/camera/device/CameraConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */