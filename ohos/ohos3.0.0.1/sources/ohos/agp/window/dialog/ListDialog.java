package ohos.agp.window.dialog;

import ohos.agp.components.BaseItemProvider;
import ohos.agp.components.Component;
import ohos.agp.components.ListContainer;
import ohos.agp.window.dialog.IDialog;
import ohos.app.Context;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/window/dialog/ListDialog.class */
public class ListDialog extends CommonDialog {
    public static final int MULTI = 103;
    public static final int NORMAL = 101;
    public static final int SINGLE = 102;

    public ListDialog(Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public ListDialog(Context context, int type) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public void setOnSingleSelectListener(IDialog.ClickedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void setOnMultiSelectListener(IDialog.CheckBoxClickedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public ListDialog addItem(String item) {
        throw new RuntimeException("Stub!");
    }

    public ListDialog removeItem(String item) {
        throw new RuntimeException("Stub!");
    }

    public ListDialog setItems(String[] items) {
        throw new RuntimeException("Stub!");
    }

    public ListDialog setSingleSelectItems(String[] items, int selectedId) {
        throw new RuntimeException("Stub!");
    }

    public ListDialog setMultiSelectItems(String[] items, boolean[] selectedItems) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.window.dialog.CommonDialog, ohos.agp.window.dialog.BaseDialog
    protected void onShow() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.window.dialog.BaseDialog, ohos.agp.window.dialog.IDialog
    public void show() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.window.dialog.BaseDialog, ohos.agp.window.dialog.IDialog
    public void destroy() {
        throw new RuntimeException("Stub!");
    }

    public void setProvider(BaseItemProvider provider) {
        throw new RuntimeException("Stub!");
    }

    public void setListener(ListContainer.ItemClickedListener clickListener, ListContainer.ItemLongClickedListener longClickListener, ListContainer.ItemSelectedListener selectedListener) {
        throw new RuntimeException("Stub!");
    }

    public void setBackColor(int color) {
        throw new RuntimeException("Stub!");
    }

    public BaseItemProvider getProvider() {
        throw new RuntimeException("Stub!");
    }

    public Component getItemComponent(int position) {
        throw new RuntimeException("Stub!");
    }

    public int getComponentLocation(Component component) {
        throw new RuntimeException("Stub!");
    }

    public Component getListContainer() {
        throw new RuntimeException("Stub!");
    }
}
