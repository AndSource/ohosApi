package ohos.backgroundtaskmgr;

import ohos.app.Context;
import ohos.rpc.RemoteException;

/* loaded from: ohos2.1.1.21.jar:ohos/backgroundtaskmgr/BackgroundTaskManager.class */
public class BackgroundTaskManager {
    public BackgroundTaskManager(Context context) {
        throw new RuntimeException("Stub!");
    }

    public DelaySuspendInfo requestSuspendDelay(String reason, ExpiredCallback cb) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public void cancelSuspendDelay(int requestId) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public int getRemainingDelayTime(int requestId) throws RemoteException {
        throw new RuntimeException("Stub!");
    }
}
