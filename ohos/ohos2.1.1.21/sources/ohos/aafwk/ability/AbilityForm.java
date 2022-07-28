package ohos.aafwk.ability;

import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.ComponentProvider;
import ohos.app.Context;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.1.1.21.jar:ohos/aafwk/ability/AbilityForm.class */
public final class AbilityForm implements Sequenceable {
    public static final String PERMISSION_REQUIRE_FORM = "ohos.permission.REQUIRE_FORM";
    public static final Sequenceable.Producer<AbilityForm> PRODUCER = null;

    /* loaded from: ohos2.1.1.21.jar:ohos/aafwk/ability/AbilityForm$OnAcquiredCallback.class */
    public interface OnAcquiredCallback {
        void onAcquired(AbilityForm abilityForm);

        void onDestroyed(AbilityForm abilityForm);
    }

    public AbilityForm(int resId, Context context) {
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

    public Intent getFullPageIntent() {
        throw new RuntimeException("Stub!");
    }

    public void setText(int componentId, String text) {
        throw new RuntimeException("Stub!");
    }

    public void setTextSize(int componentId, int size) {
        throw new RuntimeException("Stub!");
    }

    public void sendActions(ComponentProvider remoteComponentActions) {
        throw new RuntimeException("Stub!");
    }

    public Component getComponent() {
        throw new RuntimeException("Stub!");
    }

    public boolean registerViewListener(int componentId, ViewListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void startFullPage() {
        throw new RuntimeException("Stub!");
    }

    public void setFullPageIntent(Intent intent) {
        throw new RuntimeException("Stub!");
    }
}
