package ohos.media.recorder;

/* loaded from: ohos2.0.1.95.jar:ohos/media/recorder/RecorderProfile.class */
public class RecorderProfile {
    public static final int QUALITY_LEVEL_1080P = 6;
    public static final int QUALITY_LEVEL_2160P = 8;
    public static final int QUALITY_LEVEL_2K = 12;
    public static final int QUALITY_LEVEL_480P = 4;
    public static final int QUALITY_LEVEL_4KDCI = 10;
    public static final int QUALITY_LEVEL_720P = 5;
    public static final int QUALITY_LEVEL_CIF = 3;
    public static final int QUALITY_LEVEL_HIGH = 1;
    public static final int QUALITY_LEVEL_HIGH_SPEED_1080P = 2004;
    public static final int QUALITY_LEVEL_HIGH_SPEED_2160P = 2005;
    public static final int QUALITY_LEVEL_HIGH_SPEED_480P = 2002;
    public static final int QUALITY_LEVEL_HIGH_SPEED_4KDCI = 2008;
    public static final int QUALITY_LEVEL_HIGH_SPEED_720P = 2003;
    public static final int QUALITY_LEVEL_HIGH_SPEED_CIF = 2006;
    public static final int QUALITY_LEVEL_HIGH_SPEED_HIGH = 2001;
    public static final int QUALITY_LEVEL_HIGH_SPEED_LOW = 2000;
    public static final int QUALITY_LEVEL_HIGH_SPEED_VGA = 2007;
    public static final int QUALITY_LEVEL_LOW = 0;
    public static final int QUALITY_LEVEL_QCIF = 2;
    public static final int QUALITY_LEVEL_QHD = 11;
    public static final int QUALITY_LEVEL_QVGA = 7;
    public static final int QUALITY_LEVEL_TIME_LAPSE_1080P = 1006;
    public static final int QUALITY_LEVEL_TIME_LAPSE_2160P = 1008;
    public static final int QUALITY_LEVEL_TIME_LAPSE_2K = 1012;
    public static final int QUALITY_LEVEL_TIME_LAPSE_480P = 1004;
    public static final int QUALITY_LEVEL_TIME_LAPSE_4KDCI = 1010;
    public static final int QUALITY_LEVEL_TIME_LAPSE_720P = 1005;
    public static final int QUALITY_LEVEL_TIME_LAPSE_CIF = 1003;
    public static final int QUALITY_LEVEL_TIME_LAPSE_HIGH = 1001;
    public static final int QUALITY_LEVEL_TIME_LAPSE_LOW = 1000;
    public static final int QUALITY_LEVEL_TIME_LAPSE_QCIF = 1002;
    public static final int QUALITY_LEVEL_TIME_LAPSE_QHD = 1011;
    public static final int QUALITY_LEVEL_TIME_LAPSE_QVGA = 1007;
    public static final int QUALITY_LEVEL_TIME_LAPSE_VGA = 1009;
    public static final int QUALITY_LEVEL_VGA = 9;
    public int aBitRate;
    public int aChannels;
    public int aCodec;
    public int aSampleRate;
    public int durationTime;
    public int fileFormat;
    public int qualityLevel;
    public int vBitRate;
    public int vCodec;
    public int vFrameHeight;
    public int vFrameRate;
    public int vFrameWidth;

    public RecorderProfile(int qualityLevel, int durationTime, int fileFormat, int aCodec, int aBitRate, int aSampleRate, int aChannels, int vCodec, int vFrameRate, int vHeight, int vWidth, int vBitRate) {
        throw new RuntimeException("Stub!");
    }

    public static RecorderProfile getParameter(String cameraId, int qualityLevel) {
        throw new RuntimeException("Stub!");
    }

    public static boolean isProfile(int cameraId, int qualityLevel) {
        throw new RuntimeException("Stub!");
    }
}
