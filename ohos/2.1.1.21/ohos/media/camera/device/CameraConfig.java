package ohos.media.camera.device;

import java.util.List;
import ohos.agp.graphics.Surface;
import ohos.eventhandler.EventHandler;
import ohos.media.image.common.Size;

public interface CameraConfig {
  List<Surface> getSurfaces();
  
  boolean equals(Object paramObject);
  
  public static interface Builder {
    Builder addSurface(Surface param1Surface);
    
    Builder removeSurface(Surface param1Surface);
    
    List<Surface> getSurfaces();
    
    <T> Builder addDeferredSurfaceSize(Size param1Size, Class<T> param1Class);
    
    Builder addDeferredSurface(Surface param1Surface);
    
    Builder setFrameStateCallback(FrameStateCallback param1FrameStateCallback, EventHandler param1EventHandler);
    
    Builder setRunningMode(int param1Int);
    
    CameraConfig build();
  }
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/media/camera/device/CameraConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */