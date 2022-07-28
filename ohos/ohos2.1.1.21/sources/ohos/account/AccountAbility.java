package ohos.account;

import java.util.List;

/* loaded from: ohos2.1.1.21.jar:ohos/account/AccountAbility.class */
public class AccountAbility {
    AccountAbility() {
        throw new RuntimeException("Stub!");
    }

    public DistributedInfo queryOsAccountDistributedInfo() {
        throw new RuntimeException("Stub!");
    }

    public boolean isMultiOSAccountEnable() {
        throw new RuntimeException("Stub!");
    }

    public int getOsAccountLocalIdFromUid(int uid) {
        throw new RuntimeException("Stub!");
    }

    public OsAccount queryCurrentOsAccount() {
        throw new RuntimeException("Stub!");
    }

    public boolean isOsAccountConstraintEnable(int localId, String constraint) {
        throw new RuntimeException("Stub!");
    }

    public List<String> getOsAccountAllConstraints(int localId) {
        throw new RuntimeException("Stub!");
    }

    public int getAllCreatedOsAccounts() {
        throw new RuntimeException("Stub!");
    }

    public int getOsAccountLocalIdFromProcess() {
        throw new RuntimeException("Stub!");
    }

    public boolean isOsAccountActive(int localId) {
        throw new RuntimeException("Stub!");
    }

    public boolean isOsAccountKingKong() {
        throw new RuntimeException("Stub!");
    }

    public boolean isOsAccountVerified() {
        throw new RuntimeException("Stub!");
    }

    public boolean isOsAccountVerified(int localId) {
        throw new RuntimeException("Stub!");
    }

    public OsAccountType getOsAccountTypeFromProcess() {
        throw new RuntimeException("Stub!");
    }

    public String getDistributedVirtualDeviceId() {
        throw new RuntimeException("Stub!");
    }

    public static AccountAbility getAccountAbility() {
        throw new RuntimeException("Stub!");
    }
}
