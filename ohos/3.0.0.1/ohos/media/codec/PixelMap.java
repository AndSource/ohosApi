/*     */ package ohos.media.codec;
/*     */ 
/*     */ import java.nio.ByteBuffer;
/*     */ import ohos.agp.utils.Rect;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class PixelMap
/*     */   implements AutoCloseable
/*     */ {
/*     */   public PixelMap() {
/*  32 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract int obtainPixelFormat();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract int obtainPixelWidth();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract int obtainPixelHeight();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract long obtainPixelTimestamp();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setClipRectangle(Rect clipRect) {
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
/*     */   public abstract PixelPlane[] obtainPixelPlanes();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract void close();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static abstract class PixelPlane
/*     */   {
/*     */     public PixelPlane() {
/* 107 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/*     */     public abstract int obtainOneRowBytes();
/*     */     
/*     */     public abstract int obtainAdjPixelsBytes();
/*     */     
/*     */     public abstract ByteBuffer obtainPixelBytes();
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/media/codec/PixelMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */