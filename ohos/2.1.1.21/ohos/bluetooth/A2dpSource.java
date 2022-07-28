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
/*    */ 
/*    */ public final class A2dpSource
/*    */   implements ProfileBase
/*    */ {
/*    */   public static final int STATE_NOT_PLAYING = 0;
/*    */   public static final int STATE_PLAYING = 1;
/*    */   
/*    */   A2dpSource(Context context) {
/* 40 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static synchronized A2dpSource getProfile(Context context) {
/* 49 */     throw new RuntimeException("Stub!");
/*    */   } public List<BluetoothRemoteDevice> getDevicesByStates(int[] states) {
/* 51 */     throw new RuntimeException("Stub!");
/*    */   } public int getDeviceState(BluetoothRemoteDevice device) {
/* 53 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getPlayingState(BluetoothRemoteDevice device) {
/* 63 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/bluetooth/A2dpSource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */