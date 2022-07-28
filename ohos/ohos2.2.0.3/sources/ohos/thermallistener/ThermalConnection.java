package ohos.thermallistener;

/* loaded from: ohos2.2.0.3.jar:ohos/thermallistener/ThermalConnection.class */
public interface ThermalConnection {

    /* loaded from: ohos2.2.0.3.jar:ohos/thermallistener/ThermalConnection$ThermalSeverityLevel.class */
    public enum ThermalSeverityLevel {
        COOL,
        WARM,
        HOT,
        OVERHEATED,
        WARNING,
        EMERGENCY
    }

    void thermalStatusChanged(ThermalSeverityLevel thermalSeverityLevel);

    default void thermalServiceDied() {
        throw new RuntimeException("Stub!");
    }
}
