package ohos.agp.render.opengl;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/render/opengl/GLES30.class */
public class GLES30 extends GLES20 {
    public static final int GL_DEPTH24_STENCIL8 = 35056;
    public static final int GL_DEPTH_STENCIL_ATTACHMENT = 33306;
    public static final int GL_DRAW_FRAMEBUFFER = 36009;
    public static final int GL_READ_FRAMEBUFFER = 36008;
    public static final int GL_RGBA8 = 32856;

    public GLES30() {
        throw new RuntimeException("Stub!");
    }

    public static void glBindFramebuffer(int target, int frameBuffer) {
        throw new RuntimeException("Stub!");
    }

    public static void glBindRenderbuffer(int target, int renderbuffer) {
        throw new RuntimeException("Stub!");
    }

    public static void glRenderbufferStorageMultisample(int target, int samples, int internalformat, int width, int height) {
        throw new RuntimeException("Stub!");
    }

    public static void glBlitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
        throw new RuntimeException("Stub!");
    }

    public static void glDrawBuffers(int n, int[] buffers) {
        throw new RuntimeException("Stub!");
    }

    public static void glGenVertexArrays(int n, int[] arrays) {
        throw new RuntimeException("Stub!");
    }

    public static void glBindVertexArray(int array) {
        throw new RuntimeException("Stub!");
    }

    public static void glWaitSync(long sync, int flags, long timeout) {
        throw new RuntimeException("Stub!");
    }

    public static void glTransformFeedbackVaryings(int program, int count, String[] varyings, int bufferMode) {
        throw new RuntimeException("Stub!");
    }

    public static void glReadPixels(int x, int y, int width, int height, int format, int type, int data) {
        throw new RuntimeException("Stub!");
    }

    public static void glReadBuffer(int src) {
        throw new RuntimeException("Stub!");
    }

    public static Buffer glMapBufferRange(int target, int offset, int length, int access) {
        throw new RuntimeException("Stub!");
    }

    public static long glFenceSync(int condition, int flags) {
        throw new RuntimeException("Stub!");
    }

    public static void glBeginTransformFeedback(int primitiveMode) {
        throw new RuntimeException("Stub!");
    }

    public static void glEndTransformFeedback() {
        throw new RuntimeException("Stub!");
    }

    public static void glDeleteVertexArrays(int n, int[] arrays) {
        throw new RuntimeException("Stub!");
    }

    public static void glBindBufferBase(int target, int index, int buffer) {
        throw new RuntimeException("Stub!");
    }

    public static boolean glUnmapBuffer(int target) {
        throw new RuntimeException("Stub!");
    }

    public static void glDrawRangeElements(int mode, int start, int end, int count, int type, Buffer indices) {
        throw new RuntimeException("Stub!");
    }

    public static void glTexImage3D(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, Buffer data) {
        throw new RuntimeException("Stub!");
    }

    public static void glTexSubImage3D(int target, int level, int xOffset, int yOffset, int zOffset, int width, int height, int depth, int format, int type, Buffer data) {
        throw new RuntimeException("Stub!");
    }

    public static void glCopyTexSubImage3D(int target, int level, int xOffset, int yOffset, int zOffset, int x, int y, int width, int height) {
        throw new RuntimeException("Stub!");
    }

    public static void glCompressedTexImage3D(int target, int level, int internalFormat, int width, int height, int depth, int border, int imageSize, Buffer data) {
        throw new RuntimeException("Stub!");
    }

    public static void glCompressedTexSubImage3D(int target, int level, int xOffset, int yOffset, int zOffset, int width, int height, int depth, int format, int imageSize, Buffer data) {
        throw new RuntimeException("Stub!");
    }

    public static void glGenQueries(int n, IntBuffer ids) {
        throw new RuntimeException("Stub!");
    }

    public static void glDeleteQueries(int n, IntBuffer ids) {
        throw new RuntimeException("Stub!");
    }

    public static boolean glIsQuery(int id) {
        throw new RuntimeException("Stub!");
    }

    public static void glBeginQuery(int target, int id) {
        throw new RuntimeException("Stub!");
    }

    public static void glEndQuery(int target) {
        throw new RuntimeException("Stub!");
    }

    public static void glGetQueryiv(int target, int pName, IntBuffer params) {
        throw new RuntimeException("Stub!");
    }

    public static void glGetQueryObjectuiv(int id, int pName, IntBuffer params) {
        throw new RuntimeException("Stub!");
    }

    public static void glGetBufferPointerv(int target, int pName, Buffer params) {
        throw new RuntimeException("Stub!");
    }

    public static void glBindBufferRange(int target, int index, int buffer, int offset, int size) {
        throw new RuntimeException("Stub!");
    }

    public static void glGetTransformFeedbackVarying(int program, int index, int bufsize, int[] length, int[] size, int[] type, byte[] name) {
        throw new RuntimeException("Stub!");
    }

    public static void glVertexAttribIPointer(int index, int size, int type, int stride, int offset) {
        throw new RuntimeException("Stub!");
    }

    public static void glGetVertexAttribIiv(int index, int pName, int[] params) {
        throw new RuntimeException("Stub!");
    }

    public static void glGetVertexAttribIuiv(int index, int pName, int[] params) {
        throw new RuntimeException("Stub!");
    }

    public static void glVertexAttribI4i(int index, int v0, int v1, int v2, int v3) {
        throw new RuntimeException("Stub!");
    }

    public static void glVertexAttribI4ui(int index, int v0, int v1, int v2, int v3) {
        throw new RuntimeException("Stub!");
    }

    public static void glVertexAttribI4iv(int index, int[] v) {
        throw new RuntimeException("Stub!");
    }

    public static void glVertexAttribI4uiv(int index, int[] v) {
        throw new RuntimeException("Stub!");
    }

    public static void glGetUniformuiv(int program, int location, int[] params) {
        throw new RuntimeException("Stub!");
    }

    public static int glGetFragDataLocation(int program, String name) {
        throw new RuntimeException("Stub!");
    }

    public static void glUniform1ui(int location, int v0) {
        throw new RuntimeException("Stub!");
    }

    public static void glUniform2ui(int location, int v0, int v1) {
        throw new RuntimeException("Stub!");
    }

    public static void glUniformMatrix2x3fv(int location, int count, boolean transpose, FloatBuffer value) {
        throw new RuntimeException("Stub!");
    }

    public static void glUniform3ui(int location, int v0, int v1, int v2) {
        throw new RuntimeException("Stub!");
    }

    public static void glUniformMatrix3x2fv(int location, int count, boolean transpose, FloatBuffer value) {
        throw new RuntimeException("Stub!");
    }

    public static void glUniformMatrix2x4fv(int location, int count, boolean transpose, FloatBuffer value) {
        throw new RuntimeException("Stub!");
    }

    public static void glUniform4ui(int location, int v0, int v1, int v2, int v3) {
        throw new RuntimeException("Stub!");
    }

    public static void glUniform1uiv(int location, int count, int[] value) {
        throw new RuntimeException("Stub!");
    }

    public static void glUniformMatrix4x2fv(int location, int count, boolean transpose, FloatBuffer value) {
        throw new RuntimeException("Stub!");
    }

    public static void glUniform2uiv(int location, int count, int[] value) {
        throw new RuntimeException("Stub!");
    }

    public static void glUniformMatrix3x4fv(int location, int count, boolean transpose, FloatBuffer value) {
        throw new RuntimeException("Stub!");
    }

    public static void glUniform3uiv(int location, int count, int[] value) {
        throw new RuntimeException("Stub!");
    }

    public static void glUniformMatrix4x3fv(int location, int count, boolean transpose, FloatBuffer value) {
        throw new RuntimeException("Stub!");
    }

    public static void glFramebufferTextureLayer(int target, int attachment, int texture, int level, int layer) {
        throw new RuntimeException("Stub!");
    }

    public static void glFlushMappedBufferRange(int target, int offset, int length) {
        throw new RuntimeException("Stub!");
    }

    public static boolean glIsVertexArray(int array) {
        throw new RuntimeException("Stub!");
    }

    public static void glGetIntegerIndexv(int target, int index, IntBuffer data) {
        throw new RuntimeException("Stub!");
    }

    public static void glSamplerParameteri(int sampler, int pName, int param) {
        throw new RuntimeException("Stub!");
    }

    public static void glSamplerParameteriv(int sampler, int pName, int[] params) {
        throw new RuntimeException("Stub!");
    }

    public static void glSamplerParameterf(int sampler, int pName, float param) {
        throw new RuntimeException("Stub!");
    }

    public static void glSamplerParameterfv(int sampler, int pName, float[] params) {
        throw new RuntimeException("Stub!");
    }

    public static void glGetSamplerParameteriv(int sampler, int pName, int[] params) {
        throw new RuntimeException("Stub!");
    }

    public static void glGetSamplerParameterfv(int sampler, int pName, float[] params) {
        throw new RuntimeException("Stub!");
    }

    public static void glVertexAttribDivisor(int index, int divisor) {
        throw new RuntimeException("Stub!");
    }

    public static void glBindTransformFeedback(int target, int id) {
        throw new RuntimeException("Stub!");
    }

    public static void glDeleteTransformFeedbacks(int n, int[] ids) {
        throw new RuntimeException("Stub!");
    }

    public static void glGenTransformFeedbacks(int n, int[] ids) {
        throw new RuntimeException("Stub!");
    }

    public static boolean glIsTransformFeedback(int id) {
        throw new RuntimeException("Stub!");
    }

    public static void glPauseTransformFeedback() {
        throw new RuntimeException("Stub!");
    }

    public static void glResumeTransformFeedback() {
        throw new RuntimeException("Stub!");
    }

    public static void glGetProgramBinary(int program, int bufSize, int[] length, int[] binaryFormat, Buffer binary) {
        throw new RuntimeException("Stub!");
    }

    public static void glProgramBinary(int program, int binaryFormat, Buffer binary, int length) {
        throw new RuntimeException("Stub!");
    }

    public static void glProgramParameteri(int program, int pName, int value) {
        throw new RuntimeException("Stub!");
    }

    public static void glInvalidateFramebuffer(int target, int numAttachments, int[] attachments) {
        throw new RuntimeException("Stub!");
    }

    public static void glInvalidateSubFramebuffer(int target, int numAttachments, int[] attachments, int x, int y, int width, int height) {
        throw new RuntimeException("Stub!");
    }

    public static void glTexStorage2D(int target, int levels, int internalformat, int width, int height) {
        throw new RuntimeException("Stub!");
    }

    public static void glTexStorage3D(int target, int levels, int internalformat, int width, int height, int depth) {
        throw new RuntimeException("Stub!");
    }

    public static void glGetInternalformativ(int target, int internalformat, int pName, int bufSize, int[] params) {
        throw new RuntimeException("Stub!");
    }

    public static void glUniform4uiv(int location, int count, int[] value) {
        throw new RuntimeException("Stub!");
    }

    public static void glClearBufferiv(int buffer, int drawbuffer, int[] value) {
        throw new RuntimeException("Stub!");
    }

    public static void glClearBufferuiv(int buffer, int drawbuffer, int[] value) {
        throw new RuntimeException("Stub!");
    }

    public static void glClearBufferfv(int buffer, int drawbuffer, float[] value) {
        throw new RuntimeException("Stub!");
    }

    public static void glClearBufferfi(int buffer, int drawbuffer, float depth, int stencil) {
        throw new RuntimeException("Stub!");
    }

    public static String glGetStringi(int name, int index) {
        throw new RuntimeException("Stub!");
    }

    public static void glCopyBufferSubData(int readTarget, int writeTarget, int readOffset, int writeOffset, int size) {
        throw new RuntimeException("Stub!");
    }

    public static void glGetUniformIndices(int program, String[] uniformNames, int[] uniformIndices) {
        throw new RuntimeException("Stub!");
    }

    public static void glGetActiveUniformsiv(int program, int uniformCount, int[] uniformIndices, int pName, int[] params) {
        throw new RuntimeException("Stub!");
    }

    public static int glGetUniformBlockIndex(int program, String uniformBlockName) {
        throw new RuntimeException("Stub!");
    }

    public static void glGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pName, int[] params) {
        throw new RuntimeException("Stub!");
    }

    public static void glGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize, int[] length, byte[] uniformBlockName) {
        throw new RuntimeException("Stub!");
    }

    public static void glUniformBlockBinding(int program, int uniformBlockIndex, int uniformBlockBinding) {
        throw new RuntimeException("Stub!");
    }

    public static void glDrawArraysInstanced(int mode, int first, int count, int instanceCount) {
        throw new RuntimeException("Stub!");
    }

    public static void glDrawElementsInstanced(int mode, int count, int type, Buffer indices, int instanceCount) {
        throw new RuntimeException("Stub!");
    }

    public static boolean glIsSync(long sync) {
        throw new RuntimeException("Stub!");
    }

    public static void glDeleteSync(long sync) {
        throw new RuntimeException("Stub!");
    }

    public static int glClientWaitSync(long sync, int flags, long timeout) {
        throw new RuntimeException("Stub!");
    }

    public static void glGetInteger64v(int pName, long[] data) {
        throw new RuntimeException("Stub!");
    }

    public static void glGetSynciv(long sync, int pName, int bufSize, int[] length, int[] values) {
        throw new RuntimeException("Stub!");
    }

    public static void glGetInteger64iV(int target, int index, long[] data) {
        throw new RuntimeException("Stub!");
    }

    public static void glGetBufferParameteri64v(int target, int value, long[] data) {
        throw new RuntimeException("Stub!");
    }

    public static void glGenSamplers(int n, int[] samplers) {
        throw new RuntimeException("Stub!");
    }

    public static void glDeleteSamplers(int n, int[] samplers) {
        throw new RuntimeException("Stub!");
    }

    public static boolean glIsSampler(int id) {
        throw new RuntimeException("Stub!");
    }

    public static void glBindSampler(int unit, int sampler) {
        throw new RuntimeException("Stub!");
    }

    public static void glBindImageTexture(int unit, int texture, int level, boolean layered, int layer, int access, int format) {
        throw new RuntimeException("Stub!");
    }

    public static void glDispatchCompute(int num_groups_x, int num_groups_y, int num_groups_z) {
        throw new RuntimeException("Stub!");
    }

    public static void glMemoryBarrier(int barriers) {
        throw new RuntimeException("Stub!");
    }

    public static String glGetActiveUniformBlockName(int program, int uniformBlockIndex) {
        throw new RuntimeException("Stub!");
    }

    public static void glUniformMatrix2x3fv(int location, int count, boolean transpose, float[] value) {
        throw new RuntimeException("Stub!");
    }

    public static void glUniformMatrix2x4fv(int location, int count, boolean transpose, float[] value) {
        throw new RuntimeException("Stub!");
    }

    public static void glUniformMatrix3x2fv(int location, int count, boolean transpose, float[] value) {
        throw new RuntimeException("Stub!");
    }

    public static void glUniformMatrix3x4fv(int location, int count, boolean transpose, float[] value) {
        throw new RuntimeException("Stub!");
    }

    public static void glUniformMatrix4x2fv(int location, int count, boolean transpose, float[] value) {
        throw new RuntimeException("Stub!");
    }

    public static void glUniformMatrix4x3fv(int location, int count, boolean transpose, float[] value) {
        throw new RuntimeException("Stub!");
    }

    public static void glVertexAttribIPointer(int index, int size, int type, int stride, Buffer pointer) {
        throw new RuntimeException("Stub!");
    }
}
