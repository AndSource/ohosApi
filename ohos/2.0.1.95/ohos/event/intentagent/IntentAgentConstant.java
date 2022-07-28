/*     */ package ohos.event.intentagent;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class IntentAgentConstant
/*     */ {
/*     */   IntentAgentConstant() {
/*  21 */     throw new RuntimeException("Stub!");
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
/*     */   public enum Flags
/*     */   {
/*  34 */     ONE_TIME_FLAG,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  39 */     NO_BUILD_FLAG,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  44 */     CANCEL_PRESENT_FLAG,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  50 */     UPDATE_PRESENT_FLAG,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  55 */     CONSTANT_FLAG,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  61 */     REPLACE_ELEMENT,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  67 */     REPLACE_ACTION,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  72 */     REPLACE_URI,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  78 */     REPLACE_ENTITIES,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  84 */     REPLACE_BUNDLE;
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
/*     */   public enum OperationType
/*     */   {
/*  99 */     UNKNOWN_TYPE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 104 */     START_ABILITY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 109 */     START_ABILITIES,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 114 */     START_SERVICE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 119 */     SEND_COMMON_EVENT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 124 */     START_FOREGROUND_SERVICE;
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/event/intentagent/IntentAgentConstant.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */