package ohos.event.notification;

import java.util.List;
import ohos.event.intentagent.IntentAgent;
import ohos.event.notification.NotificationConstant;
import ohos.media.image.PixelMap;
import ohos.utils.PacMap;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.2.0.3.jar:ohos/event/notification/NotificationActionButton.class */
public class NotificationActionButton implements Sequenceable {
    public static final Sequenceable.Producer<NotificationActionButton> PRODUCER = null;

    NotificationActionButton() {
        throw new RuntimeException("Stub!");
    }

    public PixelMap getIcon() {
        throw new RuntimeException("Stub!");
    }

    public PacMap getAdditionalData() {
        throw new RuntimeException("Stub!");
    }

    public List<NotificationUserInput> getUserInputs() {
        throw new RuntimeException("Stub!");
    }

    public List<NotificationUserInput> getMimeTypeOnlyUserInputs() {
        throw new RuntimeException("Stub!");
    }

    public boolean isAutoCreatedReplies() {
        throw new RuntimeException("Stub!");
    }

    public boolean isContextDependent() {
        throw new RuntimeException("Stub!");
    }

    public String getTitle() {
        throw new RuntimeException("Stub!");
    }

    public IntentAgent getIntentAgent() {
        throw new RuntimeException("Stub!");
    }

    public int getSemanticActionButton() {
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

    /* loaded from: ohos2.2.0.3.jar:ohos/event/notification/NotificationActionButton$Builder.class */
    public static final class Builder {
        public Builder(PixelMap icon, String title, IntentAgent intentAgent) {
            throw new RuntimeException("Stub!");
        }

        public Builder(NotificationActionButton actionButton) {
            throw new RuntimeException("Stub!");
        }

        public Builder addNotificationUserInput(NotificationUserInput userInput) {
            throw new RuntimeException("Stub!");
        }

        public Builder setContextDependent(boolean isContextual) {
            throw new RuntimeException("Stub!");
        }

        public Builder setSemanticActionButton(NotificationConstant.SemanticActionButton semanticActionButton) {
            throw new RuntimeException("Stub!");
        }

        public Builder setAutoCreatedReplies(boolean autoCreatedReplies) {
            throw new RuntimeException("Stub!");
        }

        public Builder addAdditionalData(PacMap pacMap) {
            throw new RuntimeException("Stub!");
        }

        public NotificationActionButton build() {
            throw new RuntimeException("Stub!");
        }
    }
}
