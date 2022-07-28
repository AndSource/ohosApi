package ohos.account.app;

import java.util.List;
import ohos.app.Context;

/* loaded from: ohos2.0.1.95.jar:ohos/account/app/AppAccountAbility.class */
public class AppAccountAbility {
    public AppAccountAbility(Context context) {
        throw new RuntimeException("Stub!");
    }

    public List<AppAccount> getAllAccounts(String owner) {
        throw new RuntimeException("Stub!");
    }

    public boolean subscribeAccountEvent(IAppAccountSubscriber subscriber, List<String> owners) {
        throw new RuntimeException("Stub!");
    }

    public boolean unsubscribeAccountEvent(IAppAccountSubscriber subscriber) {
        throw new RuntimeException("Stub!");
    }

    public boolean addAccount(String name, String extraInfo) {
        throw new RuntimeException("Stub!");
    }

    public boolean deleteAccount(String name) {
        throw new RuntimeException("Stub!");
    }

    public List<AppAccount> getAllAccessibleAccounts() {
        throw new RuntimeException("Stub!");
    }

    public boolean enableAppAccess(String name, String bundleName) {
        throw new RuntimeException("Stub!");
    }

    public boolean disableAppAccess(String name, String bundleName) {
        throw new RuntimeException("Stub!");
    }

    public boolean setAccountExtraInfo(String name, String extraInfo) {
        throw new RuntimeException("Stub!");
    }

    public String getAccountExtraInfo(String name) {
        throw new RuntimeException("Stub!");
    }

    public boolean setAccountCredential(String name, String credentialType, String credential) {
        throw new RuntimeException("Stub!");
    }

    public String getAccountCredential(String name, String credentialType) {
        throw new RuntimeException("Stub!");
    }

    public boolean setAssociatedData(String name, String key, String value) {
        throw new RuntimeException("Stub!");
    }

    public String getAssociatedData(String name, String key) {
        throw new RuntimeException("Stub!");
    }
}
