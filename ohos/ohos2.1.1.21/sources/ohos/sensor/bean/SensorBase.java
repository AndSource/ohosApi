package ohos.sensor.bean;

/* loaded from: ohos2.1.1.21.jar:ohos/sensor/bean/SensorBase.class */
public class SensorBase {
    public static final int COMMAND_PARAMETER_FLUSH = 0;
    public static final int COMMAND_PARAMETER_SET_MODE = 1;
    public static final int COMMAND_TYPE_FLUSH = 0;
    public static final int COMMAND_TYPE_SET_MODE = 1;
    public static final int SENSOR_CATEGORY_MASK = -16777216;
    public static final int SENSOR_CATEGORY_MASK_SHIFT = 24;
    public static final int SENSOR_INDEX_MASK = 65280;
    public static final int SENSOR_INDEX_MASK_SHIFT = 8;
    public static final int SENSOR_TYPE_MASK = 16711680;
    public static final int SENSOR_TYPE_MASK_SHIFT = 16;

    public SensorBase(int sensorId, String name, String vendor, int version, float upperRange, float resolution, int flags, int cacheMaxCount, long minInterval, long maxInterval) {
        throw new RuntimeException("Stub!");
    }

    public int getSensorId() {
        throw new RuntimeException("Stub!");
    }

    public String getName() {
        throw new RuntimeException("Stub!");
    }

    public String getVendor() {
        throw new RuntimeException("Stub!");
    }

    public int getVersion() {
        throw new RuntimeException("Stub!");
    }

    public float getUpperRange() {
        throw new RuntimeException("Stub!");
    }

    public float getResolution() {
        throw new RuntimeException("Stub!");
    }

    public int getFlags() {
        throw new RuntimeException("Stub!");
    }

    public int getCacheMaxCount() {
        throw new RuntimeException("Stub!");
    }

    public long getMinInterval() {
        throw new RuntimeException("Stub!");
    }

    public long getMaxInterval() {
        throw new RuntimeException("Stub!");
    }
}
