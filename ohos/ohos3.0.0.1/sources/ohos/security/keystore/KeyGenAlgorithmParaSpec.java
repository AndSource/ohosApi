package ohos.security.keystore;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Date;
import javax.security.auth.x500.X500Principal;

/* loaded from: ohos3.0.0.1.jar:ohos/security/keystore/KeyGenAlgorithmParaSpec.class */
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

    public Date getSelfSignedCertExpireTime() {
        throw new RuntimeException("Stub!");
    }

    public Date getSelfSignedCertInitiateTime() {
        throw new RuntimeException("Stub!");
    }

    public BigInteger getSelfSignedCertSerialNumber() {
        throw new RuntimeException("Stub!");
    }

    public X500Principal getSelfSignedCertSubject() {
        throw new RuntimeException("Stub!");
    }

    public Date getSecretKeyExpireTime() {
        throw new RuntimeException("Stub!");
    }

    public Date getPublicKeyExpireTime() {
        throw new RuntimeException("Stub!");
    }

    public Date getKeyInitiateTime() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/security/keystore/KeyGenAlgorithmParaSpec$Builder.class */
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

        public Builder setSelfSignedCertAttrs(Date expireTime, Date initiateTime, BigInteger serialNumber, X500Principal subject) {
            throw new RuntimeException("Stub!");
        }

        public Builder setKeyExpireTime(Date expireTime) {
            throw new RuntimeException("Stub!");
        }

        public Builder setSecretKeyExpireTime(Date expireTime) {
            throw new RuntimeException("Stub!");
        }

        public Builder setPublicKeyExpireTime(Date expireTime) {
            throw new RuntimeException("Stub!");
        }

        public Builder setKeyInitiateTime(Date initiateTime) {
            throw new RuntimeException("Stub!");
        }

        public KeyGenAlgorithmParaSpec createKeyGenAlgorithmParaSpec() {
            throw new RuntimeException("Stub!");
        }
    }
}
