package ohos.agp.components;

import ohos.agp.components.element.Element;
import ohos.agp.text.Font;
import ohos.agp.utils.Color;
import ohos.app.Context;

/* loaded from: ohos2.1.1.21.jar:ohos/agp/components/DatePicker.class */
public class DatePicker extends StackLayout {
    public static final float ROTATION_SENSITIVITY_DEFAULT = 0.6f;
    public static final float ROTATION_SENSITIVITY_HIGH = 1.0f;
    public static final float ROTATION_SENSITIVITY_LOW = 0.6f;

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/components/DatePicker$DateOrder.class */
    public interface DateOrder {
        public static final int DAY = 10;
        public static final int DM = 4;
        public static final int DMY = 0;
        public static final int MD = 5;
        public static final int MDY = 1;
        public static final int MONTH = 9;
        public static final int MY = 7;
        public static final int YDM = 3;
        public static final int YEAR = 8;
        public static final int YM = 6;
        public static final int YMD = 2;
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/components/DatePicker$ValueChangedListener.class */
    public interface ValueChangedListener {
        void onValueChanged(DatePicker datePicker, int i, int i2, int i3);
    }

    public DatePicker(Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public DatePicker(Context context, AttrSet attrSet) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public DatePicker(Context context, AttrSet attrSet, String styleName) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public int getYear() {
        throw new RuntimeException("Stub!");
    }

    public int getMonth() {
        throw new RuntimeException("Stub!");
    }

    public int getDayOfMonth() {
        throw new RuntimeException("Stub!");
    }

    public long getMaxDate() {
        throw new RuntimeException("Stub!");
    }

    public long getMinDate() {
        throw new RuntimeException("Stub!");
    }

    public void setMaxDate(long maxDate) {
        throw new RuntimeException("Stub!");
    }

    public void setMinDate(long minDate) {
        throw new RuntimeException("Stub!");
    }

    public void updateDate(int year, int month, int dayOfMonth) {
        throw new RuntimeException("Stub!");
    }

    public void setValueChangedListener(ValueChangedListener valueChangedListener) {
        throw new RuntimeException("Stub!");
    }

    public ValueChangedListener getValueChangedListener() {
        throw new RuntimeException("Stub!");
    }

    public void setDateOrder(int dateOrder) {
        throw new RuntimeException("Stub!");
    }

    public int getDateOrder() {
        throw new RuntimeException("Stub!");
    }

    public void setNormalTextSize(int size) {
        throw new RuntimeException("Stub!");
    }

    public int getNormalTextSize() {
        throw new RuntimeException("Stub!");
    }

    public void setSelectedTextSize(int size) {
        throw new RuntimeException("Stub!");
    }

    public int getSelectedTextSize() {
        throw new RuntimeException("Stub!");
    }

    public void init(int year, int monthOfYear, int dayOfMonth, ValueChangedListener valueChangedListener) {
        throw new RuntimeException("Stub!");
    }

    public void setYearFixed(boolean fixed) {
        throw new RuntimeException("Stub!");
    }

    public boolean isYearFixed() {
        throw new RuntimeException("Stub!");
    }

    public void setMonthFixed(boolean fixed) {
        throw new RuntimeException("Stub!");
    }

    public boolean isMonthFixed() {
        throw new RuntimeException("Stub!");
    }

    public void setDayFixed(boolean fixed) {
        throw new RuntimeException("Stub!");
    }

    public boolean isDayFixed() {
        throw new RuntimeException("Stub!");
    }

    public void setNormalTextColor(Color color) {
        throw new RuntimeException("Stub!");
    }

    public Color getNormalTextColor() {
        throw new RuntimeException("Stub!");
    }

    public void setSelectedTextColor(Color color) {
        throw new RuntimeException("Stub!");
    }

    public Color getSelectedTextColor() {
        throw new RuntimeException("Stub!");
    }

    public void setOperatedTextColor(Color color) {
        throw new RuntimeException("Stub!");
    }

    public Color getOperatedTextColor() {
        throw new RuntimeException("Stub!");
    }

    public void setNormalTextFont(Font font) {
        throw new RuntimeException("Stub!");
    }

    public Font getNormalTextFont() {
        throw new RuntimeException("Stub!");
    }

    public void setSelectedTextFont(Font font) {
        throw new RuntimeException("Stub!");
    }

    public Font getSelectedTextFont() {
        throw new RuntimeException("Stub!");
    }

    public void setSelectedTextBackground(Element element) {
        throw new RuntimeException("Stub!");
    }

    public Element getSelectedTextBackgroundElement() {
        throw new RuntimeException("Stub!");
    }

    public void setOperatedTextBackground(Element element) {
        throw new RuntimeException("Stub!");
    }

    public Element getOperatedTextBackgroundElement() {
        throw new RuntimeException("Stub!");
    }

    public void setSelectedNormalTextMarginRatio(float textMarginRatio) {
        throw new RuntimeException("Stub!");
    }

    public float getSelectedNormalTextMarginRatio() {
        throw new RuntimeException("Stub!");
    }

    public void setDisplayedLinesElements(Element top, Element bottom) {
        throw new RuntimeException("Stub!");
    }

    public Element getDisplayedTopElement() {
        throw new RuntimeException("Stub!");
    }

    public Element getDisplayedBottomElement() {
        throw new RuntimeException("Stub!");
    }

    public void setWheelModeEnabled(boolean isEnabled) {
        throw new RuntimeException("Stub!");
    }

    public boolean isWheelModeEnabled() {
        throw new RuntimeException("Stub!");
    }

    public void setSelectorItemNum(int itemNum) {
        throw new RuntimeException("Stub!");
    }

    public int getSelectorItemNum() {
        throw new RuntimeException("Stub!");
    }

    public void setShaderColor(Color color) {
        throw new RuntimeException("Stub!");
    }

    public Color getShaderColor() {
        throw new RuntimeException("Stub!");
    }
}
