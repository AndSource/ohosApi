package ohos.agp.components;

import ohos.agp.components.ComponentContainer;
import ohos.app.Context;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/DependentLayout.class */
public class DependentLayout extends ComponentContainer {
    public DependentLayout(Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public DependentLayout(Context context, AttrSet attrSet) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public DependentLayout(Context context, AttrSet attrSet, String styleName) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public int getIgnoreAlignment() {
        throw new RuntimeException("Stub!");
    }

    public void setIgnoreAlignment(int componentId) {
        throw new RuntimeException("Stub!");
    }

    public int getIgnoreGravity() {
        throw new RuntimeException("Stub!");
    }

    public void setIgnoreGravity(int componentId) {
        throw new RuntimeException("Stub!");
    }

    public int getAlignment() {
        throw new RuntimeException("Stub!");
    }

    public void setAlignment(int alignment) {
        throw new RuntimeException("Stub!");
    }

    public int getGravity() {
        throw new RuntimeException("Stub!");
    }

    public void setGravity(int gravity) {
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

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/DependentLayout$LayoutConfig.class */
    public static class LayoutConfig extends ComponentContainer.LayoutConfig {
        public static final int ABOVE = 0;
        public static final int ALIGN_BASELINE = 8;
        public static final int ALIGN_BOTTOM = 5;
        public static final int ALIGN_END = 19;
        public static final int ALIGN_LEFT = 6;
        public static final int ALIGN_PARENT_BOTTOM = 10;
        public static final int ALIGN_PARENT_END = 21;
        public static final int ALIGN_PARENT_LEFT = 11;
        public static final int ALIGN_PARENT_RIGHT = 12;
        public static final int ALIGN_PARENT_START = 20;
        public static final int ALIGN_PARENT_TOP = 9;
        public static final int ALIGN_RIGHT = 7;
        public static final int ALIGN_START = 18;
        public static final int ALIGN_TOP = 4;
        public static final int BELOW = 1;
        public static final int CENTER_IN_PARENT = 15;
        public static final int END_OF = 17;
        public static final int HORIZONTAL_CENTER = 13;
        public static final int LEFT_OF = 2;
        public static final int RIGHT_OF = 3;
        public static final int START_OF = 16;
        public static final int TRUE = -1;
        public static final int VERTICAL_CENTER = 14;

        public LayoutConfig() {
            throw new RuntimeException("Stub!");
        }

        public LayoutConfig(Context context, AttrSet attrSet) {
            throw new RuntimeException("Stub!");
        }

        public LayoutConfig(int width, int height) {
            throw new RuntimeException("Stub!");
        }

        public LayoutConfig(LayoutConfig source) {
            throw new RuntimeException("Stub!");
        }

        public LayoutConfig(ComponentContainer.LayoutConfig source) {
            throw new RuntimeException("Stub!");
        }

        @Override // ohos.agp.components.ComponentContainer.LayoutConfig
        public Object clone() throws CloneNotSupportedException {
            throw new RuntimeException("Stub!");
        }

        public void addRule(int verb, int subject) {
            throw new RuntimeException("Stub!");
        }

        public void addRule(int verb) {
            throw new RuntimeException("Stub!");
        }

        public void removeRule(int verb) {
            throw new RuntimeException("Stub!");
        }

        public int getRule(int verb) {
            throw new RuntimeException("Stub!");
        }

        public int[] getRules() {
            throw new RuntimeException("Stub!");
        }
    }
}
