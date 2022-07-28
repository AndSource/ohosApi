package ohos.agp.utils;

/* loaded from: ohos2.0.1.95.jar:ohos/agp/utils/RectFloat.class */
public class RectFloat {
    public float bottom;
    public float left;
    public float right;
    public float top;

    public RectFloat() {
        throw new RuntimeException("Stub!");
    }

    public RectFloat(float left, float top, float right, float bottom) {
        throw new RuntimeException("Stub!");
    }

    public RectFloat(Rect rect) {
        throw new RuntimeException("Stub!");
    }

    public RectFloat(RectFloat rectFloat) {
        throw new RuntimeException("Stub!");
    }

    public final float getHorizontalCenter() {
        throw new RuntimeException("Stub!");
    }

    public final float getVerticalCenter() {
        throw new RuntimeException("Stub!");
    }

    public Point getCenter() {
        throw new RuntimeException("Stub!");
    }

    public void setPivot(float x, float y) {
        throw new RuntimeException("Stub!");
    }

    public void setPivot(Point point) {
        throw new RuntimeException("Stub!");
    }

    public void setPivotXCoordinate(float x) {
        throw new RuntimeException("Stub!");
    }

    public void setPivotYCoordinate(float y) {
        throw new RuntimeException("Stub!");
    }

    public Point getPivot() {
        throw new RuntimeException("Stub!");
    }

    public float getPivotXCoordinate() {
        throw new RuntimeException("Stub!");
    }

    public float getPivotYCoordinate() {
        throw new RuntimeException("Stub!");
    }

    public void scale(float scale) {
        throw new RuntimeException("Stub!");
    }

    public void rotateBy(RotationEnum rotationEnum) {
        throw new RuntimeException("Stub!");
    }

    public boolean isInclude(float x, float y) {
        throw new RuntimeException("Stub!");
    }

    public boolean isInclude(Point point) {
        throw new RuntimeException("Stub!");
    }

    public boolean isInclude(RectFloat rectFloat) {
        throw new RuntimeException("Stub!");
    }

    public boolean isInclude(float left, float top, float right, float bottom) {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object o) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public final float getHeight() {
        throw new RuntimeException("Stub!");
    }

    public final float getWidth() {
        throw new RuntimeException("Stub!");
    }

    public DimensFloat getRectSize() {
        throw new RuntimeException("Stub!");
    }

    public void shrink(float dx, float dy) {
        throw new RuntimeException("Stub!");
    }

    public boolean getIntersectRect(RectFloat rectFloat) {
        throw new RuntimeException("Stub!");
    }

    public static boolean isIntersect(RectFloat rectFloatA, RectFloat rectFloatB) {
        throw new RuntimeException("Stub!");
    }

    public boolean isIntersect(float left, float top, float right, float bottom) {
        throw new RuntimeException("Stub!");
    }

    public boolean isIntersect(RectFloat rect) {
        throw new RuntimeException("Stub!");
    }

    public final boolean isEmpty() {
        throw new RuntimeException("Stub!");
    }

    public boolean verifyRectFloat() {
        throw new RuntimeException("Stub!");
    }

    public void translate(float dx, float dy) {
        throw new RuntimeException("Stub!");
    }

    public void modify(float left, float top, float right, float bottom) {
        throw new RuntimeException("Stub!");
    }

    public void modify(Rect rect) {
        throw new RuntimeException("Stub!");
    }

    public void modify(RectFloat rectFloat) {
        throw new RuntimeException("Stub!");
    }

    public void clear() {
        throw new RuntimeException("Stub!");
    }

    public boolean setIntersect(RectFloat rectFloatA, RectFloat rectFloatB) {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }

    public void fuse(float left, float top, float right, float bottom) {
        throw new RuntimeException("Stub!");
    }

    public void fuse(RectFloat rectFloat) {
        throw new RuntimeException("Stub!");
    }

    public void translateTo(float newLeft, float newTop) {
        throw new RuntimeException("Stub!");
    }

    public void translateCenterTo(float centerX, float centerY) {
        throw new RuntimeException("Stub!");
    }

    public void translateCenterTo(Point point) {
        throw new RuntimeException("Stub!");
    }

    public void rounding(Rect rect) {
        throw new RuntimeException("Stub!");
    }

    public RectFloat obtainIntersectRect(float left, float top, float right, float bottom) {
        throw new RuntimeException("Stub!");
    }

    public RectFloat obtainIntersectRect(RectFloat rectFloat) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/utils/RectFloat$RotationEnum.class */
    public enum RotationEnum {
        ROTATE_90,
        ROTATE_180,
        ROTATE_270,
        ROTATE_360;

        protected int getValue() {
            throw new RuntimeException("Stub!");
        }

        public static RotationEnum getByInt(int enumInt) {
            throw new RuntimeException("Stub!");
        }
    }
}
