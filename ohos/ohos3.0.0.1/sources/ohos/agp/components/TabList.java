package ohos.agp.components;

import ohos.agp.components.element.Element;
import ohos.app.Context;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/TabList.class */
public class TabList extends ScrollView {
    public static final int INDICATOR_BOTTOM_LINE = 1;
    public static final int INDICATOR_INVISIBLE = 0;
    public static final int INDICATOR_LEFT_LINE = 2;
    public static final int INDICATOR_OVAL = 3;

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/TabList$TabSelectedListener.class */
    public interface TabSelectedListener {
        void onSelected(Tab tab);

        void onUnselected(Tab tab);

        void onReselected(Tab tab);
    }

    public TabList(Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public TabList(Context context, AttrSet attrSet) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public TabList(Context context, AttrSet attrSet, String styleName) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public void addTab(Tab tab) {
        throw new RuntimeException("Stub!");
    }

    public void addTab(Tab tab, int pos) {
        throw new RuntimeException("Stub!");
    }

    public void addTab(Tab tab, boolean selected) {
        throw new RuntimeException("Stub!");
    }

    public void addTab(Tab tab, int pos, boolean selected) {
        throw new RuntimeException("Stub!");
    }

    public void removeTab(Tab tab) {
        throw new RuntimeException("Stub!");
    }

    public void removeTab(int pos) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.ComponentContainer
    public void removeAllComponents() {
        throw new RuntimeException("Stub!");
    }

    public Tab getTabAt(int pos) {
        throw new RuntimeException("Stub!");
    }

    public void selectTabAt(int pos) {
        throw new RuntimeException("Stub!");
    }

    public void selectTab(Tab tab) {
        throw new RuntimeException("Stub!");
    }

    public Tab getSelectedTab() {
        throw new RuntimeException("Stub!");
    }

    public int getSelectedTabIndex() {
        throw new RuntimeException("Stub!");
    }

    public int getTabCount() {
        throw new RuntimeException("Stub!");
    }

    public void setTabTextColors(int normal, int selected) {
        throw new RuntimeException("Stub!");
    }

    public int getNormalTabTextColor() {
        throw new RuntimeException("Stub!");
    }

    public int getSelectedTabTextColor() {
        throw new RuntimeException("Stub!");
    }

    public void setTabTextSize(int size) {
        throw new RuntimeException("Stub!");
    }

    public int getTabTextSize() {
        throw new RuntimeException("Stub!");
    }

    public int getTabTextAlignment() {
        throw new RuntimeException("Stub!");
    }

    public int getTabLength() {
        throw new RuntimeException("Stub!");
    }

    public int getTabMargin() {
        throw new RuntimeException("Stub!");
    }

    public void setTabTextAlignment(int alignment) {
        throw new RuntimeException("Stub!");
    }

    public void setTabLength(int length) {
        throw new RuntimeException("Stub!");
    }

    public void setTabMargin(int margin) {
        throw new RuntimeException("Stub!");
    }

    public void setFixedMode(boolean isFixed) {
        throw new RuntimeException("Stub!");
    }

    public boolean isFixedMode() {
        throw new RuntimeException("Stub!");
    }

    public void setSelectedTabIndicatorColor(int color) {
        throw new RuntimeException("Stub!");
    }

    public int getSelectedTabIndicatorColor() {
        throw new RuntimeException("Stub!");
    }

    public void setSelectedTabIndicatorHeight(int height) {
        throw new RuntimeException("Stub!");
    }

    public int getSelectedTabIndicatorHeight() {
        throw new RuntimeException("Stub!");
    }

    public void setOrientation(int orientation) {
        throw new RuntimeException("Stub!");
    }

    public int getOrientation() {
        throw new RuntimeException("Stub!");
    }

    public void setIndicatorType(int type) {
        throw new RuntimeException("Stub!");
    }

    public int getIndicatorType() {
        throw new RuntimeException("Stub!");
    }

    public void addTabSelectedListener(TabSelectedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void removeTabSelectedListener(TabSelectedListener listener) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/TabList$Tab.class */
    public class Tab extends Text {
        public Tab(Context context) {
            super(null);
            throw new RuntimeException("Stub!");
        }

        public Tab(Context context, AttrSet attrSet) {
            super(null);
            throw new RuntimeException("Stub!");
        }

        public Tab(Context context, AttrSet attrSet, String styleName) {
            super(null);
            throw new RuntimeException("Stub!");
        }

        public Tab setIconElement(Element leftIcon) {
            throw new RuntimeException("Stub!");
        }

        public Element getIconElement() {
            throw new RuntimeException("Stub!");
        }

        public Tab select() {
            throw new RuntimeException("Stub!");
        }

        public int getPosition() {
            throw new RuntimeException("Stub!");
        }
    }
}
