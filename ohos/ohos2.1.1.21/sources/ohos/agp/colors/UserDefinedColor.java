package ohos.agp.colors;

/* loaded from: ohos2.1.1.21.jar:ohos/agp/colors/UserDefinedColor.class */
public abstract class UserDefinedColor extends Color {
    public abstract RgbColor toRgb();

    public abstract void fromRgb(RgbColor rgbColor);

    public UserDefinedColor() {
        super((ColorSpec) null);
        throw new RuntimeException("Stub!");
    }

    public UserDefinedColor(UserDefinedColor color) {
        super((ColorSpec) null);
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.colors.Color
    public boolean equals(Object color) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.agp.colors.Color
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public UserDefinedColor assign(UserDefinedColor color) {
        throw new RuntimeException("Stub!");
    }
}
