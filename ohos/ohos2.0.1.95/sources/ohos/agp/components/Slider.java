package ohos.agp.components;

import ohos.agp.components.Component;
import ohos.agp.components.element.Element;
import ohos.app.Context;

/* loaded from: ohos2.0.1.95.jar:ohos/agp/components/Slider.class */
public class Slider extends AbsSlider {
    protected ValueChangedListener mValueChangedListener;

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/components/Slider$ValueChangedListener.class */
    public interface ValueChangedListener {
        void onProgressUpdated(Slider slider, int i, boolean z);

        void onTouchStart(Slider slider);

        void onTouchEnd(Slider slider);
    }

    public Slider(Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public Slider(Context context, AttrSet attrSet) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public Slider(Context context, AttrSet attrSet, String styleName) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public void setValueChangedListener(ValueChangedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public ValueChangedListener getValueChangedListener() {
        throw new RuntimeException("Stub!");
    }

    public void setIncreaseButton(Element element, Component.ClickedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void setIncreaseButtonElement(Element element) {
        throw new RuntimeException("Stub!");
    }

    public void setIncreaseButtonClickedListener(Component.ClickedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public Component.ClickedListener getIncreaseButtonClickedListener() {
        throw new RuntimeException("Stub!");
    }

    public Element getIncreaseButton() {
        throw new RuntimeException("Stub!");
    }

    public void setDecreaseButton(Element element, Component.ClickedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void setDecreaseButtonElement(Element element) {
        throw new RuntimeException("Stub!");
    }

    public void setDecreaseButtonClickedListener(Component.ClickedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public Component.ClickedListener getDecreaseButtonClickedListener() {
        throw new RuntimeException("Stub!");
    }

    public Element getDecreaseButton() {
        throw new RuntimeException("Stub!");
    }

    public void setAdjustButtons(Element increaseElement, Component.ClickedListener increaseListener, Element decreaseElement, Component.ClickedListener decreaseListener) {
        throw new RuntimeException("Stub!");
    }

    public Element[] getAdjustButtonsElements() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.AbsSlider
    public Element getThumbElement() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.AbsSlider
    public void setThumbElement(Element element) {
        throw new RuntimeException("Stub!");
    }
}
