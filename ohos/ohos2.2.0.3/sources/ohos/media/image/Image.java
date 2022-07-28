package ohos.media.image;

import java.nio.ByteBuffer;
import ohos.media.image.common.ImageFormat;
import ohos.media.image.common.Rect;
import ohos.media.image.common.Size;

/* loaded from: ohos2.2.0.3.jar:ohos/media/image/Image.class */
public class Image {
    Image(ImageReceiver imageReceiver) {
        throw new RuntimeException("Stub!");
    }

    public int getFormat() {
        throw new RuntimeException("Stub!");
    }

    public Size getImageSize() {
        throw new RuntimeException("Stub!");
    }

    public long getTimestamp() {
        throw new RuntimeException("Stub!");
    }

    public Rect getClipRect() {
        throw new RuntimeException("Stub!");
    }

    public void setClipRect(Rect clipRect) {
        throw new RuntimeException("Stub!");
    }

    public void release() {
        throw new RuntimeException("Stub!");
    }

    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }

    public Component getComponent(ImageFormat.ComponentType componentType) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/media/image/Image$Component.class */
    public static class Component {
        public final ImageFormat.ComponentType componentType = null;
        public final int pixelStride = 0;
        public final int rowStride = 0;

        Component(int componentType, int rowStride, int pixelStride, ByteBuffer byteBuffer) {
            throw new RuntimeException("Stub!");
        }

        public int read() {
            throw new RuntimeException("Stub!");
        }

        public int read(byte[] dstArray) {
            throw new RuntimeException("Stub!");
        }

        public int read(byte[] dstArray, int offset, int length) {
            throw new RuntimeException("Stub!");
        }

        public int tell() {
            throw new RuntimeException("Stub!");
        }

        public int seek(int newPosition) {
            throw new RuntimeException("Stub!");
        }

        public int remaining() {
            throw new RuntimeException("Stub!");
        }

        public ByteBuffer getBuffer() {
            throw new RuntimeException("Stub!");
        }

        public void release() {
            throw new RuntimeException("Stub!");
        }

        /* loaded from: ohos2.2.0.3.jar:ohos/media/image/Image$Component$OperationResult.class */
        public static final class OperationResult {
            public static final int FAILURE = -1;
            public static final int RELEASED = -2;
            public static final int SUCCESS = 0;

            OperationResult() {
                throw new RuntimeException("Stub!");
            }
        }
    }
}
