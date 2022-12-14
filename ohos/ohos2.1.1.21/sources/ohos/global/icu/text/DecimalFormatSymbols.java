package ohos.global.icu.text;

import java.io.Serializable;
import java.util.Locale;
import ohos.global.icu.util.Currency;
import ohos.global.icu.util.ULocale;

/* loaded from: ohos2.1.1.21.jar:ohos/global/icu/text/DecimalFormatSymbols.class */
public class DecimalFormatSymbols implements Cloneable, Serializable {
    public static final int CURRENCY_SPC_CURRENCY_MATCH = 0;
    public static final int CURRENCY_SPC_INSERT = 2;
    public static final int CURRENCY_SPC_SURROUNDING_MATCH = 1;

    public DecimalFormatSymbols() {
        throw new RuntimeException("Stub!");
    }

    public DecimalFormatSymbols(Locale locale) {
        throw new RuntimeException("Stub!");
    }

    public DecimalFormatSymbols(ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    public static DecimalFormatSymbols getInstance() {
        throw new RuntimeException("Stub!");
    }

    public static DecimalFormatSymbols getInstance(Locale locale) {
        throw new RuntimeException("Stub!");
    }

    public static DecimalFormatSymbols getInstance(ULocale locale) {
        throw new RuntimeException("Stub!");
    }

    public static DecimalFormatSymbols forNumberingSystem(Locale locale, NumberingSystem ns) {
        throw new RuntimeException("Stub!");
    }

    public static DecimalFormatSymbols forNumberingSystem(ULocale locale, NumberingSystem ns) {
        throw new RuntimeException("Stub!");
    }

    public static Locale[] getAvailableLocales() {
        throw new RuntimeException("Stub!");
    }

    public char getZeroDigit() {
        throw new RuntimeException("Stub!");
    }

    public char[] getDigits() {
        throw new RuntimeException("Stub!");
    }

    public void setZeroDigit(char zeroDigit) {
        throw new RuntimeException("Stub!");
    }

    public String[] getDigitStrings() {
        throw new RuntimeException("Stub!");
    }

    public void setDigitStrings(String[] digitStrings) {
        throw new RuntimeException("Stub!");
    }

    public char getSignificantDigit() {
        throw new RuntimeException("Stub!");
    }

    public void setSignificantDigit(char sigDigit) {
        throw new RuntimeException("Stub!");
    }

    public char getGroupingSeparator() {
        throw new RuntimeException("Stub!");
    }

    public void setGroupingSeparator(char groupingSeparator) {
        throw new RuntimeException("Stub!");
    }

    public String getGroupingSeparatorString() {
        throw new RuntimeException("Stub!");
    }

    public void setGroupingSeparatorString(String groupingSeparatorString) {
        throw new RuntimeException("Stub!");
    }

    public char getDecimalSeparator() {
        throw new RuntimeException("Stub!");
    }

    public void setDecimalSeparator(char decimalSeparator) {
        throw new RuntimeException("Stub!");
    }

    public String getDecimalSeparatorString() {
        throw new RuntimeException("Stub!");
    }

    public void setDecimalSeparatorString(String decimalSeparatorString) {
        throw new RuntimeException("Stub!");
    }

    public char getPerMill() {
        throw new RuntimeException("Stub!");
    }

    public void setPerMill(char perMill) {
        throw new RuntimeException("Stub!");
    }

    public String getPerMillString() {
        throw new RuntimeException("Stub!");
    }

    public void setPerMillString(String perMillString) {
        throw new RuntimeException("Stub!");
    }

    public char getPercent() {
        throw new RuntimeException("Stub!");
    }

    public void setPercent(char percent) {
        throw new RuntimeException("Stub!");
    }

    public String getPercentString() {
        throw new RuntimeException("Stub!");
    }

    public void setPercentString(String percentString) {
        throw new RuntimeException("Stub!");
    }

    public char getDigit() {
        throw new RuntimeException("Stub!");
    }

    public void setDigit(char digit) {
        throw new RuntimeException("Stub!");
    }

    public char getPatternSeparator() {
        throw new RuntimeException("Stub!");
    }

    public void setPatternSeparator(char patternSeparator) {
        throw new RuntimeException("Stub!");
    }

    public String getInfinity() {
        throw new RuntimeException("Stub!");
    }

    public void setInfinity(String infinity) {
        throw new RuntimeException("Stub!");
    }

    public String getNaN() {
        throw new RuntimeException("Stub!");
    }

    public void setNaN(String NaN) {
        throw new RuntimeException("Stub!");
    }

    public char getMinusSign() {
        throw new RuntimeException("Stub!");
    }

    public void setMinusSign(char minusSign) {
        throw new RuntimeException("Stub!");
    }

    public String getMinusSignString() {
        throw new RuntimeException("Stub!");
    }

    public void setMinusSignString(String minusSignString) {
        throw new RuntimeException("Stub!");
    }

    public char getPlusSign() {
        throw new RuntimeException("Stub!");
    }

    public void setPlusSign(char plus) {
        throw new RuntimeException("Stub!");
    }

    public String getPlusSignString() {
        throw new RuntimeException("Stub!");
    }

    public void setPlusSignString(String plusSignString) {
        throw new RuntimeException("Stub!");
    }

    public String getCurrencySymbol() {
        throw new RuntimeException("Stub!");
    }

    public void setCurrencySymbol(String currency) {
        throw new RuntimeException("Stub!");
    }

    public String getInternationalCurrencySymbol() {
        throw new RuntimeException("Stub!");
    }

    public void setInternationalCurrencySymbol(String currency) {
        throw new RuntimeException("Stub!");
    }

    public Currency getCurrency() {
        throw new RuntimeException("Stub!");
    }

    public void setCurrency(Currency currency) {
        throw new RuntimeException("Stub!");
    }

    public char getMonetaryDecimalSeparator() {
        throw new RuntimeException("Stub!");
    }

    public void setMonetaryDecimalSeparator(char sep) {
        throw new RuntimeException("Stub!");
    }

    public String getMonetaryDecimalSeparatorString() {
        throw new RuntimeException("Stub!");
    }

    public void setMonetaryDecimalSeparatorString(String sep) {
        throw new RuntimeException("Stub!");
    }

    public char getMonetaryGroupingSeparator() {
        throw new RuntimeException("Stub!");
    }

    public void setMonetaryGroupingSeparator(char sep) {
        throw new RuntimeException("Stub!");
    }

    public String getMonetaryGroupingSeparatorString() {
        throw new RuntimeException("Stub!");
    }

    public void setMonetaryGroupingSeparatorString(String sep) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public String getCurrencyPattern() {
        throw new RuntimeException("Stub!");
    }

    public String getExponentMultiplicationSign() {
        throw new RuntimeException("Stub!");
    }

    public void setExponentMultiplicationSign(String exponentMultiplicationSign) {
        throw new RuntimeException("Stub!");
    }

    public String getExponentSeparator() {
        throw new RuntimeException("Stub!");
    }

    public void setExponentSeparator(String exp) {
        throw new RuntimeException("Stub!");
    }

    public char getPadEscape() {
        throw new RuntimeException("Stub!");
    }

    public void setPadEscape(char c) {
        throw new RuntimeException("Stub!");
    }

    public String getPatternForCurrencySpacing(int itemType, boolean beforeCurrency) {
        throw new RuntimeException("Stub!");
    }

    public void setPatternForCurrencySpacing(int itemType, boolean beforeCurrency, String pattern) {
        throw new RuntimeException("Stub!");
    }

    public Locale getLocale() {
        throw new RuntimeException("Stub!");
    }

    public ULocale getULocale() {
        throw new RuntimeException("Stub!");
    }

    public Object clone() {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object obj) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
}
