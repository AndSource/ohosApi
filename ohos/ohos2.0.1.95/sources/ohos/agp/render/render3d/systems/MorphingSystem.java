package ohos.agp.render.render3d.systems;

/* loaded from: ohos2.0.1.95.jar:ohos/agp/render/render3d/systems/MorphingSystem.class */
public interface MorphingSystem {
    int getTargetCount(long j);

    String[] getTargetNames(long j);

    float[] getTargetWeights(long j);

    void setTargetNames(long j, String[] strArr);

    void setTargetWeights(long j, float[] fArr);
}
