/*     */ package ohos.bluetooth;
/*     */ 
/*     */ import java.util.Optional;
/*     */ import ohos.utils.Parcel;
/*     */ import ohos.utils.SequenceUuid;
/*     */ import ohos.utils.Sequenceable;
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
/*     */ public final class BluetoothRemoteDevice
/*     */   implements Sequenceable
/*     */ {
/*     */   public static final String EVENT_DEVICE_DISCOVERED = "usual.event.bluetooth.remotedevice.DISCOVERED";
/*     */   public static final String EVENT_DEVICE_PAIRING_REQ = "usual.event.bluetooth.remotedevice.PAIRING_REQ";
/*     */   public static final String EVENT_DEVICE_PAIR_STATE = "usual.event.bluetooth.remotedevice.PAIR_STATE";
/*     */   public static final int PAIR_STATE_NONE = 0;
/*     */   public static final int PAIR_STATE_PAIRED = 2;
/*     */   public static final int PAIR_STATE_PAIRING = 1;
/*     */   public static final String REMOTE_DEVICE_PARAM_DEVICE = "usual.event.remotedevice.PARAM_DEVICE";
/*     */   public static final String REMOTE_DEVICE_PARAM_PAIRING_FORMAT = "usual.event.remotedevice.PARAM_PAIRING_FORMAT";
/*     */   public static final String REMOTE_DEVICE_PARAM_PAIRING_KEY = "usual.event.remotedevice.PARAM_PAIRING_KEY";
/*     */   public static final String REMOTE_DEVICE_PARAM_PAIR_STATE = "usual.event.remotedevice.PARAM_PAIR_STATE";
/*     */   public static final String REMOTE_DEVICE_PARAM_PREV_PAIR_STATE = "usual.event.remotedevice.PARAM_PREV_PAIR_STATE";
/*     */   public static final int TYPE_CLASSIC = 1;
/*     */   public static final int TYPE_DUAL = 3;
/*     */   public static final int TYPE_LE = 2;
/*     */   public static final int TYPE_UNKNOWN = 0;
/*     */   
/*     */   BluetoothRemoteDevice() {
/*  40 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDeviceAddr() {
/*  48 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Optional<String> getDeviceName() {
/*  56 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getDeviceType() {
/*  65 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Optional<BluetoothDeviceClass> getDeviceClass() {
/*  74 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getPairState() {
/*  83 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean startPair() {
/*  93 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setDevicePin(byte[] pin) {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SequenceUuid[] getDeviceUuids() {
/* 115 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/* 117 */     throw new RuntimeException("Stub!");
/*     */   } public boolean marshalling(Parcel out) {
/* 119 */     throw new RuntimeException("Stub!");
/*     */   } public boolean unmarshalling(Parcel in) {
/* 121 */     throw new RuntimeException("Stub!");
/*     */   } public int hashCode() {
/* 123 */     throw new RuntimeException("Stub!");
/*     */   } public boolean equals(Object object) {
/* 125 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/bluetooth/BluetoothRemoteDevice.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */