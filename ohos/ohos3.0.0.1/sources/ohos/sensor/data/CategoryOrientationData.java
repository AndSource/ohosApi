package ohos.sensor.data;

import ohos.sensor.bean.CategoryOrientation;

/* loaded from: ohos3.0.0.1.jar:ohos/sensor/data/CategoryOrientationData.class */
public class CategoryOrientationData extends SensorData<CategoryOrientation> {
    public CategoryOrientationData(CategoryOrientation sensor, int accuracy, long timestamp, int sensorDataDim, float[] values) {
        super(null, 0, 0L, 0, null);
        throw new RuntimeException("Stub!");
    }

    public static float[] getQuaternionValues(float[] rotationVector) {
        throw new RuntimeException("Stub!");
    }

    public static void getDeviceRotationMatrix(float[] rotationMatrix, float[] rotationVector) {
        throw new RuntimeException("Stub!");
    }

    public static float[] getDeviceOrientation(float[] rotationMatrix, float[] rotationAngle) {
        throw new RuntimeException("Stub!");
    }
}
