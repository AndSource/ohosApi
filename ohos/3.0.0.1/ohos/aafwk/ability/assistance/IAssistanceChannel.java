package ohos.aafwk.ability.assistance;

public interface IAssistanceChannel {
  void onConnected(AbilityAgent paramAbilityAgent);
  
  void onConnectFailed(int paramInt);
  
  void onDisconnected(int paramInt);
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/aafwk/ability/assistance/IAssistanceChannel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */