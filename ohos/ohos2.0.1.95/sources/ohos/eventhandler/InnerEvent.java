package ohos.eventhandler;

import ohos.eventhandler.EventHandler;
import ohos.utils.PacMap;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.0.1.95.jar:ohos/eventhandler/InnerEvent.class */
public final class InnerEvent implements Sequenceable {
    public static final Sequenceable.Producer<InnerEvent> PRODUCER = null;
    public Object object;
    public Courier replyTo;
    public int eventId = 0;
    public long param = 0;
    public int sendingUid = -1;

    InnerEvent() {
        throw new RuntimeException("Stub!");
    }

    public boolean isPriorityEqual(EventHandler.Priority priority) {
        throw new RuntimeException("Stub!");
    }

    public static InnerEvent get() {
        throw new RuntimeException("Stub!");
    }

    public static InnerEvent copyFrom(InnerEvent oldInnerEvent) throws CloneNotSupportedException {
        throw new RuntimeException("Stub!");
    }

    public static InnerEvent get(int eventId, long param, Object object) {
        throw new RuntimeException("Stub!");
    }

    public static InnerEvent get(int eventId) {
        throw new RuntimeException("Stub!");
    }

    public static InnerEvent get(int eventId, long param) {
        throw new RuntimeException("Stub!");
    }

    public static InnerEvent get(int eventId, Object object) {
        throw new RuntimeException("Stub!");
    }

    public static InnerEvent get(Runnable task) {
        throw new RuntimeException("Stub!");
    }

    public void drop() {
        throw new RuntimeException("Stub!");
    }

    public long getHandleTime() {
        throw new RuntimeException("Stub!");
    }

    public static InnerEvent get(InnerEvent oldInnerEvent) throws CloneNotSupportedException {
        throw new RuntimeException("Stub!");
    }

    public PacMap getPacMap() {
        throw new RuntimeException("Stub!");
    }

    public void setPacMap(PacMap pacMap) {
        throw new RuntimeException("Stub!");
    }

    public PacMap peekPacMap() {
        throw new RuntimeException("Stub!");
    }

    public Runnable getTask() {
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
