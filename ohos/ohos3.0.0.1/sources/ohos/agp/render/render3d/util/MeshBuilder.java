package ohos.agp.render.render3d.util;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import ohos.agp.render.render3d.resources.ResourceHandle;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/render/render3d/util/MeshBuilder.class */
public interface MeshBuilder {
    void allocate();

    void release();

    void addPrimitive(Primitive primitive);

    void setVertexData(int i, VertexData vertexData);

    void setIndexData(int i, ByteBuffer byteBuffer);

    void setAabb(int i, BoundingBox boundingBox);

    int getVertexCount();

    int getIndexCount();

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/render/render3d/util/MeshBuilder$Primitive.class */
    public static class Primitive {
        public Primitive() {
            throw new RuntimeException("Stub!");
        }

        public int getVertexCount() {
            throw new RuntimeException("Stub!");
        }

        public void setVertexCount(int vertexCount) {
            throw new RuntimeException("Stub!");
        }

        public int getIndexCount() {
            throw new RuntimeException("Stub!");
        }

        public void setIndexCount(int indexCount) {
            throw new RuntimeException("Stub!");
        }

        public ResourceHandle getMaterial() {
            throw new RuntimeException("Stub!");
        }

        public void setMaterial(ResourceHandle material) {
            throw new RuntimeException("Stub!");
        }

        public boolean isTangentDataDefined() {
            throw new RuntimeException("Stub!");
        }

        public void setTangentDataDefined(boolean isTangentDataDefined) {
            throw new RuntimeException("Stub!");
        }

        public boolean isColorDataDefined() {
            throw new RuntimeException("Stub!");
        }

        public void setColorDataDefined(boolean isColorDataDefined) {
            throw new RuntimeException("Stub!");
        }

        public boolean isJointDataDefined() {
            throw new RuntimeException("Stub!");
        }

        public void setJointDataDefined(boolean isJointDataDefined) {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/agp/render/render3d/util/MeshBuilder$VertexData.class */
    public static class VertexData {
        public VertexData() {
            throw new RuntimeException("Stub!");
        }

        public FloatBuffer getPositions() {
            throw new RuntimeException("Stub!");
        }

        public void setPositions(FloatBuffer positions) {
            throw new RuntimeException("Stub!");
        }

        public FloatBuffer getNormals() {
            throw new RuntimeException("Stub!");
        }

        public void setNormals(FloatBuffer normals) {
            throw new RuntimeException("Stub!");
        }

        public FloatBuffer getTexCoords() {
            throw new RuntimeException("Stub!");
        }

        public void setTexCoords(FloatBuffer texCoords) {
            throw new RuntimeException("Stub!");
        }

        public FloatBuffer getTangents() {
            throw new RuntimeException("Stub!");
        }

        public void setTangents(FloatBuffer tangents) {
            throw new RuntimeException("Stub!");
        }

        public FloatBuffer getColors() {
            throw new RuntimeException("Stub!");
        }

        public void setColors(FloatBuffer colors) {
            throw new RuntimeException("Stub!");
        }
    }
}
