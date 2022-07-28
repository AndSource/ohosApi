/*    */ package ohos.bluetooth.ble;
/*    */ 
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.UUID;
/*    */ import ohos.utils.Parcel;
/*    */ import ohos.utils.Sequenceable;
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
/*    */ public final class BleScanResult
/*    */   implements Sequenceable
/*    */ {
/*    */   public BleScanResult(BlePeripheralDevice device, Map<Integer, byte[]> manufacturerDatas, Map<UUID, byte[]> serviceDatas, List<UUID> uuids, int advertiseFlag, long time) {
/* 29 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public BlePeripheralDevice getPeripheralDevice() {
/* 37 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getRssi() {
/* 45 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isConnectable() {
/* 53 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Map<Integer, byte[]> getManufacturerData() {
/* 61 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Map<UUID, byte[]> getServiceData() {
/* 69 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public List<UUID> getServiceUuids() {
/* 77 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getAdvertiseFlag() {
/* 85 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public long getTime() {
/* 94 */     throw new RuntimeException("Stub!");
/*    */   } public boolean marshalling(Parcel out) {
/* 96 */     throw new RuntimeException("Stub!");
/*    */   } public boolean unmarshalling(Parcel in) {
/* 98 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/bluetooth/ble/BleScanResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */