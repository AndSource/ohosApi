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
/*     */ public final class AudioCapturerInfo
/*     */ {
/*     */   public static final int SESSION_ID_UNSPECIFIED = 0;
/*     */   
/*     */   AudioCapturerInfo(AudioStreamInfo audioStreamInfo, int sessionID, long bufferSizeInBytes, AudioInputSource inputSource, String distributedDeviceId) {
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
/*     */   public AudioInputSource getInputSource() {
/*  68 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/*  77 */     throw new RuntimeException("Stub!");
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
/*     */   public enum AudioInputSource
/*     */   {
/*  99 */     AUDIO_INPUT_SOURCE_INVALID,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 104 */     AUDIO_INPUT_SOURCE_DEFAULT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 109 */     AUDIO_INPUT_SOURCE_MIC,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 114 */     AUDIO_INPUT_SOURCE_VOICE_UPLINK,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 119 */     AUDIO_INPUT_SOURCE_VOICE_DOWNLINK,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 124 */     AUDIO_INPUT_SOURCE_VOICE_CALL,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 129 */     AUDIO_INPUT_SOURCE_CAMCORDER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 134 */     AUDIO_INPUT_SOURCE_VOICE_RECOGNITION,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 139 */     AUDIO_INPUT_SOURCE_VOICE_COMMUNICATION,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 144 */     AUDIO_INPUT_SOURCE_REMOTE_SUBMIX,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 149 */     AUDIO_INPUT_SOURCE_UNPROCESSED,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 155 */     AUDIO_INPUT_SOURCE_VOICE_PERFORMANCE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 160 */     AUDIO_INPUT_SOURCE_ECHO_REFERENCE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 165 */     AUDIO_INPUT_SOURCE_FM_TUNER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 170 */     AUDIO_INPUT_SOURCE_HOTWORD,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 175 */     AUDIO_INPUT_SOURCE_REMOTE_SUBMIX_EXTEND;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getValue() {
/* 184 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static AudioInputSource getEnum(int value) {
/* 193 */       throw new RuntimeException("Stub!");
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
/* 206 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder audioStreamInfo(AudioStreamInfo audioStreamInfo) {
/* 215 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder sessionID(int sessionID) {
/* 225 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder bufferSizeInBytes(long bufferSizeInBytes) {
/* 235 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder audioInputSource(AudioCapturerInfo.AudioInputSource inputSource) {
/* 245 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public AudioCapturerInfo build() {
/* 255 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/media/audio/AudioCapturerInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */