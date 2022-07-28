package ohos.rpc;

import ohos.rpc.IRemoteBroker;

/* loaded from: ohos2.1.1.21.jar:ohos/rpc/RemoteObjectCallbackList.class */
public class RemoteObjectCallbackList<E extends IRemoteBroker> {
    public RemoteObjectCallbackList() {
        throw new RuntimeException("Stub!");
    }

    public void onRemoteCallbackDied(E callback) {
        throw new RuntimeException("Stub!");
    }

    public void onRemoteCallbackDied(E callback, Object cookie) {
        throw new RuntimeException("Stub!");
    }

    public int getRemoteObjectCallbackCount() {
        throw new RuntimeException("Stub!");
    }

    public E getRemoteObjectCallbackInterface(IRemoteObject key) {
        throw new RuntimeException("Stub!");
    }

    public Object getRemoteObjectCallbackCookie(IRemoteObject key) {
        throw new RuntimeException("Stub!");
    }

    public boolean register(E callback) {
        throw new RuntimeException("Stub!");
    }

    public boolean register(E callback, Object cookie) {
        throw new RuntimeException("Stub!");
    }

    public boolean unregister(E callback) {
        throw new RuntimeException("Stub!");
    }

    public void unregisterAll() {
        throw new RuntimeException("Stub!");
    }

    public int startBroadcast() {
        throw new RuntimeException("Stub!");
    }

    public void stopBroadcast() {
        throw new RuntimeException("Stub!");
    }

    public E getBroadcastInterface(int index) {
        throw new RuntimeException("Stub!");
    }

    public Object getBroadcastCookie(int index) {
        throw new RuntimeException("Stub!");
    }
}
