/*     */ package ohos.bluetooth;
/*     */ 
/*     */ import java.util.List;
/*     */ import ohos.app.Context;
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
/*     */ public final class HandsFreeAudioGateway
/*     */   implements ProfileBase
/*     */ {
/*     */   public static final String EVENT_AUDIO_STATE_UPDATE = "usual.event.bluetooth.handsfree.ag.AUDIO_STATE_UPDATE";
/*     */   public static final int SCO_STATE_CONNECTED = 2;
/*     */   public static final int SCO_STATE_CONNECTING = 1;
/*     */   public static final int SCO_STATE_DISCONNECTED = 0;
/*     */   
/*     */   HandsFreeAudioGateway(Context context) {
/*  35 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static synchronized HandsFreeAudioGateway getProfile(Context context) {
/*  44 */     throw new RuntimeException("Stub!");
/*     */   } public List<BluetoothRemoteDevice> getDevicesByStates(int[] states) {
/*  46 */     throw new RuntimeException("Stub!");
/*     */   } public int getDeviceState(BluetoothRemoteDevice device) {
/*  48 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getScoState(BluetoothRemoteDevice device) {
/*  58 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean openVoiceRecognition(BluetoothRemoteDevice device) {
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
/*     */   public boolean closeVoiceRecognition(BluetoothRemoteDevice device) {
/*  84 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean connectSco() {
/*  94 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean disconnectSco() {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<BluetoothRemoteDevice> getConnectedDevices() {
/* 113 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/bluetooth/HandsFreeAudioGateway.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */