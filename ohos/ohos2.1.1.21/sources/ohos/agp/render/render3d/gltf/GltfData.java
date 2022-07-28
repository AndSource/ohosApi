package ohos.agp.render.render3d.gltf;

import java.util.List;

/* loaded from: ohos2.1.1.21.jar:ohos/agp/render/render3d/gltf/GltfData.class */
public interface GltfData {
    public static final int INVALID_INDEX = -1;

    boolean isValid();

    String getError();

    void releaseBuffers();

    void release();

    int getSceneCount();

    int getDefaultSceneIndex();

    int getThumbnailCount();

    List<String> getExternalUris();

    String getGltfUri();

    String getBaseUri();
}
