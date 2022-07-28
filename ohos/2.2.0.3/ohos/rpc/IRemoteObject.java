package ohos.rpc;

import java.io.FileDescriptor;

public interface IRemoteObject {
  public static final int DUMP_TRANSACTION = 1598311760;
  
  public static final int INTERFACE_TRANSACTION = 1598968902;
  
  public static final int MAX_TRANSACTION_ID = 16777215;
  
  public static final int MIN_TRANSACTION_ID = 1;
  
  public static final int PING_TRANSACTION = 1599098439;
  
  IRemoteBroker queryLocalInterface(String paramString);
  
  boolean sendRequest(int paramInt, MessageParcel paramMessageParcel1, MessageParcel paramMessageParcel2, MessageOption paramMessageOption) throws RemoteException;
  
  boolean addDeathRecipient(DeathRecipient paramDeathRecipient, int paramInt);
  
  boolean removeDeathRecipient(DeathRecipient paramDeathRecipient, int paramInt);
  
  String getInterfaceDescriptor();
  
  void dump(FileDescriptor paramFileDescriptor, String[] paramArrayOfString) throws RemoteException;
  
  void slowPathDump(FileDescriptor paramFileDescriptor, String[] paramArrayOfString) throws RemoteException;
  
  boolean isObjectDead();
  
  public static interface DeathRecipient {
    void onRemoteDied();
  }
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/rpc/IRemoteObject.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */