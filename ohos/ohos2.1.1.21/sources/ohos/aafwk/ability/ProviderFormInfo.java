package ohos.aafwk.ability;

import ohos.agp.components.ComponentProvider;
import ohos.app.Context;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.1.1.21.jar:ohos/aafwk/ability/ProviderFormInfo.class */
public class ProviderFormInfo implements Sequenceable {
    public static final Sequenceable.Producer<ProviderFormInfo> PRODUCER = null;

    public ProviderFormInfo(int resId, Context context) {
        throw new RuntimeException("Stub!");
    }

    public ProviderFormInfo() {
        throw new RuntimeException("Stub!");
    }

    public static ProviderFormInfo createFromParcel(Parcel parcel) {
        throw new RuntimeException("Stub!");
    }

    public ComponentProvider getComponentProvider() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean marshalling(Parcel out) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean unmarshalling(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    public void mergeActions(ComponentProvider componentProviderActions) {
        throw new RuntimeException("Stub!");
    }

    public FormBindingData getJsBindingData() {
        throw new RuntimeException("Stub!");
    }

    public void setJsBindingData(FormBindingData data) {
        throw new RuntimeException("Stub!");
    }

    public boolean isJsForm() {
        throw new RuntimeException("Stub!");
    }
}
