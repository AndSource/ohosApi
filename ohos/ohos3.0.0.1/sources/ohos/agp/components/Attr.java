package ohos.agp.components;

import ohos.agp.components.element.Element;
import ohos.agp.utils.Color;
import ohos.app.Context;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/Attr.class */
public interface Attr {
    String getName();

    String getStringValue();

    int getIntegerValue();

    boolean getBoolValue();

    float getFloatValue();

    long getLongValue();

    Element getElement();

    int getDimensionValue();

    Color getColorValue();

    Context getContext();
}
