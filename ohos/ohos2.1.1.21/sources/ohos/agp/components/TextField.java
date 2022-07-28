package ohos.agp.components;

import ohos.agp.components.element.Element;
import ohos.app.Context;

/* loaded from: ohos2.1.1.21.jar:ohos/agp/components/TextField.class */
public class TextField extends Text {

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/components/TextField$CursorChangedListener.class */
    protected interface CursorChangedListener {
        void onCursorChange(TextField textField, int i, int i2);
    }

    public TextField(Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public TextField(Context context, AttrSet attrSet) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    public TextField(Context context, AttrSet attrSet, String styleName) {
        super(null);
        throw new RuntimeException("Stub!");
    }

    protected void setCursorChangedListener() {
        throw new RuntimeException("Stub!");
    }

    protected void setCursorChangedListener(CursorChangedListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void setBasement(Element element) {
        throw new RuntimeException("Stub!");
    }

    public Element getBasement() {
        throw new RuntimeException("Stub!");
    }
}
