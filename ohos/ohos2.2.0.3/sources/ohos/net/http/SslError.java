package ohos.net.http;

import java.security.cert.X509Certificate;

/* loaded from: ohos2.2.0.3.jar:ohos/net/http/SslError.class */
public class SslError {
    public static final int SSL_CERT_AUTHORITY_INVALID = 3;
    public static final int SSL_CERT_DATE_INVALID = 4;
    public static final int SSL_CERT_EXPIRED = 1;
    public static final int SSL_CERT_INVALID = 5;
    public static final int SSL_CERT_NAME_INVALID = 2;
    public static final int SSL_CERT_NOT_YET_VALID = 0;

    public SslError(int error, X509Certificate X509certificate, String url) {
        throw new RuntimeException("Stub!");
    }

    public boolean addError(int error) {
        throw new RuntimeException("Stub!");
    }

    public boolean hasError(int error) {
        throw new RuntimeException("Stub!");
    }

    public X509Certificate getCertificate() {
        throw new RuntimeException("Stub!");
    }

    public int getCriticalError() {
        throw new RuntimeException("Stub!");
    }

    public String getUrl() {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
