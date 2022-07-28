package ohos.sensor.bean;

/* loaded from: ohos2.1.1.21.jar:ohos/sensor/bean/CategoryMotion.class */
public final class CategoryMotion extends SensorBase {
    public static final int SENSOR_TYPE_ACCELEROMETER = 0;
    public static final int SENSOR_TYPE_ACCELEROMETER_UNCALIBRATED = 1;
    public static final int SENSOR_TYPE_DROP_DETECTION = 7;
    public static final int SENSOR_TYPE_GRAVITY = 3;
    public static final int SENSOR_TYPE_GYROSCOPE = 4;
    public static final int SENSOR_TYPE_LINEAR_ACCELERATION = 2;
    public static final int SENSOR_TYPE_PEDOMETER = 9;
    public static final int SENSOR_TYPE_PEDOMETER_DETECTION = 8;
    public static final int SENSOR_TYPE_SIGNIFICANT_MOTION = 6;
    public static final String STRING_SENSOR_TYPE_ACCELEROMETER = "ohos.sensor.type.accelerometer";
    public static final String STRING_SENSOR_TYPE_ACCELEROMETER_UNCALIBRATED = "ohos.sensor.type.accelerometer_uncalibrated";
    public static final String STRING_SENSOR_TYPE_DROP_DETECTION = "ohos.sensor.type.drop_detection";
    public static final String STRING_SENSOR_TYPE_GRAVITY = "ohos.sensor.type.gravity";
    public static final String STRING_SENSOR_TYPE_GYROSCOPE = "ohos.sensor.type.gyroscope";
    public static final String STRING_SENSOR_TYPE_GYROSCOPE_UNCALIBRATED = "ohos.sensor.type.gyroscope_uncalibrated";
    public static final String STRING_SENSOR_TYPE_LINEAR_ACCELERATION = "ohos.sensor.type.linear_acceleration";
    public static final String STRING_SENSOR_TYPE_SIGNIFICANT_MOTION = "ohos.sensor.type.significant_motion";
    public static final int TYPE_SENSOR_GYROSCOPE_UNCALIBRATED = 5;

    public CategoryMotion(int sensorId, String name, String vendor, int version, float upperRange, float resolution, int flags, int cacheMaxCount, long minInterval, long maxInterval) {
        super(0, null, null, 0, 0.0f, 0.0f, 0, 0, 0L, 0L);
        throw new RuntimeException("Stub!");
    }
}
