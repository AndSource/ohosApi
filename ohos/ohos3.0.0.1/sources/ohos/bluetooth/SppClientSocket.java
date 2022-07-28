package ohos.bluetooth;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

/* loaded from: ohos3.0.0.1.jar:ohos/bluetooth/SppClientSocket.class */
public class SppClientSocket {
    public static final int RFCOMM_SOCKET = 1;

    SppClientSocket(BluetoothRemoteDevice device, int connectionType, UUID uuid, int port) {
        throw new RuntimeException("Stub!");
    }

    public void connect() throws IOException {
        throw new RuntimeException("Stub!");
    }

    public void close() throws IOException {
        throw new RuntimeException("Stub!");
    }

    public int getSppClientConnectionType() {
        throw new RuntimeException("Stub!");
    }

    public InputStream getSppClientInputStream() {
        throw new RuntimeException("Stub!");
    }

    public OutputStream getSppClientOutputStream() {
        throw new RuntimeException("Stub!");
    }

    public boolean isSppClientConnected() {
        throw new RuntimeException("Stub!");
    }
}
