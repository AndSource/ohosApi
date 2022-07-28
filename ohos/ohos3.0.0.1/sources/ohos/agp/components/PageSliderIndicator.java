package ohos.agp.components;

import ohos.agp.components.PageSlider;
import ohos.agp.components.element.Element;
import ohos.agp.database.Publisher;
import ohos.app.Context;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/PageSliderIndicator.class */
public final class PageSliderIndicator extends Component {
    public PageSliderIndicator(Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public PageSliderIndicator(Context context, AttrSet attrSet) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public PageSliderIndicator(Context context, AttrSet attrSet, String styleName) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public void setPageSlider(PageSlider pageSlider) {
        throw new RuntimeException("Stub!");
    }

    public PageSlider getPageSlider() {
        throw new RuntimeException("Stub!");
    }

    public void setViewPager(PageSlider pageSlider) {
        throw new RuntimeException("Stub!");
    }

    public void addPageChangedListener(PageSlider.PageChangedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void removePageChangedListener(PageSlider.PageChangedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void addOnSelectionChangedListener(PageSlider.PageChangedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void removeOnSelectionChangedListener(PageSlider.PageChangedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public int getPageChangedListenerCount() {
        throw new RuntimeException("Stub!");
    }

    public int getOnSelectionChangedListenerCount() {
        throw new RuntimeException("Stub!");
    }

    public int getCount() {
        throw new RuntimeException("Stub!");
    }

    public void setSelected(int pos) {
        throw new RuntimeException("Stub!");
    }

    public int getSelected() {
        throw new RuntimeException("Stub!");
    }

    public void setItemElement(Element normal, Element selected) {
        throw new RuntimeException("Stub!");
    }

    public void setItemNormalElement(Element normal) {
        throw new RuntimeException("Stub!");
    }

    public void setItemSelectedElement(Element selected) {
        throw new RuntimeException("Stub!");
    }

    public Element[] getItemElements() {
        throw new RuntimeException("Stub!");
    }

    public Element getItemNormalElement() {
        throw new RuntimeException("Stub!");
    }

    public Element getItemSelectedElement() {
        throw new RuntimeException("Stub!");
    }

    public void setItemOffset(int offset) {
        throw new RuntimeException("Stub!");
    }

    public int getItemOffset() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.Component
    public void setWidth(int width) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.Component
    public void setHeight(int height) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.Component
    public void setPadding(int left, int top, int right, int bottom) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/PageSliderIndicator$IndicatorSelectionHandler.class */
    protected static class IndicatorSelectionHandler extends Publisher<PageSlider.PageChangedListener> {
        protected IndicatorSelectionHandler() {
            throw new RuntimeException("Stub!");
        }
    }
}
