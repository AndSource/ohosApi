package ohos.media.audio;

/* loaded from: ohos2.0.1.95.jar:ohos/media/audio/AudioCapturerInfo.class */
public final class AudioCapturerInfo {
    public static final int SESSION_ID_UNSPECIFIED = 0;

    AudioCapturerInfo(AudioStreamInfo audioStreamInfo, int sessionID, long bufferSizeInBytes, AudioInputSource inputSource, String distributedDeviceId) {
        throw new RuntimeException("Stub!");
    }

    public AudioStreamInfo getAudioStreamInfo() {
        throw new RuntimeException("Stub!");
    }

    public int getSessionID() {
        throw new RuntimeException("Stub!");
    }

    public long getBufferSizeInBytes() {
        throw new RuntimeException("Stub!");
    }

    public AudioInputSource getInputSource() {
        throw new RuntimeException("Stub!");
    }

    public String getDistributedDeviceId() {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/media/audio/AudioCapturerInfo$AudioInputSource.class */
    public enum AudioInputSource {
        AUDIO_INPUT_SOURCE_INVALID,
        AUDIO_INPUT_SOURCE_DEFAULT,
        AUDIO_INPUT_SOURCE_MIC,
        AUDIO_INPUT_SOURCE_VOICE_UPLINK,
        AUDIO_INPUT_SOURCE_VOICE_DOWNLINK,
        AUDIO_INPUT_SOURCE_VOICE_CALL,
        AUDIO_INPUT_SOURCE_CAMCORDER,
        AUDIO_INPUT_SOURCE_VOICE_RECOGNITION,
        AUDIO_INPUT_SOURCE_VOICE_COMMUNICATION,
        AUDIO_INPUT_SOURCE_REMOTE_SUBMIX,
        AUDIO_INPUT_SOURCE_UNPROCESSED,
        AUDIO_INPUT_SOURCE_VOICE_PERFORMANCE,
        AUDIO_INPUT_SOURCE_ECHO_REFERENCE,
        AUDIO_INPUT_SOURCE_FM_TUNER,
        AUDIO_INPUT_SOURCE_HOTWORD,
        AUDIO_INPUT_SOURCE_REMOTE_SUBMIX_EXTEND;

        public int getValue() {
            throw new RuntimeException("Stub!");
        }

        public static AudioInputSource getEnum(int value) {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/media/audio/AudioCapturerInfo$Builder.class */
    public static class Builder {
        public Builder() {
            throw new RuntimeException("Stub!");
        }

        public Builder audioStreamInfo(AudioStreamInfo audioStreamInfo) {
            throw new RuntimeException("Stub!");
        }

        public Builder sessionID(int sessionID) {
            throw new RuntimeException("Stub!");
        }

        public Builder bufferSizeInBytes(long bufferSizeInBytes) {
            throw new RuntimeException("Stub!");
        }

        public Builder audioInputSource(AudioInputSource inputSource) {
            throw new RuntimeException("Stub!");
        }

        public Builder distributedDeviceId(String distributedDeviceId) {
            throw new RuntimeException("Stub!");
        }

        public AudioCapturerInfo build() {
            throw new RuntimeException("Stub!");
        }
    }
}
