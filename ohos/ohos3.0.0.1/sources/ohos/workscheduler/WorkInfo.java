package ohos.workscheduler;

import ohos.bundle.ElementName;
import ohos.utils.PacMap;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos3.0.0.1.jar:ohos/workscheduler/WorkInfo.class */
public final class WorkInfo implements Sequenceable {
    public static final int BATTERY_LEVEL_LOW = 0;
    public static final int BATTERY_LEVEL_LOW_OR_OKAY = 2;
    public static final int BATTERY_LEVEL_OKAY = 1;
    public static final int CHARGING_PLUGGED_AC = 1;
    public static final int CHARGING_PLUGGED_ANY = 0;
    public static final int CHARGING_PLUGGED_USB = 2;
    public static final int CHARGING_PLUGGED_WIRELESS = 3;
    public static final int MAX_BATTERY_LEVEL = 100;
    public static final int MAX_IDLE_WAIT_TIME_MS = 1200000;
    public static final int MAX_REPEAT_DELAY_TIME_MS = 1200000;
    public static final int MIN_BATTERY_LEVEL = 10;
    public static final int MIN_IDLE_WAIT_TIME_MS = 60000;
    public static final int MIN_REPEAT_COUNTER = 1;
    public static final int MIN_REPEAT_CYCLE_TIME_MS = 1200000;
    public static final int NETWORK_TYPE_ANY = 0;
    public static final int NETWORK_TYPE_BLUETOOTH = 3;
    public static final int NETWORK_TYPE_ETHERNET = 5;
    public static final int NETWORK_TYPE_MOBILE = 1;
    public static final int NETWORK_TYPE_WIFI = 2;
    public static final int NETWORK_TYPE_WIFI_P2P = 4;
    public static final int STORAGE_LEVEL_LOW = 0;
    public static final int STORAGE_LEVEL_LOW_OR_OKAY = 2;
    public static final int STORAGE_LEVEL_OKAY = 1;

    WorkInfo(Builder info) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean marshalling(Parcel out) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean unmarshalling(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    public boolean isWorkInfoValid() {
        throw new RuntimeException("Stub!");
    }

    public ElementName getElementInfo() {
        throw new RuntimeException("Stub!");
    }

    public int getCurrentWorkID() {
        throw new RuntimeException("Stub!");
    }

    public String getBundleName() {
        throw new RuntimeException("Stub!");
    }

    public String getAbilityName() {
        throw new RuntimeException("Stub!");
    }

    public boolean isRequestNetwork() {
        throw new RuntimeException("Stub!");
    }

    public int getRequestNetworkType() {
        throw new RuntimeException("Stub!");
    }

    public boolean isRequestBattery() {
        throw new RuntimeException("Stub!");
    }

    public int getRequestBatteryStatus() {
        throw new RuntimeException("Stub!");
    }

    public int getRequestBatteryLevel() {
        throw new RuntimeException("Stub!");
    }

    public boolean isRequestCharging() {
        throw new RuntimeException("Stub!");
    }

    public int getRequestChargeType() {
        throw new RuntimeException("Stub!");
    }

    public boolean isRequestStorage() {
        throw new RuntimeException("Stub!");
    }

    public int getRequestStorageType() {
        throw new RuntimeException("Stub!");
    }

    public boolean isRequestDeepIdle() {
        throw new RuntimeException("Stub!");
    }

    public int getRequestIdleWaitTime() {
        throw new RuntimeException("Stub!");
    }

    public boolean isRequestPersisted() {
        throw new RuntimeException("Stub!");
    }

    public boolean isRequestRepeat() {
        throw new RuntimeException("Stub!");
    }

    public int getRepeatCounter() {
        throw new RuntimeException("Stub!");
    }

    public long getRepeatCycleTime() {
        throw new RuntimeException("Stub!");
    }

    public boolean isRequestDelay() {
        throw new RuntimeException("Stub!");
    }

    public PacMap getPacMaps() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/workscheduler/WorkInfo$Builder.class */
    public static final class Builder {
        public Builder() {
            throw new RuntimeException("Stub!");
        }

        public WorkInfo build() {
            throw new RuntimeException("Stub!");
        }

        public Builder setAbilityInfo(int id, String bundleName, String className) {
            throw new RuntimeException("Stub!");
        }

        public Builder requestNetworkType(int networkType) {
            throw new RuntimeException("Stub!");
        }

        public Builder requestDeviceIdleType(boolean needDeepIdle, int idleWaitTime) {
            throw new RuntimeException("Stub!");
        }

        public Builder requestChargingType(boolean requestCharging, int requestchargerType) {
            throw new RuntimeException("Stub!");
        }

        public Builder requestBatteryStatus(int requestStatus) {
            throw new RuntimeException("Stub!");
        }

        public Builder requestStorageStatus(int requestStatus) {
            throw new RuntimeException("Stub!");
        }

        public Builder requestRepeatCycle(long cycleTime) {
            throw new RuntimeException("Stub!");
        }

        public Builder requestRepeatCycle(long cycleTime, int requestRepeatTimes) {
            throw new RuntimeException("Stub!");
        }

        public Builder requestPersisted(boolean requestPersisted) {
            throw new RuntimeException("Stub!");
        }

        public Builder setPacMaps(PacMap maps) {
            throw new RuntimeException("Stub!");
        }
    }
}
