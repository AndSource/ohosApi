/*    */ package ohos.telephony;
/*    */ 
/*    */ import java.util.List;
/*    */ import ohos.eventhandler.EventRunner;
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
/*    */ public class RadioStateObserver
/*    */ {
/*    */   public static final int OBSERVE_MASK_CELL_INFO = 4;
/*    */   public static final int OBSERVE_MASK_NETWORK_STATE = 1;
/*    */   public static final int OBSERVE_MASK_SIGNAL_INFO = 2;
/*    */   protected int slotId;
/*    */   
/*    */   public RadioStateObserver(int slotId) {
/* 43 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public RadioStateObserver(int slotId, EventRunner runner) {
/* 53 */     throw new RuntimeException("Stub!");
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
/*    */   public void onNetworkStateUpdated(NetworkState networkState) {
/* 65 */     throw new RuntimeException("Stub!");
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
/*    */   public void onSignalInfoUpdated(List<SignalInformation> signalInfos) {
/* 77 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/telephony/RadioStateObserver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */