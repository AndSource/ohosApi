package ohos.sensor.bean;

/* loaded from: ohos2.1.1.21.jar:ohos/sensor/bean/CategoryLight.class */
public final class CategoryLight extends SensorBase {
    public static final int SENSOR_TYPE_AMBIENT_LIGHT = 2;
    public static final int SENSOR_TYPE_COLOR_RGB = 4;
    public static final int SENSOR_TYPE_COLOR_TEMPERATURE = 3;
    public static final int SENSOR_TYPE_COLOR_XYZ = 5;
    public static final int SENSOR_TYPE_PROXIMITY = 0;
    public static final int SENSOR_TYPE_TOF = 1;
    public static final String STRING_SENSOR_TYPE_AMBIENT_LIGHT = "ohos.sensor.type.ambient_light";
    public static final String STRING_SENSOR_TYPE_COLOR_RGB = "ohos.sensor.type.color_rgb";
    public static final String STRING_SENSOR_TYPE_COLOR_TEMPERATURE = "ohos.sensor.type.color_temperature";
    public static final String STRING_SENSOR_TYPE_COLOR_XYZ = "ohos.sensor.type.color_xyz";
    public static final String STRING_SENSOR_TYPE_PROXIMITY = "ohos.sensor.type.proximity";
    public static final String STRING_SENSOR_TYPE_TOF = "ohos.sensor.type.tof";

    public CategoryLight(int sensorId, String name, String vendor, int version, float upperRange, float resolution, int flags, int cacheMaxCount, long minInterval, long maxInterval) {
        super(0, null, null, 0, 0.0f, 0.0f, 0, 0, 0L, 0L);
        throw new RuntimeException("Stub!");
    }
}
