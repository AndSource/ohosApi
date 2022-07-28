package ohos.aafwk.ability.delegation;

import ohos.aafwk.ability.Ability;

public interface IAbilityMonitor {
  Ability waitForAbility(long paramLong);
  
  Ability waitForAbility();
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/aafwk/ability/delegation/IAbilityMonitor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */