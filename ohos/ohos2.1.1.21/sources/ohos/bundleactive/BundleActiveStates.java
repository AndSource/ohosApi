package ohos.bundleactive;

/* loaded from: ohos2.1.1.21.jar:ohos/bundleactive/BundleActiveStates.class */
public final class BundleActiveStates {
    BundleActiveStates(Object adapter) {
        throw new RuntimeException("Stub!");
    }

    public boolean hasNextState() {
        throw new RuntimeException("Stub!");
    }

    public boolean queryNextState(State stateOut) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/bundleactive/BundleActiveStates$State.class */
    public static final class State {
        public static final int STATE_TYPE_ABILITY_ENDED = 0;
        public static final int STATE_TYPE_ABILITY_PAUSED = 0;
        public static final int STATE_TYPE_ABILITY_RESUMED = 0;
        public static final int STATE_TYPE_CALL_LINK = 0;
        public static final int STATE_TYPE_FOREGROUND_ABILITY_BEGIN = 0;
        public static final int STATE_TYPE_FOREGROUND_ABILITY_END = 0;
        public static final int STATE_TYPE_HAS_INTERACTED = 0;
        public static final int STATE_TYPE_PROFILE_MODIFIED = 0;
        public static final int STATE_TYPE_UNKNOW = 0;
        public static final int STATE_TYPE_USAGE_PRIORITY_GROUP_MODIFIED = 0;

        public State() {
            throw new RuntimeException("Stub!");
        }

        public int queryAppUsagePriorityGroup() {
            throw new RuntimeException("Stub!");
        }

        public String queryNameOfClass() {
            throw new RuntimeException("Stub!");
        }

        public int queryStateType() {
            throw new RuntimeException("Stub!");
        }

        public String queryBundleName() {
            throw new RuntimeException("Stub!");
        }

        public String queryIndexOfLink() {
            throw new RuntimeException("Stub!");
        }

        public long queryStateOccurredMs() {
            throw new RuntimeException("Stub!");
        }
    }
}
