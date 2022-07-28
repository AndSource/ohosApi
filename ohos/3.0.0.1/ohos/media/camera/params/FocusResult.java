package ohos.media.camera.params;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface FocusResult {
  int getState();
  
  @Retention(RetentionPolicy.CLASS)
  public static @interface State {
    public static final int ERROR_UNKNOWN = -1;
    
    public static final int FOCUS_FAILED = 5;
    
    public static final int FOCUS_LOCKED = 3;
    
    public static final int FOCUS_MODE_CHANGED = 1;
    
    public static final int FOCUS_MOVING = 2;
    
    public static final int FOCUS_SUCCEED = 4;
  }
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/media/camera/params/FocusResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */