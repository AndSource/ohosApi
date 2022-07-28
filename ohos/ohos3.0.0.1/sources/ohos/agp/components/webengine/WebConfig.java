package ohos.agp.components.webengine;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/webengine/WebConfig.class */
public interface WebConfig {
    public static final int PRIORITY_CACHE_EXPIRED_FIRST = 1;
    public static final int PRIORITY_CACHE_FIRST = 0;
    public static final int PRIORITY_CACHE_ONLY = 3;
    public static final int PRIORITY_NETWORK_ONLY = 2;
    public static final int SECURITY_ALLOW = 0;
    public static final int SECURITY_NOT_ALLOW = 1;
    public static final int SECURITY_SELF_ADAPTIVE = 2;

    void setDataAbilityPermit(boolean z);

    void setJavaScriptPermit(boolean z);

    void setWebStoragePermit(boolean z);

    void setLocationPermit(boolean z);

    void setLoadsImagesPermit(boolean z);

    void setMediaAutoReplay(boolean z);

    void setSecurityMode(int i);

    boolean isDataAbilityPermitted();

    boolean isJavaScriptPermitted();

    boolean isWebStoragePermitted();

    boolean isLoadsImagesPermitted();

    boolean isMediaAutoReplay();

    int getSecurityMode();

    void setAutoFitOnLoad(boolean z);

    boolean isAutoFitOnLoad();

    void setViewPortFitScreen(boolean z);

    boolean isViewPortFitScreen();

    void setWebCachePriority(int i);

    int getWebCachePriority();

    void setSupportWebSql(boolean z);

    boolean isSupportWebSql();

    void setFocusFirstNode(boolean z);

    void setDefaultEncoding(String str);

    String getDefaultEncoding();

    void setTextAutoSizing(boolean z);

    boolean isTextAutoSizing();

    void setUserAgent(String str);

    String getUserAgent();
}
