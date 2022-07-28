package ohos.event.notification;

import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.2.0.3.jar:ohos/event/notification/ReminderRequest.class */
public abstract class ReminderRequest implements Sequenceable, Comparable<ReminderRequest> {
    public static final int ACTION_BUTTON_TYPE_CLOSE = 0;
    public static final int ACTION_BUTTON_TYPE_SNOOZE = 1;

    ReminderRequest() {
        throw new RuntimeException("Stub!");
    }

    public long getRingDuration() {
        throw new RuntimeException("Stub!");
    }

    public ReminderRequest setRingDuration(long ringDurationInSeconds) {
        throw new RuntimeException("Stub!");
    }

    public int getSnoozeTimes() {
        throw new RuntimeException("Stub!");
    }

    public ReminderRequest setSnoozeTimes(int snoozeTimes) {
        throw new RuntimeException("Stub!");
    }

    public long getTimeInterval() {
        throw new RuntimeException("Stub!");
    }

    public ReminderRequest setTimeInterval(long timeIntervalInSeconds) {
        throw new RuntimeException("Stub!");
    }

    public String getTitle() {
        throw new RuntimeException("Stub!");
    }

    public ReminderRequest setTitle(String title) {
        throw new RuntimeException("Stub!");
    }

    public String getContent() {
        throw new RuntimeException("Stub!");
    }

    public ReminderRequest setContent(String content) {
        throw new RuntimeException("Stub!");
    }

    public String getExpiredContent() {
        throw new RuntimeException("Stub!");
    }

    public ReminderRequest setExpiredContent(String expiredContent) {
        throw new RuntimeException("Stub!");
    }

    public String getSnoozeContent() {
        throw new RuntimeException("Stub!");
    }

    public ReminderRequest setSnoozeContent(String snoozeContent) {
        throw new RuntimeException("Stub!");
    }

    public int getNotificationId() {
        throw new RuntimeException("Stub!");
    }

    public ReminderRequest setNotificationId(int notificationId) {
        throw new RuntimeException("Stub!");
    }

    public String getSlotId() {
        throw new RuntimeException("Stub!");
    }

    public ReminderRequest setSlotId(String slotId) {
        throw new RuntimeException("Stub!");
    }

    public ReminderRequest setActionButton(String title, int type) {
        throw new RuntimeException("Stub!");
    }

    public ReminderRequest setMaxScreenIntentAgent(String pkgName, String abilityName) {
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

    public int compareTo(ReminderRequest other) {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object obj) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }

    public ReminderRequest setIntentAgent(String pkgName, String abilityName) {
        throw new RuntimeException("Stub!");
    }
}
