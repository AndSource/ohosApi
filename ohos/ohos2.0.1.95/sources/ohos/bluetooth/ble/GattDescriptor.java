package ohos.bluetooth.ble;

import java.util.UUID;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.0.1.95.jar:ohos/bluetooth/ble/GattDescriptor.class */
public class GattDescriptor implements Sequenceable {
    public GattDescriptor(UUID uuid, int permissions) {
        throw new RuntimeException("Stub!");
    }

    public GattCharacteristic getCharacteristic() {
        throw new RuntimeException("Stub!");
    }

    public UUID getUuid() {
        throw new RuntimeException("Stub!");
    }

    public int getPermissions() {
        throw new RuntimeException("Stub!");
    }

    public byte[] getValue() {
        throw new RuntimeException("Stub!");
    }

    public boolean setValue(byte[] values) {
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
}
