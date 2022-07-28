package ohos.aafwk.ability;

import ohos.aafwk.content.Intent;

/* loaded from: ohos2.2.0.3.jar:ohos/aafwk/ability/IntentAbility.class */
public abstract class IntentAbility extends Ability {
    protected abstract void onProcessIntent(Intent intent);

    public IntentAbility(String name) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    protected void onStart(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    @Deprecated
    protected void onCommand(Intent intent, boolean restart) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    protected void onCommand(Intent intent, boolean restart, int startId) {
        throw new RuntimeException("Stub!");
    }
}
