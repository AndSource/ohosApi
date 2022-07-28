/*     */ package ohos.sensor.agent;
/*     */ 
/*     */ import java.util.List;
/*     */ import ohos.sensor.bean.SensorBase;
/*     */ import ohos.sensor.data.SensorData;
/*     */ import ohos.sensor.listener.ISensorDataCallback;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class SensorAgent<S extends SensorBase, D extends SensorData<S>, L extends ISensorDataCallback<D, S>>
/*     */ {
/*     */   public static final int SENSOR_CATEGORY_BODY = 5;
/*     */   public static final int SENSOR_CATEGORY_DEVICEMOTION = 0;
/*     */   public static final int SENSOR_CATEGORY_ENVIRONMENT = 1;
/*     */   public static final int SENSOR_CATEGORY_LIGHT = 3;
/*     */   public static final int SENSOR_CATEGORY_ORIENTATION = 2;
/*     */   public static final int SENSOR_CATEGORY_OTHER = 4;
/*     */   public static final int SENSOR_SAMPLING_RATE_FASTEST = 0;
/*     */   public static final int SENSOR_SAMPLING_RATE_GAME = 1;
/*     */   public static final int SENSOR_SAMPLING_RATE_NORMAL = 3;
/*     */   public static final int SENSOR_SAMPLING_RATE_UI = 2;
/*     */   public static final String STRING_SENSOR_CATEGORY_BODY = "ohos.sensor.category.body";
/*     */   public static final String STRING_SENSOR_CATEGORY_DEVICEMOTION = "ohos.sensor.category.devicemotion";
/*     */   public static final String STRING_SENSOR_CATEGORY_ENVIRONMENT = "ohos.sensor.category.environment";
/*     */   public static final String STRING_SENSOR_CATEGORY_LIGHT = "ohos.sensor.category.light";
/*     */   public static final String STRING_SENSOR_CATEGORY_ORIENTATION = "ohos.sensor.category.orientation";
/*     */   public static final String STRING_SENSOR_CATEGORY_OTHER = "ohos.sensor.category.other";
/*     */   
/*     */   public SensorAgent() {
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean subscribeParamsCheck(L callback, S sensor, long interval, long maxDelay) {
/*  58 */     throw new RuntimeException("Stub!");
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
/*     */   public abstract List<S> getAllSensors();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract List<S> getAllSensors(int paramInt);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract S getSingleSensor(int paramInt);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract boolean setSensorDataCallback(L paramL, S paramS, long paramLong1, long paramLong2);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract boolean setSensorDataCallback(L paramL, S paramS, int paramInt);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract boolean setSensorDataCallback(L paramL, S paramS, int paramInt, long paramLong);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract boolean releaseSensorDataCallback(L paramL, S paramS);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract boolean releaseSensorDataCallback(L paramL);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getSensorMinSampleInterval(int sensorId) {
/* 201 */     throw new RuntimeException("Stub!");
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
/*     */   public int runCommand(int sensorId, int commandType, int commandParameter) {
/* 220 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/sensor/agent/SensorAgent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */