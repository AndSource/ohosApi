package ohos.agp.components.webengine;

import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;

public interface CertificateRequest {
  void respond(PrivateKey paramPrivateKey, X509Certificate[] paramArrayOfX509Certificate);
  
  void cancelOnce();
  
  void cancelAlways();
  
  String getHost();
  
  int getPort();
  
  String[] getTypes();
  
  Principal[] getPrincipals();
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/agp/components/webengine/CertificateRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */