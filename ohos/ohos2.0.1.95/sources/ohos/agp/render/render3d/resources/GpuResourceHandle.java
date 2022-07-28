package ohos.agp.render.render3d.resources;

import ohos.agp.render.render3d.Engine;

/* loaded from: ohos2.0.1.95.jar:ohos/agp/render/render3d/resources/GpuResourceHandle.class */
public interface GpuResourceHandle {
    Engine getEngine();

    void release();

    boolean isValid();

    static boolean isValid(GpuResourceHandle handle) {
        throw new RuntimeException("Stub!");
    }
}
