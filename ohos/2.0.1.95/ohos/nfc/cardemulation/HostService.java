/*    */ package ohos.nfc.cardemulation;
/*    */ 
/*    */ import ohos.aafwk.ability.Ability;
/*    */ import ohos.aafwk.content.Intent;
/*    */ import ohos.aafwk.content.IntentParams;
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
/*    */ public abstract class HostService
/*    */   extends Ability
/*    */ {
/*    */   public static final String META_DATA_NAME = "ohos.nfc.cardemulation.data.host_service";
/*    */   public static final String SERVICE_NAME = "ohos.nfc.cardemulation.action.HOST_SERVICE";
/*    */   
/*    */   public HostService() {
/* 23 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final void sendResponse(byte[] response) {
/* 34 */     throw new RuntimeException("Stub!");
/*    */   }
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
/*    */   public abstract byte[] handleRemoteCommand(byte[] paramArrayOfbyte, IntentParams paramIntentParams);
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
/*    */   public abstract void disabledCallback(int paramInt);
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
/*    */   public IRemoteObject onConnect(Intent intent) {
/* 71 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/nfc/cardemulation/HostService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */