package ohos.global.icu.text;

/* loaded from: ohos2.0.1.95.jar:ohos/global/icu/text/DisplayContext.class */
public enum DisplayContext {
    STANDARD_NAMES,
    DIALECT_NAMES,
    CAPITALIZATION_NONE,
    CAPITALIZATION_FOR_MIDDLE_OF_SENTENCE,
    CAPITALIZATION_FOR_BEGINNING_OF_SENTENCE,
    CAPITALIZATION_FOR_UI_LIST_OR_MENU,
    CAPITALIZATION_FOR_STANDALONE,
    LENGTH_FULL,
    LENGTH_SHORT,
    SUBSTITUTE,
    NO_SUBSTITUTE;

    /* loaded from: ohos2.0.1.95.jar:ohos/global/icu/text/DisplayContext$Type.class */
    public enum Type {
        DIALECT_HANDLING,
        CAPITALIZATION,
        DISPLAY_LENGTH,
        SUBSTITUTE_HANDLING
    }

    public Type type() {
        throw new RuntimeException("Stub!");
    }

    public int value() {
        throw new RuntimeException("Stub!");
    }
}
