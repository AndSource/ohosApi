package ohos.agp.components;

import ohos.agp.components.Component;
import ohos.app.Context;
import ohos.global.configuration.Configuration;

/* loaded from: ohos2.0.1.95.jar:ohos/agp/components/ComponentContainer.class */
public abstract class ComponentContainer extends Component implements ComponentParent {
    public static final int FOCUS_CHILDREN_FIRST = 1;
    public static final int FOCUS_CHILDREN_HIDE = 2;
    public static final int FOCUS_PARENT_FIRST = 0;

    public ComponentContainer(Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public ComponentContainer(Context context, AttrSet attrSet) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public ComponentContainer(Context context, AttrSet attrSet, String styleName) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public LayoutConfig verifyLayoutConfig(LayoutConfig config) {
        throw new RuntimeException("Stub!");
    }

    public LayoutConfig createLayoutConfig(Context context, AttrSet attrSet) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.Component
    public Component findComponentById(int id) {
        throw new RuntimeException("Stub!");
    }

    public void addComponent(Component childComponent) {
        throw new RuntimeException("Stub!");
    }

    public void addComponent(Component childComponent, int width, int height) {
        throw new RuntimeException("Stub!");
    }

    public void addComponent(Component childComponent, LayoutConfig layoutConfig) {
        throw new RuntimeException("Stub!");
    }

    public void addComponent(Component childComponent, int index, LayoutConfig layoutConfig) {
        throw new RuntimeException("Stub!");
    }

    public void addComponent(Component childComponent, int index) {
        throw new RuntimeException("Stub!");
    }

    public Component getComponentAt(int index) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.ComponentParent
    public int getChildIndex(Component component) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.Component
    public ComponentHolder findComponentHolderById(int resId) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.ComponentParent
    public void removeComponent(Component component) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.ComponentParent
    public void removeComponentAt(int index) {
        throw new RuntimeException("Stub!");
    }

    public void removeComponentById(int id) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.ComponentParent
    public void removeComponents(int start, int count) {
        throw new RuntimeException("Stub!");
    }

    public void removeAllComponents() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.ComponentParent
    public void moveChildToFront(Component component) {
        throw new RuntimeException("Stub!");
    }

    public int getChildCount() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.Component
    public void informConfigurationChanged(Configuration config) {
        throw new RuntimeException("Stub!");
    }

    public int getFocusOrder() {
        throw new RuntimeException("Stub!");
    }

    public void setFocusOrder(int focusability) {
        throw new RuntimeException("Stub!");
    }

    public void setAutoLayout(boolean autoLayout) {
        throw new RuntimeException("Stub!");
    }

    public void setAutoLayout(boolean autoLayout, int columnType) {
        throw new RuntimeException("Stub!");
    }

    public boolean getAutoLayout() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.Component, ohos.agp.components.ComponentParent
    public boolean onDrag(Component component, DragEvent event) {
        throw new RuntimeException("Stub!");
    }

    public void setComponentTransition(ComponentTransition componentTransition) {
        throw new RuntimeException("Stub!");
    }

    public ComponentTransition getComponentTransition() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/components/ComponentContainer$LayoutConfig.class */
    public static class LayoutConfig implements Cloneable {
        public static final int MATCH_CONTENT = -2;
        public static final int MATCH_PARENT = -1;
        public int height;
        public int width;

        public LayoutConfig() {
            throw new RuntimeException("Stub!");
        }

        public LayoutConfig(Context context, AttrSet attrSet) {
            throw new RuntimeException("Stub!");
        }

        public LayoutConfig(int width, int height) {
            throw new RuntimeException("Stub!");
        }

        public LayoutConfig(LayoutConfig config) {
            throw new RuntimeException("Stub!");
        }

        public Object clone() throws CloneNotSupportedException {
            throw new RuntimeException("Stub!");
        }

        public void setMargins(int left, int top, int right, int bottom) {
            throw new RuntimeException("Stub!");
        }

        public void setMarginsRelative(int start, int top, int end, int bottom) {
            throw new RuntimeException("Stub!");
        }

        public void setMarginLeft(int left) {
            throw new RuntimeException("Stub!");
        }

        public void setMarginTop(int top) {
            throw new RuntimeException("Stub!");
        }

        public void setMarginRight(int right) {
            throw new RuntimeException("Stub!");
        }

        public void setMarginBottom(int bottom) {
            throw new RuntimeException("Stub!");
        }

        public void setMarginsLeftAndRight(int left, int right) {
            throw new RuntimeException("Stub!");
        }

        public void setMarginsTopAndBottom(int top, int bottom) {
            throw new RuntimeException("Stub!");
        }

        public int[] getMargins() {
            throw new RuntimeException("Stub!");
        }

        public int[] getMarginsLeftAndRight() {
            throw new RuntimeException("Stub!");
        }

        public int[] getMarginsTopAndBottom() {
            throw new RuntimeException("Stub!");
        }

        public int getMarginLeft() {
            throw new RuntimeException("Stub!");
        }

        public int getMarginTop() {
            throw new RuntimeException("Stub!");
        }

        public int getMarginRight() {
            throw new RuntimeException("Stub!");
        }

        public int getMarginBottom() {
            throw new RuntimeException("Stub!");
        }

        public int getHorizontalStartMargin() {
            throw new RuntimeException("Stub!");
        }

        public int getHorizontalEndMargin() {
            throw new RuntimeException("Stub!");
        }

        protected boolean isMarginsRelative() {
            throw new RuntimeException("Stub!");
        }

        public Component.LayoutDirection getLayoutDirection() {
            throw new RuntimeException("Stub!");
        }
    }
}
