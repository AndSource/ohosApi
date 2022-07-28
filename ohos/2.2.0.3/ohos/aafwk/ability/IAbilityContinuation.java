/*     */ package ohos.aafwk.ability;
/*     */ 
/*     */ import ohos.aafwk.content.IntentParams;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public interface IAbilityContinuation
/*     */ {
/*     */   public static final int ERR_ABILITY_QUERY_FAILED = -2;
/*     */   public static final int ERR_CONTINUE_TIMEOUT = -8;
/*     */   public static final int ERR_DEVICE_OFFLINE = -9;
/*     */   public static final int ERR_INSTALL_FREE_NOT_SUPPORTED = -4;
/*     */   public static final int ERR_NETWORK_UNAVAILABLE = -3;
/*     */   public static final int ERR_PARAMETER_INVALID = -6;
/*     */   public static final int ERR_PERMISSION_DENIED = -5;
/*     */   public static final int ERR_REMOTE_DEVICE_INCOMPATIBLE = -7;
/*     */   public static final int ERR_UNKNOWN = -1;
/*     */   public static final int SUCCESS = 0;
/*     */   
/*     */   boolean onStartContinuation();
/*     */   
/*     */   boolean onSaveData(IntentParams paramIntentParams);
/*     */   
/*     */   boolean onRestoreData(IntentParams paramIntentParams);
/*     */   
/*     */   void onCompleteContinuation(int paramInt);
/*     */   
/*     */   default void onRemoteTerminated() {
/*  90 */     throw new RuntimeException("Stub!");
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
/*     */   default void onFailedContinuation(int errorCode) {
/* 102 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/aafwk/ability/IAbilityContinuation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */