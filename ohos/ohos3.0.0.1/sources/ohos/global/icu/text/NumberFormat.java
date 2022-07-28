package ohos.global.icu.text;

import java.io.InvalidObjectException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Locale;
import ohos.global.icu.text.DisplayContext;
import ohos.global.icu.util.Currency;
import ohos.global.icu.util.CurrencyAmount;
import ohos.global.icu.util.ULocale;

/* loaded from: ohos3.0.0.1.jar:ohos/global/icu/text/NumberFormat.class */
public abstract class NumberFormat extends UFormat {
    public static final int ACCOUNTINGCURRENCYSTYLE = 7;
    public static final int CASHCURRENCYSTYLE = 8;
    public static final int CURRENCYSTYLE = 1;
    public static final int FRACTION_FIELD = 1;
    public static final int INTEGERSTYLE = 4;
    public static final int INTEGER_FIELD = 0;
    public static final int ISOCURRENCYSTYLE = 5;
    public static final int NUMBERSTYLE = 0;
    public static final int PERCENTSTYLE = 2;
    public static final int PLURALCURRENCYSTYLE = 6;
    public static final int SCIENTIFICSTYLE = 3;
    public static final int STANDARDCURRENCYSTYLE = 9;

    public abstract StringBuffer format(double d, StringBuffer stringBuffer, FieldPosition fieldPosition);

    public abstract StringBuffer format(long j, StringBuffer stringBuffer, FieldPosition fieldPosition);

    public abstract StringBuffer format(BigInteger bigInteger, StringBuffer stringBuffer, FieldPosition fieldPosition);

    public abstract StringBuffer format(BigDecimal bigDecimal, StringBuffer stringBuffer, FieldPosition fieldPosition);

    public abstract StringBuffer format(ohos.global.icu.math.BigDecimal bigDecimal, StringBuffer stringBuffer, FieldPosition fieldPosition);

    public abstract Number parse(String str, ParsePosition parsePosition);

    public NumberFormat() {
        throw new RuntimeException("Stub!");
    }

    @Override // java.text.Format
    public StringBuffer format(Object number, StringBuffer toAppendTo, FieldPosition pos) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.text.Format
    public final Object parseObject(String source, ParsePosition parsePosition) {
        throw new RuntimeException("Stub!");
    }

    public final String format(double number) {
        throw new RuntimeException("Stub!");
    }

    public final String format(long number) {
        throw new RuntimeException("Stub!");
    }

    public final String format(BigInteger number) {
        throw new RuntimeException("Stub!");
    }

    public final String format(BigDecimal number) {
        throw new RuntimeException("Stub!");
    }

    public final String format(ohos.global.icu.math.BigDecimal number) {
        throw new RuntimeException("Stub!");
    }

    public final String format(CurrencyAmount currAmt) {
        throw new RuntimeException("Stub!");
    }

    public StringBuffer format(CurrencyAmount currAmt, StringBuffer toAppendTo, FieldPosition pos) {
        throw new RuntimeException("Stub!");
    }

    public Number parse(String text) throws ParseException {
        throw new RuntimeException("Stub!");
    }

    public CurrencyAmount parseCurrency(CharSequence text, ParsePosition pos) {
        throw new RuntimeException("Stub!");
    }

    public boolean isParseIntegerOnly() {
        throw new RuntimeException("Stub!");
    }

    public void setParseIntegerOnly(boolean value) {
        throw new RuntimeException("Stub!");
    }

    public void setParseStrict(boolean value) {
        throw new RuntimeException("Stub!");
    }

    public boolean isParseStrict() {
        throw new RuntimeException("Stub!");
    }

    public void setContext(DisplayContext context) {
        throw new RuntimeException("Stub!");
    }

    public DisplayContext getContext(DisplayContext.Type type) {
        throw new RuntimeException("Stub!");
    }

    public static final NumberFormat getInstance() {
        throw new RuntimeException("Stub!");
    }

    public static NumberFormat getInstance(Locale inLocale) {
        throw new RuntimeException("Stub!");
    }

    public static NumberFormat getInstance(ULocale inLocale) {
        throw new RuntimeException("Stub!");
    }

    public static final NumberFormat getInstance(int style) {
        throw new RuntimeException("Stub!");
    }

    public static NumberFormat getInstance(Locale inLocale, int style) {
        throw new RuntimeException("Stub!");
    }

    public static final NumberFormat getNumberInstance() {
        throw new RuntimeException("Stub!");
    }

    public static NumberFormat getNumberInstance(Locale inLocale) {
        throw new RuntimeException("Stub!");
    }

    public static NumberFormat getNumberInstance(ULocale inLocale) {
        throw new RuntimeException("Stub!");
    }

    public static final NumberFormat getIntegerInstance() {
        throw new RuntimeException("Stub!");
    }

    public static NumberFormat getIntegerInstance(Locale inLocale) {
        throw new RuntimeException("Stub!");
    }

    public static NumberFormat getIntegerInstance(ULocale inLocale) {
        throw new RuntimeException("Stub!");
    }

    public static final NumberFormat getCurrencyInstance() {
        throw new RuntimeException("Stub!");
    }

    public static NumberFormat getCurrencyInstance(Locale inLocale) {
        throw new RuntimeException("Stub!");
    }

    public static NumberFormat getCurrencyInstance(ULocale inLocale) {
        throw new RuntimeException("Stub!");
    }

    public static final NumberFormat getPercentInstance() {
        throw new RuntimeException("Stub!");
    }

    public static NumberFormat getPercentInstance(Locale inLocale) {
        throw new RuntimeException("Stub!");
    }

    public static NumberFormat getPercentInstance(ULocale inLocale) {
        throw new RuntimeException("Stub!");
    }

    public static final NumberFormat getScientificInstance() {
        throw new RuntimeException("Stub!");
    }

    public static NumberFormat getScientificInstance(Locale inLocale) {
        throw new RuntimeException("Stub!");
    }

    public static NumberFormat getScientificInstance(ULocale inLocale) {
        throw new RuntimeException("Stub!");
    }

    public static Locale[] getAvailableLocales() {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object obj) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.text.Format
    public Object clone() {
        throw new RuntimeException("Stub!");
    }

    public boolean isGroupingUsed() {
        throw new RuntimeException("Stub!");
    }

    public void setGroupingUsed(boolean newValue) {
        throw new RuntimeException("Stub!");
    }

    public int getMaximumIntegerDigits() {
        throw new RuntimeException("Stub!");
    }

    public void setMaximumIntegerDigits(int newValue) {
        throw new RuntimeException("Stub!");
    }

    public int getMinimumIntegerDigits() {
        throw new RuntimeException("Stub!");
    }

    public void setMinimumIntegerDigits(int newValue) {
        throw new RuntimeException("Stub!");
    }

    public int getMaximumFractionDigits() {
        throw new RuntimeException("Stub!");
    }

    public void setMaximumFractionDigits(int newValue) {
        throw new RuntimeException("Stub!");
    }

    public int getMinimumFractionDigits() {
        throw new RuntimeException("Stub!");
    }

    public void setMinimumFractionDigits(int newValue) {
        throw new RuntimeException("Stub!");
    }

    public void setCurrency(Currency theCurrency) {
        throw new RuntimeException("Stub!");
    }

    public Currency getCurrency() {
        throw new RuntimeException("Stub!");
    }

    public int getRoundingMode() {
        throw new RuntimeException("Stub!");
    }

    public void setRoundingMode(int roundingMode) {
        throw new RuntimeException("Stub!");
    }

    public static NumberFormat getInstance(ULocale desiredLocale, int choice) {
        throw new RuntimeException("Stub!");
    }

    protected static String getPattern(ULocale forLocale, int choice) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/global/icu/text/NumberFormat$Field.class */
    public static class Field extends Format.Field {
        public static final Field COMPACT = null;
        public static final Field CURRENCY = null;
        public static final Field DECIMAL_SEPARATOR = null;
        public static final Field EXPONENT = null;
        public static final Field EXPONENT_SIGN = null;
        public static final Field EXPONENT_SYMBOL = null;
        public static final Field FRACTION = null;
        public static final Field GROUPING_SEPARATOR = null;
        public static final Field INTEGER = null;
        public static final Field MEASURE_UNIT = null;
        public static final Field PERCENT = null;
        public static final Field PERMILLE = null;
        public static final Field SIGN = null;

        protected Field(String fieldName) {
            super(null);
            throw new RuntimeException("Stub!");
        }

        @Override // java.text.AttributedCharacterIterator.Attribute
        protected Object readResolve() throws InvalidObjectException {
            throw new RuntimeException("Stub!");
        }
    }
}
