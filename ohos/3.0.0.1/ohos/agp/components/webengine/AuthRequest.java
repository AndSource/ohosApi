package ohos.agp.components.webengine;

public interface AuthRequest {
  void respond(String paramString1, String paramString2);
  
  void cancel();
  
  boolean isCredentialsStored();
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/agp/components/webengine/AuthRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */