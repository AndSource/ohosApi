package ohos.agp.render;

import ohos.agp.utils.Color;
import ohos.agp.utils.Matrix;

/* loaded from: ohos2.2.0.3.jar:ohos/agp/render/Shader.class */
public abstract class Shader {
    public int[] intColors;
    protected int mTileMode;
    public Color[] shaderColors;

    public Shader(Color[] colors, TileMode newTileMode) {
        throw new RuntimeException("Stub!");
    }

    public TileMode getTileMode() {
        throw new RuntimeException("Stub!");
    }

    public Color[] getShaderColors() {
        throw new RuntimeException("Stub!");
    }

    public void setShaderMatrix(Matrix matrix) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/agp/render/Shader$TileMode.class */
    public enum TileMode {
        CLAMP_TILEMODE,
        REPEAT_TILEMODE,
        MIRROR_TILEMODE;

        public int value() {
            throw new RuntimeException("Stub!");
        }
    }
}
