package ohos.aafwk.ability;

import ohos.utils.PacMap;

/* loaded from: ohos3.0.0.1.jar:ohos/aafwk/ability/AbilityLifecycleCallbacks.class */
public interface AbilityLifecycleCallbacks {
    void onAbilityStart(Ability ability);

    void onAbilityActive(Ability ability);

    void onAbilityInactive(Ability ability);

    void onAbilityForeground(Ability ability);

    void onAbilityBackground(Ability ability);

    void onAbilityStop(Ability ability);

    void onAbilitySaveState(PacMap pacMap);
}
