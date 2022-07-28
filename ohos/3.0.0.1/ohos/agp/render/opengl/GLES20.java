/*     */ package ohos.agp.render.opengl;
/*     */ import java.nio.Buffer;
/*     */ import java.nio.FloatBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ 
/*     */ public class GLES20 {
/*     */   public static final int GL_ACTIVE_TEXTURE = 34016;
/*     */   public static final int GL_ALWAYS = 519;
/*     */   public static final int GL_ARRAY_BUFFER = 34962;
/*     */   public static final int GL_BACK = 1029;
/*     */   public static final int GL_BLEND = 3042;
/*     */   public static final int GL_CCW = 2305;
/*     */   public static final int GL_CLAMP_TO_EDGE = 33071;
/*     */   public static final int GL_COLOR_ATTACHMENT0 = 36064;
/*     */   public static final int GL_COLOR_BUFFER_BIT = 16384;
/*     */   public static final int GL_COMPILE_STATUS = 35713;
/*     */   public static final int GL_CULL_FACE = 2884;
/*     */   public static final int GL_CW = 2304;
/*     */   public static final int GL_DELETE_STATUS = 35712;
/*     */   public static final int GL_DEPTH_ATTACHMENT = 36096;
/*     */   public static final int GL_DEPTH_BUFFER_BIT = 256;
/*     */   public static final int GL_DEPTH_COMPONENT16 = 33189;
/*     */   public static final int GL_DEPTH_TEST = 2929;
/*     */   public static final int GL_FLOAT = 5126;
/*     */   
/*     */   public GLES20() {
/*  27 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   public static final int GL_FRAGMENT_SHADER = 35632; public static final int GL_FRAMEBUFFER = 36160; public static final int GL_FRAMEBUFFER_COMPLETE = 36053; public static final int GL_FRONT = 1028; public static final int GL_INVALID_VALUE = 1281; public static final int GL_KEEP = 7680; public static final int GL_LEQUAL = 515; public static final int GL_LESS = 513; public static final int GL_LINEAR = 9729; public static final int GL_LINEAR_MIPMAP_LINEAR = 9987; public static final int GL_LINES = 1; public static final int GL_LINE_LOOP = 2; public static final int GL_LINE_STRIP = 3; public static final int GL_LINK_STATUS = 35714; public static final int GL_MAX_TEXTURE_SIZE = 3379; public static final int GL_NEAREST = 9728; public static final int GL_NICEST = 4354; public static final int GL_NONE = 0; public static final int GL_NO_ERROR = 0; public static final int GL_ONE = 1; public static final int GL_ONE_MINUS_SRC_ALPHA = 771; public static final int GL_POINTS = 0; public static final int GL_RENDERBUFFER = 36161; public static final int GL_RENDERER = 7937; public static final int GL_REPEAT = 10497; public static final int GL_REPLACE = 7681; public static final int GL_RGB = 6407; public static final int GL_RGBA = 6408; public static final int GL_SAMPLER_2D = 35678; public static final int GL_SHADER_COMPILER = 36346; public static final int GL_SRC_ALPHA = 770; public static final int GL_STATIC_DRAW = 35044; public static final int GL_STENCIL_ATTACHMENT = 36128; public static final int GL_STENCIL_TEST = 2960; public static final int GL_TEXTURE0 = 33984;
/*     */   public static final int GL_TEXTURE1 = 33985;
/*     */   
/*     */   public static void glClearColor(float red, float green, float blue, float alpha) {
/*  33 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   public static final int GL_TEXTURE3 = 33987; public static final int GL_TEXTURE_2D = 3553; public static final int GL_TEXTURE_MAG_FILTER = 10240; public static final int GL_TEXTURE_MIN_FILTER = 10241; public static final int GL_TEXTURE_WRAP_S = 10242; public static final int GL_TEXTURE_WRAP_T = 10243; public static final int GL_TRIANGLES = 4; public static final int GL_TRIANGLE_FAN = 6; public static final int GL_TRIANGLE_STRIP = 5; public static final int GL_TRUE = 1; public static final int GL_UNPACK_ALIGNMENT = 3317; public static final int GL_UNSIGNED_BYTE = 5121; public static final int GL_UNSIGNED_SHORT = 5123; public static final int GL_VALIDATE_STATUS = 35715; public static final int GL_VENDOR = 7936; public static final int GL_VERSION = 7938; public static final int GL_VERTEX_SHADER = 35633;
/*     */   public static final int GL_ZERO = 0;
/*     */   
/*     */   public static void glAttachShader(int program, int shader) {
/*  39 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static int glCreateProgram() {
/*  45 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLinkProgram(int program) {
/*  51 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glViewport(int x, int y, int width, int height) {
/*  57 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUseProgram(int program) {
/*  63 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static int glGetAttribLocation(int program, String name) {
/*  69 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glEnableVertexAttribArray(int index) {
/*  75 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, int pointer) {
/*  81 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, Buffer pointer) {
/*  87 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static int glGetUniformLocation(int program, String name) {
/*  93 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniform4fv(int location, int count, float[] value) {
/*  99 */     throw new RuntimeException("Stub!");
/*     */   } public static void glDrawArrays(int mode, int first, int count) {
/* 101 */     throw new RuntimeException("Stub!");
/*     */   } public static void glDisableVertexAttribArray(int index) {
/* 103 */     throw new RuntimeException("Stub!");
/*     */   } public static int glCreateShader(int shaderType) {
/* 105 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glShaderSource(int shader, int count, String[] string, IntBuffer length) {
/* 111 */     throw new RuntimeException("Stub!");
/*     */   } public static void glCompileShader(int shader) {
/* 113 */     throw new RuntimeException("Stub!");
/*     */   } public static void glEnable(int cap) {
/* 115 */     throw new RuntimeException("Stub!");
/*     */   } public static void glActiveTexture(int texture) {
/* 117 */     throw new RuntimeException("Stub!");
/*     */   } public static void glClear(int mask) {
/* 119 */     throw new RuntimeException("Stub!");
/*     */   } public static void glTexParameteri(int target, int pName, int param) {
/* 121 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGenTextures(int n, int[] textures) {
/* 123 */     throw new RuntimeException("Stub!");
/*     */   } public static void glBindTexture(int target, int texture) {
/* 125 */     throw new RuntimeException("Stub!");
/*     */   } public static void glDrawElements(int mode, int count, int type, Buffer indices) {
/* 127 */     throw new RuntimeException("Stub!");
/*     */   } public static void glUniform1i(int location, int v0) {
/* 129 */     throw new RuntimeException("Stub!");
/*     */   } public static void glBindFramebuffer(int target, int frameBuffer) {
/* 131 */     throw new RuntimeException("Stub!");
/*     */   } public static void glBindRenderbuffer(int target, int renderBuffer) {
/* 133 */     throw new RuntimeException("Stub!");
/*     */   } public static int glCheckFramebufferStatus(int target) {
/* 135 */     throw new RuntimeException("Stub!");
/*     */   } public static void glCullFace(int mode) {
/* 137 */     throw new RuntimeException("Stub!");
/*     */   } public static void glDeleteProgram(int program) {
/* 139 */     throw new RuntimeException("Stub!");
/*     */   } public static void glDepthFunc(int func) {
/* 141 */     throw new RuntimeException("Stub!");
/*     */   } public static void glDisable(int cap) {
/* 143 */     throw new RuntimeException("Stub!");
/*     */   } public static void glFramebufferRenderbuffer(int target, int attachment, int renderBufferTarget, int renderBuffer) {
/* 145 */     throw new RuntimeException("Stub!");
/*     */   } public static void glFramebufferTexture2D(int target, int attachment, int texTarget, int texture, int level) {
/* 147 */     throw new RuntimeException("Stub!");
/*     */   } public static void glFrontFace(int mode) {
/* 149 */     throw new RuntimeException("Stub!");
/*     */   } public static void glRenderbufferStorage(int target, int internalFormat, int width, int height) {
/* 151 */     throw new RuntimeException("Stub!");
/*     */   } public static void glTexParameterf(int target, int pName, float param) {
/* 153 */     throw new RuntimeException("Stub!");
/*     */   } public static void glUniform1f(int location, float v0) {
/* 155 */     throw new RuntimeException("Stub!");
/*     */   } public static void glUniform2f(int location, float v0, float v1) {
/* 157 */     throw new RuntimeException("Stub!");
/*     */   } public static void glUniform3f(int location, float v0, float v1, float v2) {
/* 159 */     throw new RuntimeException("Stub!");
/*     */   } public static void glUniform4f(int location, float v0, float v1, float v2, float v3) {
/* 161 */     throw new RuntimeException("Stub!");
/*     */   } public static void glBlendFunc(int sFactor, int dFactor) {
/* 163 */     throw new RuntimeException("Stub!");
/*     */   } public static void glBlendFuncSeparate(int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
/* 165 */     throw new RuntimeException("Stub!");
/*     */   } public static int glGetError() {
/* 167 */     throw new RuntimeException("Stub!");
/*     */   } public static void glDeleteFramebuffers(int n, IntBuffer frameBuffers) {
/* 169 */     throw new RuntimeException("Stub!");
/*     */   } public static void glDeleteRenderbuffers(int n, IntBuffer renderBuffers) {
/* 171 */     throw new RuntimeException("Stub!");
/*     */   } public static void glDeleteTextures(int n, IntBuffer textures) {
/* 173 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGenFramebuffers(int n, IntBuffer frameBuffers) {
/* 175 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGenRenderbuffers(int n, IntBuffer renderBuffers) {
/* 177 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGenTextures(int n, IntBuffer textures) {
/* 179 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGetShaderiv(int shader, int pName, IntBuffer params) {
/* 181 */     throw new RuntimeException("Stub!");
/*     */   } public static void glReadPixels(int x, int y, int width, int height, int format, int type, Buffer data) {
/* 183 */     throw new RuntimeException("Stub!");
/*     */   } public static void glTexImage2D(int target, int level, int internalFormat, int width, int height, int border, int format, int type, Buffer data) {
/* 185 */     throw new RuntimeException("Stub!");
/*     */   } public static void glDeleteShader(int shader) {
/* 187 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGetProgramiv(int program, int pName, int[] params) {
/* 189 */     throw new RuntimeException("Stub!");
/*     */   } public static void glUniform3fv(int location, int count, float[] value) {
/* 191 */     throw new RuntimeException("Stub!");
/*     */   } public static void glUniformMatrix4fv(int location, int count, boolean transpose, float[] value) {
/* 193 */     throw new RuntimeException("Stub!");
/*     */   } public static void glDeleteFramebuffers(int n, int[] frameBuffers) {
/* 195 */     throw new RuntimeException("Stub!");
/*     */   } public static void glDeleteRenderbuffers(int n, int[] renderBuffers) {
/* 197 */     throw new RuntimeException("Stub!");
/*     */   } public static void glDeleteTextures(int n, int[] textures) {
/* 199 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGenFramebuffers(int n, int[] frameBuffers) {
/* 201 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGenRenderbuffers(int n, int[] renderBuffers) {
/* 203 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetProgramInfoLog(int program, int maxLength, IntBuffer length, StringBuffer infoLog) {
/* 209 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetShaderInfoLog(int shader, int maxLength, IntBuffer length, StringBuffer infoLog) {
/* 215 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGenBuffers(int n, int[] buffers) {
/* 221 */     throw new RuntimeException("Stub!");
/*     */   } public static void glBindBuffer(int target, int buffer) {
/* 223 */     throw new RuntimeException("Stub!");
/*     */   } public static void glBufferData(int target, int size, Buffer data, int usage) {
/* 225 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGetShaderiv(int shader, int pName, int[] params) {
/* 227 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGenerateMipmap(int target) {
/* 229 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGetIntegerv(int pName, int[] params) {
/* 231 */     throw new RuntimeException("Stub!");
/*     */   } public static void glCompressedTexImage2D(int target, int level, int internalFormat, int width, int height, int border, int imageSize, Buffer data) {
/* 233 */     throw new RuntimeException("Stub!");
/*     */   } public static void glCompressedTexSubImage2D(int target, int level, int xOffset, int yOffset, int width, int height, int format, int imageSize, Buffer data) {
/* 235 */     throw new RuntimeException("Stub!");
/*     */   } public static void glDepthRangef(float nearVal, float farVal) {
/* 237 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGetAttachedShaders(int program, int maxCount, IntBuffer count, IntBuffer shaders) {
/* 239 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGetBufferParameteriv(int target, int value, IntBuffer data) {
/* 241 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pName, IntBuffer params) {
/* 243 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGetRenderbufferParameteriv(int target, int pName, IntBuffer params) {
/* 245 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGetShaderPrecisionFormat(int shaderType, int precisionType, IntBuffer range, IntBuffer precision) {
/* 247 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGetShaderSource(int shader, int bufSize, IntBuffer length, CharBuffer source) {
/* 249 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGetTexParameterfv(int target, int pName, FloatBuffer params) {
/* 251 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGetTexParameteriv(int target, int pName, IntBuffer params) {
/* 253 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGetUniformfv(int program, int location, FloatBuffer params) {
/* 255 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGetUniformiv(int program, int location, IntBuffer params) {
/* 257 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGetVertexAttribfv(int index, int pName, FloatBuffer params) {
/* 259 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGetVertexAttribiv(int index, int pName, IntBuffer params) {
/* 261 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniformMatrix2fv(int location, int count, boolean transpose, float[] value) {
/* 267 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniform1iv(int location, int count, int[] value) {
/* 273 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean glIsTexture(int texture) {
/* 279 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean glIsProgram(int program) {
/* 285 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean glIsEnabled(int cap) {
/* 291 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetFloatv(int name, float[] params) {
/* 297 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetBooleanv(int pName, boolean[] params) {
/* 303 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetActiveUniform(int program, int index, int bufSize, int[] length, int[] size, int[] type, byte[] name) {
/* 309 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetActiveAttrib(int program, int index, int bufSize, int[] length, int[] size, int[] type, byte[] name) {
/* 315 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDetachShader(int program, int shader) {
/* 321 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
/* 327 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glCopyTexImage2D(int target, int level, int internalformat, int x, int y, int width, int height, int border) {
/* 333 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glBlendEquationSeparate(int modeRGB, int modeAlpha) {
/* 339 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glBlendEquation(int mode) {
/* 345 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glHint(int target, int mode) {
/* 351 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean glIsBuffer(int buffer) {
/* 357 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean glIsFramebuffer(int frameBuffer) {
/* 363 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean glIsRenderbuffer(int renderBuffer) {
/* 369 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glPolygonOffset(float factor, float units) {
/* 375 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glReleaseShaderCompiler() {
/* 381 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glSampleCoverage(float value, boolean invert) {
/* 387 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glShaderBinary(int n, IntBuffer shaders, int binaryFormat, Buffer binary, int length) {
/* 393 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glStencilFuncSeparate(int face, int func, int ref, int mask) {
/* 399 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glStencilMaskSeparate(int face, int mask) {
/* 405 */     throw new RuntimeException("Stub!");
/*     */   } public static void glStencilOpSeparate(int face, int sFail, int dpFail, int dpPass) {
/* 407 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexParameterfv(int target, int pName, FloatBuffer param) {
/* 413 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexParameteriv(int target, int pName, IntBuffer param) {
/* 419 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glValidateProgram(int program) {
/* 425 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniformMatrix3fv(int location, int count, boolean transpose, float[] value) {
/* 431 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, Buffer pixels) {
/* 437 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glStencilOp(int fail, int zfail, int zpass) {
/* 443 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glStencilMask(int mask) {
/* 449 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glStencilFunc(int func, int ref, int mask) {
/* 455 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glPixelStorei(int pName, int param) {
/* 461 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLineWidth(float width) {
/* 467 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static String glGetString(int name) {
/* 473 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGenBuffers(int n, IntBuffer buffers) {
/* 479 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glFlush() {
/* 485 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glFinish() {
/* 491 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDepthMask(boolean flag) {
/* 497 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDeleteBuffers(int n, IntBuffer buffers) {
/* 503 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glColorMask(boolean red, boolean green, boolean blue, boolean alpha) {
/* 509 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glClearStencil(int s) {
/* 515 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glClearDepthf(float depth) {
/* 521 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glBufferSubData(int target, int offset, int size, Buffer data) {
/* 527 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glBlendColor(float red, float green, float blue, float alpha) {
/* 533 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glScissor(int x, int y, int width, int height) {
/* 539 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glBindAttribLocation(int program, int index, String name) {
/* 545 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniform1fv(int location, int count, FloatBuffer value) {
/* 551 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniform2fv(int location, int count, FloatBuffer value) {
/* 557 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniform2i(int location, int v0, int v1) {
/* 563 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniform2iv(int location, int count, IntBuffer value) {
/* 569 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniform3i(int location, int v0, int v1, int v2) {
/* 575 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniform3iv(int location, int count, IntBuffer value) {
/* 581 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniform4i(int location, int v0, int v1, int v2, int v3) {
/* 587 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniform4iv(int location, int count, IntBuffer value) {
/* 593 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexAttrib1f(int index, float v0) {
/* 599 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexAttrib1fv(int index, FloatBuffer v) {
/* 605 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexAttrib2f(int index, float v0, float v1) {
/* 611 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexAttrib2fv(int index, FloatBuffer v) {
/* 617 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexAttrib3f(int index, float v0, float v1, float v2) {
/* 623 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexAttrib3fv(int index, FloatBuffer v) {
/* 629 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexAttrib4f(int index, float v0, float v1, float v2, float v3) {
/* 635 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexAttrib4fv(int index, FloatBuffer v) {
/* 641 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean glIsShader(int shader) {
/* 647 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/agp/render/opengl/GLES20.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */