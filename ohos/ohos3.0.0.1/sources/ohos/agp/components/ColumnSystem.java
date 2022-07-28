package ohos.agp.components;

import ohos.app.Context;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/ColumnSystem.class */
public class ColumnSystem {
    public static final int BOTTOM_SHEET_TYPE = 19;
    public static final int BUBBLE_TYPE = 4;
    public static final int CARD_DOUBLE_BUTTON_TYPE = 18;
    public static final int CARD_SINGLE_BUTTON_TYPE = 17;
    public static final int CARD_TYPE = 3;
    public static final int CONTENT_TYPE = 0;
    public static final int CUSTOM_TYPE = 11;
    public static final int DIALOG_TYPE = 12;
    public static final int DOUBLE_BUTTON_TYPE = 2;
    public static final int LARGE_BOTTOMTAB_TYPE = 9;
    public static final int LARGE_TOOLBAR_TYPE = 7;
    public static final int MENU_TYPE = 10;
    public static final int SINGLE_BUTTON_TYPE = 1;
    public static final int SMALL_BOTTOMTAB_TYPE = 8;
    public static final int SMALL_TOOLBAR_TYPE = 6;
    public static final int TOAST_TYPE = 5;

    public ColumnSystem(Context context) {
        throw new RuntimeException("Stub!");
    }

    public ColumnSystem(Context context, int columnType) {
        throw new RuntimeException("Stub!");
    }

    public int getTotalColumnCount() {
        throw new RuntimeException("Stub!");
    }

    public int getSuggestedWidth() {
        throw new RuntimeException("Stub!");
    }

    public float getColumnWidth(int columnCount) {
        throw new RuntimeException("Stub!");
    }

    public int getColumnType() {
        throw new RuntimeException("Stub!");
    }

    public void setColumnType(int columnType) {
        throw new RuntimeException("Stub!");
    }

    public int getMargin() {
        throw new RuntimeException("Stub!");
    }

    public int getGutter() {
        throw new RuntimeException("Stub!");
    }

    public int getMinColumnWidth() {
        throw new RuntimeException("Stub!");
    }

    public int getMaxColumnWidth() {
        throw new RuntimeException("Stub!");
    }

    public int updateConfiguration(Context context) {
        throw new RuntimeException("Stub!");
    }

    public int updateConfiguration(int width, int height, float density) {
        throw new RuntimeException("Stub!");
    }
}
