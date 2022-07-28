package ohos.agp.components;

import ohos.agp.components.ComponentContainer;
import ohos.app.Context;

/* loaded from: ohos2.2.0.3.jar:ohos/agp/components/MagicLayout.class */
public class MagicLayout extends ComponentContainer {
    public static final int FOLD_OBVERSE = 0;
    public static final int FOLD_REVERSE = 1;

    public MagicLayout(Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public MagicLayout(Context context, AttrSet attrSet) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public MagicLayout(Context context, AttrSet attrSet, String styleName) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public void setAlignment(int alignment) {
        throw new RuntimeException("Stub!");
    }

    public void setOrientation(int orientation) {
        throw new RuntimeException("Stub!");
    }

    public void setFoldEnabled(boolean isFoldEnabled) {
        throw new RuntimeException("Stub!");
    }

    public void setFoldDirection(int foldDirection) {
        throw new RuntimeException("Stub!");
    }

    public void setFoldAlignment(int foldAlignment) {
        throw new RuntimeException("Stub!");
    }

    public int getAlignment() {
        throw new RuntimeException("Stub!");
    }

    public int getOrientation() {
        throw new RuntimeException("Stub!");
    }

    public boolean isFoldEnabled() {
        throw new RuntimeException("Stub!");
    }

    public int getFoldDirection() {
        throw new RuntimeException("Stub!");
    }

    public int getFoldAlignment() {
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

    /* loaded from: ohos2.2.0.3.jar:ohos/agp/components/MagicLayout$LayoutConfig.class */
    public static class LayoutConfig extends ComponentContainer.LayoutConfig {
        public static final int UNSPECIFIED_REFERENCE_SIZE = -1;
        public int referenceSize = -1;

        public LayoutConfig() {
            throw new RuntimeException("Stub!");
        }

        public LayoutConfig(Context context, AttrSet attrSet) {
            throw new RuntimeException("Stub!");
        }

        public LayoutConfig(int width, int height) {
            throw new RuntimeException("Stub!");
        }

        public LayoutConfig(ComponentContainer.LayoutConfig source) {
            throw new RuntimeException("Stub!");
        }

        public LayoutConfig(LayoutConfig source) {
            throw new RuntimeException("Stub!");
        }

        public void applyToComponent(Component component) {
            throw new RuntimeException("Stub!");
        }
    }
}
