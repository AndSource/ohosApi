package ohos.agp.components;

import ohos.agp.components.element.Element;
import ohos.agp.utils.Color;
import ohos.app.Context;

/* loaded from: ohos2.2.0.3.jar:ohos/agp/components/ProgressBar.class */
public class ProgressBar extends Component {

    /* loaded from: ohos2.2.0.3.jar:ohos/agp/components/ProgressBar$BarObserver.class */
    public interface BarObserver {
        void onBarChanged(int i, int i2, int i3);
    }

    public ProgressBar(Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public ProgressBar(Context context, AttrSet attrSet) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public ProgressBar(Context context, AttrSet attrSet, String styleName) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public void setOrientation(int orientation) {
        throw new RuntimeException("Stub!");
    }

    public int getOrientation() {
        throw new RuntimeException("Stub!");
    }

    public void setMinValue(int min) {
        throw new RuntimeException("Stub!");
    }

    public void setMaxValue(int max) {
        throw new RuntimeException("Stub!");
    }

    public void setProgressValue(int progress) {
        throw new RuntimeException("Stub!");
    }

    public void setViceProgress(int progress) {
        throw new RuntimeException("Stub!");
    }

    public void setStep(int step) {
        throw new RuntimeException("Stub!");
    }

    public void setIndeterminate(boolean indeterminate) {
        throw new RuntimeException("Stub!");
    }

    public boolean isIndeterminate() {
        throw new RuntimeException("Stub!");
    }

    public void setInfiniteModeElement(Element element) {
        throw new RuntimeException("Stub!");
    }

    public void setMaxWidth(int maxWidth) {
        throw new RuntimeException("Stub!");
    }

    public void setMaxHeight(int maxHeight) {
        throw new RuntimeException("Stub!");
    }

    public Element getInfiniteModeElement() {
        throw new RuntimeException("Stub!");
    }

    public int getMin() {
        throw new RuntimeException("Stub!");
    }

    public int getMax() {
        throw new RuntimeException("Stub!");
    }

    public int getProgress() {
        throw new RuntimeException("Stub!");
    }

    public int getViceProgressValue() {
        throw new RuntimeException("Stub!");
    }

    public int getStep() {
        throw new RuntimeException("Stub!");
    }

    public boolean isInfiniteMode() {
        throw new RuntimeException("Stub!");
    }

    public int getMaxWidth() {
        throw new RuntimeException("Stub!");
    }

    public int getMaxHeight() {
        throw new RuntimeException("Stub!");
    }

    public void setProgressBackgroundElement(Element element) {
        throw new RuntimeException("Stub!");
    }

    public void setProgressElement(Element element) {
        throw new RuntimeException("Stub!");
    }

    public void setViceProgressElement(Element element) {
        throw new RuntimeException("Stub!");
    }

    public Element getBackgroundInstructElement() {
        throw new RuntimeException("Stub!");
    }

    public Element getProgressElement() {
        throw new RuntimeException("Stub!");
    }

    public Element getViceProgressElement() {
        throw new RuntimeException("Stub!");
    }

    public String getProgressHintText() {
        throw new RuntimeException("Stub!");
    }

    public void setProgressHintText(String text) {
        throw new RuntimeException("Stub!");
    }

    public void setProgressHintTextSize(int size) {
        throw new RuntimeException("Stub!");
    }

    public int getProgressHintTextSize() {
        throw new RuntimeException("Stub!");
    }

    public void setProgressHintTextColor(Color color) {
        throw new RuntimeException("Stub!");
    }

    public Color getProgressHintTextColor() {
        throw new RuntimeException("Stub!");
    }

    public void setProgressHintTextAlignment(int alignment) {
        throw new RuntimeException("Stub!");
    }

    public int getProgressHintTextAlignment() {
        throw new RuntimeException("Stub!");
    }

    public void enableDividerLines(boolean enable) {
        throw new RuntimeException("Stub!");
    }

    public boolean isDividerLinesEnabled() {
        throw new RuntimeException("Stub!");
    }

    public void setDividerLinesNumber(int number) {
        throw new RuntimeException("Stub!");
    }

    public int getDividerLinesNumber() {
        throw new RuntimeException("Stub!");
    }

    public void setDividerLineThickness(int thickness) {
        throw new RuntimeException("Stub!");
    }

    public int getDividerLineThickness() {
        throw new RuntimeException("Stub!");
    }

    public void setDividerLineColor(Color color) {
        throw new RuntimeException("Stub!");
    }

    public Color getDividerLineColor() {
        throw new RuntimeException("Stub!");
    }

    public void setProgressWidth(int progressWidth) {
        throw new RuntimeException("Stub!");
    }

    public int getProgressWidth() {
        throw new RuntimeException("Stub!");
    }

    public void setProgressColor(Color color) {
        throw new RuntimeException("Stub!");
    }

    public Color getProgressColor() {
        throw new RuntimeException("Stub!");
    }

    public void setProgressColors(int[] colors) {
        throw new RuntimeException("Stub!");
    }

    public int[] getProgressColors() {
        throw new RuntimeException("Stub!");
    }

    public void addBarObserver(BarObserver observer) {
        throw new RuntimeException("Stub!");
    }

    public void removeBarObserver(BarObserver observer) {
        throw new RuntimeException("Stub!");
    }
}
