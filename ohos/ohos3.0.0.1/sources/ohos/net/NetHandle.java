package ohos.net;

import java.io.FileDescriptor;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import javax.net.SocketFactory;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos3.0.0.1.jar:ohos/net/NetHandle.class */
public class NetHandle implements Sequenceable {
    public NetHandle(int netId, boolean privateDnsBypass) {
        throw new RuntimeException("Stub!");
    }

    public NetHandle(int netId) {
        throw new RuntimeException("Stub!");
    }

    public NetHandle() {
        throw new RuntimeException("Stub!");
    }

    public InetAddress[] getAllByName(String host) throws UnknownHostException {
        throw new RuntimeException("Stub!");
    }

    public InetAddress getByName(String host) throws UnknownHostException {
        throw new RuntimeException("Stub!");
    }

    public void bindSocket(DatagramSocket socket) throws IOException {
        throw new RuntimeException("Stub!");
    }

    public void bindSocket(Socket socket) throws IOException {
        throw new RuntimeException("Stub!");
    }

    public void bindSocket(FileDescriptor fd) throws IOException {
        throw new RuntimeException("Stub!");
    }

    public SocketFactory getSocketFactory() {
        throw new RuntimeException("Stub!");
    }

    public URLConnection openConnection(URL url) throws IOException {
        throw new RuntimeException("Stub!");
    }

    public URLConnection openConnection(URL url, Proxy proxy) throws IOException {
        throw new RuntimeException("Stub!");
    }

    public long getNetHandle() {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object obj) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean unmarshalling(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean marshalling(Parcel out) {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
