package ohos.media.sessioncore;

import ohos.app.Context;
import ohos.bundle.ElementName;
import ohos.media.common.sessioncore.AVConnectionCallback;
import ohos.media.common.sessioncore.AVElementCallback;
import ohos.media.common.sessioncore.AVSubscriptionCallback;
import ohos.media.common.sessioncore.AVToken;
import ohos.utils.PacMap;

/* loaded from: ohos3.0.0.1.jar:ohos/media/sessioncore/AVBrowser.class */
public final class AVBrowser {
    public AVBrowser(Context context, ElementName name, AVConnectionCallback callback, PacMap options) {
        throw new RuntimeException("Stub!");
    }

    public void connect() {
        throw new RuntimeException("Stub!");
    }

    public void disconnect() {
        throw new RuntimeException("Stub!");
    }

    public boolean isConnected() {
        throw new RuntimeException("Stub!");
    }

    public ElementName getElementName() {
        throw new RuntimeException("Stub!");
    }

    public String getRootMediaId() {
        throw new RuntimeException("Stub!");
    }

    public PacMap getOptions() {
        throw new RuntimeException("Stub!");
    }

    public AVToken getAVToken() {
        throw new RuntimeException("Stub!");
    }

    public void getAVElement(String mediaId, AVElementCallback callback) {
        throw new RuntimeException("Stub!");
    }

    public void subscribeByParentMediaId(String parentMediaId, AVSubscriptionCallback callback) {
        throw new RuntimeException("Stub!");
    }

    public void subscribeByParentMediaId(String parentMediaId, PacMap options, AVSubscriptionCallback callback) {
        throw new RuntimeException("Stub!");
    }

    public void unsubscribeByParentMediaId(String parentMediaId) {
        throw new RuntimeException("Stub!");
    }

    public void unsubscribeByParentMediaId(String parentMediaId, AVSubscriptionCallback callback) {
        throw new RuntimeException("Stub!");
    }
}
