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
/*    */ 
/*    */ public abstract class AssetOperatorAbs
/*    */ {
/*    */   public AssetOperatorAbs() {
/* 26 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract AssetResult assetInsert(Ability paramAbility, IntentParams paramIntentParams);
/*    */   
/*    */   public abstract AssetResult assetDelete(Ability paramAbility, IntentParams paramIntentParams);
/*    */   
/*    */   public abstract AssetResult assetUpdate(Ability paramAbility, IntentParams paramIntentParams);
/*    */   
/*    */   public abstract AssetResult assetSelect(Ability paramAbility, IntentParams paramIntentParams);
/*    */   
/*    */   public abstract AssetResult assetInsert(IntentParams paramIntentParams);
/*    */   
/*    */   public abstract AssetResult assetDelete(IntentParams paramIntentParams);
/*    */   
/*    */   public abstract AssetResult assetUpdate(IntentParams paramIntentParams);
/*    */   
/*    */   public abstract AssetResult assetSelect(IntentParams paramIntentParams);
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/security/asset/AssetOperatorAbs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */