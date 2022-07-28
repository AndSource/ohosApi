package ohos.agp.components;

import ohos.agp.components.ComponentContainer;
import ohos.app.Context;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/SlideDrawer.class */
public class SlideDrawer extends ComponentContainer {
    public static final DisplayMode DEFAULT_DISPLAY_MODE = null;
    public static final float DEFAULT_OPEN_THRESHOLD = 0.25f;

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/SlideDrawer$DisplayMode.class */
    public enum DisplayMode {
        NO_ANIMATION,
        WITH_ANIMATION
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/SlideDrawer$DrawerState.class */
    public enum DrawerState {
        OPEN,
        MIDDLE,
        CLOSE
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/SlideDrawer$SlideDirection.class */
    public enum SlideDirection {
        START,
        TOP,
        END,
        BOTTOM
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/SlideDrawer$SlideDisable.class */
    public interface SlideDisable {
        boolean shouldDisableSlide(SlideDrawer slideDrawer, SlideDirection slideDirection, DragInfo dragInfo);
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/SlideDrawer$SlideListener.class */
    public interface SlideListener {
        void onOpen(SlideDrawer slideDrawer, SlideDirection slideDirection);

        void onMiddle(SlideDrawer slideDrawer, SlideDirection slideDirection, DrawerState drawerState);

        void onClose(SlideDrawer slideDrawer, SlideDirection slideDirection);

        void onSlideChange(SlideDrawer slideDrawer, SlideDirection slideDirection, int i, int i2);
    }

    public SlideDrawer(Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public SlideDrawer(Context context, AttrSet attrSet) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public SlideDrawer(Context context, AttrSet attrSet, String styleName) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public void addSlideListener(SlideListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void removeSlideListener(SlideListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void removeAllSlideListeners() {
        throw new RuntimeException("Stub!");
    }

    public boolean hasSlideListeners() {
        throw new RuntimeException("Stub!");
    }

    public void addSlideDisable(SlideDisable callback) {
        throw new RuntimeException("Stub!");
    }

    public void removeSlideDisable(SlideDisable callback) {
        throw new RuntimeException("Stub!");
    }

    public void removeAllSlideDisables() {
        throw new RuntimeException("Stub!");
    }

    public boolean hasSlideDisables() {
        throw new RuntimeException("Stub!");
    }

    public void setTouchForClose(boolean isEnabled) {
        throw new RuntimeException("Stub!");
    }

    public boolean isTouchForClose() {
        throw new RuntimeException("Stub!");
    }

    public void setSlideEnabled(boolean isEnabled) {
        throw new RuntimeException("Stub!");
    }

    public boolean isSlideEnabled() {
        throw new RuntimeException("Stub!");
    }

    public void setOpenThreshold(float percent) {
        throw new RuntimeException("Stub!");
    }

    public float getOpenThreshold() {
        throw new RuntimeException("Stub!");
    }

    public float getSlideDistanceRatio() {
        throw new RuntimeException("Stub!");
    }

    public void setMaximumSlideDistance(int max) {
        throw new RuntimeException("Stub!");
    }

    public int getSlideDistance(SlideDirection direction) {
        throw new RuntimeException("Stub!");
    }

    public DrawerState getSlideState() {
        throw new RuntimeException("Stub!");
    }

    public SlideDirection getSlideDirection() {
        throw new RuntimeException("Stub!");
    }

    public void setDisplayMode(DisplayMode mode) {
        throw new RuntimeException("Stub!");
    }

    public void setDisplayMode(DisplayMode mode, SlideDirection direction) {
        throw new RuntimeException("Stub!");
    }

    public void setDisplayMode(DisplayMode startMode, DisplayMode topMode, DisplayMode endMode, DisplayMode bottomMode) {
        throw new RuntimeException("Stub!");
    }

    public DisplayMode getDisplayMode(SlideDirection direction) {
        throw new RuntimeException("Stub!");
    }

    public DisplayMode[] getDisplayMode() {
        throw new RuntimeException("Stub!");
    }

    public boolean open() {
        throw new RuntimeException("Stub!");
    }

    public boolean open(SlideDirection direction) {
        throw new RuntimeException("Stub!");
    }

    public boolean openSmoothly() {
        throw new RuntimeException("Stub!");
    }

    public boolean openSmoothly(SlideDirection direction) {
        throw new RuntimeException("Stub!");
    }

    public boolean openSmoothly(int interval) {
        throw new RuntimeException("Stub!");
    }

    public boolean openSmoothly(SlideDirection direction, int interval) {
        throw new RuntimeException("Stub!");
    }

    public boolean close() {
        throw new RuntimeException("Stub!");
    }

    public boolean close(SlideDirection direction) {
        throw new RuntimeException("Stub!");
    }

    public boolean closeSmoothly() {
        throw new RuntimeException("Stub!");
    }

    public boolean closeSmoothly(SlideDirection direction) {
        throw new RuntimeException("Stub!");
    }

    public boolean closeSmoothly(int interval) {
        throw new RuntimeException("Stub!");
    }

    public boolean closeSmoothly(SlideDirection direction, int interval) {
        throw new RuntimeException("Stub!");
    }

    public boolean toggle() {
        throw new RuntimeException("Stub!");
    }

    public boolean toggle(SlideDirection direction) {
        throw new RuntimeException("Stub!");
    }

    public boolean toggleSmoothly() {
        throw new RuntimeException("Stub!");
    }

    public boolean toggleSmoothly(SlideDirection direction) {
        throw new RuntimeException("Stub!");
    }

    public boolean toggleSmoothly(int interval) {
        throw new RuntimeException("Stub!");
    }

    public boolean toggleSmoothly(SlideDirection direction, int interval) {
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

    @Override // ohos.agp.components.ComponentContainer, ohos.agp.components.ComponentParent
    public void removeComponents(int start, int count) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/SlideDrawer$LayoutConfig.class */
    public static class LayoutConfig extends ComponentContainer.LayoutConfig {
        public SlideDirection direction;

        public LayoutConfig() {
            throw new RuntimeException("Stub!");
        }

        public LayoutConfig(Context context, AttrSet attrSet) {
            throw new RuntimeException("Stub!");
        }

        public LayoutConfig(int width, int height) {
            throw new RuntimeException("Stub!");
        }

        public LayoutConfig(int width, int height, SlideDirection direction) {
            throw new RuntimeException("Stub!");
        }

        public LayoutConfig(LayoutConfig source) {
            throw new RuntimeException("Stub!");
        }

        public LayoutConfig(ComponentContainer.LayoutConfig source) {
            throw new RuntimeException("Stub!");
        }
    }
}
