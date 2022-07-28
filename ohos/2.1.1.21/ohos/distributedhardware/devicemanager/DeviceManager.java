/*     */ package ohos.distributedhardware.devicemanager;
/*     */ 
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class DeviceManager
/*     */ {
/*     */   public static final String SIFT_FILTER = "siftFilter";
/*     */   public static final String SORT_TYPE = "sortType";
/*     */   public static final String TARGET_PACKAGE_NAME = "targetPkgName";
/*     */   
/*     */   DeviceManager() {
/*  35 */     throw new RuntimeException("Stub!");
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
/*     */   public static synchronized int createInstance(DeviceManagerCallback callback) {
/*  51 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static synchronized void releaseInstance() {
/*  59 */     throw new RuntimeException("Stub!");
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
/*     */   public List<DeviceInfo> getTrustedDeviceList(String bundleName, Map<String, Object> extras) throws SecurityException {
/*  73 */     throw new RuntimeException("Stub!");
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
/*     */   
/*     */   public int selectDeviceList(String bundleName, Map<String, Object> extras, SelectDeviceListListener listener) throws SecurityException {
/*  90 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DeviceInfo getLocalDeviceInfo() throws SecurityException {
/* 100 */     throw new RuntimeException("Stub!");
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
/*     */   public int registerDeviceStateCallback(String bundleName, Map<String, Object> extras, DeviceStateCallback callback) throws SecurityException {
/* 116 */     throw new RuntimeException("Stub!");
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
/*     */   public int unregisterDeviceStateCallback(String bundleName, DeviceStateCallback callback) throws SecurityException {
/* 128 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static interface DeviceManagerCallback {
/*     */     void onGet(DeviceManager param1DeviceManager);
/*     */     
/*     */     void onDied();
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/distributedhardware/devicemanager/DeviceManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */