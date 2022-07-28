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
/*     */   AudioRendererInfo(AudioStreamInfo audioStreamInfo, int sessionID, long bufferSizeInBytes, boolean isOffload, AudioStreamOutputFlag outputFlag, String distributedDeviceId, int deviceId, PrivilegedMode privilegedMode) {
/*  32 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AudioStreamInfo getAudioStreamInfo() {
/*  41 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSessionID() {
/*  50 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getBufferSizeInBytes() {
/*  59 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isOffload() {
/*  68 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AudioStreamOutputFlag getAudioStreamOutputFlag() {
/*  77 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getDeviceId() {
/*  86 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/*  95 */     throw new RuntimeException("Stub!");
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
/* 117 */     AUDIO_STREAM_OUTPUT_FLAG_NONE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 122 */     AUDIO_STREAM_OUTPUT_FLAG_DIRECT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 127 */     AUDIO_STREAM_OUTPUT_FLAG_PRIMARY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 132 */     AUDIO_STREAM_OUTPUT_FLAG_FAST,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 137 */     AUDIO_STREAM_OUTPUT_FLAG_DEEP_BUFFER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 142 */     AUDIO_STREAM_OUTPUT_FLAG_COMPRESS_OFFLOAD,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 147 */     AUDIO_STREAM_OUTPUT_FLAG_NONE_BLOCKING,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 152 */     AUDIO_STREAM_OUTPUT_FLAG_HW_AV_SYNC,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 157 */     AUDIO_STREAM_OUTPUT_FLAG_TTS,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 162 */     AUDIO_STREAM_OUTPUT_FLAG_RAW,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 167 */     AUDIO_STREAM_OUTPUT_FLAG_SYNC,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 172 */     AUDIO_STREAM_OUTPUT_FLAG_IEC958_NONAUDIO,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 177 */     AUDIO_STREAM_OUTPUT_FLAG_DIRECT_PCM,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 182 */     AUDIO_STREAM_OUTPUT_FLAG_MMAP_NOIRQ,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 187 */     AUDIO_STREAM_OUTPUT_FLAG_VOIP_RX,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 192 */     AUDIO_STREAM_OUTPUT_FLAG_INCALL_MUSIC;
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
/*     */     public int getOutputFlag() {
/* 212 */       throw new RuntimeException("Stub!");
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
/* 225 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder audioStreamInfo(AudioStreamInfo audioStreamInfo) {
/* 234 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder sessionID(int sessionID) {
/* 244 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder deviceId(int id) {
/* 254 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder bufferSizeInBytes(long bufferSizeInBytes) {
/* 264 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder isOffload(boolean isOffload) {
/* 274 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder audioStreamOutputFlag(AudioRendererInfo.AudioStreamOutputFlag outputFlag) {
/* 284 */       throw new RuntimeException("Stub!");
/*     */     }
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
/*     */     public Builder privilegedMode(AudioRendererInfo.PrivilegedMode privilegedMode) {
/* 301 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public AudioRendererInfo build() {
/* 311 */       throw new RuntimeException("Stub!");
/*     */     }
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
/*     */   public enum PrivilegedMode
/*     */   {
/* 326 */     DEFAULT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 331 */     LOW_LATENCY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 336 */     LOW_POWER;
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
/*     */     public int getValue() {
/* 356 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/media/audio/AudioRendererInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */