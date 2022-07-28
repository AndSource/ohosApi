package ohos.aafwk.ability.continuation;

import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.2.0.3.jar:ohos/aafwk/ability/continuation/ExtraParams.class */
public class ExtraParams implements Sequenceable {
    public static final String DEVICETYPE_SMART_PAD = "011";
    public static final String DEVICETYPE_SMART_PHONE = "00E";
    public static final String DEVICETYPE_SMART_TV = "09C";
    public static final String DEVICETYPE_SMART_WATCH = "06D";

    public ExtraParams() {
        throw new RuntimeException("Stub!");
    }

    public ExtraParams(String[] devType, String targetBundleName, String description, String jsonParams) {
        throw new RuntimeException("Stub!");
    }

    public String[] getDevType() {
        throw new RuntimeException("Stub!");
    }

    public void setDevType(String[] devType) {
        throw new RuntimeException("Stub!");
    }

    public String getTargetBundleName() {
        throw new RuntimeException("Stub!");
    }

    public void setTargetBundleName(String targetBundleName) {
        throw new RuntimeException("Stub!");
    }

    public String getDescription() {
        throw new RuntimeException("Stub!");
    }

    public void setJsonParams(String jsonParams) {
        throw new RuntimeException("Stub!");
    }

    public String getJsonParams() {
        throw new RuntimeException("Stub!");
    }

    public void setDescription(String description) {
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
}
