package ohos.media.image;

import java.io.File;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.concurrent.Callable;
import ohos.global.resource.RawFileDescriptor;
import ohos.media.image.common.AllocatorType;
import ohos.media.image.common.ColorSpace;
import ohos.media.image.common.DecodeEvent;
import ohos.media.image.common.ImageInfo;
import ohos.media.image.common.MemoryUsagePreference;
import ohos.media.image.common.PixelFormat;
import ohos.media.image.common.Rect;
import ohos.media.image.common.Size;

/* loaded from: ohos2.0.1.95.jar:ohos/media/image/ImageSource.class */
public class ImageSource {

    /* loaded from: ohos2.0.1.95.jar:ohos/media/image/ImageSource$DecodeEventListener.class */
    public interface DecodeEventListener {
        void onDecodeEvent(ImageSource imageSource, DecodeEvent decodeEvent);
    }

    ImageSource(long nativePtr) {
        throw new RuntimeException("Stub!");
    }

    public static HashSet<String> getSupportedFormats() {
        throw new RuntimeException("Stub!");
    }

    public void setDecodeEventListener(DecodeEventListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void setMemoryUsagePreference(MemoryUsagePreference preference) {
        throw new RuntimeException("Stub!");
    }

    public static ImageSource create(InputStream is, SourceOptions opts) {
        throw new RuntimeException("Stub!");
    }

    public static ImageSource create(byte[] data, SourceOptions opts) {
        throw new RuntimeException("Stub!");
    }

    public static ImageSource create(ByteBuffer data, SourceOptions opts) {
        throw new RuntimeException("Stub!");
    }

    public static ImageSource create(Callable<RawFileDescriptor> callable, SourceOptions opts) {
        throw new RuntimeException("Stub!");
    }

    public static ImageSource create(byte[] data, int offset, int length, SourceOptions opts) {
        throw new RuntimeException("Stub!");
    }

    public static ImageSource create(String pathName, SourceOptions opts) {
        throw new RuntimeException("Stub!");
    }

    public static ImageSource create(File file, SourceOptions opts) {
        throw new RuntimeException("Stub!");
    }

    public static ImageSource create(FileDescriptor fd, SourceOptions opts) {
        throw new RuntimeException("Stub!");
    }

    public static ImageSource createIncrementalSource(SourceOptions opts) {
        throw new RuntimeException("Stub!");
    }

    public static ImageSource createIncrementalSource(IncrementalSourceOptions opts) {
        throw new RuntimeException("Stub!");
    }

    public PixelMap createPixelmap(DecodingOptions opts) {
        throw new RuntimeException("Stub!");
    }

    public PixelMap createPixelmap(int index, DecodingOptions opts) {
        throw new RuntimeException("Stub!");
    }

    public PixelMap createThumbnailPixelmap(DecodingOptions opts, boolean allowFromImage) {
        throw new RuntimeException("Stub!");
    }

    public boolean updateData(byte[] data, boolean isFinal) {
        throw new RuntimeException("Stub!");
    }

    public boolean updateData(byte[] data, int offset, int length, boolean isFinal) {
        throw new RuntimeException("Stub!");
    }

    public ImageInfo getImageInfo() {
        throw new RuntimeException("Stub!");
    }

    public ImageInfo getImageInfo(int index) {
        throw new RuntimeException("Stub!");
    }

    public final String getImagePropertyString(String key) {
        throw new RuntimeException("Stub!");
    }

    public final int getImagePropertyInt(String key, int defaultValue) {
        throw new RuntimeException("Stub!");
    }

    public final int getImagePropertyInt(int index, String key, int defaultValue) {
        throw new RuntimeException("Stub!");
    }

    public ImageInfo getThumbnailInfo() {
        throw new RuntimeException("Stub!");
    }

    public byte[] getImageThumbnailBytes() {
        throw new RuntimeException("Stub!");
    }

    public int getThumbnailFormat() {
        throw new RuntimeException("Stub!");
    }

    public SourceInfo getSourceInfo() {
        throw new RuntimeException("Stub!");
    }

    public void release() {
        throw new RuntimeException("Stub!");
    }

    public boolean isReleased() {
        throw new RuntimeException("Stub!");
    }

    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/media/image/ImageSource$DecodingOptions.class */
    public static class DecodingOptions {
        public static final int DEFAULT_SAMPLE_SIZE = 1;
        public AllocatorType allocator;
        public ColorSpace desiredColorSpace;
        public PixelFormat desiredPixelFormat;
        public Rect desiredRegion;
        public Size desiredSize;
        public boolean allowPartialImage = true;
        public boolean editable = false;
        public int fitDensity = 0;
        public float rotateDegrees = 0.0f;
        public int sampleSize = 1;

        public DecodingOptions() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/media/image/ImageSource$IncrementalSourceOptions.class */
    public static class IncrementalSourceOptions {
        public UpdateMode mode;
        public SourceOptions opts;

        public IncrementalSourceOptions() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/media/image/ImageSource$SourceInfo.class */
    public static class SourceInfo {
        public String encodedFormat;
        public int topLevelImageNum = 0;

        public SourceInfo() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/media/image/ImageSource$SourceOptions.class */
    public static class SourceOptions {
        public int baseDensity = 0;
        public String formatHint;

        public SourceOptions() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/media/image/ImageSource$UpdateMode.class */
    public enum UpdateMode {
        FULL_DATA,
        INCREMENTAL_DATA;

        public int getValue() {
            throw new RuntimeException("Stub!");
        }
    }
}
