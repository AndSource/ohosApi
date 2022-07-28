package ohos.aafwk.ability;

import ohos.utils.Parcel;
import ohos.utils.Sequenceable;
import ohos.utils.zson.ZSONObject;

/* loaded from: ohos2.2.0.3.jar:ohos/aafwk/ability/FormBindingData.class */
public class FormBindingData implements Sequenceable {
    public static final Sequenceable.Producer<FormBindingData> PRODUCER = null;

    public FormBindingData() {
        throw new RuntimeException("Stub!");
    }

    public FormBindingData(ZSONObject data) {
        throw new RuntimeException("Stub!");
    }

    public FormBindingData(String zsonData) {
        throw new RuntimeException("Stub!");
    }

    public void updateData(ZSONObject data) {
        throw new RuntimeException("Stub!");
    }

    public String getDataString() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean marshalling(Parcel parcel) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean unmarshalling(Parcel parcel) {
        throw new RuntimeException("Stub!");
    }

    public void addImageData(String picName, byte[] data) {
        throw new RuntimeException("Stub!");
    }

    public void removeImageData(String picName) {
        throw new RuntimeException("Stub!");
    }
}
