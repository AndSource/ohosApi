package ohos.agp.render.render3d;

import java.util.Optional;

public interface Entity {
  public static final int INVALID_ENTITY = 2147483647;
  
  int getId();
  
  boolean isValid();
  
  <ComponentType extends Component> ComponentType addComponent(Class<ComponentType> paramClass);
  
  <ComponentType extends Component> Optional<ComponentType> getComponent(Class<ComponentType> paramClass);
  
  <ComponentType extends Component> void setComponent(ComponentType paramComponentType);
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/agp/render/render3d/Entity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */