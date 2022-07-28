package ohos.multimodalinput.event;

/* loaded from: ohos3.0.0.1.jar:ohos/multimodalinput/event/KeyBoardEvent.class */
public abstract class KeyBoardEvent extends KeyEvent {
    public abstract boolean isNoncharacterKeyPressed(int i);

    public abstract boolean isNoncharacterKeyPressed(int i, int i2);

    public abstract boolean isNoncharacterKeyPressed(int i, int i2, int i3);

    public abstract int getUnicode();

    public KeyBoardEvent() {
        throw new RuntimeException("Stub!");
    }

    public void enableIme() {
        throw new RuntimeException("Stub!");
    }

    public void disableIme() {
        throw new RuntimeException("Stub!");
    }

    public boolean isHandledByIme() {
        throw new RuntimeException("Stub!");
    }
}
