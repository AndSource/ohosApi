package ohos.agp.components.element;

import ohos.agp.colors.RgbColor;
import ohos.agp.render.Arc;
import ohos.agp.render.Paint;
import ohos.agp.render.Path;
import ohos.app.Context;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/element/ShapeElement.class */
public class ShapeElement extends Element {
    public static final int ARC = 3;
    public static final int CORNER_END_BOTTOM_X = 4;
    public static final int CORNER_END_BOTTOM_Y = 5;
    public static final int CORNER_END_TOP_X = 2;
    public static final int CORNER_END_TOP_Y = 3;
    public static final int CORNER_LEFT_BOTTOM_X = 6;
    public static final int CORNER_LEFT_BOTTOM_Y = 7;
    public static final int CORNER_LEFT_TOP_X = 0;
    public static final int CORNER_LEFT_TOP_Y = 1;
    public static final int CORNER_RADIUS_ARRAY_SIZE = 8;
    public static final int CORNER_RIGHT_BOTTOM_X = 4;
    public static final int CORNER_RIGHT_BOTTOM_Y = 5;
    public static final int CORNER_RIGHT_TOP_X = 2;
    public static final int CORNER_RIGHT_TOP_Y = 3;
    public static final int CORNER_START_BOTTOM_X = 6;
    public static final int CORNER_START_BOTTOM_Y = 7;
    public static final int CORNER_START_TOP_X = 0;
    public static final int CORNER_START_TOP_Y = 1;
    public static final int LINE = 2;
    public static final int LINEAR_GRADIENT_SHADER_TYPE = 0;
    public static final int OVAL = 1;
    public static final int PATH = 4;
    public static final int RADIAL_GRADIENT_SHADER_TYPE = 1;
    public static final int RECTANGLE = 0;
    public static final int RING = 5;
    public static final int SWEEP_GRADIENT_SHADER_TYPE = 2;
    @Deprecated
    public Path mPath;

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/element/ShapeElement$Orientation.class */
    public enum Orientation {
        TOP_TO_BOTTOM,
        TOP_RIGHT_TO_BOTTOM_LEFT,
        RIGHT_TO_LEFT,
        BOTTOM_RIGHT_TO_TOP_LEFT,
        BOTTOM_TO_TOP,
        BOTTOM_LEFT_TO_TOP_RIGHT,
        LEFT_TO_RIGHT,
        TOP_LEFT_TO_BOTTOM_RIGHT,
        TOP_START_TO_BOTTOM_END,
        START_TO_END,
        BOTTOM_START_TO_TOP_END,
        BOTTOM_END_TO_TOP_START,
        END_TO_START,
        TOP_END_TO_BOTTOM_START
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/element/ShapeElement$RadiusType.class */
    public enum RadiusType {
        PIXELS,
        FRACTION
    }

    public ShapeElement() {
        throw new RuntimeException("Stub!");
    }

    public ShapeElement(RgbColor color) {
        throw new RuntimeException("Stub!");
    }

    public ShapeElement(Orientation orientation, RgbColor[] colors) {
        throw new RuntimeException("Stub!");
    }

    public ShapeElement(Context context, int xmlId) {
        throw new RuntimeException("Stub!");
    }

    public void setRingRadiusProportion(float radiusProportion) {
        throw new RuntimeException("Stub!");
    }

    public float getRingRadiusProportion() {
        throw new RuntimeException("Stub!");
    }

    public void setRingRadius(int radius) {
        throw new RuntimeException("Stub!");
    }

    public int getRingRadius() {
        throw new RuntimeException("Stub!");
    }

    public void setRingThicknessProportion(float thicknessProportion) {
        throw new RuntimeException("Stub!");
    }

    public float getRingThicknessProportion() {
        throw new RuntimeException("Stub!");
    }

    public void setRingThickness(int thickness) {
        throw new RuntimeException("Stub!");
    }

    public int getRingThickness() {
        throw new RuntimeException("Stub!");
    }

    public void setShape(int shape) {
        throw new RuntimeException("Stub!");
    }

    public int getShape() {
        throw new RuntimeException("Stub!");
    }

    public void setShapeSize(int width, int height) {
        throw new RuntimeException("Stub!");
    }

    public void setPadding(int left, int top, int right, int bottom) {
        throw new RuntimeException("Stub!");
    }

    public void setPaddingRtl(int start, int top, int end, int bottom) {
        throw new RuntimeException("Stub!");
    }

    public void setRgbColor(RgbColor color) {
        throw new RuntimeException("Stub!");
    }

    public void setRgbColors(RgbColor[] colors) {
        throw new RuntimeException("Stub!");
    }

    public RgbColor[] getRgbColors() {
        throw new RuntimeException("Stub!");
    }

    public void setStroke(int width, RgbColor color) {
        throw new RuntimeException("Stub!");
    }

    public void setStroke(int width, RgbColor[] colors) {
        throw new RuntimeException("Stub!");
    }

    public void setStroke(int width, RgbColor color, float dashSize, float dashSpace) {
        throw new RuntimeException("Stub!");
    }

    public void setStroke(int width, RgbColor[] colors, float dashSize, float dashSpace) {
        throw new RuntimeException("Stub!");
    }

    public int getStrokeWidth() {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public RgbColor getStrokeColor() {
        throw new RuntimeException("Stub!");
    }

    public RgbColor[] getStrokeColors() {
        throw new RuntimeException("Stub!");
    }

    public void setStrokeCap(Paint.StrokeCap cap) {
        throw new RuntimeException("Stub!");
    }

    public Paint.StrokeCap getStrokeCap() {
        throw new RuntimeException("Stub!");
    }

    public void setStrokeCapEnabled(boolean enable) {
        throw new RuntimeException("Stub!");
    }

    public boolean isStrokeCapEnabled() {
        throw new RuntimeException("Stub!");
    }

    public void setStrokeStops(float[] points) {
        throw new RuntimeException("Stub!");
    }

    public float[] getStrokeStops() {
        throw new RuntimeException("Stub!");
    }

    public void setStrokeShaderType(int type) {
        throw new RuntimeException("Stub!");
    }

    public int getStrokeShaderType() {
        throw new RuntimeException("Stub!");
    }

    public void setStrokeOrientation(Orientation orientation) {
        throw new RuntimeException("Stub!");
    }

    public Orientation getStrokeOrientation() {
        throw new RuntimeException("Stub!");
    }

    public void setStrokeShaderCenter(float x, float y) {
        throw new RuntimeException("Stub!");
    }

    public float[] getStrokeShaderCenter() {
        throw new RuntimeException("Stub!");
    }

    public void setStrokeShaderRadius(float radius, RadiusType type) {
        throw new RuntimeException("Stub!");
    }

    public float getStrokeShaderRadius() {
        throw new RuntimeException("Stub!");
    }

    public RadiusType getStrokeShaderRadiusType() {
        throw new RuntimeException("Stub!");
    }

    public void setCornerRadius(float radius) {
        throw new RuntimeException("Stub!");
    }

    public float getCornerRadius() {
        throw new RuntimeException("Stub!");
    }

    public void setCornerRadiiArray(float[] radii) {
        throw new RuntimeException("Stub!");
    }

    public void setCornerRadiiArray(float[] radii, boolean relative) {
        throw new RuntimeException("Stub!");
    }

    public float[] getCornerRadii() {
        throw new RuntimeException("Stub!");
    }

    public float[] getCornerRadiiResolved() {
        throw new RuntimeException("Stub!");
    }

    public void setShaderType(int type) {
        throw new RuntimeException("Stub!");
    }

    public int getShaderType() {
        throw new RuntimeException("Stub!");
    }

    public void setShaderStops(float[] points) {
        throw new RuntimeException("Stub!");
    }

    public float[] getShaderStops() {
        throw new RuntimeException("Stub!");
    }

    public void setArc(Arc arc) {
        throw new RuntimeException("Stub!");
    }

    public Arc getArc() {
        throw new RuntimeException("Stub!");
    }

    public void setSectorEnabled(boolean enable) {
        throw new RuntimeException("Stub!");
    }

    public boolean isSectorEnabled() {
        throw new RuntimeException("Stub!");
    }

    public void setGradientOrientation(Orientation orientation) {
        throw new RuntimeException("Stub!");
    }

    public Orientation getGradientOrientation() {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public void setOrientation(Orientation orientation) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public Orientation getOrientation() {
        throw new RuntimeException("Stub!");
    }

    public void setPath(Path path) {
        throw new RuntimeException("Stub!");
    }

    public Path getPath() {
        throw new RuntimeException("Stub!");
    }

    public void setDashPathEffectValues(float[] intervals, float phase) {
        throw new RuntimeException("Stub!");
    }

    public float[] getDashPathEffectIntervals() {
        throw new RuntimeException("Stub!");
    }

    public float getDashPathEffectPhase() {
        throw new RuntimeException("Stub!");
    }

    public void setShaderCenter(float x, float y) {
        throw new RuntimeException("Stub!");
    }

    public float[] getShaderCenter() {
        throw new RuntimeException("Stub!");
    }

    public void setShaderRadius(float radius, RadiusType type) {
        throw new RuntimeException("Stub!");
    }

    public float getShaderRadius() {
        throw new RuntimeException("Stub!");
    }

    public RadiusType getShaderRadiusType() {
        throw new RuntimeException("Stub!");
    }

    public Element makeUnique() {
        throw new RuntimeException("Stub!");
    }
}
