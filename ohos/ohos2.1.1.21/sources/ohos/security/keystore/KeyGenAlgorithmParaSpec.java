package ohos.security.keystore;

import java.security.spec.AlgorithmParameterSpec;

/* loaded from: ohos2.1.1.21.jar:ohos/security/keystore/KeyGenAlgorithmParaSpec.class */
public class KeyGenAlgorithmParaSpec implements AlgorithmParameterSpec {
    KeyGenAlgorithmParaSpec(Builder builder) {
        throw new RuntimeException("Stub!");
    }

    public AlgorithmParameterSpec getSecKeyAlgorithmParameterSpec() {
        throw new RuntimeException("Stub!");
    }

    public int getSecKeySizeInBits() {
        throw new RuntimeException("Stub!");
    }

    public String getSecKeyAlias() {
        throw new RuntimeException("Stub!");
    }

    public String[] getSecKeyCryptoAttr(int type) {
        throw new RuntimeException("Stub!");
    }

    public int getSecKeyAuthDuration() {
        throw new RuntimeException("Stub!");
    }

    public int getSecKeyUsagePurposes() {
        throw new RuntimeException("Stub!");
    }

    public boolean isKeyAccessible(int flag) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/security/keystore/KeyGenAlgorithmParaSpec$Builder.class */
    public static class Builder {
        public Builder(String secKeyAlias) {
            throw new RuntimeException("Stub!");
        }

        public Builder addSecKeyCryptoAttr(int secKeyCryptoAttrType, String... attrs) {
            throw new RuntimeException("Stub!");
        }

        public Builder setSecKeyAuthDuration(int secKeyAuthDuration) {
            throw new RuntimeException("Stub!");
        }

        public Builder setSecKeySizeInBits(int secKeySizeInBits) {
            throw new RuntimeException("Stub!");
        }

        public Builder setSecKeyUsagePurposes(int secKeyUsagePurposes) {
            throw new RuntimeException("Stub!");
        }

        public Builder setSecKeyAlgorithmParameterSpec(AlgorithmParameterSpec spec) {
            throw new RuntimeException("Stub!");
        }

        public Builder setSecKeyAccessibleAttr(int secKeyAccessibleAttr) {
            throw new RuntimeException("Stub!");
        }

        public KeyGenAlgorithmParaSpec createKeyGenAlgorithmParaSpec() {
            throw new RuntimeException("Stub!");
        }
    }
}
