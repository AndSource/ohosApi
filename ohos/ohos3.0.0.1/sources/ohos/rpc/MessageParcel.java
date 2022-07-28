package ohos.rpc;

import java.io.FileDescriptor;
import java.net.DatagramSocket;
import java.util.List;
import ohos.utils.Ashmem;
import ohos.utils.Parcel;

/* loaded from: ohos3.0.0.1.jar:ohos/rpc/MessageParcel.class */
public class MessageParcel extends Parcel {
    MessageParcel(long object) {
        throw new RuntimeException("Stub!");
    }

    public static final MessageParcel obtain() {
        throw new RuntimeException("Stub!");
    }

    public static final MessageParcel create() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Parcel
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }

    public static MessageParcel obtain(long object) {
        throw new RuntimeException("Stub!");
    }

    public static MessageParcel create(long object) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Parcel
    public final void reclaim() {
        throw new RuntimeException("Stub!");
    }

    public void updateDataVersion(IRemoteObject object) {
        throw new RuntimeException("Stub!");
    }

    public int getDataVersion() {
        throw new RuntimeException("Stub!");
    }

    public boolean writeRemoteObject(IRemoteObject object) {
        throw new RuntimeException("Stub!");
    }

    public IRemoteObject readRemoteObject() {
        throw new RuntimeException("Stub!");
    }

    public boolean writeInterfaceToken(String token) {
        throw new RuntimeException("Stub!");
    }

    public String readInterfaceToken() {
        throw new RuntimeException("Stub!");
    }

    public boolean writeFileDescriptor(FileDescriptor descriptor) {
        throw new RuntimeException("Stub!");
    }

    public FileDescriptor readFileDescriptor() {
        throw new RuntimeException("Stub!");
    }

    public boolean writeRawData(byte[] rawData, int size) {
        throw new RuntimeException("Stub!");
    }

    public byte[] readRawData(int size) {
        throw new RuntimeException("Stub!");
    }

    public int getRawDataCapacity() {
        throw new RuntimeException("Stub!");
    }

    public static void closeFileDescriptor(FileDescriptor descriptor) {
        throw new RuntimeException("Stub!");
    }

    public static FileDescriptor dupFileDescriptor(FileDescriptor descriptor) {
        throw new RuntimeException("Stub!");
    }

    public boolean containFileDescriptors() {
        throw new RuntimeException("Stub!");
    }

    public IRemoteObject[] createRemoteObjectArray() {
        throw new RuntimeException("Stub!");
    }

    public List<IRemoteObject> createRemoteObjectList() {
        throw new RuntimeException("Stub!");
    }

    public boolean writeRemoteObjectArray(IRemoteObject[] objects) {
        throw new RuntimeException("Stub!");
    }

    public boolean writeRemoteObjectList(List<IRemoteObject> objects) {
        throw new RuntimeException("Stub!");
    }

    public void readRemoteObjectArray(IRemoteObject[] objects) {
        throw new RuntimeException("Stub!");
    }

    public void readRemoteObjectList(List<IRemoteObject> objects) {
        throw new RuntimeException("Stub!");
    }

    public void writeException(Exception exception) {
        throw new RuntimeException("Stub!");
    }

    public void writeNoException() {
        throw new RuntimeException("Stub!");
    }

    public void readException() {
        throw new RuntimeException("Stub!");
    }

    public static FileDescriptor getFdFromDatagramSocket(DatagramSocket datagramSocket) {
        throw new RuntimeException("Stub!");
    }

    public static int getFd(FileDescriptor fileDescriptor) {
        throw new RuntimeException("Stub!");
    }

    public static int detachFd(FileDescriptor fileDescriptor) {
        throw new RuntimeException("Stub!");
    }

    public boolean writeAshmem(Ashmem ashmem) {
        throw new RuntimeException("Stub!");
    }

    public Ashmem readAshmem() {
        throw new RuntimeException("Stub!");
    }
}
