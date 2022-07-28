package ohos.bundleactive;

import java.util.List;
import java.util.Map;
import ohos.app.Context;

/* loaded from: ohos2.2.0.3.jar:ohos/bundleactive/BundleActiveInfosMgr.class */
public final class BundleActiveInfosMgr {
    public static final int BY_ANNUALLY = 0;
    public static final int BY_DAILY = 0;
    public static final int BY_MONTHLY = 0;
    public static final int BY_OPTIMIZED = 0;
    public static final int BY_WEEKLY = 0;
    public static final int USAGE_PRIORITY_GROUP_ALIVE = 0;
    public static final int USAGE_PRIORITY_GROUP_NEVER = 0;
    public static final int USAGE_PRIORITY_GROUP_OFTEN = 0;
    public static final int USAGE_PRIORITY_GROUP_PREFERENCE = 0;
    public static final int USAGE_PRIORITY_GROUP_PRIVILEGE = 0;
    public static final int USAGE_PRIORITY_GROUP_SELDOM = 0;

    BundleActiveInfosMgr(Object adapter) {
        throw new RuntimeException("Stub!");
    }

    public static BundleActiveInfosMgr newInstance(Context context) {
        throw new RuntimeException("Stub!");
    }

    public List<BundleActiveInfos> queryBundleActiveInfosByInterval(int byInterval, long begin, long end) {
        throw new RuntimeException("Stub!");
    }

    public Map<String, BundleActiveInfos> queryBundleActiveInfos(long begin, long end) {
        throw new RuntimeException("Stub!");
    }

    public BundleActiveStates queryBundleActiveStates(long begin, long end) {
        throw new RuntimeException("Stub!");
    }

    public BundleActiveStates queryCurrentBundleActiveStates(long begin, long end) {
        throw new RuntimeException("Stub!");
    }

    public boolean isIdleState(String bundleName) {
        throw new RuntimeException("Stub!");
    }

    public int queryAppUsagePriorityGroup() {
        throw new RuntimeException("Stub!");
    }
}
