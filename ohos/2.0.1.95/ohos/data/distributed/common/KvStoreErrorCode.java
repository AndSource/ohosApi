/*     */ package ohos.data.distributed.common;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public enum KvStoreErrorCode
/*     */ {
/*  20 */   SUCCESS,
/*     */ 
/*     */   
/*  23 */   INVALID_ARGUMENT,
/*     */ 
/*     */   
/*  26 */   SERVER_UNAVAILABLE,
/*     */ 
/*     */   
/*  29 */   STORE_NOT_OPEN,
/*     */ 
/*     */   
/*  32 */   STORE_NOT_FOUND,
/*     */ 
/*     */   
/*  35 */   STORE_ALREADY_SUBSCRIBE,
/*     */ 
/*     */   
/*  38 */   STORE_NOT_SUBSCRIBE,
/*     */ 
/*     */   
/*  41 */   KEY_NOT_FOUND,
/*     */ 
/*     */   
/*  44 */   DB_ERROR,
/*     */ 
/*     */   
/*  47 */   NETWORK_ERROR,
/*     */ 
/*     */   
/*  50 */   NO_DEVICE_CONNECTED,
/*     */ 
/*     */   
/*  53 */   PERMISSION_DENIED,
/*     */ 
/*     */   
/*  56 */   IPC_ERROR,
/*     */ 
/*     */   
/*  59 */   UTF_8_NOT_SUPPORT,
/*     */ 
/*     */   
/*  62 */   DEVICE_NOT_FOUND,
/*     */ 
/*     */   
/*  65 */   UNKNOWN_ERROR,
/*     */ 
/*     */   
/*  68 */   NOT_SUPPORT,
/*     */ 
/*     */   
/*  71 */   SCHEMA_MISMATCH,
/*     */ 
/*     */   
/*  74 */   INVALID_SCHEMA,
/*     */ 
/*     */   
/*  77 */   READ_ONLY,
/*     */ 
/*     */   
/*  80 */   INVALID_VALUE_FIELDS,
/*     */ 
/*     */   
/*  83 */   INVALID_FIELD_TYPE,
/*     */ 
/*     */   
/*  86 */   CONSTRAIN_VIOLATION,
/*     */ 
/*     */   
/*  89 */   INVALID_FORMAT,
/*     */ 
/*     */   
/*  92 */   DEFAULT_DB_ERROR,
/*     */ 
/*     */   
/*  95 */   INVALID_QUERY_FORMAT,
/*     */ 
/*     */   
/*  98 */   INVALID_QUERY_FIELD,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 105 */   RECOVER_SUCCESS,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 112 */   RECOVER_FAILED,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 119 */   INVALID_VALUE_TYPE;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getErrorMsg() {
/* 128 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/data/distributed/common/KvStoreErrorCode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */