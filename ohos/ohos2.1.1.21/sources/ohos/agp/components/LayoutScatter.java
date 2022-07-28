package ohos.agp.components;

import ohos.app.Context;
import ohos.global.resource.ResourceManager;

/* loaded from: ohos2.1.1.21.jar:ohos/agp/components/LayoutScatter.class */
public class LayoutScatter {

    /* loaded from: ohos2.1.1.21.jar:ohos/agp/components/LayoutScatter$Picker.class */
    public interface Picker {
        boolean isLoadClass(Class<?> cls);
    }

    LayoutScatter(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static LayoutScatter getInstance(Context context) {
        throw new RuntimeException("Stub!");
    }

    public LayoutScatter clone(Context context, ResourceManager resourceManager) {
        throw new RuntimeException("Stub!");
    }

    public Component parse(int xmlId, ComponentContainer root, boolean attachToRoot) {
        throw new RuntimeException("Stub!");
    }

    public Picker getPicker() {
        throw new RuntimeException("Stub!");
    }

    public void setPicker(Picker picker) {
        throw new RuntimeException("Stub!");
    }

    public Component createComponentElement(String fullClassName, AttrSet attrSet) {
        throw new RuntimeException("Stub!");
    }
}
