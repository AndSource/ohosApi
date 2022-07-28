package ohos.agp.window.dialog;

import ohos.agp.components.Component;
import ohos.app.Context;

/* loaded from: ohos2.0.1.95.jar:ohos/agp/window/dialog/BaseDialog.class */
public class BaseDialog implements IDialog {

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/window/dialog/BaseDialog$DialogListener.class */
    public interface DialogListener {
        boolean isTouchOutside();
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/window/dialog/BaseDialog$DisplayCallback.class */
    public interface DisplayCallback {
        void onDisplay(IDialog iDialog);
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/window/dialog/BaseDialog$RemoveCallback.class */
    public interface RemoveCallback {
        void onRemove(IDialog iDialog);
    }

    public BaseDialog(Context context) {
        throw new RuntimeException("Stub!");
    }

    public BaseDialog(Context context, int flag) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.window.dialog.IDialog
    public void show() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.window.dialog.IDialog
    public void hide() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.window.dialog.IDialog
    public void destroy() {
        throw new RuntimeException("Stub!");
    }

    public boolean isShowing() {
        throw new RuntimeException("Stub!");
    }

    public BaseDialog setTransparent(boolean isEnable) {
        throw new RuntimeException("Stub!");
    }

    public BaseDialog setCornerRadius(float radius) {
        throw new RuntimeException("Stub!");
    }

    public BaseDialog setAutoClosable(boolean closable) {
        throw new RuntimeException("Stub!");
    }

    public BaseDialog setDuration(int ms) {
        throw new RuntimeException("Stub!");
    }

    public BaseDialog setSize(int width, int height) {
        throw new RuntimeException("Stub!");
    }

    public BaseDialog setAlignment(int alignment) {
        throw new RuntimeException("Stub!");
    }

    public BaseDialog setOffset(int offsetX, int offsetY) {
        throw new RuntimeException("Stub!");
    }

    public void setDialogListener(DialogListener listener) {
        throw new RuntimeException("Stub!");
    }

    protected void create() {
        throw new RuntimeException("Stub!");
    }

    protected void onCreate() {
        throw new RuntimeException("Stub!");
    }

    protected void onShow() {
        throw new RuntimeException("Stub!");
    }

    protected void onHide() {
        throw new RuntimeException("Stub!");
    }

    protected void onDestroy() {
        throw new RuntimeException("Stub!");
    }

    protected void onShowing() {
        throw new RuntimeException("Stub!");
    }

    public void registerRemoveCallback(RemoveCallback callback) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.window.dialog.IDialog
    public void remove() {
        throw new RuntimeException("Stub!");
    }

    public void registerDisplayCallback(DisplayCallback callback) {
        throw new RuntimeException("Stub!");
    }

    public Component searchComponentViaId(int id) {
        throw new RuntimeException("Stub!");
    }

    public final Component obtainComponentViaId(int id) {
        throw new RuntimeException("Stub!");
    }
}
