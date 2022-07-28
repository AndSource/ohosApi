package ohos.media.audio;

import java.util.List;
import ohos.app.Context;
import ohos.media.audio.AudioDeviceDescriptor;
import ohos.utils.net.Uri;

/* loaded from: ohos3.0.0.1.jar:ohos/media/audio/AudioManager.class */
public class AudioManager {
    public static final int DEFAULT_VOLUME = -1;
    public static final int DEVICE_ID_BLUETOOTH = 2;
    public static final int DEVICE_ID_SPEAKERPHONE = 1;
    public static final int DEVICE_ID_WIRED_HEADSET = 3;
    public static final int MARKER_WITH_SOUND = 1;
    public static final int MARKER_WITH_VOLUME_BAR = 2;
    public static final int RINGER_MODE_MAX = 0;
    public static final int VOLUME_OP_DEC = -1;
    public static final int VOLUME_OP_INC = 1;
    public static final int VOLUME_OP_MAINTAIN = 0;

    public AudioManager() {
        throw new RuntimeException("Stub!");
    }

    public AudioManager(String packageName) {
        throw new RuntimeException("Stub!");
    }

    public AudioManager(Context context) {
        throw new RuntimeException("Stub!");
    }

    public int getVersion() {
        throw new RuntimeException("Stub!");
    }

    public boolean setVolume(AudioVolumeType volumeType, int volume) {
        throw new RuntimeException("Stub!");
    }

    public boolean setVolume(AudioVolumeType volumeType, int volume, int markers) {
        throw new RuntimeException("Stub!");
    }

    public int getVolume(AudioVolumeType volumeType) throws AudioRemoteException {
        throw new RuntimeException("Stub!");
    }

    public int getMinVolume(AudioVolumeType volumeType) throws AudioRemoteException {
        throw new RuntimeException("Stub!");
    }

    public int getMaxVolume(AudioVolumeType volumeType) throws AudioRemoteException {
        throw new RuntimeException("Stub!");
    }

    public boolean mute(AudioVolumeType volumeType) {
        throw new RuntimeException("Stub!");
    }

    public boolean unmute(AudioVolumeType volumeType) {
        throw new RuntimeException("Stub!");
    }

    public boolean isMute(AudioVolumeType volumeType) throws AudioRemoteException {
        throw new RuntimeException("Stub!");
    }

    public boolean setRingerMode(AudioRingMode mode) {
        throw new RuntimeException("Stub!");
    }

    public int getRingerMode() throws AudioRemoteException {
        throw new RuntimeException("Stub!");
    }

    public boolean setDeviceActive(int deviceType, boolean state) {
        throw new RuntimeException("Stub!");
    }

    public boolean isDeviceActive(int deviceType) throws AudioRemoteException {
        throw new RuntimeException("Stub!");
    }

    public boolean activateAudioInterrupt(AudioInterrupt interrupt) {
        throw new RuntimeException("Stub!");
    }

    public boolean deactivateAudioInterrupt(AudioInterrupt interrupt) {
        throw new RuntimeException("Stub!");
    }

    public boolean setAudioParameter(String key, String value) {
        throw new RuntimeException("Stub!");
    }

    public String getAudioParameter(String key) {
        throw new RuntimeException("Stub!");
    }

    public void registerAudioCapturerCallback(AudioCapturerCallback cb) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public void registerAudioRendererCallback(AudioRendererCallback cb) {
        throw new RuntimeException("Stub!");
    }

    public void setAudioDeviceChangeObserver(AudioDeviceChangeObserver observer) {
        throw new RuntimeException("Stub!");
    }

    public void removeAudioDeviceChangeObserver(AudioDeviceChangeObserver observer) {
        throw new RuntimeException("Stub!");
    }

    public void unregisterAudioCapturerCallback(AudioCapturerCallback cb) {
        throw new RuntimeException("Stub!");
    }

    public void unregisterAudioRendererCallback(AudioRendererCallback cb) {
        throw new RuntimeException("Stub!");
    }

    public List<AudioCapturerConfig> getActiveCapturerConfigs() {
        throw new RuntimeException("Stub!");
    }

    public List<AudioRendererInfo> getActiveRendererConfigs() {
        throw new RuntimeException("Stub!");
    }

    public static AudioDeviceDescriptor[] getDevices(AudioDeviceDescriptor.DeviceFlag flag) {
        throw new RuntimeException("Stub!");
    }

    public boolean setMasterMute(boolean isMute) {
        throw new RuntimeException("Stub!");
    }

    public boolean setMicrophoneMute(boolean isMute) {
        throw new RuntimeException("Stub!");
    }

    public boolean isMicrophoneMute() {
        throw new RuntimeException("Stub!");
    }

    public static Uri getRingerUri(Context context, RingtoneType type) {
        throw new RuntimeException("Stub!");
    }

    public static void setRingerUri(Context context, RingtoneType type, Uri uri) {
        throw new RuntimeException("Stub!");
    }

    public CallState getCallState() throws AudioRemoteException {
        throw new RuntimeException("Stub!");
    }

    public void setCallState(CallState callState) {
        throw new RuntimeException("Stub!");
    }

    public boolean changeVolumeBy(AudioVolumeType volumeType, int index) {
        throw new RuntimeException("Stub!");
    }

    public static int getMasterOutputSampleRate() {
        throw new RuntimeException("Stub!");
    }

    public static int getMasterOutputFrameCount() {
        throw new RuntimeException("Stub!");
    }

    public static boolean isStreamActive(AudioVolumeType volumeType) {
        throw new RuntimeException("Stub!");
    }

    public boolean connectBluetoothSco() {
        throw new RuntimeException("Stub!");
    }

    public boolean disconnectBluetoothSco() {
        throw new RuntimeException("Stub!");
    }

    public static int makeSessionId() {
        throw new RuntimeException("Stub!");
    }

    public boolean isMasterMute() throws AudioRemoteException {
        throw new RuntimeException("Stub!");
    }

    public void attachAudioEffects() throws AudioRemoteException {
        throw new RuntimeException("Stub!");
    }

    public void detachAudioEffects() throws AudioRemoteException {
        throw new RuntimeException("Stub!");
    }

    public boolean isVolumeChangeForbidden(Context context) throws AudioRemoteException {
        throw new RuntimeException("Stub!");
    }

    public boolean isBluetoothScoUsableNotInCall(Context context) throws AudioRemoteException {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/media/audio/AudioManager$AudioRingMode.class */
    public enum AudioRingMode {
        RINGER_MODE_SILENT,
        RINGER_MODE_VIBRATE,
        RINGER_MODE_NORMAL;

        public int getValue() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/media/audio/AudioManager$AudioVolumeType.class */
    public enum AudioVolumeType {
        STREAM_VOICE_CALL,
        STREAM_SYSTEM,
        STREAM_RING,
        STREAM_MUSIC,
        STREAM_ALARM,
        STREAM_NOTIFICATION,
        STREAM_BLUETOOTH_SCO,
        STREAM_DTMF,
        STREAM_TTS,
        STREAM_ACCESSIBILITY;

        public int getValue() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/media/audio/AudioManager$CallState.class */
    public enum CallState {
        IDLE,
        RINGTONE,
        IN_CALL,
        IN_VOIP;

        public int getValue() {
            throw new RuntimeException("Stub!");
        }

        public static CallState getEnumByValue(int value) {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/media/audio/AudioManager$RingtoneType.class */
    public enum RingtoneType {
        RING,
        NOTIFICATION,
        ALARM;

        public int getValue() {
            throw new RuntimeException("Stub!");
        }
    }
}
