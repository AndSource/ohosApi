package ohos.usb;

import java.nio.ByteBuffer;

/* loaded from: ohos2.2.0.3.jar:ohos/usb/USBRequest.class */
public class USBRequest {
    public USBRequest() {
        throw new RuntimeException("Stub!");
    }

    public void abort() {
        throw new RuntimeException("Stub!");
    }

    public void free() {
        throw new RuntimeException("Stub!");
    }

    public boolean initialize(USBDevicePipe connection, USBEndpoint ep) {
        throw new RuntimeException("Stub!");
    }

    public boolean queue(ByteBuffer buffer) {
        throw new RuntimeException("Stub!");
    }

    public boolean queue(ByteBuffer buffer, int length) {
        throw new RuntimeException("Stub!");
    }

    public void dequeue(boolean useBufferOverflowInsteadOfIllegalArg) {
        throw new RuntimeException("Stub!");
    }

    public void setClientData(Object data) {
        throw new RuntimeException("Stub!");
    }
}
