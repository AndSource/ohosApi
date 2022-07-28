/*     */ package ohos.global.icu.text;
/*     */ 
/*     */ import java.io.InvalidObjectException;
/*     */ import java.text.AttributedCharacterIterator;
/*     */ import java.text.Format;
/*     */ import java.util.EnumMap;
/*     */ import java.util.Locale;
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
/*     */ public final class RelativeDateTimeFormatter
/*     */ {
/*     */   RelativeDateTimeFormatter(EnumMap<Style, EnumMap<AbsoluteUnit, EnumMap<Direction, String>>> qualitativeUnitMap, EnumMap<Style, EnumMap<RelativeUnit, String[][]>> patternMap, String combinedDateAndTime, PluralRules pluralRules, NumberFormat numberFormat, Style style, DisplayContext capitalizationContext, BreakIterator breakIterator, ULocale locale) {
/*  63 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static RelativeDateTimeFormatter getInstance() {
/*  69 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static RelativeDateTimeFormatter getInstance(ULocale locale) {
/*  78 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static RelativeDateTimeFormatter getInstance(Locale locale) {
/*  87 */     throw new RuntimeException("Stub!");
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
/*     */   public static RelativeDateTimeFormatter getInstance(ULocale locale, NumberFormat nf) {
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
/*     */   public static RelativeDateTimeFormatter getInstance(ULocale locale, NumberFormat nf, Style style, DisplayContext capitalizationContext) {
/* 112 */     throw new RuntimeException("Stub!");
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
/*     */   public static RelativeDateTimeFormatter getInstance(Locale locale, NumberFormat nf) {
/* 124 */     throw new RuntimeException("Stub!");
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
/*     */   public String format(double quantity, Direction direction, RelativeUnit unit) {
/* 143 */     throw new RuntimeException("Stub!");
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
/*     */   public FormattedRelativeDateTime formatToValue(double quantity, Direction direction, RelativeUnit unit) {
/* 162 */     throw new RuntimeException("Stub!");
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
/*     */   public String formatNumeric(double offset, RelativeDateTimeUnit unit) {
/* 181 */     throw new RuntimeException("Stub!");
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
/*     */   public FormattedRelativeDateTime formatNumericToValue(double offset, RelativeDateTimeUnit unit) {
/* 200 */     throw new RuntimeException("Stub!");
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
/*     */   public String format(Direction direction, AbsoluteUnit unit) {
/* 217 */     throw new RuntimeException("Stub!");
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
/*     */   public FormattedRelativeDateTime formatToValue(Direction direction, AbsoluteUnit unit) {
/* 234 */     throw new RuntimeException("Stub!");
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
/*     */   public String format(double offset, RelativeDateTimeUnit unit) {
/* 253 */     throw new RuntimeException("Stub!");
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
/*     */   public FormattedRelativeDateTime formatToValue(double offset, RelativeDateTimeUnit unit) {
/* 272 */     throw new RuntimeException("Stub!");
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
/*     */   public String combineDateAndTime(String relativeDateString, String timeString) {
/* 284 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public NumberFormat getNumberFormat() {
/* 291 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DisplayContext getCapitalizationContext() {
/* 298 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Style getFormatStyle() {
/* 305 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public enum AbsoluteUnit
/*     */   {
/* 316 */     SUNDAY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 321 */     MONDAY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 326 */     TUESDAY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 331 */     WEDNESDAY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 336 */     THURSDAY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 341 */     FRIDAY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 346 */     SATURDAY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 351 */     DAY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 356 */     WEEK,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 361 */     MONTH,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 366 */     YEAR,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 371 */     NOW,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 376 */     QUARTER;
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
/*     */   public enum Direction
/*     */   {
/* 390 */     LAST_2,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 395 */     LAST,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 400 */     THIS,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 405 */     NEXT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 410 */     NEXT_2,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 415 */     PLAIN;
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
/*     */   public static class Field
/*     */     extends Format.Field
/*     */   {
/*     */     Field(String fieldName) {
/* 430 */       super(null); throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     protected Object readResolve() throws InvalidObjectException {
/* 438 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 445 */     public static final Field LITERAL = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 452 */     public static final Field NUMERIC = null;
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
/*     */   public static class FormattedRelativeDateTime
/*     */     implements CharSequence
/*     */   {
/*     */     FormattedRelativeDateTime() {
/* 469 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public String toString() {
/* 475 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public int length() {
/* 481 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public char charAt(int index) {
/* 487 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public CharSequence subSequence(int start, int end) {
/* 493 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public <A extends Appendable> A appendTo(A appendable) {
/* 499 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean nextPosition(ConstrainedFieldPosition cfpos) {
/* 505 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public AttributedCharacterIterator toCharacterIterator() {
/* 511 */       throw new RuntimeException("Stub!");
/*     */     }
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
/*     */   public enum RelativeDateTimeUnit
/*     */   {
/* 526 */     YEAR,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 532 */     QUARTER,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 538 */     MONTH,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 544 */     WEEK,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 550 */     DAY,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 556 */     HOUR,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 562 */     MINUTE,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 568 */     SECOND,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 574 */     SUNDAY,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 580 */     MONDAY,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 586 */     TUESDAY,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 592 */     WEDNESDAY,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 598 */     THURSDAY,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 604 */     FRIDAY,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 610 */     SATURDAY;
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
/*     */   public enum RelativeUnit
/*     */   {
/* 624 */     SECONDS,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 629 */     MINUTES,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 634 */     HOURS,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 639 */     DAYS,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 644 */     WEEKS,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 649 */     MONTHS,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 654 */     YEARS;
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
/*     */   public enum Style
/*     */   {
/* 668 */     LONG,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 673 */     SHORT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 678 */     NARROW;
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/global/icu/text/RelativeDateTimeFormatter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */