package ohos.agp.components;

import ohos.agp.utils.Point;

/* loaded from: ohos3.0.0.1.jar:ohos/agp/components/ScaleInfo.class */
public class ScaleInfo {
    public final double horizontalScale = 0.0d;
    public final double rotation = 0.0d;
    public final double scale = 0.0d;
    public final Point startPoint = null;
    public final Point updatePoint = null;
    public final double verticalScale = 0.0d;
    public final double xVelocity = 0.0d;
    public final double xVelocitySecondary = 0.0d;
    public final double yVelocity = 0.0d;
    public final double yVelocitySecondary = 0.0d;

    public ScaleInfo(Point startPoint, Point updatePoint, double scale, double horizontalScale, double verticalScale, double rotation, double xVelocity, double yVelocity) {
        throw new RuntimeException("Stub!");
    }

    public ScaleInfo(Point primaryPoint, Point secondaryPoint, double scale, double horizontalScale, double verticalScale, double rotation, double xVelocity, double yVelocity, double xVelocity2, double yVelocity2) {
        throw new RuntimeException("Stub!");
    }
}
