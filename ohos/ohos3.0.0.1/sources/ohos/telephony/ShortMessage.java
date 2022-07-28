package ohos.telephony;

import java.util.Optional;

/* loaded from: ohos3.0.0.1.jar:ohos/telephony/ShortMessage.class */
public class ShortMessage {

    /* loaded from: ohos3.0.0.1.jar:ohos/telephony/ShortMessage$ShortMessageClass.class */
    public enum ShortMessageClass {
        UNKNOWN,
        INSTANT_MESSAGE,
        OPTIONAL_MESSAGE,
        SIM_MESSAGE,
        FORWARD_MESSAGE
    }

    ShortMessage() {
        throw new RuntimeException("Stub!");
    }

    public int getProtocolId() {
        throw new RuntimeException("Stub!");
    }

    public ShortMessageClass getMessageClass() {
        throw new RuntimeException("Stub!");
    }

    public static Optional<ShortMessage> createMessage(byte[] pdu, String specification) {
        throw new RuntimeException("Stub!");
    }

    public String getVisibleMessageBody() {
        throw new RuntimeException("Stub!");
    }

    public String getVisibleRawAddress() {
        throw new RuntimeException("Stub!");
    }

    public String getScAddress() {
        throw new RuntimeException("Stub!");
    }

    public long getScTimestamp() {
        throw new RuntimeException("Stub!");
    }

    public byte[] getUserRawData() {
        throw new RuntimeException("Stub!");
    }

    public boolean isReplaceMessage() {
        throw new RuntimeException("Stub!");
    }

    public boolean hasReplyPath() {
        throw new RuntimeException("Stub!");
    }

    public int getStatus() {
        throw new RuntimeException("Stub!");
    }

    public byte[] getPdu() {
        throw new RuntimeException("Stub!");
    }

    public boolean isSmsStatusReportMessage() {
        throw new RuntimeException("Stub!");
    }
}
