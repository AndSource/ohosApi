package ohos.agp.render;

import ohos.agp.utils.Matrix;
import ohos.agp.utils.Point;
import ohos.agp.utils.Rect;
import ohos.agp.utils.RectFloat;
import ohos.app.Context;

/* loaded from: ohos2.0.1.95.jar:ohos/agp/render/Canvas.class */
public class Canvas {
    protected Texture mTexture;

    public Canvas() {
        throw new RuntimeException("Stub!");
    }

    public Canvas(long nativeCanvasHandle) {
        throw new RuntimeException("Stub!");
    }

    public Canvas(Texture texture) {
        throw new RuntimeException("Stub!");
    }

    public void drawRect(RectFloat rect, Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawCircle(float x, float y, float radius, Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawRoundRect(RectFloat rect, float radiusX, float radiusY, Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawLine(Point startPoint, Point endPoint, Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawOval(RectFloat rect, Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawArc(RectFloat rect, Arc arc, Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawPolylineShadow(float[] points, Point startColorPoint, Point endColorPoint, Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public int save() {
        throw new RuntimeException("Stub!");
    }

    public void restore() {
        throw new RuntimeException("Stub!");
    }

    public void restoreToCount(int saveCount) {
        throw new RuntimeException("Stub!");
    }

    public void setMatrix(Matrix matrix) {
        throw new RuntimeException("Stub!");
    }

    public void clipRect(RectFloat rect) {
        throw new RuntimeException("Stub!");
    }

    public void clipRect(RectFloat rect, ClipOp op) {
        throw new RuntimeException("Stub!");
    }

    public void rotate(float degree, float x, float y) {
        throw new RuntimeException("Stub!");
    }

    public void scale(float scaleX, float scaleY, float pointX, float pointY) {
        throw new RuntimeException("Stub!");
    }

    public void scale(float scaleX, float scaleY) {
        throw new RuntimeException("Stub!");
    }

    public void translate(float distanceX, float distanceY) {
        throw new RuntimeException("Stub!");
    }

    public void drawText(Paint paint, String text, float x, float y) {
        throw new RuntimeException("Stub!");
    }

    public void drawCharSequence(Paint paint, CharSequence charSequence, float xCoor, float yCoor) {
        throw new RuntimeException("Stub!");
    }

    public void drawChars(Paint paint, char[] charArray, float xCoor, float yCoor) {
        throw new RuntimeException("Stub!");
    }

    public void drawTextOnPath(Paint paint, String text, Path path, float advance, float offset) {
        throw new RuntimeException("Stub!");
    }

    public void setTexture(Texture texture) {
        throw new RuntimeException("Stub!");
    }

    public void drawLines(float[] points, Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawLines(float[] points, int offset, int drawCount, Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawDeformedPixelMap(PixelMapHolder holder, PixelMapDrawInfo drawInfo, Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawPixelMapHolder(PixelMapHolder holder, float left, float top, Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawPixelMapHolderRect(PixelMapHolder holder, RectFloat rect, Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawPixelMapHolderRect(PixelMapHolder holder, RectFloat rectSrc, RectFloat rectDst, Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawPixelMapHolderCircleShape(PixelMapHolder holder, RectFloat rectSrc, float pointX, float pointY, float radius) {
        throw new RuntimeException("Stub!");
    }

    public void drawPixelMapHolderRoundRectShape(PixelMapHolder holder, RectFloat rectSrc, RectFloat rectDst, float radiusX, float radiusY) {
        throw new RuntimeException("Stub!");
    }

    public void drawPath(Path path, Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawTexture(float posX, float posY, Texture texture) {
        throw new RuntimeException("Stub!");
    }

    public void drawChangelessTexture(float posX, float posY, Texture texture) {
        throw new RuntimeException("Stub!");
    }

    public void clipPath(Path path, ClipOp op) {
        throw new RuntimeException("Stub!");
    }

    public void drawPoint(float posX, float posY, Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawPaint(Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawColor(int color, PorterDuffMode mode) {
        throw new RuntimeException("Stub!");
    }

    public void concat(Matrix matrix) {
        throw new RuntimeException("Stub!");
    }

    public Rect getLocalClipBounds() {
        throw new RuntimeException("Stub!");
    }

    public void getMatrix(Matrix matrix) {
        throw new RuntimeException("Stub!");
    }

    public int getSaveCount() {
        throw new RuntimeException("Stub!");
    }

    public int saveLayer(RectFloat bounds, Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public int saveLayerAlpha(RectFloat bounds, int alpha) {
        throw new RuntimeException("Stub!");
    }

    public int getDeviceDensity(Context context) {
        throw new RuntimeException("Stub!");
    }

    public void skew(float sx, float sy) {
        throw new RuntimeException("Stub!");
    }

    public void drawVertices(VertexMode mode, Vertices vertices, Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void drawPicture(Picture picture) {
        throw new RuntimeException("Stub!");
    }

    public void drawPicture(Picture picture, RectFloat destRectangle) {
        throw new RuntimeException("Stub!");
    }

    public boolean quickReject(float left, float top, float right, float bottom) {
        throw new RuntimeException("Stub!");
    }

    public void drawPoints(float[] pts, int offset, int count, Paint paint) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/render/Canvas$ClipOp.class */
    public enum ClipOp {
        INTERSECT,
        DIFFERENCE;

        public int value() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/render/Canvas$PorterDuffMode.class */
    public enum PorterDuffMode {
        CLEAR,
        SRC,
        DST,
        SRC_OVER,
        DST_OVER,
        SRC_IN,
        DST_IN,
        SRC_OUT,
        DST_OUT,
        SRC_ATOP,
        DST_ATOP,
        XOR,
        PLUS,
        MULTIPLY,
        SCREEN,
        OVERLAY,
        DARKEN,
        LIGHTEN;

        public int value() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/render/Canvas$VertexMode.class */
    public enum VertexMode {
        TRIANGLES,
        TRIANGLE_STRIP,
        TRIANGLE_FAN;

        public int value() {
            throw new RuntimeException("Stub!");
        }
    }
}
