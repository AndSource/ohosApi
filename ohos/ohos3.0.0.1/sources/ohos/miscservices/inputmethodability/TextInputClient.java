package ohos.miscservices.inputmethodability;

import ohos.miscservices.inputmethod.EditingCapability;
import ohos.miscservices.inputmethod.EditingText;
import ohos.miscservices.inputmethod.EditorAttribute;
import ohos.miscservices.inputmethod.RichContent;
import ohos.multimodalinput.event.KeyEvent;

/* loaded from: ohos3.0.0.1.jar:ohos/miscservices/inputmethodability/TextInputClient.class */
public final class TextInputClient {
    TextInputClient() {
        throw new RuntimeException("Stub!");
    }

    public EditorAttribute getEditorAttribute() {
        throw new RuntimeException("Stub!");
    }

    public boolean insertText(String text) {
        throw new RuntimeException("Stub!");
    }

    public boolean insertRichContent(RichContent richContent) {
        throw new RuntimeException("Stub!");
    }

    public boolean deleteBackward(int length) {
        throw new RuntimeException("Stub!");
    }

    public boolean deleteForward(int length) {
        throw new RuntimeException("Stub!");
    }

    public String getForward(int length) {
        throw new RuntimeException("Stub!");
    }

    public String getBackward(int length) {
        throw new RuntimeException("Stub!");
    }

    public boolean subscribeEditingText(int token, EditingCapability capability) {
        throw new RuntimeException("Stub!");
    }

    public EditingText getEditingText(int token, EditingCapability capability) {
        throw new RuntimeException("Stub!");
    }

    public boolean unsubscribeEditingText(int token) {
        throw new RuntimeException("Stub!");
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        throw new RuntimeException("Stub!");
    }

    public boolean sendKeyFunction(int action) {
        throw new RuntimeException("Stub!");
    }

    public boolean selectText(int startPos, int endPos) {
        throw new RuntimeException("Stub!");
    }

    public boolean requestCurrentCursorContext() {
        throw new RuntimeException("Stub!");
    }

    public boolean subscribeCursorContext() {
        throw new RuntimeException("Stub!");
    }

    public boolean unsubscribeCursorContext() {
        throw new RuntimeException("Stub!");
    }

    public int getAutoCapitalizeMode(int reqModes) {
        throw new RuntimeException("Stub!");
    }

    public boolean reviseText(int startOffset, String originalText, String correctedText) {
        throw new RuntimeException("Stub!");
    }

    public boolean markText(int start, int end) {
        throw new RuntimeException("Stub!");
    }

    public boolean unmarkText() {
        throw new RuntimeException("Stub!");
    }

    public boolean replaceMarkedText(String text) {
        throw new RuntimeException("Stub!");
    }
}
