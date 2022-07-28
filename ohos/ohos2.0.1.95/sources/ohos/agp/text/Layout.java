package ohos.agp.text;

import ohos.agp.render.Canvas;
import ohos.agp.render.Paint;
import ohos.agp.render.Path;

/* loaded from: ohos2.0.1.95.jar:ohos/agp/text/Layout.class */
public abstract class Layout {
    protected long mNativeLayoutHandle = 0;

    public Layout() {
        throw new RuntimeException("Stub!");
    }

    public void drawText(Canvas canvas) {
        throw new RuntimeException("Stub!");
    }

    public void drawHighlight(Canvas canvas, Path HighlightPath, Paint highlightPaint, int offSetInVertical) {
        throw new RuntimeException("Stub!");
    }

    public final int getWidth() {
        throw new RuntimeException("Stub!");
    }

    public int getHeight() {
        throw new RuntimeException("Stub!");
    }

    public int getAscent(int line) {
        throw new RuntimeException("Stub!");
    }

    public int getDescent(int line) {
        throw new RuntimeException("Stub!");
    }

    public int getBaseline(int line) {
        throw new RuntimeException("Stub!");
    }

    public int getTop(int line) {
        throw new RuntimeException("Stub!");
    }

    public int getBottom(int line) {
        throw new RuntimeException("Stub!");
    }

    public int getLineCount() {
        throw new RuntimeException("Stub!");
    }

    public int getBeginCharIndex(int line) {
        throw new RuntimeException("Stub!");
    }

    public int getEndCharIndex(int line) {
        throw new RuntimeException("Stub!");
    }

    public int getLineIndexByCharIndex(int offset) {
        throw new RuntimeException("Stub!");
    }

    public float getLineStart(int line) {
        throw new RuntimeException("Stub!");
    }

    public float getLineEnd(int line) {
        throw new RuntimeException("Stub!");
    }

    public float getTextWidth(int line) {
        throw new RuntimeException("Stub!");
    }

    public int getLimitWidth(int line) {
        throw new RuntimeException("Stub!");
    }

    public int getCharIndexByCoordinate(int line, float horizCoordinate) {
        throw new RuntimeException("Stub!");
    }

    public float getCoordinateInSecondDir(int offset) {
        throw new RuntimeException("Stub!");
    }

    public float getCoordinateInMainDir(int offset) {
        throw new RuntimeException("Stub!");
    }

    public float getNumOfFontHeight() {
        throw new RuntimeException("Stub!");
    }

    public float getCoordinateForVertical(int point) {
        throw new RuntimeException("Stub!");
    }

    public int getLineIndexByCoordinate(int verticalCoordinate) {
        throw new RuntimeException("Stub!");
    }
}
