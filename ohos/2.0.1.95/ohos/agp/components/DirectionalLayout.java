/*     */ package ohos.agp.components;
/*     */ 
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
/*     */ public class DirectionalLayout
/*     */   extends ComponentContainer
/*     */ {
/*     */   public DirectionalLayout(Context context) {
/*  32 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DirectionalLayout(Context context, AttrSet attrSet) {
/*  42 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DirectionalLayout(Context context, AttrSet attrSet, String styleName) {
/*  53 */     super((Context)null); throw new RuntimeException("Stub!");
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
/*     */   public void setAlignment(int alignment) {
/*  67 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOrientation(int orientation) {
/*  77 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getAlignment() {
/*  88 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getOrientation() {
/*  97 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTotalWeight(float totalWeight) {
/* 106 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getTotalWeight() {
/* 115 */     throw new RuntimeException("Stub!");
/*     */   } public ComponentContainer.LayoutConfig verifyLayoutConfig(ComponentContainer.LayoutConfig config) {
/* 117 */     throw new RuntimeException("Stub!");
/*     */   } public ComponentContainer.LayoutConfig createLayoutConfig(Context context, AttrSet attrSet) {
/* 119 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static class LayoutConfig
/*     */     extends ComponentContainer.LayoutConfig
/*     */   {
/*     */     public static final int UNSPECIFIED_ALIGNMENT = -1;
/*     */ 
/*     */     
/*     */     public static final float UNSPECIFIED_WEIGHT = 0.0F;
/*     */ 
/*     */ 
/*     */     
/*     */     public LayoutConfig() {
/* 135 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public LayoutConfig(Context context, AttrSet attrSet) {
/* 144 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public LayoutConfig(int width, int height) {
/* 155 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public LayoutConfig(int width, int height, int alignment, float weight) {
/* 169 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public LayoutConfig(ComponentContainer.LayoutConfig source) {
/* 178 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public LayoutConfig(LayoutConfig source) {
/* 187 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 205 */     public int alignment = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 211 */     public float weight = 0.0F;
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/agp/components/DirectionalLayout.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */