package ohos.media.common.sessioncore;

import ohos.aafwk.content.Intent;
import ohos.app.GeneralReceiver;
import ohos.utils.PacMap;
import ohos.utils.net.Uri;

/* loaded from: ohos2.0.1.95.jar:ohos/media/common/sessioncore/AVSessionCallback.class */
public abstract class AVSessionCallback {
    public AVSessionCallback() {
        throw new RuntimeException("Stub!");
    }

    public void onCommand(String command, PacMap options, GeneralReceiver callback) {
        throw new RuntimeException("Stub!");
    }

    public boolean onMediaButtonEvent(Intent mediaButtonIntent) {
        throw new RuntimeException("Stub!");
    }

    public void onPrepareToPlay() {
        throw new RuntimeException("Stub!");
    }

    public void onPrepareToPlayByMediaId(String mediaId, PacMap options) {
        throw new RuntimeException("Stub!");
    }

    public void onPrepareToPlayBySearch(String query, PacMap options) {
        throw new RuntimeException("Stub!");
    }

    public void onPrepareToPlayByUri(Uri uri, PacMap options) {
        throw new RuntimeException("Stub!");
    }

    public void onPlay() {
        throw new RuntimeException("Stub!");
    }

    public void onPlayBySearch(String query, PacMap options) {
        throw new RuntimeException("Stub!");
    }

    public void onPlayByMediaId(String mediaId, PacMap options) {
        throw new RuntimeException("Stub!");
    }

    public void onPlayByUri(Uri uri, PacMap options) {
        throw new RuntimeException("Stub!");
    }

    public void onSkipToAVQueueElement(long queueId) {
        throw new RuntimeException("Stub!");
    }

    public void onPause() {
        throw new RuntimeException("Stub!");
    }

    public void onSeekTo(long position) {
        throw new RuntimeException("Stub!");
    }

    public void onPlayNext() {
        throw new RuntimeException("Stub!");
    }

    public void onPlayPrevious() {
        throw new RuntimeException("Stub!");
    }

    public void onPlayFastForward() {
        throw new RuntimeException("Stub!");
    }

    public void onRewind() {
        throw new RuntimeException("Stub!");
    }

    public void onStop() {
        throw new RuntimeException("Stub!");
    }

    public void onSetAVPlaybackSpeed(float speed) {
        throw new RuntimeException("Stub!");
    }

    public void onSetAVPlaybackCustomAction(String action, PacMap options) {
        throw new RuntimeException("Stub!");
    }
}
