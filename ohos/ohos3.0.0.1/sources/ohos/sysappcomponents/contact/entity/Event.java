package ohos.sysappcomponents.contact.entity;

import ohos.app.Context;

/* loaded from: ohos3.0.0.1.jar:ohos/sysappcomponents/contact/entity/Event.class */
public class Event {
    public static final int CUSTOM_LABEL = 0;
    public static final int EVENT_ANNIVERSARY = 0;
    public static final int EVENT_BIRTHDAY = 0;
    public static final int EVENT_OTHER = 0;
    public static final int INVALID_LABEL_ID = -1;

    public Event(Context context, String eventDate, int labelId) {
        throw new RuntimeException("Stub!");
    }

    public Event(String eventDate, String customLabelName) {
        throw new RuntimeException("Stub!");
    }

    public String getEventDate() {
        throw new RuntimeException("Stub!");
    }

    public void setEventDate(String eventDate) {
        throw new RuntimeException("Stub!");
    }

    public void setCustomLabelName(String labelName) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public void setLabelId(Context context, int labelId) {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object object) {
        throw new RuntimeException("Stub!");
    }

    public String getLabelName() {
        throw new RuntimeException("Stub!");
    }
}
