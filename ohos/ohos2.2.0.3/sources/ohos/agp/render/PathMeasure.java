package ohos.agp.render;

import ohos.agp.utils.Matrix;

/* loaded from: ohos2.2.0.3.jar:ohos/agp/render/PathMeasure.class */
public class PathMeasure {
    public static final int GET_POSITION_AND_TANGENT_MATRIX_FLAG = 3;
    public static final int GET_POSITION_MATRIX_FLAG = 1;
    public static final int GET_TANGENT_MATRIX_FLAG = 2;

    public PathMeasure(Path path, boolean forceClosed) {
        throw new RuntimeException("Stub!");
    }

    public float getLength() {
        throw new RuntimeException("Stub!");
    }

    public boolean getPosTan(float distance, float[] position, float[] tangent) {
        throw new RuntimeException("Stub!");
    }

    public void setPath(Path path, boolean forceClosed) {
        throw new RuntimeException("Stub!");
    }

    public boolean getSegment(float startDistance, float stopDistance, Path path, boolean startWithMoveTo) {
        throw new RuntimeException("Stub!");
    }

    public boolean isClosed() {
        throw new RuntimeException("Stub!");
    }

    public boolean getMatrix(float distance, Matrix matrix, int flags) {
        throw new RuntimeException("Stub!");
    }
}
