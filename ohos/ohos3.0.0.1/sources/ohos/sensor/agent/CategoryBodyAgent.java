package ohos.sensor.agent;

import java.util.List;
import ohos.sensor.bean.CategoryBody;
import ohos.sensor.data.CategoryBodyData;
import ohos.sensor.listener.ICategoryBodyDataCallback;

/* loaded from: ohos3.0.0.1.jar:ohos/sensor/agent/CategoryBodyAgent.class */
public class CategoryBodyAgent extends SensorAgent<CategoryBody, CategoryBodyData, ICategoryBodyDataCallback> {
    public CategoryBodyAgent() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.sensor.agent.SensorAgent
    public List<CategoryBody> getAllSensors() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.sensor.agent.SensorAgent
    public List<CategoryBody> getAllSensors(int sensorType) {
        throw new RuntimeException("Stub!");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ohos.sensor.agent.SensorAgent
    public CategoryBody getSingleSensor(int sensorType) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSensorDataCallback(ICategoryBodyDataCallback callback, CategoryBody sensor, long interval) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSensorDataCallback(ICategoryBodyDataCallback callback, CategoryBody sensor, long interval, long maxDelay) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSensorDataCallback(ICategoryBodyDataCallback callback, CategoryBody sensor, int mode) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSensorDataCallback(ICategoryBodyDataCallback callback, CategoryBody sensor, int mode, long maxDelay) {
        throw new RuntimeException("Stub!");
    }

    public boolean releaseSensorDataCallback(ICategoryBodyDataCallback callback, CategoryBody sensor) {
        throw new RuntimeException("Stub!");
    }

    public boolean releaseSensorDataCallback(ICategoryBodyDataCallback callback) {
        throw new RuntimeException("Stub!");
    }
}
