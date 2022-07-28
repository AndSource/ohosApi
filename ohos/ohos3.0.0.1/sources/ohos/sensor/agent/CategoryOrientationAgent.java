package ohos.sensor.agent;

import java.util.List;
import ohos.sensor.bean.CategoryOrientation;
import ohos.sensor.data.CategoryOrientationData;
import ohos.sensor.listener.ICategoryOrientationDataCallback;

/* loaded from: ohos3.0.0.1.jar:ohos/sensor/agent/CategoryOrientationAgent.class */
public class CategoryOrientationAgent extends SensorAgent<CategoryOrientation, CategoryOrientationData, ICategoryOrientationDataCallback> {
    public CategoryOrientationAgent() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.sensor.agent.SensorAgent
    public List<CategoryOrientation> getAllSensors() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.sensor.agent.SensorAgent
    public List<CategoryOrientation> getAllSensors(int sensorType) {
        throw new RuntimeException("Stub!");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ohos.sensor.agent.SensorAgent
    public CategoryOrientation getSingleSensor(int sensorType) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSensorDataCallback(ICategoryOrientationDataCallback callback, CategoryOrientation sensor, long interval) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSensorDataCallback(ICategoryOrientationDataCallback callback, CategoryOrientation sensor, long interval, long maxDelay) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSensorDataCallback(ICategoryOrientationDataCallback callback, CategoryOrientation sensor, int mode) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSensorDataCallback(ICategoryOrientationDataCallback callback, CategoryOrientation sensor, int mode, long maxDelay) {
        throw new RuntimeException("Stub!");
    }

    public boolean releaseSensorDataCallback(ICategoryOrientationDataCallback callback, CategoryOrientation sensor) {
        throw new RuntimeException("Stub!");
    }

    public boolean releaseSensorDataCallback(ICategoryOrientationDataCallback callback) {
        throw new RuntimeException("Stub!");
    }
}
