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
/*     */ public final class AudioRendererInfo
/*     */ {
/*     */   public static final int SESSION_ID_UNSPECIFIED = 0;
/*     */   
/*     */   AudioRendererInfo(AudioStreamInfo audioStreamInfo, int sessionID, long bufferSizeInBytes, boolean isOffload, AudioStreamOutputFlag outputFlag, String distributedDeviceId, int deviceId) {
/*  22 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AudioStreamInfo getAudioStreamInfo() {
/*  31 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSessionID() {
/*  40 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getBufferSizeInBytes() {
/*  49 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isOffload() {
/*  58 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AudioStreamOutputFlag getAudioStreamOutputFlag() {
/*  67 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDistributedDeviceId() {
/*  76 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getDeviceId() {
/*  85 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/*  94 */     throw new RuntimeException("Stub!");
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
/*     */   public enum AudioStreamOutputFlag
/*     */   {
/* 115 */     AUDIO_STREAM_OUTPUT_FLAG_NONE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 120 */     AUDIO_STREAM_OUTPUT_FLAG_DIRECT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 125 */     AUDIO_STREAM_OUTPUT_FLAG_PRIMARY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 130 */     AUDIO_STREAM_OUTPUT_FLAG_FAST,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 135 */     AUDIO_STREAM_OUTPUT_FLAG_DEEP_BUFFER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 140 */     AUDIO_STREAM_OUTPUT_FLAG_COMPRESS_OFFLOAD,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 145 */     AUDIO_STREAM_OUTPUT_FLAG_NONE_BLOCKING,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 150 */     AUDIO_STREAM_OUTPUT_FLAG_HW_AV_SYNC,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 155 */     AUDIO_STREAM_OUTPUT_FLAG_TTS,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 160 */     AUDIO_STREAM_OUTPUT_FLAG_RAW,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 165 */     AUDIO_STREAM_OUTPUT_FLAG_SYNC,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 170 */     AUDIO_STREAM_OUTPUT_FLAG_IEC958_NONAUDIO,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 175 */     AUDIO_STREAM_OUTPUT_FLAG_DIRECT_PCM,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 180 */     AUDIO_STREAM_OUTPUT_FLAG_MMAP_NOIRQ,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 185 */     AUDIO_STREAM_OUTPUT_FLAG_VOIP_RX,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 190 */     AUDIO_STREAM_OUTPUT_FLAG_INCALL_MUSIC;
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
/* 207 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class Builder
/*     */   {
/*     */     public Builder() {
/* 219 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder audioStreamInfo(AudioStreamInfo audioStreamInfo) {
/* 228 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder sessionID(int sessionID) {
/* 238 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder deviceId(int id) {
/* 248 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder bufferSizeInBytes(long bufferSizeInBytes) {
/* 258 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder isOffload(boolean isOffload) {
/* 268 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder audioStreamOutputFlag(AudioRendererInfo.AudioStreamOutputFlag outputFlag) {
/* 278 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder distributedDeviceId(String distributedDeviceId) {
/* 288 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public AudioRendererInfo build() {
/* 298 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/media/audio/AudioRendererInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */