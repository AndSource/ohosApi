package ohos.media.audio;

/* loaded from: ohos2.0.1.95.jar:ohos/media/audio/AudioStreamInfo.class */
public final class AudioStreamInfo {
    public static final int SAMPLE_RATE_FOR_DIRECT_HZ_MAX = 384000;
    public static final int SAMPLE_RATE_HZ_MAX = 192000;
    public static final int SAMPLE_RATE_HZ_MIN = 4000;
    public static final int SAMPLE_RATE_UNSPECIFIED = 4000;

    AudioStreamInfo(EncodingFormat encodingFormat, int sampleRate, ChannelMask channelMask, StreamUsage streamUsage, ContentType contentType, AudioStreamFlag streamFlag) {
        throw new RuntimeException("Stub!");
    }

    public EncodingFormat getEncodingFormat() {
        throw new RuntimeException("Stub!");
    }

    public int getSampleRate() {
        throw new RuntimeException("Stub!");
    }

    public ChannelMask getChannelMask() {
        throw new RuntimeException("Stub!");
    }

    public StreamUsage getUsage() {
        throw new RuntimeException("Stub!");
    }

    public StreamType getStreamType() {
        throw new RuntimeException("Stub!");
    }

    public ContentType getContentType() {
        throw new RuntimeException("Stub!");
    }

    public AudioStreamFlag getAudioStreamFlag() {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }

    public static boolean isValidEncodingFormat(EncodingFormat format) {
        throw new RuntimeException("Stub!");
    }

    public static boolean isValidOutChannelMask(ChannelMask channelMask) {
        throw new RuntimeException("Stub!");
    }

    public static int getChannelCount(ChannelMask mask) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/media/audio/AudioStreamInfo$AudioStreamFlag.class */
    public enum AudioStreamFlag {
        AUDIO_STREAM_FLAG_NONE,
        AUDIO_STREAM_FLAG_AUDIBILITY_ENFORCED,
        AUDIO_STREAM_FLAG_SECURE,
        AUDIO_STREAM_FLAG_SCO,
        AUDIO_STREAM_FLAG_BEACON,
        AUDIO_STREAM_FLAG_HW_AV_SYNC,
        AUDIO_STREAM_FLAG_HW_HOTWORD,
        AUDIO_STREAM_FLAG_BYPASS_INTERRUPTION_POLICY,
        AUDIO_STREAM_FLAG_BYPASS_MUTE,
        AUDIO_STREAM_FLAG_LOW_LATENCY,
        AUDIO_STREAM_FLAG_DEEP_BUFFER,
        AUDIO_STREAM_FLAG_NO_MEDIA_PROJECTION,
        AUDIO_STREAM_FLAG_MUTE_HAPTIC,
        AUDIO_STREAM_FLAG_NO_SYSTEM_CAPTURE,
        AUDIO_STREAM_FLAG_DIRECT_OUTPUT,
        AUDIO_STREAM_FLAG_MAY_DUCK,
        AUDIO_STREAM_FLAG_MAY_RESUME,
        AUDIO_STREAM_FLAG_MAY_WAITING_INTERRUPT;

        public int getValue() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/media/audio/AudioStreamInfo$Builder.class */
    public static class Builder {
        public Builder() {
            throw new RuntimeException("Stub!");
        }

        public Builder encodingFormat(EncodingFormat inputEncodingFormat) {
            throw new RuntimeException("Stub!");
        }

        public Builder sampleRate(int inputSampleRate) {
            throw new RuntimeException("Stub!");
        }

        public Builder channelMask(ChannelMask inputChannelMask) {
            throw new RuntimeException("Stub!");
        }

        public Builder streamUsage(StreamUsage inputStreamUsage) {
            throw new RuntimeException("Stub!");
        }

        public Builder audioStreamFlag(AudioStreamFlag flag) {
            throw new RuntimeException("Stub!");
        }

