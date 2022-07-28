package ohos.agp.components.element;

import ohos.agp.components.element.Element;

/* loaded from: ohos2.2.0.3.jar:ohos/agp/components/element/ElementContainer.class */
public class ElementContainer extends Element {
    public ElementContainer() {
        throw new RuntimeException("Stub!");
    }

    public void setEnterFadeDuration(int ms) {
        throw new RuntimeException("Stub!");
    }

    public void setExitFadeDuration(int ms) {
        throw new RuntimeException("Stub!");
    }

    public int getFadeInEffectPeriod() {
        throw new RuntimeException("Stub!");
    }

    public int getFadeOutEffectPeriod() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.element.Element
    public boolean isStateful() {
        throw new RuntimeException("Stub!");
    }

    public boolean selectElement(int index) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.element.Element
    public Element getCurrentElement() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.element.Element
    public void skipAnimation() {
        throw new RuntimeException("Stub!");
    }

    public ElementState getElementState() {
        throw new RuntimeException("Stub!");
    }

    public void setElementState(ElementState state) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/agp/components/element/ElementContainer$ElementState.class */
    public static class ElementState extends Element.ConstantState {
        public ElementState() {
            throw new RuntimeException("Stub!");
        }

        public ElementState(ElementContainer container) {
            throw new RuntimeException("Stub!");
        }

        public final int addChildElement(Element element) {
            throw new RuntimeException("Stub!");
        }

        public final Element getChildElement(int index) {
            throw new RuntimeException("Stub!");
        }

        public final int getChildElementCount() {
            throw new RuntimeException("Stub!");
        }
    }
}
