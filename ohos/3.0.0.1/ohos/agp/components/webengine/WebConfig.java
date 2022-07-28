package ohos.agp.components.webengine;

public interface WebConfig {
  public static final int PRIORITY_CACHE_EXPIRED_FIRST = 1;
  
  public static final int PRIORITY_CACHE_FIRST = 0;
  
  public static final int PRIORITY_CACHE_ONLY = 3;
  
  public static final int PRIORITY_NETWORK_ONLY = 2;
  
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
  
  void setAutoFitOnLoad(boolean paramBoolean);
  
  boolean isAutoFitOnLoad();
  
  void setViewPortFitScreen(boolean paramBoolean);
  
  boolean isViewPortFitScreen();
  
  void setWebCachePriority(int paramInt);
  
  int getWebCachePriority();
  
  void setSupportWebSql(boolean paramBoolean);
  
  boolean isSupportWebSql();
  
  void setFocusFirstNode(boolean paramBoolean);
  
  void setDefaultEncoding(String paramString);
  
  String getDefaultEncoding();
  
  void setTextAutoSizing(boolean paramBoolean);
  
  boolean isTextAutoSizing();
  
  void setUserAgent(String paramString);
  
  String getUserAgent();
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/agp/components/webengine/WebConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */