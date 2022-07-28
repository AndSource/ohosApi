package ohos.agp.components;

import ohos.agp.components.element.Element;
import ohos.agp.text.Font;
import ohos.agp.utils.Color;
import ohos.app.Context;

/* loaded from: ohos2.0.1.95.jar:ohos/agp/components/TimePicker.class */
public class TimePicker extends StackLayout {
    protected TimeChangedListener mTimeChangedListener;

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/components/TimePicker$AmPmOrder.class */
    public enum AmPmOrder {
        START,
        END,
        LEFT,
        RIGHT
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/components/TimePicker$TimeChangedListener.class */
    public interface TimeChangedListener {
        void onTimeChanged(TimePicker timePicker, int i, int i2, int i3);
    }

    public TimePicker(Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public TimePicker(Context context, AttrSet attrSet) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public TimePicker(Context context, AttrSet attrSet, String styleName) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public boolean isHourEnabled() {
        throw new RuntimeException("Stub!");
    }

    public void enableHour(boolean enable) {
        throw new RuntimeException("Stub!");
    }

    public void showHour(boolean show) {
        throw new RuntimeException("Stub!");
    }

    public boolean isHourShown() {
        throw new RuntimeException("Stub!");
    }

    public boolean isMinuteEnabled() {
        throw new RuntimeException("Stub!");
    }

    public void enableMinute(boolean enable) {
        throw new RuntimeException("Stub!");
    }

    public void showMinute(boolean show) {
        throw new RuntimeException("Stub!");
    }

    public boolean isMinuteShown() {
        throw new RuntimeException("Stub!");
    }

    public boolean isSecondEnabled() {
        throw new RuntimeException("Stub!");
    }

    public void enableSecond(boolean enable) {
        throw new RuntimeException("Stub!");
    }

    public void showSecond(boolean show) {
        throw new RuntimeException("Stub!");
    }

    public boolean isSecondShown() {
        throw new RuntimeException("Stub!");
    }

    public int getHour() {
        throw new RuntimeException("Stub!");
    }

    public void setHour(int hour) {
        throw new RuntimeException("Stub!");
    }

    public int getMinute() {
        throw new RuntimeException("Stub!");
    }

    public void setMinute(int minute) {
        throw new RuntimeException("Stub!");
    }

    public int getSecond() {
        throw new RuntimeException("Stub!");
    }

    public void setSecond(int second) {
        throw new RuntimeException("Stub!");
    }

    public void set24Hour(boolean is24Hour) {
        throw new RuntimeException("Stub!");
    }

    public boolean is24Hour() {
        throw new RuntimeException("Stub!");
    }

    public void setTimeChangedListener(TimeChangedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void setRange(int[] ranges) {
        throw new RuntimeException("Stub!");
    }

    public void getRange(int[] ranges) {
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

    public Element[] getDisplayedLinesElements() {
        throw new RuntimeException("Stub!");
    }

    public void setDisplayedTopElement(Element top) {
        throw new RuntimeException("Stub!");
    }

    public void setDisplayedBottomElement(Element bottom) {
        throw new RuntimeException("Stub!");
    }

    public void setAmPmStrings(String am, String pm) {
        throw new RuntimeException("Stub!");
    }

    public void setAmString(String am) {
        throw new RuntimeException("Stub!");
    }

    public void setPmString(String pm) {
        throw new RuntimeException("Stub!");
    }

    public String[] getAmPmStrings() {
        throw new RuntimeException("Stub!");
    }

    public String getAmString() {
        throw new RuntimeException("Stub!");
    }

    public String getPmString() {
        throw new RuntimeException("Stub!");
    }

    public TimeChangedListener getTimeChangedListener() {
        throw new RuntimeException("Stub!");
    }

    public void setWheelModeEnabled(boolean isEnabled) {
        throw new RuntimeException("Stub!");
    }

    public boolean isWheelModeEnabled() {
        throw new RuntimeException("Stub!");
    }

    public void setShaderColor(Color color) {
        throw new RuntimeException("Stub!");
    }

    public Color getShaderColor() {
        throw new RuntimeException("Stub!");
    }

    public void setSelectorItemNum(int itemNum) {
        throw new RuntimeException("Stub!");
    }

    public int getSelectorItemNum() {
        throw new RuntimeException("Stub!");
    }

    public void setAmPmOrder(AmPmOrder order) {
        throw new RuntimeException("Stub!");
    }

    public AmPmOrder getAmPmOrder() {
        throw new RuntimeException("Stub!");
    }
}
