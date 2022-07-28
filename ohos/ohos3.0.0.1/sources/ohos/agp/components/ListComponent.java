package ohos.agp.components;

import ohos.agp.animation.Animator;
import ohos.agp.components.ComponentContainer;
import ohos.agp.components.listcomponent.ComponentOwner;
import ohos.agp.components.listcomponent.ItemAnimation;
import ohos.agp.components.listcomponent.ListAdornment;
import ohos.agp.components.listcomponent.ListComponentPool;
import ohos.agp.components.listcomponent.ListLayoutManager;
import ohos.agp.components.listcomponent.Provider;
import ohos.agp.utils.Rect;
import ohos.app.Context;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/ListComponent.class */
public class ListComponent extends ComponentContainer {
    public static final int HORIZONTAL = 0;
    public static final long INVALID_ID = -1;
    public static final int INVALID_POSITION = -1;
    public static final int INVALID_TYPE = -1;
    public static final int ITEM_TYPE_NO_SCALE_MASK = 536870912;
    public static final int ITEM_TYPE_NO_STICK_MASK = 268435456;
    public static final int LIST_SCROLL_STATE_DRAGGING = 1;
    public static final int LIST_SCROLL_STATE_IDLE = 0;
    public static final int LIST_SCROLL_STATE_SETTLING = 2;
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    public static final int VERTICAL = 1;

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/ListComponent$BounceBackListener.class */
    public interface BounceBackListener {
        void onBounceBackStart(int i, int i2);

        void onBounceBackChange(int i, int i2);

        void onBounceBackEnd(int i, int i2);
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/ListComponent$CachePolicyListener.class */
    public interface CachePolicyListener {
        void onCachePolicy(ComponentOwner componentOwner);
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/ListComponent$OnComponentBoundStatusChangeListener.class */
    public interface OnComponentBoundStatusChangeListener {
        void onChildComponentBoundToWindow(Component component);

        void onChildComponentUnboundFromWindow(Component component);
    }

    public ListComponent(Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public ListComponent(Context context, AttrSet attrSet) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public ListComponent(Context context, AttrSet attrSet, String styleName) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    protected void createNativePtr() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.ComponentContainer
    public void addComponent(Component childComponent) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.ComponentContainer
    public void addComponent(Component childComponent, int width, int height) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.ComponentContainer
    public void addComponent(Component childComponent, ComponentContainer.LayoutConfig layoutConfig) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.ComponentContainer
    public void addComponent(Component childComponent, int index, ComponentContainer.LayoutConfig layoutConfig) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.ComponentContainer
    public void addComponent(Component childComponent, int index) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.ComponentContainer, ohos.agp.components.ComponentParent
    public void removeComponent(Component component) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.ComponentContainer, ohos.agp.components.ComponentParent
    public void removeComponentAt(int index) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.ComponentContainer
    public void removeComponentById(int id) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.ComponentContainer, ohos.agp.components.ComponentParent
    public void removeComponents(int start, int count) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.ComponentContainer
    public void removeAllComponents() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.ComponentContainer
    public Component getComponentAt(int position) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.ComponentContainer
    public int getChildCount() {
        throw new RuntimeException("Stub!");
    }

    public void onComponentBoundToWindow(Component child) {
        throw new RuntimeException("Stub!");
    }

    public void onComponentUnboundFromWindow(Component child) {
        throw new RuntimeException("Stub!");
    }

    public void setListLayoutManager(ListLayoutManager layoutManager) {
        throw new RuntimeException("Stub!");
    }

    public ListLayoutManager getListLayoutManager() {
        throw new RuntimeException("Stub!");
    }

    public void setProvider(Provider provider) {
        throw new RuntimeException("Stub!");
    }

    public Provider getProvider() {
        throw new RuntimeException("Stub!");
    }

    public void setIsFixedSize(boolean isFixedSize) {
        throw new RuntimeException("Stub!");
    }

    public boolean isSizeFixed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isCalculatingLayout() {
        throw new RuntimeException("Stub!");
    }

    public void alignChildComponentYCoordinate(int dy) {
        throw new RuntimeException("Stub!");
    }

    public void alignChildComponentXCoordinate(int dx) {
        throw new RuntimeException("Stub!");
    }

    public void switchProvider(Provider provider, boolean deleteAndReuseComponents) {
        throw new RuntimeException("Stub!");
    }

    public void addOnComponentBoundStatusChangeListener(OnComponentBoundStatusChangeListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void clearOnComponentBoundStatusChangeListener() {
        throw new RuntimeException("Stub!");
    }

    public void removeOnComponentBoundStatusChangeListener(OnComponentBoundStatusChangeListener listener) {
        throw new RuntimeException("Stub!");
    }

    public int getChildProviderPosition(Component component) {
        throw new RuntimeException("Stub!");
    }

    public int getChildLayoutPosition(Component component) {
        throw new RuntimeException("Stub!");
    }

    public long getChildComponentId(Component child) {
        throw new RuntimeException("Stub!");
    }

    public ComponentOwner searchComponentOwnerForLayoutPosition(int position) {
        throw new RuntimeException("Stub!");
    }

    public ComponentOwner searchComponentOwnerForProviderPosition(int position) {
        throw new RuntimeException("Stub!");
    }

    public ComponentOwner getComponentOwnerById(long id) {
        throw new RuntimeException("Stub!");
    }

    public Component searchChildComponentBelowPoint(float x, float y) {
        throw new RuntimeException("Stub!");
    }

    public ComponentOwner getChildComponentOwner(Component child) {
        throw new RuntimeException("Stub!");
    }

    public Component searchParentComponentOfChild(Component component) {
        throw new RuntimeException("Stub!");
    }

    public ComponentOwner searchParentComponentOwnerOfChild(Component component) {
        throw new RuntimeException("Stub!");
    }

    public boolean hasIncomingProviderRefresh() {
        throw new RuntimeException("Stub!");
    }

    public void addCachePolicyListener(CachePolicyListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void removeCachePolicyListener(CachePolicyListener listener) {
        throw new RuntimeException("Stub!");
    }

    public ListComponentPool getListCachedPool() {
        throw new RuntimeException("Stub!");
    }

    public void setListCachedPool(ListComponentPool pool) {
        throw new RuntimeException("Stub!");
    }

    public void setRequestedCacheMax(int count) {
        throw new RuntimeException("Stub!");
    }

    public void scrollToPositionInSmoothMode(int position) {
        throw new RuntimeException("Stub!");
    }

    public boolean fling(int speedX, int speedY) {
        throw new RuntimeException("Stub!");
    }

    public int getMinFlingSpeed() {
        throw new RuntimeException("Stub!");
    }

    public int getMaxFlingSpeed() {
        throw new RuntimeException("Stub!");
    }

    public void scrollToPosition(int position) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.Component
    public void scrollTo(int x, int y) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.Component
    public void scrollBy(int x, int y) {
        throw new RuntimeException("Stub!");
    }

    public void stopScroll() {
        throw new RuntimeException("Stub!");
    }

    public void scrollByInSmoothMode(int dx, int dy) {
        throw new RuntimeException("Stub!");
    }

    public void scrollByInSmoothMode(int dx, int dy, Animator.TimelineCurve curve) {
        throw new RuntimeException("Stub!");
    }

    public void setItemAnimation(ItemAnimation animation) {
        throw new RuntimeException("Stub!");
    }

    public ItemAnimation getItemAnimation() {
        throw new RuntimeException("Stub!");
    }

    public boolean isListAnimating() {
        throw new RuntimeException("Stub!");
    }

    public void addListAdornment(ListAdornment adorn, int index) {
        throw new RuntimeException("Stub!");
    }

    public void addListAdornment(ListAdornment adorn) {
        throw new RuntimeException("Stub!");
    }

    public ListAdornment getListAdornmentAt(int index) {
        throw new RuntimeException("Stub!");
    }

    public int getListAdornmentCount() {
        throw new RuntimeException("Stub!");
    }

    public void removeListAdornmentAt(int index) {
        throw new RuntimeException("Stub!");
    }

    public void removeListAdornment(ListAdornment decor) {
        throw new RuntimeException("Stub!");
    }

    public void refreshListAdornments() {
        throw new RuntimeException("Stub!");
    }

    public void getAdornedBoundryIncludeMargin(Component component, Rect outBounds) {
        throw new RuntimeException("Stub!");
    }

    public void postponeLayout(boolean isPostponeLayout) {
        throw new RuntimeException("Stub!");
    }

    public boolean isPostponeLayout() {
        throw new RuntimeException("Stub!");
    }

    public void setOnFlingListener(OnFlingListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void setRecoverfocusAfterRefresh(boolean recoverFocusAfterRefresh) {
        throw new RuntimeException("Stub!");
    }

    public boolean getRecoverfocusAfterRefresh() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.Component, ohos.agp.components.ComponentParent
    public void postLayout() {
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

    @Override // ohos.agp.components.ComponentContainer
    public void setLayoutManager(LayoutManager layoutManager) {
        throw new RuntimeException("Stub!");
    }

    public boolean isScrollingSmoothly() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.ComponentContainer, ohos.agp.components.ComponentParent
    public ComponentContainer.LayoutConfig verifyLayoutConfig(ComponentContainer.LayoutConfig config) {
        throw new RuntimeException("Stub!");
    }

    public void onBounceBackStart(int xOverScrolled, int yOverScrolled) {
        throw new RuntimeException("Stub!");
    }

    public void onBounceBackChange(int xOverScrolled, int yOverScrolled) {
        throw new RuntimeException("Stub!");
    }

    public void onBounceBackEnd(int xOverScrolled, int yOverScrolled) {
        throw new RuntimeException("Stub!");
    }

    public void addBounceBackListener(BounceBackListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void removeBounceBackListener(BounceBackListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void clearBounceBackListeners() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/ListComponent$ListLayoutConfig.class */
    public static class ListLayoutConfig extends ComponentContainer.LayoutConfig {
        public ListLayoutConfig() {
            throw new RuntimeException("Stub!");
        }

        public ListLayoutConfig(Context context, AttrSet attrSet) {
            throw new RuntimeException("Stub!");
        }

        public ListLayoutConfig(int width, int height) {
            throw new RuntimeException("Stub!");
        }

        public ListLayoutConfig(ComponentContainer.LayoutConfig source) {
            throw new RuntimeException("Stub!");
        }

        public ListLayoutConfig(ListLayoutConfig source) {
            throw new RuntimeException("Stub!");
        }

        public ComponentOwner getComponentOwner() {
            throw new RuntimeException("Stub!");
        }

        public void setComponentOwner(ComponentOwner componentOwner) {
            throw new RuntimeException("Stub!");
        }

        public void applyToComponent(Component component) {
            throw new RuntimeException("Stub!");
        }

        public void setFullLane(boolean fullLane) {
            throw new RuntimeException("Stub!");
        }

        public boolean getFullLane() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/ListComponent$OnFlingListener.class */
    public static abstract class OnFlingListener {
        public abstract boolean onFlingDetected(int i, int i2);

        public OnFlingListener() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/ListComponent$ReboundEffectParams.class */
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
