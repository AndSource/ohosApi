package ohos.event.notification;

import java.util.List;
import ohos.aafwk.content.IntentParams;
import ohos.agp.components.ComponentProvider;
import ohos.app.Context;
import ohos.event.intentagent.IntentAgent;
import ohos.media.common.sessioncore.AVToken;
import ohos.media.image.PixelMap;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;
import ohos.utils.net.Uri;

/* loaded from: ohos2.2.0.3.jar:ohos/event/notification/NotificationRequest.class */
public final class NotificationRequest implements Sequenceable {
    public static final int BADGE_STYLE_BIG = 2;
    public static final int BADGE_STYLE_LITTLE = 1;
    public static final int BADGE_STYLE_NONE = 0;
    public static final String CLASSIFICATION_ALARM = "alarm";
    public static final String CLASSIFICATION_CALL = "call";
    public static final String CLASSIFICATION_EMAIL = "email";
    public static final String CLASSIFICATION_ERROR = "err";
    public static final String CLASSIFICATION_EVENT = "event";
    public static final String CLASSIFICATION_MESSAGE = "msg";
    public static final String CLASSIFICATION_NAVIGATION = "navigation";
    public static final String CLASSIFICATION_PROGRESS = "progress";
    public static final String CLASSIFICATION_PROMO = "promo";
    public static final String CLASSIFICATION_RECOMMENDATION = "recommendation";
    public static final String CLASSIFICATION_REMINDER = "reminder";
    public static final String CLASSIFICATION_SERVICE = "service";
    public static final String CLASSIFICATION_SOCIAL = "social";
    public static final String CLASSIFICATION_STATUS = "status";
    public static final String CLASSIFICATION_SYSTEM = "sys";
    public static final String CLASSIFICATION_TRANSPORT = "transport";
    public static final int COLOR_DEFAULT = 0;
    public static final String EXTRA_USER_INPUT_HISTORY = "harmony_user_input_history";
    public static final int GROUP_ALERT_TYPE_ALL = 0;
    public static final int GROUP_ALERT_TYPE_CHILD = 2;
    public static final int GROUP_ALERT_TYPE_OVERVIEW = 1;
    public static final Sequenceable.Producer<NotificationRequest> PRODUCER = null;
    public static final int VISIBLENESS_TYPE_NO_OVERRIDE = -1000;
    public static final int VISIBLENESS_TYPE_PRIVATE = 2;
    public static final int VISIBLENESS_TYPE_PUBLIC = 1;
    public static final int VISIBLENESS_TYPE_SECRET = 3;

    public NotificationRequest(NotificationRequest request) {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest(int notificationId) {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest(Context context, int notificationId) {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setCustomView(ComponentProvider view) {
        throw new RuntimeException("Stub!");
    }

    public ComponentProvider getCustomView() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setCustomBigView(ComponentProvider view) {
        throw new RuntimeException("Stub!");
    }

    public ComponentProvider getCustomBigView() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setCustomFloatView(ComponentProvider view) {
        throw new RuntimeException("Stub!");
    }

    public ComponentProvider getCustomFloatView() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setOnlyLocal(boolean flag) {
        throw new RuntimeException("Stub!");
    }

    public boolean isOnlyLocal() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setSortingKey(String key) {
        throw new RuntimeException("Stub!");
    }

    public String getSortingKey() {
        throw new RuntimeException("Stub!");
    }

    public long getAutoDeletedTime() {
        throw new RuntimeException("Stub!");
    }

    public String getNotificationHashCode() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setLittleIcon(PixelMap littleIcon) {
        throw new RuntimeException("Stub!");
    }

    public PixelMap getLittleIcon() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setBigIcon(PixelMap bigIcon) {
        throw new RuntimeException("Stub!");
    }

    public PixelMap getBigIcon() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setAutoDeletedTime(long time) {
        throw new RuntimeException("Stub!");
    }

    public boolean isTapDismissed() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setTapDismissed(boolean tapDismissed) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public long getCreateTime() {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public NotificationRequest setCreateTime(long createTime) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public boolean isShowCreateTime() {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public NotificationRequest setShowCreateTime(boolean showCreateTime) {
        throw new RuntimeException("Stub!");
    }

    public boolean isShowDeliveryTime() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setShowDeliveryTime(boolean showDeliveryTime) {
        throw new RuntimeException("Stub!");
    }

    public long getDeliveryTime() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setDeliveryTime(long deliveryTime) {
        throw new RuntimeException("Stub!");
    }

    public IntentAgent getIntentAgent() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setIntentAgent(IntentAgent agent) {
        throw new RuntimeException("Stub!");
    }

    public int getNotificationId() {
        throw new RuntimeException("Stub!");
    }

    public String getSlotId() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setNotificationId(int notificationId) {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setSlotId(String slotId) {
        throw new RuntimeException("Stub!");
    }

    public NotificationContent getContent() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setContent(NotificationContent content) {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setAdditionalData(IntentParams extras) {
        throw new RuntimeException("Stub!");
    }

    public IntentParams getAdditionalData() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setSettingsText(String text) {
        throw new RuntimeException("Stub!");
    }

    public String getSettingsText() {
        throw new RuntimeException("Stub!");
    }

    public int getNotificationType() {
        throw new RuntimeException("Stub!");
    }

    public String getCreatorBundleName() {
        throw new RuntimeException("Stub!");
    }

    public String getOwnerBundleName() {
        throw new RuntimeException("Stub!");
    }

    public int getCreatorPid() {
        throw new RuntimeException("Stub!");
    }

    public int getCreatorUid() {
        throw new RuntimeException("Stub!");
    }

    public String getGroupValue() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setGroupValue(String groupValue) {
        throw new RuntimeException("Stub!");
    }

    public int getGroupAlertType() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setGroupAlertType(int groupAlertType) {
        throw new RuntimeException("Stub!");
    }

    public boolean isGroupOverview() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setGroupOverview(boolean groupOverview) {
        throw new RuntimeException("Stub!");
    }

    public IntentAgent getRemovalIntentAgent() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setRemovalIntentAgent(IntentAgent removalIntentAgent) {
        throw new RuntimeException("Stub!");
    }

    public String getClassification() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setClassification(String classification) {
        throw new RuntimeException("Stub!");
    }

    public IntentAgent getMaxScreenIntentAgent() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setMaxScreenIntentAgent(IntentAgent maxScreenIntentAgent) {
        throw new RuntimeException("Stub!");
    }

    public int getColor() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setColor(int color) {
        throw new RuntimeException("Stub!");
    }

    public boolean isColorEnabled() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setColorEnabled(boolean colorEnabled) {
        throw new RuntimeException("Stub!");
    }

    public int getBadgeNumber() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setBadgeNumber(int number) {
        throw new RuntimeException("Stub!");
    }

    public boolean isAlertOneTime() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setAlertOneTime(boolean isAlertOnce) {
        throw new RuntimeException("Stub!");
    }

    public boolean isShowStopwatch() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setShowStopwatch(boolean isStopwatch) {
        throw new RuntimeException("Stub!");
    }

    public boolean isCountdownTimer() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setCountdownTimer(boolean isCountDown) {
        throw new RuntimeException("Stub!");
    }

    public boolean isInProgress() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setInProgress(boolean isOngoing) {
        throw new RuntimeException("Stub!");
    }

    public int getVisibleness() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setVisibleness(int visibleness) {
        throw new RuntimeException("Stub!");
    }

    public int getProgressValue() {
        throw new RuntimeException("Stub!");
    }

    public int getProgressMax() {
        throw new RuntimeException("Stub!");
    }

    public boolean isProgressIndeterminate() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setProgressBar(int progress, int progressMax, boolean indeterminate) {
        throw new RuntimeException("Stub!");
    }

    public String getStatusBarText() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setStatusBarText(String statusBarText) {
        throw new RuntimeException("Stub!");
    }

    public boolean isUnremovable() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setUnremovable(boolean isUnremovable) {
        throw new RuntimeException("Stub!");
    }

    public boolean isFloatingIcon() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest addActionButton(NotificationActionButton actionButton) {
        throw new RuntimeException("Stub!");
    }

    public List<NotificationActionButton> getActionButtons() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setPublicNotification(NotificationRequest request) {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setPermitSystemGeneratedContextualActionButtons(boolean permitted) {
        throw new RuntimeException("Stub!");
    }

    public boolean isPermitSystemGeneratedContextualActionButtons() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setNotificationUserInputHistory(List<String> text) {
        throw new RuntimeException("Stub!");
    }

    public List<MessageUser> getMessageUsers() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest addMessageUser(MessageUser messageUser) {
        throw new RuntimeException("Stub!");
    }

    public String getLabel() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setBadgeIconStyle(int badgeIconStyle) {
        throw new RuntimeException("Stub!");
    }

    public int getBadgeIconStyle() {
        throw new RuntimeException("Stub!");
    }

    public NotificationRequest setShortcutId(String shortcutId) {
        throw new RuntimeException("Stub!");
    }

    public String getShortcutId() {
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

    /* loaded from: ohos2.2.0.3.jar:ohos/event/notification/NotificationRequest$NotificationContent.class */
    public static final class NotificationContent implements Sequenceable {
        public static final int NOTIFICATION_CONTENT_BASIC_TEXT = 0;
        public static final int NOTIFICATION_CONTENT_CONVERSATION = 3;
        public static final int NOTIFICATION_CONTENT_LONG_TEXT = 1;
        public static final int NOTIFICATION_CONTENT_MEDIA = 5;
        public static final int NOTIFICATION_CONTENT_MULTILINE = 4;
        public static final int NOTIFICATION_CONTENT_PICTURE = 2;
        public static final Sequenceable.Producer<NotificationContent> PRODUCER = null;

        public NotificationContent(NotificationNormalContent normalContent) {
            throw new RuntimeException("Stub!");
        }

        public NotificationContent(NotificationLongTextContent longTextContent) {
            throw new RuntimeException("Stub!");
        }

        public NotificationContent(NotificationPictureContent pictureContent) {
            throw new RuntimeException("Stub!");
        }

        public NotificationContent(NotificationConversationalContent conversationContent) {
            throw new RuntimeException("Stub!");
        }

        public NotificationContent(NotificationMultiLineContent multiLineContent) {
            throw new RuntimeException("Stub!");
        }

        public NotificationContent(NotificationMediaContent mediaContent) {
            throw new RuntimeException("Stub!");
        }

        public int getContentType() {
            throw new RuntimeException("Stub!");
        }

        public Object getNotificationContent() {
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
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/event/notification/NotificationRequest$NotificationConversationalContent.class */
    public static final class NotificationConversationalContent implements Sequenceable {
        public NotificationConversationalContent(MessageUser user) throws IllegalArgumentException {
            throw new RuntimeException("Stub!");
        }

        public MessageUser getMessageUser() {
            throw new RuntimeException("Stub!");
        }

        public String getTitle() {
            throw new RuntimeException("Stub!");
        }

        public NotificationConversationalContent setTitle(String title) {
            throw new RuntimeException("Stub!");
        }

        public String getText() {
            throw new RuntimeException("Stub!");
        }

        public NotificationConversationalContent setText(String text) {
            throw new RuntimeException("Stub!");
        }

        public String getAdditionalText() {
            throw new RuntimeException("Stub!");
        }

        public NotificationConversationalContent setAdditionalText(String additionalText) {
            throw new RuntimeException("Stub!");
        }

        public String getConversationTitle() {
            throw new RuntimeException("Stub!");
        }

        public NotificationConversationalContent setConversationTitle(String conversationTitle) {
            throw new RuntimeException("Stub!");
        }

        public boolean isConversationGroup() {
            throw new RuntimeException("Stub!");
        }

        public NotificationConversationalContent setConversationGroup(boolean conversationGroup) {
            throw new RuntimeException("Stub!");
        }

        public List<ConversationalMessage> getAllConversationalMessages() {
            throw new RuntimeException("Stub!");
        }

        public NotificationConversationalContent addConversationalMessage(ConversationalMessage message) {
            throw new RuntimeException("Stub!");
        }

        public NotificationConversationalContent addConversationalMessage(String text, long timestamp, MessageUser sender) throws IllegalArgumentException {
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

        /* loaded from: ohos2.2.0.3.jar:ohos/event/notification/NotificationRequest$NotificationConversationalContent$ConversationalMessage.class */
        public static final class ConversationalMessage implements Sequenceable {
            public static final Sequenceable.Producer<ConversationalMessage> PRODUCER = null;

            public ConversationalMessage(String text, long timestamp, MessageUser sender) throws IllegalArgumentException {
                throw new RuntimeException("Stub!");
            }

            public String getText() {
                throw new RuntimeException("Stub!");
            }

            public long getArrivedTime() {
                throw new RuntimeException("Stub!");
            }

            public MessageUser getSender() {
                throw new RuntimeException("Stub!");
            }

            public ConversationalMessage setData(String mimeType, Uri uri) {
                throw new RuntimeException("Stub!");
            }

            public String getMimeType() {
                throw new RuntimeException("Stub!");
            }

            public Uri getUri() {
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
        }
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/event/notification/NotificationRequest$NotificationLongTextContent.class */
    public static final class NotificationLongTextContent implements Sequenceable {
        public NotificationLongTextContent() {
            throw new RuntimeException("Stub!");
        }

        public NotificationLongTextContent(String longText) {
            throw new RuntimeException("Stub!");
        }

        public String getTitle() {
            throw new RuntimeException("Stub!");
        }

        public NotificationLongTextContent setTitle(String title) {
            throw new RuntimeException("Stub!");
        }

        public String getText() {
            throw new RuntimeException("Stub!");
        }

        public NotificationLongTextContent setText(String text) {
            throw new RuntimeException("Stub!");
        }

        public String getLongText() {
            throw new RuntimeException("Stub!");
        }

        public NotificationLongTextContent setLongText(String longText) {
            throw new RuntimeException("Stub!");
        }

        public String getAdditionalText() {
            throw new RuntimeException("Stub!");
        }

        public NotificationLongTextContent setAdditionalText(String additionalText) {
            throw new RuntimeException("Stub!");
        }

        public String getBriefText() {
            throw new RuntimeException("Stub!");
        }

        public NotificationLongTextContent setBriefText(String briefText) {
            throw new RuntimeException("Stub!");
        }

        public String getExpandedTitle() {
            throw new RuntimeException("Stub!");
        }

        public NotificationLongTextContent setExpandedTitle(String expandedTitle) {
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
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/event/notification/NotificationRequest$NotificationMediaContent.class */
    public static final class NotificationMediaContent implements Sequenceable {
        public NotificationMediaContent() {
            throw new RuntimeException("Stub!");
        }

        public String getTitle() {
            throw new RuntimeException("Stub!");
        }

        public NotificationMediaContent setTitle(String title) {
            throw new RuntimeException("Stub!");
        }

        public String getText() {
            throw new RuntimeException("Stub!");
        }

        public NotificationMediaContent setText(String text) {
            throw new RuntimeException("Stub!");
        }

        public String getAdditionalText() {
            throw new RuntimeException("Stub!");
        }

        public NotificationMediaContent setAdditionalText(String additionalText) {
            throw new RuntimeException("Stub!");
        }

        public AVToken getAVToken() {
            throw new RuntimeException("Stub!");
        }

        public NotificationMediaContent setAVToken(AVToken avToken) {
            throw new RuntimeException("Stub!");
        }

        public int[] getShownActions() {
            throw new RuntimeException("Stub!");
        }

        public NotificationMediaContent setShownActions(int[] actions) {
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
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/event/notification/NotificationRequest$NotificationMultiLineContent.class */
    public static final class NotificationMultiLineContent implements Sequenceable {
        public NotificationMultiLineContent() {
            throw new RuntimeException("Stub!");
        }

        public String getTitle() {
            throw new RuntimeException("Stub!");
        }

        public NotificationMultiLineContent setTitle(String title) {
            throw new RuntimeException("Stub!");
        }

        public String getText() {
            throw new RuntimeException("Stub!");
        }

        public NotificationMultiLineContent setText(String text) {
            throw new RuntimeException("Stub!");
        }

        public String getAdditionalText() {
            throw new RuntimeException("Stub!");
        }

        public NotificationMultiLineContent setAdditionalText(String additionalText) {
            throw new RuntimeException("Stub!");
        }

        public String getBriefText() {
            throw new RuntimeException("Stub!");
        }

        public NotificationMultiLineContent setBriefText(String briefText) {
            throw new RuntimeException("Stub!");
        }

        public String getExpandedTitle() {
            throw new RuntimeException("Stub!");
        }

        public NotificationMultiLineContent setExpandedTitle(String longTitle) {
            throw new RuntimeException("Stub!");
        }

        public List<String> getAllLines() {
            throw new RuntimeException("Stub!");
        }

        public NotificationMultiLineContent addSingleLine(String line) {
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
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/event/notification/NotificationRequest$NotificationNormalContent.class */
    public static final class NotificationNormalContent implements Sequenceable {
        public NotificationNormalContent() {
            throw new RuntimeException("Stub!");
        }

        public String getTitle() {
            throw new RuntimeException("Stub!");
        }

        public NotificationNormalContent setTitle(String title) {
            throw new RuntimeException("Stub!");
        }

        public String getText() {
            throw new RuntimeException("Stub!");
        }

        public NotificationNormalContent setText(String text) {
            throw new RuntimeException("Stub!");
        }

        public String getAdditionalText() {
            throw new RuntimeException("Stub!");
        }

        public NotificationNormalContent setAdditionalText(String additionalText) {
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
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/event/notification/NotificationRequest$NotificationPictureContent.class */
    public static final class NotificationPictureContent implements Sequenceable {
        public NotificationPictureContent() {
            throw new RuntimeException("Stub!");
        }

        public String getTitle() {
            throw new RuntimeException("Stub!");
        }

        public NotificationPictureContent setTitle(String title) {
            throw new RuntimeException("Stub!");
        }

        public String getText() {
            throw new RuntimeException("Stub!");
        }

        public NotificationPictureContent setText(String text) {
            throw new RuntimeException("Stub!");
        }

        public String getAdditionalText() {
            throw new RuntimeException("Stub!");
        }

        public NotificationPictureContent setAdditionalText(String additionalText) {
            throw new RuntimeException("Stub!");
        }

        public String getBriefText() {
            throw new RuntimeException("Stub!");
        }

        public NotificationPictureContent setBriefText(String briefText) {
            throw new RuntimeException("Stub!");
        }

        public String getExpandedTitle() {
            throw new RuntimeException("Stub!");
        }

        public NotificationPictureContent setExpandedTitle(String expandedTitle) {
            throw new RuntimeException("Stub!");
        }

        public NotificationPictureContent setBigPicture(PixelMap bigPicture) {
            throw new RuntimeException("Stub!");
        }

        public PixelMap getBigPicture() {
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
    }
}
