package ohos.agp.components;

import ohos.agp.render.Paint;
import ohos.app.Context;

/* loaded from: ohos2.0.1.95.jar:ohos/agp/components/IndexBar.class */
public class IndexBar extends Component {

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/components/IndexBar$OnSelectedListener.class */
    public interface OnSelectedListener {
        void onSelected(int i);
    }

    public IndexBar(Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public IndexBar(Context context, AttrSet attrSet) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public IndexBar(Context context, AttrSet attrSet, String styleName) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public void setIndexRadius(float radius) {
        throw new RuntimeException("Stub!");
    }

    public float getIndexRadius() {
        throw new RuntimeException("Stub!");
    }

    public void setIndexPaint(Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void setIndexString(String[] indexString, Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void languageSwitch(String[] characterStrings) {
        throw new RuntimeException("Stub!");
    }

    public String[] getIndexString() {
        throw new RuntimeException("Stub!");
    }

    public void setSelectedCallback(OnSelectedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public OnSelectedListener getSelectedCallback() {
        throw new RuntimeException("Stub!");
    }

    public void setSelectedCount(int count) {
        throw new RuntimeException("Stub!");
    }

    public void setSelectedPaint(Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void setStringSelectedPaint(Paint paint) {
        throw new RuntimeException("Stub!");
    }

    public void setIndexBarExpandedStatus(boolean expanded) {
        throw new RuntimeException("Stub!");
    }

    public int getIndexBarStatus() {
        throw new RuntimeException("Stub!");
    }

    public int getSelectedCount() {
        throw new RuntimeException("Stub!");
    }

    public void setSelectedString(String indexString) {
        throw new RuntimeException("Stub!");
    }

    public String getSelectedString() {
        throw new RuntimeException("Stub!");
    }

    public void setMaxCount(int maxCount) {
        throw new RuntimeException("Stub!");
    }

    public int getMaxCount() {
        throw new RuntimeException("Stub!");
    }

    public void setMinCount(int minCount) {
        throw new RuntimeException("Stub!");
    }

    public int getMinCount() {
        throw new RuntimeException("Stub!");
    }

    public void setMinCountAndMaxCount(int minCount, int maxCount) {
        throw new RuntimeException("Stub!");
    }

    public Paint getIndexPaint() {
        throw new RuntimeException("Stub!");
    }

    public Paint getIndexStringPaint() {
        throw new RuntimeException("Stub!");
    }

    public Paint getSelectedPaint() {
        throw new RuntimeException("Stub!");
    }

    public Paint getStringSelectedPaint() {
        throw new RuntimeException("Stub!");
    }
}
