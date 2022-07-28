/*     */ package ohos.bluetooth;
/*     */ 
/*     */ import java.util.Optional;
/*     */ import ohos.utils.Parcel;
/*     */ import ohos.utils.SequenceUuid;
/*     */ import ohos.utils.Sequenceable;
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
/*  29 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDeviceAddr() {
/*  37 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Optional<String> getDeviceName() {
/*  45 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getDeviceType() {
/*  54 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Optional<BluetoothDeviceClass> getDeviceClass() {
/*  63 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getPairState() {
/*  72 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean startPair() {
/*  82 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setDevicePin(byte[] pin) {
/*  92 */     throw new RuntimeException("Stub!");
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
/* 103 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/* 105 */     throw new RuntimeException("Stub!");
/*     */   } public boolean marshalling(Parcel out) {
/* 107 */     throw new RuntimeException("Stub!");
/*     */   } public boolean unmarshalling(Parcel in) {
/* 109 */     throw new RuntimeException("Stub!");
/*     */   } public int hashCode() {
/* 111 */     throw new RuntimeException("Stub!");
/*     */   } public boolean equals(Object object) {
/* 113 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/bluetooth/BluetoothRemoteDevice.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */