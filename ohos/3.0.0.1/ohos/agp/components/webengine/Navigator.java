package ohos.agp.components.webengine;

public interface Navigator {
  void goBack();
  
  boolean canGoBack();
  
  void goForward();
  
  boolean canGoForward();
  
  void clear();
  
  BrowsingList copyBrowsingList();
  
  boolean canGo(int paramInt);
  
  void go(int paramInt);
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/agp/components/webengine/Navigator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */