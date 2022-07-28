package ohos.agp.render;

import ohos.agp.utils.Color;

/* loaded from: ohos2.0.1.95.jar:ohos/agp/render/SweepShader.class */
public class SweepShader extends Shader {
    public float[] positions;
    public float xCoordinate;
    public float yCoordinate;

    public SweepShader() {
        super(null, null);
        throw new RuntimeException("Stub!");
    }

    public SweepShader(float xCoor, float yCoor, Color[] newColors, float[] newPositions) {
        super(null, null);
        throw new RuntimeException("Stub!");
    }

    protected float getShaderXCoordinate() {
        throw new RuntimeException("Stub!");
    }

    protected float getShaderYCoordinate() {
        throw new RuntimeException("Stub!");
    }

    protected float[] getShaderPositions() {
        throw new RuntimeException("Stub!");
    }
}
