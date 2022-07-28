package ohos.bluetooth.ble;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.2.0.3.jar:ohos/bluetooth/ble/BleScanResult.class */
public final class BleScanResult implements Sequenceable {
    public BleScanResult(BlePeripheralDevice device, Map<Integer, byte[]> manufacturerDatas, Map<UUID, byte[]> serviceDatas, List<UUID> uuids, int advertiseFlag, long time) {
        throw new RuntimeException("Stub!");
    }

    public BlePeripheralDevice getPeripheralDevice() {
        throw new RuntimeException("Stub!");
    }

    public int getRssi() {
        throw new RuntimeException("Stub!");
    }

    public boolean isConnectable() {
        throw new RuntimeException("Stub!");
    }

    public Map<Integer, byte[]> getManufacturerData() {
        throw new RuntimeException("Stub!");
    }

    public Map<UUID, byte[]> getServiceData() {
        throw new RuntimeException("Stub!");
    }

    public List<UUID> getServiceUuids() {
        throw new RuntimeException("Stub!");
    }

    public int getAdvertiseFlag() {
        throw new RuntimeException("Stub!");
    }

    public long getTime() {
        throw new RuntimeException("Stub!");
    }

    public byte[] getRawData() {
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
