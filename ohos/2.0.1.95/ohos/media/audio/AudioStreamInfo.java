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
/*     */ public final class AudioStreamInfo
/*     */ {
/*     */   public static final int SAMPLE_RATE_FOR_DIRECT_HZ_MAX = 384000;
/*     */   public static final int SAMPLE_RATE_HZ_MAX = 192000;
/*     */   public static final int SAMPLE_RATE_HZ_MIN = 4000;
/*     */   public static final int SAMPLE_RATE_UNSPECIFIED = 4000;
/*     */   
/*     */   AudioStreamInfo(EncodingFormat encodingFormat, int sampleRate, ChannelMask channelMask, StreamUsage streamUsage, ContentType contentType, AudioStreamFlag streamFlag) {
/*  25 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public EncodingFormat getEncodingFormat() {
/*  34 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSampleRate() {
/*  43 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ChannelMask getChannelMask() {
/*  52 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public StreamUsage getUsage() {
/*  61 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public StreamType getStreamType() {
/*  70 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ContentType getContentType() {
/*  79 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AudioStreamFlag getAudioStreamFlag() {
/*  88 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/*  97 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isValidEncodingFormat(EncodingFormat format) {
/* 107 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isValidOutChannelMask(ChannelMask channelMask) {
/* 117 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getChannelCount(ChannelMask mask) {
/* 127 */     throw new RuntimeException("Stub!");
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
/*     */   public enum AudioStreamFlag
/*     */   {
/* 173 */     AUDIO_STREAM_FLAG_NONE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 178 */     AUDIO_STREAM_FLAG_AUDIBILITY_ENFORCED,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 183 */     AUDIO_STREAM_FLAG_SECURE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 188 */     AUDIO_STREAM_FLAG_SCO,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 193 */     AUDIO_STREAM_FLAG_BEACON,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 198 */     AUDIO_STREAM_FLAG_HW_AV_SYNC,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 203 */     AUDIO_STREAM_FLAG_HW_HOTWORD,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 208 */     AUDIO_STREAM_FLAG_BYPASS_INTERRUPTION_POLICY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 213 */     AUDIO_STREAM_FLAG_BYPASS_MUTE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 218 */     AUDIO_STREAM_FLAG_LOW_LATENCY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 223 */     AUDIO_STREAM_FLAG_DEEP_BUFFER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 228 */     AUDIO_STREAM_FLAG_NO_MEDIA_PROJECTION,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 233 */     AUDIO_STREAM_FLAG_MUTE_HAPTIC,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 238 */     AUDIO_STREAM_FLAG_NO_SYSTEM_CAPTURE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 243 */     AUDIO_STREAM_FLAG_DIRECT_OUTPUT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 248 */     AUDIO_STREAM_FLAG_MAY_DUCK,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 254 */     AUDIO_STREAM_FLAG_MAY_RESUME,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 259 */     AUDIO_STREAM_FLAG_MAY_WAITING_INTERRUPT;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getValue() {
/* 268 */       throw new RuntimeException("Stub!");
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
/*     */   public static class Builder
/*     */   {
/*     */     public Builder() {
/* 286 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder encodingFormat(AudioStreamInfo.EncodingFormat inputEncodingFormat) {
/* 296 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder sampleRate(int inputSampleRate) {
/* 306 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder channelMask(AudioStreamInfo.ChannelMask inputChannelMask) {
/* 316 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder streamUsage(AudioStreamInfo.StreamUsage inputStreamUsage) {
/* 326 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder audioStreamFlag(AudioStreamInfo.AudioStreamFlag flag) {
/* 336 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public AudioStreamInfo build() {
/* 345 */       throw new RuntimeException("Stub!");
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
/*     */   public enum ChannelMask
/*     */   {
/* 360 */     CHANNEL_INVALID,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 365 */     CHANNEL_OUT_DEFAULT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 370 */     CHANNEL_OUT_FRONT_LEFT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 375 */     CHANNEL_OUT_FRONT_RIGHT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 380 */     CHANNEL_OUT_FRONT_CENTER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 385 */     CHANNEL_OUT_LOW_FREQUENCY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 390 */     CHANNEL_OUT_BACK_LEFT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 395 */     CHANNEL_OUT_BACK_RIGHT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 400 */     CHANNEL_OUT_FRONT_LEFT_OF_CENTER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 405 */     CHANNEL_OUT_FRONT_RIGHT_OF_CENTER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 410 */     CHANNEL_OUT_BACK_CENTER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 415 */     CHANNEL_OUT_SIDE_LEFT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 420 */     CHANNEL_OUT_SIDE_RIGHT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 425 */     CHANNEL_OUT_TOP_CENTER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 430 */     CHANNEL_OUT_TOP_FRONT_LEFT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 435 */     CHANNEL_OUT_TOP_FRONT_CENTER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 440 */     CHANNEL_OUT_TOP_FRONT_RIGHT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 445 */     CHANNEL_OUT_TOP_BACK_LEFT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 450 */     CHANNEL_OUT_TOP_BACK_CENTER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 455 */     CHANNEL_OUT_TOP_BACK_RIGHT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 460 */     CHANNEL_OUT_MONO,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 466 */     CHANNEL_OUT_STEREO,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 473 */     CHANNEL_OUT_QUAD,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 480 */     CHANNEL_OUT_QUAD_SIDE,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 487 */     CHANNEL_OUT_SURROUND,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 494 */     CHANNEL_OUT_5POINT1,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 501 */     CHANNEL_OUT_5POINT1_SIDE,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 509 */     CHANNEL_OUT_7POINT1,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 514 */     CHANNEL_IN_MONO,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 519 */     CHANNEL_IN_STEREO;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getValue() {
/* 528 */       throw new RuntimeException("Stub!");
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
/*     */   public enum ContentType
/*     */   {
/* 543 */     CONTENT_TYPE_UNKNOWN,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 548 */     CONTENT_TYPE_SPEECH,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 553 */     CONTENT_TYPE_MUSIC,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 559 */     CONTENT_TYPE_MOVIE,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 567 */     CONTENT_TYPE_SONIFICATION;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getValue() {
/* 576 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static ContentType getEnum(int value) {
/* 585 */       throw new RuntimeException("Stub!");
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
/*     */   public enum EncodingFormat
/*     */   {
/* 600 */     ENCODING_INVALID,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 605 */     ENCODING_DEFAULT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 610 */     ENCODING_PCM_16BIT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 615 */     ENCODING_PCM_8BIT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 620 */     ENCODING_PCM_FLOAT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 625 */     ENCODING_MP3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getValue() {
/* 634 */       throw new RuntimeException("Stub!");
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
/*     */   public enum StreamType
/*     */   {
/* 649 */     STREAM_TYPE_VOICE_CALL,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 654 */     STREAM_TYPE_SYSTEM,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 659 */     STREAM_TYPE_RING,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 664 */     STREAM_TYPE_MUSIC,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 669 */     STREAM_TYPE_ALARM,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 674 */     STREAM_TYPE_NOTIFICATION,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 679 */     STREAM_TYPE_DTMF,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 684 */     STREAM_TYPE_ACCESSIBILITY;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getValue() {
/* 693 */       throw new RuntimeException("Stub!");
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
/*     */   public enum StreamUsage
/*     */   {
/* 708 */     STREAM_USAGE_UNKNOWN,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 714 */     STREAM_USAGE_MEDIA,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 720 */     STREAM_USAGE_VOICE_COMMUNICATION,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 726 */     STREAM_USAGE_VOICE_COMMUNICATION_SIGNALLING,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 731 */     STREAM_USAGE_ALARM,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 737 */     STREAM_USAGE_NOTIFICATION,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 742 */     STREAM_USAGE_NOTIFICATION_RINGTONE,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 748 */     STREAM_USAGE_NOTIFICATION_COMMUNICATION_REQUEST,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 754 */     STREAM_USAGE_NOTIFICATION_COMMUNICATION_INSTANT,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 760 */     STREAM_USAGE_NOTIFICATION_COMMUNICATION_DELAYED,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 766 */     STREAM_USAGE_NOTIFICATION_EVENT,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 772 */     STREAM_USAGE_ASSISTANCE_ACCESSIBILITY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 777 */     STREAM_USAGE_ASSISTANCE_NAVIGATION_GUIDANCE,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 783 */     STREAM_USAGE_ASSISTANCE_SONIFICATION,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 788 */     STREAM_USAGE_GAME,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 794 */     STREAM_USAGE_VIRTUAL_SOURCE,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 800 */     STREAM_USAGE_ASSISTANT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 805 */     STREAM_USAGE_TTS;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getValue() {
/* 814 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static StreamUsage getEnum(int value) {
/* 823 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/media/audio/AudioStreamInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */