package ohos.aafwk.ability.continuation;

public interface IContinuationRegisterManager {
  void register(String paramString, ExtraParams paramExtraParams, IContinuationDeviceCallback paramIContinuationDeviceCallback, RequestCallback paramRequestCallback);
  
  void unregister(int paramInt, RequestCallback paramRequestCallback);
  
  void updateConnectStatus(int paramInt1, String paramString, int paramInt2, RequestCallback paramRequestCallback);
  
  void showDeviceList(int paramInt, ExtraParams paramExtraParams, RequestCallback paramRequestCallback);
  
  void disconnect();
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/aafwk/ability/continuation/IContinuationRegisterManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */