package ohos.bluetooth.ble;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.0.1.95.jar:ohos/bluetooth/ble/GattCharacteristic.class */
public class GattCharacteristic implements Sequenceable {
    public static final int PROPERTY_READ = 2;
    public static final int PROPERTY_WRITE = 8;
    public static final int PROPERTY_WRITE_NO_RESPONSE = 4;

    public GattCharacteristic(UUID uuid, int permissions, int properties) {
        throw new RuntimeException("Stub!");
    }

    public UUID getUuid() {
        throw new RuntimeException("Stub!");
    }

    public int getPermissions() {
        throw new RuntimeException("Stub!");
    }

    public int getProperties() {
        throw new RuntimeException("Stub!");
    }

    public boolean setValue(byte[] values) {
        throw new RuntimeException("Stub!");
    }

    public byte[] getValue() {
        throw new RuntimeException("Stub!");
    }

    public GattService getService() {
        throw new RuntimeException("Stub!");
    }

    public boolean addDescriptor(GattDescriptor descriptor) {
        throw new RuntimeException("Stub!");
    }

    public List<GattDescriptor> getDescriptors() {
        throw new RuntimeException("Stub!");
    }

    public Optional<GattDescriptor> getDescriptor(UUID uuid) {
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
