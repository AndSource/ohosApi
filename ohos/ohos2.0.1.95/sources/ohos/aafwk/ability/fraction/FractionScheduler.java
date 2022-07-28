package ohos.aafwk.ability.fraction;

/* loaded from: ohos2.0.1.95.jar:ohos/aafwk/ability/fraction/FractionScheduler.class */
public abstract class FractionScheduler {
    public abstract FractionScheduler add(int i, Fraction fraction);

    public abstract FractionScheduler add(int i, Fraction fraction, String str);

    public abstract FractionScheduler replace(int i, Fraction fraction);

    public abstract FractionScheduler remove(Fraction fraction);

    public abstract FractionScheduler hide(Fraction fraction);

    public abstract FractionScheduler show(Fraction fraction);

    public abstract int submit();

    public abstract FractionScheduler pushIntoStack(String str);

    public FractionScheduler() {
        throw new RuntimeException("Stub!");
    }
}
