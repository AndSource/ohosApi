package ohos.telephony;

import java.util.ArrayList;
import ohos.app.Context;

/* loaded from: ohos3.0.0.1.jar:ohos/telephony/ShortMessageManager.class */
public class ShortMessageManager {
    ShortMessageManager(Context ct) {
        throw new RuntimeException("Stub!");
    }

    public static ShortMessageManager getInstance(Context context) {
        throw new RuntimeException("Stub!");
    }

    public int getDefaultSmsSlotId() {
        throw new RuntimeException("Stub!");
    }

    public boolean hasSmsCapability() {
        throw new RuntimeException("Stub!");
    }

    public ArrayList<String> splitMessage(String content) {
        throw new RuntimeException("Stub!");
    }

    public void sendMessage(int slotId, String destinationHost, String serviceCenter, String content, ISendShortMessageCallback sendCallback, IDeliveryShortMessageCallback deliveryCallback) {
        throw new RuntimeException("Stub!");
    }

    public void sendMessage(int slotId, String destinationHost, String serviceCenter, byte[] data, short destinationPort, ISendShortMessageCallback sendCallback, IDeliveryShortMessageCallback deliveryCallback) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSmscAddr(int slotId, String smscAddr) {
        throw new RuntimeException("Stub!");
    }

    public String getSmscAddr(int slotId) {
        throw new RuntimeException("Stub!");
    }
}
