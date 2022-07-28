/*     */ package ohos.bluetooth;
/*     */ 
/*     */ import java.util.List;
/*     */ import java.util.Optional;
/*     */ import ohos.app.Context;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class BluetoothHost
/*     */ {
/*     */   public static final int BLE_CAP_2M_PHY = 1;
/*     */   public static final int BLE_CAP_CODED_PHY = 2;
/*     */   public static final int BLE_CAP_EXTENDED_ADV = 4;
/*     */   public static final int BLE_CAP_MULTIPLE_ADV = 16;
/*     */   public static final int BLE_CAP_OFFLOADED_FILTER = 32;
/*     */   public static final int BLE_CAP_OFFLOADED_SCAN_BATCH = 64;
/*     */   public static final int BLE_CAP_PERIODIC_ADV = 8;
/*     */   public static final String EVENT_HOST_DISCOVERY_FINISHED = "usual.event.bluetooth.host.DISCOVERY_FINISHED";
/*     */   public static final String EVENT_HOST_DISCOVERY_STARTED = "usual.event.bluetooth.host.DISCOVERY_STARTED";
/*     */   public static final String EVENT_HOST_NAME_UPDATE = "usual.event.bluetooth.host.NAME_UPDATE";
/*     */   public static final String EVENT_HOST_SCAN_MODE_UPDATE = "usual.event.bluetooth.host.SCAN_MODE_UPDATE";
/*     */   public static final String EVENT_HOST_STATE_UPDATE = "usual.event.bluetooth.host.STATE_UPDATE";
/*     */   public static final String HOST_PARAM_CUR_STATE = "usual.event.bluetoothhost.PARAM_CUR_STATE";
/*     */   public static final String HOST_PARAM_DISCOVERABLE_TERM = "usual.event.bluetoothhost.PARAM_DISCOVERABLE_TERM";
/*     */   public static final String HOST_PARAM_HOST_NAME = "usual.event.bluetoothhost.PARAM_HOST_NAME";
/*     */   public static final String HOST_PARAM_PRE_STATE = "usual.event.bluetoothhost.PARAM_PRE_STATE";
/*     */   public static final String HOST_PARAM_SCAN_METHOD = "usual.event.bluetoothhost.PARAM_SCAN_METHOD";
/*     */   public static final int SCAN_MODE_CONNECTABLE = 1;
/*     */   public static final int SCAN_MODE_CONNECTABLE_DISCOVERABLE = 3;
/*     */   public static final int SCAN_MODE_NONE = 0;
/*     */   public static final int STATE_BLE_ON = 5;
/*     */   public static final int STATE_BLE_TURNING_OFF = 6;
/*     */   public static final int STATE_BLE_TURNING_ON = 4;
/*     */   public static final int STATE_OFF = 0;
/*     */   public static final int STATE_ON = 2;
/*     */   public static final int STATE_TURNING_OFF = 3;
/*     */   public static final int STATE_TURNING_ON = 1;
/*     */   
/*     */   BluetoothHost(Context context) {
/*  40 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static synchronized BluetoothHost getDefaultHost(Context context) {
/*  49 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean enableBt() {
/*  62 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean disableBt() {
/*  75 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getBtState() {
/*  85 */     throw new RuntimeException("Stub!");
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
/*     */   public BluetoothRemoteDevice getRemoteDev(String addr) {
/*  97 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Optional<String> getLocalName() {
/* 107 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean setLocalName(String name) {
/* 119 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean startBtDiscovery() {
/* 133 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean cancelBtDiscovery() {
/* 141 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isBtDiscovering() {
/* 149 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getBtScanMode() {
/* 158 */     throw new RuntimeException("Stub!");
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
/*     */   public int getProfileConnState(int profile) {
/* 171 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<BluetoothRemoteDevice> getPairedDevices() {
/* 182 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getBleCapabilities() {
/* 192 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getBleMaxAdvertisingDataLength() {
/* 200 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setBtScanMode(int mode, int duration) {
/* 211 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setDevicePairingConfirmation(BluetoothRemoteDevice device, boolean accept) {
/* 221 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isValidBluetoothAddr(String addr) {
/* 232 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/bluetooth/BluetoothHost.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */