package ohos.agp.window.dialog;

import ohos.agp.components.DirectionalLayout;
import ohos.app.Context;

/* loaded from: ohos2.2.0.3.jar:ohos/agp/window/dialog/DisplayDialog.class */
public class DisplayDialog extends BaseDialog {
    public DisplayDialog(Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public void setContentComponent(DirectionalLayout component) {
        throw new RuntimeException("Stub!");
    }

    public void showOnRemoteScreen(DialogProvider remoteScreen) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/agp/window/dialog/DisplayDialog$DialogProvider.class */
    public static class DialogProvider {
        public int densityDpi;
        public int height;
        public String ip;
        public int port;
        public int width;

        public DialogProvider(String ip, int port, int width, int height, int densityDpi) {
            throw new RuntimeException("Stub!");
        }
    }
}
