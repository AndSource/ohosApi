package ohos.sensor.agent;

import java.util.List;
import ohos.sensor.bean.CategoryLight;
import ohos.sensor.data.CategoryLightData;
import ohos.sensor.listener.ICategoryLightDataCallback;

/* loaded from: ohos2.2.0.3.jar:ohos/sensor/agent/CategoryLightAgent.class */
public class CategoryLightAgent extends SensorAgent<CategoryLight, CategoryLightData, ICategoryLightDataCallback> {
    public CategoryLightAgent() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.sensor.agent.SensorAgent
    public List<CategoryLight> getAllSensors() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.sensor.agent.SensorAgent
    public List<CategoryLight> getAllSensors(int sensorType) {
        throw new RuntimeException("Stub!");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ohos.sensor.agent.SensorAgent
    public CategoryLight getSingleSensor(int sensorType) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSensorDataCallback(ICategoryLightDataCallback callback, CategoryLight sensor, long interval) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSensorDataCallback(ICategoryLightDataCallback callback, CategoryLight sensor, long interval, long maxDelay) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSensorDataCallback(ICategoryLightDataCallback callback, CategoryLight sensor, int mode) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSensorDataCallback(ICategoryLightDataCallback callback, CategoryLight sensor, int mode, long maxDelay) {
        throw new RuntimeException("Stub!");
    }

    public boolean releaseSensorDataCallback(ICategoryLightDataCallback callback, CategoryLight sensor) {
        throw new RuntimeException("Stub!");
    }

    public boolean releaseSensorDataCallback(ICategoryLightDataCallback callback) {
        throw new RuntimeException("Stub!");
    }
}
