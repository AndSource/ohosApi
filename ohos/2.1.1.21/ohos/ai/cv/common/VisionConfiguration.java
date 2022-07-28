/*     */ package ohos.ai.cv.common;
/*     */ 
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class VisionConfiguration
/*     */ {
/*     */   public static final int APP_QUICK = 0;
/*     */   public static final int APP_TRADITIONAL = 1;
/*     */   public static final int MODE_IN = 0;
/*     */   public static final int MODE_OUT = 1;
/*     */   public static final int STATE_BACKGROUND = 1;
/*     */   public static final int STATE_FOREGROUND = 0;
/*     */   
/*     */   protected VisionConfiguration(Builder<?> builder) {
/*  32 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getProcessMode() {
/*  41 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PacMap getParam() {
/*  50 */     throw new RuntimeException("Stub!");
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
/*  92 */   protected int appType = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String clientPkgName;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 104 */   protected int clientState = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String clientVersion;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 116 */   protected int processMode = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static abstract class Builder<T extends Builder<T>>
/*     */   {
/*     */     public Builder() {
/* 126 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public T setAppType(int type) {
/* 136 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public T setClientPkgName(String pkgName) {
/* 146 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public T setClientVersion(String version) {
/* 156 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public T setClientState(int state) {
/* 166 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public T setProcessMode(int mode) {
/* 176 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/ai/cv/common/VisionConfiguration.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */