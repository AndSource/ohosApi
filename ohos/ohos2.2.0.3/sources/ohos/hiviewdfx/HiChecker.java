package ohos.hiviewdfx;

import java.util.EnumSet;
import java.util.concurrent.Executor;

/* loaded from: ohos2.2.0.3.jar:ohos/hiviewdfx/HiChecker.class */
public class HiChecker {

    /* loaded from: ohos2.2.0.3.jar:ohos/hiviewdfx/HiChecker$OnCautionListener.class */
    public interface OnCautionListener {
        void onCautionFound(Caution caution);
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/hiviewdfx/HiChecker$Rule.class */
    public enum Rule {
        CAUTION_BY_LOG,
        CAUTION_BY_CRASH,
        CHECK_FILE_READ,
        CHECK_FILE_WRITE,
        CHECK_NETWORK_ACCESS,
        CHECK_SLOW_PROCESS,
        CHECK_VM_RELEASE_MISS
    }

    HiChecker() {
        throw new RuntimeException("Stub!");
    }

    public static void addRule(EnumSet<Rule> rules) {
        throw new RuntimeException("Stub!");
    }

    public static void addRule(Rule rule) {
        throw new RuntimeException("Stub!");
    }

    public static void addDefaultRules() {
        throw new RuntimeException("Stub!");
    }

    public static void addAllRules() {
        throw new RuntimeException("Stub!");
    }

    public static void removeRule(EnumSet<Rule> rules) {
        throw new RuntimeException("Stub!");
    }

    public static void removeRule(Rule rule) {
        throw new RuntimeException("Stub!");
    }

    public static void removeAllRules() {
        throw new RuntimeException("Stub!");
    }

    public static EnumSet<Rule> getRule() {
        throw new RuntimeException("Stub!");
    }

    public static boolean contains(Rule rule) {
        throw new RuntimeException("Stub!");
    }

    public static EnumSet<Rule> removeCheckFileWriteRule() {
        throw new RuntimeException("Stub!");
    }

    public static EnumSet<Rule> removeCheckFileReadRule() {
        throw new RuntimeException("Stub!");
    }

    public static void notifySlowProcess(String tag) {
        throw new RuntimeException("Stub!");
    }

    public static void setCautionListener(Executor executor, OnCautionListener listener) {
        throw new RuntimeException("Stub!");
    }
}
