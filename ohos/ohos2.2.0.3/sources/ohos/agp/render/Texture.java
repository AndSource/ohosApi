package ohos.agp.render;

import ohos.media.image.PixelMap;

/* loaded from: ohos2.2.0.3.jar:ohos/agp/render/Texture.class */
public class Texture {
    public Texture(int width, int height, ColorType colorType, AlphaType alphaType) {
        throw new RuntimeException("Stub!");
    }

    public Texture(PixelMap pixelMap) {
        throw new RuntimeException("Stub!");
    }

    public PixelMap getPixelMap() {
        throw new RuntimeException("Stub!");
    }

    public int getWidth() {
        throw new RuntimeException("Stub!");
    }

    public int getHeight() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/agp/render/Texture$AlphaType.class */
    public enum AlphaType {
        UNKNOWN_ALPHATYPE,
        OPAQUE_ALPHATYPE,
        PREMUL_ALPHATYPE,
        UNPREMUL_ALPHATYPE;

        public int value() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/agp/render/Texture$ColorType.class */
    public enum ColorType {
        UNKNOWN_COLORTYPE,
        ALPHA_8_COLORTYPE,
        RGB_565_COLORTYPE,
        ARGB_4444_COLORTYPE,
        RGBA_8888_COLORTYPE,
        BGRA_8888_COLORTYPE,
        RGBA_F32_COLORTYPE;

        public int value() {
            throw new RuntimeException("Stub!");
        }
    }
}
