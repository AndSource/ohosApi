package ohos.media.sessioncore;

import java.util.List;
import ohos.app.Context;
import ohos.event.intentagent.IntentAgent;
import ohos.media.common.AVMetadata;
import ohos.media.common.sessioncore.AVCallerUserInfo;
import ohos.media.common.sessioncore.AVPlaybackState;
import ohos.media.common.sessioncore.AVQueueElement;
import ohos.media.common.sessioncore.AVSessionCallback;
import ohos.media.common.sessioncore.AVToken;
import ohos.utils.PacMap;

/* loaded from: ohos2.1.1.21.jar:ohos/media/sessioncore/AVSession.class */
public final class AVSession {
    public static final String ACTION_MEDIA_BUTTON = null;
    public static final String PARAM_KEY_EVENT = null;

    public AVSession(Context context, String tag) {
        throw new RuntimeException("Stub!");
    }

    public AVSession(Context context, String tag, PacMap sessionInfo) {
        throw new RuntimeException("Stub!");
    }

    public void setAVSessionCallback(AVSessionCallback callback) {
        throw new RuntimeException("Stub!");
    }

    public boolean setAVSessionAbility(IntentAgent ia) {
        throw new RuntimeException("Stub!");
    }

    public boolean setAVButtonReceiver(IntentAgent ia) {
        throw new RuntimeException("Stub!");
    }

    public void enableAVSessionActive(boolean active) {
        throw new RuntimeException("Stub!");
    }

    public boolean isAVSessionActive() {
        throw new RuntimeException("Stub!");
    }

    public void sendAVSessionEvent(String event, PacMap options) {
        throw new RuntimeException("Stub!");
    }

    public void release() {
        throw new RuntimeException("Stub!");
    }

    public AVToken getAVToken() {
        throw new RuntimeException("Stub!");
    }

    public AVController getAVController() {
        throw new RuntimeException("Stub!");
    }

    public void setAVPlaybackState(AVPlaybackState state) {
        throw new RuntimeException("Stub!");
    }

    public void setAVMetadata(AVMetadata avMetadata) {
        throw new RuntimeException("Stub!");
    }

    public void setAVQueue(List<AVQueueElement> queue) {
        throw new RuntimeException("Stub!");
    }

    public void setAVQueueTitle(CharSequence queueTitle) {
        throw new RuntimeException("Stub!");
    }

    public void setAVRatingStyle(int ratingStyle) {
        throw new RuntimeException("Stub!");
    }

    public void setOptions(PacMap options) {
        throw new RuntimeException("Stub!");
    }

    public AVCallerUserInfo getCurrentControllerInfo() {
        throw new RuntimeException("Stub!");
    }
}
