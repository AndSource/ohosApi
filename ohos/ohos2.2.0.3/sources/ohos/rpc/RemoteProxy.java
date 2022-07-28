package ohos.rpc;

import java.io.FileDescriptor;
import ohos.rpc.IRemoteObject;

/* loaded from: ohos2.2.0.3.jar:ohos/rpc/RemoteProxy.class */
public class RemoteProxy implements IRemoteObject {
    RemoteProxy(long nativeData) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.rpc.IRemoteObject
    public IRemoteBroker queryLocalInterface(String descriptor) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.rpc.IRemoteObject
    public boolean addDeathRecipient(IRemoteObject.DeathRecipient recipient, int flags) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.rpc.IRemoteObject
    public boolean removeDeathRecipient(IRemoteObject.DeathRecipient recipient, int flags) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.rpc.IRemoteObject
    public String getInterfaceDescriptor() {
        throw new RuntimeException("Stub!");
    }

    public static final void sendObituary(IRemoteObject.DeathRecipient recipient) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.rpc.IRemoteObject
    public boolean sendRequest(int code, MessageParcel data, MessageParcel reply, MessageOption option) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.rpc.IRemoteObject
    public void dump(FileDescriptor fd, String[] args) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.rpc.IRemoteObject
    public void slowPathDump(FileDescriptor fd, String[] args) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.rpc.IRemoteObject
    public boolean isObjectDead() {
        throw new RuntimeException("Stub!");
    }

    public long getIdentity() {
        throw new RuntimeException("Stub!");
    }

    public boolean setDataVersion(int dataVersion) {
        throw new RuntimeException("Stub!");
    }

    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object object) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
}
