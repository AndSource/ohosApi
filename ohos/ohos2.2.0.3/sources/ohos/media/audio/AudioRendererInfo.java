package ohos.media.audio;

/* loaded from: ohos2.2.0.3.jar:ohos/media/audio/AudioRendererInfo.class */
public final class AudioRendererInfo {
    public static final int SESSION_ID_UNSPECIFIED = 0;

    AudioRendererInfo(AudioStreamInfo audioStreamInfo, int sessionID, long bufferSizeInBytes, boolean isOffload, AudioStreamOutputFlag outputFlag, String distributedDeviceId, int deviceId) {
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

    public boolean isOffload() {
        throw new RuntimeException("Stub!");
    }

    public AudioStreamOutputFlag getAudioStreamOutputFlag() {
        throw new RuntimeException("Stub!");
    }

    public int getDeviceId() {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/media/audio/AudioRendererInfo$AudioStreamOutputFlag.class */
    public enum AudioStreamOutputFlag {
        AUDIO_STREAM_OUTPUT_FLAG_NONE,
        AUDIO_STREAM_OUTPUT_FLAG_DIRECT,
        AUDIO_STREAM_OUTPUT_FLAG_PRIMARY,
        AUDIO_STREAM_OUTPUT_FLAG_FAST,
        AUDIO_STREAM_OUTPUT_FLAG_DEEP_BUFFER,
        AUDIO_STREAM_OUTPUT_FLAG_COMPRESS_OFFLOAD,
        AUDIO_STREAM_OUTPUT_FLAG_NONE_BLOCKING,
        AUDIO_STREAM_OUTPUT_FLAG_HW_AV_SYNC,
        AUDIO_STREAM_OUTPUT_FLAG_TTS,
        AUDIO_STREAM_OUTPUT_FLAG_RAW,
        AUDIO_STREAM_OUTPUT_FLAG_SYNC,
        AUDIO_STREAM_OUTPUT_FLAG_IEC958_NONAUDIO,
        AUDIO_STREAM_OUTPUT_FLAG_DIRECT_PCM,
        AUDIO_STREAM_OUTPUT_FLAG_MMAP_NOIRQ,
        AUDIO_STREAM_OUTPUT_FLAG_VOIP_RX,
        AUDIO_STREAM_OUTPUT_FLAG_INCALL_MUSIC;

        public static AudioStreamOutputFlag valueOf(int value) {
            throw new RuntimeException("Stub!");
        }

        public int getOutputFlag() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/media/audio/AudioRendererInfo$Builder.class */
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

        public Builder deviceId(int id) {
            throw new RuntimeException("Stub!");
        }

        public Builder bufferSizeInBytes(long bufferSizeInBytes) {
            throw new RuntimeException("Stub!");
        }

        public Builder isOffload(boolean isOffload) {
            throw new RuntimeException("Stub!");
        }

        public Builder audioStreamOutputFlag(AudioStreamOutputFlag outputFlag) {
            throw new RuntimeException("Stub!");
        }

        public AudioRendererInfo build() {
            throw new RuntimeException("Stub!");
        }
    }
}
