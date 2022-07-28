package ohos.agp.components.webengine;

import ohos.utils.net.Uri;

public interface WebRequestAccess {
  public static final String ACCESS_CAMERA = "ohos.webengine.access.CAMERA";
  
  public static final String ACCESS_MICROPHONE = "ohos.webengine.access.MICROPHONE";
  
  public static final String ACCESS_MIDI_PRIVILEGED_MESSAGES = "ohos.webengine.access.MIDI_PRIVILEGED_MESSAGES";
  
  public static final String ACCESS_PROTECTED_MEDIA_IDENTIFIER = "ohos.webengine.access.PROTECTED_MEDIA_IDENTIFIER";
  
  Uri getWebContentOrigin();
  
  String[] getWebContentAccess();
  
  void grantAccess(String[] paramArrayOfString);
  
  void denyAccess();
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/agp/components/webengine/WebRequestAccess.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */