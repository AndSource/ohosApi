package ohos.agp.utils;

/* loaded from: ohos2.0.1.95.jar:ohos/agp/utils/Matrix.class */
public class Matrix {
    public Matrix() {
        throw new RuntimeException("Stub!");
    }

    public Matrix(float[] srcMatrixArray) {
        throw new RuntimeException("Stub!");
    }

    public Matrix(Matrix srcMatrix) {
        throw new RuntimeException("Stub!");
    }

    public float[] getData() {
        throw new RuntimeException("Stub!");
    }

    public int index(int row, int col) {
        throw new RuntimeException("Stub!");
    }

    public void setMatrix(int row, int col, float value) {
        throw new RuntimeException("Stub!");
    }

    public void setMatrix(Matrix srcMatrix) {
        throw new RuntimeException("Stub!");
    }

    public void setIdentity() {
        throw new RuntimeException("Stub!");
    }

    public void reset() {
        throw new RuntimeException("Stub!");
    }

    public boolean isIdentity() {
        throw new RuntimeException("Stub!");
    }

    public boolean equalsMatrixValue(Matrix otherMatrix) {
        throw new RuntimeException("Stub!");
    }

    public void multiply(Matrix otherMatrix) {
        throw new RuntimeException("Stub!");
    }

    public void rotate(float angle) {
        throw new RuntimeException("Stub!");
    }

    public void scale(float scaleX, float scaleY) {
        throw new RuntimeException("Stub!");
    }

    public void translate(float transX, float transY) {
        throw new RuntimeException("Stub!");
    }

    public void transpose() {
        throw new RuntimeException("Stub!");
    }

    public void setRotate(float degrees) {
        throw new RuntimeException("Stub!");
    }

    public void setRotate(float degrees, float px, float py) {
        throw new RuntimeException("Stub!");
    }

    public void getElements(float[] elements) {
        throw new RuntimeException("Stub!");
    }

    public void setElements(float[] elements) {
        throw new RuntimeException("Stub!");
    }

    public boolean invert(Matrix inverse) {
        throw new RuntimeException("Stub!");
    }

    public void mapPoints(float[] pts) {
        throw new RuntimeException("Stub!");
    }

    public void mapPoints(float[] dst, float[] src) {
        throw new RuntimeException("Stub!");
    }

    public void mapPoints(float[] dst, int dstIndex, float[] src, int srcIndex, int pointCount) {
        throw new RuntimeException("Stub!");
    }

    public boolean postConcat(Matrix otherMatrix) {
        throw new RuntimeException("Stub!");
    }

    public boolean postScale(float sx, float sy) {
        throw new RuntimeException("Stub!");
    }

    public boolean postScale(float sx, float sy, float px, float py) {
        throw new RuntimeException("Stub!");
    }

    public boolean postTranslate(float dx, float dy) {
        throw new RuntimeException("Stub!");
    }

    public boolean preConcat(Matrix otherMatrix) {
        throw new RuntimeException("Stub!");
    }

    public boolean preRotate(float degrees) {
        throw new RuntimeException("Stub!");
    }

    public boolean preRotate(float degrees, float px, float py) {
        throw new RuntimeException("Stub!");
    }

    public void setScale(float sx, float sy) {
        throw new RuntimeException("Stub!");
    }

    public void setScale(float sx, float sy, float px, float py) {
        throw new RuntimeException("Stub!");
    }

    public boolean preTranslate(float dx, float dy) {
        throw new RuntimeException("Stub!");
    }

    public void setTranslate(float dx, float dy) {
        throw new RuntimeException("Stub!");
    }

    public boolean preScale(float sx, float sy) {
        throw new RuntimeException("Stub!");
    }

    public boolean preScale(float sx, float sy, float px, float py) {
        throw new RuntimeException("Stub!");
    }

    public boolean preSkew(float kx, float ky) {
        throw new RuntimeException("Stub!");
    }

    public float mapRadius(float radius) {
        throw new RuntimeException("Stub!");
    }

    public boolean postRotate(float degrees, float px, float py) {
        throw new RuntimeException("Stub!");
    }

    public boolean mapRect(RectFloat rectFloat) {
        throw new RuntimeException("Stub!");
    }

    public boolean mapRect(RectFloat dst, RectFloat src) {
        throw new RuntimeException("Stub!");
    }

