package ohos.bluetooth;

import java.util.List;

public interface ProfileBase {
  public static final int A2DP = 3;
  
  public static final int A2DP_SINK = 4;
  
  public static final int CONNECT_STRATEGY_ALLOW = 1;
  
  public static final int CONNECT_STRATEGY_AUTO = 2;
  
  public static final int CONNECT_STRATEGY_DISALLOW = 0;
  
  public static final int CONNECT_STRATEGY_UNKNOWN = -1;
  
  public static final int GATT = 11;
  
  public static final int GATT_SERVER = 12;
  
  public static final int HFP = 1;
  
  public static final int HFP_UNIT = 2;
  
  public static final int MAP_SERVER = 9;
  
  public static final int PBAP_CLIENT = 8;
  
  public static final int PBAP_SERVER = 7;
  
  public static final String PROFILE_PARAM_CUR_STATE = "usual.event.bluetooth.profile.PARAM_CUR_STATE";
  
  public static final String PROFILE_PARAM_PRE_STATE = "usual.event.bluetoothhost.PARAM_PRE_STATE";
  
  public static final int SOCKET_MANAGER = 20;
  
  public static final int STATE_CONNECTED = 2;
  
  public static final int STATE_CONNECTING = 1;
  
  public static final int STATE_DISCONNECTED = 0;
  
  public static final int STATE_DISCONNECTING = 3;
  
  List<BluetoothRemoteDevice> getDevicesByStates(int[] paramArrayOfint);
  
  int getDeviceState(BluetoothRemoteDevice paramBluetoothRemoteDevice);
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/bluetooth/ProfileBase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */