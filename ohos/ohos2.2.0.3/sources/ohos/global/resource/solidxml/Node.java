package ohos.global.resource.solidxml;

import java.util.List;
import ohos.global.resource.ResourceManager;

/* loaded from: ohos2.2.0.3.jar:ohos/global/resource/solidxml/Node.class */
public abstract class Node {
    public abstract String getName();

    public abstract String getStringValue();

    public abstract Node getChild();

    public abstract Node getSibling();

    public abstract List<Attribute> getAttributes();

    @Deprecated
    public abstract List<TypedAttribute> getTypedAttribute(ResourceManager resourceManager);

    public abstract List<TypedAttribute> getTypedAttributes(ResourceManager resourceManager);

    public abstract List<TypedAttribute> getTypedAttributes(Pattern pattern);

    public abstract List<TypedAttribute> getTypedAttributes(Pattern pattern, String[] strArr);

    public Node() {
        throw new RuntimeException("Stub!");
    }
}
