package ohos.global.icu.text;

import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Locale;
import ohos.global.icu.text.PluralRules;
import ohos.global.icu.util.ULocale;

/* loaded from: ohos3.0.0.1.jar:ohos/global/icu/text/PluralFormat.class */
public class PluralFormat extends UFormat {
    public PluralFormat() {
        throw new RuntimeException("Stub!");
    }

    public PluralFormat(ULocale ulocale) {
        throw new RuntimeException("Stub!");
    }

    public PluralFormat(Locale locale) {
        throw new RuntimeException("Stub!");
    }

    public PluralFormat(PluralRules rules) {
        throw new RuntimeException("Stub!");
    }

    public PluralFormat(ULocale ulocale, PluralRules rules) {
        throw new RuntimeException("Stub!");
    }

    public PluralFormat(Locale locale, PluralRules rules) {
        throw new RuntimeException("Stub!");
    }

    public PluralFormat(ULocale ulocale, PluralRules.PluralType type) {
        throw new RuntimeException("Stub!");
    }

    public PluralFormat(Locale locale, PluralRules.PluralType type) {
        throw new RuntimeException("Stub!");
    }

    public PluralFormat(String pattern) {
        throw new RuntimeException("Stub!");
    }

    public PluralFormat(ULocale ulocale, String pattern) {
        throw new RuntimeException("Stub!");
    }

    public PluralFormat(PluralRules rules, String pattern) {
        throw new RuntimeException("Stub!");
    }

    public PluralFormat(ULocale ulocale, PluralRules rules, String pattern) {
        throw new RuntimeException("Stub!");
    }

    public PluralFormat(ULocale ulocale, PluralRules.PluralType type, String pattern) {
        throw new RuntimeException("Stub!");
    }

    public void applyPattern(String pattern) {
        throw new RuntimeException("Stub!");
    }

    public String toPattern() {
        throw new RuntimeException("Stub!");
    }

    public final String format(double number) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.text.Format
    public StringBuffer format(Object number, StringBuffer toAppendTo, FieldPosition pos) {
        throw new RuntimeException("Stub!");
    }

    public Number parse(String text, ParsePosition parsePosition) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.text.Format
    public Object parseObject(String source, ParsePosition pos) {
        throw new RuntimeException("Stub!");
    }

    public void setNumberFormat(NumberFormat format) {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object rhs) {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(PluralFormat rhs) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
