package ohos.agp.components;

import ohos.agp.components.Component;
import ohos.agp.utils.Color;
import ohos.app.Context;
import ohos.media.image.PixelMap;

/* loaded from: ohos2.2.0.3.jar:ohos/agp/components/SearchBar.class */
public class SearchBar extends DirectionalLayout {

    /* loaded from: ohos2.2.0.3.jar:ohos/agp/components/SearchBar$FoldListener.class */
    public interface FoldListener {
        boolean onFold();
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/agp/components/SearchBar$QueryListener.class */
    public interface QueryListener {
        boolean onQuerySubmit(String str);

        boolean onQueryChanged(String str);
    }

    public SearchBar(Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public SearchBar(Context context, AttrSet attrSet) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public SearchBar(Context context, AttrSet attrSet, String styleName) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.ComponentContainer
    public void addComponent(Component childView) {
        throw new RuntimeException("Stub!");
    }

    public TextField getSearchText() {
        throw new RuntimeException("Stub!");
    }

    public Image getSearchButton() {
        throw new RuntimeException("Stub!");
    }

    public Image getSearchIcon() {
        throw new RuntimeException("Stub!");
    }

    public Image getSubmitButton() {
        throw new RuntimeException("Stub!");
    }

    public Image getCloseButton() {
        throw new RuntimeException("Stub!");
    }

    public void setTextSize(int textSize) {
        throw new RuntimeException("Stub!");
    }

    public int getTextSize() {
        throw new RuntimeException("Stub!");
    }

    public void setQuery(String query, boolean submit) {
        throw new RuntimeException("Stub!");
    }

    public String getQuery() {
        throw new RuntimeException("Stub!");
    }

    public void setSearchHint(String searchHint) {
        throw new RuntimeException("Stub!");
    }

    public String getQueryHint() {
        throw new RuntimeException("Stub!");
    }

    public void setMaxWidth(int maxpixels) {
        throw new RuntimeException("Stub!");
    }

    public int getMaxWidth() {
        throw new RuntimeException("Stub!");
    }

    public void setIconifiedState(boolean state) {
        throw new RuntimeException("Stub!");
    }

    public boolean getIconifiedState() {
        throw new RuntimeException("Stub!");
    }

    public void setFoldListener(FoldListener listener) {
        throw new RuntimeException("Stub!");
    }

    public FoldListener getFoldListener() {
        throw new RuntimeException("Stub!");
    }

    public void setQueryListener(QueryListener listener) {
        throw new RuntimeException("Stub!");
    }

    public QueryListener getQueryListener() {
        throw new RuntimeException("Stub!");
    }

    public void setQueryFocusChangeListener(Component.FocusChangedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void setSearchClickListener(Component.ClickedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public Component.ClickedListener getSearchClickListener() {
        throw new RuntimeException("Stub!");
    }

    public void activateSubmitButton(boolean enabled) {
        throw new RuntimeException("Stub!");
    }

    public boolean isSearchButtonEnable() {
        throw new RuntimeException("Stub!");
    }

    public void setSearchButton(PixelMap pixelMap) {
        throw new RuntimeException("Stub!");
    }

    public void setSearchIcon(PixelMap pixelMap) {
        throw new RuntimeException("Stub!");
    }

    public void setCloseButton(PixelMap pixelMap) {
        throw new RuntimeException("Stub!");
    }

    public void setSubmitButton(PixelMap pixelMap) {
        throw new RuntimeException("Stub!");
    }

    public void setSearchButton(int resId) {
        throw new RuntimeException("Stub!");
    }

    public void setSearchIcon(int resId) {
        throw new RuntimeException("Stub!");
    }

    public void setSubmitButton(int resId) {
        throw new RuntimeException("Stub!");
    }

    public void setCloseButton(int resId) {
        throw new RuntimeException("Stub!");
    }

    public void setSearchTextColor(Color color) {
        throw new RuntimeException("Stub!");
    }

    public Color getSearchTextColor() {
        throw new RuntimeException("Stub!");
    }
}
