package ohos.ai.cv.common;

import ohos.utils.PacMap;

/* loaded from: ohos2.1.1.21.jar:ohos/ai/cv/common/VisionConfiguration.class */
public class VisionConfiguration {
    public static final int APP_QUICK = 0;
    public static final int APP_TRADITIONAL = 1;
    public static final int MODE_IN = 0;
    public static final int MODE_OUT = 1;
    public static final int STATE_BACKGROUND = 1;
    public static final int STATE_FOREGROUND = 0;
    protected String clientPkgName;
    protected String clientVersion;
    protected int appType = 1;
    protected int clientState = 1;
    protected int processMode = 1;

    protected VisionConfiguration(Builder<?> builder) {
        throw new RuntimeException("Stub!");
    }

    public int getProcessMode() {
        throw new RuntimeException("Stub!");
    }

    public PacMap getParam() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/ai/cv/common/VisionConfiguration$Builder.class */
    public static abstract class Builder<T extends Builder<T>> {
        public Builder() {
            throw new RuntimeException("Stub!");
        }

        public T setAppType(int type) {
            throw new RuntimeException("Stub!");
        }

        public T setClientPkgName(String pkgName) {
            throw new RuntimeException("Stub!");
        }

        public T setClientVersion(String version) {
            throw new RuntimeException("Stub!");
        }

        public T setClientState(int state) {
            throw new RuntimeException("Stub!");
        }

        public T setProcessMode(int mode) {
            throw new RuntimeException("Stub!");
        }
    }
}