    public boolean setRectToRect(RectFloat src, RectFloat dst, ScaleToFit scaleToFit) {
        throw new RuntimeException("Stub!");
    }

    public void setSkew(float kx, float ky) {
        throw new RuntimeException("Stub!");
    }

    public void setSkew(float kx, float ky, float px, float py) {
        throw new RuntimeException("Stub!");
    }

    public boolean setConcat(Matrix matrixA, Matrix matrixB) {
        throw new RuntimeException("Stub!");
    }

    public boolean postSkew(float kx, float ky) {
        throw new RuntimeException("Stub!");
    }

    public boolean postSkew(float kx, float ky, float px, float py) {
        throw new RuntimeException("Stub!");
    }

    public boolean setPolyToPoly(float[] src, int srcIndex, float[] dst, int dstIndex, int pointCount) {
        throw new RuntimeException("Stub!");
    }

    public boolean rectStaysRect() {
        throw new RuntimeException("Stub!");
    }

    public boolean isScaleTranslate() {
        throw new RuntimeException("Stub!");
    }

    public boolean isTranslate() {
        throw new RuntimeException("Stub!");
    }

    public boolean preservesAxisAlignment() {
        throw new RuntimeException("Stub!");
    }

    public boolean hasPerspective() {
        throw new RuntimeException("Stub!");
    }

    public boolean isSimilarity() {
        throw new RuntimeException("Stub!");
    }

    public boolean preservesRightAngles() {
        throw new RuntimeException("Stub!");
    }

    public float get(int index) {
        throw new RuntimeException("Stub!");
    }

    public float getScaleX() {
        throw new RuntimeException("Stub!");
    }

    public float getScaleY() {
        throw new RuntimeException("Stub!");
    }

    public float getSkewY() {
        throw new RuntimeException("Stub!");
    }

    public float getSkewX() {
        throw new RuntimeException("Stub!");
    }

    public float getTranslateX() {
        throw new RuntimeException("Stub!");
    }

    public float getTranslateY() {
        throw new RuntimeException("Stub!");
    }

    public float getPerspX() {
        throw new RuntimeException("Stub!");
    }

    public float getPerspY() {
        throw new RuntimeException("Stub!");
    }

    public void setScaleX(float v) {
        throw new RuntimeException("Stub!");
    }

    public void setScaleY(float v) {
        throw new RuntimeException("Stub!");
    }

    public void setSkewX(float v) {
        throw new RuntimeException("Stub!");
    }

    public void setSkewY(float v) {
        throw new RuntimeException("Stub!");
    }

    public void setTranslateX(float v) {
        throw new RuntimeException("Stub!");
    }

    public void setTranslateY(float v) {
        throw new RuntimeException("Stub!");
    }

    public void setPerspX(float v) {
        throw new RuntimeException("Stub!");
    }

    public void setPerspY(float v) {
        throw new RuntimeException("Stub!");
    }

    public void setSinCos(float sinValue, float cosValue, float px, float py) {
        throw new RuntimeException("Stub!");
    }

    public void setSinCos(float sinValue, float cosValue) {
        throw new RuntimeException("Stub!");
    }

    public void preSkew(float kx, float ky, float px, float py) {
        throw new RuntimeException("Stub!");
    }

    public boolean postIDiv(int divx, int divy) {
        throw new RuntimeException("Stub!");
    }

    public void postRotate(float degrees) {
        throw new RuntimeException("Stub!");
    }

    public void mapRectScaleTranslate(RectFloat dst, RectFloat src) {
        throw new RuntimeException("Stub!");
    }

    public boolean isFixedStepInX() {
        throw new RuntimeException("Stub!");
    }

    public boolean cheapEqualTo(Matrix matrixM) {
        throw new RuntimeException("Stub!");
    }

    public float getMinScale() {
        throw new RuntimeException("Stub!");
    }

    public float getMaxScale() {
        throw new RuntimeException("Stub!");
    }

    public void dirtyMatrixTypeCache() {
        throw new RuntimeException("Stub!");
    }

    public void setScaleTranslate(float sx, float sy, float tx, float ty) {
        throw new RuntimeException("Stub!");
    }

    public boolean isFinite() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/utils/Matrix$ScaleToFit.class */
    public enum ScaleToFit {
        FILL,
        START,
        CENTER,
        END;

        public int value() {
            throw new RuntimeException("Stub!");
        }
    }
}
