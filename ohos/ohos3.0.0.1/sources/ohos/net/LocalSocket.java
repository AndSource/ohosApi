package ohos.net;

import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: ohos3.0.0.1.jar:ohos/net/LocalSocket.class */
public class LocalSocket {
    public LocalSocket(String name, boolean isServer) throws IOException {
        throw new RuntimeException("Stub!");
    }

    public synchronized void connectSocket() throws IOException {
        throw new RuntimeException("Stub!");
    }

    public LocalSocket acceptSocket() throws IOException {
        throw new RuntimeException("Stub!");
    }

    public synchronized void closeSocket() throws IOException {
        throw new RuntimeException("Stub!");
    }

    public InputStream getInputStream() throws IOException {
        throw new RuntimeException("Stub!");
    }

    public OutputStream getOutputStream() throws IOException {
        throw new RuntimeException("Stub!");
    }

    public void closeInputStream() throws IOException {
        throw new RuntimeException("Stub!");
    }

    public void closeOutputStream() throws IOException {
        throw new RuntimeException("Stub!");
    }

    public FileDescriptor getSocketFd() {
        throw new RuntimeException("Stub!");
    }

    public String getSocketName() {
        throw new RuntimeException("Stub!");
    }

    public SocketCertificates getPeerSocketInfo() throws IOException {
        throw new RuntimeException("Stub!");
    }

    public synchronized boolean isSocketConnected() {
        throw new RuntimeException("Stub!");
    }

    public void setSocketReadTimeout(int timeout) throws IOException {
        throw new RuntimeException("Stub!");
    }

    public FileDescriptor[] getAppendedFds() throws IOException {
        throw new RuntimeException("Stub!");
    }

    public void setAppendedFds(FileDescriptor[] fds) throws IOException {
        throw new RuntimeException("Stub!");
    }
}
