package ohos.sensor.bean;

/* loaded from: ohos3.0.0.1.jar:ohos/sensor/bean/CategoryEnvironment.class */
public final class CategoryEnvironment extends SensorBase {
    public static final int SENSOR_TYPE_AMBIENT_TEMPERATURE = 0;
    public static final int SENSOR_TYPE_BAROMETER = 4;
    public static final int SENSOR_TYPE_HUMIDITY = 3;
    public static final int SENSOR_TYPE_MAGNETIC_FIELD = 1;
    public static final int SENSOR_TYPE_MAGNETIC_FIELD_UNCALIBRATED = 2;
    public static final int SENSOR_TYPE_SAR = 5;
    public static final String STRING_SENSOR_TYPE_AMBIENT_TEMPERATURE = "ohos.sensor.type.ambient_temperature";
    public static final String STRING_SENSOR_TYPE_BAROMETER = "ohos.sensor.type.barometer";
    public static final String STRING_SENSOR_TYPE_HUMIDITY = "ohos.sensor.type.humidity";
    public static final String STRING_SENSOR_TYPE_MAGNETIC_FIELD = "ohos.sensor.type.magnetic_field";
    public static final String STRING_SENSOR_TYPE_MAGNETIC_UNCALIBRATED = "ohos.sensor.type.magnetic_uncalibrated";
    public static final String STRING_SENSOR_TYPE_SAR = "ohos.sensor.type.sar";

    public CategoryEnvironment(int sensorId, String name, String vendor, int version, float upperRange, float resolution, int flags, int cacheMaxCount, long minInterval, long maxInterval) {
        super(0, null, null, 0, 0.0f, 0.0f, 0, 0, 0L, 0L);
        throw new RuntimeException("Stub!");
    }
}
