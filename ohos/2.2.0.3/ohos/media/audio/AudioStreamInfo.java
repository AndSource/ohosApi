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
/*     */ public final class AudioStreamInfo
/*     */ {
/*     */   public static final int SAMPLE_RATE_FOR_DIRECT_HZ_MAX = 384000;
/*     */   public static final int SAMPLE_RATE_HZ_MAX = 192000;
/*     */   public static final int SAMPLE_RATE_HZ_MIN = 4000;
/*     */   public static final int SAMPLE_RATE_UNSPECIFIED = 4000;
/*     */   
/*     */   AudioStreamInfo(EncodingFormat encodingFormat, int sampleRate, ChannelMask channelMask, StreamUsage streamUsage, ContentType contentType, AudioStreamFlag streamFlag) {
/*  27 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public EncodingFormat getEncodingFormat() {
/*  36 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSampleRate() {
/*  45 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ChannelMask getChannelMask() {
/*  54 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public StreamUsage getUsage() {
/*  63 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public StreamType getStreamType() {
/*  72 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ContentType getContentType() {
/*  81 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AudioStreamFlag getAudioStreamFlag() {
/*  90 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/*  99 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isValidEncodingFormat(EncodingFormat format) {
/* 109 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isValidOutChannelMask(ChannelMask channelMask) {
/* 119 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getChannelCount(ChannelMask mask) {
/* 129 */     throw new RuntimeException("Stub!");
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
/* 176 */     AUDIO_STREAM_FLAG_NONE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 181 */     AUDIO_STREAM_FLAG_AUDIBILITY_ENFORCED,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 186 */     AUDIO_STREAM_FLAG_SECURE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 191 */     AUDIO_STREAM_FLAG_SCO,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 196 */     AUDIO_STREAM_FLAG_BEACON,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 201 */     AUDIO_STREAM_FLAG_HW_AV_SYNC,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 206 */     AUDIO_STREAM_FLAG_HW_HOTWORD,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 211 */     AUDIO_STREAM_FLAG_BYPASS_INTERRUPTION_POLICY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 216 */     AUDIO_STREAM_FLAG_BYPASS_MUTE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 221 */     AUDIO_STREAM_FLAG_LOW_LATENCY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 226 */     AUDIO_STREAM_FLAG_DEEP_BUFFER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 231 */     AUDIO_STREAM_FLAG_NO_MEDIA_PROJECTION,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 236 */     AUDIO_STREAM_FLAG_MUTE_HAPTIC,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 241 */     AUDIO_STREAM_FLAG_NO_SYSTEM_CAPTURE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 246 */     AUDIO_STREAM_FLAG_DIRECT_OUTPUT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 251 */     AUDIO_STREAM_FLAG_MAY_DUCK,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 257 */     AUDIO_STREAM_FLAG_MAY_RESUME,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 262 */     AUDIO_STREAM_FLAG_MAY_WAITING_INTERRUPT;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getValue() {
/* 271 */       throw new RuntimeException("Stub!");
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
/* 290 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder encodingFormat(AudioStreamInfo.EncodingFormat inputEncodingFormat) {
/* 300 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder sampleRate(int inputSampleRate) {
/* 310 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder channelMask(AudioStreamInfo.ChannelMask inputChannelMask) {
/* 320 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder streamUsage(AudioStreamInfo.StreamUsage inputStreamUsage) {
/* 330 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder audioStreamFlag(AudioStreamInfo.AudioStreamFlag flag) {
/* 340 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public AudioStreamInfo build() {
/* 349 */       throw new RuntimeException("Stub!");
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
/* 365 */     CHANNEL_INVALID,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 370 */     CHANNEL_OUT_DEFAULT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 375 */     CHANNEL_OUT_FRONT_LEFT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 380 */     CHANNEL_OUT_FRONT_RIGHT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 385 */     CHANNEL_OUT_FRONT_CENTER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 390 */     CHANNEL_OUT_LOW_FREQUENCY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 395 */     CHANNEL_OUT_BACK_LEFT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 400 */     CHANNEL_OUT_BACK_RIGHT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 405 */     CHANNEL_OUT_FRONT_LEFT_OF_CENTER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 410 */     CHANNEL_OUT_FRONT_RIGHT_OF_CENTER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 415 */     CHANNEL_OUT_BACK_CENTER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 420 */     CHANNEL_OUT_SIDE_LEFT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 425 */     CHANNEL_OUT_SIDE_RIGHT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 430 */     CHANNEL_OUT_TOP_CENTER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 435 */     CHANNEL_OUT_TOP_FRONT_LEFT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 440 */     CHANNEL_OUT_TOP_FRONT_CENTER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 445 */     CHANNEL_OUT_TOP_FRONT_RIGHT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 450 */     CHANNEL_OUT_TOP_BACK_LEFT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 455 */     CHANNEL_OUT_TOP_BACK_CENTER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 460 */     CHANNEL_OUT_TOP_BACK_RIGHT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 465 */     CHANNEL_OUT_MONO,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 471 */     CHANNEL_OUT_STEREO,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 478 */     CHANNEL_OUT_QUAD,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 485 */     CHANNEL_OUT_QUAD_SIDE,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 492 */     CHANNEL_OUT_SURROUND,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 499 */     CHANNEL_OUT_5POINT1,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 506 */     CHANNEL_OUT_5POINT1_SIDE,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 514 */     CHANNEL_OUT_7POINT1,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 519 */     CHANNEL_IN_MONO,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 524 */     CHANNEL_IN_STEREO;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getValue() {
/* 533 */       throw new RuntimeException("Stub!");
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
/* 549 */     CONTENT_TYPE_UNKNOWN,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 554 */     CONTENT_TYPE_SPEECH,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 559 */     CONTENT_TYPE_MUSIC,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 565 */     CONTENT_TYPE_MOVIE,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 573 */     CONTENT_TYPE_SONIFICATION;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getValue() {
/* 582 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static ContentType getEnum(int value) {
/* 591 */       throw new RuntimeException("Stub!");
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
/* 607 */     ENCODING_INVALID,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 612 */     ENCODING_DEFAULT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 617 */     ENCODING_PCM_16BIT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 622 */     ENCODING_PCM_8BIT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 627 */     ENCODING_PCM_FLOAT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 632 */     ENCODING_MP3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getValue() {
/* 641 */       throw new RuntimeException("Stub!");
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
/* 657 */     STREAM_TYPE_VOICE_CALL,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 662 */     STREAM_TYPE_SYSTEM,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 667 */     STREAM_TYPE_RING,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 672 */     STREAM_TYPE_MUSIC,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 677 */     STREAM_TYPE_ALARM,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 682 */     STREAM_TYPE_NOTIFICATION,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 687 */     STREAM_TYPE_DTMF,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 692 */     STREAM_TYPE_ACCESSIBILITY;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getValue() {
/* 701 */       throw new RuntimeException("Stub!");
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
/* 717 */     STREAM_USAGE_UNKNOWN,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 723 */     STREAM_USAGE_MEDIA,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 729 */     STREAM_USAGE_VOICE_COMMUNICATION,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 735 */     STREAM_USAGE_VOICE_COMMUNICATION_SIGNALLING,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 740 */     STREAM_USAGE_ALARM,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 746 */     STREAM_USAGE_NOTIFICATION,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 751 */     STREAM_USAGE_NOTIFICATION_RINGTONE,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 757 */     STREAM_USAGE_NOTIFICATION_COMMUNICATION_REQUEST,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 763 */     STREAM_USAGE_NOTIFICATION_COMMUNICATION_INSTANT,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 769 */     STREAM_USAGE_NOTIFICATION_COMMUNICATION_DELAYED,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 775 */     STREAM_USAGE_NOTIFICATION_EVENT,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 781 */     STREAM_USAGE_ASSISTANCE_ACCESSIBILITY,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 786 */     STREAM_USAGE_ASSISTANCE_NAVIGATION_GUIDANCE,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 792 */     STREAM_USAGE_ASSISTANCE_SONIFICATION,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 797 */     STREAM_USAGE_GAME,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 803 */     STREAM_USAGE_VIRTUAL_SOURCE,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 809 */     STREAM_USAGE_ASSISTANT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 814 */     STREAM_USAGE_TTS;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getValue() {
/* 823 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static StreamUsage getEnum(int value) {
/* 832 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.2.0.3/api/ohos.jar!/ohos/media/audio/AudioStreamInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */