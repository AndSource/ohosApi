package ohos.agp.window.dialog;

import ohos.agp.components.Component;
import ohos.agp.components.DirectionalLayout;
import ohos.app.Context;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/window/dialog/ToastDialog.class */
public class ToastDialog extends CommonDialog {
    public ToastDialog(Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public ToastDialog setText(String textContent) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public ToastDialog setComponent(DirectionalLayout component) {
        throw new RuntimeException("Stub!");
    }

    public ToastDialog setComponent(Component component) {
        throw new RuntimeException("Stub!");
    }

    public Component getComponent() {
        throw new RuntimeException("Stub!");
    }

    public void cancel() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.window.dialog.BaseDialog
    public ToastDialog setAlignment(int gravity) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.window.dialog.BaseDialog
    public ToastDialog setOffset(int offsetX, int offsetY) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.window.dialog.BaseDialog
    public ToastDialog setSize(int width, int height) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.window.dialog.BaseDialog
    public ToastDialog setAutoClosable(boolean closable) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.window.dialog.BaseDialog
    public ToastDialog setDuration(int ms) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.window.dialog.BaseDialog, ohos.agp.window.dialog.IDialog
    public void show() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.window.dialog.CommonDialog, ohos.agp.window.dialog.BaseDialog
    protected void onCreate() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.window.dialog.CommonDialog, ohos.agp.window.dialog.BaseDialog
    protected void onShow() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.window.dialog.BaseDialog, ohos.agp.window.dialog.IDialog
    public void destroy() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.window.dialog.BaseDialog, ohos.agp.window.dialog.IDialog
    public void hide() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.window.dialog.CommonDialog, ohos.agp.window.dialog.BaseDialog
    protected void onDestroy() {
        throw new RuntimeException("Stub!");
    }
}
