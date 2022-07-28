package ohos.agp.render.render3d.resources;

import ohos.agp.render.render3d.math.Vector3;
import ohos.agp.render.render3d.math.Vector4;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/render/render3d/resources/MaterialDesc.class */
public class MaterialDesc {
    public static final int MATERIAL_CLEAR_COAT_BIT = 2;
    public static final int MATERIAL_DOUBLE_SIDED_BIT = 1;
    public static final int MATERIAL_NORMAL_MAP_BIT = 8;
    public static final int MATERIAL_SHADOW_RECEIVER_BIT = 4;

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/render/render3d/resources/MaterialDesc$MaterialAlphaMode.class */
    public enum MaterialAlphaMode {
        UNKNOWN,
        OPAQUE,
        MASK,
        BLEND
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/render/render3d/resources/MaterialDesc$MaterialType.class */
    public enum MaterialType {
        UNKNOWN,
        METALLIC_ROUGHNESS,
        SPECULAR_GLOSSINESS,
        UNLIT,
        UNLIT_SHADOW_ALPHA
    }

    public MaterialDesc() {
        throw new RuntimeException("Stub!");
    }

    public MaterialType getType() {
        throw new RuntimeException("Stub!");
    }

    public void setType(MaterialType type) {
        throw new RuntimeException("Stub!");
    }

    public GpuResourceHandle getBaseColor() {
        throw new RuntimeException("Stub!");
    }

    public void setBaseColor(GpuResourceHandle baseColor) {
        throw new RuntimeException("Stub!");
    }

    public GpuResourceHandle getNormal() {
        throw new RuntimeException("Stub!");
    }

    public void setNormal(GpuResourceHandle normal) {
        throw new RuntimeException("Stub!");
    }

    public GpuResourceHandle getEmissive() {
        throw new RuntimeException("Stub!");
    }

    public void setEmissive(GpuResourceHandle emissive) {
        throw new RuntimeException("Stub!");
    }

    public GpuResourceHandle getMaterial() {
        throw new RuntimeException("Stub!");
    }

    public void setMaterial(GpuResourceHandle material) {
        throw new RuntimeException("Stub!");
    }

    public GpuResourceHandle getAmbientOcclusion() {
        throw new RuntimeException("Stub!");
    }

    public void setAmbientOcclusion(GpuResourceHandle ambientOcclusion) {
        throw new RuntimeException("Stub!");
    }

    public GpuResourceHandle getSampler() {
        throw new RuntimeException("Stub!");
    }

    public void setSampler(GpuResourceHandle sampler) {
        throw new RuntimeException("Stub!");
    }

    public Vector4 getBaseColorFactor() {
        throw new RuntimeException("Stub!");
    }

    public void setBaseColorFactor(Vector4 baseColorFactor) {
        throw new RuntimeException("Stub!");
    }

    public Vector3 getEmissiveFactor() {
        throw new RuntimeException("Stub!");
    }

    public void setEmissiveFactor(Vector3 emissiveFactor) {
        throw new RuntimeException("Stub!");
    }

    public float getAmbientOcclusionFactor() {
        throw new RuntimeException("Stub!");
    }

    public void setAmbientOcclusionFactor(float ambientOcclusionFactor) {
        throw new RuntimeException("Stub!");
    }

    public float getRoughnessFactor() {
        throw new RuntimeException("Stub!");
    }

    public void setRoughnessFactor(float roughnessFactor) {
        throw new RuntimeException("Stub!");
    }

    public float getMetallicFactor() {
        throw new RuntimeException("Stub!");
    }

    public void setMetallicFactor(float metallicFactor) {
        throw new RuntimeException("Stub!");
    }

    public float getReflectance() {
        throw new RuntimeException("Stub!");
    }

    public void setReflectance(float reflectance) {
        throw new RuntimeException("Stub!");
    }

    public float getNormalScale() {
        throw new RuntimeException("Stub!");
    }

    public void setNormalScale(float normalScale) {
        throw new RuntimeException("Stub!");
    }

    public Vector3 getSpecularFactor() {
        throw new RuntimeException("Stub!");
    }

    public void setSpecularFactor(Vector3 specularFactor) {
        throw new RuntimeException("Stub!");
    }

    public float getGlossinessFactor() {
        throw new RuntimeException("Stub!");
    }

    public void setGlossinessFactor(float glossinessFactor) {
        throw new RuntimeException("Stub!");
    }

    public float getClearCoatFactor() {
        throw new RuntimeException("Stub!");
    }

    public void setClearCoatFactor(float clearCoatFactor) {
        throw new RuntimeException("Stub!");
    }

    public float getClearCoatRoughness() {
        throw new RuntimeException("Stub!");
    }

    public void setClearCoatRoughness(float clearCoatRoughness) {
        throw new RuntimeException("Stub!");
    }

    public MaterialAlphaMode getAlphaMode() {
        throw new RuntimeException("Stub!");
    }

    public void setAlphaMode(MaterialAlphaMode alphaMode) {
        throw new RuntimeException("Stub!");
    }

    public float getAlphaCutoff() {
        throw new RuntimeException("Stub!");
    }

    public void setAlphaCutoff(float alphaCutoff) {
        throw new RuntimeException("Stub!");
    }

    public int getMaterialFlags() {
        throw new RuntimeException("Stub!");
    }

    public void setMaterialFlags(int materialFlags) {
        throw new RuntimeException("Stub!");
    }
}
