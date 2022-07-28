package ohos.agp.components;

import ohos.agp.components.ComponentContainer;
import ohos.app.Context;

/* loaded from: ohos2.1.1.21.jar:ohos/agp/components/DirectionalLayout.class */
public class DirectionalLayout extends ComponentContainer {
    public DirectionalLayout(Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public DirectionalLayout(Context context, AttrSet attrSet) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public DirectionalLayout(Context context, AttrSet attrSet, String styleName) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public void setAlignment(int alignment) {
        throw new RuntimeException("Stub!");
    }

    public void setOrientation(int orientation) {
        throw new RuntimeException("Stub!");
    }

    public int getAlignment() {
        throw new RuntimeException("Stub!");
    }

    public int getOrientation() {
        throw new RuntimeException("Stub!");
    }

    public void setTotalWeight(float totalWeight) {
        throw new RuntimeException("Stub!");
    }

    public float getTotalWeight() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.ComponentContainer, ohos.agp.components.ComponentParent
    public ComponentContainer.LayoutConfig verifyLayoutConfig(ComponentContainer.LayoutConfig config) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.ComponentContainer
    public ComponentContainer.LayoutConfig createLayoutConfig(Context context, AttrSet attrSet) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/components/DirectionalLayout$LayoutConfig.class */
    public static class LayoutConfig extends ComponentContainer.LayoutConfig {
        public static final int UNSPECIFIED_ALIGNMENT = -1;
        public static final float UNSPECIFIED_WEIGHT = 0.0f;
        public int alignment = -1;
        public float weight = 0.0f;

        public LayoutConfig() {
            throw new RuntimeException("Stub!");
        }

        public LayoutConfig(Context context, AttrSet attrSet) {
            throw new RuntimeException("Stub!");
        }

        public LayoutConfig(int width, int height) {
            throw new RuntimeException("Stub!");
        }

        public LayoutConfig(int width, int height, int alignment, float weight) {
            throw new RuntimeException("Stub!");
        }

        public LayoutConfig(ComponentContainer.LayoutConfig source) {
            throw new RuntimeException("Stub!");
        }

        public LayoutConfig(LayoutConfig source) {
            throw new RuntimeException("Stub!");
        }
    }
}
