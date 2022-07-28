package ohos.security.seckeychain;

import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import ohos.aafwk.content.Intent;
import ohos.app.AbilityContext;
import ohos.utils.net.Uri;

/* loaded from: ohos2.2.0.3.jar:ohos/security/seckeychain/SecKeyChain.class */
public class SecKeyChain {
    public static final String SPEC_ALIAS = "name";
    public static final String SPEC_CERTIFICATE = "CERT";
    public static final String SPEC_PKCS12 = "PKCS12";

    public SecKeyChain() {
        throw new RuntimeException("Stub!");
    }

    public static void selectSecPrivateKey(AbilityContext ability, String[] secKeyTypes, Principal[] issuers, String host, int port, SecKeyAliasCallback callback, String secKeyAlias) {
        throw new RuntimeException("Stub!");
    }

    public static void selectSecPrivateKey(AbilityContext ability, String[] secKeyTypes, Principal[] issuers, Uri uri, SecKeyAliasCallback callback, String secKeyAlias) {
        throw new RuntimeException("Stub!");
    }

    public static Intent getInstallationIntent() {
        throw new RuntimeException("Stub!");
    }

    public static X509Certificate[] getSecCertificateChain(AbilityContext context, String secKeyAlias) throws InterruptedException, SecKeyChainException {
        throw new RuntimeException("Stub!");
    }

    public static PrivateKey getSecPrivateKey(AbilityContext context, String secKeyAlias) throws InterruptedException, SecKeyChainException {
        throw new RuntimeException("Stub!");
    }

    public static boolean isSupported(String secKeyAlgorithm) {
        throw new RuntimeException("Stub!");
    }
}
