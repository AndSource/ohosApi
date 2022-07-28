package ohos.agp.components.webengine;

public interface WebConfig {
  public static final int SECURITY_ALLOW = 0;
  
  public static final int SECURITY_NOT_ALLOW = 1;
  
  public static final int SECURITY_SELF_ADAPTIVE = 2;
  
  void setDataAbilityPermit(boolean paramBoolean);
  
  void setJavaScriptPermit(boolean paramBoolean);
  
  void setWebStoragePermit(boolean paramBoolean);
  
  void setLocationPermit(boolean paramBoolean);
  
  void setLoadsImagesPermit(boolean paramBoolean);
  
  void setMediaAutoReplay(boolean paramBoolean);
  
  void setSecurityMode(int paramInt);
  
  boolean isDataAbilityPermitted();
  
  boolean isJavaScriptPermitted();
  
  boolean isWebStoragePermitted();
  
  boolean isLoadsImagesPermitted();
  
  boolean isMediaAutoReplay();
  
  int getSecurityMode();
  
  void setViewPortFitScreen(boolean paramBoolean);
  
  boolean isViewPortFitScreen();
  
  void setTextAutoSizing(boolean paramBoolean);
  
  boolean isTextAutoSizing();
  
  void setUserAgent(String paramString);
  
  String getUserAgent();
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/agp/components/webengine/WebConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */