package ohos.media.audio;

import java.nio.ByteBuffer;
import java.util.Set;
import java.util.UUID;
import ohos.eventhandler.EventHandler;
import ohos.media.audio.AudioStreamInfo;
import ohos.media.audio.Timestamp;

/* loaded from: ohos2.0.1.95.jar:ohos/media/audio/AudioCapturer.class */
public class AudioCapturer {
    public static final int CAPTURER_SESSION_ID_NONE = 0;
    public static final int ERROR = -1;
    public static final int ERROR_BAD_VALUE = -1;
    public static final int ERROR_DEAD_OBJECT = -3;
    public static final int ERROR_INVALID_OPERATION = -2;
    public static final int INPUT_DEVICE_ID_NONE = 0;
    public static final int SUCCESS = 0;

    public AudioCapturer(AudioCapturerInfo audioCapturerInfo, AudioDeviceDescriptor devInfo) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public AudioCapturer(AudioCapturerInfo audioCapturerInfo) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public static int getMinBufferSize(int sampleRate, int channelCount, int audioFormat) {
        throw new RuntimeException("Stub!");
    }

    public boolean addSoundEffect(UUID type, String packageName) {
        throw new RuntimeException("Stub!");
    }

    public Set<SoundEffect> getSoundEffects() {
        throw new RuntimeException("Stub!");
    }

    public int getCapturerSessionId() {
        throw new RuntimeException("Stub!");
    }

    public AudioDeviceDescriptor getSelectedDevice() {
        throw new RuntimeException("Stub!");
    }

    public AudioDeviceDescriptor getCurrentDevice() {
        throw new RuntimeException("Stub!");
    }

    public State getState() {
        throw new RuntimeException("Stub!");
    }

    public AudioStreamInfo.EncodingFormat getEncodingFormat() {
        throw new RuntimeException("Stub!");
    }

    public int getChannelCount() {
        throw new RuntimeException("Stub!");
    }

    public int getSampleRate() {
        throw new RuntimeException("Stub!");
    }

    public int getBufferFrameCount() {
        throw new RuntimeException("Stub!");
    }

    public int getAudioInputSource() {
        throw new RuntimeException("Stub!");
    }

    public AudioStreamInfo.ChannelMask getAudioChannel() {
        throw new RuntimeException("Stub!");
    }

    public boolean getAudioTime(Timestamp timestamp, Timestamp.Timebase timebase) {
        throw new RuntimeException("Stub!");
    }

    public final boolean start() {
        throw new RuntimeException("Stub!");
    }

    public int read(byte[] data, int offset, int size) {
        throw new RuntimeException("Stub!");
    }

    public int read(byte[] data, int offset, int size, boolean isBlocking) {
        throw new RuntimeException("Stub!");
    }

    public int read(short[] data, int offsetInShorts, int sizeInShorts) {
        throw new RuntimeException("Stub!");
    }

    public int read(short[] data, int offsetInShorts, int sizeInShorts, boolean isBlocking) {
        throw new RuntimeException("Stub!");
    }

    public int read(float[] data, int offsetInFloats, int sizeInFloats) {
        throw new RuntimeException("Stub!");
    }

    public int read(float[] data, int offsetInFloats, int sizeInFloats, boolean isBlocking) {
        throw new RuntimeException("Stub!");
    }

    public int read(ByteBuffer buffer, int sizeInBytes) {
        throw new RuntimeException("Stub!");
    }

    public int read(ByteBuffer buffer, int sizeInBytes, boolean isBlocking) {
        throw new RuntimeException("Stub!");
    }

    public final boolean stop() {
        throw new RuntimeException("Stub!");
    }

    public final boolean release() {
        throw new RuntimeException("Stub!");
    }

    public void setFramePositionObserver(FramePositionObserver observer, int position, EventHandler handler) {
        throw new RuntimeException("Stub!");
    }

    public void setFrameIntervalObserver(FrameIntervalObserver observer, int interval, EventHandler handler) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/media/audio/AudioCapturer$State.class */
    public enum State {
        STATE_UNINITIALIZED,
        STATE_INITIALIZED,
        STATE_RECORDING,
        STATE_STOPPED;

        public int getValue() {
            throw new RuntimeException("Stub!");
        }
    }
}
