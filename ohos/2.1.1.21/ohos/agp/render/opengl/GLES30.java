/*     */ package ohos.agp.render.opengl;
/*     */ 
/*     */ import java.nio.Buffer;
/*     */ import java.nio.FloatBuffer;
/*     */ import java.nio.IntBuffer;
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
/*  19 */     throw new RuntimeException("Stub!");
/*     */   } public static void glBindFramebuffer(int target, int frameBuffer) {
/*  21 */     throw new RuntimeException("Stub!");
/*     */   } public static void glBindRenderbuffer(int target, int renderbuffer) {
/*  23 */     throw new RuntimeException("Stub!");
/*     */   } public static void glRenderbufferStorageMultisample(int target, int samples, int internalformat, int width, int height) {
/*  25 */     throw new RuntimeException("Stub!");
/*     */   } public static void glBlitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
/*  27 */     throw new RuntimeException("Stub!");
/*     */   } public static void glDrawBuffers(int n, int[] buffers) {
/*  29 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGenVertexArrays(int n, int[] arrays) {
/*  31 */     throw new RuntimeException("Stub!");
/*     */   } public static void glBindVertexArray(int array) {
/*  33 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glWaitSync(long sync, int flags, long timeout) {
/*  39 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTransformFeedbackVaryings(int program, int count, String[] varyings, int bufferMode) {
/*  45 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glReadPixels(int x, int y, int width, int height, int format, int type, int data) {
/*  51 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glReadBuffer(int src) {
/*  57 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static Buffer glMapBufferRange(int target, int offset, int length, int access) {
/*  63 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static long glFenceSync(int condition, int flags) {
/*  69 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glBeginTransformFeedback(int primitiveMode) {
/*  75 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glEndTransformFeedback() {
/*  81 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDeleteVertexArrays(int n, int[] arrays) {
/*  87 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glBindBufferBase(int target, int index, int buffer) {
/*  93 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean glUnmapBuffer(int target) {
/*  99 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDrawRangeElements(int mode, int start, int end, int count, int type, Buffer indices) {
/* 105 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexImage3D(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, Buffer data) {
/* 111 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexSubImage3D(int target, int level, int xOffset, int yOffset, int zOffset, int width, int height, int depth, int format, int type, Buffer data) {
/* 117 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glCopyTexSubImage3D(int target, int level, int xOffset, int yOffset, int zOffset, int x, int y, int width, int height) {
/* 123 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glCompressedTexImage3D(int target, int level, int internalFormat, int width, int height, int depth, int border, int imageSize, Buffer data) {
/* 129 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glCompressedTexSubImage3D(int target, int level, int xOffset, int yOffset, int zOffset, int width, int height, int depth, int format, int imageSize, Buffer data) {
/* 135 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGenQueries(int n, IntBuffer ids) {
/* 141 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDeleteQueries(int n, IntBuffer ids) {
/* 147 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean glIsQuery(int id) {
/* 153 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glBeginQuery(int target, int id) {
/* 159 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glEndQuery(int target) {
/* 165 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetQueryiv(int target, int pName, IntBuffer params) {
/* 171 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetQueryObjectuiv(int id, int pName, IntBuffer params) {
/* 177 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetBufferPointerv(int target, int pName, Buffer params) {
/* 183 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glBindBufferRange(int target, int index, int buffer, int offset, int size) {
/* 189 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetTransformFeedbackVarying(int program, int index, int bufsize, int[] length, int[] size, int[] type, byte[] name) {
/* 195 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexAttribIPointer(int index, int size, int type, int stride, int offset) {
/* 201 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetVertexAttribIiv(int index, int pName, int[] params) {
/* 207 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetVertexAttribIuiv(int index, int pName, int[] params) {
/* 213 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexAttribI4i(int index, int v0, int v1, int v2, int v3) {
/* 219 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexAttribI4ui(int index, int v0, int v1, int v2, int v3) {
/* 225 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexAttribI4iv(int index, int[] v) {
/* 231 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexAttribI4uiv(int index, int[] v) {
/* 237 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetUniformuiv(int program, int location, int[] params) {
/* 243 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static int glGetFragDataLocation(int program, String name) {
/* 249 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniform1ui(int location, int v0) {
/* 255 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniform2ui(int location, int v0, int v1) {
/* 261 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniformMatrix2x3fv(int location, int count, boolean transpose, FloatBuffer value) {
/* 267 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniform3ui(int location, int v0, int v1, int v2) {
/* 273 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniformMatrix3x2fv(int location, int count, boolean transpose, FloatBuffer value) {
/* 279 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniformMatrix2x4fv(int location, int count, boolean transpose, FloatBuffer value) {
/* 285 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniform4ui(int location, int v0, int v1, int v2, int v3) {
/* 291 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniform1uiv(int location, int count, int[] value) {
/* 297 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniformMatrix4x2fv(int location, int count, boolean transpose, FloatBuffer value) {
/* 303 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniform2uiv(int location, int count, int[] value) {
/* 309 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniformMatrix3x4fv(int location, int count, boolean transpose, FloatBuffer value) {
/* 315 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniform3uiv(int location, int count, int[] value) {
/* 321 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniformMatrix4x3fv(int location, int count, boolean transpose, FloatBuffer value) {
/* 327 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glFramebufferTextureLayer(int target, int attachment, int texture, int level, int layer) {
/* 333 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glFlushMappedBufferRange(int target, int offset, int length) {
/* 339 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean glIsVertexArray(int array) {
/* 345 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetIntegerIndexv(int target, int index, IntBuffer data) {
/* 351 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glSamplerParameteri(int sampler, int pName, int param) {
/* 357 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glSamplerParameteriv(int sampler, int pName, int[] params) {
/* 363 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glSamplerParameterf(int sampler, int pName, float param) {
/* 369 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glSamplerParameterfv(int sampler, int pName, float[] params) {
/* 375 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetSamplerParameteriv(int sampler, int pName, int[] params) {
/* 381 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetSamplerParameterfv(int sampler, int pName, float[] params) {
/* 387 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexAttribDivisor(int index, int divisor) {
/* 393 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glBindTransformFeedback(int target, int id) {
/* 399 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDeleteTransformFeedbacks(int n, int[] ids) {
/* 405 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGenTransformFeedbacks(int n, int[] ids) {
/* 411 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean glIsTransformFeedback(int id) {
/* 417 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glPauseTransformFeedback() {
/* 423 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glResumeTransformFeedback() {
/* 429 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetProgramBinary(int program, int bufSize, int[] length, int[] binaryFormat, Buffer binary) {
/* 435 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glProgramBinary(int program, int binaryFormat, Buffer binary, int length) {
/* 441 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glProgramParameteri(int program, int pName, int value) {
/* 447 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glInvalidateFramebuffer(int target, int numAttachments, int[] attachments) {
/* 453 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glInvalidateSubFramebuffer(int target, int numAttachments, int[] attachments, int x, int y, int width, int height) {
/* 459 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexStorage2D(int target, int levels, int internalformat, int width, int height) {
/* 465 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexStorage3D(int target, int levels, int internalformat, int width, int height, int depth) {
/* 471 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetInternalformativ(int target, int internalformat, int pName, int bufSize, int[] params) {
/* 477 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniform4uiv(int location, int count, int[] value) {
/* 483 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glClearBufferiv(int buffer, int drawbuffer, int[] value) {
/* 489 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glClearBufferuiv(int buffer, int drawbuffer, int[] value) {
/* 495 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glClearBufferfv(int buffer, int drawbuffer, float[] value) {
/* 501 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glClearBufferfi(int buffer, int drawbuffer, float depth, int stencil) {
/* 507 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static String glGetStringi(int name, int index) {
/* 513 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glCopyBufferSubData(int readTarget, int writeTarget, int readOffset, int writeOffset, int size) {
/* 519 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetUniformIndices(int program, String[] uniformNames, int[] uniformIndices) {
/* 525 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetActiveUniformsiv(int program, int uniformCount, int[] uniformIndices, int pName, int[] params) {
/* 531 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static int glGetUniformBlockIndex(int program, String uniformBlockName) {
/* 537 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pName, int[] params) {
/* 543 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize, int[] length, byte[] uniformBlockName) {
/* 549 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniformBlockBinding(int program, int uniformBlockIndex, int uniformBlockBinding) {
/* 555 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDrawArraysInstanced(int mode, int first, int count, int instanceCount) {
/* 561 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDrawElementsInstanced(int mode, int count, int type, Buffer indices, int instanceCount) {
/* 567 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean glIsSync(long sync) {
/* 573 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDeleteSync(long sync) {
/* 579 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static int glClientWaitSync(long sync, int flags, long timeout) {
/* 585 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetInteger64v(int pName, long[] data) {
/* 591 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetSynciv(long sync, int pName, int bufSize, int[] length, int[] values) {
/* 597 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetInteger64iV(int target, int index, long[] data) {
/* 603 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetBufferParameteri64v(int target, int value, long[] data) {
/* 609 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGenSamplers(int n, int[] samplers) {
/* 615 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDeleteSamplers(int n, int[] samplers) {
/* 621 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean glIsSampler(int id) {
/* 627 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glBindSampler(int unit, int sampler) {
/* 633 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glBindImageTexture(int unit, int texture, int level, boolean layered, int layer, int access, int format) {
/* 639 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDispatchCompute(int num_groups_x, int num_groups_y, int num_groups_z) {
/* 645 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glMemoryBarrier(int barriers) {
/* 651 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static String glGetActiveUniformBlockName(int program, int uniformBlockIndex) {
/* 657 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniformMatrix2x3fv(int location, int count, boolean transpose, float[] value) {
/* 663 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniformMatrix2x4fv(int location, int count, boolean transpose, float[] value) {
/* 669 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniformMatrix3x2fv(int location, int count, boolean transpose, float[] value) {
/* 675 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniformMatrix3x4fv(int location, int count, boolean transpose, float[] value) {
/* 681 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniformMatrix4x2fv(int location, int count, boolean transpose, float[] value) {
/* 687 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniformMatrix4x3fv(int location, int count, boolean transpose, float[] value) {
/* 693 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexAttribIPointer(int index, int size, int type, int stride, Buffer pointer) {
/* 699 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/agp/render/opengl/GLES30.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */