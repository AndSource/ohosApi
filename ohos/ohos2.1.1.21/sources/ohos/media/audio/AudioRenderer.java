package ohos.media.audio;

import java.nio.ByteBuffer;
import ohos.eventhandler.EventHandler;
import ohos.media.audio.AudioStreamInfo;

/* loaded from: ohos2.1.1.21.jar:ohos/media/audio/AudioRenderer.class */
public class AudioRenderer {
    public static final int ERROR = -1;
    public static final int ERROR_INVALID_OPERATION = -2;
    public static final float MAX_PLAYBACK_SPEED = 2.0f;
    public static final float MIN_PLAYBACK_SPEED = 0.5f;
    public static final int RENDERER_SESSION_ID_NONE = 0;
    public static final int SUCCESS = 0;

    public AudioRenderer(AudioRendererInfo audioRendererInfo, PlayMode pm) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public AudioRenderer(AudioRendererInfo audioRendererInfo, PlayMode pm, AudioDeviceDescriptor outputDevice) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public State getState() {
        throw new RuntimeException("Stub!");
    }

    public boolean start() {
        throw new RuntimeException("Stub!");
    }

    public boolean pause() {
        throw new RuntimeException("Stub!");
    }

    public boolean stop() {
        throw new RuntimeException("Stub!");
    }

    public boolean release() {
        throw new RuntimeException("Stub!");
    }

    public static int getMinBufferSize(int sampleRate, AudioStreamInfo.EncodingFormat format, AudioStreamInfo.ChannelMask channelMask) {
        throw new RuntimeException("Stub!");
    }

    public boolean write(short[] data, int offset, int size) {
        throw new RuntimeException("Stub!");
    }

    public boolean write(byte[] data, int offset, int size) {
        throw new RuntimeException("Stub!");
    }

    public boolean write(float[] data, int offset, int size) {
        throw new RuntimeException("Stub!");
    }

    public boolean write(ByteBuffer data, int size) {
        throw new RuntimeException("Stub!");
    }

    public boolean setVolume(float vol) {
        throw new RuntimeException("Stub!");
    }

    public boolean setVolume(ChannelVolume channelVolume) {
        throw new RuntimeException("Stub!");
    }

    public boolean setPosition(int position) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSpeed(float speed) {
        throw new RuntimeException("Stub!");
    }

    public boolean setPlaybackSpeed(SpeedPara speedPara) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSampleRate(int sampleRateInHz) {
        throw new RuntimeException("Stub!");
    }

    public boolean setOutputDevice(AudioDeviceDescriptor info) {
        throw new RuntimeException("Stub!");
    }

    public AudioDeviceDescriptor getCurrentDevice() {
        throw new RuntimeException("Stub!");
    }

    public int getRendererSessionId() {
        throw new RuntimeException("Stub!");
    }

    public int getSampleRate() {
        throw new RuntimeException("Stub!");
    }

    public int getPosition() {
        throw new RuntimeException("Stub!");
    }

    public Timestamp getAudioTime() {
        throw new RuntimeException("Stub!");
    }

    public boolean flush() {
        throw new RuntimeException("Stub!");
    }

    public SpeedPara getPlaybackSpeed() {
        throw new RuntimeException("Stub!");
    }

    public static float getMaxVolume() {
        throw new RuntimeException("Stub!");
    }

    public static float getMinVolume() {
        throw new RuntimeException("Stub!");
    }

    public AudioStreamInfo.StreamType getStreamType() {
        throw new RuntimeException("Stub!");
    }

    public AudioRendererInfo getRendererInfo() {
        throw new RuntimeException("Stub!");
    }

    public int getBufferFrameSize() {
        throw new RuntimeException("Stub!");
    }

    public boolean setSendEffect(int effectId) {
        throw new RuntimeException("Stub!");
    }

    public AudioStreamInfo.ChannelMask getAudioChannel() {
        throw new RuntimeException("Stub!");
    }

    public int getBufferUnderflowTimes() {
        throw new RuntimeException("Stub!");
    }

    public void setSendEffectLevel(float level) {
        throw new RuntimeException("Stub!");
    }

    public void setFramePositionObserver(FramePositionObserver observer, int position, EventHandler handler) {
        throw new RuntimeException("Stub!");
    }

    public void setFrameIntervalObserver(FrameIntervalObserver observer, int interval, EventHandler handler) {
        throw new RuntimeException("Stub!");
    }

    public boolean duckVolume() {
        throw new RuntimeException("Stub!");
    }

    public boolean unduckVolume() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/media/audio/AudioRenderer$ChannelVolume.class */
    public static class ChannelVolume {
        public static final float VOLUME_MAX = 1.0f;
        public static final float VOLUME_MIN = 0.0f;

        public ChannelVolume(float inputLeftVolume, float inputRightVolume) {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/media/audio/AudioRenderer$PlayMode.class */
    public enum PlayMode {
        MODE_STATIC,
        MODE_STREAM;

        public int getModeValue() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/media/audio/AudioRenderer$SpeedPara.class */
    public static class SpeedPara {
        SpeedPara(float speed, float pitch) {
            throw new RuntimeException("Stub!");
        }

        public float getSpeed() {
            throw new RuntimeException("Stub!");
        }

        public float getPitch() {
            throw new RuntimeException("Stub!");
        }

        /* loaded from: ohos2.1.1.21.jar:ohos/media/audio/AudioRenderer$SpeedPara$Builder.class */
        public static class Builder {
            public Builder() {
                throw new RuntimeException("Stub!");
            }

            public Builder speed(float speed) {
                throw new RuntimeException("Stub!");
            }

            public Builder pitch(float pitch) {
                throw new RuntimeException("Stub!");
            }

            public SpeedPara build() {
                throw new RuntimeException("Stub!");
            }
        }
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/media/audio/AudioRenderer$State.class */
    public enum State {
        STATE_UNINITIALIZED,
        STATE_INITIALIZED,
        STATE_BUFFER_PREPARED,
        STATE_BUFFER_PREPARED_ERROR,
        STATE_PLAYING,
        STATE_PAUSED,
        STATE_STOP;

        public int getValue() {
            throw new RuntimeException("Stub!");
        }
    }
}