        public AudioStreamInfo build() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/media/audio/AudioStreamInfo$ChannelMask.class */
    public enum ChannelMask {
        CHANNEL_INVALID,
        CHANNEL_OUT_DEFAULT,
        CHANNEL_OUT_FRONT_LEFT,
        CHANNEL_OUT_FRONT_RIGHT,
        CHANNEL_OUT_FRONT_CENTER,
        CHANNEL_OUT_LOW_FREQUENCY,
        CHANNEL_OUT_BACK_LEFT,
        CHANNEL_OUT_BACK_RIGHT,
        CHANNEL_OUT_FRONT_LEFT_OF_CENTER,
        CHANNEL_OUT_FRONT_RIGHT_OF_CENTER,
        CHANNEL_OUT_BACK_CENTER,
        CHANNEL_OUT_SIDE_LEFT,
        CHANNEL_OUT_SIDE_RIGHT,
        CHANNEL_OUT_TOP_CENTER,
        CHANNEL_OUT_TOP_FRONT_LEFT,
        CHANNEL_OUT_TOP_FRONT_CENTER,
        CHANNEL_OUT_TOP_FRONT_RIGHT,
        CHANNEL_OUT_TOP_BACK_LEFT,
        CHANNEL_OUT_TOP_BACK_CENTER,
        CHANNEL_OUT_TOP_BACK_RIGHT,
        CHANNEL_OUT_MONO,
        CHANNEL_OUT_STEREO,
        CHANNEL_OUT_QUAD,
        CHANNEL_OUT_QUAD_SIDE,
        CHANNEL_OUT_SURROUND,
        CHANNEL_OUT_5POINT1,
        CHANNEL_OUT_5POINT1_SIDE,
        CHANNEL_OUT_7POINT1,
        CHANNEL_IN_MONO,
        CHANNEL_IN_STEREO;

        public int getValue() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/media/audio/AudioStreamInfo$ContentType.class */
    public enum ContentType {
        CONTENT_TYPE_UNKNOWN,
        CONTENT_TYPE_SPEECH,
        CONTENT_TYPE_MUSIC,
        CONTENT_TYPE_MOVIE,
        CONTENT_TYPE_SONIFICATION;

        public int getValue() {
            throw new RuntimeException("Stub!");
        }

        public static ContentType getEnum(int value) {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/media/audio/AudioStreamInfo$EncodingFormat.class */
    public enum EncodingFormat {
        ENCODING_INVALID,
        ENCODING_DEFAULT,
        ENCODING_PCM_16BIT,
        ENCODING_PCM_8BIT,
        ENCODING_PCM_FLOAT,
        ENCODING_MP3;

        public int getValue() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/media/audio/AudioStreamInfo$StreamType.class */
    public enum StreamType {
        STREAM_TYPE_VOICE_CALL,
        STREAM_TYPE_SYSTEM,
        STREAM_TYPE_RING,
        STREAM_TYPE_MUSIC,
        STREAM_TYPE_ALARM,
        STREAM_TYPE_NOTIFICATION,
        STREAM_TYPE_DTMF,
        STREAM_TYPE_ACCESSIBILITY;

        public int getValue() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/media/audio/AudioStreamInfo$StreamUsage.class */
    public enum StreamUsage {
        STREAM_USAGE_UNKNOWN,
        STREAM_USAGE_MEDIA,
        STREAM_USAGE_VOICE_COMMUNICATION,
        STREAM_USAGE_VOICE_COMMUNICATION_SIGNALLING,
        STREAM_USAGE_ALARM,
        STREAM_USAGE_NOTIFICATION,
        STREAM_USAGE_NOTIFICATION_RINGTONE,
        STREAM_USAGE_NOTIFICATION_COMMUNICATION_REQUEST,
        STREAM_USAGE_NOTIFICATION_COMMUNICATION_INSTANT,
        STREAM_USAGE_NOTIFICATION_COMMUNICATION_DELAYED,
        STREAM_USAGE_NOTIFICATION_EVENT,
        STREAM_USAGE_ASSISTANCE_ACCESSIBILITY,
        STREAM_USAGE_ASSISTANCE_NAVIGATION_GUIDANCE,
        STREAM_USAGE_ASSISTANCE_SONIFICATION,
        STREAM_USAGE_GAME,
        STREAM_USAGE_VIRTUAL_SOURCE,
        STREAM_USAGE_ASSISTANT,
        STREAM_USAGE_TTS;

        public int getValue() {
            throw new RuntimeException("Stub!");
        }

        public static StreamUsage getEnum(int value) {
            throw new RuntimeException("Stub!");
        }
    }
}
