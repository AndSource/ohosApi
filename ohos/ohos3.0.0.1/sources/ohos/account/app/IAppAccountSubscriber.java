package ohos.account.app;

import java.util.List;

/* loaded from: ohos3.0.0.1.jar:ohos/account/app/IAppAccountSubscriber.class */
public interface IAppAccountSubscriber {
    void onAccountsChanged(List<AppAccount> list);
}
