package ohos.global.icu.text;

import ohos.global.icu.text.UnicodeSet;

/* loaded from: ohos3.0.0.1.jar:ohos/global/icu/text/UnicodeSetSpanner.class */
public class UnicodeSetSpanner {

    /* loaded from: ohos3.0.0.1.jar:ohos/global/icu/text/UnicodeSetSpanner$CountMethod.class */
    public enum CountMethod {
        WHOLE_SPAN,
        MIN_ELEMENTS
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/global/icu/text/UnicodeSetSpanner$TrimOption.class */
    public enum TrimOption {
        LEADING,
        BOTH,
        TRAILING
    }

    public UnicodeSetSpanner(UnicodeSet source) {
        throw new RuntimeException("Stub!");
    }

    public UnicodeSet getUnicodeSet() {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object other) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public int countIn(CharSequence sequence) {
        throw new RuntimeException("Stub!");
    }

    public int countIn(CharSequence sequence, CountMethod countMethod) {
        throw new RuntimeException("Stub!");
    }

    public int countIn(CharSequence sequence, CountMethod countMethod, UnicodeSet.SpanCondition spanCondition) {
        throw new RuntimeException("Stub!");
    }

    public String deleteFrom(CharSequence sequence) {
        throw new RuntimeException("Stub!");
    }

    public String deleteFrom(CharSequence sequence, UnicodeSet.SpanCondition spanCondition) {
        throw new RuntimeException("Stub!");
    }

    public String replaceFrom(CharSequence sequence, CharSequence replacement) {
        throw new RuntimeException("Stub!");
    }

    public String replaceFrom(CharSequence sequence, CharSequence replacement, CountMethod countMethod) {
        throw new RuntimeException("Stub!");
    }

    public String replaceFrom(CharSequence sequence, CharSequence replacement, CountMethod countMethod, UnicodeSet.SpanCondition spanCondition) {
        throw new RuntimeException("Stub!");
    }

    public CharSequence trim(CharSequence sequence) {
        throw new RuntimeException("Stub!");
    }

    public CharSequence trim(CharSequence sequence, TrimOption trimOption) {
        throw new RuntimeException("Stub!");
    }

    public CharSequence trim(CharSequence sequence, TrimOption trimOption, UnicodeSet.SpanCondition spanCondition) {
        throw new RuntimeException("Stub!");
    }
}
