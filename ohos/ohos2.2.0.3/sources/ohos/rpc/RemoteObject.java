package ohos.rpc;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import ohos.rpc.IRemoteObject;

/* loaded from: ohos2.2.0.3.jar:ohos/rpc/RemoteObject.class */
public class RemoteObject implements IRemoteObject {
    public RemoteObject(String descriptor) {
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

    public boolean onRemoteRequest(int code, MessageParcel data, MessageParcel reply, MessageOption option) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.rpc.IRemoteObject
    public boolean sendRequest(int code, MessageParcel data, MessageParcel reply, MessageOption option) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public int getCallingPid() {
        throw new RuntimeException("Stub!");
    }

    public int getCallingUid() {
        throw new RuntimeException("Stub!");
    }

    protected void dump(FileDescriptor fd, PrintWriter pw, String[] args) {
        throw new RuntimeException("Stub!");
    }

    protected void slowPathDump(FileDescriptor fd, PrintWriter pw, String[] args) {
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

    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.rpc.IRemoteObject
    public boolean isObjectDead() {
        throw new RuntimeException("Stub!");
    }

    public void attachLocalInterface(IRemoteBroker localInterface, String descriptor) {
        throw new RuntimeException("Stub!");
    }
}
