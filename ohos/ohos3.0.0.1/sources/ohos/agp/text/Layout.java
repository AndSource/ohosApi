package ohos.agp.text;

import ohos.agp.render.Canvas;
import ohos.agp.render.Paint;
import ohos.agp.render.Path;

@Deprecated
/* loaded from: ohos3.0.0.1.jar:ohos/agp/text/Layout.class */
public abstract class Layout {
    @Deprecated
    protected long mNativeLayoutHandle = 0;

    @Deprecated
    public Layout() {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public void drawText(Canvas canvas) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public void drawHighlight(Canvas canvas, Path HighlightPath, Paint highlightPaint, int offSetInVertical) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public final int getWidth() {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public int getHeight() {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public int getAscent(int line) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public int getDescent(int line) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public int getBaseline(int line) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public int getTop(int line) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public int getBottom(int line) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public int getLineCount() {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public int getBeginCharIndex(int line) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public int getEndCharIndex(int line) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public int getLineIndexByCharIndex(int offset) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public float getLineStart(int line) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public float getLineEnd(int line) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public float getTextWidth(int line) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public int getLimitWidth(int line) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public int getCharIndexByCoordinate(int line, float horizCoordinate) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public float getCoordinateInSecondDir(int offset) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public float getCoordinateInMainDir(int offset) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public float getNumOfFontHeight() {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public float getCoordinateForVertical(int point) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public int getLineIndexByCoordinate(int verticalCoordinate) {
        throw new RuntimeException("Stub!");
    }
}
