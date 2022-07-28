package ohos.agp.components;

import ohos.agp.components.element.Element;
import ohos.agp.utils.Color;
import ohos.app.Context;

/* loaded from: ohos2.1.1.21.jar:ohos/agp/components/AbsButton.class */
public abstract class AbsButton extends Button {

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/components/AbsButton$CheckedStateChangedListener.class */
    public interface CheckedStateChangedListener {
        void onCheckedChanged(AbsButton absButton, boolean z);
    }

    public AbsButton(Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public AbsButton(Context context, AttrSet attrSet) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public AbsButton(Context context, AttrSet attrSet, String styleName) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public void setChecked(boolean value) {
        throw new RuntimeException("Stub!");
    }

    public boolean isChecked() {
        throw new RuntimeException("Stub!");
    }

    public void setCheckedStateChangedListener(CheckedStateChangedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void toggle() {
        throw new RuntimeException("Stub!");
    }

    public Color getTextColorOn() {
        throw new RuntimeException("Stub!");
    }

    public Color getTextColorOff() {
        throw new RuntimeException("Stub!");
    }

    public void setTextColorOn(Color color) {
        throw new RuntimeException("Stub!");
    }

    public void setTextColorOff(Color color) {
        throw new RuntimeException("Stub!");
    }

    public void setButtonElement(Element element) {
        throw new RuntimeException("Stub!");
    }

    public Element getButtonElement() {
        throw new RuntimeException("Stub!");
    }
}
