package ohos.media.image;

import java.io.IOException;
import ohos.media.image.common.Filter;

/* loaded from: ohos3.0.0.1.jar:ohos/media/image/PropertyFilter.class */
public class PropertyFilter extends Filter {
    public PropertyFilter() {
        throw new RuntimeException("Stub!");
    }

    public PropertyFilter setPropertyInt(String key, int value) {
        throw new RuntimeException("Stub!");
    }

    public PropertyFilter setPropertyDouble(String key, double value) {
        throw new RuntimeException("Stub!");
    }

    public PropertyFilter setPropertyString(String key, String value) {
        throw new RuntimeException("Stub!");
    }

    public PropertyFilter rollbackProperty(String key) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.media.image.common.Filter
    public PropertyFilter restore() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.media.image.common.Filter
    public long applyToSource(ImageSource source) throws IOException {
        throw new RuntimeException("Stub!");
    }
}
