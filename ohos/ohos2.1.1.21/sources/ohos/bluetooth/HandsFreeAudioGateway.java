package ohos.bluetooth;

import java.util.List;
import ohos.app.Context;

/* loaded from: ohos2.1.1.21.jar:ohos/bluetooth/HandsFreeAudioGateway.class */
public final class HandsFreeAudioGateway implements ProfileBase {
    public static final String EVENT_AUDIO_STATE_UPDATE = "usual.event.bluetooth.handsfree.ag.AUDIO_STATE_UPDATE";
    public static final int SCO_STATE_CONNECTED = 2;
    public static final int SCO_STATE_CONNECTING = 1;
    public static final int SCO_STATE_DISCONNECTED = 0;

    HandsFreeAudioGateway(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static synchronized HandsFreeAudioGateway getProfile(Context context) {
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

    public int getScoState(BluetoothRemoteDevice device) {
        throw new RuntimeException("Stub!");
    }

    public boolean openVoiceRecognition(BluetoothRemoteDevice device) {
        throw new RuntimeException("Stub!");
    }

    public boolean closeVoiceRecognition(BluetoothRemoteDevice device) {
        throw new RuntimeException("Stub!");
    }

    public boolean connectSco() {
        throw new RuntimeException("Stub!");
    }

    public boolean disconnectSco() {
        throw new RuntimeException("Stub!");
    }

    public List<BluetoothRemoteDevice> getConnectedDevices() {
        throw new RuntimeException("Stub!");
    }
}
