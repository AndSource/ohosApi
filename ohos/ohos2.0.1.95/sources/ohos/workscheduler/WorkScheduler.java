package ohos.workscheduler;

import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;
import ohos.rpc.IRemoteObject;
import ohos.rpc.RemoteException;

/* loaded from: ohos2.0.1.95.jar:ohos/workscheduler/WorkScheduler.class */
public abstract class WorkScheduler extends Ability {
    public abstract void onWorkStart(WorkInfo workInfo);

    public abstract void onWorkStop(WorkInfo workInfo);

    public WorkScheduler() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    protected final IRemoteObject onConnect(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    protected final void onDisconnect(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    public static final boolean startWork(WorkInfo work, boolean startNow) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static final boolean stopWork(WorkInfo work) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static final boolean stopAndCancelWork(WorkInfo work) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public static final WorkInfo getWorkStatus(int workID) throws RemoteException {
        throw new RuntimeException("Stub!");
    }
}
