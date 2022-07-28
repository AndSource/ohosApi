package ohos.media.image.common;

/* loaded from: ohos2.2.0.3.jar:ohos/media/image/common/ImageFormat.class */
public final class ImageFormat {
    public static final int H264 = 6;
    public static final int H265 = 7;
    public static final int JPEG = 3;
    public static final int NV21 = 1;
    public static final int RAW10 = 4;
    public static final int RAW16 = 5;
    public static final int UNKNOWN = 0;
    public static final int YUV420_888 = 2;

    ImageFormat() {
        throw new RuntimeException("Stub!");
    }

    public static int getBitsNumberPerPixel(int format) {
        throw new RuntimeException("Stub!");
    }

    public static int getComponentNumber(int format) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/media/image/common/ImageFormat$ComponentType.class */
    public enum ComponentType {
        YUV_Y,
        YUV_U,
        YUV_V,
        JPEG,
        RAW10,
        RAW16,
        H264,
        H265;

        public static ComponentType valueOf(int value) {
            throw new RuntimeException("Stub!");
        }
    }
}
