/*     */ package ohos.media.image.common;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ImageFormat
/*     */ {
/*     */   public static final int H264 = 6;
/*     */   public static final int H265 = 7;
/*     */   public static final int JPEG = 3;
/*     */   public static final int NV21 = 1;
/*     */   public static final int RAW10 = 4;
/*     */   public static final int RAW16 = 5;
/*     */   public static final int UNKNOWN = 0;
/*     */   public static final int YUV420_888 = 2;
/*     */   
/*     */   ImageFormat() {
/*  26 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getBitsNumberPerPixel(int format) {
/*  36 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getComponentNumber(int format) {
/*  46 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public enum ComponentType
/*     */   {
/* 125 */     YUV_Y,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 130 */     YUV_U,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 135 */     YUV_V,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 140 */     JPEG,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 145 */     RAW10,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 150 */     RAW16,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 155 */     H264,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 160 */     H265;
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/media/image/common/ImageFormat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */