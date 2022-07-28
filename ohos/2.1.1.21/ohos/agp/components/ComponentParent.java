package ohos.agp.components;

public interface ComponentParent {
  void postLayout();
  
  int getChildIndex(Component paramComponent);
  
  void removeComponent(Component paramComponent);
  
  void removeComponentAt(int paramInt);
  
  void removeComponents(int paramInt1, int paramInt2);
  
  ComponentContainer.LayoutConfig verifyLayoutConfig(ComponentContainer.LayoutConfig paramLayoutConfig);
  
  ComponentParent getComponentParent();
  
  void moveChildToFront(Component paramComponent);
  
  boolean onDrag(Component paramComponent, DragEvent paramDragEvent);
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/agp/components/ComponentParent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */