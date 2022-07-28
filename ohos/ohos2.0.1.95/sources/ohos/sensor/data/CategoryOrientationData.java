package ohos.sensor.data;

import ohos.sensor.bean.CategoryOrientation;

/* loaded from: ohos2.0.1.95.jar:ohos/sensor/data/CategoryOrientationData.class */
public class CategoryOrientationData extends SensorData<CategoryOrientation> {
    public CategoryOrientationData(CategoryOrientation sensor, int accuracy, long timestamp, int sensorDataDim, float[] values) {
        super(null, 0, 0L, 0, null);
        throw new RuntimeException("Stub!");
    }

    public static float[] getQuaternionValues(float[] rotationVector) {
        throw new RuntimeException("Stub!");
    }
}
