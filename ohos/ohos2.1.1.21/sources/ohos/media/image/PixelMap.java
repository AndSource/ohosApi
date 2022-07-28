package ohos.media.image;

import java.nio.Buffer;
import ohos.media.image.common.AlphaType;
import ohos.media.image.common.ImageInfo;
import ohos.media.image.common.PixelFormat;
import ohos.media.image.common.Position;
import ohos.media.image.common.Rect;
import ohos.media.image.common.ScaleMode;
import ohos.media.image.common.Size;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.1.1.21.jar:ohos/media/image/PixelMap.class */
public class PixelMap implements Sequenceable {
    public static final Sequenceable.Producer<PixelMap> PRODUCER = null;

    protected PixelMap(long nativeImagePixelMap, long nativeAllocBytes) {
        throw new RuntimeException("Stub!");
    }

    public static PixelMap create(int[] colors, InitializationOptions opts) {
        throw new RuntimeException("Stub!");
    }

    public static PixelMap create(int[] colors, int offset, int stride, InitializationOptions opts) {
        throw new RuntimeException("Stub!");
    }

    public static PixelMap create(InitializationOptions opts) {
        throw new RuntimeException("Stub!");
    }

    public static PixelMap create(PixelMap source, InitializationOptions opts) {
        throw new RuntimeException("Stub!");
    }

    public static PixelMap create(PixelMap source, Rect srcRegion, InitializationOptions opts) {
        throw new RuntimeException("Stub!");
    }

    public ImageInfo getImageInfo() {
        throw new RuntimeException("Stub!");
    }

    public void release() {
        throw new RuntimeException("Stub!");
    }

    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }

    public byte[] getNinePatchChunk() {
        throw new RuntimeException("Stub!");
    }

    public boolean isReleased() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean marshalling(Parcel out) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean unmarshalling(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    public int getBytesNumberPerRow() {
        throw new RuntimeException("Stub!");
    }

    public long getPixelBytesNumber() {
        throw new RuntimeException("Stub!");
    }

    public long getPixelBytesCapacity() {
        throw new RuntimeException("Stub!");
    }

    public boolean isEditable() {
        throw new RuntimeException("Stub!");
    }

    public boolean isSameImage(PixelMap other) {
        throw new RuntimeException("Stub!");
    }

    public int readPixel(Position pos) {
        throw new RuntimeException("Stub!");
    }

    public void readPixels(int[] pixels, int offset, int stride, Rect region) {
        throw new RuntimeException("Stub!");
    }

    public void readPixels(Buffer dst) {
        throw new RuntimeException("Stub!");
    }

    public void resetConfig(Size size, PixelFormat pixelFormat) {
        throw new RuntimeException("Stub!");
    }

    public void setAlphaType(AlphaType alphaType) {
        throw new RuntimeException("Stub!");
    }

    public void writePixel(Position pos, int color) {
        throw new RuntimeException("Stub!");
    }

    public void writePixels(int[] pixels, int offset, int stride, Rect region) {
        throw new RuntimeException("Stub!");
    }

    public void writePixels(Buffer src) {
        throw new RuntimeException("Stub!");
    }

    public void writePixels(int color) {
        throw new RuntimeException("Stub!");
    }

    public void setBaseDensity(int baseDensity) {
        throw new RuntimeException("Stub!");
    }

    public int getBaseDensity() {
        throw new RuntimeException("Stub!");
    }

    public final void setUseMipmap(boolean useMipmap) {
        throw new RuntimeException("Stub!");
    }

    public final boolean useMipmap() {
        throw new RuntimeException("Stub!");
    }

    public Size getFitDensitySize(int targetDensity) {
        throw new RuntimeException("Stub!");
    }

    public PixelMap createFromAlpha() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/media/image/PixelMap$InitializationOptions.class */
    public static class InitializationOptions {
        public AlphaType alphaType;
        public PixelFormat pixelFormat;
        public ScaleMode scaleMode;
        public Size size;
        public boolean editable = false;
        public boolean releaseSource = false;
        public boolean useSourceIfMatch = false;

        public InitializationOptions() {
            throw new RuntimeException("Stub!");
        }
    }
}
