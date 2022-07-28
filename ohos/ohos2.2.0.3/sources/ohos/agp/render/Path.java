package ohos.agp.render;

import ohos.agp.utils.Matrix;
import ohos.agp.utils.Point;
import ohos.agp.utils.RectFloat;

/* loaded from: ohos2.2.0.3.jar:ohos/agp/render/Path.class */
public class Path {
    public Path() {
        throw new RuntimeException("Stub!");
    }

    public Path(Path path) {
        throw new RuntimeException("Stub!");
    }

    public void moveTo(float xCoor, float yCoor) {
        throw new RuntimeException("Stub!");
    }

    public void lineTo(float xCoor, float yCoor) {
        throw new RuntimeException("Stub!");
    }

    public void quadTo(Point point0, Point point1) {
        throw new RuntimeException("Stub!");
    }

    public void cubicTo(Point point0, Point point1, Point point2) {
        throw new RuntimeException("Stub!");
    }

    public void cubicTo(float x1, float y1, float x2, float y2, float x3, float y3) {
        throw new RuntimeException("Stub!");
    }

    public void arcTo(Point point0, Point point1, float radius) {
        throw new RuntimeException("Stub!");
    }

    public void arcTo(RectFloat rect, float startAngle, float sweepAngle) {
        throw new RuntimeException("Stub!");
    }

    public void arcTo(RectFloat rect, float startAngle, float sweepAngle, boolean forceMoveTo) {
        throw new RuntimeException("Stub!");
    }

    public void conicTo(Point point0, Point point1, float weight) {
        throw new RuntimeException("Stub!");
    }

    public void close() {
        throw new RuntimeException("Stub!");
    }

    public void reset() {
        throw new RuntimeException("Stub!");
    }

    public void addPath(Path path) {
        throw new RuntimeException("Stub!");
    }

    public void addArc(RectFloat rect, float startAngle, float sweepAngle) {
        throw new RuntimeException("Stub!");
    }

    public void addCircle(Point centerPoint, float radius, Direction direction) {
        throw new RuntimeException("Stub!");
    }

    public void addOval(RectFloat rect, Direction direction) {
        throw new RuntimeException("Stub!");
    }

    public boolean isEmpty() {
        throw new RuntimeException("Stub!");
    }

    public void computeBounds(RectFloat bounds) {
        throw new RuntimeException("Stub!");
    }

    public void addRect(RectFloat rect, Direction direction) {
        throw new RuntimeException("Stub!");
    }

    public void addRoundRect(RectFloat rect, float[] radius, Direction direction) {
        throw new RuntimeException("Stub!");
    }

    public void rLineTo(float xCoor, float yCoor) {
        throw new RuntimeException("Stub!");
    }

    public void offset(float offsetX, float offsetY) {
        throw new RuntimeException("Stub!");
    }

    public void rewind() {
        throw new RuntimeException("Stub!");
    }

    public void transform(Matrix matrix) {
        throw new RuntimeException("Stub!");
    }

    public void transformToNewPath(Matrix matrix, Path newPath) {
        throw new RuntimeException("Stub!");
    }

    public void set(Path path) {
        throw new RuntimeException("Stub!");
    }

    public void setFillType(FillType fillType) {
        throw new RuntimeException("Stub!");
    }

    public FillType getFillType() {
        throw new RuntimeException("Stub!");
    }

    public void setLastPoint(float dx, float dy) {
        throw new RuntimeException("Stub!");
    }

    public boolean isConvex() {
        throw new RuntimeException("Stub!");
    }

    public boolean isInterpolatable(Path compare) {
        throw new RuntimeException("Stub!");
    }

    public boolean interpolate(Path ending, float weight, Path out) {
        throw new RuntimeException("Stub!");
    }

    public boolean isInverseFillType() {
        throw new RuntimeException("Stub!");
    }

    public void toggleInverseFillType() {
        throw new RuntimeException("Stub!");
    }

    public boolean isOval(RectFloat bounds) {
        throw new RuntimeException("Stub!");
    }

    public boolean isLastContourClosed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isFinite() {
        throw new RuntimeException("Stub!");
    }

    public boolean isVolatile() {
        throw new RuntimeException("Stub!");
    }

    public void setIsVolatile(boolean isVolatile) {
        throw new RuntimeException("Stub!");
    }

