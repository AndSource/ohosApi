package ohos.agp.components;

import ohos.agp.components.ComponentContainer;
import ohos.app.Context;

/* loaded from: ohos2.0.1.95.jar:ohos/agp/components/RadioContainer.class */
public class RadioContainer extends DirectionalLayout {
    protected CheckedStateChangedListener mMarkListener;

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/components/RadioContainer$CheckedStateChangedListener.class */
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

    @Override // ohos.agp.components.DirectionalLayout
    public void setOrientation(int orientation) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.DirectionalLayout, ohos.agp.components.ComponentContainer
    public ComponentContainer.LayoutConfig createLayoutConfig(Context context, AttrSet attrSet) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.DirectionalLayout
    public int getOrientation() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.DirectionalLayout
    public void setTotalWeight(float totalWeight) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.DirectionalLayout
    public float getTotalWeight() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.DirectionalLayout, ohos.agp.components.ComponentContainer, ohos.agp.components.ComponentParent
    public ComponentContainer.LayoutConfig verifyLayoutConfig(ComponentContainer.LayoutConfig config) {
        throw new RuntimeException("Stub!");
    }
}
