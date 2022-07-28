package ohos.agp.components;

import java.util.Optional;

/* loaded from: ohos2.0.1.95.jar:ohos/agp/components/AttrSet.class */
public interface AttrSet {
    public static final String STYLE_ATTR = "style";

    Optional<String> getStyle();

    int getLength();

    Optional<Attr> getAttr(int i);

    Optional<Attr> getAttr(String str);
}
