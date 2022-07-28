package ohos.agp.text;

import ohos.agp.render.Canvas;
import ohos.agp.render.Paint;
import ohos.agp.text.BidiAnalyzer;
import ohos.agp.utils.Point;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/text/TextLayout.class */
public class TextLayout {
    protected Paint mPaint;
    protected RichText mRichText;
    protected String mText;

    public TextLayout() {
        throw new RuntimeException("Stub!");
    }

    public TextLayout(String text, Paint paint, int widthLimit) throws NullPointerException {
        throw new RuntimeException("Stub!");
    }

    public TextLayout(RichText richText, Paint paint, int widthLimit) throws NullPointerException {
        throw new RuntimeException("Stub!");
    }

    public void setText(String text) throws NullPointerException {
        throw new RuntimeException("Stub!");
    }

    public void setRichText(RichText richText) throws NullPointerException {
        throw new RuntimeException("Stub!");
    }

    public void setPaint(Paint paint) throws NullPointerException {
        throw new RuntimeException("Stub!");
    }

    public void setWidthLimit(int widthLimit) {
        throw new RuntimeException("Stub!");
    }

    public void setBidiStrategy(BidiAnalyzer.BidiStrategy bidi) {
        throw new RuntimeException("Stub!");
    }

    public void setFallbackFontMetricsEnabled(Boolean fallbackFontMetricsEnabled) {
        throw new RuntimeException("Stub!");
    }

    public void setFontPaddingStrategy(FontPaddingStrategy fontPadding) {
        throw new RuntimeException("Stub!");
    }

    public void setLineBreakStrategy(LineBreakStrategy lineBreakStrategy) {
        throw new RuntimeException("Stub!");
    }

    public void setHyphenationStrategy(HyphenationStrategy hyphenationStrategy) {
        throw new RuntimeException("Stub!");
    }

    public void setJustifyStrategy(JustifyStrategy justifyStrategy) {
        throw new RuntimeException("Stub!");
    }

    public void doLayout() {
        throw new RuntimeException("Stub!");
    }

    public void drawText(Canvas canvas) {
        throw new RuntimeException("Stub!");
    }

    public float getWidth() {
        throw new RuntimeException("Stub!");
    }

    public float getWidth(boolean withTrailingSpace) {
        throw new RuntimeException("Stub!");
    }

    public float getHeight() {
        throw new RuntimeException("Stub!");
    }

    public int getLineCount() {
        throw new RuntimeException("Stub!");
    }

    public float getLineWidth(int line) {
        throw new RuntimeException("Stub!");
    }

    public float getLineWidth(int line, boolean withIndent, boolean withTrailingSpace) {
        throw new RuntimeException("Stub!");
    }

    public float getLineIndentWidth(int line) {
        throw new RuntimeException("Stub!");
    }

    public float getLineHeight(int line) {
        throw new RuntimeException("Stub!");
    }

    public float getLineBaseline(int line) {
        throw new RuntimeException("Stub!");
    }

    public float getLineTop(int line) {
        throw new RuntimeException("Stub!");
    }

    public float getLineBottom(int line) {
        throw new RuntimeException("Stub!");
    }

    public float getLineAscent(int line) {
        throw new RuntimeException("Stub!");
    }

    public float getLineDescent(int line) {
        throw new RuntimeException("Stub!");
    }

    public int getBeginCharIndex(int line) {
        throw new RuntimeException("Stub!");
    }

    public int getEndCharIndex(int line) {
        throw new RuntimeException("Stub!");
    }

    public int getEndCharIndex(int line, boolean withTrailingSpace) {
        throw new RuntimeException("Stub!");
    }

    public int getLineIndexByCharIndex(int charIndex) {
        throw new RuntimeException("Stub!");
    }

    public int getLineIndexByCoordinate(float coordinateY) {
        throw new RuntimeException("Stub!");
    }

    public float getLineStartPosition(int line) {
        throw new RuntimeException("Stub!");
    }

    public float getLineStartPosition(int line, boolean withIndent) {
        throw new RuntimeException("Stub!");
    }

    public float getLineLeftPosition(int line) {
        throw new RuntimeException("Stub!");
    }

    public float getLineLeftPosition(int line, boolean withIndentOrSpace) {
        throw new RuntimeException("Stub!");
    }

    public float getLineEndPosition(int line) {
        throw new RuntimeException("Stub!");
    }

    public float getLineEndPosition(int line, boolean withTrailingSpace) {
        throw new RuntimeException("Stub!");
    }

    public float getLineRightPosition(int line) {
        throw new RuntimeException("Stub!");
    }

    public float getLineRightPosition(int line, boolean withIndentOrSpace) {
        throw new RuntimeException("Stub!");
    }

    public boolean isRtlLine(int line) {
        throw new RuntimeException("Stub!");
    }

    public boolean isLineWithTab(int line) {
        throw new RuntimeException("Stub!");
    }

    public int getOffsetByCoordinates(float x, float y) {
        throw new RuntimeException("Stub!");
    }

    public int getOffsetByCoordinate(int line, float coordinateX) {
        throw new RuntimeException("Stub!");
    }

    public Point getCursorCoordinates(int offset) {
        throw new RuntimeException("Stub!");
    }

    public float getCursorHorizontalCoordinate(int offset) {
        throw new RuntimeException("Stub!");
    }

    public int getOffsetByMoveDirection(int offset, CursorMoveDirection direction) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/text/TextLayout$CursorMoveDirection.class */
    public enum CursorMoveDirection {
        LEFT,
        RIGHT,
        UP,
        DOWN,
        BEFORE,
        AFTER;

        public int getValue() {
            throw new RuntimeException("Stub!");
        }

        public static CursorMoveDirection getByInt(int enumInt) {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/text/TextLayout$FontPaddingStrategy.class */
    public enum FontPaddingStrategy {
        ONLY_FIRST_AND_LAST_LINE,
        EVERY_LINE,
        NONE;

        public int getValue() {
            throw new RuntimeException("Stub!");
        }

        public static FontPaddingStrategy getByInt(int enumInt) {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/text/TextLayout$HyphenationStrategy.class */
    public enum HyphenationStrategy {
        NONE,
        STANDARD,
        COMPLETE;

        public int getValue() {
            throw new RuntimeException("Stub!");
        }

        public static HyphenationStrategy getByInt(int enumInt) {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/text/TextLayout$JustifyStrategy.class */
    public enum JustifyStrategy {
        NONE,
        USE_WORD_SPACE;

        public int getValue() {
            throw new RuntimeException("Stub!");
        }

        public static JustifyStrategy getByInt(int enumInt) {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/text/TextLayout$LineBreakStrategy.class */
    public enum LineBreakStrategy {
        WORD_WRAP,
        ADVANCED,
        BALANCED;

        public int getValue() {
            throw new RuntimeException("Stub!");
        }

        public static LineBreakStrategy getByInt(int enumInt) {
            throw new RuntimeException("Stub!");
        }
    }
}
