package ohos.aafwk.ability.delegation;

import java.util.Map;

public interface IAbilityDelegatorArgs {
  Map<String, Object> getTestParameters();
  
  ClassLoader getTestClassLoader();
  
  String getTestCaseNames();
  
  String getTestRunnerClassName();
  
  String getTestBundleName();
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/aafwk/ability/delegation/IAbilityDelegatorArgs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */