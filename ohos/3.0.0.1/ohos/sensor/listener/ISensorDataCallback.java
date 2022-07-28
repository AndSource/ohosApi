package ohos.sensor.listener;

public interface ISensorDataCallback<D extends ohos.sensor.data.SensorData<S>, S extends ohos.sensor.bean.SensorBase> {
  void onSensorDataModified(D paramD);
  
  void onAccuracyDataModified(S paramS, int paramInt);
  
  void onCommandCompleted(S paramS);
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/sensor/listener/ISensorDataCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */