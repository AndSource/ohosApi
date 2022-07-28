package ohos.agp.components;

import ohos.app.Context;

/* loaded from: ohos2.1.1.21.jar:ohos/agp/components/ScrollView.class */
public class ScrollView extends StackLayout {
    public static final float ROTATION_SENSITIVITY_DEFAULT = 1.0f;
    public static final float ROTATION_SENSITIVITY_HIGH = 1.0f;
    public static final float ROTATION_SENSITIVITY_LOW = 0.6f;

    public ScrollView(Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public ScrollView(Context context, AttrSet attrSet) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public ScrollView(Context context, AttrSet attrSet, String styleName) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public void doFling(int velocityX, int velocityY) {
        throw new RuntimeException("Stub!");
    }

    public void doFlingX(int velocityX) {
        throw new RuntimeException("Stub!");
    }

    public void doFlingY(int velocityY) {
        throw new RuntimeException("Stub!");
    }

    public void fluentScrollBy(int deltaX, int deltaY) {
        throw new RuntimeException("Stub!");
    }

    public void fluentScrollByX(int dx) {
        throw new RuntimeException("Stub!");
    }

    public void fluentScrollByY(int dy) {
        throw new RuntimeException("Stub!");
    }

    public void fluentScrollTo(int x, int y) {
        throw new RuntimeException("Stub!");
    }

    public void fluentScrollXTo(int x) {
        throw new RuntimeException("Stub!");
    }

    public void fluentScrollYTo(int y) {
        throw new RuntimeException("Stub!");
    }

    public void setMatchViewportEnabled(boolean enable) {
        throw new RuntimeException("Stub!");
    }

    public boolean isMatchViewport() {
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

    public void addScrollPausePositionX(int positionX) {
        throw new RuntimeException("Stub!");
    }

    public void addScrollPausePositionY(int positionY) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/components/ScrollView$ReboundEffectParams.class */
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
