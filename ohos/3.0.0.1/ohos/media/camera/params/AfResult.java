package ohos.media.camera.params;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface AfResult {
  int getState();
  
  @Retention(RetentionPolicy.CLASS)
  public static @interface State {
    public static final int AF_STATE_AUTO_FOCUSED = 2;
    
    public static final int AF_STATE_AUTO_SCAN = 1;
    
    public static final int AF_STATE_AUTO_UNFOCUSED = 3;
    
    public static final int AF_STATE_INACTIVE = 0;
    
    public static final int AF_STATE_TRIGGER_FOCUSED = 5;
    
    public static final int AF_STATE_TRIGGER_SCAN = 4;
    
    public static final int AF_STATE_TRIGGER_UNFOCUSED = 6;
  }
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/media/camera/params/AfResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */