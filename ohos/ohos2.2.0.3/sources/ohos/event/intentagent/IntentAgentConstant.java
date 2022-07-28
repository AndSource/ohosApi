package ohos.event.intentagent;

/* loaded from: ohos2.2.0.3.jar:ohos/event/intentagent/IntentAgentConstant.class */
public final class IntentAgentConstant {

    /* loaded from: ohos2.2.0.3.jar:ohos/event/intentagent/IntentAgentConstant$Flags.class */
    public enum Flags {
        ONE_TIME_FLAG,
        NO_BUILD_FLAG,
        CANCEL_PRESENT_FLAG,
        UPDATE_PRESENT_FLAG,
        CONSTANT_FLAG,
        REPLACE_ELEMENT,
        REPLACE_ACTION,
        REPLACE_URI,
        REPLACE_ENTITIES,
        REPLACE_BUNDLE
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/event/intentagent/IntentAgentConstant$OperationType.class */
    public enum OperationType {
        UNKNOWN_TYPE,
        START_ABILITY,
        START_ABILITIES,
        START_SERVICE,
        SEND_COMMON_EVENT,
        START_FOREGROUND_SERVICE
    }

    IntentAgentConstant() {
        throw new RuntimeException("Stub!");
    }
}
