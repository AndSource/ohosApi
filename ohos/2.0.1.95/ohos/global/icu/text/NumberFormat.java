/*      */ package ohos.global.icu.text;
/*      */ 
/*      */ import java.io.InvalidObjectException;
/*      */ import java.math.BigDecimal;
/*      */ import java.math.BigInteger;
/*      */ import java.text.FieldPosition;
/*      */ import java.text.Format;
/*      */ import java.text.ParseException;
/*      */ import java.text.ParsePosition;
/*      */ import java.util.Locale;
/*      */ import ohos.global.icu.math.BigDecimal;
/*      */ import ohos.global.icu.util.Currency;
/*      */ import ohos.global.icu.util.CurrencyAmount;
/*      */ import ohos.global.icu.util.ULocale;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public abstract class NumberFormat
/*      */   extends UFormat
/*      */ {
/*      */   public static final int ACCOUNTINGCURRENCYSTYLE = 7;
/*      */   public static final int CASHCURRENCYSTYLE = 8;
/*      */   public static final int CURRENCYSTYLE = 1;
/*      */   public static final int FRACTION_FIELD = 1;
/*      */   public static final int INTEGERSTYLE = 4;
/*      */   public static final int INTEGER_FIELD = 0;
/*      */   public static final int ISOCURRENCYSTYLE = 5;
/*      */   public static final int NUMBERSTYLE = 0;
/*      */   public static final int PERCENTSTYLE = 2;
/*      */   public static final int PLURALCURRENCYSTYLE = 6;
/*      */   public static final int SCIENTIFICSTYLE = 3;
/*      */   public static final int STANDARDCURRENCYSTYLE = 9;
/*      */   
/*      */   public NumberFormat() {
/*  178 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public StringBuffer format(Object number, StringBuffer toAppendTo, FieldPosition pos) {
/*  187 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final Object parseObject(String source, ParsePosition parsePosition) {
/*  197 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final String format(double number) {
/*  204 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final String format(long number) {
/*  211 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final String format(BigInteger number) {
/*  217 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final String format(BigDecimal number) {
/*  223 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final String format(BigDecimal number) {
/*  229 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final String format(CurrencyAmount currAmt) {
/*  235 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract StringBuffer format(double paramDouble, StringBuffer paramStringBuffer, FieldPosition paramFieldPosition);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract StringBuffer format(long paramLong, StringBuffer paramStringBuffer, FieldPosition paramFieldPosition);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract StringBuffer format(BigInteger paramBigInteger, StringBuffer paramStringBuffer, FieldPosition paramFieldPosition);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract StringBuffer format(BigDecimal paramBigDecimal, StringBuffer paramStringBuffer, FieldPosition paramFieldPosition);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract StringBuffer format(BigDecimal paramBigDecimal, StringBuffer paramStringBuffer, FieldPosition paramFieldPosition);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public StringBuffer format(CurrencyAmount currAmt, StringBuffer toAppendTo, FieldPosition pos) {
/*  277 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract Number parse(String paramString, ParsePosition paramParsePosition);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Number parse(String text) throws ParseException {
/*  313 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CurrencyAmount parseCurrency(CharSequence text, ParsePosition pos) {
/*  332 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isParseIntegerOnly() {
/*  345 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setParseIntegerOnly(boolean value) {
/*  359 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setParseStrict(boolean value) {
/*  383 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isParseStrict() {
/*  391 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setContext(DisplayContext context) {
/*  400 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DisplayContext getContext(DisplayContext.Type type) {
/*  410 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final NumberFormat getInstance() {
/*  424 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberFormat getInstance(Locale inLocale) {
/*  436 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberFormat getInstance(ULocale inLocale) {
/*  448 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final NumberFormat getInstance(int style) {
/*  459 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberFormat getInstance(Locale inLocale, int style) {
/*  470 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final NumberFormat getNumberInstance() {
/*  480 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberFormat getNumberInstance(Locale inLocale) {
/*  489 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberFormat getNumberInstance(ULocale inLocale) {
/*  498 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final NumberFormat getIntegerInstance() {
/*  515 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberFormat getIntegerInstance(Locale inLocale) {
/*  532 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberFormat getIntegerInstance(ULocale inLocale) {
/*  549 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final NumberFormat getCurrencyInstance() {
/*  560 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberFormat getCurrencyInstance(Locale inLocale) {
/*  570 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberFormat getCurrencyInstance(ULocale inLocale) {
/*  580 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final NumberFormat getPercentInstance() {
/*  591 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberFormat getPercentInstance(Locale inLocale) {
/*  601 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberFormat getPercentInstance(ULocale inLocale) {
/*  611 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final NumberFormat getScientificInstance() {
/*  622 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberFormat getScientificInstance(Locale inLocale) {
/*  632 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberFormat getScientificInstance(ULocale inLocale) {
/*  642 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Locale[] getAvailableLocales() {
/*  649 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int hashCode() {
/*  655 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean equals(Object obj) {
/*  667 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public Object clone() {
/*  673 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isGroupingUsed() {
/*  685 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setGroupingUsed(boolean newValue) {
/*  694 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getMaximumIntegerDigits() {
/*  710 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setMaximumIntegerDigits(int newValue) {
/*  724 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getMinimumIntegerDigits() {
/*  736 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setMinimumIntegerDigits(int newValue) {
/*  750 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getMaximumFractionDigits() {
/*  762 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setMaximumFractionDigits(int newValue) {
/*  776 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getMinimumFractionDigits() {
/*  788 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setMinimumFractionDigits(int newValue) {
/*  802 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setCurrency(Currency theCurrency) {
/*  814 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Currency getCurrency() {
/*  821 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getRoundingMode() {
/*  831 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setRoundingMode(int roundingMode) {
/*  842 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberFormat getInstance(ULocale desiredLocale, int choice) {
/*  859 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected static String getPattern(ULocale forLocale, int choice) {
/*  868 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class Field
/*      */     extends Format.Field
/*      */   {
/*      */     protected Field(String fieldName) {
/*  976 */       super(null); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     protected Object readResolve() throws InvalidObjectException {
/*  983 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  989 */     public static final Field CURRENCY = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  995 */     public static final Field DECIMAL_SEPARATOR = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1001 */     public static final Field EXPONENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1007 */     public static final Field EXPONENT_SIGN = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1013 */     public static final Field EXPONENT_SYMBOL = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1019 */     public static final Field FRACTION = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1025 */     public static final Field GROUPING_SEPARATOR = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1031 */     public static final Field INTEGER = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1037 */     public static final Field PERCENT = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1043 */     public static final Field PERMILLE = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1049 */     public static final Field SIGN = null;
/*      */   }
/*      */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/global/icu/text/NumberFormat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */