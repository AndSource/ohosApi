package ohos.aafwk.ability;

import ohos.utils.PacMap;

public interface AbilityLifecycleCallbacks {
  void onAbilityStart(Ability paramAbility);
  
  void onAbilityActive(Ability paramAbility);
  
  void onAbilityInactive(Ability paramAbility);
  
  void onAbilityForeground(Ability paramAbility);
  
  void onAbilityBackground(Ability paramAbility);
  
  void onAbilityStop(Ability paramAbility);
  
  void onAbilitySaveState(PacMap paramPacMap);
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/aafwk/ability/AbilityLifecycleCallbacks.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */