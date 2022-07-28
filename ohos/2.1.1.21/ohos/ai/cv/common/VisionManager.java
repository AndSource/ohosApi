/*     */ package ohos.ai.cv.common;
/*     */ 
/*     */ import ohos.ai.cv.docrefine.IDocRefine;
/*     */ import ohos.ai.cv.qrcode.IBarcodeDetector;
/*     */ import ohos.ai.cv.sr.IImageSuperResolution;
/*     */ import ohos.ai.cv.sr.ITxtImageSuperResolution;
/*     */ import ohos.ai.cv.text.ITextDetector;
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
/*     */ public class VisionManager
/*     */ {
/*     */   VisionManager() {
/*  30 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int init(Context context, ConnectionCallback connectionCallback) {
/*  41 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void destroy() {
/*  49 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static IImageSuperResolution getSisr(Context context) {
/*  59 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static ITxtImageSuperResolution getTisr(Context context) {
/*  69 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static IDocRefine getDocRefine(Context context) {
/*  79 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static ITextDetector getTextDetector(Context context) {
/*  89 */     throw new RuntimeException("Stub!");
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
/*     */   public static IBarcodeDetector getBarcodeDetector(Context context) {
/* 101 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/ai/cv/common/VisionManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */