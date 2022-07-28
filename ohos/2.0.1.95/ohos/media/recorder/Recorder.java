/*     */ package ohos.media.recorder;
/*     */ 
/*     */ import ohos.agp.graphics.Surface;
/*     */ import ohos.media.common.AudioProperty;
/*     */ import ohos.media.common.Source;
/*     */ import ohos.media.common.StorageProperty;
/*     */ import ohos.media.common.VideoProperty;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Recorder
/*     */ {
/*     */   public Recorder() {
/*  43 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setSource(Source source) {
/*  53 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setAudioProperty(AudioProperty property) {
/*  64 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setVideoProperty(VideoProperty property) {
/*  75 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean setStorageProperty(StorageProperty property) {
/*  87 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean prepare() {
/*  96 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean start() {
/* 105 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean stop() {
/* 114 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean pause() {
/* 123 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean resume() {
/* 132 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean reset() {
/* 141 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setRecorderLocation(float latitude, float longitude) {
/* 152 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setOutputFormat(int outputFormat) {
/* 162 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Surface getVideoSurface() {
/* 171 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setRecorderProfile(RecorderProfile profile) {
/* 181 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void registerRecorderListener(IRecorderListener listener) {
/* 190 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean release() {
/* 199 */     throw new RuntimeException("Stub!");
/*     */   } protected void finalize() throws Throwable {
/* 201 */     throw new RuntimeException("Stub!");
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
/*     */   public int obtainMaxAmplitude() {
/* 213 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static final class AudioEncoder
/*     */   {
/*     */     public static final int AAC = 3;
/*     */     public static final int AAC_ELD = 5;
/*     */     public static final int AMR_NB = 1;
/*     */     public static final int AMR_WB = 2;
/*     */     public static final int DEFAULT = 0;
/*     */     public static final int HE_AAC = 4;
/*     */     public static final int OPUS = 7;
/*     */     
/*     */     AudioEncoder() {
/* 227 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class AudioSource
/*     */   {
/*     */     public static final int CAMCORDER = 5;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int DEFAULT = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int MIC = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int REMOTE_SUBMIX = 8;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int UNPROCESSED = 9;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int VOICE_CALL = 4;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int VOICE_COMMUNICATION = 7;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int VOICE_DOWNLINK = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int VOICE_PERFORMANCE = 10;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int VOICE_RECOGNITION = 6;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int VOICE_UPLINK = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     AudioSource() {
/* 295 */       throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static interface IRecorderListener
/*     */   {
/*     */     void onError(int param1Int1, int param1Int2);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     void onMessage(int param1Int1, int param1Int2);
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
/*     */   public static final class OrientationHint
/*     */   {
/*     */     public static final int FIRST_PLAYBACK_DERGREE = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int FOURTH_PLAYBACK_DERGREE = 270;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int SECOND_PLAYBACK_DERGREE = 90;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int THIRD_PLAYBACK_DERGREE = 180;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     OrientationHint() {
/* 430 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class OutputFormat
/*     */   {
/*     */     public static final int AAC_ADTS = 6;
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int AMR_NB = 3;
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int AMR_WB = 4;
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int DEFAULT = 0;
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int MPEG_2_TS = 8;
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int MPEG_4 = 2;
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int OGG = 11;
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int THREE_GPP = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     OutputFormat() {
/* 474 */       throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class RecorderOnErrorType
/*     */   {
/*     */     public static final int MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK = 200;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int MEDIA_ERROR_SERVER_DIED = 100;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int MEDIA_RECORDER_ERROR_UNKNOWN = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     RecorderOnErrorType() {
/* 550 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static final class RecorderOnInfoType
/*     */   {
/*     */     public static final int MEDIA_RECORDER_INFO_MAX_DURATION_REACHED = 800;
/*     */     
/*     */     public static final int MEDIA_RECORDER_INFO_MAX_FILESIZE_APPROACHING = 802;
/*     */     
/*     */     public static final int MEDIA_RECORDER_INFO_MAX_FILESIZE_REACHED = 801;
/*     */     
/*     */     public static final int MEDIA_RECORDER_INFO_NEXT_OUTPUT_FILE_STARTED = 803;
/*     */     
/*     */     public static final int MEDIA_RECORDER_INFO_UNKNOWN = 1;
/*     */     
/*     */     public static final int MEDIA_RECORDER_TRACK_INFO_COMPLETION_STATUS = 1000;
/*     */     
/*     */     public static final int MEDIA_RECORDER_TRACK_INFO_DATA_KBYTES = 1009;
/*     */     
/*     */     public static final int MEDIA_RECORDER_TRACK_INFO_DURATION_MS = 1003;
/*     */     
/*     */     public static final int MEDIA_RECORDER_TRACK_INFO_ENCODED_FRAMES = 1005;
/*     */     
/*     */     public static final int MEDIA_RECORDER_TRACK_INFO_INITIAL_DELAY_MS = 1007;
/*     */     
/*     */     public static final int MEDIA_RECORDER_TRACK_INFO_LIST_END = 2000;
/*     */     public static final int MEDIA_RECORDER_TRACK_INFO_LIST_START = 1000;
/*     */     public static final int MEDIA_RECORDER_TRACK_INFO_MAX_CHUNK_DUR_MS = 1004;
/*     */     public static final int MEDIA_RECORDER_TRACK_INFO_PROGRESS_IN_TIME = 1001;
/*     */     public static final int MEDIA_RECORDER_TRACK_INFO_START_OFFSET_MS = 1008;
/*     */     public static final int MEDIA_RECORDER_TRACK_INFO_TYPE = 1002;
/*     */     public static final int MEDIA_RECORDER_TRACK_INTER_CHUNK_TIME_MS = 1006;
/*     */     
/*     */     RecorderOnInfoType() {
/* 586 */       throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class VideoEncoder
/*     */   {
/*     */     public static final int DEFAULT = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int H264 = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int HEVC = 5;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     VideoEncoder() {
/* 738 */       throw new RuntimeException("Stub!");
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
/*     */   public static final class VideoSource
/*     */   {
/*     */     public static final int CAMERA = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int DEFAULT = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int SURFACE = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     VideoSource() {
/* 774 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.0.1.95/api/ohos.jar!/ohos/media/recorder/Recorder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */