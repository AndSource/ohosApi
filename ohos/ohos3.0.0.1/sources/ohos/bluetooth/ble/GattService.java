package ohos.bluetooth.ble;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos3.0.0.1.jar:ohos/bluetooth/ble/GattService.class */
public class GattService implements Sequenceable {
    public GattService(UUID uuid, boolean isPrimary) {
        throw new RuntimeException("Stub!");
    }

    public boolean isPrimary() {
        throw new RuntimeException("Stub!");
    }

    public UUID getUuid() {
        throw new RuntimeException("Stub!");
    }

    public boolean addService(GattService service) {
        throw new RuntimeException("Stub!");
    }

    public List<GattService> getIncludedServices() {
        throw new RuntimeException("Stub!");
    }

    public boolean addCharacteristic(GattCharacteristic characteristic) {
        throw new RuntimeException("Stub!");
    }

    public List<GattCharacteristic> getCharacteristics() {
        throw new RuntimeException("Stub!");
    }

    public Optional<GattCharacteristic> getCharacteristic(UUID uuid) {
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
