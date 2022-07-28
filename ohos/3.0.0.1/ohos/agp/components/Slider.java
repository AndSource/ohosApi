/*     */ package ohos.agp.components;
/*     */ 
/*     */ import ohos.agp.components.element.Element;
/*     */ import ohos.app.Context;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Slider
/*     */   extends AbsSlider
/*     */ {
/*     */   protected ValueChangedListener mValueChangedListener;
/*     */   
/*     */   public Slider(Context context) {
/*  40 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Slider(Context context, AttrSet attrSet) {
/*  50 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Slider(Context context, AttrSet attrSet, String styleName) {
/*  61 */     super((Context)null); throw new RuntimeException("Stub!");
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
/*     */   public void setValueChangedListener(ValueChangedListener listener) {
/*  73 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ValueChangedListener getValueChangedListener() {
/*  82 */     throw new RuntimeException("Stub!");
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
/*     */   public void setIncreaseButton(Element element, Component.ClickedListener listener) {
/*  95 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIncreaseButtonElement(Element element) {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIncreaseButtonClickedListener(Component.ClickedListener listener) {
/* 114 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Component.ClickedListener getIncreaseButtonClickedListener() {
/* 123 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Element getIncreaseButton() {
/* 132 */     throw new RuntimeException("Stub!");
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
/*     */   public void setDecreaseButton(Element element, Component.ClickedListener listener) {
/* 145 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDecreaseButtonElement(Element element) {
/* 154 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDecreaseButtonClickedListener(Component.ClickedListener listener) {
/* 164 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Component.ClickedListener getDecreaseButtonClickedListener() {
/* 173 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Element getDecreaseButton() {
/* 182 */     throw new RuntimeException("Stub!");
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
/*     */   public void setAdjustButtons(Element increaseElement, Component.ClickedListener increaseListener, Element decreaseElement, Component.ClickedListener decreaseListener) {
/* 199 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Element[] getAdjustButtonsElements() {
/* 208 */     throw new RuntimeException("Stub!");
/*     */   } public Element getThumbElement() {
/* 210 */     throw new RuntimeException("Stub!");
/*     */   } public void setThumbElement(Element element) {
/* 212 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static interface ValueChangedListener {
/*     */     void onProgressUpdated(Slider param1Slider, int param1Int, boolean param1Boolean);
/*     */     
/*     */     void onTouchStart(Slider param1Slider);
/*     */     
/*     */     void onTouchEnd(Slider param1Slider);
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/agp/components/Slider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */