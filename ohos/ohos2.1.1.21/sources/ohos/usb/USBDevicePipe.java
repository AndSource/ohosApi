package ohos.usb;

import java.util.concurrent.TimeoutException;

/* loaded from: ohos2.1.1.21.jar:ohos/usb/USBDevicePipe.class */
public class USBDevicePipe {
    public final USBDevice device = null;

    public USBDevicePipe(USBDevice device) {
        throw new RuntimeException("Stub!");
    }

    public int bulkTransfer(USBEndpoint epObj, byte[] buffer, int length, int timeout) {
        throw new RuntimeException("Stub!");
    }

    public int bulkTransfer(USBEndpoint epObj, byte[] buffer, int offset, int length, int timeout) {
        throw new RuntimeException("Stub!");
    }

    public boolean claimInterface(USBInterface interfaceObj, boolean force) {
        throw new RuntimeException("Stub!");
    }

    public void close() {
        throw new RuntimeException("Stub!");
    }

    public int controlTransfer(int requestType, int request, int value, int index, byte[] buffer, int offset, int length, int timeout) {
        throw new RuntimeException("Stub!");
    }

    public int controlTransfer(int requestType, int request, int value, int index, byte[] buffer, int length, int timeout) {
        throw new RuntimeException("Stub!");
    }

    public int getFileDescriptor() {
        throw new RuntimeException("Stub!");
    }

    public byte[] getRawDescriptors() {
        throw new RuntimeException("Stub!");
    }

    public String getSerial() {
        throw new RuntimeException("Stub!");
    }

    public boolean releaseInterface(USBInterface interfaceObj) {
        throw new RuntimeException("Stub!");
    }

    public USBRequest requestWait(long timeout) throws TimeoutException {
        throw new RuntimeException("Stub!");
    }

    public USBRequest requestWait() {
        throw new RuntimeException("Stub!");
    }

    public boolean setConfiguration(USBConfig config) {
        throw new RuntimeException("Stub!");
    }

    public boolean setInterface(USBInterface interfaceObj) {
        throw new RuntimeException("Stub!");
    }

    public boolean openByInt(String name, int fd) {
        throw new RuntimeException("Stub!");
    }
}
