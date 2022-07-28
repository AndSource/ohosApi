package ohos.media.common.sessioncore;

import java.util.List;
import ohos.utils.PacMap;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.0.1.95.jar:ohos/media/common/sessioncore/AVPlaybackState.class */
public final class AVPlaybackState implements Sequenceable {
    public static Sequenceable.Producer<AVPlaybackState> CREATOR;
    public static final long PLAYBACK_ACTION_FAST_FORWARD = 64;
    public static final long PLAYBACK_ACTION_PAUSE = 2;
    public static final long PLAYBACK_ACTION_PLAY = 4;
    public static final long PLAYBACK_ACTION_PLAY_FROM_MEDIA_ID = 1024;
    public static final long PLAYBACK_ACTION_PLAY_FROM_SEARCH = 2048;
    public static final long PLAYBACK_ACTION_PLAY_FROM_URI = 8192;
    public static final long PLAYBACK_ACTION_PLAY_PAUSE = 512;
    public static final long PLAYBACK_ACTION_PREPARE = 16384;
    public static final long PLAYBACK_ACTION_PREPARE_FROM_MEDIA_ID = 32768;
    public static final long PLAYBACK_ACTION_PREPARE_FROM_SEARCH = 65536;
    public static final long PLAYBACK_ACTION_PREPARE_FROM_URI = 131072;
    public static final long PLAYBACK_ACTION_REWIND = 8;
    public static final long PLAYBACK_ACTION_SEEK_TO = 256;
    public static final long PLAYBACK_ACTION_SET_RATING = 128;
    public static final long PLAYBACK_ACTION_SKIP_TO_NEXT = 32;
    public static final long PLAYBACK_ACTION_SKIP_TO_PREVIOUS = 16;
    public static final long PLAYBACK_ACTION_SKIP_TO_QUEUE_ITEM = 4096;
    public static final long PLAYBACK_ACTION_STOP = 1;
    public static final long PLAYBACK_POSITION_ERROR = -1;
    public static final int PLAYBACK_STATE_BUFFERING = 6;
    public static final int PLAYBACK_STATE_CONNECTING = 8;
    public static final int PLAYBACK_STATE_ERROR = 7;
    public static final int PLAYBACK_STATE_FAST_FORWARDING = 4;
    public static final int PLAYBACK_STATE_NONE = 0;
    public static final int PLAYBACK_STATE_PAUSED = 2;
    public static final int PLAYBACK_STATE_PLAYING = 3;
    public static final int PLAYBACK_STATE_REWINDING = 5;
    public static final int PLAYBACK_STATE_SKIPPING_TO_NEXT = 10;
    public static final int PLAYBACK_STATE_SKIPPING_TO_PREVIOUS = 9;
    public static final int PLAYBACK_STATE_SKIPPING_TO_QUEUE_ITEM = 11;
    public static final int PLAYBACK_STATE_STOPPED = 1;

    AVPlaybackState(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean marshalling(Parcel out) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean unmarshalling(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    public int getAVPlaybackState() {
        throw new RuntimeException("Stub!");
    }

    public long getCurrentPosition() {
        throw new RuntimeException("Stub!");
    }

    public long getCurrentBufferedPosition() {
        throw new RuntimeException("Stub!");
    }

    public float getAVPlaybackSpeed() {
        throw new RuntimeException("Stub!");
    }

    public long getAVPlaybackActions() {
        throw new RuntimeException("Stub!");
    }

    public List<AVPlaybackCustomAction> getAVPlaybackCustomActions() {
        throw new RuntimeException("Stub!");
    }

    public CharSequence getAVPlaybackErrorMessage() {
        throw new RuntimeException("Stub!");
    }

    public long getLastPositionChangedTime() {
        throw new RuntimeException("Stub!");
    }

    public long getActiveQueueElementId() {
        throw new RuntimeException("Stub!");
    }

    public PacMap getOptions() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/media/common/sessioncore/AVPlaybackState$AVPlaybackCustomAction.class */
    public static final class AVPlaybackCustomAction implements Sequenceable {
        public static final Sequenceable.Producer<AVPlaybackCustomAction> CREATOR = null;

        AVPlaybackCustomAction(Parcel in) {
            throw new RuntimeException("Stub!");
        }

        @Override // ohos.utils.Sequenceable
        public boolean marshalling(Parcel out) {
            throw new RuntimeException("Stub!");
        }

        @Override // ohos.utils.Sequenceable
        public boolean unmarshalling(Parcel in) {
            throw new RuntimeException("Stub!");
        }

        public String getAVPlaybackAction() {
            throw new RuntimeException("Stub!");
        }

        public CharSequence getAVPlaybackActionName() {
            throw new RuntimeException("Stub!");
        }

        public int getResourceIdOfIcon() {
            throw new RuntimeException("Stub!");
        }

        public PacMap getOptions() {
            throw new RuntimeException("Stub!");
        }

        public String toString() {
            throw new RuntimeException("Stub!");
        }

        /* loaded from: ohos2.0.1.95.jar:ohos/media/common/sessioncore/AVPlaybackState$AVPlaybackCustomAction$Builder.class */
        public static final class Builder {
            public Builder(String action, CharSequence name, int icon) {
                throw new RuntimeException("Stub!");
            }

            public Builder setOptions(PacMap options) {
                throw new RuntimeException("Stub!");
            }

            public AVPlaybackCustomAction build() {
                throw new RuntimeException("Stub!");
            }
        }
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/media/common/sessioncore/AVPlaybackState$Builder.class */
    public static final class Builder {
        public Builder() {
            throw new RuntimeException("Stub!");
        }

        public Builder(AVPlaybackState from) {
            throw new RuntimeException("Stub!");
        }

        public Builder setAVPlaybackState(int state, long position, float speed, long updateTime) {
            throw new RuntimeException("Stub!");
        }

        public Builder setAVPlaybackState(int state, long position, float speed) {
            throw new RuntimeException("Stub!");
        }

        public Builder setAVPlaybackActions(long actions) {
            throw new RuntimeException("Stub!");
        }

        public Builder addAVPlaybackCustomAction(String action, String name, int icon) {
            throw new RuntimeException("Stub!");
        }

        public Builder addAVPlaybackCustomAction(AVPlaybackCustomAction customAction) {
            throw new RuntimeException("Stub!");
        }

        public Builder setCurrentBufferedPosition(long bufferedPosition) {
            throw new RuntimeException("Stub!");
        }

        public Builder setActiveQueueElementId(long id) {
            throw new RuntimeException("Stub!");
        }

        public Builder setAVPlaybackErrorMessage(CharSequence error) {
            throw new RuntimeException("Stub!");
        }

        public Builder setOptions(PacMap options) {
            throw new RuntimeException("Stub!");
        }

        public AVPlaybackState build() {
            throw new RuntimeException("Stub!");
        }
    }
}
