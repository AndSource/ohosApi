package ohos.aafwk.ability;

/* loaded from: ohos3.0.0.1.jar:ohos/aafwk/ability/AbilityLifecycleExecutor.class */
public class AbilityLifecycleExecutor {
    public AbilityLifecycleExecutor() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/aafwk/ability/AbilityLifecycleExecutor$LifecycleState.class */
    public enum LifecycleState {
        UNINITIALIZED,
        INITIAL,
        INACTIVE,
        ACTIVE,
        BACKGROUND;

        public int getValue() {
            throw new RuntimeException("Stub!");
        }

        public static LifecycleState intToEnum(int state) {
            throw new RuntimeException("Stub!");
        }
    }
}
