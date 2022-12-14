package ohos.global.icu.text;

import java.text.ParseException;

/* loaded from: ohos3.0.0.1.jar:ohos/global/icu/text/StringPrepParseException.class */
public class StringPrepParseException extends ParseException {
    public static final int ACE_PREFIX_ERROR = 6;
    public static final int BUFFER_OVERFLOW_ERROR = 9;
    public static final int CHECK_BIDI_ERROR = 4;
    public static final int DOMAIN_NAME_TOO_LONG_ERROR = 11;
    public static final int ILLEGAL_CHAR_FOUND = 1;
    public static final int INVALID_CHAR_FOUND = 0;
    public static final int LABEL_TOO_LONG_ERROR = 8;
    public static final int PROHIBITED_ERROR = 2;
    public static final int STD3_ASCII_RULES_ERROR = 5;
    public static final int UNASSIGNED_ERROR = 3;
    public static final int VERIFICATION_ERROR = 7;
    public static final int ZERO_LENGTH_LABEL = 10;

    public StringPrepParseException(String message, int error) {
        super(null, 0);
        throw new RuntimeException("Stub!");
    }

    public StringPrepParseException(String message, int error, String rules, int pos) {
        super(null, 0);
        throw new RuntimeException("Stub!");
    }

    public StringPrepParseException(String message, int error, String rules, int pos, int lineNumber) {
        super(null, 0);
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object other) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    @Override // java.lang.Throwable
    public String toString() {
        throw new RuntimeException("Stub!");
    }

    public int getError() {
        throw new RuntimeException("Stub!");
    }
}
