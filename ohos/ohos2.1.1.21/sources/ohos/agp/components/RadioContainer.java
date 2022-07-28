package ohos.agp.components;

import ohos.app.Context;

/* loaded from: ohos2.1.1.21.jar:ohos/agp/components/RadioContainer.class */
public class RadioContainer extends DirectionalLayout {
    public static final int INVALID_ID = -1;
    protected CheckedStateChangedListener mMarkListener;

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/components/RadioContainer$CheckedStateChangedListener.class */
    public interface CheckedStateChangedListener {
        void onCheckedChanged(RadioContainer radioContainer, int i);
    }

    public RadioContainer(Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public RadioContainer(Context context, AttrSet attrSet) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public RadioContainer(Context context, AttrSet attrSet, String styleName) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public void mark(int id) {
        throw new RuntimeException("Stub!");
    }

    public int getMarkedButtonId() {
        throw new RuntimeException("Stub!");
    }

    public void cancelMarks() {
        throw new RuntimeException("Stub!");
    }

    public void setMarkChangedListener(CheckedStateChangedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public CheckedStateChangedListener getMarkChangedListener() {
        throw new RuntimeException("Stub!");
    }
}
