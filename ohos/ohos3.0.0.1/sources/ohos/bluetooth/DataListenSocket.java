package ohos.bluetooth;

import java.io.IOException;
import java.util.UUID;

/* loaded from: ohos3.0.0.1.jar:ohos/bluetooth/DataListenSocket.class */
public class DataListenSocket {
    DataListenSocket() {
        throw new RuntimeException("Stub!");
    }

    public SppServerSocket dataListenInsecureRfcomm(String name, UUID uuid) throws IOException {
        throw new RuntimeException("Stub!");
    }

    public SppServerSocket dataListenRfcomm(String name, UUID uuid) throws IOException {
        throw new RuntimeException("Stub!");
    }

    public SppClientSocket buildInsecureRfcommDataSocket(BluetoothRemoteDevice device, UUID uuid) throws IOException {
        throw new RuntimeException("Stub!");
    }

    public SppClientSocket buildRfcommDataSocket(BluetoothRemoteDevice device, UUID uuid) throws IOException {
        throw new RuntimeException("Stub!");
    }
}
