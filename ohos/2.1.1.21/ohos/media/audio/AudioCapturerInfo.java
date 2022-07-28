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
/*     */ public final class AudioCapturerInfo
/*     */ {
/*     */   public static final int SESSION_ID_UNSPECIFIED = 0;
/*     */   
/*     */   AudioCapturerInfo(AudioStreamInfo audioStreamInfo, int sessionID, long bufferSizeInBytes, AudioInputSource inputSource, String distributedDeviceId) {
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
/*     */   public AudioInputSource getInputSource() {
/*  60 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/*  69 */     throw new RuntimeException("Stub!");
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
/*  91 */     AUDIO_INPUT_SOURCE_INVALID,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  96 */     AUDIO_INPUT_SOURCE_DEFAULT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 101 */     AUDIO_INPUT_SOURCE_MIC,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 106 */     AUDIO_INPUT_SOURCE_VOICE_UPLINK,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 111 */     AUDIO_INPUT_SOURCE_VOICE_DOWNLINK,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 116 */     AUDIO_INPUT_SOURCE_VOICE_CALL,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 121 */     AUDIO_INPUT_SOURCE_CAMCORDER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 126 */     AUDIO_INPUT_SOURCE_VOICE_RECOGNITION,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 131 */     AUDIO_INPUT_SOURCE_VOICE_COMMUNICATION,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 136 */     AUDIO_INPUT_SOURCE_REMOTE_SUBMIX,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 141 */     AUDIO_INPUT_SOURCE_UNPROCESSED,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 147 */     AUDIO_INPUT_SOURCE_VOICE_PERFORMANCE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 152 */     AUDIO_INPUT_SOURCE_ECHO_REFERENCE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 157 */     AUDIO_INPUT_SOURCE_FM_TUNER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 162 */     AUDIO_INPUT_SOURCE_HOTWORD,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 167 */     AUDIO_INPUT_SOURCE_REMOTE_SUBMIX_EXTEND;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getValue() {
/* 176 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static AudioInputSource getEnum(int value) {
/* 185 */       throw new RuntimeException("Stub!");
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
/* 198 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder audioStreamInfo(AudioStreamInfo audioStreamInfo) {
/* 207 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder sessionID(int sessionID) {
/* 217 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder bufferSizeInBytes(long bufferSizeInBytes) {
/* 227 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder audioInputSource(AudioCapturerInfo.AudioInputSource inputSource) {
/* 237 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public AudioCapturerInfo build() {
/* 247 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/media/audio/AudioCapturerInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */