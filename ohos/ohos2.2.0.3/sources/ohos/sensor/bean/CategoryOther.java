package ohos.sensor.bean;

/* loaded from: ohos2.2.0.3.jar:ohos/sensor/bean/CategoryOther.class */
public final class CategoryOther extends SensorBase {
    public static final int SENSOR_TYPE_GRIP_DETECTOR = 1;
    public static final int SENSOR_TYPE_HALL = 0;
    public static final int SENSOR_TYPE_MAGNET_BRACKET = 2;
    public static final int SENSOR_TYPE_PRESSURE_DETECTOR = 3;
    public static final String STRING_SENSOR_TYPE_GRIP_DETECTOR = "ohos.sensor.type.grip_detector";
    public static final String STRING_SENSOR_TYPE_HALL = "ohos.sensor.type.hall";
    public static final String STRING_SENSOR_TYPE_MAGNET_BRACKET = "ohos.sensor.type.magnet_bracket";
    public static final String STRING_SENSOR_TYPE_PRESSURE_DETECTOR = "ohos.sensor.type.pressure_detector";

    public CategoryOther(int sensorId, String name, String vendor, int version, float upperRange, float resolution, int flags, int cacheMaxCount, long minInterval, long maxInterval) {
        super(0, null, null, 0, 0.0f, 0.0f, 0, 0, 0L, 0L);
        throw new RuntimeException("Stub!");
    }
}
