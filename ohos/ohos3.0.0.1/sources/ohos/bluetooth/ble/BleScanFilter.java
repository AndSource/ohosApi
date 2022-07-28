package ohos.bluetooth.ble;

import java.util.UUID;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos3.0.0.1.jar:ohos/bluetooth/ble/BleScanFilter.class */
public final class BleScanFilter implements Sequenceable {
    public BleScanFilter() {
        throw new RuntimeException("Stub!");
    }

    public void setPeripheralAddress(String address) {
        throw new RuntimeException("Stub!");
    }

    public void setPeripheralName(String name) {
        throw new RuntimeException("Stub!");
    }

    public void setPeripheralServiceData(UUID uuid, byte[] data, byte[] mask) {
        throw new RuntimeException("Stub!");
    }

    public void setPeripheralServiceUuid(UUID uuid, UUID mask) {
        throw new RuntimeException("Stub!");
    }

    public void setPeripheralManufacturerData(int manufacturerId, byte[] data, byte[] mask) {
        throw new RuntimeException("Stub!");
    }

    public String getPeripheralAddress() {
        throw new RuntimeException("Stub!");
    }

    public String getPeripheralName() {
        throw new RuntimeException("Stub!");
    }

    public byte[] getPeripheralServiceData() {
        throw new RuntimeException("Stub!");
    }

    public UUID getPeripheralServcieUuid() {
        throw new RuntimeException("Stub!");
    }

    public byte[] getPeripheralManufacturerData() {
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
