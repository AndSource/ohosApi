/*    */ package ohos.sensor.data;
/*    */ 
/*    */ import ohos.sensor.bean.SensorBase;
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
/*    */ public class SensorData<S extends SensorBase>
/*    */ {
/*    */   protected static final int DEFAULT_SENSOR_DATA_DIMS = 16;
/*    */   public int accuracy;
/*    */   public S sensor;
/*    */   public int sensorDataDim;
/*    */   public long timestamp;
/*    */   public float[] values;
/*    */   
/*    */   public SensorData(S sensor, int accuracy, long timestamp, int sensorDataDim, float[] values) {
/* 35 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public S getSensor() {
/* 44 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getAccuracy() {
/* 53 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public long getTimestamp() {
/* 62 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getSensorDataDim() {
/* 71 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public float[] getValues() {
/* 80 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/sensor/data/SensorData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */