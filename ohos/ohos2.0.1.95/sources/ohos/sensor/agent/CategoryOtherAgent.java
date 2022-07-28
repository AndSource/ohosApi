package ohos.sensor.agent;

import java.util.List;
import ohos.sensor.bean.CategoryOther;
import ohos.sensor.data.CategoryOtherData;
import ohos.sensor.listener.ICategoryOtherDataCallback;

/* loaded from: ohos2.0.1.95.jar:ohos/sensor/agent/CategoryOtherAgent.class */
public class CategoryOtherAgent extends SensorAgent<CategoryOther, CategoryOtherData, ICategoryOtherDataCallback> {
    public CategoryOtherAgent() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.sensor.agent.SensorAgent
    public List<CategoryOther> getAllSensors() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.sensor.agent.SensorAgent
    public List<CategoryOther> getAllSensors(int sensorType) {
        throw new RuntimeException("Stub!");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ohos.sensor.agent.SensorAgent
    public CategoryOther getSingleSensor(int sensorType) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSensorDataCallback(ICategoryOtherDataCallback callback, CategoryOther sensor, long interval) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSensorDataCallback(ICategoryOtherDataCallback callback, CategoryOther sensor, long interval, long maxDelay) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSensorDataCallback(ICategoryOtherDataCallback callback, CategoryOther sensor, int mode) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSensorDataCallback(ICategoryOtherDataCallback callback, CategoryOther sensor, int mode, long maxDelay) {
        throw new RuntimeException("Stub!");
    }

    public boolean releaseSensorDataCallback(ICategoryOtherDataCallback callback, CategoryOther sensor) {
        throw new RuntimeException("Stub!");
    }

    public boolean releaseSensorDataCallback(ICategoryOtherDataCallback callback) {
        throw new RuntimeException("Stub!");
    }
}
