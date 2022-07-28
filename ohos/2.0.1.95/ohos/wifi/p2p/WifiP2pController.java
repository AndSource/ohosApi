/*     */ package ohos.wifi.p2p;
/*     */ 
/*     */ import ohos.app.Context;
/*     */ import ohos.eventhandler.EventRunner;
/*     */ import ohos.rpc.IRemoteObject;
/*     */ import ohos.rpc.RemoteException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class WifiP2pController
/*     */ {
/*     */   public static final int DEVICE_INFO_REQUEST = 2;
/*     */   public static final int DEVICE_LIST_REQUEST = 6;
/*     */   public static final int GROUP_INFO_REQUEST = 1;
/*     */   public static final int NETWORK_INFO_REQUEST = 4;
/*     */   
/*     */   WifiP2pController(Context context) {
/*  32 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static WifiP2pController getInstance(Context context) throws IllegalArgumentException {
/*  45 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public IRemoteObject init(EventRunner eventRunner, WifiP2pCallback callback) throws RemoteException {
/*  60 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void discoverDevices(WifiP2pCallback callback) throws RemoteException {
/*  74 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void stopDeviceDiscovery(WifiP2pCallback callback) throws RemoteException {
/*  88 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void createGroup(WifiP2pConfig wifiP2pConfig, WifiP2pCallback callback) throws RemoteException {
/* 103 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeGroup(WifiP2pCallback callback) throws RemoteException {
/* 117 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void requestP2pInfo(int requestType, WifiP2pCallback callback) throws RemoteException {
/* 133 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void connect(WifiP2pConfig wifiP2pConfig, WifiP2pCallback callback) throws RemoteException {
/* 148 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void cancelConnect(WifiP2pCallback callback) throws RemoteException {
/* 162 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/wifi/p2p/WifiP2pController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */