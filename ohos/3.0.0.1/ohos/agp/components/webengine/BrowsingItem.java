package ohos.agp.components.webengine;

import ohos.media.image.PixelMap;

public interface BrowsingItem {
  PixelMap getFavicon();
  
  String getTitle();
  
  String getFirstRequestUrl();
  
  String getCurrentUrl();
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/agp/components/webengine/BrowsingItem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */