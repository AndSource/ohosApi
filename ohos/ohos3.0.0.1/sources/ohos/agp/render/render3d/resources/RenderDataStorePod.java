package ohos.agp.render.render3d.resources;

import java.nio.ByteBuffer;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/render/render3d/resources/RenderDataStorePod.class */
public interface RenderDataStorePod {
    void createPod(String str, String str2, ByteBuffer byteBuffer);

    void destroyPod(String str, String str2);

    void set(String str, ByteBuffer byteBuffer);

    byte[] get(String str);

    void release();
}
