/*    */ package ohos.bluetooth;
/*    */ 
/*    */ import java.util.List;
/*    */ import ohos.app.Context;
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
/*    */ public final class A2dpSink
/*    */   implements ProfileBase
/*    */ {
/*    */   public static final int STATE_NOT_PLAYING = 0;
/*    */   public static final int STATE_PLAYING = 1;
/*    */   
/*    */   A2dpSink(Context context) {
/* 39 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static synchronized A2dpSink getProfile(Context context) {
/* 48 */     throw new RuntimeException("Stub!");
/*    */   } public List<BluetoothRemoteDevice> getDevicesByStates(int[] status) {
/* 50 */     throw new RuntimeException("Stub!");
/*    */   } public int getDeviceState(BluetoothRemoteDevice device) {
/* 52 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getPlayingState(BluetoothRemoteDevice device) {
/* 62 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean connect(BluetoothRemoteDevice device) {
/* 71 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean disconnect(BluetoothRemoteDevice device) {
/* 80 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/bluetooth/A2dpSink.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */