package ohos.agp.render;

import java.util.Locale;
import ohos.agp.text.Font;
import ohos.agp.utils.Color;
import ohos.agp.utils.Point;
import ohos.agp.utils.Rect;
import ohos.global.configuration.LocaleProfile;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/render/Paint.class */
public class Paint {
    public int baselineOffset;
    public Color color;
    public float[] dashPathEffectIntervals;
    public Color[] gradientShaderColor;

    public Paint() {
        throw new RuntimeException("Stub!");
    }

    public Paint(Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void set(Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void setStyle(Style style) {
        throw new RuntimeException("Stub!");
    }

    public Style getStyle() {
        throw new RuntimeException("Stub!");
    }

    public void setDither(boolean dither) {
        throw new RuntimeException("Stub!");
    }

    public boolean getDither() {
        throw new RuntimeException("Stub!");
    }

    public void setFilterBitmap(boolean filter) {
        throw new RuntimeException("Stub!");
    }

    public boolean getFilterBitmap() {
        throw new RuntimeException("Stub!");
    }

    public void setStrokeCap(StrokeCap cap) {
        throw new RuntimeException("Stub!");
    }

    public StrokeCap getStrokeCap() {
        throw new RuntimeException("Stub!");
    }

    public void setStrokeWidth(float width) {
        throw new RuntimeException("Stub!");
    }

    public float getStrokeWidth() {
        throw new RuntimeException("Stub!");
    }

    public float getAngle() {
        throw new RuntimeException("Stub!");
    }

    public void setColor(Color newColor) {
        throw new RuntimeException("Stub!");
    }

    public Color getColor() {
        throw new RuntimeException("Stub!");
    }

    public void setGradientShaderColor(Color[] newGradientShaderColor) {
        throw new RuntimeException("Stub!");
    }

    public Color[] getGradientShaderColor() {
        throw new RuntimeException("Stub!");
    }

    public void setDashPathEffectIntervals(float[] intervals) {
        throw new RuntimeException("Stub!");
    }

    public float[] getDashPathEffectIntervals() {
        throw new RuntimeException("Stub!");
    }

    public int getDashIntervalCount() {
        throw new RuntimeException("Stub!");
    }

    public void setDashPathEffectPhase(float phase) {
        throw new RuntimeException("Stub!");
    }

    public float getDashPathEffectPhase() {
        throw new RuntimeException("Stub!");
    }

    public void setAntiAlias(boolean flag) {
        throw new RuntimeException("Stub!");
    }

    public final boolean isAntiAlias() {
        throw new RuntimeException("Stub!");
    }

    public void setFakeBoldText(boolean flag) {
        throw new RuntimeException("Stub!");
    }

    public final boolean isFakeBoldText() {
        throw new RuntimeException("Stub!");
    }

    public FontMetrics getFontMetrics() {
        throw new RuntimeException("Stub!");
    }

    public void setAlpha(float alpha) {
        throw new RuntimeException("Stub!");
    }

    public float getAlpha() {
        throw new RuntimeException("Stub!");
    }

    public void setColorMatrix(ColorMatrix matrix) {
        throw new RuntimeException("Stub!");
    }

    public ColorMatrix getColorMatrix() {
        throw new RuntimeException("Stub!");
    }

    public Rect getTextBounds(String text) {
        throw new RuntimeException("Stub!");
    }

    public void setFont(Font font) {
        throw new RuntimeException("Stub!");
    }

    public Font getFont() {
        throw new RuntimeException("Stub!");
    }

    public void setTextAlign(int align) {
        throw new RuntimeException("Stub!");
    }

    public int getTextAlign() {
        throw new RuntimeException("Stub!");
    }

    public void setTextSize(int textSize) {
        throw new RuntimeException("Stub!");
    }

    public int getTextSize() {
        throw new RuntimeException("Stub!");
    }

    public void setMaxLines(int maxLines) {
        throw new RuntimeException("Stub!");
    }

    public int getMaxLines() {
        throw new RuntimeException("Stub!");
    }

    public void setMultipleLine(boolean multiple) {
        throw new RuntimeException("Stub!");
    }

    public boolean isMultipleLine() {
        throw new RuntimeException("Stub!");
    }

    public float getLineHeightCoefficient() {
        throw new RuntimeException("Stub!");
    }

    public float getLineHeightOffset() {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public void setPosition(Point point) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public Point getPosition() {
        throw new RuntimeException("Stub!");
    }

    public void setCornerPathEffectRadius(float cornerRadius) {
        throw new RuntimeException("Stub!");
    }

    public float getCornerPathEffectRadius() {
        throw new RuntimeException("Stub!");
    }

    public void setShader(Shader newShader, ShaderType type) {
        throw new RuntimeException("Stub!");
    }

    public Shader getShader() {
        throw new RuntimeException("Stub!");
    }

    public float measureText(String text) {
        throw new RuntimeException("Stub!");
    }

    public BlendMode setBlendMode(BlendMode mode) {
        throw new RuntimeException("Stub!");
    }

    public BlendMode getBlendMode() {
        throw new RuntimeException("Stub!");
    }

    public void setStrokeJoin(Join join) {
        throw new RuntimeException("Stub!");
    }

    public Join getStrokeJoin() {
        throw new RuntimeException("Stub!");
    }

    public void setBlurDrawLooper(BlurDrawLooper looper) {
        throw new RuntimeException("Stub!");
    }

    public void clearBlurDrawLooper() {
        throw new RuntimeException("Stub!");
    }

    public void setPathEffect(PathEffect pathEffect) {
        throw new RuntimeException("Stub!");
    }

    public PathEffect getPathEffect() {
        throw new RuntimeException("Stub!");
    }

    public int getDisplayNumber(String text, boolean isMeasuredForwards, float maxWidth, float[] measuredWidth) {
        throw new RuntimeException("Stub!");
    }

    public int getAdvanceWidths(String text, float[] widths) {
        throw new RuntimeException("Stub!");
    }

    public float ascent() {
        throw new RuntimeException("Stub!");
    }

    public float descent() {
        throw new RuntimeException("Stub!");
    }

    public void horizontalZoom(float zoomH) {
        throw new RuntimeException("Stub!");
    }

    public void horizontalTilt(float tiltH) {
        throw new RuntimeException("Stub!");
    }

    public void setStrikeThrough(boolean isStrikeThrough) {
        throw new RuntimeException("Stub!");
    }

    public void setUnderLine(boolean isUnderLine) {
        throw new RuntimeException("Stub!");
    }

    public void setSubpixelAntiAlias(boolean isSubpixel) {
        throw new RuntimeException("Stub!");
    }

    public void addTextToPath(String text, float xCoor, float yCoor, Path path) {
        throw new RuntimeException("Stub!");
    }

    public void setStrokeMiter(float miter) {
        throw new RuntimeException("Stub!");
    }

    public void setMaskFilter(MaskFilter maskFilter) {
        throw new RuntimeException("Stub!");
    }

    public MaskFilter getMaskFilter() {
        throw new RuntimeException("Stub!");
    }

    public void setColorFilter(ColorFilter colorFilter) {
        throw new RuntimeException("Stub!");
    }

    public ColorFilter getColorFilter() {
        throw new RuntimeException("Stub!");
    }

    public boolean getFillPath(Path src, Path dst) {
        throw new RuntimeException("Stub!");
    }

    public float getRecommendedLineSpacing() {
        throw new RuntimeException("Stub!");
    }

    public void setLetterSpacing(float spacing) {
        throw new RuntimeException("Stub!");
    }

    public final boolean isUnderLined() {
        throw new RuntimeException("Stub!");
    }

    public void reset() {
        throw new RuntimeException("Stub!");
    }

    public void setFontFeatures(String fontFeatures) {
        throw new RuntimeException("Stub!");
    }

    public String getFontFeatures() {
        throw new RuntimeException("Stub!");
    }

    public void setLocales(LocaleProfile locales) {
        throw new RuntimeException("Stub!");
    }

    public LocaleProfile getLocales() {
        throw new RuntimeException("Stub!");
    }

    public void setPrimaryLocale(Locale locale) {
        throw new RuntimeException("Stub!");
    }

    public Locale getPrimaryLocale() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/render/Paint$FontMetrics.class */
    public static class FontMetrics {
        public float ascent;
        public float bottom;
        public float descent;
        public float leading;
        public float top;

        public FontMetrics(float top, float ascent, float descent, float bottom, float leading) {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/render/Paint$Join.class */
    public enum Join {
        MITER_JOIN,
        ROUND_JOIN,
        BEVEL_JOIN;

        public int value() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/render/Paint$MaskType.class */
    public enum MaskType {
        NONE_MASK,
        RECTANGLE_MASK,
        ROUNDEDRECTANGLE_MASK,
        TRIANGLE_MASK,
        CIRCLE_MASK;

        public int value() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/render/Paint$ShaderType.class */
    public enum ShaderType {
        LINEAR_SHADER,
        SWEEP_SHADER,
        RADIAL_SHADER,
        PIXELMAP_SHADER,
        GROUP_SHADER;

        public int value() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/render/Paint$StrokeCap.class */
    public enum StrokeCap {
        BUTT_CAP,
        ROUND_CAP,
        SQUARE_CAP;

        public int value() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/render/Paint$Style.class */
    public enum Style {
        FILL_STYLE,
        STROKE_STYLE,
        FILLANDSTROKE_STYLE;

        public int value() {
            throw new RuntimeException("Stub!");
        }
    }
}
