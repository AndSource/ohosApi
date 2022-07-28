package ohos.agp.components.webengine;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/webengine/CookieStore.class */
public abstract class CookieStore {
    public abstract void setCookieEnable(boolean z);

    public abstract void removeCookies(boolean z, AsyncCallback<Boolean> asyncCallback);

    public abstract String getCookie(String str);

    public abstract void persist();

    public abstract void setCookie(String str, String str2);

    public abstract void setCrossDomainCookieEnable(WebView webView, boolean z);

    public abstract boolean isCookieEnable();

    public abstract boolean isCrossDomainCookieEnable(WebView webView);

    public abstract boolean hasCookies();

    public CookieStore() {
        throw new RuntimeException("Stub!");
    }

    public static CookieStore getInstance() {
        throw new RuntimeException("Stub!");
    }
}
