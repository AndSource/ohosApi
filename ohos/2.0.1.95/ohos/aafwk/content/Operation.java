package ohos.aafwk.content;

import java.util.Set;
import ohos.utils.net.Uri;

public interface Operation {
  String getAction();
  
  Set<String> getEntities();
  
  String getBundleName();
  
  Uri getUri();
  
  int getFlags();
  
  String getDeviceId();
  
  String getAbilityName();
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/aafwk/content/Operation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */