package ohos.eventhandler;

/* loaded from: ohos2.2.0.3.jar:ohos/eventhandler/EventHandler.class */
public class EventHandler {

    /* loaded from: ohos2.2.0.3.jar:ohos/eventhandler/EventHandler$Priority.class */
    public enum Priority {
        IMMEDIATE,
        HIGH,
        LOW,
        IDLE
    }

    public EventHandler(EventRunner runner) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public static EventHandler current() {
        throw new RuntimeException("Stub!");
    }

    public void sendEvent(InnerEvent event, long delayTime, Priority priority) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public void sendEvent(InnerEvent event) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public void sendEvent(InnerEvent event, long delayTime) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public void sendEvent(InnerEvent event, Priority priority) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public void sendEvent(int eventId) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public void sendEvent(int eventId, long delayTime) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public void sendEvent(int eventId, Priority priority) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public void sendEvent(int eventId, long delayTime, Priority priority) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public void postTask(Runnable task, long delayTime, Priority priority) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public void postTask(Runnable task) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public void postTask(Runnable task, long delayTime) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public void postTask(Runnable task, Priority priority) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public void sendSyncEvent(InnerEvent event, Priority priority) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public void sendSyncEvent(InnerEvent event) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public void sendSyncEvent(int eventId, Priority priority) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public void sendSyncEvent(int eventId) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public void postSyncTask(Runnable task, Priority priority) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public void postSyncTask(Runnable task) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public void postTask(Runnable task, Object object) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public void sendTimingEvent(InnerEvent event, long taskTime, Priority priority) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public void sendTimingEvent(InnerEvent event, long taskTime) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public void sendTimingEvent(int eventId, long taskTime) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public void sendTimingEvent(int eventId, long taskTime, Priority priority) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public void postTimingTask(Runnable task, long taskTime, Priority priority) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public void postTimingTask(Runnable task, Object obj, long taskTime) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public void postTimingTask(Runnable task, long taskTime) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public void removeAllEvent() {
        throw new RuntimeException("Stub!");
    }

    public void removeEvent(int eventId) {
        throw new RuntimeException("Stub!");
    }

    public void removeEvent(int eventId, long param) {
        throw new RuntimeException("Stub!");
    }

    public void removeEvent(int eventId, Object object) {
        throw new RuntimeException("Stub!");
    }

    public void removeEvent(int eventId, long param, Object object) {
        throw new RuntimeException("Stub!");
    }

    public void removeTask(Runnable task) {
        throw new RuntimeException("Stub!");
    }

    public void removeTask(Runnable task, Object object) {
        throw new RuntimeException("Stub!");
    }

    public final EventRunner getEventRunner() {
        throw new RuntimeException("Stub!");
    }

    public final boolean isIdle() {
        throw new RuntimeException("Stub!");
    }

    public final boolean hasInnerEvent(Runnable runnable) {
        throw new RuntimeException("Stub!");
    }

    public final boolean hasInnerEvent(long param) {
        throw new RuntimeException("Stub!");
    }

    public final boolean hasInnerEvent(Object object) {
        throw new RuntimeException("Stub!");
    }

    public final boolean hasInnerEvent(int eventId) {
        throw new RuntimeException("Stub!");
    }

    public final boolean hasInnerEvent(int eventId, Object object) {
        throw new RuntimeException("Stub!");
    }

    public final void dump(Dumper dumper) {
        throw new RuntimeException("Stub!");
    }

    public String getEventName(InnerEvent event) {
        throw new RuntimeException("Stub!");
    }

    public void distributeEvent(InnerEvent event) {
        throw new RuntimeException("Stub!");
    }

    protected void processEvent(InnerEvent event) {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
