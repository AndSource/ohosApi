package ohos.media.image.common;

import java.io.IOException;
import ohos.media.image.ImageSource;

/* loaded from: ohos2.0.1.95.jar:ohos/media/image/common/Filter.class */
public abstract class Filter {
    public abstract Filter restore();

    public abstract long applyToSource(ImageSource imageSource) throws IOException;

    public Filter() {
        throw new RuntimeException("Stub!");
    }
}
