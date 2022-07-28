/*     */ package ohos.agp.render;
/*     */ 
/*     */ import ohos.agp.utils.Color;
/*     */ import ohos.agp.utils.Matrix;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class Shader
/*     */ {
/*     */   public int[] intColors;
/*     */   protected int mTileMode;
/*     */   public Color[] shaderColors;
/*     */   
/*     */   public Shader(Color[] colors, TileMode newTileMode) {
/*  36 */     throw new RuntimeException("Stub!");
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
/*     */   public TileMode getTileMode() {
/*  49 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Color[] getShaderColors() {
/*  58 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setShaderMatrix(Matrix matrix) {
/*  69 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public enum TileMode
/*     */   {
/* 111 */     CLAMP_TILEMODE,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 119 */     REPEAT_TILEMODE,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 127 */     MIRROR_TILEMODE;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int value() {
/* 135 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/agp/render/Shader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */