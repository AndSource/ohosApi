/*     */ package ohos.agp.graphics;
/*     */ 
/*     */ import ohos.agp.render.Canvas;
/*     */ import ohos.utils.Parcel;
/*     */ import ohos.utils.Sequenceable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Surface
/*     */   implements Sequenceable
/*     */ {
/*     */   public Surface() {
/*  35 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Canvas acquireCanvas() {
/*  44 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void syncCanvasDrawCalls() {
/*  52 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean bindToTextureHolder(TextureHolder textureHolder) {
/*  63 */     throw new RuntimeException("Stub!");
/*     */   } public boolean marshalling(Parcel out) {
/*  65 */     throw new RuntimeException("Stub!");
/*     */   } public boolean unmarshalling(Parcel in) {
/*  67 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean showRawImage(byte[] rawImageData, PixelFormat format, int width, int height) {
/*  81 */     throw new RuntimeException("Stub!");
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
/*     */   public enum PixelFormat
/*     */   {
/*  96 */     PIXEL_FORMAT_YCBCR_422_I,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 101 */     PIXEL_FORMAT_YCRCB_420_SP,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 106 */     PIXEL_FORMAT_YV12;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int value() {
/* 114 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/agp/graphics/Surface.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */