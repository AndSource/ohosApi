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
/*     */ public class Surface
/*     */   implements Sequenceable
/*     */ {
/*     */   public Surface() {
/*  27 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Canvas acquireCanvas() {
/*  36 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void syncCanvasDrawCalls() {
/*  44 */     throw new RuntimeException("Stub!");
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
/*  55 */     throw new RuntimeException("Stub!");
/*     */   } public boolean marshalling(Parcel out) {
/*  57 */     throw new RuntimeException("Stub!");
/*     */   } public boolean unmarshalling(Parcel in) {
/*  59 */     throw new RuntimeException("Stub!");
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
/*  73 */     throw new RuntimeException("Stub!");
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
/*  88 */     PIXEL_FORMAT_YCBCR_422_I,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  93 */     PIXEL_FORMAT_YCRCB_420_SP,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  98 */     PIXEL_FORMAT_YV12;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int value() {
/* 106 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/agp/graphics/Surface.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */