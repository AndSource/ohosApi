package ohos.security.keystore;

import java.security.spec.KeySpec;
import java.util.Map;

/* loaded from: ohos2.2.0.3.jar:ohos/security/keystore/KeyStoreKeySpec.class */
public class KeyStoreKeySpec implements KeySpec {
    KeyStoreKeySpec(String secKeyAlias, int secKeySource, int secKeySizeInBits, int secKeyUsagePurposes, Map<Integer, String[]> secKeyCryptoAttrs) {
        throw new RuntimeException("Stub!");
    }

    public String getSecKeyAlias() {
        throw new RuntimeException("Stub!");
    }

    public int getSecKeySource() {
        throw new RuntimeException("Stub!");
    }

    public int getSecKeyUsagePurposes() {
        throw new RuntimeException("Stub!");
    }

    public int getSecKeySizeInBits() {
        throw new RuntimeException("Stub!");
    }

    public String[] getKeyCryptoAttr(int type) {
        throw new RuntimeException("Stub!");
    }

    public int getSecKeyAuthDuration() {
        throw new RuntimeException("Stub!");
    }

    public boolean isKeyAccessible(int flag) {
        throw new RuntimeException("Stub!");
    }
}