    public int countPoints() {
        throw new RuntimeException("Stub!");
    }

    public void swap(Path other) {
        throw new RuntimeException("Stub!");
    }

    public RectFloat computeTightBounds() {
        throw new RuntimeException("Stub!");
    }

    public boolean conservativelyContainsRect(RectFloat rectFloat) {
        throw new RuntimeException("Stub!");
    }

    public void incReserve(int extraPointCount) {
        throw new RuntimeException("Stub!");
    }

    public void shrinkToFit() {
        throw new RuntimeException("Stub!");
    }

    public void moveTo(Point point) {
        throw new RuntimeException("Stub!");
    }

    public void rMoveTo(float dx, float dy) {
        throw new RuntimeException("Stub!");
    }

    public void lineTo(Point point) {
        throw new RuntimeException("Stub!");
    }

    public void quadTo(float xCoor0, float yCoor0, float xCoor1, float yCoor1) {
        throw new RuntimeException("Stub!");
    }

    public void rQuadTo(float dx1, float dy1, float dx2, float dy2) {
        throw new RuntimeException("Stub!");
    }

    public void conicTo(float xCoor0, float yCoor0, float xCoor1, float yCoor1, float weight) {
        throw new RuntimeException("Stub!");
    }

    public void rConicTo(float xCoor0, float yCoor0, float xCoor1, float yCoor1, float weight) {
        throw new RuntimeException("Stub!");
    }

    public void arcTo(float xCoor0, float yCoor0, float xCoor1, float yCoor1, float radius) {
        throw new RuntimeException("Stub!");
    }

    public void arcTo(Point radius, float xAxisRotate, ArcSize largeArc, Direction sweep, Point xy) {
        throw new RuntimeException("Stub!");
    }

    public void addRect(RectFloat rectFloat, Direction direction, int start) {
        throw new RuntimeException("Stub!");
    }

    public void addRect(float left, float top, float right, float bottom, Direction direction) {
        throw new RuntimeException("Stub!");
    }

    public void addOval(RectFloat rectFloat, Direction direction, int start) {
        throw new RuntimeException("Stub!");
    }

    public void addCircle(float xCoor, float yCoor, float radius, Direction direction) {
        throw new RuntimeException("Stub!");
    }

    public void addRoundRect(RectFloat rectFloat, float xRadius, float yRadius, Direction direction) {
        throw new RuntimeException("Stub!");
    }

    public void addPath(Path src, AddPathMode mode) {
        throw new RuntimeException("Stub!");
    }

    public void addPath(Path src, float dx, float dy, AddPathMode mode) {
        throw new RuntimeException("Stub!");
    }

    public void addPath(Path src, Matrix matrix, AddPathMode mode) {
        throw new RuntimeException("Stub!");
    }

    public void reverseAddPath(Path src) {
        throw new RuntimeException("Stub!");
    }

    public void offset(float offsetX, float offsetY, Path dst) {
        throw new RuntimeException("Stub!");
    }

    public boolean getLastPoint(Point point) {
        throw new RuntimeException("Stub!");
    }

    public void setLastPoint(Point point) {
        throw new RuntimeException("Stub!");
    }

    public boolean contains(float xCoor, float yCoor) {
        throw new RuntimeException("Stub!");
    }

    public boolean isValid() {
        throw new RuntimeException("Stub!");
    }

    public int countVerbs() {
        throw new RuntimeException("Stub!");
    }

    public void updateBoundsCache() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/agp/render/Path$AddPathMode.class */
    public enum AddPathMode {
        APPEND_ADD_PATH_MODE,
        EXTEND_ADD_PATH_MODE;

        public int value() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/agp/render/Path$ArcSize.class */
    public enum ArcSize {
        SMALL_SIZE,
        LARGE_SIZE;

        public int value() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/agp/render/Path$Direction.class */
    public enum Direction {
        CLOCK_WISE,
        COUNTER_CLOCK_WISE;

        public int value() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/agp/render/Path$FillType.class */
    public enum FillType {
        WINDING_ORDER,
        EVEN_ODD,
        INVERSE_WINDING,
        INVERSE_EVEN_ODD;

        public int value() {
            throw new RuntimeException("Stub!");
        }
    }
}
