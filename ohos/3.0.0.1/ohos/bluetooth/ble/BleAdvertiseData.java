/*     */ package ohos.bluetooth.ble;
/*     */ 
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import ohos.utils.Parcel;
/*     */ import ohos.utils.PlainArray;
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
/*     */ public final class BleAdvertiseData
/*     */   implements Sequenceable
/*     */ {
/*     */   BleAdvertiseData() {
/*  38 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<SequenceUuid> getServiceUuids() {
/*  46 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<SequenceUuid, byte[]> getServiceData() {
/*  54 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PlainArray<byte[]> getManufacturerData() {
/*  62 */     throw new RuntimeException("Stub!");
/*     */   } public boolean marshalling(Parcel out) {
/*  64 */     throw new RuntimeException("Stub!");
/*     */   } public boolean unmarshalling(Parcel in) {
/*  66 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class Builder
/*     */   {
/*     */     public Builder() {
/*  76 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder addServiceUuid(SequenceUuid serviceUuid) {
/*  87 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder addServiceData(SequenceUuid uuid, byte[] serviceData) {
/*  99 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder addManufacturerData(int manufacturerId, byte[] data) {
/* 111 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public BleAdvertiseData build() {
/* 119 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/bluetooth/ble/BleAdvertiseData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */