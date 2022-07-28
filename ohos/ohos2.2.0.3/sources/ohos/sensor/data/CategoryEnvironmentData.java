package ohos.sensor.data;

import ohos.sensor.bean.CategoryEnvironment;

/* loaded from: ohos2.2.0.3.jar:ohos/sensor/data/CategoryEnvironmentData.class */
public class CategoryEnvironmentData extends SensorData<CategoryEnvironment> {
    public static final float SEA_PRESSURE = 1013.25f;

    public CategoryEnvironmentData(CategoryEnvironment sensor, int accuracy, long timestamp, int sensorDataDim, float[] values) {
        super(null, 0, 0L, 0, null);
        throw new RuntimeException("Stub!");
    }

    public static float getDeviceAltitude(float seaPressure, float currentPressure) {
        throw new RuntimeException("Stub!");
    }

    public static float getDeviceAltitude(float currentPressure) {
        throw new RuntimeException("Stub!");
    }
}
