package ohos.sensor.data;

import ohos.sensor.bean.SensorBase;

/* loaded from: ohos2.0.1.95.jar:ohos/sensor/data/SensorData.class */
public class SensorData<S extends SensorBase> {
    protected static final int DEFAULT_SENSOR_DATA_DIMS = 16;
    public int accuracy;
    public S sensor;
    public int sensorDataDim;
    public long timestamp;
    public float[] values;

    public SensorData(S sensor, int accuracy, long timestamp, int sensorDataDim, float[] values) {
        throw new RuntimeException("Stub!");
    }

    public S getSensor() {
        throw new RuntimeException("Stub!");
    }

    public int getAccuracy() {
        throw new RuntimeException("Stub!");
    }

    public long getTimestamp() {
        throw new RuntimeException("Stub!");
    }

    public int getSensorDataDim() {
        throw new RuntimeException("Stub!");
    }

    public float[] getValues() {
        throw new RuntimeException("Stub!");
    }
}
