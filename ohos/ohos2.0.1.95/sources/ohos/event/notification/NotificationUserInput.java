package ohos.event.notification;

import java.util.List;
import java.util.Map;
import java.util.Set;
import ohos.aafwk.content.Intent;
import ohos.event.notification.NotificationConstant;
import ohos.utils.PacMap;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;
import ohos.utils.net.Uri;

/* loaded from: ohos2.0.1.95.jar:ohos/event/notification/NotificationUserInput.class */
public class NotificationUserInput implements Sequenceable {
    public static final Sequenceable.Producer<NotificationUserInput> PRODUCER = null;

    NotificationUserInput() {
        throw new RuntimeException("Stub!");
    }

    public static void addMimeInputToIntent(NotificationUserInput userInput, Intent intent, Map<String, Uri> results) {
        throw new RuntimeException("Stub!");
    }

    public static void addInputsToIntent(List<NotificationUserInput> userInputs, Intent intent, PacMap pacMap) {
        throw new RuntimeException("Stub!");
    }

    public static Map<String, Uri> getMimeInputsFromIntent(Intent intent, String inputKey) {
        throw new RuntimeException("Stub!");
    }

    public static PacMap getInputsFromIntent(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    public static void setInputsSource(Intent intent, NotificationConstant.InputsSource source) {
        throw new RuntimeException("Stub!");
    }

    public static int getInputsSource(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    public String getInputKey() {
        throw new RuntimeException("Stub!");
    }

    public String getTag() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getOptions() {
        throw new RuntimeException("Stub!");
    }

    public Set<String> getPermitMimeTypes() {
        throw new RuntimeException("Stub!");
    }

    public PacMap getAdditionalData() {
        throw new RuntimeException("Stub!");
    }

    public boolean isPermitFreeFormInput() {
        throw new RuntimeException("Stub!");
    }

    public boolean isMimeTypeOnly() {
        throw new RuntimeException("Stub!");
    }

    public int getEditType() {
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

    public String toString() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/event/notification/NotificationUserInput$Builder.class */
    public static final class Builder {
        public Builder(String inputKey) {
            throw new RuntimeException("Stub!");
        }

        public Builder setTag(String tag) {
            throw new RuntimeException("Stub!");
        }

        public Builder setOptions(List<String> options) {
            throw new RuntimeException("Stub!");
        }

        public Builder setPermitMimeTypes(String mimeType, boolean doPermit) {
            throw new RuntimeException("Stub!");
        }

        public Builder setPermitFreeFormInput(boolean permitFreeFormInput) {
            throw new RuntimeException("Stub!");
        }

        public Builder addAdditionalData(PacMap pacMap) {
            throw new RuntimeException("Stub!");
        }

        public Builder setEditType(NotificationConstant.InputEditType editType) {
            throw new RuntimeException("Stub!");
        }

        public NotificationUserInput build() {
            throw new RuntimeException("Stub!");
        }
    }
}
