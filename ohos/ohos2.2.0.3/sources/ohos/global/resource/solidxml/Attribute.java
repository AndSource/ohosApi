package ohos.global.resource.solidxml;

import ohos.global.resource.ResourceManager;

/* loaded from: ohos2.2.0.3.jar:ohos/global/resource/solidxml/Attribute.class */
public abstract class Attribute {
    public abstract String getName();

    public abstract String getStringValue();

    public abstract TypedAttribute getTypedAttribute(ResourceManager resourceManager);

    public Attribute() {
        throw new RuntimeException("Stub!");
    }
}
