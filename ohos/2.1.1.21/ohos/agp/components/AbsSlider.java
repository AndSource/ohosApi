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
/*    */ public abstract class AbsSlider
/*    */   extends ProgressBar
/*    */ {
/*    */   public AbsSlider(Context context) {
/* 23 */     super((Context)null); throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public AbsSlider(Context context, AttrSet attrSet) {
/* 33 */     super((Context)null); throw new RuntimeException("Stub!");
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
/* 44 */     super((Context)null); throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setThumbElement(Element element) {
/* 53 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Element getThumbElement() {
/* 62 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setFormatter(Formatter formatter) {
/* 70 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Formatter getFormatter() {
/* 79 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public static interface Formatter {
/*    */     String format(int param1Int);
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/agp/components/AbsSlider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */