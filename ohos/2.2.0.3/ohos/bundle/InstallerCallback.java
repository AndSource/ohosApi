/*    */ package ohos.bundle;
/*    */ 
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class InstallerCallback
/*    */   extends RemoteObject
/*    */   implements IInstallerCallback
/*    */ {
/*    */   public InstallerCallback() {
/* 33 */     super(null); throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean onRemoteRequest(int code, MessageParcel data, MessageParcel reply, MessageOption option) throws RemoteException {
/* 39 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public IRemoteObject asObject() {
/* 48 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract void onFinished(int paramInt, String paramString);
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/bundle/InstallerCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */