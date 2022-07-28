package ohos.miscservices.inputmethod;

import ohos.utils.Parcel;
import ohos.utils.Sequenceable;
import ohos.utils.net.Uri;

/* loaded from: ohos3.0.0.1.jar:ohos/miscservices/inputmethod/RichContent.class */
public class RichContent implements Sequenceable {
    public static final Sequenceable.Producer<RichContent> PRODUCER = null;

    public RichContent(Uri contentUri, Uri linkUri, String[] mimeTypes, String contentDescription) {
        throw new RuntimeException("Stub!");
    }

    public Uri getDataUri() {
        throw new RuntimeException("Stub!");
    }

    public Uri getLinkUri() {
        throw new RuntimeException("Stub!");
    }

    public String[] getMimeTypes() {
        throw new RuntimeException("Stub!");
    }

    public String getDataDetail() {
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
}
