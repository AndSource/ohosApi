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
/*  34 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getBitsNumberPerPixel(int format) {
/*  44 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getComponentNumber(int format) {
/*  54 */     throw new RuntimeException("Stub!");
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
/* 133 */     YUV_Y,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 138 */     YUV_U,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 143 */     YUV_V,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 148 */     JPEG,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 153 */     RAW10,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 158 */     RAW16,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 163 */     H264,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 168 */     H265;
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/media/image/common/ImageFormat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */