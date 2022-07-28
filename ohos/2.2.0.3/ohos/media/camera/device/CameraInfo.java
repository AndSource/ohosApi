package ohos.media.camera.device;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public interface CameraInfo {
  String getLogicalId();
  
  int getFacingType();
  
  List<String> getPhysicalIdList();
  
  int getDeviceLinkType(String paramString);
  
  boolean equals(Object paramObject);
  
  int hashCode();
  
  String toString();
  
  @Retention(RetentionPolicy.CLASS)
  public static @interface FacingType {
    public static final int CAMERA_FACING_BACK = 1;
    
    public static final int CAMERA_FACING_FRONT = 0;
    
    public static final int CAMERA_FACING_OTHERS = -1;
  }
  
  @Retention(RetentionPolicy.CLASS)
  public static @interface DeviceLinkType {
    public static final int DEVICE_LINK_EXTERNAL_MSDP = 2;
    
    public static final int DEVICE_LINK_EXTERNAL_USB = 1;
    
    public static final int DEVICE_LINK_NATIVE = 0;
    
    public static final int DEVICE_LINK_OTHERS = -1;
  }
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/media/camera/device/CameraInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */