package ohos.media.sessioncore;

import java.util.List;
import ohos.aafwk.ability.Ability;
import ohos.app.Context;
import ohos.app.GeneralReceiver;
import ohos.event.intentagent.IntentAgent;
import ohos.media.common.AVMetadata;
import ohos.media.common.sessioncore.AVControllerCallback;
import ohos.media.common.sessioncore.AVPlaybackState;
import ohos.media.common.sessioncore.AVQueueElement;
import ohos.media.common.sessioncore.AVToken;
import ohos.multimodalinput.event.KeyEvent;
import ohos.utils.PacMap;
import ohos.utils.net.Uri;

/* loaded from: ohos2.1.1.21.jar:ohos/media/sessioncore/AVController.class */
public final class AVController {
    public AVController(Context context, AVToken avToken) {
        throw new RuntimeException("Stub!");
    }

    public static boolean setControllerForAbility(Ability ability, AVController controller) {
        throw new RuntimeException("Stub!");
    }

    public boolean setAVControllerCallback(AVControllerCallback callback) {
        throw new RuntimeException("Stub!");
    }

    public boolean releaseAVControllerCallback(AVControllerCallback callback) {
        throw new RuntimeException("Stub!");
    }

    public List<AVQueueElement> getAVQueueElement() {
        throw new RuntimeException("Stub!");
    }

    public CharSequence getAVQueueTitle() {
        throw new RuntimeException("Stub!");
    }

    public AVPlaybackState getAVPlaybackState() {
        throw new RuntimeException("Stub!");
    }

    public boolean dispatchAVKeyEvent(KeyEvent keyEvent) {
        throw new RuntimeException("Stub!");
    }

    public void sendCustomCommand(String command, PacMap pacMap, GeneralReceiver receiverCb) {
        throw new RuntimeException("Stub!");
    }

    public IntentAgent getAVSessionAbility() {
        throw new RuntimeException("Stub!");
    }

    public AVToken getAVToken() {
        throw new RuntimeException("Stub!");
    }

    public void adjustAVPlaybackVolume(int direction, int flags) {
        throw new RuntimeException("Stub!");
    }

    public void setAVPlaybackVolume(int value, int flags) {
        throw new RuntimeException("Stub!");
    }

    public PacMap getOptions() {
        throw new RuntimeException("Stub!");
    }

    public long getFlags() {
        throw new RuntimeException("Stub!");
    }

    public AVMetadata getAVMetadata() {
        throw new RuntimeException("Stub!");
    }

    public String getSessionOwnerPackageName() {
        throw new RuntimeException("Stub!");
    }

    public PacMap getAVSessionInfo() {
        throw new RuntimeException("Stub!");
    }

    public PlayControls getPlayControls() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/media/sessioncore/AVController$PlayControls.class */
    public final class PlayControls {
        PlayControls() {
            throw new RuntimeException("Stub!");
        }

        public void prepareToPlay() {
            throw new RuntimeException("Stub!");
        }

        public void prepareToPlayByMediaId(String mediaId, PacMap options) {
            throw new RuntimeException("Stub!");
        }

        public void prepareToPlayBySearch(String query, PacMap options) {
            throw new RuntimeException("Stub!");
        }

        public void prepareToPlayByUri(Uri uri, PacMap options) {
            throw new RuntimeException("Stub!");
        }

        public void play() {
            throw new RuntimeException("Stub!");
        }

        public void playByMediaId(String mediaId, PacMap options) {
            throw new RuntimeException("Stub!");
        }

        public void playBySearch(String query, PacMap options) {
            throw new RuntimeException("Stub!");
        }

        public void playByUri(Uri uri, PacMap options) {
            throw new RuntimeException("Stub!");
        }

        public void skipToAVQueueItem(long id) {
            throw new RuntimeException("Stub!");
        }

        public void pause() {
            throw new RuntimeException("Stub!");
        }

        public void stop() {
            throw new RuntimeException("Stub!");
        }

        public void seekTo(long pos) {
            throw new RuntimeException("Stub!");
        }

        public void playFastForward() {
            throw new RuntimeException("Stub!");
        }

        public void playNext() {
            throw new RuntimeException("Stub!");
        }

        public void rewind() {
            throw new RuntimeException("Stub!");
        }

        public void playPrevious() {
            throw new RuntimeException("Stub!");
        }

        public void setAVPlaybackSpeed(float speed) {
            throw new RuntimeException("Stub!");
        }

        public void sendAVPlaybackCustomAction(AVPlaybackState.AVPlaybackCustomAction avCustomAction, PacMap args) {
            throw new RuntimeException("Stub!");
        }

        public void sendAVPlaybackCustomAction(String action, PacMap args) {
            throw new RuntimeException("Stub!");
        }
    }
}
