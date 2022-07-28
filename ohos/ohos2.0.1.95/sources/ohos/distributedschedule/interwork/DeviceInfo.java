package ohos.distributedschedule.interwork;

import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.0.1.95.jar:ohos/distributedschedule/interwork/DeviceInfo.class */
public class DeviceInfo implements Sequenceable {
    public static final int FLAG_GET_ALL_DEVICE = 0;
    public static final int FLAG_GET_OFFLINE_DEVICE = 2;
    public static final int FLAG_GET_ONLINE_DEVICE = 1;

    /* loaded from: ohos2.0.1.95.jar:ohos/distributedschedule/interwork/DeviceInfo$DeviceState.class */
    public enum DeviceState {
        UNKNOWN,
        ONLINE,
        OFFLINE
    }

    public DeviceInfo() {
        throw new RuntimeException("Stub!");
    }

    public void setDeviceInfo(String deviceId, String deviceName) {
        throw new RuntimeException("Stub!");
    }

    public void setDeviceType(DeviceType deviceType) {
        throw new RuntimeException("Stub!");
    }

    public void setDeviceState(DeviceState deviceState) {
        throw new RuntimeException("Stub!");
    }

    public String getDeviceId() {
        throw new RuntimeException("Stub!");
    }

    public String getDeviceName() {
        throw new RuntimeException("Stub!");
    }

    public DeviceType getDeviceType() {
        throw new RuntimeException("Stub!");
    }

    public DeviceState getDeviceState() {
        throw new RuntimeException("Stub!");
    }

    public boolean isDeviceOnline() {
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

    /* loaded from: ohos2.0.1.95.jar:ohos/distributedschedule/interwork/DeviceInfo$DeviceType.class */
    public enum DeviceType {
        UNKNOWN_TYPE,
        LAPTOP,
        SMART_PHONE,
        SMART_PAD,
        SMART_WATCH,
        SMART_CAR,
        SMART_TV;

        public int getVal() {
            throw new RuntimeException("Stub!");
        }
    }
}
