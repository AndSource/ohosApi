package ohos.agp.components.webengine;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/webengine/ScaleController.class */
public interface ScaleController {
    void setScale(int i);

    boolean scaleUp();

    boolean scaleDown();

    void setScalable(boolean z);

    boolean isScalable();

    void setGestureScalable(boolean z);

    boolean isGestureScalable();

    void setTextScale(int i);

    int getTextScale();

    void setScaleChangeListener(ScaleChangeListener scaleChangeListener);
}
