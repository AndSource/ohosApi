package ohos.agp.components;

import ohos.agp.components.ComponentContainer;
import ohos.agp.components.flex.AlignContent;
import ohos.agp.components.flex.AlignItems;
import ohos.agp.components.flex.AlignSelf;
import ohos.agp.components.flex.FlexDirection;
import ohos.agp.components.flex.FlexWrap;
import ohos.agp.components.flex.JustifyContent;
import ohos.app.Context;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/FlexLayout.class */
public class FlexLayout extends ComponentContainer {
    public FlexLayout(Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public FlexLayout(Context context, AttrSet attrSet) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public FlexLayout(Context context, AttrSet attrSet, String styleName) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public void setFlexDirection(FlexDirection flexDirection) {
        throw new RuntimeException("Stub!");
    }

    public FlexDirection getFlexDirection() {
        throw new RuntimeException("Stub!");
    }

    public void setFlexWrap(FlexWrap flexWrap) {
        throw new RuntimeException("Stub!");
    }

    public FlexWrap getFlexWrap() {
        throw new RuntimeException("Stub!");
    }

    public void setJustifyContent(JustifyContent justifyContent) {
        throw new RuntimeException("Stub!");
    }

    public JustifyContent getJustifyContent() {
        throw new RuntimeException("Stub!");
    }

    public void setAlignItems(AlignItems alignItems) {
        throw new RuntimeException("Stub!");
    }

    public AlignItems getAlignItems() {
        throw new RuntimeException("Stub!");
    }

    public void setAlignContent(AlignContent alignContent) {
        throw new RuntimeException("Stub!");
    }

    public AlignContent getAlignContent() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.ComponentContainer
    public ComponentContainer.LayoutConfig createLayoutConfig(Context context, AttrSet attrSet) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.ComponentContainer
    public void addComponent(Component childComponent, int width, int height) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/FlexLayout$LayoutConfig.class */
    public static class LayoutConfig extends ComponentContainer.LayoutConfig {
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

        public void setMinWidth(int minWidth) {
            throw new RuntimeException("Stub!");
        }

        public int getMinWidth() {
            throw new RuntimeException("Stub!");
        }

        public void setMinHeight(int minHeight) {
            throw new RuntimeException("Stub!");
        }

        public int getMinHeight() {
            throw new RuntimeException("Stub!");
        }

        public void setMaxWidth(int maxWidth) {
            throw new RuntimeException("Stub!");
        }

        public int getMaxWidth() {
            throw new RuntimeException("Stub!");
        }

        public void setMaxHeight(int maxHeight) {
            throw new RuntimeException("Stub!");
        }

        public int getMaxHeight() {
            throw new RuntimeException("Stub!");
        }

        public void setFlexGrow(float flexGrow) {
            throw new RuntimeException("Stub!");
        }

        public float getFlexGrow() {
            throw new RuntimeException("Stub!");
        }

        public void setFlexShrink(float flexShrink) {
            throw new RuntimeException("Stub!");
        }

        public float getFlexShrink() {
            throw new RuntimeException("Stub!");
        }

        public void setAlignSelf(AlignSelf alignSelf) {
            throw new RuntimeException("Stub!");
        }

        public AlignSelf getAlignSelf() {
            throw new RuntimeException("Stub!");
        }

        public void setFlexBasisFraction(float flexBasisFraction) {
            throw new RuntimeException("Stub!");
        }

        public float getFlexBasisFraction() {
            throw new RuntimeException("Stub!");
        }
    }
}
