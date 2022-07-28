package ohos.agp.components;

/* loaded from: ohos2.0.1.95.jar:ohos/agp/components/ComponentState.class */
public class ComponentState {
    public static final int COMPONENT_STATE_CHECKED = 64;
    public static final int COMPONENT_STATE_DISABLED = 32;
    public static final int COMPONENT_STATE_EMPTY = 0;
    public static final int COMPONENT_STATE_FOCUSED = 2;
    public static final int COMPONENT_STATE_HOVERED = 268435456;
    public static final int COMPONENT_STATE_PRESSED = 16384;
    public static final int COMPONENT_STATE_SELECTED = 4;

    public ComponentState() {
        throw new RuntimeException("Stub!");
    }

    public static boolean isStateMatched(int stateFlag, int stateMask) {
        throw new RuntimeException("Stub!");
    }
}
