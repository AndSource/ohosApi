package ohos.security.keystore;

import java.security.KeyStore;
import java.util.Map;

/* loaded from: ohos3.0.0.1.jar:ohos/security/keystore/KeyStoreProtectionParameter.class */
public class KeyStoreProtectionParameter implements KeyStore.ProtectionParameter {
    KeyStoreProtectionParameter(int secKeyUsagePurposes, Map<Integer, String[]> secKeyCryptoAttrs, int secKeyAccessibleAttr, int secKeyAuthDuration) {
        throw new RuntimeException("Stub!");
    }

    public int getSecKeyUsagePurposes() {
        throw new RuntimeException("Stub!");
    }

    public String[] getSecKeyCryptoAttrs(int type) {
        throw new RuntimeException("Stub!");
    }

    public boolean isKeyAccessible(int flag) {
        throw new RuntimeException("Stub!");
    }

    public int getSecKeyAuthDuration() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/security/keystore/KeyStoreProtectionParameter$Builder.class */
    public static class Builder {
        public Builder(int secKeyUsagePurposes) {
            throw new RuntimeException("Stub!");
        }

        public Builder setSecKeyCryptoAttrs(int type, String... parameters) {
            throw new RuntimeException("Stub!");
        }

        public Builder setSecKeyAccessibleAttr(int secKeyAccessibleAttr) {
            throw new RuntimeException("Stub!");
        }

        public Builder setSecKeyAuthDuration(int secKeyAuthDuration) {
            throw new RuntimeException("Stub!");
        }

        public KeyStoreProtectionParameter createCustomProtection() {
            throw new RuntimeException("Stub!");
        }
    }
}
