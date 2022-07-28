package ohos.agp.components.element;

import ohos.agp.components.Component;
import ohos.agp.components.element.Element;
import ohos.agp.render.ColorMatrix;
import ohos.app.Context;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/element/ImageAnimationElement.class */
public class ImageAnimationElement extends FrameAnimationElement implements Element.OnLayoutDirectionChangeListener {
    protected ImageAnimationCallBack mEndListener;

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/element/ImageAnimationElement$ImageAnimationCallBack.class */
    public interface ImageAnimationCallBack {
        void onAnimationEnd();

        void onAnimationStart();
    }

    public ImageAnimationElement() {
        throw new RuntimeException("Stub!");
    }

    public ImageAnimationElement(Context context, String mediaPath) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.element.FrameAnimationElement
    public void start() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.element.FrameAnimationElement
    public void stop() {
        throw new RuntimeException("Stub!");
    }

    public boolean isRunning() {
        throw new RuntimeException("Stub!");
    }

    public ImageAnimationElement setLoopCount(int loopedCount) {
        throw new RuntimeException("Stub!");
    }

    public int getLoopCount() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.element.Element
    public void setInheritDirection(boolean mirrored) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.element.Element
    public boolean isInheritDirection() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.element.Element
    public void setColorMatrix(ColorMatrix matrix) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.components.element.Element.OnLayoutDirectionChangeListener
    public boolean onLayoutDirectionChanged(Element element, Component.LayoutDirection direction) {
        throw new RuntimeException("Stub!");
    }

    public ImageAnimationElement addAnimationCallback(ImageAnimationCallBack listener) {
        throw new RuntimeException("Stub!");
    }

    public ImageAnimationElement removeAllAnimationCallbacks() {
        throw new RuntimeException("Stub!");
    }

    public ImageAnimationElement removeAnimationCallback(ImageAnimationCallBack listener) {
        throw new RuntimeException("Stub!");
    }
}
