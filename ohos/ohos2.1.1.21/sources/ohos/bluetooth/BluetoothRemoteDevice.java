package ohos.bluetooth;

import java.util.Optional;
import ohos.utils.Parcel;
import ohos.utils.SequenceUuid;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.1.1.21.jar:ohos/bluetooth/BluetoothRemoteDevice.class */
public final class BluetoothRemoteDevice implements Sequenceable {
    public static final String EVENT_DEVICE_DISCOVERED = "usual.event.bluetooth.remotedevice.DISCOVERED";
    public static final String EVENT_DEVICE_PAIRING_REQ = "usual.event.bluetooth.remotedevice.PAIRING_REQ";
    public static final String EVENT_DEVICE_PAIR_STATE = "usual.event.bluetooth.remotedevice.PAIR_STATE";
    public static final int PAIR_STATE_NONE = 0;
    public static final int PAIR_STATE_PAIRED = 2;
    public static final int PAIR_STATE_PAIRING = 1;
    public static final String REMOTE_DEVICE_PARAM_DEVICE = "usual.event.remotedevice.PARAM_DEVICE";
    public static final String REMOTE_DEVICE_PARAM_PAIRING_FORMAT = "usual.event.remotedevice.PARAM_PAIRING_FORMAT";
    public static final String REMOTE_DEVICE_PARAM_PAIRING_KEY = "usual.event.remotedevice.PARAM_PAIRING_KEY";
    public static final String REMOTE_DEVICE_PARAM_PAIR_STATE = "usual.event.remotedevice.PARAM_PAIR_STATE";
    public static final String REMOTE_DEVICE_PARAM_PREV_PAIR_STATE = "usual.event.remotedevice.PARAM_PREV_PAIR_STATE";
    public static final int TYPE_CLASSIC = 1;
    public static final int TYPE_DUAL = 3;
    public static final int TYPE_LE = 2;
    public static final int TYPE_UNKNOWN = 0;

    BluetoothRemoteDevice() {
        throw new RuntimeException("Stub!");
    }

    public String getDeviceAddr() {
        throw new RuntimeException("Stub!");
    }

    public Optional<String> getDeviceName() {
        throw new RuntimeException("Stub!");
    }

    public int getDeviceType() {
        throw new RuntimeException("Stub!");
    }

    public Optional<BluetoothDeviceClass> getDeviceClass() {
        throw new RuntimeException("Stub!");
    }

    public int getPairState() {
        throw new RuntimeException("Stub!");
    }

    public boolean startPair() {
        throw new RuntimeException("Stub!");
    }

    public boolean setDevicePin(byte[] pin) {
        throw new RuntimeException("Stub!");
    }

    public SequenceUuid[] getDeviceUuids() {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
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

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object object) {
        throw new RuntimeException("Stub!");
    }
}
