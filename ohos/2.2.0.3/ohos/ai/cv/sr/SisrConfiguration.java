/*     */ package ohos.ai.cv.sr;
/*     */ 
/*     */ import ohos.ai.cv.common.VisionConfiguration;
/*     */ import ohos.utils.PacMap;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SisrConfiguration
/*     */   extends VisionConfiguration
/*     */ {
/*     */   public static final int SISR_QUALITY_HIGH = 30;
/*     */   public static final int SISR_QUALITY_LOW = 10;
/*     */   public static final int SISR_QUALITY_MEDIUM = 20;
/*     */   public static final float SISR_SCALE_1X = 1.0F;
/*     */   public static final float SISR_SCALE_3X = 3.0F;
/*     */   
/*     */   SisrConfiguration(Builder builder) {
/*  24 */     super(null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 129 */     this.quality = 30;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 135 */     this.scale = 1.0F;
/*     */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   protected int quality;
/*     */   protected float scale;
/*     */   public PacMap getParam() { throw new RuntimeException("Stub!"); } public float getScale() { throw new RuntimeException("Stub!"); } public void setScale(float scale) { throw new RuntimeException("Stub!"); } public void setScale() { throw new RuntimeException("Stub!"); } public int getQuality() { throw new RuntimeException("Stub!"); } public void setQuality(int quality) { throw new RuntimeException("Stub!"); } public void setQuality() {
/*     */     throw new RuntimeException("Stub!");
/*     */   } public static class Builder extends VisionConfiguration.Builder<Builder>
/*     */   {
/*     */     public Builder() {
/* 145 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public SisrConfiguration build() {
/* 154 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/ai/cv/sr/SisrConfiguration.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */