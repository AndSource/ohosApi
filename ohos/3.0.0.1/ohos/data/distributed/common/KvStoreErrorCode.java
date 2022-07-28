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
/*     */ 
/*     */ 
/*     */ public enum KvStoreErrorCode
/*     */ {
/*  22 */   SUCCESS,
/*     */ 
/*     */   
/*  25 */   INVALID_ARGUMENT,
/*     */ 
/*     */   
/*  28 */   SERVER_UNAVAILABLE,
/*     */ 
/*     */   
/*  31 */   STORE_NOT_OPEN,
/*     */ 
/*     */   
/*  34 */   STORE_NOT_FOUND,
/*     */ 
/*     */   
/*  37 */   STORE_ALREADY_SUBSCRIBE,
/*     */ 
/*     */   
/*  40 */   STORE_NOT_SUBSCRIBE,
/*     */ 
/*     */   
/*  43 */   KEY_NOT_FOUND,
/*     */ 
/*     */   
/*  46 */   DB_ERROR,
/*     */ 
/*     */   
/*  49 */   NETWORK_ERROR,
/*     */ 
/*     */   
/*  52 */   NO_DEVICE_CONNECTED,
/*     */ 
/*     */   
/*  55 */   PERMISSION_DENIED,
/*     */ 
/*     */   
/*  58 */   IPC_ERROR,
/*     */ 
/*     */   
/*  61 */   UTF_8_NOT_SUPPORT,
/*     */ 
/*     */   
/*  64 */   DEVICE_NOT_FOUND,
/*     */ 
/*     */   
/*  67 */   UNKNOWN_ERROR,
/*     */ 
/*     */   
/*  70 */   NOT_SUPPORT,
/*     */ 
/*     */   
/*  73 */   SCHEMA_MISMATCH,
/*     */ 
/*     */   
/*  76 */   INVALID_SCHEMA,
/*     */ 
/*     */   
/*  79 */   READ_ONLY,
/*     */ 
/*     */   
/*  82 */   INVALID_VALUE_FIELDS,
/*     */ 
/*     */   
/*  85 */   INVALID_FIELD_TYPE,
/*     */ 
/*     */   
/*  88 */   CONSTRAIN_VIOLATION,
/*     */ 
/*     */   
/*  91 */   INVALID_FORMAT,
/*     */ 
/*     */   
/*  94 */   DEFAULT_DB_ERROR,
/*     */ 
/*     */   
/*  97 */   INVALID_QUERY_FORMAT,
/*     */ 
/*     */   
/* 100 */   INVALID_QUERY_FIELD,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 107 */   RECOVER_SUCCESS,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 114 */   RECOVER_FAILED,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 121 */   INVALID_VALUE_TYPE,
/*     */ 
/*     */   
/* 124 */   EXCEED_MAX_ACCESS_RATE,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 131 */   SECURITY_LEVEL_ERROR;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getErrorMsg() {
/* 140 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/data/distributed/common/KvStoreErrorCode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */