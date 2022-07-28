package ohos.aafwk.ability.delegation;

import java.util.Map;

/* loaded from: ohos2.2.0.3.jar:ohos/aafwk/ability/delegation/IAbilityDelegatorArgs.class */
public interface IAbilityDelegatorArgs {
    Map<String, Object> getTestParameters();

    ClassLoader getTestClassLoader();

    String getTestCaseNames();

    String getTestRunnerClassName();

    String getTestBundleName();
}
