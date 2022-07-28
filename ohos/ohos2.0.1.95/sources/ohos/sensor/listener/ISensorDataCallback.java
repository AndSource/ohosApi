package ohos.sensor.listener;

import ohos.sensor.bean.SensorBase;
import ohos.sensor.data.SensorData;

/* loaded from: ohos2.0.1.95.jar:ohos/sensor/listener/ISensorDataCallback.class */
public interface ISensorDataCallback<D extends SensorData<S>, S extends SensorBase> {
    void onSensorDataModified(D d);

    void onAccuracyDataModified(S s, int i);

    void onCommandCompleted(S s);
}
