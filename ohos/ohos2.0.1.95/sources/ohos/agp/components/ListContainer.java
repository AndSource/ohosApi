package ohos.agp.components;

import ohos.agp.components.Text;
import ohos.agp.utils.Color;
import ohos.app.Context;

/* loaded from: ohos2.0.1.95.jar:ohos/agp/components/ListContainer.class */
public class ListContainer extends ComponentContainer implements Text.TextObserver {
    public static final int INVALID_INDEX = -1;

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/components/ListContainer$ItemClickedListener.class */
    public interface ItemClickedListener {
        void onItemClicked(ListContainer listContainer, Component component, int i, long j);
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/components/ListContainer$ItemLongClickedListener.class */
    public interface ItemLongClickedListener {
        boolean onItemLongClicked(ListContainer listContainer, Component component, int i, long j);
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/components/ListContainer$ItemSelectedListener.class */
    public interface ItemSelectedListener {
        void onItemSelected(ListContainer listContainer, Component component, int i, long j);
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/components/ListContainer$ScrollListener.class */
    public interface ScrollListener {
        void onScrollFinished();
    }

    public ListContainer(Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public ListContainer(Context context, AttrSet attrSet) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public ListContainer(Context context, AttrSet attrSet, String styleName) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.Text.TextObserver
    public void onTextUpdated(String text, int start, int before, int count) {
        throw new RuntimeException("Stub!");
    }

    public void scrollTo(int position) {
        throw new RuntimeException("Stub!");
    }

    public void setContentStartOffSet(int startOffset) {
        throw new RuntimeException("Stub!");
    }

    public void setContentEndOffSet(int endOffset) {
        throw new RuntimeException("Stub!");
    }

    public void setContentOffSet(int startOffset, int endOffset) {
        throw new RuntimeException("Stub!");
    }

    public int getContentStartOffset() {
        throw new RuntimeException("Stub!");
    }

    public int getContentEndOffset() {
        throw new RuntimeException("Stub!");
    }

    public void scrollToCenter(int position) {
        throw new RuntimeException("Stub!");
    }

    public void setItemClickedListener(ItemClickedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public boolean executeItemClick(Component component, int position, long id) {
        throw new RuntimeException("Stub!");
    }

    public void setItemLongClickedListener(ItemLongClickedListener listener) {
        throw new RuntimeException("Stub!");
    }

    protected boolean onItemLongClicked(ListContainer parent, Component component, int position, long id) {
        throw new RuntimeException("Stub!");
    }

    public void setScrollListener(ScrollListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void setItemSelectedListener(ItemSelectedListener listener) {
        throw new RuntimeException("Stub!");
    }

    protected void onItemSelected(ListContainer parent, Component component, int position, long id) {
        throw new RuntimeException("Stub!");
    }

    public int getIndexForComponent(Component component) {
        throw new RuntimeException("Stub!");
    }

    public int getLastVisibleItemPosition() {
        throw new RuntimeException("Stub!");
    }

    public int getFirstVisibleItemPosition() {
        throw new RuntimeException("Stub!");
    }

    public int getCenterFocusablePosition() {
        throw new RuntimeException("Stub!");
    }

    public void setReboundEffect(boolean enabled) {
        throw new RuntimeException("Stub!");
    }

    public boolean getReboundEffect() {
        throw new RuntimeException("Stub!");
    }

    public void setShaderColor(Color color) {
        throw new RuntimeException("Stub!");
    }

    public Color getShaderColor() {
        throw new RuntimeException("Stub!");
    }

    public void setOrientation(int orientation) {
        throw new RuntimeException("Stub!");
    }

    public void setSelectedItemIndex(int index) {
        throw new RuntimeException("Stub!");
    }

    public int getSelectedItemIndex() {
        throw new RuntimeException("Stub!");
    }

    public void setTextFilter(String filterText) {
        throw new RuntimeException("Stub!");
    }

    public String getTextFilter() {
        throw new RuntimeException("Stub!");
    }

    public BaseItemProvider getItemProvider() {
        throw new RuntimeException("Stub!");
    }

    public void setItemProvider(BaseItemProvider itemProvider) {
        throw new RuntimeException("Stub!");
    }

    public int getOrientation() {
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

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/components/ListContainer$ReboundEffectParams.class */
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
