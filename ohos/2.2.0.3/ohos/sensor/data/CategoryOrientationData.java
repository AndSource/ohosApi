/*    */ package ohos.sensor.data;
/*    */ 
/*    */ import ohos.sensor.bean.CategoryOrientation;
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
/*    */ 
/*    */ 
/*    */ public class CategoryOrientationData
/*    */   extends SensorData<CategoryOrientation>
/*    */ {
/*    */   public CategoryOrientationData(CategoryOrientation sensor, int accuracy, long timestamp, int sensorDataDim, float[] values) {
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
/*    */   public static float[] getQuaternionValues(float[] rotationVector) {
/* 50 */     throw new RuntimeException("Stub!");
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
/*    */   public static void getDeviceRotationMatrix(float[] rotationMatrix, float[] rotationVector) {
/* 62 */     throw new RuntimeException("Stub!");
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static float[] getDeviceOrientation(float[] rotationMatrix, float[] rotationAngle) {
/* 81 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/sensor/data/CategoryOrientationData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */