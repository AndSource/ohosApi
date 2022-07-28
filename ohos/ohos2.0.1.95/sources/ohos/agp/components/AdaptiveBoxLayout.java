package ohos.agp.components;

import ohos.agp.components.ComponentContainer;
import ohos.app.Context;

/* loaded from: ohos2.0.1.95.jar:ohos/agp/components/AdaptiveBoxLayout.class */
public class AdaptiveBoxLayout extends ComponentContainer {
    public AdaptiveBoxLayout(Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public AdaptiveBoxLayout(Context context, AttrSet attrSet) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public AdaptiveBoxLayout(Context context, AttrSet attrSet, String styleName) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public void addAdaptiveRule(int minWidth, int maxWidth, int columns) {
        throw new RuntimeException("Stub!");
    }

    public void clearAdaptiveRules() {
        throw new RuntimeException("Stub!");
    }

    public void removeAdaptiveRule(int minWidth, int maxWidth, int columns) {
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

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/components/AdaptiveBoxLayout$LayoutConfig.class */
    public static class LayoutConfig extends ComponentContainer.LayoutConfig {
        public int alignment = 17;

        public LayoutConfig() {
            throw new RuntimeException("Stub!");
        }

        public LayoutConfig(int width, int height) {
            throw new RuntimeException("Stub!");
        }

        public LayoutConfig(int width, int height, int alignment) {
            throw new RuntimeException("Stub!");
        }

        public LayoutConfig(Context context, AttrSet attrSet) {
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
