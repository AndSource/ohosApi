package ohos.aafwk.ability.assistance;

/* loaded from: ohos3.0.0.1.jar:ohos/aafwk/ability/assistance/IAssistanceChannel.class */
public interface IAssistanceChannel {
    void onConnected(AbilityAgent abilityAgent);

    void onConnectFailed(int i);

    void onDisconnected(int i);
}
