package ohos.media.codec;

import java.nio.ByteBuffer;
import ohos.agp.utils.Rect;

/* loaded from: ohos3.0.0.1.jar:ohos/media/codec/PixelMap.class */
public abstract class PixelMap implements AutoCloseable {
    public abstract int obtainPixelFormat();

    public abstract int obtainPixelWidth();

    public abstract int obtainPixelHeight();

    public abstract long obtainPixelTimestamp();

    public abstract PixelPlane[] obtainPixelPlanes();

    @Override // java.lang.AutoCloseable
    public abstract void close();

    public PixelMap() {
        throw new RuntimeException("Stub!");
    }

    public void setClipRectangle(Rect clipRect) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/media/codec/PixelMap$PixelPlane.class */
    public static abstract class PixelPlane {
        public abstract int obtainOneRowBytes();

        public abstract int obtainAdjPixelsBytes();

        public abstract ByteBuffer obtainPixelBytes();

        public PixelPlane() {
            throw new RuntimeException("Stub!");
        }
    }
}
