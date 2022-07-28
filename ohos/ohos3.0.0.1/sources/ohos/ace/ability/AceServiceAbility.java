package ohos.ace.ability;

import java.util.Map;
import ohos.aafwk.ability.FormState;
import ohos.aafwk.ability.ProviderFormInfo;
import ohos.aafwk.content.Intent;
import ohos.rpc.IRemoteObject;

/* loaded from: ohos3.0.0.1.jar:ohos/ace/ability/AceServiceAbility.class */
public class AceServiceAbility extends AceAbility {
    public AceServiceAbility() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    protected void onUnloadForm() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.ace.ability.AceAbility, ohos.aafwk.ability.Ability
    public void onStart(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.ace.ability.AceAbility, ohos.aafwk.ability.Ability
    public void onStop() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    protected void onCommand(Intent intent, boolean restart, int startId) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    protected IRemoteObject onConnect(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    protected void onDisconnect(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    public void onReconnect(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.ace.ability.AceAbility
    public void setInstanceName(String name) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    protected ProviderFormInfo onCreateForm(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    protected void onUpdateForm(long formId) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    protected void onDeleteForm(long formId) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    protected void onCastTempForm(long formId) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    protected void onTriggerFormEvent(long formId, String message) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    protected void onEventNotify(Map<Long, Integer> formEvents) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    protected FormState onAcquireFormState(Intent intent) {
        throw new RuntimeException("Stub!");
    }
}
