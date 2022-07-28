package ohos.media.recorder;

import ohos.agp.graphics.Surface;
import ohos.media.common.AudioProperty;
import ohos.media.common.Source;
import ohos.media.common.StorageProperty;
import ohos.media.common.VideoProperty;

/* loaded from: ohos2.1.1.21.jar:ohos/media/recorder/Recorder.class */
public class Recorder {

    /* loaded from: ohos2.1.1.21.jar:ohos/media/recorder/Recorder$IRecorderListener.class */
    public interface IRecorderListener {
        void onError(int i, int i2);

        void onMessage(int i, int i2);
    }

    public Recorder() {
        throw new RuntimeException("Stub!");
    }

    public boolean setSource(Source source) {
        throw new RuntimeException("Stub!");
    }

    public boolean setAudioProperty(AudioProperty property) {
        throw new RuntimeException("Stub!");
    }

    public boolean setVideoProperty(VideoProperty property) {
        throw new RuntimeException("Stub!");
    }

    public boolean setStorageProperty(StorageProperty property) {
        throw new RuntimeException("Stub!");
    }

    public boolean prepare() {
        throw new RuntimeException("Stub!");
    }

    public boolean start() {
        throw new RuntimeException("Stub!");
    }

    public boolean stop() {
        throw new RuntimeException("Stub!");
    }

    public boolean pause() {
        throw new RuntimeException("Stub!");
    }

    public boolean resume() {
        throw new RuntimeException("Stub!");
    }

    public boolean reset() {
        throw new RuntimeException("Stub!");
    }

    public boolean setRecorderLocation(float latitude, float longitude) {
        throw new RuntimeException("Stub!");
    }

    public boolean setOutputFormat(int outputFormat) {
        throw new RuntimeException("Stub!");
    }

    public Surface getVideoSurface() {
        throw new RuntimeException("Stub!");
    }

    public boolean setRecorderProfile(RecorderProfile profile) {
        throw new RuntimeException("Stub!");
    }

    public void registerRecorderListener(IRecorderListener listener) {
        throw new RuntimeException("Stub!");
    }

    public boolean release() {
        throw new RuntimeException("Stub!");
    }

    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }

    public int obtainMaxAmplitude() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/media/recorder/Recorder$AudioEncoder.class */
    public static final class AudioEncoder {
        public static final int AAC = 3;
        public static final int AAC_ELD = 5;
        public static final int AMR_NB = 1;
        public static final int AMR_WB = 2;
        public static final int DEFAULT = 0;
        public static final int HE_AAC = 4;
        public static final int OPUS = 7;

        AudioEncoder() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/media/recorder/Recorder$AudioSource.class */
    public static final class AudioSource {
        public static final int CAMCORDER = 5;
        public static final int DEFAULT = 0;
        public static final int MIC = 1;
        public static final int REMOTE_SUBMIX = 8;
        public static final int UNPROCESSED = 9;
        public static final int VOICE_CALL = 4;
        public static final int VOICE_COMMUNICATION = 7;
        public static final int VOICE_DOWNLINK = 3;
        public static final int VOICE_PERFORMANCE = 10;
        public static final int VOICE_RECOGNITION = 6;
        public static final int VOICE_UPLINK = 2;

        AudioSource() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/media/recorder/Recorder$OrientationHint.class */
    public static final class OrientationHint {
        public static final int FIRST_PLAYBACK_DERGREE = 0;
        public static final int FOURTH_PLAYBACK_DERGREE = 270;
        public static final int SECOND_PLAYBACK_DERGREE = 90;
        public static final int THIRD_PLAYBACK_DERGREE = 180;

        OrientationHint() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/media/recorder/Recorder$OutputFormat.class */
    public static final class OutputFormat {
        public static final int AAC_ADTS = 6;
        public static final int AMR_NB = 3;
        public static final int AMR_WB = 4;
        public static final int DEFAULT = 0;
        public static final int MPEG_2_TS = 8;
        public static final int MPEG_4 = 2;
        public static final int OGG = 11;
        public static final int THREE_GPP = 1;

        OutputFormat() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/media/recorder/Recorder$RecorderOnErrorType.class */
    public static final class RecorderOnErrorType {
        public static final int MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK = 200;
        public static final int MEDIA_ERROR_SERVER_DIED = 100;
        public static final int MEDIA_RECORDER_ERROR_UNKNOWN = 1;

        RecorderOnErrorType() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/media/recorder/Recorder$RecorderOnInfoType.class */
    public static final class RecorderOnInfoType {
        public static final int MEDIA_RECORDER_INFO_MAX_DURATION_REACHED = 800;
        public static final int MEDIA_RECORDER_INFO_MAX_FILESIZE_APPROACHING = 802;
        public static final int MEDIA_RECORDER_INFO_MAX_FILESIZE_REACHED = 801;
        public static final int MEDIA_RECORDER_INFO_NEXT_OUTPUT_FILE_STARTED = 803;
        public static final int MEDIA_RECORDER_INFO_UNKNOWN = 1;
        public static final int MEDIA_RECORDER_TRACK_INFO_COMPLETION_STATUS = 1000;
        public static final int MEDIA_RECORDER_TRACK_INFO_DATA_KBYTES = 1009;
        public static final int MEDIA_RECORDER_TRACK_INFO_DURATION_MS = 1003;
        public static final int MEDIA_RECORDER_TRACK_INFO_ENCODED_FRAMES = 1005;
        public static final int MEDIA_RECORDER_TRACK_INFO_INITIAL_DELAY_MS = 1007;
        public static final int MEDIA_RECORDER_TRACK_INFO_LIST_END = 2000;
        public static final int MEDIA_RECORDER_TRACK_INFO_LIST_START = 1000;
        public static final int MEDIA_RECORDER_TRACK_INFO_MAX_CHUNK_DUR_MS = 1004;
        public static final int MEDIA_RECORDER_TRACK_INFO_PROGRESS_IN_TIME = 1001;
        public static final int MEDIA_RECORDER_TRACK_INFO_START_OFFSET_MS = 1008;
        public static final int MEDIA_RECORDER_TRACK_INFO_TYPE = 1002;
        public static final int MEDIA_RECORDER_TRACK_INTER_CHUNK_TIME_MS = 1006;

        RecorderOnInfoType() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/media/recorder/Recorder$VideoEncoder.class */
    public static final class VideoEncoder {
        public static final int DEFAULT = 0;
        public static final int H264 = 2;
        public static final int HEVC = 5;

        VideoEncoder() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/media/recorder/Recorder$VideoSource.class */
    public static final class VideoSource {
        public static final int CAMERA = 1;
        public static final int DEFAULT = 0;
        public static final int SURFACE = 2;

        VideoSource() {
            throw new RuntimeException("Stub!");
        }
    }
}
