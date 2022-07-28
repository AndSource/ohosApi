package ohos.agp.components;

import ohos.agp.components.element.Element;
import ohos.app.Context;

/* loaded from: ohos2.0.1.95.jar:ohos/agp/components/Rating.class */
public class Rating extends AbsSlider {

    /* loaded from: ohos2.0.1.95.jar:ohos/agp/components/Rating$RatingChangedListener.class */
    public interface RatingChangedListener {
        void onProgressChanged(Rating rating, int i, boolean z);

        void onStartTrackingTouch(Rating rating);

        void onStopTrackingTouch(Rating rating);
    }

    public Rating(Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public Rating(Context context, AttrSet attrSet) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public Rating(Context context, AttrSet attrSet, String styleName) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public float getGrainSize() {
        throw new RuntimeException("Stub!");
    }

    public void setGrainSize(float size) {
        throw new RuntimeException("Stub!");
    }

    public void setScore(float value) {
        throw new RuntimeException("Stub!");
    }

    public float getScore() {
        throw new RuntimeException("Stub!");
    }

    public void setIsOperable(boolean isOperable) {
        throw new RuntimeException("Stub!");
    }

    public boolean isOperable() {
        throw new RuntimeException("Stub!");
    }

    public void setRatingItems(int number) {
        throw new RuntimeException("Stub!");
    }

    public int getRatingItems() {
        throw new RuntimeException("Stub!");
    }

    public void setRatingChangedListener(RatingChangedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void setFilledElement(Element element) {
        throw new RuntimeException("Stub!");
    }

    public Element getFilledElement() {
        throw new RuntimeException("Stub!");
    }

    public void setUnfilledElement(Element element) {
        throw new RuntimeException("Stub!");
    }

    public Element getHalfFilledElement() {
        throw new RuntimeException("Stub!");
    }

    public void setHalfFilledElement(Element element) {
        throw new RuntimeException("Stub!");
    }

    public Element getUnfilledElement() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.AbsSlider
    public Element getThumbElement() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.AbsSlider
    public void setThumbElement(Element element) {
        throw new RuntimeException("Stub!");
    }
}
