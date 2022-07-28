package ohos.agp.utils;

import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/utils/Rect.class */
public class Rect implements Sequenceable {
    public int bottom;
    public int left;
    public int right;
    public int top;

    public Rect() {
        throw new RuntimeException("Stub!");
    }

    public Rect(int left, int top, int right, int bottom) {
        throw new RuntimeException("Stub!");
    }

    public Rect(Rect rect) {
        throw new RuntimeException("Stub!");
    }

    public void set(int left, int top, int right, int bottom) {
        throw new RuntimeException("Stub!");
    }

    public final boolean isEmpty() {
        throw new RuntimeException("Stub!");
    }

    public final boolean verifyRect() {
        throw new RuntimeException("Stub!");
    }

    public final int getWidth() {
        throw new RuntimeException("Stub!");
    }

    public final int getHeight() {
        throw new RuntimeException("Stub!");
    }

    public final int getCenterX() {
        throw new RuntimeException("Stub!");
    }

    public final int getCenterY() {
        throw new RuntimeException("Stub!");
    }

    public int[] getCenter() {
        throw new RuntimeException("Stub!");
    }

    public int[] getRectSize() {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object object) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean marshalling(Parcel out) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean unmarshalling(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    public boolean isInclude(int x, int y) {
        throw new RuntimeException("Stub!");
    }

    public boolean isInclude(Point point) {
        throw new RuntimeException("Stub!");
    }

    public boolean isInclude(Rect rect) {
        throw new RuntimeException("Stub!");
    }

    public boolean isInclude(int left, int top, int right, int bottom) {
        throw new RuntimeException("Stub!");
    }

    public final float getPreciseHorizontalCenter() {
        throw new RuntimeException("Stub!");
    }

    public final float getPreciseVerticalCenter() {
        throw new RuntimeException("Stub!");
    }

    public Point getPreciseCenter() {
        throw new RuntimeException("Stub!");
    }

    public void setPivot(int x, int y) {
        throw new RuntimeException("Stub!");
    }

    public void setPivot(Point point) {
        throw new RuntimeException("Stub!");
    }

    public void setPivotXCoordinate(int x) {
        throw new RuntimeException("Stub!");
    }

    public void setPivotYCoordinate(int y) {
        throw new RuntimeException("Stub!");
    }

    public Point getPivot() {
        throw new RuntimeException("Stub!");
    }

    public int getPivotXCoordinate() {
        throw new RuntimeException("Stub!");
    }

    public int getPivotYCoordinate() {
        throw new RuntimeException("Stub!");
    }

    public void fetchParcel(Parcel parcel) {
        throw new RuntimeException("Stub!");
    }

    public void recordParcel(Parcel parcel) {
        throw new RuntimeException("Stub!");
    }

    public void scale(float scale) {
        throw new RuntimeException("Stub!");
    }

    public void rotateBy(RotationEnum rotationEnum) {
        throw new RuntimeException("Stub!");
    }

    public void shrink(int dx, int dy) {
        throw new RuntimeException("Stub!");
    }

    public static boolean isIntersect(Rect rectA, Rect rectB) {
        throw new RuntimeException("Stub!");
    }

    public void translate(int dx, int dy) {
        throw new RuntimeException("Stub!");
    }

    public void translateTo(int newLeft, int newTop) {
        throw new RuntimeException("Stub!");
    }

    public void translateCenterTo(int centerX, int centerY) {
        throw new RuntimeException("Stub!");
    }

    public void translateCenterTo(Point point) {
        throw new RuntimeException("Stub!");
    }

    public void modify(Rect rect) {
        throw new RuntimeException("Stub!");
    }

    public void clear() {
        throw new RuntimeException("Stub!");
    }

    public void fuse(int left, int top, int right, int bottom) {
        throw new RuntimeException("Stub!");
    }

    public void fuse(Rect rect) {
        throw new RuntimeException("Stub!");
    }

    public void fuse(int xCoor, int yCoor) {
        throw new RuntimeException("Stub!");
    }

    public boolean getIntersectRect(int left, int top, int right, int bottom) {
        throw new RuntimeException("Stub!");
    }

    public boolean getIntersectRect(Rect rect) {
        throw new RuntimeException("Stub!");
    }

    public boolean isIntersect(int left, int top, int right, int bottom) {
        throw new RuntimeException("Stub!");
    }

    public boolean isIntersect(Rect rect) {
        throw new RuntimeException("Stub!");
    }

    public Rect obtainIntersectRect(int left, int top, int right, int bottom) {
        throw new RuntimeException("Stub!");
    }

    public Rect obtainIntersectRect(Rect rect) {
        throw new RuntimeException("Stub!");
    }

    public void reorder() {
        throw new RuntimeException("Stub!");
    }

    public boolean getIntersectRect(Rect rectA, Rect rectB) {
        throw new RuntimeException("Stub!");
    }

    public String convertRectToValue() {
        throw new RuntimeException("Stub!");
    }

    public static Rect convertValueToRect(String str) {
        throw new RuntimeException("Stub!");
    }

    public void offset(int dx, int dy) {
        throw new RuntimeException("Stub!");
    }

    public boolean contains(int left, int top, int right, int bottom) {
        throw new RuntimeException("Stub!");
    }

    public void sort() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/utils/Rect$RotationEnum.class */
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
