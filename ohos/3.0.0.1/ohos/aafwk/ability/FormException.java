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
/*  31 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getMessage() {
/*  40 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FormError getErrorCode() {
/*  49 */     throw new RuntimeException("Stub!");
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
/*     */   public enum FormError
/*     */   {
/*  64 */     INPUT_PARAM_INVALID,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  71 */     FMS_RPC_ERROR,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  78 */     BMS_RPC_ERROR,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  84 */     SEND_FMS_MSG_ERROR,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  90 */     SEND_BMS_MSG_ERROR,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  97 */     PERMISSION_DENY,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 104 */     FORM_INFO_NOT_FOUND,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 111 */     GET_BUNDLE_FAILED,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 118 */     INIT_LAYOUT_FAILED,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 124 */     BIND_PROVIDER_FAILED,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 132 */     FORM_DUPLICATE_ADDED,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 139 */     FORM_CFG_NOT_MATCH_ID,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 145 */     FORM_ID_NOT_EXIST,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 151 */     EXCEED_MAX_SYSTEM_FORMS,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 158 */     EXCEED_MAX_INSTANCES_PER_FORM,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 165 */     FORM_NOT_SELF_OWNED,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 171 */     PROVIDER_DELETE_FAIL,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 177 */     EXCEED_MAX_FORMS_PER_CLIENT,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 183 */     EXCEED_MAX_SYSTEM_TEMP_FORMS,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 190 */     MODULE_NOT_EXIST,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 197 */     ABILITY_NOT_EXIST,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 204 */     DIMENSION_NOT_EXIST,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 211 */     FA_NOT_INSTALLED,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 218 */     MAX_REQUEST,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 225 */     MAX_REFRESH,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 231 */     FORM_IN_RECOVER,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 237 */     INTERNAL_ERROR;
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/aafwk/ability/FormException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */