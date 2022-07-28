package ohos.bluetooth.ble;

import java.util.List;
import java.util.Map;
import ohos.utils.Parcel;
import ohos.utils.PlainArray;
import ohos.utils.SequenceUuid;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.1.1.21.jar:ohos/bluetooth/ble/BleAdvertiseData.class */
public final class BleAdvertiseData implements Sequenceable {
    BleAdvertiseData() {
        throw new RuntimeException("Stub!");
    }

    public List<SequenceUuid> getServiceUuids() {
        throw new RuntimeException("Stub!");
    }

    public Map<SequenceUuid, byte[]> getServiceData() {
        throw new RuntimeException("Stub!");
    }

    public PlainArray<byte[]> getManufacturerData() {
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

    /* loaded from: ohos2.1.1.21.jar:ohos/bluetooth/ble/BleAdvertiseData$Builder.class */
    public static final class Builder {
        public Builder() {
            throw new RuntimeException("Stub!");
        }

        public Builder addServiceUuid(SequenceUuid serviceUuid) {
            throw new RuntimeException("Stub!");
        }

        public Builder addServiceData(SequenceUuid uuid, byte[] serviceData) {
            throw new RuntimeException("Stub!");
        }

        public Builder addManufacturerData(int manufacturerId, byte[] data) {
            throw new RuntimeException("Stub!");
        }

        public BleAdvertiseData build() {
            throw new RuntimeException("Stub!");
        }
    }
}
