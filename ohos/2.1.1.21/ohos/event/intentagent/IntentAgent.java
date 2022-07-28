/*    */ package ohos.event.intentagent;
/*    */ 
/*    */ import ohos.aafwk.content.Intent;
/*    */ import ohos.aafwk.content.IntentParams;
/*    */ import ohos.utils.Parcel;
/*    */ import ohos.utils.Sequenceable;
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
/*    */ public final class IntentAgent
/*    */   implements Sequenceable
/*    */ {
/*    */   IntentAgent(Object obj) {
/* 44 */     throw new RuntimeException("Stub!");
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
/*    */   public boolean marshalling(Parcel out) {
/* 58 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean unmarshalling(Parcel in) {
/* 69 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 78 */   public static final Sequenceable.Producer<IntentAgent> PRODUCER = null;
/*    */   
/*    */   public static interface OnCompleted {
/*    */     void onSendCompleted(IntentAgent param1IntentAgent, Intent param1Intent, int param1Int, String param1String, IntentParams param1IntentParams);
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/event/intentagent/IntentAgent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */