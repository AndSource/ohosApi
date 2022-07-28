package ohos.event.notification;

import ohos.utils.Parcel;
import ohos.utils.Sequenceable;
import ohos.utils.net.Uri;

/* loaded from: ohos2.2.0.3.jar:ohos/event/notification/NotificationSlot.class */
public final class NotificationSlot implements Sequenceable {
    public static final int LEVEL_DEFAULT = 3;
    public static final int LEVEL_HIGH = 4;
    public static final int LEVEL_LOW = 2;
    public static final int LEVEL_MIN = 1;
    public static final int LEVEL_NONE = 0;
    public static final int LEVEL_UNDEFINED = -1000;
    public static final Sequenceable.Producer<NotificationSlot> PRODUCER = null;

    public NotificationSlot(String id, String name, int level) {
        throw new RuntimeException("Stub!");
    }

    public void setLevel(int level) {
        throw new RuntimeException("Stub!");
    }

    public void setName(String name) {
        throw new RuntimeException("Stub!");
    }

    public void setDescription(String description) {
        throw new RuntimeException("Stub!");
    }

    public void enableBadge(boolean isShowBadge) {
        throw new RuntimeException("Stub!");
    }

    public void enableBypassDnd(boolean bypassDnd) {
        throw new RuntimeException("Stub!");
    }

    public void setEnableVibration(boolean vibration) {
        throw new RuntimeException("Stub!");
    }

    public void setLockscreenVisibleness(int visibleness) {
        throw new RuntimeException("Stub!");
    }

    public void setSound(Uri sound) {
        throw new RuntimeException("Stub!");
    }

    public void setEnableLight(boolean isLightEnabled) {
        throw new RuntimeException("Stub!");
    }

    public void setLedLightColor(int color) {
        throw new RuntimeException("Stub!");
    }

    public void setSlotGroup(String groupId) {
        throw new RuntimeException("Stub!");
    }

    public String getId() {
        throw new RuntimeException("Stub!");
    }

    public String getName() {
        throw new RuntimeException("Stub!");
    }

    public String getDescription() {
        throw new RuntimeException("Stub!");
    }

    public int getLevel() {
        throw new RuntimeException("Stub!");
    }

    public boolean isShowBadge() {
        throw new RuntimeException("Stub!");
    }

    public boolean isEnableBypassDnd() {
        throw new RuntimeException("Stub!");
    }

    public boolean canVibrate() {
        throw new RuntimeException("Stub!");
    }

    public int getLockscreenVisibleness() {
        throw new RuntimeException("Stub!");
    }

    public Uri getSound() {
        throw new RuntimeException("Stub!");
    }

    public boolean canEnableLight() {
        throw new RuntimeException("Stub!");
    }

    public int getLedLightColor() {
        throw new RuntimeException("Stub!");
    }

    public String getSlotGroup() {
        throw new RuntimeException("Stub!");
    }

    public void setVibrationStyle(long[] vibrationValues) {
        throw new RuntimeException("Stub!");
    }

    public long[] getVibrationStyle() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean marshalling(Parcel out) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean unmarshalling(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
