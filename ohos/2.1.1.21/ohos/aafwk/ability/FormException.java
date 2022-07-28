/*     */ package ohos.aafwk.ability;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FormException
/*     */   extends Exception
/*     */ {
/*     */   FormException(FormError formErr) {
/*  23 */     throw new RuntimeException("Stub!");
/*     */   } public String getMessage() {
/*  25 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FormError getErrorCode() {
/*  34 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public enum FormError
/*     */   {
/*  46 */     INPUT_PARAM_INVALID,
/*     */ 
/*     */ 
/*     */     
/*  50 */     FMS_RPC_ERROR,
/*     */ 
/*     */ 
/*     */     
/*  54 */     BMS_RPC_ERROR,
/*     */ 
/*     */     
/*  57 */     SEND_FMS_MSG_ERROR,
/*     */ 
/*     */     
/*  60 */     SEND_BMS_MSG_ERROR,
/*     */ 
/*     */ 
/*     */     
/*  64 */     PERMISSION_DENY,
/*     */ 
/*     */ 
/*     */     
/*  68 */     FORM_INFO_NOT_FOUND,
/*     */ 
/*     */ 
/*     */     
/*  72 */     GET_BUNDLE_FAILED,
/*     */ 
/*     */ 
/*     */     
/*  76 */     INIT_LAYOUT_FAILED,
/*     */ 
/*     */     
/*  79 */     BIND_PROVIDER_FAILED,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  84 */     FORM_DUPLICATE_ADDED,
/*     */ 
/*     */ 
/*     */     
/*  88 */     FORM_CFG_NOT_MATCH_ID,
/*     */ 
/*     */     
/*  91 */     FORM_ID_NOT_EXIST,
/*     */ 
/*     */     
/*  94 */     EXCEED_MAX_SYSTEM_FORMS,
/*     */ 
/*     */ 
/*     */     
/*  98 */     EXCEED_MAX_INSTANCES_PER_FORM,
/*     */ 
/*     */ 
/*     */     
/* 102 */     FORM_NOT_SELF_OWNED,
/*     */ 
/*     */     
/* 105 */     PROVIDER_DELETE_FAIL,
/*     */ 
/*     */     
/* 108 */     EXCEED_MAX_FORMS_PER_CLIENT,
/*     */ 
/*     */     
/* 111 */     EXCEED_MAX_SYSTEM_TEMP_FORMS,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 118 */     MODULE_NOT_EXIST,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 125 */     ABILITY_NOT_EXIST,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 132 */     DIMENSION_NOT_EXIST,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 139 */     FA_NOT_INSTALLED,
/*     */ 
/*     */     
/* 142 */     FORM_IN_RECOVER,
/*     */ 
/*     */     
/* 145 */     INTERNAL_ERROR;
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/aafwk/ability/FormException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */