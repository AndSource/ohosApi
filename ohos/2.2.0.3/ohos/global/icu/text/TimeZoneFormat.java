/*     */ package ohos.global.icu.text;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.text.AttributedCharacterIterator;
/*     */ import java.text.FieldPosition;
/*     */ import java.text.ParseException;
/*     */ import java.text.ParsePosition;
/*     */ import java.util.EnumSet;
/*     */ import java.util.Locale;
/*     */ import ohos.global.icu.util.Freezable;
/*     */ import ohos.global.icu.util.Output;
/*     */ import ohos.global.icu.util.TimeZone;
/*     */ import ohos.global.icu.util.ULocale;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class TimeZoneFormat
/*     */   extends UFormat
/*     */   implements Freezable<TimeZoneFormat>, Serializable
/*     */ {
/*     */   protected TimeZoneFormat(ULocale locale) {
/*  45 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static TimeZoneFormat getInstance(ULocale locale) {
/*  57 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static TimeZoneFormat getInstance(Locale locale) {
/*  70 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TimeZoneNames getTimeZoneNames() {
/*  79 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TimeZoneFormat setTimeZoneNames(TimeZoneNames tznames) {
/*  90 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getGMTPattern() {
/*  99 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TimeZoneFormat setGMTPattern(String pattern) {
/* 112 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getGMTOffsetPattern(GMTOffsetPatternType type) {
/* 121 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TimeZoneFormat setGMTOffsetPattern(GMTOffsetPatternType type, String pattern) {
/* 134 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getGMTOffsetDigits() {
/* 144 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TimeZoneFormat setGMTOffsetDigits(String digits) {
/* 156 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getGMTZeroFormat() {
/* 165 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TimeZoneFormat setGMTZeroFormat(String gmtZeroFormat) {
/* 176 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TimeZoneFormat setDefaultParseOptions(EnumSet<ParseOption> options) {
/* 189 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public EnumSet<ParseOption> getDefaultParseOptions() {
/* 197 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final String formatOffsetISO8601Basic(int offset, boolean useUtcIndicator, boolean isShort, boolean ignoreSeconds) {
/* 214 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final String formatOffsetISO8601Extended(int offset, boolean useUtcIndicator, boolean isShort, boolean ignoreSeconds) {
/* 231 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String formatOffsetLocalizedGMT(int offset) {
/* 252 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String formatOffsetShortLocalizedGMT(int offset) {
/* 273 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final String format(Style style, TimeZone tz, long date) {
/* 295 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String format(Style style, TimeZone tz, long date, Output<TimeType> timeType) {
/* 314 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final int parseOffsetISO8601(String text, ParsePosition pos) {
/* 331 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int parseOffsetLocalizedGMT(String text, ParsePosition pos) {
/* 346 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int parseOffsetShortLocalizedGMT(String text, ParsePosition pos) {
/* 361 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TimeZone parse(Style style, String text, ParsePosition pos, EnumSet<ParseOption> options, Output<TimeType> timeType) {
/* 378 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TimeZone parse(Style style, String text, ParsePosition pos, Output<TimeType> timeType) {
/* 399 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final TimeZone parse(String text, ParsePosition pos) {
/* 414 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final TimeZone parse(String text) throws ParseException {
/* 426 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) {
/* 432 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public AttributedCharacterIterator formatToCharacterIterator(Object obj) {
/* 438 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Object parseObject(String source, ParsePosition pos) {
/* 444 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isFrozen() {
/* 450 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public TimeZoneFormat freeze() {
/* 456 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public TimeZoneFormat cloneAsThawed() {
/* 462 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public enum GMTOffsetPatternType
/*     */   {
/* 476 */     POSITIVE_HM,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 481 */     POSITIVE_HMS,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 486 */     NEGATIVE_HM,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 491 */     NEGATIVE_HMS,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 496 */     POSITIVE_H,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 501 */     NEGATIVE_H;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public enum ParseOption
/*     */   {
/* 516 */     ALL_STYLES,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 524 */     TZ_DATABASE_ABBREVIATIONS;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public enum Style
/*     */   {
/* 542 */     GENERIC_LOCATION,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 548 */     GENERIC_LONG,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 554 */     GENERIC_SHORT,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 560 */     SPECIFIC_LONG,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 566 */     SPECIFIC_SHORT,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 572 */     LOCALIZED_GMT,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 578 */     LOCALIZED_GMT_SHORT,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 585 */     ISO_BASIC_SHORT,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 592 */     ISO_BASIC_LOCAL_SHORT,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 599 */     ISO_BASIC_FIXED,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 606 */     ISO_BASIC_LOCAL_FIXED,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 613 */     ISO_BASIC_FULL,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 620 */     ISO_BASIC_LOCAL_FULL,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 627 */     ISO_EXTENDED_FIXED,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 634 */     ISO_EXTENDED_LOCAL_FIXED,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 641 */     ISO_EXTENDED_FULL,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 648 */     ISO_EXTENDED_LOCAL_FULL,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 653 */     ZONE_ID,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 658 */     ZONE_ID_SHORT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 663 */     EXEMPLAR_LOCATION;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public enum TimeType
/*     */   {
/* 677 */     UNKNOWN,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 682 */     STANDARD,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 687 */     DAYLIGHT;
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/global/icu/text/TimeZoneFormat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */