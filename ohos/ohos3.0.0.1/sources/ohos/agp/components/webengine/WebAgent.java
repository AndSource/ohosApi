package ohos.agp.components.webengine;

import ohos.media.image.PixelMap;
import ohos.net.http.SslError;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/webengine/WebAgent.class */
public class WebAgent {
    public WebAgent() {
        throw new RuntimeException("Stub!");
    }

    public boolean isNeedLoadUrl(WebView webView, ResourceRequest request) {
        throw new RuntimeException("Stub!");
    }

    public void onLoadingPage(WebView webView, String url, PixelMap icon) {
        throw new RuntimeException("Stub!");
    }

    public void onPageLoaded(WebView webView, String url) {
        throw new RuntimeException("Stub!");
    }

    public void onLoadingContent(WebView webView, String url) {
        throw new RuntimeException("Stub!");
    }

    public void onError(WebView webView, ResourceRequest request, ResourceError error) {
        throw new RuntimeException("Stub!");
    }

    public void onCertificateRequested(WebView webView, CertificateRequest request) {
        throw new RuntimeException("Stub!");
    }

    public void onAuthRequested(WebView webView, AuthRequest request, String host, String realm) {
        throw new RuntimeException("Stub!");
    }

    public void onLogin(WebView webView, String realm, String account, String args) {
        throw new RuntimeException("Stub!");
    }

    public void onHttpError(WebView webView, ResourceRequest request, ResourceResponse response) {
        throw new RuntimeException("Stub!");
    }

    public void onSslError(WebView webView, SslError error) {
        throw new RuntimeException("Stub!");
    }

    public ResourceResponse processResourceRequest(WebView webView, ResourceRequest request) {
        throw new RuntimeException("Stub!");
    }
}
