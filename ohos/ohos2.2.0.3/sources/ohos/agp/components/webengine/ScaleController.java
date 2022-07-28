package ohos.agp.components.webengine;

/* loaded from: ohos2.2.0.3.jar:ohos/agp/components/webengine/ScaleController.class */
public interface ScaleController {
    void setScale(int i);

    void setScalable(boolean z);

    boolean isScalable();

    void setGestureScalable(boolean z);

    boolean isGestureScalable();

    void setTextScale(int i);

    int getTextScale();

    void setScaleChangeListener(ScaleChangeListener scaleChangeListener);
}
