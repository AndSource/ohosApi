package ohos.agp.render.render3d;

import java.util.Optional;

/* loaded from: ohos2.0.1.95.jar:ohos/agp/render/render3d/Entity.class */
public interface Entity {
    public static final int INVALID_ENTITY = Integer.MAX_VALUE;

    int getId();

    boolean isValid();

    <ComponentType extends Component> ComponentType addComponent(Class<ComponentType> cls);

    <ComponentType extends Component> Optional<ComponentType> getComponent(Class<ComponentType> cls);

    <ComponentType extends Component> void setComponent(ComponentType componenttype);
}
