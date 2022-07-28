package ohos.agp.components.webengine;

/* loaded from: ohos2.1.1.21.jar:ohos/agp/components/webengine/WebConfig.class */
public interface WebConfig {
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

    void setViewPortFitScreen(boolean z);

    boolean isViewPortFitScreen();

    void setTextAutoSizing(boolean z);

    boolean isTextAutoSizing();

    void setUserAgent(String str);

    String getUserAgent();
}
