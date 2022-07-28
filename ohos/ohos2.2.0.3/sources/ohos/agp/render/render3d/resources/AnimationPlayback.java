package ohos.agp.render.render3d.resources;

/* loaded from: ohos2.2.0.3.jar:ohos/agp/render/render3d/resources/AnimationPlayback.class */
public interface AnimationPlayback {
    public static final int REPEAT_COUNT_INFINITE = Integer.MAX_VALUE;

    /* loaded from: ohos2.2.0.3.jar:ohos/agp/render/render3d/resources/AnimationPlayback$State.class */
    public enum State {
        STOP,
        PLAY,
        PAUSE
    }

    void release();

    void setPlaybackState(State state);

    State getPlaybackState();

    void setRepeatCount(int i);

    int getRepeatCount();

    void setWeight(float f);

    float getWeight();

    boolean isCompleted();

    void setSpeed(float f);

    float getSpeed();
}
