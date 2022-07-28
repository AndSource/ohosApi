/*     */ package ohos.global.icu.text;
/*     */ 
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
/*     */   public String formatNumeric(double offset, RelativeDateTimeUnit unit) {
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
/*     */   public String format(Direction direction, AbsoluteUnit unit) {
/* 179 */     throw new RuntimeException("Stub!");
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
/* 198 */     throw new RuntimeException("Stub!");
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
/* 210 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public NumberFormat getNumberFormat() {
/* 217 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DisplayContext getCapitalizationContext() {
/* 224 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Style getFormatStyle() {
/* 231 */     throw new RuntimeException("Stub!");
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
/* 242 */     SUNDAY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 247 */     MONDAY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 252 */     TUESDAY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 257 */     WEDNESDAY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 262 */     THURSDAY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 267 */     FRIDAY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 272 */     SATURDAY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 277 */     DAY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 282 */     WEEK,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 287 */     MONTH,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 292 */     YEAR,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 297 */     NOW;
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
/* 311 */     LAST_2,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 316 */     LAST,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 321 */     THIS,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 326 */     NEXT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 331 */     NEXT_2,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 336 */     PLAIN;
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
/*     */   public enum RelativeDateTimeUnit
/*     */   {
/* 351 */     YEAR,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 357 */     QUARTER,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 363 */     MONTH,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 369 */     WEEK,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 375 */     DAY,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 381 */     HOUR,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 387 */     MINUTE,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 393 */     SECOND,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 399 */     SUNDAY,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 405 */     MONDAY,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 411 */     TUESDAY,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 417 */     WEDNESDAY,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 423 */     THURSDAY,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 429 */     FRIDAY,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 435 */     SATURDAY;
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
/* 449 */     SECONDS,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 454 */     MINUTES,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 459 */     HOURS,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 464 */     DAYS,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 469 */     WEEKS,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 474 */     MONTHS,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 479 */     YEARS;
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
/* 493 */     LONG,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 498 */     SHORT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 503 */     NARROW;
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/global/icu/text/RelativeDateTimeFormatter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */