package ohos.agp.render;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/render/MaskFilter.class */
public class MaskFilter {
    public MaskFilter(float radius, Blur style) {
        throw new RuntimeException("Stub!");
    }

    public MaskFilter(float[] direction, float ambient, float specular, float blurRadius) {
        throw new RuntimeException("Stub!");
    }

    public MaskFilter(byte[] table) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/render/MaskFilter$Blur.class */
    public enum Blur {
        NORMAL,
        SOLID,
        OUTER,
        INNER;

        public int value() {
            throw new RuntimeException("Stub!");
        }
    }
}
