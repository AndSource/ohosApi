package ohos.agp.components;

import ohos.agp.components.element.Element;
import ohos.app.Context;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/AbsSlider.class */
public abstract class AbsSlider extends ProgressBar {

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/components/AbsSlider$Formatter.class */
    public interface Formatter {
        String format(int i);
    }

    public AbsSlider(Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public AbsSlider(Context context, AttrSet attrSet) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public AbsSlider(Context context, AttrSet attrSet, String styleName) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public void setThumbElement(Element element) {
        throw new RuntimeException("Stub!");
    }

    public Element getThumbElement() {
        throw new RuntimeException("Stub!");
    }

    public void setFormatter(Formatter formatter) {
        throw new RuntimeException("Stub!");
    }

    public Formatter getFormatter() {
        throw new RuntimeException("Stub!");
    }
}
