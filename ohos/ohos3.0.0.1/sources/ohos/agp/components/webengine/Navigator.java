package ohos.agp.components.webengine;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/webengine/Navigator.class */
public interface Navigator {
    void goBack();

    boolean canGoBack();

    void goForward();

    boolean canGoForward();

    void clear();

    BrowsingList copyBrowsingList();

    boolean canGo(int i);

    void go(int i);
}
