package ohos.agp.components.webengine;

import java.util.Map;
import ohos.utils.net.Uri;

public interface ResourceRequest {
  Uri getRequestUrl();
  
  Map<String, String> getHeaders();
  
  boolean isServerSideRedirected();
  
  boolean isMainFrame();
  
  String getMethod();
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/agp/components/webengine/ResourceRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */