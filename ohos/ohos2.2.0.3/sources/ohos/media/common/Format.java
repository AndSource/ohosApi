package ohos.media.common;

import java.util.HashMap;
import java.util.Map;

/* loaded from: ohos2.2.0.3.jar:ohos/media/common/Format.class */
public class Format {
    public static final String AAC_PROFILE = "aac-profile";
    public static final String AUDIO_AAC = "audio/mp4a-latm";
    public static final String AUDIO_AC3 = "audio/ac3";
    public static final String AUDIO_AMR_NB = "audio/3gpp";
    public static final String AUDIO_AMR_WB = "audio/amr-wb";
    public static final String AUDIO_EAC3 = "audio/eac3";
    public static final String AUDIO_FLAC = "audio/flac";
    public static final String AUDIO_G711_ALAW = "audio/g711-alaw";
    public static final String AUDIO_G711_MLAW = "audio/g711-mlaw";
    public static final String AUDIO_MPEG = "audio/mpeg";
    public static final String AUDIO_OPUS = "audio/opus";
    public static final String AUDIO_RAW = "audio/raw";
    public static final String AUDIO_VORBIS = "audio/vorbis";
    public static final String BITRATE_MODE = "bitrate-mode";
    public static final String BIT_RATE = "bitrate";
    public static final String CAPTURE_RATE = "capture-rate";
    public static final String CHANNEL = "channel-count";
    public static final String COLOR_MODEL = "color-format";
    public static final String DURATION = "durationUs";
    public static final String FRAME_INTERVAL = "i-frame-interval";
    public static final String FRAME_RATE = "frame-rate";
    public static final String HEIGHT = "height";
    public static final String IS_AUTOSELECT = "is-autoselect";
    public static final String IS_DEFAULT = "is-default";
    public static final String IS_FORCED_SUBTITLE = "is-forced-subtitle";
    public static final String KEY_BIT_RATE_SCOPE = "bitrate.scope";
    public static final String KEY_FRAME_RATE_SCOPE = "frame-rate.scope";
    public static final String KEY_HEIGHT_SCOPE = "height.scope";
    public static final String KEY_SAMPLE_RATE_LIST = "sample-rate.list";
    public static final String KEY_SAMPLE_RATE_SCOPE = "sample-rate.scope";
    public static final String KEY_WIDTH_SCOPE = "width.scope";
    public static final String LANGUAGE = "language";
    public static final String MAX_HEIGHT = "max-height";
    public static final String MAX_INPUT_SIZE = "max-input-size";
    public static final String MAX_WIDTH = "max-width";
    public static final String MIME = "mime";
    public static final String MIME_AUDIO_MSGSM = "audio/gsm";
    public static final String MIME_VIDEO_AV1 = "video/av01";
    public static final String SAMPLE_RATE = "sample-rate";
    public static final String VIDEO_AVC = "video/avc";
    public static final String VIDEO_DOLBY_VISION = "video/dolby-vision";
    public static final String VIDEO_H263 = "video/3gpp";
    public static final String VIDEO_HEVC = "video/hevc";
    public static final String VIDEO_MPEG2 = "video/mpeg2";
    public static final String VIDEO_MPEG4 = "video/mp4v-es";
    public static final String VIDEO_RAW = "video/raw";
    public static final String VIDEO_VP8 = "video/x-vnd.on2.vp8";
    public static final String VIDEO_VP9 = "video/x-vnd.on2.vp9";
    public static final String WIDTH = "width";

    public Format() {
        throw new RuntimeException("Stub!");
    }

    public Format(HashMap<String, Object> nativeMap) {
        throw new RuntimeException("Stub!");
    }

    public Format(Map<String, Object> map) {
        throw new RuntimeException("Stub!");
    }

    public HashMap<String, Object> getFormatMap() {
        throw new RuntimeException("Stub!");
    }

    public void putIntValue(String key, int value) {
        throw new RuntimeException("Stub!");
    }

    public void putLongValue(String key, long value) {
        throw new RuntimeException("Stub!");
    }

    public void putFloatValue(String key, float value) {
        throw new RuntimeException("Stub!");
    }

    public void putDoubleValue(String key, double value) {
        throw new RuntimeException("Stub!");
    }

    public void putStringValue(String key, String value) {
        throw new RuntimeException("Stub!");
    }

    public void setObjectFormat(String key, Object value) {
        throw new RuntimeException("Stub!");
    }

    public void putObjectValue(String key, Object value) {
        throw new RuntimeException("Stub!");
    }

    public boolean hasKey(String key) {
        throw new RuntimeException("Stub!");
    }

    public int getIntValue(String key) {
        throw new RuntimeException("Stub!");
    }

    public long getLongValue(String key) {
        throw new RuntimeException("Stub!");
    }

    public float getFloatValue(String key) {
        throw new RuntimeException("Stub!");
    }

    public double getDoubleValue(String key) {
        throw new RuntimeException("Stub!");
    }

    public String getStringValue(String key) {
        throw new RuntimeException("Stub!");
    }

    public Object getObjectValue(String key) {
        throw new RuntimeException("Stub!");
    }

    public FormatArrays getFormatArrays() {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/media/common/Format$FormatArrays.class */
    public static class FormatArrays {
        public String[] keys;
        public Object[] values;

        public FormatArrays() {
            throw new RuntimeException("Stub!");
        }
    }
}
