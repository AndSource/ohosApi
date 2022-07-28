/*    */ package ohos.aafwk.ability;
/*    */ 
/*    */ import ohos.aafwk.content.IntentParams;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface IAbilityContinuation
/*    */ {
/*    */   boolean onStartContinuation();
/*    */   
/*    */   boolean onSaveData(IntentParams paramIntentParams);
/*    */   
/*    */   boolean onRestoreData(IntentParams paramIntentParams);
/*    */   
/*    */   void onCompleteContinuation(int paramInt);
/*    */   
/*    */   default void onRemoteTerminated() {
/* 87 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/aafwk/ability/IAbilityContinuation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */