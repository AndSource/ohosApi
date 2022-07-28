package ohos.hiviewdfx;

import ohos.hiviewdfx.HiChecker;

/* loaded from: ohos2.2.0.3.jar:ohos/hiviewdfx/Caution.class */
public final class Caution extends Throwable {
    protected Caution(HiChecker.Rule rule, String customMessage) {
        throw new RuntimeException("Stub!");
    }

    protected Caution(HiChecker.Rule rule, String customMessage, Throwable cause) {
        throw new RuntimeException("Stub!");
    }

    public HiChecker.Rule getTriggerRule() {
        throw new RuntimeException("Stub!");
    }

    public String getCustomMessage() {
        throw new RuntimeException("Stub!");
    }
}
