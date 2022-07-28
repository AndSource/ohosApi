/*    */ package ohos.eventhandler;
/*    */ 
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Courier
/*    */   implements Sequenceable
/*    */ {
/*    */   public Courier(EventHandler eventHandler) {
/* 31 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Courier(IRemoteObject remote) {
/* 40 */     throw new RuntimeException("Stub!");
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
/* 51 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public IRemoteObject getRemoteObject() {
/* 61 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean marshalling(Parcel out) {
/* 68 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean unmarshalling(Parcel in) {
/* 75 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 84 */   public static final Sequenceable.Producer<Courier> PRODUCER = null;
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/eventhandler/Courier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */