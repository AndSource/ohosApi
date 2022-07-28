package ohos.media.sessioncore;

import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;
import ohos.media.common.sessioncore.AVBrowserResult;
import ohos.media.common.sessioncore.AVBrowserRoot;
import ohos.media.common.sessioncore.AVCallerUserInfo;
import ohos.media.common.sessioncore.AVToken;
import ohos.utils.PacMap;

/* loaded from: ohos2.0.1.95.jar:ohos/media/sessioncore/AVBrowserService.class */
public abstract class AVBrowserService extends Ability {
    public static final String SERVICE_ACTION = "action.media.browse.AVBrowserService";

    public abstract AVBrowserRoot onGetRoot(String str, int i, PacMap pacMap);

    public abstract void onLoadAVElementList(String str, AVBrowserResult aVBrowserResult);

    public abstract void onLoadAVElementList(String str, AVBrowserResult aVBrowserResult, PacMap pacMap);

    public abstract void onLoadAVElement(String str, AVBrowserResult aVBrowserResult);

    public AVBrowserService() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.Ability
    protected void onStart(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    public AVToken getAVToken() {
        throw new RuntimeException("Stub!");
    }

    public void setAVToken(AVToken token) {
        throw new RuntimeException("Stub!");
    }

    public final PacMap getBrowserOptions() {
        throw new RuntimeException("Stub!");
    }

    public final AVCallerUserInfo getCallerUserInfo() {
        throw new RuntimeException("Stub!");
    }

    public void notifyAVElementListUpdated(String parentMediaId) {
        throw new RuntimeException("Stub!");
    }

    public void notifyAVElementListUpdated(String parentMediaId, PacMap options) {
        throw new RuntimeException("Stub!");
    }
}
