package ohos.global.icu.text;

import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Locale;
import ohos.global.icu.util.Measure;
import ohos.global.icu.util.MeasureUnit;
import ohos.global.icu.util.ULocale;

/* loaded from: ohos2.1.1.21.jar:ohos/global/icu/text/MeasureFormat.class */
public class MeasureFormat extends UFormat {

    /* loaded from: ohos2.1.1.21.jar:ohos/global/icu/text/MeasureFormat$FormatWidth.class */
    public enum FormatWidth {
        WIDE,
        SHORT,
        NARROW,
        NUMERIC
    }

    MeasureFormat(ULocale locale, FormatWidth formatWidth) {
        throw new RuntimeException("Stub!");
    }

    public static MeasureFormat getInstance(ULocale locale, FormatWidth formatWidth) {
        throw new RuntimeException("Stub!");
    }

    public static MeasureFormat getInstance(Locale locale, FormatWidth formatWidth) {
        throw new RuntimeException("Stub!");
    }

    public static MeasureFormat getInstance(ULocale locale, FormatWidth formatWidth, NumberFormat format) {
        throw new RuntimeException("Stub!");
    }

    public static MeasureFormat getInstance(Locale locale, FormatWidth formatWidth, NumberFormat format) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.text.Format
    public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition fpos) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.text.Format
    public Measure parseObject(String source, ParsePosition pos) {
        throw new RuntimeException("Stub!");
    }

    public final String formatMeasures(Measure... measures) {
        throw new RuntimeException("Stub!");
    }

    public StringBuilder formatMeasurePerUnit(Measure measure, MeasureUnit perUnit, StringBuilder appendTo, FieldPosition pos) {
        throw new RuntimeException("Stub!");
    }

    public StringBuilder formatMeasures(StringBuilder appendTo, FieldPosition fpos, Measure... measures) {
        throw new RuntimeException("Stub!");
    }

    public String getUnitDisplayName(MeasureUnit unit) {
        throw new RuntimeException("Stub!");
    }

    public final boolean equals(Object other) {
        throw new RuntimeException("Stub!");
    }

    public final int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public FormatWidth getWidth() {
        throw new RuntimeException("Stub!");
    }

    public final ULocale getLocale() {
        throw new RuntimeException("Stub!");
    }

    public NumberFormat getNumberFormat() {
        throw new RuntimeException("Stub!");
    }

    public static MeasureFormat getCurrencyFormat(ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    public static MeasureFormat getCurrencyFormat(Locale locale) {
        throw new RuntimeException("Stub!");
    }

    public static MeasureFormat getCurrencyFormat() {
        throw new RuntimeException("Stub!");
    }
}
