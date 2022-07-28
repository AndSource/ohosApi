package ohos.media.common.sessioncore;

import java.util.List;
import ohos.media.common.AVMetadata;
import ohos.utils.PacMap;

/* loaded from: ohos2.2.0.3.jar:ohos/media/common/sessioncore/AVControllerCallback.class */
public abstract class AVControllerCallback {
    public AVControllerCallback() {
        throw new RuntimeException("Stub!");
    }

    public void onAVSessionDestroyed() {
        throw new RuntimeException("Stub!");
    }

    public void onAVSessionEvent(String event, PacMap options) {
        throw new RuntimeException("Stub!");
    }

    public void onAVPlaybackStateChanged(AVPlaybackState state) {
        throw new RuntimeException("Stub!");
    }

    public void onAVMetadataChanged(AVMetadata metadata) {
        throw new RuntimeException("Stub!");
    }

    public void onAVQueueChanged(List<AVQueueElement> queue) {
        throw new RuntimeException("Stub!");
    }

    public void onAVQueueTitleChanged(CharSequence title) {
        throw new RuntimeException("Stub!");
    }

    public void onOptionsChanged(PacMap options) {
        throw new RuntimeException("Stub!");
    }
}
