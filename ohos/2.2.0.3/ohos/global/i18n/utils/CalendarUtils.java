/*    */ package ohos.global.i18n.utils;
/*    */ 
/*    */ import java.util.Locale;
/*    */ import ohos.global.icu.util.Calendar;
/*    */ import ohos.global.icu.util.ULocale;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class CalendarUtils
/*    */ {
/*    */   public CalendarUtils() {
/* 23 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Deprecated
/*    */   public static CalendarUtils getInstance() {
/* 34 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Deprecated
/*    */   public abstract String getCalendarName(Calendar paramCalendar, ULocale paramULocale);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static String getCalendarName(Calendar cal, Locale loc) {
/* 57 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static Calendar getPersianCalendar(Locale locale) {
/* 67 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/global/i18n/utils/CalendarUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */