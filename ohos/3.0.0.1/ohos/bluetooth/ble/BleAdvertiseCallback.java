/*    */ package ohos.bluetooth.ble;
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
/*    */ public abstract class BleAdvertiseCallback
/*    */ {
/*    */   public static final int RESULT_FAIL_ALREADY_STARTED = 3;
/*    */   public static final int RESULT_FAIL_DATA_ILLEGAL = 1;
/*    */   public static final int RESULT_FAIL_ERROR = 4;
/*    */   public static final int RESULT_FAIL_FEATURE_UNSUPPORTED = 5;
/*    */   public static final int RESULT_FAIL_TOO_MANY_ADVERTISERS = 2;
/*    */   public static final int RESULT_SUCC = 0;
/*    */   
/*    */   public BleAdvertiseCallback() {
/* 31 */     throw new RuntimeException("Stub!");
/*    */   }
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
/*    */   public void startResultEvent(int result) {
/* 44 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/bluetooth/ble/BleAdvertiseCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */