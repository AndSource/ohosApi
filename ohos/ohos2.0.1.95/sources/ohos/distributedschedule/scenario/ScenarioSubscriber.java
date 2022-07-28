package ohos.distributedschedule.scenario;

/* loaded from: ohos2.0.1.95.jar:ohos/distributedschedule/scenario/ScenarioSubscriber.class */
public abstract class ScenarioSubscriber {
    public abstract void onScenarioNotify(ScenarioResult scenarioResult);

    public ScenarioSubscriber() {
        throw new RuntimeException("Stub!");
    }

    public ScenarioSubscriber(SubscribeInfo subscribeInfo) {
        throw new RuntimeException("Stub!");
    }

    public final void setSubscribeInfo(SubscribeInfo subscribeInfo) {
        throw new RuntimeException("Stub!");
    }

    public final SubscribeInfo getSubscribeInfo() {
        throw new RuntimeException("Stub!");
    }
}
