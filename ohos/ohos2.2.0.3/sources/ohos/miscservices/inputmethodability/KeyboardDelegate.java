package ohos.miscservices.inputmethodability;

import ohos.miscservices.inputmethod.EditingText;
import ohos.multimodalinput.event.KeyEvent;

/* loaded from: ohos2.2.0.3.jar:ohos/miscservices/inputmethodability/KeyboardDelegate.class */
public interface KeyboardDelegate {
    boolean onKeyDown(KeyEvent keyEvent);

    boolean onKeyUp(KeyEvent keyEvent);

    void onSelectionChanged(int i, int i2, int i3, int i4);

    void onCursorContextChanged(float f, float f2, float f3);

    void onTextChanged(int i, EditingText editingText);
}
