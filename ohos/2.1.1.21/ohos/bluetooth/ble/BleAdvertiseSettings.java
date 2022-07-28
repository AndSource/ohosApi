/*     */ package ohos.bluetooth.ble;
/*     */ 
/*     */ import ohos.utils.Parcel;
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
/*     */ public final class BleAdvertiseSettings
/*     */   implements Sequenceable
/*     */ {
/*     */   public static final int INTERVAL_SLOT_DEFAULT = 1600;
/*     */   public static final int INTERVAL_SLOT_MAX = 16777215;
/*     */   public static final int INTERVAL_SLOT_MIN = 32;
/*     */   public static final int TX_POWER_DEFAULT = -7;
/*     */   public static final int TX_POWER_MAX = 1;
/*     */   public static final int TX_POWER_MIN = -127;
/*     */   
/*     */   BleAdvertiseSettings() {
/*  36 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isConnectable() {
/*  44 */     throw new RuntimeException("Stub!");
/*     */   } public boolean marshalling(Parcel out) {
/*  46 */     throw new RuntimeException("Stub!");
/*     */   } public boolean unmarshalling(Parcel in) {
/*  48 */     throw new RuntimeException("Stub!");
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
/*     */   public static final class Builder
/*     */   {
/*     */     public Builder() {
/*  82 */       throw new RuntimeException("Stub!");
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
/*     */     
/*     */     public Builder setInterval(int interval) {
/*  95 */       throw new RuntimeException("Stub!");
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
/*     */     public Builder setTxPower(int txPower) {
/* 107 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder setConnectable(boolean connectable) {
/* 118 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public BleAdvertiseSettings build() {
/* 127 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/bluetooth/ble/BleAdvertiseSettings.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */