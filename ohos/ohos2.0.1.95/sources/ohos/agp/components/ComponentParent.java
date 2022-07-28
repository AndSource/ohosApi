package ohos.agp.components;

import ohos.agp.components.ComponentContainer;

/* loaded from: ohos2.0.1.95.jar:ohos/agp/components/ComponentParent.class */
public interface ComponentParent {
    void postLayout();

    int getChildIndex(Component component);

    void removeComponent(Component component);

    void removeComponentAt(int i);

    void removeComponents(int i, int i2);

    ComponentContainer.LayoutConfig verifyLayoutConfig(ComponentContainer.LayoutConfig layoutConfig);

    ComponentParent getComponentParent();

    void moveChildToFront(Component component);

    boolean onDrag(Component component, DragEvent dragEvent);
}
