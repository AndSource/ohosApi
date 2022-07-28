package ohos.media.camera.device;

import java.util.List;
import ohos.agp.graphics.Surface;
import ohos.agp.utils.Rect;
import ohos.location.Location;
import ohos.media.camera.params.ParameterKey;

public interface FrameConfig {
  int getFrameConfigType();
  
  List<Surface> getSurfaces();
  
  Surface getCoordinateSurface();
  
  int getAfMode();
  
  Rect getAfRect();
  
  int getAfTrigger();
  
  int getAeMode();
  
  Rect getAeRect();
  
  int getAeTrigger();
  
  int getAwbMode();
  
  float getZoomValue();
  
  int getFlashMode();
  
  int getFaceDetectionType();
  
  Location getLocation();
  
  int getImageRotation();
  
  <T> T get(ParameterKey.Key<T> paramKey);
  
  List<ParameterKey.Key<?>> getKeys();
  
  Object getMark();
  
  boolean equals(Object paramObject);
  
  public static interface Builder {
    Builder addSurface(Surface param1Surface);
    
    Builder removeSurface(Surface param1Surface);
    
    Builder setFaceDetection(int param1Int, boolean param1Boolean);
    
    Builder setAfMode(int param1Int, Rect param1Rect);
    
    Builder setAfTrigger(int param1Int);
    
    Builder setAeMode(int param1Int, Rect param1Rect);
    
    Builder setAeTrigger(int param1Int);
    
    Builder setAwbMode(int param1Int, Rect param1Rect);
    
    Builder setZoom(float param1Float);
    
    Builder setFlashMode(int param1Int);
    
    Builder setMark(Object param1Object);
    
    Builder setLocation(Location param1Location);
    
    Builder setImageRotation(int param1Int);
    
    <T> Builder setParameter(ParameterKey.Key<T> param1Key, T param1T);
    
    Surface getCoordinateSurface();
    
    int getFrameConfigType();
    
    List<Surface> getSurfaces();
    
    Builder setCoordinateSurface(Surface param1Surface);
    
    int getAfMode();
    
    Rect getAfRect();
    
    int getAfTrigger();
    
    int getAeMode();
    
    Rect getAeRect();
    
    int getAeTrigger();
    
    int getAwbMode();
    
    float getZoomValue();
    
    int getFlashMode();
    
    int getFaceDetectionType();
    
    Location getLocation();
    
    int getImageRotation();
    
    <T> T get(ParameterKey.Key<T> param1Key);
    
    List<ParameterKey.Key<?>> getKeys();
    
    FrameConfig build();
  }
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/media/camera/device/FrameConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */