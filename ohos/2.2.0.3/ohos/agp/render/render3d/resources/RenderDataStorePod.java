package ohos.agp.render.render3d.resources;

import java.nio.ByteBuffer;

public interface RenderDataStorePod {
  void createPod(String paramString1, String paramString2, ByteBuffer paramByteBuffer);
  
  void destroyPod(String paramString1, String paramString2);
  
  void set(String paramString, ByteBuffer paramByteBuffer);
  
  byte[] get(String paramString);
  
  void release();
}


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/agp/render/render3d/resources/RenderDataStorePod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */