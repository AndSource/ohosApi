package ohos.agp.text.richstyles;

import ohos.agp.components.Component;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/text/richstyles/ClickRichStyle.class */
public class ClickRichStyle extends RichStyle {

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/text/richstyles/ClickRichStyle$ClickListener.class */
    public interface ClickListener {
        void onClick(Component component);
    }

    public ClickRichStyle(ClickListener listener) {
        throw new RuntimeException("Stub!");
    }
}
