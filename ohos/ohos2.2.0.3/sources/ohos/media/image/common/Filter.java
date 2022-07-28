package ohos.media.image.common;

import java.io.IOException;
import ohos.media.image.ImageSource;

/* loaded from: ohos2.2.0.3.jar:ohos/media/image/common/Filter.class */
public abstract class Filter {
    public abstract Filter restore();

    public abstract long applyToSource(ImageSource imageSource) throws IOException;

    public Filter() {
        throw new RuntimeException("Stub!");
    }
}
