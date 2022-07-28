/*    */ package ohos.global.i18n.text;
/*    */ 
/*    */ import java.util.Locale;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class MeasureFormatter
/*    */ {
/*    */   public MeasureFormatter() {
/* 29 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static MeasureFormatter getInstance() {
/* 38 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static MeasureFormatter getInstance(Locale locale) {
/* 48 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract void setFractionPrecision(int paramInt);
/*    */   
/*    */   public abstract String format(MeasureOptions.Unit paramUnit, double paramDouble, MeasureOptions.FormatStyle paramFormatStyle);
/*    */   
/*    */   public abstract String format(MeasureOptions.Unit paramUnit, double paramDouble, MeasureOptions.Usage paramUsage, MeasureOptions.FormatStyle paramFormatStyle, MeasureOptions.Style paramStyle) throws NotSupportConvertException;
/*    */   
/*    */   public abstract String format(MeasureOptions.Unit paramUnit1, double paramDouble, MeasureOptions.Unit paramUnit2, MeasureOptions.FormatStyle paramFormatStyle) throws NotSupportConvertException;
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/global/i18n/text/MeasureFormatter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */