package ohos.account.app;

import java.util.List;

/* loaded from: ohos2.1.1.21.jar:ohos/account/app/IAppAccountSubscriber.class */
public interface IAppAccountSubscriber {
    void onAccountsChanged(List<AppAccount> list);
}
