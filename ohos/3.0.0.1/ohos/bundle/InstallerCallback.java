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
/* 41 */     super(null); throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean onRemoteRequest(int code, MessageParcel data, MessageParcel reply, MessageOption option) throws RemoteException {
/* 47 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public IRemoteObject asObject() {
/* 56 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract void onFinished(int paramInt, String paramString);
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/bundle/InstallerCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */