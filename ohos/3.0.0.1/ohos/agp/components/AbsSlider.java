/*    */ package ohos.agp.components;
/*    */ 
/*    */ import ohos.agp.components.element.Element;
/*    */ import ohos.app.Context;
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
/*    */ public abstract class AbsSlider
/*    */   extends ProgressBar
/*    */ {
/*    */   public AbsSlider(Context context) {
/* 31 */     super((Context)null); throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public AbsSlider(Context context, AttrSet attrSet) {
/* 41 */     super((Context)null); throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public AbsSlider(Context context, AttrSet attrSet, String styleName) {
/* 52 */     super((Context)null); throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setThumbElement(Element element) {
/* 61 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Element getThumbElement() {
/* 70 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setFormatter(Formatter formatter) {
/* 78 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Formatter getFormatter() {
/* 87 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public static interface Formatter {
/*    */     String format(int param1Int);
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/agp/components/AbsSlider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */