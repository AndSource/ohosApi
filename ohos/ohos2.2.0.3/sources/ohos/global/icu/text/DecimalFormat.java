package ohos.global.icu.text;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.text.AttributedCharacterIterator;
import java.text.FieldPosition;
import java.text.ParsePosition;
import ohos.global.icu.number.LocalizedNumberFormatter;
import ohos.global.icu.util.Currency;
import ohos.global.icu.util.CurrencyAmount;

/* loaded from: ohos2.2.0.3.jar:ohos/global/icu/text/DecimalFormat.class */
public class DecimalFormat extends NumberFormat {
    public static final int PAD_AFTER_PREFIX = 1;
    public static final int PAD_AFTER_SUFFIX = 3;
    public static final int PAD_BEFORE_PREFIX = 0;
    public static final int PAD_BEFORE_SUFFIX = 2;

    public DecimalFormat() {
        throw new RuntimeException("Stub!");
    }

    public DecimalFormat(String pattern) {
        throw new RuntimeException("Stub!");
    }

    public DecimalFormat(String pattern, DecimalFormatSymbols symbols) {
        throw new RuntimeException("Stub!");
    }

    public DecimalFormat(String pattern, DecimalFormatSymbols symbols, CurrencyPluralInfo infoInput, int style) {
        throw new RuntimeException("Stub!");
    }

    public synchronized void applyPattern(String pattern) {
        throw new RuntimeException("Stub!");
    }

    public synchronized void applyLocalizedPattern(String localizedPattern) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.NumberFormat, java.text.Format
    public Object clone() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.NumberFormat
    public StringBuffer format(double number, StringBuffer result, FieldPosition fieldPosition) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.NumberFormat
    public StringBuffer format(long number, StringBuffer result, FieldPosition fieldPosition) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.NumberFormat
    public StringBuffer format(BigInteger number, StringBuffer result, FieldPosition fieldPosition) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.NumberFormat
    public StringBuffer format(BigDecimal number, StringBuffer result, FieldPosition fieldPosition) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.NumberFormat
    public StringBuffer format(ohos.global.icu.math.BigDecimal number, StringBuffer result, FieldPosition fieldPosition) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.text.Format
    public AttributedCharacterIterator formatToCharacterIterator(Object obj) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.NumberFormat
    public StringBuffer format(CurrencyAmount currAmt, StringBuffer result, FieldPosition fieldPosition) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.NumberFormat
    public Number parse(String text, ParsePosition parsePosition) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.NumberFormat
    public CurrencyAmount parseCurrency(CharSequence text, ParsePosition parsePosition) {
        throw new RuntimeException("Stub!");
    }

    public synchronized DecimalFormatSymbols getDecimalFormatSymbols() {
        throw new RuntimeException("Stub!");
    }

    public synchronized void setDecimalFormatSymbols(DecimalFormatSymbols newSymbols) {
        throw new RuntimeException("Stub!");
    }

    public synchronized String getPositivePrefix() {
        throw new RuntimeException("Stub!");
    }

    public synchronized void setPositivePrefix(String prefix) {
        throw new RuntimeException("Stub!");
    }

    public synchronized String getNegativePrefix() {
        throw new RuntimeException("Stub!");
    }

    public synchronized void setNegativePrefix(String prefix) {
        throw new RuntimeException("Stub!");
    }

    public synchronized String getPositiveSuffix() {
        throw new RuntimeException("Stub!");
    }

    public synchronized void setPositiveSuffix(String suffix) {
        throw new RuntimeException("Stub!");
    }

    public synchronized String getNegativeSuffix() {
        throw new RuntimeException("Stub!");
    }

    public synchronized void setNegativeSuffix(String suffix) {
        throw new RuntimeException("Stub!");
    }

    public synchronized boolean isSignAlwaysShown() {
        throw new RuntimeException("Stub!");
    }

    public synchronized void setSignAlwaysShown(boolean value) {
        throw new RuntimeException("Stub!");
    }

    public synchronized int getMultiplier() {
        throw new RuntimeException("Stub!");
    }

    public synchronized void setMultiplier(int multiplier) {
        throw new RuntimeException("Stub!");
    }

    public synchronized BigDecimal getRoundingIncrement() {
        throw new RuntimeException("Stub!");
    }

    public synchronized void setRoundingIncrement(BigDecimal increment) {
        throw new RuntimeException("Stub!");
    }

    public synchronized void setRoundingIncrement(ohos.global.icu.math.BigDecimal increment) {
        throw new RuntimeException("Stub!");
    }

    public synchronized void setRoundingIncrement(double increment) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.NumberFormat
    public synchronized int getRoundingMode() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.NumberFormat
    public synchronized void setRoundingMode(int roundingMode) {
        throw new RuntimeException("Stub!");
    }

    public synchronized MathContext getMathContext() {
        throw new RuntimeException("Stub!");
    }

    public synchronized void setMathContext(MathContext mathContext) {
        throw new RuntimeException("Stub!");
    }

    public synchronized ohos.global.icu.math.MathContext getMathContextICU() {
        throw new RuntimeException("Stub!");
    }

    public synchronized void setMathContextICU(ohos.global.icu.math.MathContext mathContextICU) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.NumberFormat
    public synchronized int getMinimumIntegerDigits() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.NumberFormat
    public synchronized void setMinimumIntegerDigits(int value) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.NumberFormat
    public synchronized int getMaximumIntegerDigits() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.NumberFormat
    public synchronized void setMaximumIntegerDigits(int value) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.NumberFormat
    public synchronized int getMinimumFractionDigits() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.NumberFormat
    public synchronized void setMinimumFractionDigits(int value) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.NumberFormat
    public synchronized int getMaximumFractionDigits() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.NumberFormat
    public synchronized void setMaximumFractionDigits(int value) {
        throw new RuntimeException("Stub!");
    }

    public synchronized boolean areSignificantDigitsUsed() {
        throw new RuntimeException("Stub!");
    }

    public synchronized void setSignificantDigitsUsed(boolean useSignificantDigits) {
        throw new RuntimeException("Stub!");
    }

    public synchronized int getMinimumSignificantDigits() {
        throw new RuntimeException("Stub!");
    }

    public synchronized void setMinimumSignificantDigits(int value) {
        throw new RuntimeException("Stub!");
    }

    public synchronized int getMaximumSignificantDigits() {
        throw new RuntimeException("Stub!");
    }

    public synchronized void setMaximumSignificantDigits(int value) {
        throw new RuntimeException("Stub!");
    }

    public synchronized int getFormatWidth() {
        throw new RuntimeException("Stub!");
    }

    public synchronized void setFormatWidth(int width) {
        throw new RuntimeException("Stub!");
    }

    public synchronized char getPadCharacter() {
        throw new RuntimeException("Stub!");
    }

    public synchronized void setPadCharacter(char padChar) {
        throw new RuntimeException("Stub!");
    }

    public synchronized int getPadPosition() {
        throw new RuntimeException("Stub!");
    }

    public synchronized void setPadPosition(int padPos) {
        throw new RuntimeException("Stub!");
    }

    public synchronized boolean isScientificNotation() {
        throw new RuntimeException("Stub!");
    }

    public synchronized void setScientificNotation(boolean useScientific) {
        throw new RuntimeException("Stub!");
    }

    public synchronized byte getMinimumExponentDigits() {
        throw new RuntimeException("Stub!");
    }

    public synchronized void setMinimumExponentDigits(byte minExpDig) {
        throw new RuntimeException("Stub!");
    }

    public synchronized boolean isExponentSignAlwaysShown() {
        throw new RuntimeException("Stub!");
    }

    public synchronized void setExponentSignAlwaysShown(boolean expSignAlways) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.NumberFormat
    public synchronized boolean isGroupingUsed() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.NumberFormat
    public synchronized void setGroupingUsed(boolean enabled) {
        throw new RuntimeException("Stub!");
    }

    public synchronized int getGroupingSize() {
        throw new RuntimeException("Stub!");
    }

    public synchronized void setGroupingSize(int width) {
        throw new RuntimeException("Stub!");
    }

    public synchronized int getSecondaryGroupingSize() {
        throw new RuntimeException("Stub!");
    }

    public synchronized void setSecondaryGroupingSize(int width) {
        throw new RuntimeException("Stub!");
    }

    public synchronized int getMinimumGroupingDigits() {
        throw new RuntimeException("Stub!");
    }

    public synchronized void setMinimumGroupingDigits(int number) {
        throw new RuntimeException("Stub!");
    }

    public synchronized boolean isDecimalSeparatorAlwaysShown() {
        throw new RuntimeException("Stub!");
    }

    public synchronized void setDecimalSeparatorAlwaysShown(boolean value) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.NumberFormat
    public synchronized Currency getCurrency() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.NumberFormat
    public synchronized void setCurrency(Currency currency) {
        throw new RuntimeException("Stub!");
    }

    public synchronized Currency.CurrencyUsage getCurrencyUsage() {
        throw new RuntimeException("Stub!");
    }

    public synchronized void setCurrencyUsage(Currency.CurrencyUsage usage) {
        throw new RuntimeException("Stub!");
    }

    public synchronized CurrencyPluralInfo getCurrencyPluralInfo() {
        throw new RuntimeException("Stub!");
    }

    public synchronized void setCurrencyPluralInfo(CurrencyPluralInfo newInfo) {
        throw new RuntimeException("Stub!");
    }

    public synchronized boolean isParseBigDecimal() {
        throw new RuntimeException("Stub!");
    }

    public synchronized void setParseBigDecimal(boolean value) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public int getParseMaxDigits() {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public void setParseMaxDigits(int maxDigits) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.NumberFormat
    public synchronized boolean isParseStrict() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.NumberFormat
    public synchronized void setParseStrict(boolean parseStrict) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.NumberFormat
    public synchronized boolean isParseIntegerOnly() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.NumberFormat
    public synchronized void setParseIntegerOnly(boolean parseIntegerOnly) {
        throw new RuntimeException("Stub!");
    }

    public synchronized boolean isDecimalPatternMatchRequired() {
        throw new RuntimeException("Stub!");
    }

    public synchronized void setDecimalPatternMatchRequired(boolean value) {
        throw new RuntimeException("Stub!");
    }

    public synchronized boolean isParseNoExponent() {
        throw new RuntimeException("Stub!");
    }

    public synchronized void setParseNoExponent(boolean value) {
        throw new RuntimeException("Stub!");
    }

    public synchronized boolean isParseCaseSensitive() {
        throw new RuntimeException("Stub!");
    }

    public synchronized void setParseCaseSensitive(boolean value) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.NumberFormat
    public synchronized boolean equals(Object obj) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.global.icu.text.NumberFormat
    public synchronized int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }

    public synchronized String toPattern() {
        throw new RuntimeException("Stub!");
    }

    public synchronized String toLocalizedPattern() {
        throw new RuntimeException("Stub!");
    }

    public LocalizedNumberFormatter toNumberFormatter() {
        throw new RuntimeException("Stub!");
    }
}
