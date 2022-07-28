package ohos.sensor.agent;

import java.util.List;
import ohos.sensor.bean.CategoryEnvironment;
import ohos.sensor.data.CategoryEnvironmentData;
import ohos.sensor.listener.ICategoryEnvironmentDataCallback;

/* loaded from: ohos3.0.0.1.jar:ohos/sensor/agent/CategoryEnvironmentAgent.class */
public class CategoryEnvironmentAgent extends SensorAgent<CategoryEnvironment, CategoryEnvironmentData, ICategoryEnvironmentDataCallback> {
    public CategoryEnvironmentAgent() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.sensor.agent.SensorAgent
    public List<CategoryEnvironment> getAllSensors() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.sensor.agent.SensorAgent
    public List<CategoryEnvironment> getAllSensors(int sensorType) {
        throw new RuntimeException("Stub!");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ohos.sensor.agent.SensorAgent
    public CategoryEnvironment getSingleSensor(int sensorType) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSensorDataCallback(ICategoryEnvironmentDataCallback callback, CategoryEnvironment sensor, long interval) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSensorDataCallback(ICategoryEnvironmentDataCallback callback, CategoryEnvironment sensor, long interval, long maxDelay) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSensorDataCallback(ICategoryEnvironmentDataCallback callback, CategoryEnvironment sensor, int mode) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSensorDataCallback(ICategoryEnvironmentDataCallback callback, CategoryEnvironment sensor, int mode, long maxDelay) {
        throw new RuntimeException("Stub!");
    }

    public boolean releaseSensorDataCallback(ICategoryEnvironmentDataCallback callback, CategoryEnvironment sensor) {
        throw new RuntimeException("Stub!");
    }

    public boolean releaseSensorDataCallback(ICategoryEnvironmentDataCallback callback) {
        throw new RuntimeException("Stub!");
    }
}
