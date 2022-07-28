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
/*     */   public String getTechnology() {
/*  91 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getBatteryTemperature() {
/* 101 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 259 */     NONE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 264 */     ENABLE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 269 */     DISABLE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 274 */     FULL,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 279 */     RESERVED;
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
/* 294 */     UNKNOWN,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 299 */     GOOD,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 304 */     OVERHEAT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 309 */     OVERVOLTAGE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 314 */     COLD,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 319 */     DEAD,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 324 */     RESERVED;
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
/* 339 */     NONE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 344 */     HIGH,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 349 */     NORMAL,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 354 */     LOW,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 359 */     EMERGENCY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 364 */     RESERVED;
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
/* 379 */     NONE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 384 */     AC,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 389 */     USB,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 394 */     WIRELESS,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 399 */     RESERVED;
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/batterymanager/BatteryInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */