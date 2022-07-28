package ohos.vibrator.agent;

import java.util.List;
import ohos.vibrator.bean.VibrationPattern;

/* loaded from: ohos2.2.0.3.jar:ohos/vibrator/agent/VibratorAgent.class */
public class VibratorAgent {
    public static final String VIBRATOR_STOP_MODE_CUSTOMIZED = "customized";
    public static final String VIBRATOR_STOP_MODE_PRESET = "preset";
    public static final String VIBRATOR_STOP_MODE_TIME = "time";

    public VibratorAgent() {
        throw new RuntimeException("Stub!");
    }

    public List<Integer> getVibratorIdList() {
        throw new RuntimeException("Stub!");
    }

    public boolean isSupport(int vibratorId) {
        throw new RuntimeException("Stub!");
    }

    public boolean isEffectSupport(int vibratorId, String effectId) {
        throw new RuntimeException("Stub!");
    }

    public boolean startOnce(int vibratorId, int duration) {
        throw new RuntimeException("Stub!");
    }

    public boolean startOnce(int vibratorId, String effectId) {
        throw new RuntimeException("Stub!");
    }

    public boolean start(int vibratorId, VibrationPattern vibrationEffect) {
        throw new RuntimeException("Stub!");
    }

    public boolean startOnce(int duration) {
        throw new RuntimeException("Stub!");
    }

    public boolean startOnce(String effectId) {
        throw new RuntimeException("Stub!");
    }

    public boolean start(String effectId, boolean isLooping) {
        throw new RuntimeException("Stub!");
    }

    public boolean start(VibrationPattern vibrationEffect) {
        throw new RuntimeException("Stub!");
    }

    public boolean stop(int vibratorId, String stopMode) {
        throw new RuntimeException("Stub!");
    }

    public boolean stop() {
        throw new RuntimeException("Stub!");
    }
}
