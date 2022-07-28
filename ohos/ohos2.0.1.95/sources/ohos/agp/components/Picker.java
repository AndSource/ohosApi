package ohos.agp.components;

import ohos.agp.components.ComponentContainer;
import ohos.agp.components.element.Element;
import ohos.agp.text.Font;
import ohos.agp.utils.Color;
import ohos.app.Context;

/* loaded from: ohos2.0.1.95.jar:ohos/agp/components/Picker.class */
public class Picker extends DirectionalLayout {

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/components/Picker$ElementFormatter.class */
    public interface ElementFormatter {
        Element leftElement(int i);

        Element rightElement(int i);
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/components/Picker$Formatter.class */
    public interface Formatter {
        String format(int i);
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/components/Picker$ScrolledListener.class */
    public interface ScrolledListener {
        public static final int STATE_DRAGGING = 1;
        public static final int STATE_FLING = 2;
        public static final int STATE_HALT = 0;

        void onScrollStateUpdated(Picker picker, int i);
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/components/Picker$ValueChangedListener.class */
    public interface ValueChangedListener {
        void onValueChanged(Picker picker, int i, int i2);
    }

    public Picker(Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public Picker(Context context, AttrSet attrSet) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public Picker(Context context, AttrSet attrSet, String styleName) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public void setSelectorItemNum(int itemNum) {
        throw new RuntimeException("Stub!");
    }

    public void setValue(int value) {
        throw new RuntimeException("Stub!");
    }

    public void setMaxValue(int maxValue) {
        throw new RuntimeException("Stub!");
    }

    public void setMinValue(int minValue) {
        throw new RuntimeException("Stub!");
    }

    public void setNormalTextSize(int textSize) {
        throw new RuntimeException("Stub!");
    }

    public void setSelectedTextSize(int textSize) {
        throw new RuntimeException("Stub!");
    }

    public void setNormalTextColor(Color color) {
        throw new RuntimeException("Stub!");
    }

    public void setSelectedTextColor(Color color) {
        throw new RuntimeException("Stub!");
    }

    public void setNormalTextFont(Font font) {
        throw new RuntimeException("Stub!");
    }

    public Font getNormalTextFont() {
        throw new RuntimeException("Stub!");
    }

    public void setSelectedTextFont(Font font) {
        throw new RuntimeException("Stub!");
    }

    public Font getSelectedTextFont() {
        throw new RuntimeException("Stub!");
    }

    public void setSelectedNormalTextMarginRatio(float textMarginRatio) {
        throw new RuntimeException("Stub!");
    }

    public void setShaderColor(Color color) {
        throw new RuntimeException("Stub!");
    }

    public boolean setWheelModeEnabled(boolean isEnabled) {
        throw new RuntimeException("Stub!");
    }

    public void setDisplayedData(String[] displayedData) {
        throw new RuntimeException("Stub!");
    }

    public void setFormatter(Formatter formatter) {
        throw new RuntimeException("Stub!");
    }

    public Formatter getFormatter() {
        throw new RuntimeException("Stub!");
    }

    public void setDisplayedLinesElements(Element top, Element bottom) {
        throw new RuntimeException("Stub!");
    }

    public Element[] getDisplayedLinesElements() {
        throw new RuntimeException("Stub!");
    }

    public void setDisplayedLinesTopElement(Element top) {
        throw new RuntimeException("Stub!");
    }

    public void setDisplayedLinesBottomElement(Element bottom) {
        throw new RuntimeException("Stub!");
    }

    public void setElementFormatter(ElementFormatter formatter) {
        throw new RuntimeException("Stub!");
    }

    public ElementFormatter getElementFormatter() {
        throw new RuntimeException("Stub!");
    }

    public void setSelectedTextBackground(Element element) {
        throw new RuntimeException("Stub!");
    }

    public Element getSelectedTextBackgroundElement() {
        throw new RuntimeException("Stub!");
    }

    public void setCompoundElementPadding(int padding) {
        throw new RuntimeException("Stub!");
    }

    public void setValueChangedListener(ValueChangedListener valueChangedListener) {
        throw new RuntimeException("Stub!");
    }

    public ValueChangedListener getValueChangedListener() {
        throw new RuntimeException("Stub!");
    }

    public void setScrollListener(ScrolledListener scrollListener) {
        throw new RuntimeException("Stub!");
    }

    public ScrolledListener getScrollListener() {
        throw new RuntimeException("Stub!");
    }

    public int getSelectorItemNum() {
        throw new RuntimeException("Stub!");
    }

    public int getValue() {
        throw new RuntimeException("Stub!");
    }

    public int getMaxValue() {
        throw new RuntimeException("Stub!");
    }

    public int getMinValue() {
        throw new RuntimeException("Stub!");
    }

    public int getNormalTextSize() {
        throw new RuntimeException("Stub!");
    }

    public int getSelectedTextSize() {
        throw new RuntimeException("Stub!");
    }

    public Color getNormalTextColor() {
        throw new RuntimeException("Stub!");
    }

    public Color getSelectedTextColor() {
        throw new RuntimeException("Stub!");
    }

    public float getSelectedNormalTextMarginRatio() {
        throw new RuntimeException("Stub!");
    }

    public Color getShaderColor() {
        throw new RuntimeException("Stub!");
    }

    public boolean isWheelModeEnabled() {
        throw new RuntimeException("Stub!");
    }

    public String[] getDisplayedData() {
        throw new RuntimeException("Stub!");
    }

    public Element getDisplayedTopElement() {
        throw new RuntimeException("Stub!");
    }

    public Element getDisplayedBottomElement() {
        throw new RuntimeException("Stub!");
    }

    public int getCompoundElementPadding() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.DirectionalLayout
    public void setOrientation(int orientation) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.DirectionalLayout, ohos.agp.components.ComponentContainer
    public ComponentContainer.LayoutConfig createLayoutConfig(Context context, AttrSet attrSet) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.DirectionalLayout
    public int getOrientation() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.DirectionalLayout
    public void setTotalWeight(float totalWeight) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.DirectionalLayout
    public float getTotalWeight() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.DirectionalLayout, ohos.agp.components.ComponentContainer, ohos.agp.components.ComponentParent
    public ComponentContainer.LayoutConfig verifyLayoutConfig(ComponentContainer.LayoutConfig config) {
        throw new RuntimeException("Stub!");
    }
}
