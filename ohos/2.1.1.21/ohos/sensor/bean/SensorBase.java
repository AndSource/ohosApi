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
/*  42 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSensorId() {
/*  51 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getName() {
/*  60 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getVendor() {
/*  69 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getVersion() {
/*  78 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getUpperRange() {
/*  87 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getResolution() {
/*  96 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getFlags() {
/* 105 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getCacheMaxCount() {
/* 114 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getMinInterval() {
/* 123 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getMaxInterval() {
/* 132 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/sensor/bean/SensorBase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */