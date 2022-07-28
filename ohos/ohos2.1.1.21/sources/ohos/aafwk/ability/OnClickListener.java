package ohos.aafwk.ability;

/* loaded from: ohos2.1.1.21.jar:ohos/aafwk/ability/OnClickListener.class */
public abstract class OnClickListener extends ViewListener {
    public abstract void onClick(int i, AbilityForm abilityForm, ViewsStatus viewsStatus);

    public OnClickListener() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.aafwk.ability.ViewListener
    public void onTouchEvent(AbilityForm form, ViewsStatus viewsStatus) {
        throw new RuntimeException("Stub!");
    }
}
