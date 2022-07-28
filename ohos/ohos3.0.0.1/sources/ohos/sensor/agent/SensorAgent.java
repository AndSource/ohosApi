package ohos.sensor.agent;

import java.util.List;
import ohos.sensor.bean.SensorBase;
import ohos.sensor.data.SensorData;
import ohos.sensor.listener.ISensorDataCallback;

/* loaded from: ohos3.0.0.1.jar:ohos/sensor/agent/SensorAgent.class */
public abstract class SensorAgent<S extends SensorBase, D extends SensorData<S>, L extends ISensorDataCallback<D, S>> {
    public static final int SENSOR_CATEGORY_BODY = 5;
    public static final int SENSOR_CATEGORY_DEVICEMOTION = 0;
    public static final int SENSOR_CATEGORY_ENVIRONMENT = 1;
    public static final int SENSOR_CATEGORY_LIGHT = 3;
    public static final int SENSOR_CATEGORY_ORIENTATION = 2;
    public static final int SENSOR_CATEGORY_OTHER = 4;
    public static final int SENSOR_SAMPLING_RATE_FASTEST = 0;
    public static final int SENSOR_SAMPLING_RATE_GAME = 1;
    public static final int SENSOR_SAMPLING_RATE_NORMAL = 3;
    public static final int SENSOR_SAMPLING_RATE_UI = 2;
    public static final String STRING_SENSOR_CATEGORY_BODY = "ohos.sensor.category.body";
    public static final String STRING_SENSOR_CATEGORY_DEVICEMOTION = "ohos.sensor.category.devicemotion";
    public static final String STRING_SENSOR_CATEGORY_ENVIRONMENT = "ohos.sensor.category.environment";
    public static final String STRING_SENSOR_CATEGORY_LIGHT = "ohos.sensor.category.light";
    public static final String STRING_SENSOR_CATEGORY_ORIENTATION = "ohos.sensor.category.orientation";
    public static final String STRING_SENSOR_CATEGORY_OTHER = "ohos.sensor.category.other";

    public abstract List<S> getAllSensors();

    public abstract List<S> getAllSensors(int i);

    public abstract S getSingleSensor(int i);

    public abstract boolean setSensorDataCallback(L l, S s, long j, long j2);

    public abstract boolean setSensorDataCallback(L l, S s, int i);

    public abstract boolean setSensorDataCallback(L l, S s, int i, long j);

    public abstract boolean releaseSensorDataCallback(L l, S s);

    public abstract boolean releaseSensorDataCallback(L l);

    public SensorAgent() {
        throw new RuntimeException("Stub!");
    }

    protected boolean subscribeParamsCheck(L callback, S sensor, long interval, long maxDelay) {
        throw new RuntimeException("Stub!");
    }

    public long getSensorMinSampleInterval(int sensorId) {
        throw new RuntimeException("Stub!");
    }

    public int runCommand(int sensorId, int commandType, int commandParameter) {
        throw new RuntimeException("Stub!");
    }
}
