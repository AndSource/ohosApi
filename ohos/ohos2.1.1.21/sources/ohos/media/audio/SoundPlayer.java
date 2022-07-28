package ohos.media.audio;

import java.io.FileDescriptor;
import ohos.app.Context;
import ohos.global.resource.BaseFileDescriptor;
import ohos.media.audio.AudioStreamInfo;
import ohos.media.audio.ToneDescriptor;

/* loaded from: ohos2.1.1.21.jar:ohos/media/audio/SoundPlayer.class */
public class SoundPlayer {

    /* loaded from: ohos2.1.1.21.jar:ohos/media/audio/SoundPlayer$OnCreateCompleteListener.class */
    public interface OnCreateCompleteListener {
        void onCreateComplete(SoundPlayer soundPlayer, int i, int i2);
    }

    public SoundPlayer() {
        throw new RuntimeException("Stub!");
    }

    public SoundPlayer(String packageName) {
        throw new RuntimeException("Stub!");
    }

    public SoundPlayer(int taskType) {
        throw new RuntimeException("Stub!");
    }

    public boolean playSound(SoundType type) {
        throw new RuntimeException("Stub!");
    }

    public boolean playSound(SoundType type, float volume) {
        throw new RuntimeException("Stub!");
    }

    public final boolean createSound(ToneDescriptor.ToneType type, int durationMs) {
        throw new RuntimeException("Stub!");
    }

    public final boolean createSound(AudioStreamInfo.StreamType streamType, float volume) {
        throw new RuntimeException("Stub!");
    }

    public final int createSound(String path) {
        throw new RuntimeException("Stub!");
    }

    public final int createSound(BaseFileDescriptor baseFileDescriptor) {
        throw new RuntimeException("Stub!");
    }

    public final int createSound(Context context, int resourceId) {
        throw new RuntimeException("Stub!");
    }

    public final int createSound(FileDescriptor fd, long offset, long length) {
        throw new RuntimeException("Stub!");
    }

    public final int createSound(String path, AudioRendererInfo rendererInfo) {
        throw new RuntimeException("Stub!");
    }

    public final boolean deleteSound(int soundId) {
        throw new RuntimeException("Stub!");
    }

    public final boolean play(ToneDescriptor.ToneType toneType, int durationMs) {
        throw new RuntimeException("Stub!");
    }

    public final boolean play() {
        throw new RuntimeException("Stub!");
    }

    public final int play(int soundId) {
        throw new RuntimeException("Stub!");
    }

    public final int play(int soundId, SoundPlayerParameters parameters) {
        throw new RuntimeException("Stub!");
    }

    public final boolean pause() {
        throw new RuntimeException("Stub!");
    }

    public final boolean pause(int taskId) {
        throw new RuntimeException("Stub!");
    }

    public final boolean resume(int taskId) {
        throw new RuntimeException("Stub!");
    }

    public final boolean stop(int taskId) {
        throw new RuntimeException("Stub!");
    }

    public final boolean release() {
        throw new RuntimeException("Stub!");
    }

    public final boolean setVolume(int taskId, AudioVolumes audioVolumes) {
        throw new RuntimeException("Stub!");
    }

    public final boolean setVolume(int taskId, float volume) {
        throw new RuntimeException("Stub!");
    }

    public final boolean setPriority(int taskId, int priority) {
        throw new RuntimeException("Stub!");
    }

    public final boolean setPlaySpeedRate(int taskId, float speedRate) {
        throw new RuntimeException("Stub!");
    }

    public final boolean setLoop(int taskId, int loopNum) {
        throw new RuntimeException("Stub!");
    }

    public final boolean pauseAll() {
        throw new RuntimeException("Stub!");
    }

    public final boolean resumeAll() {
        throw new RuntimeException("Stub!");
    }

    public boolean setOnCreateCompleteListener(OnCreateCompleteListener listener) {
        throw new RuntimeException("Stub!");
    }

    public boolean setOnCreateCompleteListener(OnCreateCompleteListener listener, boolean isDiscarded) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/media/audio/SoundPlayer$AudioVolumes.class */
    public static class AudioVolumes {
        public AudioVolumes() {
            throw new RuntimeException("Stub!");
        }

        public float getFrontLeftVolume() {
            throw new RuntimeException("Stub!");
        }

        public void setFrontLeftVolume(float frontLeftVolume) {
            throw new RuntimeException("Stub!");
        }

        public float getFrontRightVolume() {
            throw new RuntimeException("Stub!");
        }

        public void setFrontRightVolume(float frontRightVolume) {
            throw new RuntimeException("Stub!");
        }

        public float getRearLeftVolume() {
            throw new RuntimeException("Stub!");
        }

        public void setRearLeftVolume(float rearLeftVolume) {
            throw new RuntimeException("Stub!");
        }

        public float getRearRightVolume() {
            throw new RuntimeException("Stub!");
        }

        public void setRearRightVolume(float rearRightVolume) {
            throw new RuntimeException("Stub!");
        }

        public float getCentralVolume() {
            throw new RuntimeException("Stub!");
        }

        public void setCentralVolume(float centralVolume) {
            throw new RuntimeException("Stub!");
        }

        public float getSubwooferVolume() {
            throw new RuntimeException("Stub!");
        }

        public void setSubwooferVolume(float subwooferVolume) {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/media/audio/SoundPlayer$SoundPlayerParameters.class */
    public static class SoundPlayerParameters {
        public static final float NORMAL_SPEED_RATE = 1.0f;
        public static final int NO_LOOP = 0;
        public static final int PLAY_DELAYED_PRIORITY = 1;
        public static final int PLAY_IMMEDIATELY_PRIORITY = 0;

        public SoundPlayerParameters() {
            throw new RuntimeException("Stub!");
        }

        public AudioVolumes getAudioVolumes() {
            throw new RuntimeException("Stub!");
        }

        public void setVolumes(AudioVolumes audioVolumes) {
            throw new RuntimeException("Stub!");
        }

        public int getPriority() {
            throw new RuntimeException("Stub!");
        }

        public void setPriority(int priority) {
            throw new RuntimeException("Stub!");
        }

        public int getLoop() {
            throw new RuntimeException("Stub!");
        }

        public void setLoop(int loop) {
            throw new RuntimeException("Stub!");
        }

        public float getSpeed() {
            throw new RuntimeException("Stub!");
        }

        public void setSpeed(float speed) {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/media/audio/SoundPlayer$SoundType.class */
    public enum SoundType {
        KEY_CLICK,
        NAVIGATION_UP,
        NAVIGATION_DOWN,
        NAVIGATION_LEFT,
        NAVIGATION_RIGHT,
        KEYPRESS_STANDARD,
        KEYPRESS_SPACEBAR,
        KEYPRESS_DELETE,
        KEYPRESS_RETURN,
        KEYPRESS_INVALID;

        public int getTypeValue() {
            throw new RuntimeException("Stub!");
        }
    }
}
