package ohos.miscservices.inputmethod;

import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.2.0.3.jar:ohos/miscservices/inputmethod/EditorAttribute.class */
public class EditorAttribute implements Sequenceable {
    public static final int ENTER_KEY_TYPE_DONE = 4;
    public static final int ENTER_KEY_TYPE_GO = 2;
    public static final int ENTER_KEY_TYPE_NEXT = 5;
    public static final int ENTER_KEY_TYPE_PREVIOUS = 6;
    public static final int ENTER_KEY_TYPE_SEARCH = 1;
    public static final int ENTER_KEY_TYPE_SEND = 3;
    public static final int ENTER_KEY_TYPE_UNSPECIFIED = 0;
    public static final int OPTION_ASCII = 32;
    public static final int OPTION_AUTO_CAP_CHARACTERS = 2;
    public static final int OPTION_AUTO_CAP_SENTENCES = 8;
    public static final int OPTION_AUTO_CAP_WORDS = 4;
    public static final int OPTION_MULTI_LINE = 1;
    public static final int OPTION_NONE = 0;
    public static final int OPTION_NO_FULLSCREEN = 16;
    public static final int PATTERN_DATETIME = 4;
    public static final int PATTERN_EMAIL = 6;
    public static final int PATTERN_NULL = 0;
    public static final int PATTERN_NUMBER = 2;
    public static final int PATTERN_PASSWORD = 7;
    public static final int PATTERN_PHONE = 3;
    public static final int PATTERN_TEXT = 1;
    public static final int PATTERN_URI = 5;

    public EditorAttribute() {
        throw new RuntimeException("Stub!");
    }

    public int getInputPattern() {
        throw new RuntimeException("Stub!");
    }

    public void setInputPattern(int pattern) {
        throw new RuntimeException("Stub!");
    }

    public int getEnterKeyType() {
        throw new RuntimeException("Stub!");
    }

    public void setEnterKeyType(int type) {
        throw new RuntimeException("Stub!");
    }

    public void setInputOption(int option) {
        throw new RuntimeException("Stub!");
    }

    public int getInputOption() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean marshalling(Parcel out) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean unmarshalling(Parcel in) {
        throw new RuntimeException("Stub!");
    }
}
