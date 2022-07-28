package ohos.agp.components.element;

import ohos.agp.render.BlendMode;
import ohos.agp.render.Canvas;
import ohos.agp.render.ColorMatrix;
import ohos.agp.utils.Rect;

/* loaded from: ohos2.2.0.3.jar:ohos/agp/components/element/Element.class */
public abstract class Element {
    public static final int ALPHA_DEFAULT = 255;
    public static final int ALPHA_MAX = 255;
    public static final int ALPHA_MIN = 0;
    public static final Rect DEFAULT_BOUNDS_RECT = null;

    /* loaded from: ohos2.2.0.3.jar:ohos/agp/components/element/Element$OnChangeListener.class */
    public interface OnChangeListener {
        void onChange(Element element);
    }

    public Element() {
        throw new RuntimeException("Stub!");
    }

    public Element(Object source) {
        throw new RuntimeException("Stub!");
    }

    public void setAlpha(int alpha) {
        throw new RuntimeException("Stub!");
    }

    public int getAlpha() {
        throw new RuntimeException("Stub!");
    }

    public void drawToCanvas(Canvas canvas) {
        throw new RuntimeException("Stub!");
    }

    public boolean setVisible(boolean visible, boolean restart) {
        throw new RuntimeException("Stub!");
    }

    public boolean getVisible() {
        throw new RuntimeException("Stub!");
    }

    public boolean isStateful() {
        throw new RuntimeException("Stub!");
    }

    public Element getCurrentElement() {
        throw new RuntimeException("Stub!");
    }

    public void release() {
        throw new RuntimeException("Stub!");
    }

    public void setBounds(int left, int top, int right, int bottom) {
        throw new RuntimeException("Stub!");
    }

    public void setBounds(Rect bounds) {
        throw new RuntimeException("Stub!");
    }

    public final Rect getBounds() {
        throw new RuntimeException("Stub!");
    }

    public int getWidth() {
        throw new RuntimeException("Stub!");
    }

    public int getHeight() {
        throw new RuntimeException("Stub!");
    }

    public int getMinWidth() {
        throw new RuntimeException("Stub!");
    }

    public int getMinHeight() {
        throw new RuntimeException("Stub!");
    }

    public void setColorMatrix(ColorMatrix matrix) {
        throw new RuntimeException("Stub!");
    }

    public ColorMatrix getColorMatrix() {
        throw new RuntimeException("Stub!");
    }

    public void clearColorMatrix() {
        throw new RuntimeException("Stub!");
    }

    public void setStateColorList(int[][] colorState, int[] colors) {
        throw new RuntimeException("Stub!");
    }

    public void setStateColorMode(BlendMode mode) {
        throw new RuntimeException("Stub!");
    }

    public void setCallback(OnChangeListener listener) {
        throw new RuntimeException("Stub!");
    }

    public OnChangeListener getCallback() {
        throw new RuntimeException("Stub!");
    }

    public void skipAnimation() {
        throw new RuntimeException("Stub!");
    }

    public void setInheritDirection(boolean followRTL) {
        throw new RuntimeException("Stub!");
    }

    public boolean isInheritDirection() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/agp/components/element/Element$ConstantState.class */
    public static abstract class ConstantState {
        public ConstantState() {
            throw new RuntimeException("Stub!");
        }
    }
}
