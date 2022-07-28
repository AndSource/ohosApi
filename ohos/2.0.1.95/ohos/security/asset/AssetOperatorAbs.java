/*    */ package ohos.security.asset;
/*    */ 
/*    */ import ohos.aafwk.ability.Ability;
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
/*    */ public abstract class AssetOperatorAbs
/*    */ {
/*    */   public AssetOperatorAbs() {
/* 25 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract AssetResult assetInsert(Ability paramAbility, IntentParams paramIntentParams);
/*    */   
/*    */   public abstract AssetResult assetDelete(Ability paramAbility, IntentParams paramIntentParams);
/*    */   
/*    */   public abstract AssetResult assetUpdate(Ability paramAbility, IntentParams paramIntentParams);
/*    */   
/*    */   public abstract AssetResult assetSelect(Ability paramAbility, IntentParams paramIntentParams);
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/security/asset/AssetOperatorAbs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */