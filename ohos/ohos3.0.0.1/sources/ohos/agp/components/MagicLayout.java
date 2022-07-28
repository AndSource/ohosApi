package ohos.agp.components;

import ohos.agp.components.ComponentContainer;
import ohos.app.Context;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/MagicLayout.class */
public class MagicLayout extends ComponentContainer {
    public static final int EQUALIZE_DEFAULT = 0;
    public static final int EQUALIZE_NEAR_EDGE = 1;
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

    public void setHorizontalStretchEnabled(boolean isEnabled) {
        throw new RuntimeException("Stub!");
    }

    public boolean isHorizontalStretchEnabled() {
        throw new RuntimeException("Stub!");
    }

    public void setVerticalStretchEnabled(boolean isEnabled) {
        throw new RuntimeException("Stub!");
    }

    public boolean isVerticalStretchEnabled() {
        throw new RuntimeException("Stub!");
    }

    public void setWeightEnabled(boolean isEnabled) {
        throw new RuntimeException("Stub!");
    }

    public boolean isWeightEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isScaleEnabled() {
        throw new RuntimeException("Stub!");
    }

    public void setScaleEnabled(boolean isEnabled) {
        throw new RuntimeException("Stub!");
    }

    public int getMaxWidth() {
        throw new RuntimeException("Stub!");
    }

    public void setMaxWidth(int maxWidth) {
        throw new RuntimeException("Stub!");
    }

    public int getMaxHeight() {
        throw new RuntimeException("Stub!");
    }

    public void setMaxHeight(int maxHeight) {
        throw new RuntimeException("Stub!");
    }

    public void setExtendEnabled(boolean isEnabled) {
        throw new RuntimeException("Stub!");
    }

    public boolean isExtendEnabled() {
        throw new RuntimeException("Stub!");
    }

    public void setExtendRevealEnabled(boolean isEnabled) {
        throw new RuntimeException("Stub!");
    }

    public boolean isExtendRevealEnabled() {
        throw new RuntimeException("Stub!");
    }

    public void setExtendRevealLength(int revealLength) {
        throw new RuntimeException("Stub!");
    }

    public int getExtendRevealLength() {
        throw new RuntimeException("Stub!");
    }

    public void setDefaultExtendMargin(int defaultMargin) {
        throw new RuntimeException("Stub!");
    }

    public int getDefaultExtendMargin() {
        throw new RuntimeException("Stub!");
    }

    public void setMinExtendMargin(int minMargin) {
        throw new RuntimeException("Stub!");
    }

    public int getMinExtendMargin() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.Component
    public void setMinWidth(int minWidth) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.Component
    public void setMinHeight(int minHeight) {
        throw new RuntimeException("Stub!");
    }

    public void setHideEnabled(boolean isEnabled) {
        throw new RuntimeException("Stub!");
    }

    public boolean isHideEnabled() {
        throw new RuntimeException("Stub!");
    }

    public void setEqualizeEnabled(boolean isEnabled) {
        throw new RuntimeException("Stub!");
    }

    public boolean isEqualizeEnabled() {
        throw new RuntimeException("Stub!");
    }

    public void setEqualizeType(int equalizeType) {
        throw new RuntimeException("Stub!");
    }

    public int getEqualizeType() {
        throw new RuntimeException("Stub!");
    }

    public void setMaxEqualizeMargin(int maxMargin) {
        throw new RuntimeException("Stub!");
    }

    public int getMaxEqualizeMargin() {
        throw new RuntimeException("Stub!");
    }

    public void setMinEqualizeMargin(int minMargin) {
        throw new RuntimeException("Stub!");
    }

    public int getMinEqualizeMargin() {
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

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/MagicLayout$LayoutConfig.class */
    public static class LayoutConfig extends ComponentContainer.LayoutConfig {
        public static final int UNSPECIFIED_HIDE_PRIORITY = 0;
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

        public float getScaleRatioOfParentWidth() {
            throw new RuntimeException("Stub!");
        }

        public void setScaleRatioOfParentWidth(float widthRatio) {
            throw new RuntimeException("Stub!");
        }

        public float getScaleRatioOfParentHeight() {
            throw new RuntimeException("Stub!");
        }

        public void setScaleRatioOfParentHeight(float heightRatio) {
            throw new RuntimeException("Stub!");
        }

        public int getMaxScaleWidth() {
            throw new RuntimeException("Stub!");
        }

        public void setMaxScaleWidth(int maxScaleWidth) {
            throw new RuntimeException("Stub!");
        }

        public int getMinScaleWidth() {
            throw new RuntimeException("Stub!");
        }

        public void setMinScaleWidth(int minScaleWidth) {
            throw new RuntimeException("Stub!");
        }

        public int getMaxScaleHeight() {
            throw new RuntimeException("Stub!");
        }

        public void setMaxScaleHeight(int maxScaleHeight) {
            throw new RuntimeException("Stub!");
        }

        public int getMinScaleHeight() {
            throw new RuntimeException("Stub!");
        }

        public void setMinScaleHeight(int minScaleHeight) {
            throw new RuntimeException("Stub!");
        }

        public void setLayoutWeight(float layoutWeight) {
            throw new RuntimeException("Stub!");
        }

        public float getLayoutWeight() {
            throw new RuntimeException("Stub!");
        }

        public void setHidePriority(int hidePriority) {
            throw new RuntimeException("Stub!");
        }

        public int getHidePriority() {
            throw new RuntimeException("Stub!");
        }

        public void applyToComponent(Component component) {
            throw new RuntimeException("Stub!");
        }
    }
}
