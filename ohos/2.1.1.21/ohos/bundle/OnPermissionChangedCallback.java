/*    */ package ohos.bundle;
/*    */ 
/*    */ import ohos.rpc.IRemoteBroker;
/*    */ import ohos.rpc.IRemoteObject;
/*    */ import ohos.rpc.MessageOption;
/*    */ import ohos.rpc.MessageParcel;
/*    */ import ohos.rpc.RemoteException;
/*    */ import ohos.rpc.RemoteObject;
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
/*    */ public abstract class OnPermissionChangedCallback
/*    */   extends RemoteObject
/*    */   implements IRemoteBroker
/*    */ {
/*    */   public OnPermissionChangedCallback() {
/* 31 */     super(null); throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean onRemoteRequest(int code, MessageParcel data, MessageParcel reply, MessageOption option) throws RemoteException {
/* 38 */     throw new RuntimeException("Stub!");
/*    */   } public IRemoteObject asObject() {
/* 40 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract void onChanged(int paramInt);
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/bundle/OnPermissionChangedCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */