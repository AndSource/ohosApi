package ohos.media.player;

import ohos.agp.graphics.Surface;
import ohos.agp.graphics.SurfaceOps;
import ohos.app.Context;
import ohos.global.resource.BaseFileDescriptor;
import ohos.media.common.Format;
import ohos.media.common.Source;
import ohos.utils.Parcel;

/* loaded from: ohos2.1.1.21.jar:ohos/media/player/Player.class */
public class Player {
    public static final int PLAYER_ERROR_IO = -1004;
    public static final int PLAYER_ERROR_MALFORMED = -1007;
    public static final int PLAYER_ERROR_SERVER_DIED = 100;
    public static final int PLAYER_ERROR_SYSTEM = Integer.MIN_VALUE;
    public static final int PLAYER_ERROR_TIMED_OUT = -110;
    public static final int PLAYER_ERROR_UNKNOWN = 1;
    public static final int PLAYER_ERROR_UNSUPPORTED = -1010;
    public static final int PLAYER_INFO_AUDIO_NOT_PLAYING = 804;
    public static final int PLAYER_INFO_BAD_INTERLEAVING = 800;
    public static final int PLAYER_INFO_BUFFERING_END = 702;
    public static final int PLAYER_INFO_BUFFERING_START = 701;
    public static final int PLAYER_INFO_EXTERNAL_METADATA_UPDATE = 803;
    public static final int PLAYER_INFO_METADATA_UPDATE = 802;
    public static final int PLAYER_INFO_NETWORK_BANDWIDTH = 703;
    public static final int PLAYER_INFO_NOT_SEEKABLE = 801;
    public static final int PLAYER_INFO_STARTED_AS_NEXT = 2;
    public static final int PLAYER_INFO_SUBTITLE_TIMED_OUT = 902;
    public static final int PLAYER_INFO_TIMED_TEXT_ERROR = 900;
    public static final int PLAYER_INFO_UNKNOWN = 1;
    public static final int PLAYER_INFO_UNSUPPORTED_SUBTITLE = 901;
    public static final int PLAYER_INFO_VIDEO_NOT_PLAYING = 805;
    public static final int PLAYER_INFO_VIDEO_RENDERING_START = 3;
    public static final int PLAYER_INFO_VIDEO_TRACK_LAGGING = 700;
    public static final int VIDEO_SCALE_TYPE_CROP = 2;
    public static final int VIDEO_SCALE_TYPE_FIT = 1;

    /* loaded from: ohos2.1.1.21.jar:ohos/media/player/Player$AudioHandler.class */
    public enum AudioHandler {
        DEFAULT,
        MUTE,
        ERROR
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/media/player/Player$IPlayerCallback.class */
    public interface IPlayerCallback {
        void onPrepared();

        void onMessage(int i, int i2);

        void onError(int i, int i2);

        void onResolutionChanged(int i, int i2);

        void onPlayBackComplete();

        void onRewindToComplete();

        void onBufferingChange(int i);

        void onNewTimedMetaData(MediaTimedMetaData mediaTimedMetaData);

        void onMediaTimeIncontinuity(MediaTimeInfo mediaTimeInfo);
    }

    public Player(Context context) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSource(Source source) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSource(BaseFileDescriptor assetFD) {
        throw new RuntimeException("Stub!");
    }

    public boolean prepare() {
        throw new RuntimeException("Stub!");
    }

    public boolean play() {
        throw new RuntimeException("Stub!");
    }

    public boolean isNowPlaying() {
        throw new RuntimeException("Stub!");
    }

    public boolean pause() {
        throw new RuntimeException("Stub!");
    }

    public boolean stop() {
        throw new RuntimeException("Stub!");
    }

    public boolean rewindTo(long microseconds) {
        throw new RuntimeException("Stub!");
    }

    public boolean setVolume(float volume) {
        throw new RuntimeException("Stub!");
    }

    public boolean setVideoSurface(Surface surface) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSurfaceOps(SurfaceOps surfaceHolder) {
        throw new RuntimeException("Stub!");
    }

    public boolean enableScreenOn(boolean screenOn) {
        throw new RuntimeException("Stub!");
    }

    public boolean setVideoScaleType(int type) {
        throw new RuntimeException("Stub!");
    }

    public boolean enableSingleLooping(boolean looping) {
        throw new RuntimeException("Stub!");
    }

    public boolean isSingleLooping() {
        throw new RuntimeException("Stub!");
    }

    public int getCurrentTime() {
        throw new RuntimeException("Stub!");
    }

    public int getDuration() {
        throw new RuntimeException("Stub!");
    }

    public int getVideoWidth() {
        throw new RuntimeException("Stub!");
    }

    public int getVideoHeight() {
        throw new RuntimeException("Stub!");
    }

    public boolean setPlaybackSpeed(float speed) {
        throw new RuntimeException("Stub!");
    }

    public float getPlaybackSpeed() {
        throw new RuntimeException("Stub!");
    }

    public AudioHandler getAudioHandler() {
        throw new RuntimeException("Stub!");
    }

    public boolean setAudioHandler(AudioHandler audioHandler) {
        throw new RuntimeException("Stub!");
    }

    public boolean setAudioParamsInitialized() {
        throw new RuntimeException("Stub!");
    }

    public boolean setAudioPitch(float audioPitch) {
        throw new RuntimeException("Stub!");
    }

    public float getAudioPitch() {
        throw new RuntimeException("Stub!");
    }

    public boolean setAudioStreamType(int type) {
        throw new RuntimeException("Stub!");
    }

    public int getAudioStreamType() {
        throw new RuntimeException("Stub!");
    }

    public boolean setNextPlayer(Player next) {
        throw new RuntimeException("Stub!");
    }

    public boolean reset() {
        throw new RuntimeException("Stub!");
    }

    public boolean release() {
        throw new RuntimeException("Stub!");
    }

    public void setPlayerCallback(IPlayerCallback callback) {
        throw new RuntimeException("Stub!");
    }

    public StreamInfo[] getStreamInfo() {
        throw new RuntimeException("Stub!");
    }

    public int getCurrentStream(int streamType) {
        throw new RuntimeException("Stub!");
    }

    public void specifyStream(int streamIndex) {
        throw new RuntimeException("Stub!");
    }

    public void unspecifyStream(int streamIndex) {
        throw new RuntimeException("Stub!");
    }

    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/media/player/Player$DeviceInfo.class */
    public static class DeviceInfo {
        public DeviceInfo(String deviceId) {
            throw new RuntimeException("Stub!");
        }

        public DeviceInfo(String deviceId, int trackId) {
            throw new RuntimeException("Stub!");
        }

        public String getDeviceId() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/media/player/Player$MediaTimeInfo.class */
    public static class MediaTimeInfo {
        public float clockRate;
        public long mediaTimeUs;
        public long nanoTime;

        public MediaTimeInfo() {
            throw new RuntimeException("Stub!");
        }

        public static MediaTimeInfo createFromParcel(Parcel parcel) {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/media/player/Player$MediaTimedMetaData.class */
    public static final class MediaTimedMetaData {
        public byte[] metaData;
        public long timestampUs;

        public MediaTimedMetaData() {
            throw new RuntimeException("Stub!");
        }

        public static MediaTimedMetaData createFromParcel(Parcel parcel) {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.1.1.21.jar:ohos/media/player/Player$StreamInfo.class */
    public static class StreamInfo {
        public static final int MEDIA_STREAM_TYPE_AUDIO = 2;
        public static final int MEDIA_STREAM_TYPE_METADATA = 5;
        public static final int MEDIA_STREAM_TYPE_SUBTITLE = 4;
        public static final int MEDIA_STREAM_TYPE_TIMEDTEXT = 3;
        public static final int MEDIA_STREAM_TYPE_UNKNOWN = 0;
        public static final int MEDIA_STREAM_TYPE_VIDEO = 1;

        StreamInfo(Parcel in) {
            throw new RuntimeException("Stub!");
        }

        public int getStreamType() {
            throw new RuntimeException("Stub!");
        }

        public Format getStreamFormat() {
            throw new RuntimeException("Stub!");
        }

        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
}
