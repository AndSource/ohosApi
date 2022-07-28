package ohos.agp.text;

import ohos.agp.components.Component;
import ohos.multimodalinput.event.TouchEvent;

/* loaded from: ohos2.1.1.21.jar:ohos/agp/text/RichText.class */
public class RichText {

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/text/RichText$TouchEventListener.class */
    public interface TouchEventListener {
        boolean onTouchEvent(Component component, TouchEvent touchEvent);
    }

    RichText(long nativeRichText) {
        throw new RuntimeException("Stub!");
    }

    public void addTouchEventListener(TouchEventListener listener, int start, int end) {
        throw new RuntimeException("Stub!");
    }

    public void setLeadingMargin(int firstMargin, int restMargin) {
        throw new RuntimeException("Stub!");
    }

    public int getLeadingMargin(boolean firstMargin) {
        throw new RuntimeException("Stub!");
    }
}
