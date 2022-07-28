package ohos.bluetooth;

import java.util.List;
import ohos.app.Context;

/* loaded from: ohos2.1.1.21.jar:ohos/bluetooth/A2dpSource.class */
public final class A2dpSource implements ProfileBase {
    public static final int STATE_NOT_PLAYING = 0;
    public static final int STATE_PLAYING = 1;

    A2dpSource(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static synchronized A2dpSource getProfile(Context context) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.bluetooth.ProfileBase
    public List<BluetoothRemoteDevice> getDevicesByStates(int[] states) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.bluetooth.ProfileBase
    public int getDeviceState(BluetoothRemoteDevice device) {
        throw new RuntimeException("Stub!");
    }

    public int getPlayingState(BluetoothRemoteDevice device) {
        throw new RuntimeException("Stub!");
    }
}
