package ohos.batterymanager;

/* loaded from: ohos2.2.0.3.jar:ohos/batterymanager/BatteryInfo.class */
public class BatteryInfo {
    public static final String OHOS_BATTERY_CAPACITY = "batteryCapacity";
    public static final String OHOS_BATTERY_LOW = "batteryLow";
    public static final String OHOS_BATTERY_PRESENT = "batteryPresent";
    public static final String OHOS_BATTERY_TECHNOLOGY = "batteryTechnology";
    public static final String OHOS_BATTERY_TEMPERATURE = "batteryTemperature";
    public static final String OHOS_BATTERY_VOLTAGE = "batteryVoltage";
    public static final String OHOS_CHARGE_COUNTER = "chargeCounter";
    public static final String OHOS_CHARGE_STATE = "chargeState";
    public static final String OHOS_CHARGE_TYPE = "chargeType";
    public static final String OHOS_CHARGING_CURRENT_MAX = "maxCurrent";
    public static final String OHOS_CHARGING_VOLTAGE_MAX = "maxVoltage";
    public static final String OHOS_TEMPERATURE_STATE = "temperatureState";

    /* loaded from: ohos2.2.0.3.jar:ohos/batterymanager/BatteryInfo$BatteryChargeState.class */
    public enum BatteryChargeState {
        NONE,
        ENABLE,
        DISABLE,
        FULL,
        RESERVED
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/batterymanager/BatteryInfo$BatteryHealthState.class */
    public enum BatteryHealthState {
        UNKNOWN,
        GOOD,
        OVERHEAT,
        OVERVOLTAGE,
        COLD,
        DEAD,
        RESERVED
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/batterymanager/BatteryInfo$BatteryLevel.class */
    public enum BatteryLevel {
        NONE,
        HIGH,
        NORMAL,
        LOW,
        EMERGENCY,
        RESERVED
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/batterymanager/BatteryInfo$BatteryPluggedType.class */
    public enum BatteryPluggedType {
        NONE,
        AC,
        USB,
        WIRELESS,
        RESERVED
    }

    public BatteryInfo() {
        throw new RuntimeException("Stub!");
    }

    public int getCapacity() {
        throw new RuntimeException("Stub!");
    }

    public BatteryChargeState getChargingStatus() {
        throw new RuntimeException("Stub!");
    }

    public BatteryHealthState getHealthStatus() {
        throw new RuntimeException("Stub!");
    }

    public BatteryPluggedType getPluggedType() {
        throw new RuntimeException("Stub!");
    }

    public int getVoltage() {
        throw new RuntimeException("Stub!");
    }

    public boolean getPresent() {
        throw new RuntimeException("Stub!");
    }

    public String getTechnology() {
        throw new RuntimeException("Stub!");
    }

    public int getBatteryTemperature() {
        throw new RuntimeException("Stub!");
    }

    public BatteryLevel getBatteryLevel() {
        throw new RuntimeException("Stub!");
    }
}
