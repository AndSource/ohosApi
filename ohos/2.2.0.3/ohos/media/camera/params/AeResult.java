package ohos.media.camera.params;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface AeResult {
  int getState();
  
  @Retention(RetentionPolicy.CLASS)
  public static @interface State {
    public static final int AE_STATE_AUTO_SCAN = 1;
    
    public static final int AE_STATE_CONVERGED = 2;
    
    public static final int AE_STATE_FLASH_REQUIRED = 3;
    
    public static final int AE_STATE_INACTIVE = 0;
    
    public static final int AE_STATE_TRIGGER_SCAN = 4;
  }
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/media/camera/params/AeResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */