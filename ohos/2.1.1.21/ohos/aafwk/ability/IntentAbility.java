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
/*    */ 
/*    */ 
/*    */ public abstract class IntentAbility
/*    */   extends Ability
/*    */ {
/*    */   public IntentAbility(String name) {
/* 41 */     throw new RuntimeException("Stub!");
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
/* 52 */     throw new RuntimeException("Stub!");
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
/* 64 */     throw new RuntimeException("Stub!");
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
/* 75 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   protected abstract void onProcessIntent(Intent paramIntent);
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/aafwk/ability/IntentAbility.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */