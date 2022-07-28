package ohos.rpc;

import java.io.FileDescriptor;

/* loaded from: ohos2.1.1.21.jar:ohos/rpc/IRemoteObject.class */
public interface IRemoteObject {
    public static final int DUMP_TRANSACTION = 1598311760;
    public static final int INTERFACE_TRANSACTION = 1598968902;
    public static final int MAX_TRANSACTION_ID = 16777215;
    public static final int MIN_TRANSACTION_ID = 1;
    public static final int PING_TRANSACTION = 1599098439;

    /* loaded from: ohos2.1.1.21.jar:ohos/rpc/IRemoteObject$DeathRecipient.class */
    public interface DeathRecipient {
        void onRemoteDied();
    }

    IRemoteBroker queryLocalInterface(String str);

    boolean sendRequest(int i, MessageParcel messageParcel, MessageParcel messageParcel2, MessageOption messageOption) throws RemoteException;

    boolean addDeathRecipient(DeathRecipient deathRecipient, int i);

    boolean removeDeathRecipient(DeathRecipient deathRecipient, int i);

    String getInterfaceDescriptor();

    void dump(FileDescriptor fileDescriptor, String[] strArr) throws RemoteException;

    void slowPathDump(FileDescriptor fileDescriptor, String[] strArr) throws RemoteException;

    boolean isObjectDead();
}
