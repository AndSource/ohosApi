package ohos.agp.render;

import ohos.agp.render.Shader;
import ohos.agp.utils.Color;
import ohos.agp.utils.Point;

/* loaded from: ohos2.1.1.21.jar:ohos/agp/render/LinearShader.class */
public class LinearShader extends Shader {
    public Point[] points;
    public float[] stops;

    public LinearShader() {
        super(null, null);
        throw new RuntimeException("Stub!");
    }

    public LinearShader(Point[] newPoints, float[] newStops, Color[] newColors, Shader.TileMode newTileMode) {
        super(null, null);
        throw new RuntimeException("Stub!");
    }

    protected Point[] getShaderPoints() {
        throw new RuntimeException("Stub!");
    }
}
