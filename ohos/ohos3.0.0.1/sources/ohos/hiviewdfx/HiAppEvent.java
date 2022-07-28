package ohos.hiviewdfx;

import java.util.Map;

/* loaded from: ohos3.0.0.1.jar:ohos/hiviewdfx/HiAppEvent.class */
public class HiAppEvent {
    public static final String DISABLE = "disable";
    public static final String MAX_STORAGE = "max_storage";

    public HiAppEvent() {
        throw new RuntimeException("Stub!");
    }

    public static int write(String eventName, EventType type, Object... keyValues) {
        throw new RuntimeException("Stub!");
    }

    public static int write(String eventName, EventType type, Map<String, Object> keyValues) {
        throw new RuntimeException("Stub!");
    }

    public static boolean configure(String name, String value) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/hiviewdfx/HiAppEvent$Event.class */
    public class Event {
        public static final String DISTRIBUTED_SERVICE_START = "hiappevent.distributed_service_start";
        public static final String USER_LOGIN = "hiappevent.user_login";
        public static final String USER_LOGOUT = "hiappevent.user_logout";

        Event() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/hiviewdfx/HiAppEvent$EventType.class */
    public enum EventType {
        FAULT,
        STATISTIC,
        SECURITY,
        BEHAVIOR;

        protected int type() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/hiviewdfx/HiAppEvent$Param.class */
    public class Param {
        public static final String DISTRIBUTED_SERVICE_INSTANCE_ID = "ds_instance_id";
        public static final String DISTRIBUTED_SERVICE_NAME = "ds_name";
        public static final String USER_ID = "user_id";

        Param() {
            throw new RuntimeException("Stub!");
        }
    }
}
