package ohos.agp.graphics;

import ohos.agp.render.Canvas;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.1.1.21.jar:ohos/agp/graphics/Surface.class */
public class Surface implements Sequenceable {
    public Surface() {
        throw new RuntimeException("Stub!");
    }

    public Canvas acquireCanvas() {
        throw new RuntimeException("Stub!");
    }

    public void syncCanvasDrawCalls() {
        throw new RuntimeException("Stub!");
    }

    public boolean bindToTextureHolder(TextureHolder textureHolder) {
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

    public boolean showRawImage(byte[] rawImageData, PixelFormat format, int width, int height) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/graphics/Surface$PixelFormat.class */
    public enum PixelFormat {
        PIXEL_FORMAT_YCBCR_422_I,
        PIXEL_FORMAT_YCRCB_420_SP,
        PIXEL_FORMAT_YV12;

        public int value() {
            throw new RuntimeException("Stub!");
        }
    }
}
