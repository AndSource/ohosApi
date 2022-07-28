/*    */ package ohos.sensor.data;
/*    */ 
/*    */ import ohos.sensor.bean.CategoryEnvironment;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CategoryEnvironmentData
/*    */   extends SensorData<CategoryEnvironment>
/*    */ {
/*    */   public static final float SEA_PRESSURE = 1013.25F;
/*    */   
/*    */   public CategoryEnvironmentData(CategoryEnvironment sensor, int accuracy, long timestamp, int sensorDataDim, float[] values) {
/* 38 */     super(null, 0, 0L, 0, null); throw new RuntimeException("Stub!");
/*    */   }
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
/*    */   public static float getDeviceAltitude(float seaPressure, float currentPressure) {
/* 51 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static float getDeviceAltitude(float currentPressure) {
/* 61 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/sensor/data/CategoryEnvironmentData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */