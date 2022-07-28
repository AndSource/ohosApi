package ohos.ace.ability;

/* loaded from: ohos2.1.1.21.jar:ohos/ace/ability/LocalParticleAbility.class */
public interface LocalParticleAbility {

    /* loaded from: ohos2.1.1.21.jar:ohos/ace/ability/LocalParticleAbility$Callback.class */
    public interface Callback {
        void reply(Object obj);
    }

    default void register(AceAbility ability) {
        throw new RuntimeException("Stub!");
    }

    default void deregister(AceAbility ability) {
        throw new RuntimeException("Stub!");
    }
}
