package ohos.biometrics.authentication;

import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import ohos.aafwk.ability.Ability;
import ohos.app.Context;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.0.1.95.jar:ohos/biometrics/authentication/BiometricAuthentication.class */
public class BiometricAuthentication {
    public static final int BA_CHECK_AUTH_TYPE_NOT_SUPPORT = 1;
    public static final int BA_CHECK_DISTRIBUTED_AUTH_NOT_SUPPORT = 3;
    public static final int BA_CHECK_NOT_ENROLLED = 4;
    public static final int BA_CHECK_SECURE_LEVEL_NOT_SUPPORT = 2;
    public static final int BA_CHECK_SUPPORTED = 0;
    public static final int BA_CHECK_UNAVAILABLE = 5;
    public static final int BA_FAILED = -1;
    public static final int BA_SUCCESS = 0;
    public static final int INVALID_BIOMETRIC_ID = -1;

    /* loaded from: ohos2.0.1.95.jar:ohos/biometrics/authentication/BiometricAuthentication$AuthType.class */
    public enum AuthType {
        AUTH_TYPE_BIOMETRIC_ALL,
        AUTH_TYPE_BIOMETRIC_FINGERPRINT_ONLY,
        AUTH_TYPE_BIOMETRIC_FACE_ONLY
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/biometrics/authentication/BiometricAuthentication$SecureLevel.class */
    public enum SecureLevel {
        SECURE_LEVEL_S1,
        SECURE_LEVEL_S2,
        SECURE_LEVEL_S3,
        SECURE_LEVEL_S4
    }

    BiometricAuthentication(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static BiometricAuthentication getInstance(Ability ability) throws IllegalAccessException {
        throw new RuntimeException("Stub!");
    }

    public int checkAuthenticationAvailability(AuthType type, SecureLevel level, boolean isLocalAuth) {
        throw new RuntimeException("Stub!");
    }

    public int execAuthenticationAction(AuthType type, SecureLevel level, boolean isLocalAuth, boolean isAppAuthDialog, SystemAuthDialogInfo information) {
        throw new RuntimeException("Stub!");
    }

    public AuthenticationTips getAuthenticationTips() {
        throw new RuntimeException("Stub!");
    }

    public int cancelAuthenticationAction() {
        throw new RuntimeException("Stub!");
    }

    public void setSecureObjectSignature(Signature sign) {
        throw new RuntimeException("Stub!");
    }

    public Signature getSecureObjectSignature() {
        throw new RuntimeException("Stub!");
    }

    public void setSecureObjectCipher(Cipher cipher) {
        throw new RuntimeException("Stub!");
    }

    public Cipher getSecureObjectCipher() {
        throw new RuntimeException("Stub!");
    }

    public void setSecureObjectMac(Mac mac) {
        throw new RuntimeException("Stub!");
    }

    public Mac getSecureObjectMac() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/biometrics/authentication/BiometricAuthentication$AuthenticationTips.class */
    public static class AuthenticationTips {
        public int errorCode = -1;
        public int tipEvent = 0;
        public String tipInfo = "";
        public int tipValue = 0;

        public AuthenticationTips() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/biometrics/authentication/BiometricAuthentication$SystemAuthDialogInfo.class */
    public static class SystemAuthDialogInfo implements Sequenceable {
        public String authDescription;
        public String authTitle;
        public String customButtonText;

        public SystemAuthDialogInfo() {
            throw new RuntimeException("Stub!");
        }

        @Override // ohos.utils.Sequenceable
        public boolean marshalling(Parcel out) {
            throw new RuntimeException("Stub!");
        }

        @Override // ohos.utils.Sequenceable
        public boolean unmarshalling(Parcel in) {
            throw new RuntimeException("Stub!");
        }
    }
}
