package ohos.sensor.agent;

import java.util.List;
import ohos.sensor.bean.CategoryMotion;
import ohos.sensor.data.CategoryMotionData;
import ohos.sensor.listener.ICategoryMotionDataCallback;

/* loaded from: ohos2.2.0.3.jar:ohos/sensor/agent/CategoryMotionAgent.class */
public class CategoryMotionAgent extends SensorAgent<CategoryMotion, CategoryMotionData, ICategoryMotionDataCallback> {
    public CategoryMotionAgent() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.sensor.agent.SensorAgent
    public List<CategoryMotion> getAllSensors() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.sensor.agent.SensorAgent
    public List<CategoryMotion> getAllSensors(int sensorType) {
        throw new RuntimeException("Stub!");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ohos.sensor.agent.SensorAgent
    public CategoryMotion getSingleSensor(int sensorType) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSensorDataCallback(ICategoryMotionDataCallback callback, CategoryMotion sensor, long interval) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSensorDataCallback(ICategoryMotionDataCallback callback, CategoryMotion sensor, long interval, long maxDelay) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSensorDataCallback(ICategoryMotionDataCallback callback, CategoryMotion sensor, int mode) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSensorDataCallback(ICategoryMotionDataCallback callback, CategoryMotion sensor, int mode, long maxDelay) {
        throw new RuntimeException("Stub!");
    }

    public boolean releaseSensorDataCallback(ICategoryMotionDataCallback callback, CategoryMotion sensor) {
        throw new RuntimeException("Stub!");
    }

    public boolean releaseSensorDataCallback(ICategoryMotionDataCallback callback) {
        throw new RuntimeException("Stub!");
    }
}
