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
/*     */ public final class AudioStreamInfo
/*     */ {
/*     */   public static final int SAMPLE_RATE_FOR_DIRECT_HZ_MAX = 384000;
/*     */   public static final int SAMPLE_RATE_HZ_MAX = 192000;
/*     */   public static final int SAMPLE_RATE_HZ_MIN = 4000;
/*     */   public static final int SAMPLE_RATE_UNSPECIFIED = 4000;
/*     */   
/*     */   AudioStreamInfo(EncodingFormat encodingFormat, int sampleRate, ChannelMask channelMask, StreamUsage streamUsage, ContentType contentType, AudioStreamFlag streamFlag) {
/*  35 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public EncodingFormat getEncodingFormat() {
/*  44 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSampleRate() {
/*  53 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ChannelMask getChannelMask() {
/*  62 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public StreamUsage getUsage() {
/*  71 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public StreamType getStreamType() {
/*  80 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ContentType getContentType() {
/*  89 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AudioStreamFlag getAudioStreamFlag() {
/*  98 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 107 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isValidEncodingFormat(EncodingFormat format) {
/* 117 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isValidOutChannelMask(ChannelMask channelMask) {
/* 127 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getChannelCount(ChannelMask mask) {
/* 137 */     throw new RuntimeException("Stub!");
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
/*     */   public enum AudioStreamFlag
/*     */   {
/* 184 */     AUDIO_STREAM_FLAG_NONE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 189 */     AUDIO_STREAM_FLAG_AUDIBILITY_ENFORCED,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 194 */     AUDIO_STREAM_FLAG_SECURE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 199 */     AUDIO_STREAM_FLAG_SCO,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 204 */     AUDIO_STREAM_FLAG_BEACON,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 209 */     AUDIO_STREAM_FLAG_HW_AV_SYNC,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 214 */     AUDIO_STREAM_FLAG_HW_HOTWORD,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 219 */     AUDIO_STREAM_FLAG_BYPASS_INTERRUPTION_POLICY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 224 */     AUDIO_STREAM_FLAG_BYPASS_MUTE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 229 */     AUDIO_STREAM_FLAG_LOW_LATENCY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 234 */     AUDIO_STREAM_FLAG_DEEP_BUFFER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 239 */     AUDIO_STREAM_FLAG_NO_MEDIA_PROJECTION,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 244 */     AUDIO_STREAM_FLAG_MUTE_HAPTIC,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 249 */     AUDIO_STREAM_FLAG_NO_SYSTEM_CAPTURE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 254 */     AUDIO_STREAM_FLAG_DIRECT_OUTPUT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 259 */     AUDIO_STREAM_FLAG_MAY_DUCK,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 265 */     AUDIO_STREAM_FLAG_MAY_RESUME,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 270 */     AUDIO_STREAM_FLAG_MAY_WAITING_INTERRUPT;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getValue() {
/* 279 */       throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */   
/*     */   public static class Builder
/*     */   {
/*     */     public Builder() {
/* 298 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder encodingFormat(AudioStreamInfo.EncodingFormat inputEncodingFormat) {
/* 308 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder sampleRate(int inputSampleRate) {
/* 318 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder channelMask(AudioStreamInfo.ChannelMask inputChannelMask) {
/* 328 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder streamUsage(AudioStreamInfo.StreamUsage inputStreamUsage) {
/* 338 */       throw new RuntimeException("Stub!");
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
/*     */     public Builder contentType(AudioStreamInfo.ContentType contentType) {
/* 353 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder audioStreamFlag(AudioStreamInfo.AudioStreamFlag flag) {
/* 363 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public AudioStreamInfo build() {
/* 372 */       throw new RuntimeException("Stub!");
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
/*     */   
/*     */   public enum ChannelMask
/*     */   {
/* 388 */     CHANNEL_INVALID,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 393 */     CHANNEL_OUT_DEFAULT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 398 */     CHANNEL_OUT_FRONT_LEFT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 403 */     CHANNEL_OUT_FRONT_RIGHT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 408 */     CHANNEL_OUT_FRONT_CENTER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 413 */     CHANNEL_OUT_LOW_FREQUENCY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 418 */     CHANNEL_OUT_BACK_LEFT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 423 */     CHANNEL_OUT_BACK_RIGHT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 428 */     CHANNEL_OUT_FRONT_LEFT_OF_CENTER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 433 */     CHANNEL_OUT_FRONT_RIGHT_OF_CENTER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 438 */     CHANNEL_OUT_BACK_CENTER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 443 */     CHANNEL_OUT_SIDE_LEFT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 448 */     CHANNEL_OUT_SIDE_RIGHT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 453 */     CHANNEL_OUT_TOP_CENTER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 458 */     CHANNEL_OUT_TOP_FRONT_LEFT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 463 */     CHANNEL_OUT_TOP_FRONT_CENTER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 468 */     CHANNEL_OUT_TOP_FRONT_RIGHT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 473 */     CHANNEL_OUT_TOP_BACK_LEFT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 478 */     CHANNEL_OUT_TOP_BACK_CENTER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 483 */     CHANNEL_OUT_TOP_BACK_RIGHT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 488 */     CHANNEL_OUT_MONO,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 494 */     CHANNEL_OUT_STEREO,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 501 */     CHANNEL_OUT_QUAD,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 508 */     CHANNEL_OUT_QUAD_SIDE,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 515 */     CHANNEL_OUT_SURROUND,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 522 */     CHANNEL_OUT_5POINT1,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 529 */     CHANNEL_OUT_5POINT1_SIDE,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 537 */     CHANNEL_OUT_7POINT1,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 542 */     CHANNEL_IN_MONO,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 547 */     CHANNEL_IN_STEREO;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getValue() {
/* 556 */       throw new RuntimeException("Stub!");
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
/*     */   
/*     */   public enum ContentType
/*     */   {
/* 572 */     CONTENT_TYPE_UNKNOWN,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 577 */     CONTENT_TYPE_SPEECH,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 582 */     CONTENT_TYPE_MUSIC,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 588 */     CONTENT_TYPE_MOVIE,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 596 */     CONTENT_TYPE_SONIFICATION;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getValue() {
/* 605 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static ContentType getEnum(int value) {
/* 615 */       throw new RuntimeException("Stub!");
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
/*     */   
/*     */   public enum EncodingFormat
/*     */   {
/* 631 */     ENCODING_INVALID,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 636 */     ENCODING_DEFAULT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 641 */     ENCODING_PCM_16BIT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 646 */     ENCODING_PCM_8BIT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 651 */     ENCODING_PCM_FLOAT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 656 */     ENCODING_MP3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getValue() {
/* 665 */       throw new RuntimeException("Stub!");
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
/*     */   
/*     */   public enum StreamType
/*     */   {
/* 681 */     STREAM_TYPE_VOICE_CALL,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 686 */     STREAM_TYPE_SYSTEM,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 691 */     STREAM_TYPE_RING,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 696 */     STREAM_TYPE_MUSIC,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 701 */     STREAM_TYPE_ALARM,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 706 */     STREAM_TYPE_NOTIFICATION,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 711 */     STREAM_TYPE_DTMF,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 716 */     STREAM_TYPE_ACCESSIBILITY;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getValue() {
/* 725 */       throw new RuntimeException("Stub!");
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
/*     */   
/*     */   public enum StreamUsage
/*     */   {
/* 741 */     STREAM_USAGE_UNKNOWN,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 747 */     STREAM_USAGE_MEDIA,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 753 */     STREAM_USAGE_VOICE_COMMUNICATION,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 759 */     STREAM_USAGE_VOICE_COMMUNICATION_SIGNALLING,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 764 */     STREAM_USAGE_ALARM,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 770 */     STREAM_USAGE_NOTIFICATION,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 775 */     STREAM_USAGE_NOTIFICATION_RINGTONE,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 781 */     STREAM_USAGE_NOTIFICATION_COMMUNICATION_REQUEST,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 787 */     STREAM_USAGE_NOTIFICATION_COMMUNICATION_INSTANT,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 793 */     STREAM_USAGE_NOTIFICATION_COMMUNICATION_DELAYED,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 799 */     STREAM_USAGE_NOTIFICATION_EVENT,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 805 */     STREAM_USAGE_ASSISTANCE_ACCESSIBILITY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 810 */     STREAM_USAGE_ASSISTANCE_NAVIGATION_GUIDANCE,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 816 */     STREAM_USAGE_ASSISTANCE_SONIFICATION,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 821 */     STREAM_USAGE_GAME,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 827 */     STREAM_USAGE_VIRTUAL_SOURCE,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 833 */     STREAM_USAGE_ASSISTANT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 838 */     STREAM_USAGE_TTS;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getValue() {
/* 847 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static StreamUsage getEnum(int value) {
/* 857 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/media/audio/AudioStreamInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */