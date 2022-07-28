package ohos.media.photokit.metadata;

import java.io.FileDescriptor;
import java.util.List;
import java.util.Map;
import ohos.app.Context;
import ohos.media.image.PixelMap;
import ohos.media.photokit.common.PixelMapConfigs;
import ohos.utils.net.Uri;

/* loaded from: ohos2.2.0.3.jar:ohos/media/photokit/metadata/AVMetadataHelper.class */
public class AVMetadataHelper implements AutoCloseable {
    public static final int AV_KEY_ALBUM = 1;
    public static final int AV_KEY_ALBUMARTIST = 13;
    public static final int AV_KEY_ARTIST = 2;
    public static final int AV_KEY_AUTHOR = 3;
    public static final int AV_KEY_BITRATE = 20;
    public static final int AV_KEY_BITS_PER_SAMPLE = 39;
    public static final int AV_KEY_CAPTURE_FRAMERATE = 25;
    public static final int AV_KEY_CD_TRACK_NUMBER = 0;
    public static final int AV_KEY_COLOR_RANGE = 37;
    public static final int AV_KEY_COLOR_STANDARD = 35;
    public static final int AV_KEY_COLOR_TRANSFER = 36;
    public static final int AV_KEY_COMPILATION = 15;
    public static final int AV_KEY_COMPOSER = 4;
    public static final int AV_KEY_DATE = 5;
    public static final int AV_KEY_DISC_NUMBER = 14;
    public static final int AV_KEY_DURATION = 9;
    public static final int AV_KEY_EXIF_LENGTH = 34;
    public static final int AV_KEY_EXIF_OFFSET = 33;
    public static final int AV_KEY_GENRE = 6;
    public static final int AV_KEY_HAS_AUDIO = 16;
    public static final int AV_KEY_HAS_IMAGE = 26;
    public static final int AV_KEY_HAS_VIDEO = 17;
    public static final int AV_KEY_IMAGE_COUNT = 27;
    public static final int AV_KEY_IMAGE_HEIGHT = 30;
    public static final int AV_KEY_IMAGE_PRIMARY = 28;
    public static final int AV_KEY_IMAGE_ROTATION = 31;
    public static final int AV_KEY_IMAGE_WIDTH = 29;
    public static final int AV_KEY_IS_DRM = 22;
    public static final int AV_KEY_LOCATION = 23;
    public static final int AV_KEY_MIMETYPE = 12;
    public static final int AV_KEY_NUM_TRACKS = 10;
    public static final int AV_KEY_SAMPLERATE = 38;
    public static final int AV_KEY_TIMED_TEXT_LANGUAGES = 21;
    public static final int AV_KEY_TITLE = 7;
    public static final int AV_KEY_VIDEO_FRAME_COUNT = 32;
    public static final int AV_KEY_VIDEO_HEIGHT = 19;
    public static final int AV_KEY_VIDEO_ROTATION = 24;
    public static final int AV_KEY_VIDEO_WIDTH = 18;
    public static final int AV_KEY_WRITER = 11;
    public static final int AV_KEY_YEAR = 8;
    public static final int QUERY_OPTION_ARGB8888 = 5;
    public static final int QUERY_OPTION_CLOSEST = 3;
    public static final int QUERY_OPTION_CLOSEST_SYNC = 2;
    public static final int QUERY_OPTION_NEXT_SYNC = 1;
    public static final int QUERY_OPTION_PREVIOUS_SYNC = 0;

    public AVMetadataHelper() {
        throw new RuntimeException("Stub!");
    }

    public boolean setSource(String path) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSource(FileDescriptor fd) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSource(FileDescriptor fd, long offset, long length) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSource(String uri, Map<String, String> headers) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSource(Context context, Uri uri) {
        throw new RuntimeException("Stub!");
    }

    public String resolveMetadata(int keyCode) {
        throw new RuntimeException("Stub!");
    }

    public PixelMap fetchVideoScaledPixelMapByTime(long timeUs, int option, int dstWidth, int dstHeight) {
        throw new RuntimeException("Stub!");
    }

    public PixelMap fetchVideoPixelMapByTime(long timeUs, int option) {
        throw new RuntimeException("Stub!");
    }

    public PixelMap fetchVideoPixelMapByTime(long timeUs) {
        throw new RuntimeException("Stub!");
    }

    public PixelMap fetchVideoPixelMapByTime() {
        throw new RuntimeException("Stub!");
    }

    public byte[] resolveImage() {
        throw new RuntimeException("Stub!");
    }

    public PixelMap fetchVideoPixelMapByIndex(int frameIndex, PixelMapConfigs configs) {
        throw new RuntimeException("Stub!");
    }

    public PixelMap fetchVideoPixelMapByIndex(int frameIndex) {
        throw new RuntimeException("Stub!");
    }

    public List<PixelMap> fetchVideoPixelMapsByIndex(int frameIndex, int numFrames, PixelMapConfigs configs) {
        throw new RuntimeException("Stub!");
    }

    public List<PixelMap> fetchVideoPixelMapsByIndex(int frameIndex, int numFrames) {
        throw new RuntimeException("Stub!");
    }

    public PixelMap fetchImagePixelMapByIndex(int imageIndex, PixelMapConfigs configs) {
        throw new RuntimeException("Stub!");
    }

    public PixelMap fetchImagePixelMapByIndex(int imageIndex) {
        throw new RuntimeException("Stub!");
    }

    public PixelMap fetchImagePrimaryPixelMap(PixelMapConfigs configs) {
        throw new RuntimeException("Stub!");
    }

    public PixelMap fetchImagePrimaryPixelMap() {
        throw new RuntimeException("Stub!");
    }

    public void release() {
        throw new RuntimeException("Stub!");
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        throw new RuntimeException("Stub!");
    }
}
