package ohos.global.resource.solidxml;

import ohos.global.resource.ResourceManager;

/* loaded from: ohos2.1.1.21.jar:ohos/global/resource/solidxml/Attribute.class */
public abstract class Attribute {
    public abstract String getName();

    public abstract String getStringValue();

    public abstract TypedAttribute getTypedAttribute(ResourceManager resourceManager);

    public Attribute() {
        throw new RuntimeException("Stub!");
    }
}
