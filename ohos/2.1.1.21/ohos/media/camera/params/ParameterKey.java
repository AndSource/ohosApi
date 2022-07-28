/*     */ package ohos.media.camera.params;
/*     */ 
/*     */ import ohos.utils.Scope;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ParameterKey
/*     */ {
/*     */   ParameterKey() {
/*  23 */     throw new RuntimeException("Stub!");
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
/*  36 */   public static final Key<Scope<Integer>> EXPOSURE_FPS_RANGE = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  47 */   public static final Key<Byte> IMAGE_COMPRESSION_QUALITY = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  56 */   public static final Key<Boolean> IMAGE_MIRROR = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  65 */   public static final Key<byte[]> VENDOR_CUSTOM = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  74 */   public static final Key<Boolean> VIDEO_STABILIZATION = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class Key<T>
/*     */   {
/*     */     public Key(String name, Class<T> type) {
/*  93 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String getName() {
/* 102 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean checkType(Class<?> clazz) {
/* 112 */       throw new RuntimeException("Stub!");
/*     */     } public boolean equals(Object key) {
/* 114 */       throw new RuntimeException("Stub!");
/*     */     } public int hashCode() {
/* 116 */       throw new RuntimeException("Stub!");
/*     */     } public String toString() {
/* 118 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Object cloneValue(Object value) {
/* 128 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/media/camera/params/ParameterKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */