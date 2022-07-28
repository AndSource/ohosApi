package ohos.agp.components.element;

import ohos.agp.colors.RgbColor;
import ohos.agp.render.Arc;
import ohos.agp.render.Path;
import ohos.app.Context;

/* loaded from: ohos2.2.0.3.jar:ohos/agp/components/element/ShapeElement.class */
public class ShapeElement extends Element {
    public static final int ARC = 3;
    public static final int LINE = 2;
    public static final int LINEAR_GRADIENT_SHADER_TYPE = 0;
    public static final int OVAL = 1;
    public static final int PATH = 4;
    public static final int RADIAL_GRADIENT_SHADER_TYPE = 1;
    public static final int RECTANGLE = 0;
    public static final int SWEEP_GRADIENT_SHADER_TYPE = 2;
    public Path mPath;

    /* loaded from: ohos2.2.0.3.jar:ohos/agp/components/element/ShapeElement$Orientation.class */
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

    public ShapeElement() {
        throw new RuntimeException("Stub!");
    }

    public ShapeElement(Context context, int xmlId) {
        throw new RuntimeException("Stub!");
    }

    public void setShape(int shape) {
        throw new RuntimeException("Stub!");
    }

    public int getShape() {
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

    public int getStrokeWidth() {
        throw new RuntimeException("Stub!");
    }

    public RgbColor getStrokeColor() {
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

    public float[] getCornerRadii() {
        throw new RuntimeException("Stub!");
    }

    public void setShaderType(int type) {
        throw new RuntimeException("Stub!");
    }

    public int getShaderType() {
        throw new RuntimeException("Stub!");
    }

    public void setArc(Arc arc) {
        throw new RuntimeException("Stub!");
    }

    public Arc getArc() {
        throw new RuntimeException("Stub!");
    }

    public void setGradientOrientation(Orientation orientation) {
        throw new RuntimeException("Stub!");
    }

    public Orientation getGradientOrientation() {
        throw new RuntimeException("Stub!");
    }

    public void setOrientation(Orientation orientation) {
        throw new RuntimeException("Stub!");
    }

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
}
