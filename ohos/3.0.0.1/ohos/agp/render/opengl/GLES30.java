/*     */ package ohos.agp.render.opengl;
/*     */ 
/*     */ import java.nio.Buffer;
/*     */ import java.nio.FloatBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class GLES30
/*     */   extends GLES20
/*     */ {
/*     */   public static final int GL_DEPTH24_STENCIL8 = 35056;
/*     */   public static final int GL_DEPTH_STENCIL_ATTACHMENT = 33306;
/*     */   public static final int GL_DRAW_FRAMEBUFFER = 36009;
/*     */   public static final int GL_READ_FRAMEBUFFER = 36008;
/*     */   public static final int GL_RGBA8 = 32856;
/*     */   
/*     */   public GLES30() {
/*  27 */     throw new RuntimeException("Stub!");
/*     */   } public static void glBindFramebuffer(int target, int frameBuffer) {
/*  29 */     throw new RuntimeException("Stub!");
/*     */   } public static void glBindRenderbuffer(int target, int renderbuffer) {
/*  31 */     throw new RuntimeException("Stub!");
/*     */   } public static void glRenderbufferStorageMultisample(int target, int samples, int internalformat, int width, int height) {
/*  33 */     throw new RuntimeException("Stub!");
/*     */   } public static void glBlitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
/*  35 */     throw new RuntimeException("Stub!");
/*     */   } public static void glDrawBuffers(int n, int[] buffers) {
/*  37 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGenVertexArrays(int n, int[] arrays) {
/*  39 */     throw new RuntimeException("Stub!");
/*     */   } public static void glBindVertexArray(int array) {
/*  41 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glWaitSync(long sync, int flags, long timeout) {
/*  47 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTransformFeedbackVaryings(int program, int count, String[] varyings, int bufferMode) {
/*  53 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glReadPixels(int x, int y, int width, int height, int format, int type, int data) {
/*  59 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glReadBuffer(int src) {
/*  65 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static Buffer glMapBufferRange(int target, int offset, int length, int access) {
/*  71 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static long glFenceSync(int condition, int flags) {
/*  77 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glBeginTransformFeedback(int primitiveMode) {
/*  83 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glEndTransformFeedback() {
/*  89 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDeleteVertexArrays(int n, int[] arrays) {
/*  95 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glBindBufferBase(int target, int index, int buffer) {
/* 101 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean glUnmapBuffer(int target) {
/* 107 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDrawRangeElements(int mode, int start, int end, int count, int type, Buffer indices) {
/* 113 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexImage3D(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, Buffer data) {
/* 119 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexSubImage3D(int target, int level, int xOffset, int yOffset, int zOffset, int width, int height, int depth, int format, int type, Buffer data) {
/* 125 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glCopyTexSubImage3D(int target, int level, int xOffset, int yOffset, int zOffset, int x, int y, int width, int height) {
/* 131 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glCompressedTexImage3D(int target, int level, int internalFormat, int width, int height, int depth, int border, int imageSize, Buffer data) {
/* 137 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glCompressedTexSubImage3D(int target, int level, int xOffset, int yOffset, int zOffset, int width, int height, int depth, int format, int imageSize, Buffer data) {
/* 143 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGenQueries(int n, IntBuffer ids) {
/* 149 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDeleteQueries(int n, IntBuffer ids) {
/* 155 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean glIsQuery(int id) {
/* 161 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glBeginQuery(int target, int id) {
/* 167 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glEndQuery(int target) {
/* 173 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetQueryiv(int target, int pName, IntBuffer params) {
/* 179 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetQueryObjectuiv(int id, int pName, IntBuffer params) {
/* 185 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetBufferPointerv(int target, int pName, Buffer params) {
/* 191 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glBindBufferRange(int target, int index, int buffer, int offset, int size) {
/* 197 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetTransformFeedbackVarying(int program, int index, int bufsize, int[] length, int[] size, int[] type, byte[] name) {
/* 203 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexAttribIPointer(int index, int size, int type, int stride, int offset) {
/* 209 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetVertexAttribIiv(int index, int pName, int[] params) {
/* 215 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetVertexAttribIuiv(int index, int pName, int[] params) {
/* 221 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexAttribI4i(int index, int v0, int v1, int v2, int v3) {
/* 227 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexAttribI4ui(int index, int v0, int v1, int v2, int v3) {
/* 233 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexAttribI4iv(int index, int[] v) {
/* 239 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexAttribI4uiv(int index, int[] v) {
/* 245 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetUniformuiv(int program, int location, int[] params) {
/* 251 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static int glGetFragDataLocation(int program, String name) {
/* 257 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniform1ui(int location, int v0) {
/* 263 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniform2ui(int location, int v0, int v1) {
/* 269 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniformMatrix2x3fv(int location, int count, boolean transpose, FloatBuffer value) {
/* 275 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniform3ui(int location, int v0, int v1, int v2) {
/* 281 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniformMatrix3x2fv(int location, int count, boolean transpose, FloatBuffer value) {
/* 287 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniformMatrix2x4fv(int location, int count, boolean transpose, FloatBuffer value) {
/* 293 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniform4ui(int location, int v0, int v1, int v2, int v3) {
/* 299 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniform1uiv(int location, int count, int[] value) {
/* 305 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniformMatrix4x2fv(int location, int count, boolean transpose, FloatBuffer value) {
/* 311 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniform2uiv(int location, int count, int[] value) {
/* 317 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniformMatrix3x4fv(int location, int count, boolean transpose, FloatBuffer value) {
/* 323 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniform3uiv(int location, int count, int[] value) {
/* 329 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniformMatrix4x3fv(int location, int count, boolean transpose, FloatBuffer value) {
/* 335 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glFramebufferTextureLayer(int target, int attachment, int texture, int level, int layer) {
/* 341 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glFlushMappedBufferRange(int target, int offset, int length) {
/* 347 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean glIsVertexArray(int array) {
/* 353 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetIntegerIndexv(int target, int index, IntBuffer data) {
/* 359 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glSamplerParameteri(int sampler, int pName, int param) {
/* 365 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glSamplerParameteriv(int sampler, int pName, int[] params) {
/* 371 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glSamplerParameterf(int sampler, int pName, float param) {
/* 377 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glSamplerParameterfv(int sampler, int pName, float[] params) {
/* 383 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetSamplerParameteriv(int sampler, int pName, int[] params) {
/* 389 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetSamplerParameterfv(int sampler, int pName, float[] params) {
/* 395 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexAttribDivisor(int index, int divisor) {
/* 401 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glBindTransformFeedback(int target, int id) {
/* 407 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDeleteTransformFeedbacks(int n, int[] ids) {
/* 413 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGenTransformFeedbacks(int n, int[] ids) {
/* 419 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean glIsTransformFeedback(int id) {
/* 425 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glPauseTransformFeedback() {
/* 431 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glResumeTransformFeedback() {
/* 437 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetProgramBinary(int program, int bufSize, int[] length, int[] binaryFormat, Buffer binary) {
/* 443 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glProgramBinary(int program, int binaryFormat, Buffer binary, int length) {
/* 449 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glProgramParameteri(int program, int pName, int value) {
/* 455 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glInvalidateFramebuffer(int target, int numAttachments, int[] attachments) {
/* 461 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glInvalidateSubFramebuffer(int target, int numAttachments, int[] attachments, int x, int y, int width, int height) {
/* 467 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexStorage2D(int target, int levels, int internalformat, int width, int height) {
/* 473 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexStorage3D(int target, int levels, int internalformat, int width, int height, int depth) {
/* 479 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetInternalformativ(int target, int internalformat, int pName, int bufSize, int[] params) {
/* 485 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniform4uiv(int location, int count, int[] value) {
/* 491 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glClearBufferiv(int buffer, int drawbuffer, int[] value) {
/* 497 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glClearBufferuiv(int buffer, int drawbuffer, int[] value) {
/* 503 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glClearBufferfv(int buffer, int drawbuffer, float[] value) {
/* 509 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glClearBufferfi(int buffer, int drawbuffer, float depth, int stencil) {
/* 515 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static String glGetStringi(int name, int index) {
/* 521 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glCopyBufferSubData(int readTarget, int writeTarget, int readOffset, int writeOffset, int size) {
/* 527 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetUniformIndices(int program, String[] uniformNames, int[] uniformIndices) {
/* 533 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetActiveUniformsiv(int program, int uniformCount, int[] uniformIndices, int pName, int[] params) {
/* 539 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static int glGetUniformBlockIndex(int program, String uniformBlockName) {
/* 545 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pName, int[] params) {
/* 551 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize, int[] length, byte[] uniformBlockName) {
/* 557 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniformBlockBinding(int program, int uniformBlockIndex, int uniformBlockBinding) {
/* 563 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDrawArraysInstanced(int mode, int first, int count, int instanceCount) {
/* 569 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDrawElementsInstanced(int mode, int count, int type, Buffer indices, int instanceCount) {
/* 575 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean glIsSync(long sync) {
/* 581 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDeleteSync(long sync) {
/* 587 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static int glClientWaitSync(long sync, int flags, long timeout) {
/* 593 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetInteger64v(int pName, long[] data) {
/* 599 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetSynciv(long sync, int pName, int bufSize, int[] length, int[] values) {
/* 605 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetInteger64iV(int target, int index, long[] data) {
/* 611 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetBufferParameteri64v(int target, int value, long[] data) {
/* 617 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGenSamplers(int n, int[] samplers) {
/* 623 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDeleteSamplers(int n, int[] samplers) {
/* 629 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean glIsSampler(int id) {
/* 635 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glBindSampler(int unit, int sampler) {
/* 641 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glBindImageTexture(int unit, int texture, int level, boolean layered, int layer, int access, int format) {
/* 647 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDispatchCompute(int num_groups_x, int num_groups_y, int num_groups_z) {
/* 653 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glMemoryBarrier(int barriers) {
/* 659 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static String glGetActiveUniformBlockName(int program, int uniformBlockIndex) {
/* 665 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniformMatrix2x3fv(int location, int count, boolean transpose, float[] value) {
/* 671 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniformMatrix2x4fv(int location, int count, boolean transpose, float[] value) {
/* 677 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniformMatrix3x2fv(int location, int count, boolean transpose, float[] value) {
/* 683 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniformMatrix3x4fv(int location, int count, boolean transpose, float[] value) {
/* 689 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniformMatrix4x2fv(int location, int count, boolean transpose, float[] value) {
/* 695 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniformMatrix4x3fv(int location, int count, boolean transpose, float[] value) {
/* 701 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexAttribIPointer(int index, int size, int type, int stride, Buffer pointer) {
/* 707 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/agp/render/opengl/GLES30.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */