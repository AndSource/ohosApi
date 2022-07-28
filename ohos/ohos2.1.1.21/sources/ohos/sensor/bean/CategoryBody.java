package ohos.sensor.bean;

/* loaded from: ohos2.1.1.21.jar:ohos/sensor/bean/CategoryBody.class */
public class CategoryBody extends SensorBase {
    public static final int SENSOR_TYPE_HEART_RATE = 0;
    public static final int SENSOR_TYPE_WEAR_DETECTION = 1;
    public static final String STRING_SENSOR_TYPE_HEART_RATE = "ohos.sensor.type.heart_rate";

    public CategoryBody(int sensorId, String name, String vendor, int version, float upperRange, float resolution, int flags, int cacheMaxCount, long minInterval, long maxInterval) {
        super(0, null, null, 0, 0.0f, 0.0f, 0, 0, 0L, 0L);
        throw new RuntimeException("Stub!");
    }
}
