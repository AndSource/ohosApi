package ohos.agp.components.webengine;

import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/webengine/CertificateRequest.class */
public interface CertificateRequest {
    void respond(PrivateKey privateKey, X509Certificate[] x509CertificateArr);

    void cancelOnce();

    void cancelAlways();

    String getHost();

    int getPort();

    String[] getTypes();

    Principal[] getPrincipals();
}
