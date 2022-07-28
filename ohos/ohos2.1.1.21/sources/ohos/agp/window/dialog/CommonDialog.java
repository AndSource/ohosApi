package ohos.agp.window.dialog;

import ohos.agp.components.Component;
import ohos.agp.components.DirectionalLayout;
import ohos.agp.utils.Rect;
import ohos.agp.window.dialog.IDialog;
import ohos.agp.window.service.Window;
import ohos.agp.window.service.WindowManager;
import ohos.app.Context;
import ohos.multimodalinput.event.KeyEvent;
import ohos.multimodalinput.event.TouchEvent;

/* loaded from: ohos2.1.1.21.jar:ohos/agp/window/dialog/CommonDialog.class */
public class CommonDialog extends BaseDialog {

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/window/dialog/CommonDialog$DestroyedListener.class */
    public interface DestroyedListener {
        void onDestroy();
    }

    public CommonDialog(Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.window.dialog.BaseDialog
    protected void create() {
        throw new RuntimeException("Stub!");
    }

    protected void onWindowConfigUpdated(WindowManager.LayoutConfig configParam) {
        throw new RuntimeException("Stub!");
    }

    protected void onWindowSelectionUpdated(boolean isSelectionUpdated) {
        throw new RuntimeException("Stub!");
    }

    public boolean isMovable() {
        throw new RuntimeException("Stub!");
    }

    public void setMovable(boolean movable) {
        throw new RuntimeException("Stub!");
    }

    public Rect getBoundRect() {
        throw new RuntimeException("Stub!");
    }

    public void setBoundRect(Rect boundRect) {
        throw new RuntimeException("Stub!");
    }

    public CommonDialog setTitleIcon(int resId, int iconId) {
        throw new RuntimeException("Stub!");
    }

    public CommonDialog setTitleText(String text) {
        throw new RuntimeException("Stub!");
    }

    public CommonDialog setTitleSubText(String text) {
        throw new RuntimeException("Stub!");
    }

    public CommonDialog setTitleCustomComponent(DirectionalLayout component) {
        throw new RuntimeException("Stub!");
    }

    public CommonDialog setContentImage(int resId) {
        throw new RuntimeException("Stub!");
    }

    public CommonDialog setContentText(String text) {
        throw new RuntimeException("Stub!");
    }

    public CommonDialog setContentCustomComponent(Component component) {
        throw new RuntimeException("Stub!");
    }

    public Component getContentCustomComponent() {
        throw new RuntimeException("Stub!");
    }

    public Component getButtonComponent() {
        throw new RuntimeException("Stub!");
    }

    public Window getWindow() {
        throw new RuntimeException("Stub!");
    }

    public CommonDialog setButton(int buttonNum, String text, IDialog.ClickedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public CommonDialog setImageButton(int buttonNum, int resId, IDialog.ClickedListener listener) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.window.dialog.BaseDialog
    protected void onCreate() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.window.dialog.BaseDialog
    protected void onShow() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.window.dialog.BaseDialog
    protected void onDestroy() {
        throw new RuntimeException("Stub!");
    }

    public void setDestroyedListener(DestroyedListener destroyedListener) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSwipeToDismiss(boolean isEnabled) {
        throw new RuntimeException("Stub!");
    }

    public boolean deliverKeyboardCase(KeyEvent event) {
        throw new RuntimeException("Stub!");
    }

    public boolean clickKeyDown(KeyEvent event) {
        throw new RuntimeException("Stub!");
    }

    public boolean clickKeyUp(KeyEvent event) {
        throw new RuntimeException("Stub!");
    }

    public boolean deliverTouchCase(TouchEvent event) {
        throw new RuntimeException("Stub!");
    }

    public boolean dealTouchEvent(TouchEvent event) {
        throw new RuntimeException("Stub!");
    }

    public void siteKeyboardCallback(IDialog.KeyboardCallback keyboardCallback) {
        throw new RuntimeException("Stub!");
    }

    public void siteRemovable(boolean removable) {
        throw new RuntimeException("Stub!");
    }

    public void dealBackKeyDown() {
        throw new RuntimeException("Stub!");
    }
}
