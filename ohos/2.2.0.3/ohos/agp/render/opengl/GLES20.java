/*     */ package ohos.agp.render.opengl;public class GLES20 { public static final int GL_ACTIVE_TEXTURE = 34016; public static final int GL_ALWAYS = 519; public static final int GL_ARRAY_BUFFER = 34962;
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
/*  19 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   public static final int GL_FRAGMENT_SHADER = 35632; public static final int GL_FRAMEBUFFER = 36160; public static final int GL_FRAMEBUFFER_COMPLETE = 36053; public static final int GL_FRONT = 1028; public static final int GL_INVALID_VALUE = 1281; public static final int GL_KEEP = 7680; public static final int GL_LEQUAL = 515; public static final int GL_LESS = 513; public static final int GL_LINEAR = 9729; public static final int GL_LINEAR_MIPMAP_LINEAR = 9987; public static final int GL_LINES = 1; public static final int GL_LINE_LOOP = 2; public static final int GL_LINE_STRIP = 3; public static final int GL_LINK_STATUS = 35714; public static final int GL_MAX_TEXTURE_SIZE = 3379; public static final int GL_NEAREST = 9728; public static final int GL_NICEST = 4354; public static final int GL_NONE = 0; public static final int GL_NO_ERROR = 0; public static final int GL_ONE = 1; public static final int GL_ONE_MINUS_SRC_ALPHA = 771; public static final int GL_POINTS = 0; public static final int GL_RENDERBUFFER = 36161; public static final int GL_RENDERER = 7937; public static final int GL_REPEAT = 10497; public static final int GL_REPLACE = 7681; public static final int GL_RGB = 6407; public static final int GL_RGBA = 6408; public static final int GL_SAMPLER_2D = 35678; public static final int GL_SHADER_COMPILER = 36346; public static final int GL_SRC_ALPHA = 770; public static final int GL_STATIC_DRAW = 35044; public static final int GL_STENCIL_ATTACHMENT = 36128; public static final int GL_STENCIL_TEST = 2960; public static final int GL_TEXTURE0 = 33984;
/*     */   public static final int GL_TEXTURE1 = 33985;
/*     */   
/*     */   public static void glClearColor(float red, float green, float blue, float alpha) {
/*  25 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   public static final int GL_TEXTURE3 = 33987; public static final int GL_TEXTURE_2D = 3553; public static final int GL_TEXTURE_MAG_FILTER = 10240; public static final int GL_TEXTURE_MIN_FILTER = 10241; public static final int GL_TEXTURE_WRAP_S = 10242; public static final int GL_TEXTURE_WRAP_T = 10243; public static final int GL_TRIANGLES = 4; public static final int GL_TRIANGLE_FAN = 6; public static final int GL_TRIANGLE_STRIP = 5; public static final int GL_TRUE = 1; public static final int GL_UNPACK_ALIGNMENT = 3317; public static final int GL_UNSIGNED_BYTE = 5121; public static final int GL_UNSIGNED_SHORT = 5123; public static final int GL_VALIDATE_STATUS = 35715; public static final int GL_VENDOR = 7936; public static final int GL_VERSION = 7938; public static final int GL_VERTEX_SHADER = 35633;
/*     */   public static final int GL_ZERO = 0;
/*     */   
/*     */   public static void glAttachShader(int program, int shader) {
/*  31 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static int glCreateProgram() {
/*  37 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLinkProgram(int program) {
/*  43 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glViewport(int x, int y, int width, int height) {
/*  49 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUseProgram(int program) {
/*  55 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static int glGetAttribLocation(int program, String name) {
/*  61 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glEnableVertexAttribArray(int index) {
/*  67 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, int pointer) {
/*  73 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, Buffer pointer) {
/*  79 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static int glGetUniformLocation(int program, String name) {
/*  85 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniform4fv(int location, int count, float[] value) {
/*  91 */     throw new RuntimeException("Stub!");
/*     */   } public static void glDrawArrays(int mode, int first, int count) {
/*  93 */     throw new RuntimeException("Stub!");
/*     */   } public static void glDisableVertexAttribArray(int index) {
/*  95 */     throw new RuntimeException("Stub!");
/*     */   } public static int glCreateShader(int shaderType) {
/*  97 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glShaderSource(int shader, int count, String[] string, IntBuffer length) {
/* 103 */     throw new RuntimeException("Stub!");
/*     */   } public static void glCompileShader(int shader) {
/* 105 */     throw new RuntimeException("Stub!");
/*     */   } public static void glEnable(int cap) {
/* 107 */     throw new RuntimeException("Stub!");
/*     */   } public static void glActiveTexture(int texture) {
/* 109 */     throw new RuntimeException("Stub!");
/*     */   } public static void glClear(int mask) {
/* 111 */     throw new RuntimeException("Stub!");
/*     */   } public static void glTexParameteri(int target, int pName, int param) {
/* 113 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGenTextures(int n, int[] textures) {
/* 115 */     throw new RuntimeException("Stub!");
/*     */   } public static void glBindTexture(int target, int texture) {
/* 117 */     throw new RuntimeException("Stub!");
/*     */   } public static void glDrawElements(int mode, int count, int type, Buffer indices) {
/* 119 */     throw new RuntimeException("Stub!");
/*     */   } public static void glUniform1i(int location, int v0) {
/* 121 */     throw new RuntimeException("Stub!");
/*     */   } public static void glBindFramebuffer(int target, int frameBuffer) {
/* 123 */     throw new RuntimeException("Stub!");
/*     */   } public static void glBindRenderbuffer(int target, int renderBuffer) {
/* 125 */     throw new RuntimeException("Stub!");
/*     */   } public static int glCheckFramebufferStatus(int target) {
/* 127 */     throw new RuntimeException("Stub!");
/*     */   } public static void glCullFace(int mode) {
/* 129 */     throw new RuntimeException("Stub!");
/*     */   } public static void glDeleteProgram(int program) {
/* 131 */     throw new RuntimeException("Stub!");
/*     */   } public static void glDepthFunc(int func) {
/* 133 */     throw new RuntimeException("Stub!");
/*     */   } public static void glDisable(int cap) {
/* 135 */     throw new RuntimeException("Stub!");
/*     */   } public static void glFramebufferRenderbuffer(int target, int attachment, int renderBufferTarget, int renderBuffer) {
/* 137 */     throw new RuntimeException("Stub!");
/*     */   } public static void glFramebufferTexture2D(int target, int attachment, int texTarget, int texture, int level) {
/* 139 */     throw new RuntimeException("Stub!");
/*     */   } public static void glFrontFace(int mode) {
/* 141 */     throw new RuntimeException("Stub!");
/*     */   } public static void glRenderbufferStorage(int target, int internalFormat, int width, int height) {
/* 143 */     throw new RuntimeException("Stub!");
/*     */   } public static void glTexParameterf(int target, int pName, float param) {
/* 145 */     throw new RuntimeException("Stub!");
/*     */   } public static void glUniform1f(int location, float v0) {
/* 147 */     throw new RuntimeException("Stub!");
/*     */   } public static void glUniform2f(int location, float v0, float v1) {
/* 149 */     throw new RuntimeException("Stub!");
/*     */   } public static void glUniform3f(int location, float v0, float v1, float v2) {
/* 151 */     throw new RuntimeException("Stub!");
/*     */   } public static void glUniform4f(int location, float v0, float v1, float v2, float v3) {
/* 153 */     throw new RuntimeException("Stub!");
/*     */   } public static void glBlendFunc(int sFactor, int dFactor) {
/* 155 */     throw new RuntimeException("Stub!");
/*     */   } public static void glBlendFuncSeparate(int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
/* 157 */     throw new RuntimeException("Stub!");
/*     */   } public static int glGetError() {
/* 159 */     throw new RuntimeException("Stub!");
/*     */   } public static void glDeleteFramebuffers(int n, IntBuffer frameBuffers) {
/* 161 */     throw new RuntimeException("Stub!");
/*     */   } public static void glDeleteRenderbuffers(int n, IntBuffer renderBuffers) {
/* 163 */     throw new RuntimeException("Stub!");
/*     */   } public static void glDeleteTextures(int n, IntBuffer textures) {
/* 165 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGenFramebuffers(int n, IntBuffer frameBuffers) {
/* 167 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGenRenderbuffers(int n, IntBuffer renderBuffers) {
/* 169 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGenTextures(int n, IntBuffer textures) {
/* 171 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGetShaderiv(int shader, int pName, IntBuffer params) {
/* 173 */     throw new RuntimeException("Stub!");
/*     */   } public static void glReadPixels(int x, int y, int width, int height, int format, int type, Buffer data) {
/* 175 */     throw new RuntimeException("Stub!");
/*     */   } public static void glTexImage2D(int target, int level, int internalFormat, int width, int height, int border, int format, int type, Buffer data) {
/* 177 */     throw new RuntimeException("Stub!");
/*     */   } public static void glDeleteShader(int shader) {
/* 179 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGetProgramiv(int program, int pName, int[] params) {
/* 181 */     throw new RuntimeException("Stub!");
/*     */   } public static void glUniform3fv(int location, int count, float[] value) {
/* 183 */     throw new RuntimeException("Stub!");
/*     */   } public static void glUniformMatrix4fv(int location, int count, boolean transpose, float[] value) {
/* 185 */     throw new RuntimeException("Stub!");
/*     */   } public static void glDeleteFramebuffers(int n, int[] frameBuffers) {
/* 187 */     throw new RuntimeException("Stub!");
/*     */   } public static void glDeleteRenderbuffers(int n, int[] renderBuffers) {
/* 189 */     throw new RuntimeException("Stub!");
/*     */   } public static void glDeleteTextures(int n, int[] textures) {
/* 191 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGenFramebuffers(int n, int[] frameBuffers) {
/* 193 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGenRenderbuffers(int n, int[] renderBuffers) {
/* 195 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetProgramInfoLog(int program, int maxLength, IntBuffer length, StringBuffer infoLog) {
/* 201 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetShaderInfoLog(int shader, int maxLength, IntBuffer length, StringBuffer infoLog) {
/* 207 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGenBuffers(int n, int[] buffers) {
/* 213 */     throw new RuntimeException("Stub!");
/*     */   } public static void glBindBuffer(int target, int buffer) {
/* 215 */     throw new RuntimeException("Stub!");
/*     */   } public static void glBufferData(int target, int size, Buffer data, int usage) {
/* 217 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGetShaderiv(int shader, int pName, int[] params) {
/* 219 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGenerateMipmap(int target) {
/* 221 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGetIntegerv(int pName, int[] params) {
/* 223 */     throw new RuntimeException("Stub!");
/*     */   } public static void glCompressedTexImage2D(int target, int level, int internalFormat, int width, int height, int border, int imageSize, Buffer data) {
/* 225 */     throw new RuntimeException("Stub!");
/*     */   } public static void glCompressedTexSubImage2D(int target, int level, int xOffset, int yOffset, int width, int height, int format, int imageSize, Buffer data) {
/* 227 */     throw new RuntimeException("Stub!");
/*     */   } public static void glDepthRangef(float nearVal, float farVal) {
/* 229 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGetAttachedShaders(int program, int maxCount, IntBuffer count, IntBuffer shaders) {
/* 231 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGetBufferParameteriv(int target, int value, IntBuffer data) {
/* 233 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pName, IntBuffer params) {
/* 235 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGetRenderbufferParameteriv(int target, int pName, IntBuffer params) {
/* 237 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGetShaderPrecisionFormat(int shaderType, int precisionType, IntBuffer range, IntBuffer precision) {
/* 239 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGetShaderSource(int shader, int bufSize, IntBuffer length, CharBuffer source) {
/* 241 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGetTexParameterfv(int target, int pName, FloatBuffer params) {
/* 243 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGetTexParameteriv(int target, int pName, IntBuffer params) {
/* 245 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGetUniformfv(int program, int location, FloatBuffer params) {
/* 247 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGetUniformiv(int program, int location, IntBuffer params) {
/* 249 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGetVertexAttribfv(int index, int pName, FloatBuffer params) {
/* 251 */     throw new RuntimeException("Stub!");
/*     */   } public static void glGetVertexAttribiv(int index, int pName, IntBuffer params) {
/* 253 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniformMatrix2fv(int location, int count, boolean transpose, float[] value) {
/* 259 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniform1iv(int location, int count, int[] value) {
/* 265 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean glIsTexture(int texture) {
/* 271 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean glIsProgram(int program) {
/* 277 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean glIsEnabled(int cap) {
/* 283 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetFloatv(int name, float[] params) {
/* 289 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetBooleanv(int pName, boolean[] params) {
/* 295 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetActiveUniform(int program, int index, int bufSize, int[] length, int[] size, int[] type, byte[] name) {
/* 301 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGetActiveAttrib(int program, int index, int bufSize, int[] length, int[] size, int[] type, byte[] name) {
/* 307 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDetachShader(int program, int shader) {
/* 313 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
/* 319 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glCopyTexImage2D(int target, int level, int internalformat, int x, int y, int width, int height, int border) {
/* 325 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glBlendEquationSeparate(int modeRGB, int modeAlpha) {
/* 331 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glBlendEquation(int mode) {
/* 337 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glHint(int target, int mode) {
/* 343 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean glIsBuffer(int buffer) {
/* 349 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean glIsFramebuffer(int frameBuffer) {
/* 355 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean glIsRenderbuffer(int renderBuffer) {
/* 361 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glPolygonOffset(float factor, float units) {
/* 367 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glReleaseShaderCompiler() {
/* 373 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glSampleCoverage(float value, boolean invert) {
/* 379 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glShaderBinary(int n, IntBuffer shaders, int binaryFormat, Buffer binary, int length) {
/* 385 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glStencilFuncSeparate(int face, int func, int ref, int mask) {
/* 391 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glStencilMaskSeparate(int face, int mask) {
/* 397 */     throw new RuntimeException("Stub!");
/*     */   } public static void glStencilOpSeparate(int face, int sFail, int dpFail, int dpPass) {
/* 399 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexParameterfv(int target, int pName, FloatBuffer param) {
/* 405 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexParameteriv(int target, int pName, IntBuffer param) {
/* 411 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glValidateProgram(int program) {
/* 417 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniformMatrix3fv(int location, int count, boolean transpose, float[] value) {
/* 423 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, Buffer pixels) {
/* 429 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glStencilOp(int fail, int zfail, int zpass) {
/* 435 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glStencilMask(int mask) {
/* 441 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glStencilFunc(int func, int ref, int mask) {
/* 447 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glPixelStorei(int pName, int param) {
/* 453 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glLineWidth(float width) {
/* 459 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static String glGetString(int name) {
/* 465 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glGenBuffers(int n, IntBuffer buffers) {
/* 471 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glFlush() {
/* 477 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glFinish() {
/* 483 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDepthMask(boolean flag) {
/* 489 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glDeleteBuffers(int n, IntBuffer buffers) {
/* 495 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glColorMask(boolean red, boolean green, boolean blue, boolean alpha) {
/* 501 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glClearStencil(int s) {
/* 507 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glClearDepthf(float depth) {
/* 513 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glBufferSubData(int target, int offset, int size, Buffer data) {
/* 519 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glBlendColor(float red, float green, float blue, float alpha) {
/* 525 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glScissor(int x, int y, int width, int height) {
/* 531 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glBindAttribLocation(int program, int index, String name) {
/* 537 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniform1fv(int location, int count, FloatBuffer value) {
/* 543 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniform2fv(int location, int count, FloatBuffer value) {
/* 549 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniform2i(int location, int v0, int v1) {
/* 555 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniform2iv(int location, int count, IntBuffer value) {
/* 561 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniform3i(int location, int v0, int v1, int v2) {
/* 567 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniform3iv(int location, int count, IntBuffer value) {
/* 573 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniform4i(int location, int v0, int v1, int v2, int v3) {
/* 579 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glUniform4iv(int location, int count, IntBuffer value) {
/* 585 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexAttrib1f(int index, float v0) {
/* 591 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexAttrib1fv(int index, FloatBuffer v) {
/* 597 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexAttrib2f(int index, float v0, float v1) {
/* 603 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexAttrib2fv(int index, FloatBuffer v) {
/* 609 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexAttrib3f(int index, float v0, float v1, float v2) {
/* 615 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexAttrib3fv(int index, FloatBuffer v) {
/* 621 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexAttrib4f(int index, float v0, float v1, float v2, float v3) {
/* 627 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void glVertexAttrib4fv(int index, FloatBuffer v) {
/* 633 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean glIsShader(int shader) {
/* 639 */     throw new RuntimeException("Stub!");
/*     */   } }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/agp/render/opengl/GLES20.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */