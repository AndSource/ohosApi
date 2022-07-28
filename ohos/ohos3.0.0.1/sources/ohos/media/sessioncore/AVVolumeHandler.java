package ohos.media.sessioncore;

/* loaded from: ohos3.0.0.1.jar:ohos/media/sessioncore/AVVolumeHandler.class */
public abstract class AVVolumeHandler {
    public static final int ADJUST_MODE_ALLOW_ALL = 2;
    public static final int ADJUST_MODE_ALLOW_SCROLL = 1;
    public static final int ADJUST_MODE_FORBID_ALL = 0;

    public AVVolumeHandler(int adjustMode, int maxVolume, int currentVolume) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public final int getVolume() {
        throw new RuntimeException("Stub!");
    }

    public final void setVolume(int volume) {
        throw new RuntimeException("Stub!");
    }

    public void onSetVolume(int volume) {
        throw new RuntimeException("Stub!");
    }

    public void onScrollVolume(int direction) {
        throw new RuntimeException("Stub!");
    }
}
