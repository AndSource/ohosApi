package ohos.media.audio;

import java.util.List;
import ohos.media.audio.AudioStreamInfo;

/* loaded from: ohos2.2.0.3.jar:ohos/media/audio/AudioDeviceDescriptor.class */
public class AudioDeviceDescriptor {
    public AudioDeviceDescriptor(int id, String name, String address, DeviceType type, DeviceRole role, int[] samplingRates, int[] channelMasks, int[] channelIndexMasks, List<AudioStreamInfo.EncodingFormat> encodings) {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object object) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public boolean isOutputDevice() {
        throw new RuntimeException("Stub!");
    }

    public boolean isInputDevice() {
        throw new RuntimeException("Stub!");
    }

    public int getId() {
        throw new RuntimeException("Stub!");
    }

    public void setId(int id) {
        throw new RuntimeException("Stub!");
    }

    public String getName() {
        throw new RuntimeException("Stub!");
    }

    public void setName(String name) {
        throw new RuntimeException("Stub!");
    }

    public String getAddress() {
        throw new RuntimeException("Stub!");
    }

    public void setAddress(String address) {
        throw new RuntimeException("Stub!");
    }

    public DeviceType getType() {
        throw new RuntimeException("Stub!");
    }

    public void setType(DeviceType type) {
        throw new RuntimeException("Stub!");
    }

    public DeviceRole getRole() {
        throw new RuntimeException("Stub!");
    }

    public void setRole(DeviceRole role) {
        throw new RuntimeException("Stub!");
    }

    public int[] getSamplingRates() {
        throw new RuntimeException("Stub!");
    }

    public void setSamplingRates(int[] samplingRates) {
        throw new RuntimeException("Stub!");
    }

    public int[] getChannelMasks() {
        throw new RuntimeException("Stub!");
    }

    public void setChannelMasks(int[] channelMasks) {
        throw new RuntimeException("Stub!");
    }

    public int[] getChannelIndexMasks() {
        throw new RuntimeException("Stub!");
    }

    public void setChannelIndexMasks(int[] channelIndexMasks) {
        throw new RuntimeException("Stub!");
    }

    public List<AudioStreamInfo.EncodingFormat> getEncodings() {
        throw new RuntimeException("Stub!");
    }

    public void setEncodings(List<AudioStreamInfo.EncodingFormat> encodings) {
        throw new RuntimeException("Stub!");
    }

    public int[] getChannelCounts() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/media/audio/AudioDeviceDescriptor$DeviceFlag.class */
    public enum DeviceFlag {
        OUTPUT_DEVICES_FLAG,
        INPUT_DEVICES_FLAG,
        ALL_DEVICES_FLAG;

        public static DeviceFlag valueOf(int value) {
            throw new RuntimeException("Stub!");
        }

        public int getValue() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/media/audio/AudioDeviceDescriptor$DeviceRole.class */
    public enum DeviceRole {
        INPUT_DEVICE,
        OUTPUT_DEVICE;

        public static DeviceRole valueOf(int value) {
            throw new RuntimeException("Stub!");
        }

        public int getValue() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/media/audio/AudioDeviceDescriptor$DeviceType.class */
    public enum DeviceType {
        INVALID,
        EARPIECE,
        SPEAKER,
        WIRED_HEADSET,
        WIRED_HEADPHONES,
        ANALOG,
        DIGITAL,
        BLUETOOTH_SCO,
        BLUETOOTH_A2DP,
        HDMI,
        HDMI_ARC,
        USB_DEVICE,
        USB_ACCESSORY,
        DOCK,
        FM,
        MIC,
        FM_TUNER,
        TV_TUNER,
        TELEPHONY,
        AUXILIARY,
        IP,
        BUS,
        USB_HEADSET,
        HEARING_AID;

        public static DeviceType valueOf(int value) {
            throw new RuntimeException("Stub!");
        }

        public int getValue() {
            throw new RuntimeException("Stub!");
        }
    }
}
