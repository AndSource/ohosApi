/*    */ package ohos.sensor.bean;
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
/*    */ 
/*    */ 
/*    */ public final class CategoryEnvironment
/*    */   extends SensorBase
/*    */ {
/*    */   public static final int SENSOR_TYPE_AMBIENT_TEMPERATURE = 0;
/*    */   public static final int SENSOR_TYPE_BAROMETER = 4;
/*    */   public static final int SENSOR_TYPE_HUMIDITY = 3;
/*    */   public static final int SENSOR_TYPE_MAGNETIC_FIELD = 1;
/*    */   public static final int SENSOR_TYPE_MAGNETIC_FIELD_UNCALIBRATED = 2;
/*    */   public static final int SENSOR_TYPE_SAR = 5;
/*    */   public static final String STRING_SENSOR_TYPE_AMBIENT_TEMPERATURE = "ohos.sensor.type.ambient_temperature";
/*    */   public static final String STRING_SENSOR_TYPE_BAROMETER = "ohos.sensor.type.barometer";
/*    */   public static final String STRING_SENSOR_TYPE_HUMIDITY = "ohos.sensor.type.humidity";
/*    */   public static final String STRING_SENSOR_TYPE_MAGNETIC_FIELD = "ohos.sensor.type.magnetic_field";
/*    */   public static final String STRING_SENSOR_TYPE_MAGNETIC_UNCALIBRATED = "ohos.sensor.type.magnetic_uncalibrated";
/*    */   public static final String STRING_SENSOR_TYPE_SAR = "ohos.sensor.type.sar";
/*    */   
/*    */   public CategoryEnvironment(int sensorId, String name, String vendor, int version, float upperRange, float resolution, int flags, int cacheMaxCount, long minInterval, long maxInterval) {
/* 40 */     super(0, null, null, 0, 0.0F, 0.0F, 0, 0, 0L, 0L); throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/sensor/bean/CategoryEnvironment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */