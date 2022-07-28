/*    */ package ohos.ace.ability;
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
/*    */ public interface LocalParticleAbility
/*    */ {
/*    */   default void register(AceAbility ability) {
/* 36 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   default void deregister(AceAbility ability) {
/* 45 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public static interface Callback {
/*    */     void reply(Object param1Object);
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/ace/ability/LocalParticleAbility.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */