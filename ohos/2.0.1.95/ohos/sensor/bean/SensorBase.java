/*     */ package ohos.sensor.bean;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SensorBase
/*     */ {
/*     */   public static final int COMMAND_PARAMETER_FLUSH = 0;
/*     */   public static final int COMMAND_PARAMETER_SET_MODE = 1;
/*     */   public static final int COMMAND_TYPE_FLUSH = 0;
/*     */   public static final int COMMAND_TYPE_SET_MODE = 1;
/*     */   public static final int SENSOR_CATEGORY_MASK = -16777216;
/*     */   public static final int SENSOR_CATEGORY_MASK_SHIFT = 24;
/*     */   public static final int SENSOR_INDEX_MASK = 65280;
/*     */   public static final int SENSOR_INDEX_MASK_SHIFT = 8;
/*     */   public static final int SENSOR_TYPE_MASK = 16711680;
/*     */   public static final int SENSOR_TYPE_MASK_SHIFT = 16;
/*     */   
/*     */   public SensorBase(int sensorId, String name, String vendor, int version, float upperRange, float resolution, int flags, int cacheMaxCount, long minInterval, long maxInterval) {
/*  40 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSensorId() {
/*  49 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getName() {
/*  58 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getVendor() {
/*  67 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getVersion() {
/*  76 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getUpperRange() {
/*  85 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getResolution() {
/*  94 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getFlags() {
/* 103 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getCacheMaxCount() {
/* 112 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getMinInterval() {
/* 121 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getMaxInterval() {
/* 130 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/sensor/bean/SensorBase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */