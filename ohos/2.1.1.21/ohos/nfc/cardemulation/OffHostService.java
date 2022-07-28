/*    */ package ohos.nfc.cardemulation;
/*    */ 
/*    */ import ohos.aafwk.ability.Ability;
/*    */ import ohos.aafwk.content.Intent;
/*    */ import ohos.rpc.IRemoteObject;
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
/*    */ public abstract class OffHostService
/*    */   extends Ability
/*    */ {
/*    */   public static final String META_DATA_NAME = "ohos.nfc.cardemulation.data.off_host_service";
/*    */   public static final String SERVICE_NAME = "ohos.nfc.cardemulation.action.OFF_HOST_SERVICE";
/*    */   
/*    */   public OffHostService() {
/* 32 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract IRemoteObject onConnect(Intent paramIntent);
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/nfc/cardemulation/OffHostService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */