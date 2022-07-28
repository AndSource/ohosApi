package ohos.agp.window.dialog;

import ohos.multimodalinput.event.KeyEvent;

/* loaded from: ohos2.0.1.95.jar:ohos/agp/window/dialog/IDialog.class */
public interface IDialog {
    public static final int BUTTON1 = 0;
    public static final int BUTTON2 = 1;
    public static final int BUTTON3 = 2;
    public static final int BUTTON_NUM = 3;
    public static final int DEF_RADIUS = 15;
    public static final int ICON1 = 0;
    public static final int ICON2 = 1;
    public static final int ICON3 = 2;
    public static final int ICON_NUM = 3;

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/window/dialog/IDialog$CheckBoxClickedListener.class */
    public interface CheckBoxClickedListener {
        void onClick(IDialog iDialog, int i, boolean z);
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/window/dialog/IDialog$ClickedListener.class */
    public interface ClickedListener {
        void onClick(IDialog iDialog, int i);
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/window/dialog/IDialog$ItemClickedListener.class */
    public interface ItemClickedListener {
        void onClick(IDialog iDialog, int i);
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/window/dialog/IDialog$KeyboardCallback.class */
    public interface KeyboardCallback {
        boolean clickKey(IDialog iDialog, KeyEvent keyEvent);
    }

    void show();

    void hide();

    void destroy();

    void remove();
}
