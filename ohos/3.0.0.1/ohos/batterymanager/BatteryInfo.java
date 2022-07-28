/*     */ package ohos.batterymanager;
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
/*     */ public class BatteryInfo
/*     */ {
/*     */   public static final String OHOS_BATTERY_CAPACITY = "batteryCapacity";
/*     */   public static final String OHOS_BATTERY_LOW = "batteryLow";
/*     */   public static final String OHOS_BATTERY_PRESENT = "batteryPresent";
/*     */   public static final String OHOS_BATTERY_TECHNOLOGY = "batteryTechnology";
/*     */   public static final String OHOS_BATTERY_TEMPERATURE = "batteryTemperature";
/*     */   public static final String OHOS_BATTERY_VOLTAGE = "batteryVoltage";
/*     */   public static final String OHOS_CHARGE_COUNTER = "chargeCounter";
/*     */   public static final String OHOS_CHARGE_STATE = "chargeState";
/*     */   public static final String OHOS_CHARGE_TYPE = "chargeType";
/*     */   public static final String OHOS_CHARGING_CURRENT_MAX = "maxCurrent";
/*     */   public static final String OHOS_CHARGING_VOLTAGE_MAX = "maxVoltage";
/*     */   public static final String OHOS_TEMPERATURE_STATE = "temperatureState";
/*     */   
/*     */   public BatteryInfo() {
/*  34 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getCapacity() {
/*  43 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BatteryChargeState getChargingStatus() {
/*  54 */     throw new RuntimeException("Stub!");
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
/*     */   public BatteryHealthState getHealthStatus() {
/*  66 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BatteryPluggedType getPluggedType() {
/*  77 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getVoltage() {
/*  86 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getPresent() {
/*  96 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTechnology() {
/* 105 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getBatteryTemperature() {
/* 114 */     throw new RuntimeException("Stub!");
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
/*     */   public BatteryLevel getBatteryLevel() {
/* 126 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public enum BatteryChargeState
/*     */   {
/* 282 */     NONE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 287 */     ENABLE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 292 */     DISABLE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 297 */     FULL,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 302 */     RESERVED;
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
/*     */   public enum BatteryHealthState
/*     */   {
/* 317 */     UNKNOWN,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 322 */     GOOD,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 327 */     OVERHEAT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 332 */     OVERVOLTAGE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 337 */     COLD,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 342 */     DEAD,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 347 */     RESERVED;
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
/*     */   public enum BatteryLevel
/*     */   {
/* 362 */     NONE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 367 */     HIGH,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 372 */     NORMAL,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 377 */     LOW,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 382 */     EMERGENCY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 387 */     RESERVED;
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
/*     */   public enum BatteryPluggedType
/*     */   {
/* 402 */     NONE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 407 */     AC,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 412 */     USB,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 417 */     WIRELESS,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 422 */     RESERVED;
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/batterymanager/BatteryInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */