package ohos.event.commonevent;

import ohos.aafwk.content.Intent;
import ohos.app.Context;
import ohos.rpc.IRemoteObject;
import ohos.rpc.RemoteException;

/* loaded from: ohos2.0.1.95.jar:ohos/event/commonevent/CommonEventSubscriber.class */
public abstract class CommonEventSubscriber {
    public abstract void onReceiveEvent(CommonEventData commonEventData);

    public CommonEventSubscriber(CommonEventSubscribeInfo subscribeInfo) {
        throw new RuntimeException("Stub!");
    }

    public CommonEventSubscribeInfo getSubscribeInfo() {
        throw new RuntimeException("Stub!");
    }

    public final AsyncCommonEventResult goAsyncCommonEvent() {
        throw new RuntimeException("Stub!");
    }

    public final void setCode(int code) {
        throw new RuntimeException("Stub!");
    }

    public final int getCode() {
        throw new RuntimeException("Stub!");
    }

    public final void setData(String data) {
        throw new RuntimeException("Stub!");
    }

    public final String getData() {
        throw new RuntimeException("Stub!");
    }

    public final void setCodeAndData(int code, String data) {
        throw new RuntimeException("Stub!");
    }

    public final void abortCommonEvent() {
        throw new RuntimeException("Stub!");
    }

    public final boolean getAbortCommonEvent() {
        throw new RuntimeException("Stub!");
    }

    public final void clearAbortCommonEvent() {
        throw new RuntimeException("Stub!");
    }

    public IRemoteObject getRemoteAbility(Context zContext, Intent zIntent) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public final boolean isOrderedCommonEvent() {
        throw new RuntimeException("Stub!");
    }

    public final boolean isStickyCommonEvent() {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
