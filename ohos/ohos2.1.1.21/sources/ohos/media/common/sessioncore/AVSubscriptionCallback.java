package ohos.media.common.sessioncore;

import java.util.List;
import ohos.utils.PacMap;

/* loaded from: ohos2.1.1.21.jar:ohos/media/common/sessioncore/AVSubscriptionCallback.class */
public abstract class AVSubscriptionCallback {
    public AVSubscriptionCallback() {
        throw new RuntimeException("Stub!");
    }

    public void onAVElementListLoaded(String parentMediaId, List<AVElement> elements) {
        throw new RuntimeException("Stub!");
    }

    public void onAVElementListLoaded(String parentMediaId, List<AVElement> elements, PacMap options) {
        throw new RuntimeException("Stub!");
    }

    public void onError(String parentMediaId) {
        throw new RuntimeException("Stub!");
    }

    public void onError(String parentMediaId, PacMap options) {
        throw new RuntimeException("Stub!");
    }
}
