/*    */ package ohos.interwork.eventhandler;
/*    */ 
/*    */ import ohos.eventhandler.Courier;
/*    */ import ohos.eventhandler.EventHandler;
/*    */ import ohos.eventhandler.InnerEvent;
/*    */ import ohos.rpc.IRemoteObject;
/*    */ import ohos.rpc.RemoteException;
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
/*    */ public final class CourierEx
/*    */   extends Courier
/*    */ {
/*    */   public CourierEx(EventHandlerEx eventHandler) {
/* 31 */     super((EventHandler)null); throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void send(InnerEvent innerEvent) throws RemoteException {
/* 42 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public IRemoteObject getRemoteObject() {
/* 52 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean marshalling(Parcel out) {
/* 62 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean unmarshalling(Parcel in) {
/* 72 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 81 */   public static final Sequenceable.Producer<CourierEx> PRODUCER = null;
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/interwork/eventhandler/CourierEx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */