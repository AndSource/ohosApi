/*    */ package ohos.aafwk.ability;
/*    */ 
/*    */ import ohos.aafwk.content.Intent;
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
/*    */ public abstract class IntentAbility
/*    */   extends Ability
/*    */ {
/*    */   public IntentAbility(String name) {
/* 39 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void onStart(Intent intent) {
/* 50 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Deprecated
/*    */   protected void onCommand(Intent intent, boolean restart) {
/* 62 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void onCommand(Intent intent, boolean restart, int startId) {
/* 73 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   protected abstract void onProcessIntent(Intent paramIntent);
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/aafwk/ability/IntentAbility.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */