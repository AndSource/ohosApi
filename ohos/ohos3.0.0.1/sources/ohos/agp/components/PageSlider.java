package ohos.agp.components;

import ohos.app.Context;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/PageSlider.class */
public class PageSlider extends StackLayout {
    public static final int DEFAULT_CACHED_PAGES_LIMIT = 1;
    public static final int INVALID_INDEX = -1;
    public static final float ROTATION_SENSITIVITY_DEFAULT = 1.4f;
    public static final float ROTATION_SENSITIVITY_HIGH = 1.4f;
    public static final float ROTATION_SENSITIVITY_LOW = 1.0f;
    public static final int SLIDING_STATE_DRAGGING = 1;
    public static final int SLIDING_STATE_IDLE = 0;
    public static final int SLIDING_STATE_SETTLING = 2;

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/PageSlider$PageChangedListener.class */
    public interface PageChangedListener {
        void onPageSliding(int i, float f, int i2);

        void onPageSlideStateChanged(int i);

        void onPageChosen(int i);
    }

    public PageSlider(Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public PageSlider(Context context, AttrSet attrSet) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public PageSlider(Context context, AttrSet attrSet, String styleName) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public void setProvider(PageSliderProvider provider) {
        throw new RuntimeException("Stub!");
    }

    public PageSliderProvider getProvider() {
        throw new RuntimeException("Stub!");
    }

    public int getCurrentPage() {
        throw new RuntimeException("Stub!");
    }

    public void addPageChangedListener(PageChangedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void removePageChangedListener(PageChangedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public int getCurrentSlidingState() {
        throw new RuntimeException("Stub!");
    }

    public void setOrientation(int orientation) {
        throw new RuntimeException("Stub!");
    }

    public int getOrientation() {
        throw new RuntimeException("Stub!");
    }

    public void setPageMargin(int margin) {
        throw new RuntimeException("Stub!");
    }

    public int getPageMargin() {
        throw new RuntimeException("Stub!");
    }

    public void setPageCacheSize(int cacheSize) {
        throw new RuntimeException("Stub!");
    }

    public int getCachedPagesLimit() {
        throw new RuntimeException("Stub!");
    }

    public void setCurrentPage(int itemPos) {
        throw new RuntimeException("Stub!");
    }

    public void setCurrentPage(int itemPos, boolean smoothScroll) {
        throw new RuntimeException("Stub!");
    }

    public void setSlidingPossible(boolean enable) {
        throw new RuntimeException("Stub!");
    }

    public boolean getSlidingPossible() {
        throw new RuntimeException("Stub!");
    }

    public void setCircularModeEnabled(boolean enabled) {
        throw new RuntimeException("Stub!");
    }

    public boolean isCircularModeEnabled() {
        throw new RuntimeException("Stub!");
    }

    public void setReboundEffect(boolean enabled) {
        throw new RuntimeException("Stub!");
    }

    public boolean getReboundEffect() {
        throw new RuntimeException("Stub!");
    }

    public void setReboundEffectParams(int overscrollPercent, float overscrollRate, int remainVisiblePercent) {
        throw new RuntimeException("Stub!");
    }

    public void setReboundEffectParams(ReboundEffectParams reboundEffectParams) {
        throw new RuntimeException("Stub!");
    }

    public ReboundEffectParams getReboundEffectParams() {
        throw new RuntimeException("Stub!");
    }

    public void setPageSwitchTime(int durationMs) {
        throw new RuntimeException("Stub!");
    }

    public int getPageSwitchTime() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/PageSlider$ReboundEffectParams.class */
    public static class ReboundEffectParams {
        public ReboundEffectParams(int overscrollPercent, float overscrollRate, int remainVisiblePercent) {
            throw new RuntimeException("Stub!");
        }

        public int getOverscrollPercent() {
            throw new RuntimeException("Stub!");
        }

        public float getOverscrollRate() {
            throw new RuntimeException("Stub!");
        }

        public int getRemainVisiblePercent() {
            throw new RuntimeException("Stub!");
        }

        public void setOverscrollPercent(int overscrollPercent) {
            throw new RuntimeException("Stub!");
        }

        public void setOverscrollRate(float overscrollRate) {
            throw new RuntimeException("Stub!");
        }

        public void setRemainVisiblePercent(int remainVisiblePercent) {
            throw new RuntimeException("Stub!");
        }
    }
}
