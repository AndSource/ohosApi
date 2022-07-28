/*     */ package ohos.batterymanager;
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
/*  24 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getCapacity() {
/*  34 */     throw new RuntimeException("Stub!");
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
/*     */   public BatteryChargeState getChargingStatus() {
/*  46 */     throw new RuntimeException("Stub!");
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
/*     */   public BatteryHealthState getHealthStatus() {
/*  59 */     throw new RuntimeException("Stub!");
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
/*     */   public BatteryPluggedType getPluggedType() {
/*  71 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getVoltage() {
/*  81 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getPresent() {
/*  91 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTechnology() {
/* 101 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getBatteryTemperature() {
/* 111 */     throw new RuntimeException("Stub!");
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
/*     */   public BatteryLevel getBatteryLevel() {
/* 124 */     throw new RuntimeException("Stub!");
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
/*     */   public enum BatteryChargeState
/*     */   {
/* 269 */     NONE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 274 */     ENABLE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 279 */     DISABLE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 284 */     FULL,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 289 */     RESERVED;
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
/* 304 */     UNKNOWN,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 309 */     GOOD,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 314 */     OVERHEAT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 319 */     OVERVOLTAGE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 324 */     COLD,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 329 */     DEAD,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 334 */     RESERVED;
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
/* 349 */     NONE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 354 */     HIGH,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 359 */     NORMAL,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 364 */     LOW,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 369 */     EMERGENCY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 374 */     RESERVED;
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
/* 389 */     NONE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 394 */     AC,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 399 */     USB,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 404 */     WIRELESS,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 409 */     RESERVED;
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/batterymanager/BatteryInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */