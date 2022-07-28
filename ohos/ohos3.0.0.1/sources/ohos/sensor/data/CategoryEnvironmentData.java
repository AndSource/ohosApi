package ohos.sensor.data;

import ohos.sensor.bean.CategoryEnvironment;

/* loaded from: ohos3.0.0.1.jar:ohos/sensor/data/CategoryEnvironmentData.class */
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

    /* loaded from: ohos3.0.0.1.jar:ohos/sensor/data/CategoryEnvironmentData$GeomagneticField.class */
    public static class GeomagneticField {
        public GeomagneticField(float latitude, float longitude, float altitude, long timeMillis) {
            throw new RuntimeException("Stub!");
        }

        public float obtainX() {
            throw new RuntimeException("Stub!");
        }

        public float obtainY() {
            throw new RuntimeException("Stub!");
        }

        public float obtainZ() {
            throw new RuntimeException("Stub!");
        }

        public float obtainGeomagneticDip() {
            throw new RuntimeException("Stub!");
        }

        public float obtainDeflectionAngle() {
            throw new RuntimeException("Stub!");
        }

        public float obtainLevelIntensity() {
            throw new RuntimeException("Stub!");
        }

        public float obtainTotalIntensity() {
            throw new RuntimeException("Stub!");
        }
    }
}
