/*     */ package ohos.agp.components.webengine;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public interface FontConfig
/*     */ {
/*     */   void setFontFamily(FontGenericFamily paramFontGenericFamily, String paramString);
/*     */   
/*     */   String getFontFamily(FontGenericFamily paramFontGenericFamily);
/*     */   
/*     */   void setFontSize(FontSizeType paramFontSizeType, int paramInt);
/*     */   
/*     */   int getFontSize(FontSizeType paramFontSizeType);
/*     */   
/*     */   public enum FontGenericFamily
/*     */   {
/*  78 */     GENERIC_FAMILY_STANDARD,
/*     */ 
/*     */     
/*  81 */     GENERIC_FAMILY_FIXED,
/*     */ 
/*     */     
/*  84 */     GENERIC_FAMILY_SERIF,
/*     */ 
/*     */     
/*  87 */     GENERIC_FAMILY_SANS_SERIF,
/*     */ 
/*     */     
/*  90 */     GENERIC_FAMILY_CURSIVE,
/*     */ 
/*     */     
/*  93 */     GENERIC_FAMILY_FANTASY;
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
/*     */   public enum FontSizeType
/*     */   {
/* 106 */     SIZE_TYPE_DEFAULT,
/*     */ 
/*     */     
/* 109 */     SIZE_TYPE_DEFAULT_FIXED,
/*     */ 
/*     */     
/* 112 */     SIZE_TYPE_MINIMUM,
/*     */ 
/*     */     
/* 115 */     SIZE_TYPE_MINIMUM_LOGICAL;
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/agp/components/webengine/FontConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */