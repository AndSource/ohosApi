package ohos.global.i18n.phonenumbers;

/* loaded from: ohos3.0.0.1.jar:ohos/global/i18n/phonenumbers/InputFormatter.class */
public abstract class InputFormatter {
    public abstract String inputNumber(char c);

    public abstract int getPosition();

    public abstract void clean();

    public abstract String inputNumberAndRememberPosition(char c);

    public InputFormatter() {
        throw new RuntimeException("Stub!");
    }

    public static InputFormatter getInstance(String regionCode) {
        throw new RuntimeException("Stub!");
    }
}
