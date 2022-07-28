/*     */ package ohos.media.audio;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class AudioRendererInfo
/*     */ {
/*     */   public static final int SESSION_ID_UNSPECIFIED = 0;
/*     */   
/*     */   AudioRendererInfo(AudioStreamInfo audioStreamInfo, int sessionID, long bufferSizeInBytes, boolean isOffload, AudioStreamOutputFlag outputFlag, String distributedDeviceId, int deviceId) {
/*  24 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AudioStreamInfo getAudioStreamInfo() {
/*  33 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSessionID() {
/*  42 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getBufferSizeInBytes() {
/*  51 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isOffload() {
/*  60 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AudioStreamOutputFlag getAudioStreamOutputFlag() {
/*  69 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getDeviceId() {
/*  78 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/*  87 */     throw new RuntimeException("Stub!");
/*     */   }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public enum AudioStreamOutputFlag
/*     */   {
/* 109 */     AUDIO_STREAM_OUTPUT_FLAG_NONE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 114 */     AUDIO_STREAM_OUTPUT_FLAG_DIRECT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 119 */     AUDIO_STREAM_OUTPUT_FLAG_PRIMARY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 124 */     AUDIO_STREAM_OUTPUT_FLAG_FAST,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 129 */     AUDIO_STREAM_OUTPUT_FLAG_DEEP_BUFFER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 134 */     AUDIO_STREAM_OUTPUT_FLAG_COMPRESS_OFFLOAD,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 139 */     AUDIO_STREAM_OUTPUT_FLAG_NONE_BLOCKING,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 144 */     AUDIO_STREAM_OUTPUT_FLAG_HW_AV_SYNC,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 149 */     AUDIO_STREAM_OUTPUT_FLAG_TTS,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 154 */     AUDIO_STREAM_OUTPUT_FLAG_RAW,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 159 */     AUDIO_STREAM_OUTPUT_FLAG_SYNC,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 164 */     AUDIO_STREAM_OUTPUT_FLAG_IEC958_NONAUDIO,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 169 */     AUDIO_STREAM_OUTPUT_FLAG_DIRECT_PCM,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 174 */     AUDIO_STREAM_OUTPUT_FLAG_MMAP_NOIRQ,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 179 */     AUDIO_STREAM_OUTPUT_FLAG_VOIP_RX,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 184 */     AUDIO_STREAM_OUTPUT_FLAG_INCALL_MUSIC;
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
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getOutputFlag() {
/* 201 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class Builder
/*     */   {
/*     */     public Builder() {
/* 214 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder audioStreamInfo(AudioStreamInfo audioStreamInfo) {
/* 223 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder sessionID(int sessionID) {
/* 233 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder deviceId(int id) {
/* 243 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder bufferSizeInBytes(long bufferSizeInBytes) {
/* 253 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder isOffload(boolean isOffload) {
/* 263 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder audioStreamOutputFlag(AudioRendererInfo.AudioStreamOutputFlag outputFlag) {
/* 273 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public AudioRendererInfo build() {
/* 283 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/media/audio/AudioRendererInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */