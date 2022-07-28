package ohos.bluetooth.ble;

import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.0.1.95.jar:ohos/bluetooth/ble/BleAdvertiseSettings.class */
public final class BleAdvertiseSettings implements Sequenceable {
    public static final int INTERVAL_SLOT_DEFAULT = 1600;
    public static final int INTERVAL_SLOT_MAX = 16777215;
    public static final int INTERVAL_SLOT_MIN = 32;
    public static final int TX_POWER_DEFAULT = -7;
    public static final int TX_POWER_MAX = 1;
    public static final int TX_POWER_MIN = -127;

    BleAdvertiseSettings() {
        throw new RuntimeException("Stub!");
    }

    public boolean isConnectable() {
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

    /* loaded from: ohos2.0.1.95.jar:ohos/bluetooth/ble/BleAdvertiseSettings$Builder.class */
    public static final class Builder {
        public Builder() {
            throw new RuntimeException("Stub!");
        }

        public Builder setInterval(int interval) {
            throw new RuntimeException("Stub!");
        }

        public Builder setTxPower(int txPower) {
            throw new RuntimeException("Stub!");
        }

        public Builder setConnectable(boolean connectable) {
            throw new RuntimeException("Stub!");
        }

        public BleAdvertiseSettings build() {
            throw new RuntimeException("Stub!");
        }
    }
}
