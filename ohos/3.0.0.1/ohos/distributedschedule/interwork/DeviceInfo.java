/*     */ package ohos.distributedschedule.interwork;
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
/*     */ public class DeviceInfo
/*     */   implements Sequenceable
/*     */ {
/*     */   public static final int FLAG_GET_ALL_DEVICE = 0;
/*     */   public static final int FLAG_GET_OFFLINE_DEVICE = 2;
/*     */   public static final int FLAG_GET_ONLINE_DEVICE = 1;
/*     */   
/*     */   public DeviceInfo() {
/*  25 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDeviceInfo(String deviceId, String deviceName) {
/*  35 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDeviceType(DeviceType deviceType) {
/*  44 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDeviceState(DeviceState deviceState) {
/*  54 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDeviceId() {
/*  64 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDeviceName() {
/*  74 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DeviceType getDeviceType() {
/*  83 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DeviceState getDeviceState() {
/*  92 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isDeviceOnline() {
/* 101 */     throw new RuntimeException("Stub!");
/*     */   } public boolean marshalling(Parcel out) {
/* 103 */     throw new RuntimeException("Stub!");
/*     */   } public boolean unmarshalling(Parcel in) {
/* 105 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public enum DeviceState
/*     */   {
/* 145 */     UNKNOWN,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 150 */     ONLINE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 155 */     OFFLINE;
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
/*     */   public enum DeviceType
/*     */   {
/* 170 */     UNKNOWN_TYPE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 175 */     LAPTOP,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 180 */     SMART_PHONE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 185 */     SMART_PAD,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 190 */     SMART_WATCH,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 195 */     SMART_CAR,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 200 */     SMART_TV;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getVal() {
/* 209 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/distributedschedule/interwork/DeviceInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */