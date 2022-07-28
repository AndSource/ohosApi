package ohos.global.icu.text;

import java.text.ParsePosition;
import java.util.Locale;
import ohos.global.icu.util.CurrencyAmount;
import ohos.global.icu.util.ULocale;

/* loaded from: ohos2.2.0.3.jar:ohos/global/icu/text/CompactDecimalFormat.class */
public class CompactDecimalFormat extends DecimalFormat {

    /* loaded from: ohos2.2.0.3.jar:ohos/global/icu/text/CompactDecimalFormat$CompactStyle.class */
    public enum CompactStyle {
        SHORT,
        LONG
    }

    CompactDecimalFormat(ULocale locale, CompactStyle style) {
        throw new RuntimeException("Stub!");
    }

    public static CompactDecimalFormat getInstance(ULocale locale, CompactStyle style) {
        throw new RuntimeException("Stub!");
    }

    public static CompactDecimalFormat getInstance(Locale locale, CompactStyle style) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.DecimalFormat, ohos.global.icu.text.NumberFormat
    public Number parse(String text, ParsePosition parsePosition) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.DecimalFormat, ohos.global.icu.text.NumberFormat
    public CurrencyAmount parseCurrency(CharSequence text, ParsePosition parsePosition) {
        throw new RuntimeException("Stub!");
    }
}
