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
/*     */ public final class AudioCapturerInfo
/*     */ {
/*     */   public static final int SESSION_ID_UNSPECIFIED = 0;
/*     */   
/*     */   AudioCapturerInfo(AudioStreamInfo audioStreamInfo, int sessionID, long bufferSizeInBytes, AudioInputSource inputSource, String distributedDeviceId) {
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
/*     */   public AudioInputSource getInputSource() {
/*  58 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDistributedDeviceId() {
/*  67 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/*  76 */     throw new RuntimeException("Stub!");
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
/*     */   public enum AudioInputSource
/*     */   {
/*  97 */     AUDIO_INPUT_SOURCE_INVALID,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 102 */     AUDIO_INPUT_SOURCE_DEFAULT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 107 */     AUDIO_INPUT_SOURCE_MIC,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 112 */     AUDIO_INPUT_SOURCE_VOICE_UPLINK,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 117 */     AUDIO_INPUT_SOURCE_VOICE_DOWNLINK,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 122 */     AUDIO_INPUT_SOURCE_VOICE_CALL,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 127 */     AUDIO_INPUT_SOURCE_CAMCORDER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 132 */     AUDIO_INPUT_SOURCE_VOICE_RECOGNITION,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 137 */     AUDIO_INPUT_SOURCE_VOICE_COMMUNICATION,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 142 */     AUDIO_INPUT_SOURCE_REMOTE_SUBMIX,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 147 */     AUDIO_INPUT_SOURCE_UNPROCESSED,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 153 */     AUDIO_INPUT_SOURCE_VOICE_PERFORMANCE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 158 */     AUDIO_INPUT_SOURCE_ECHO_REFERENCE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 163 */     AUDIO_INPUT_SOURCE_FM_TUNER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 168 */     AUDIO_INPUT_SOURCE_HOTWORD,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 173 */     AUDIO_INPUT_SOURCE_REMOTE_SUBMIX_EXTEND;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getValue() {
/* 182 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static AudioInputSource getEnum(int value) {
/* 191 */       throw new RuntimeException("Stub!");
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
/* 203 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder audioStreamInfo(AudioStreamInfo audioStreamInfo) {
/* 212 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder sessionID(int sessionID) {
/* 222 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder bufferSizeInBytes(long bufferSizeInBytes) {
/* 232 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder audioInputSource(AudioCapturerInfo.AudioInputSource inputSource) {
/* 242 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder distributedDeviceId(String distributedDeviceId) {
/* 252 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public AudioCapturerInfo build() {
/* 262 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/media/audio/AudioCapturerInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */