package ohos.media.tubecore;

import ohos.media.audio.AudioStreamInfo;

/* loaded from: ohos2.1.1.21.jar:ohos/media/tubecore/AVTube.class */
public class AVTube {
    AVTube(Object adp) {
        throw new RuntimeException("Stub!");
    }

    public DeviceType deviceType() {
        throw new RuntimeException("Stub!");
    }

    public int usageScenes() {
        throw new RuntimeException("Stub!");
    }

    public String tubeName() {
        throw new RuntimeException("Stub!");
    }

    public boolean isReady() {
        throw new RuntimeException("Stub!");
    }

    public boolean isConnecting() {
        throw new RuntimeException("Stub!");
    }

    public int maxVolume() {
        throw new RuntimeException("Stub!");
    }

    public int curVolume() {
        throw new RuntimeException("Stub!");
    }

    public void setLabel(Object label) {
        throw new RuntimeException("Stub!");
    }

    public Object label() {
        throw new RuntimeException("Stub!");
    }

    public PlayMode playMode() {
        throw new RuntimeException("Stub!");
    }

    public AudioStreamInfo.StreamType streamType() {
        throw new RuntimeException("Stub!");
    }

    public void cmdIncVolume(int increment) {
        throw new RuntimeException("Stub!");
    }

    public void cmdDecVolume(int decrement) {
        throw new RuntimeException("Stub!");
    }

    public void cmdSetVolume(int volume) {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/media/tubecore/AVTube$DeviceType.class */
    public enum DeviceType {
        UNKNOWN,
        BLUETOOTH;

        public int getValue() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/media/tubecore/AVTube$PlayMode.class */
    public enum PlayMode {
        LOCAL,
        DISTRIBUTE;

        public int getValue() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/media/tubecore/AVTube$SetInfo.class */
    public static class SetInfo {
        SetInfo(Object adp) {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/media/tubecore/AVTube$UsageScene.class */
    public static class UsageScene {
        public static final int ANY = 8388615;
        public static final int REAL_TIME_AUDIO = 1;
        public static final int REAL_TIME_VIDEO = 2;
        public static final int USER_EXTENDED = 8388608;

        UsageScene() {
            throw new RuntimeException("Stub!");
        }
    }
}
