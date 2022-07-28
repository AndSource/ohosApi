package ohos.account.app;

import java.util.List;

/* loaded from: ohos2.0.1.95.jar:ohos/account/app/IAppAccountSubscriber.class */
public interface IAppAccountSubscriber {
    void onAccountsChanged(List<AppAccount> list);
}
