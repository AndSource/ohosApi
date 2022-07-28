package ohos.agp.render.render3d.math;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/render/render3d/math/Matrix4x4.class */
public class Matrix4x4 {
    public Matrix4x4() {
        throw new RuntimeException("Stub!");
    }

    public static Matrix4x4 identity() {
        throw new RuntimeException("Stub!");
    }

    public float get(int index) {
        throw new RuntimeException("Stub!");
    }

    public float get(int row, int column) {
        throw new RuntimeException("Stub!");
    }

    public void set(int index, float value) {
        throw new RuntimeException("Stub!");
    }

    public void set(int row, int column, float value) {
        throw new RuntimeException("Stub!");
    }

    public void set(float[] dataIn, int offset) {
        throw new RuntimeException("Stub!");
    }

    public float[] getData() {
        throw new RuntimeException("Stub!");
    }

    public void makeTranslation(Vector3 translation) {
        throw new RuntimeException("Stub!");
    }

    public void makeRotation(Quaternion rotation) {
        throw new RuntimeException("Stub!");
    }

    public void makeScale(Vector3 scale) {
        throw new RuntimeException("Stub!");
    }

    public Vector3 extractTranslation() {
        throw new RuntimeException("Stub!");
    }

    public Vector3 extractScale() {
        throw new RuntimeException("Stub!");
    }

    public void extractRotation(Matrix4x4 rotationOut) {
        throw new RuntimeException("Stub!");
    }

    public Quaternion extractQuaternion() {
        throw new RuntimeException("Stub!");
    }

    public static void multiply(Matrix4x4 lhs, Matrix4x4 rhs, Matrix4x4 product) {
        throw new RuntimeException("Stub!");
    }

    public static boolean invert(Matrix4x4 inputMatrix, Matrix4x4 out) {
        throw new RuntimeException("Stub!");
    }

    public Vector3 transformPoint(Vector3 point) {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object other) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
