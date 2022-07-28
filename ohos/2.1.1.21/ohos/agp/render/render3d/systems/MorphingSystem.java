package ohos.agp.render.render3d.systems;

public interface MorphingSystem {
  int getTargetCount(long paramLong);
  
  String[] getTargetNames(long paramLong);
  
  float[] getTargetWeights(long paramLong);
  
  void setTargetNames(long paramLong, String[] paramArrayOfString);
  
  void setTargetWeights(long paramLong, float[] paramArrayOffloat);
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/agp/render/render3d/systems/MorphingSystem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */