package ohos.agp.render;

import java.util.Optional;
import ohos.agp.utils.Color;
import ohos.agp.utils.Matrix;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/render/Shader.class */
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

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/render/Shader$TileMode.class */
    public enum TileMode {
        CLAMP_TILEMODE,
        REPEAT_TILEMODE,
        MIRROR_TILEMODE;

        public int value() {
            throw new RuntimeException("Stub!");
        }

        public static Optional<TileMode> fromInt(int value) {
            throw new RuntimeException("Stub!");
        }
    }
}
