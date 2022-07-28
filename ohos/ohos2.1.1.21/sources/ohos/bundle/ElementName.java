package ohos.bundle;

import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.1.1.21.jar:ohos/bundle/ElementName.class */
public class ElementName implements Sequenceable {
    public static final Sequenceable.Producer<ElementName> PRODUCER = null;

    public ElementName() {
        throw new RuntimeException("Stub!");
    }

    public ElementName(String deviceId, String bundleName, String abilityName) {
        throw new RuntimeException("Stub!");
    }

    public ElementName(ElementName elementName) {
        throw new RuntimeException("Stub!");
    }

    public String getDeviceId() {
        throw new RuntimeException("Stub!");
    }

    public void setDeviceId(String deviceId) {
        throw new RuntimeException("Stub!");
    }

    public String getAbilityName() {
        throw new RuntimeException("Stub!");
    }

    public void setAbilityName(String name) {
        throw new RuntimeException("Stub!");
    }

    public String getBundleName() {
        throw new RuntimeException("Stub!");
    }

    public void setBundleName(String bundleName) {
        throw new RuntimeException("Stub!");
    }

    public String getURI() {
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

    public boolean equals(Object object) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public static ElementName createRelative(String bundleName, String abilityName, String deviceId) {
        throw new RuntimeException("Stub!");
    }

    public String getShortClassName() {
        throw new RuntimeException("Stub!");
    }

    public static ElementName unflattenFromString(String elementName) {
        throw new RuntimeException("Stub!");
    }
}
