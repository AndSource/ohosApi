package ohos.usb;

/* loaded from: ohos2.1.1.21.jar:ohos/usb/USBDevice.class */
public class USBDevice {
    public USBDevice(String deviceName, int vendorId, int productId, int classId, int subClassId, int protocolId, String manufacturerName, String productName, String version, String serialNumber) {
        throw new RuntimeException("Stub!");
    }

    public int getDeviceClass() {
        throw new RuntimeException("Stub!");
    }

    public int getDeviceId() {
        throw new RuntimeException("Stub!");
    }

    public static int getDeviceId(String name) {
        throw new RuntimeException("Stub!");
    }

    public String getDeviceName() {
        throw new RuntimeException("Stub!");
    }

    public static String getDeviceName(int id) {
        throw new RuntimeException("Stub!");
    }

    public int getDeviceProtocol() {
        throw new RuntimeException("Stub!");
    }

    public int getDeviceSubclass() {
        throw new RuntimeException("Stub!");
    }

    public void setInterfaces(USBInterface[] interfaces) {
        throw new RuntimeException("Stub!");
    }

    public USBInterface getInterface(int index) {
        throw new RuntimeException("Stub!");
    }

    public int getInterfaceCount() {
        throw new RuntimeException("Stub!");
    }

    public String getManufacturerName() {
        throw new RuntimeException("Stub!");
    }

    public int getProductId() {
        throw new RuntimeException("Stub!");
    }

    public String getProductName() {
        throw new RuntimeException("Stub!");
    }

    public String getSerialNumber() {
        throw new RuntimeException("Stub!");
    }

    public int getVendorId() {
        throw new RuntimeException("Stub!");
    }

    public String getVersion() {
        throw new RuntimeException("Stub!");
    }

    public USBConfig getConfiguration(int index) {
        throw new RuntimeException("Stub!");
    }

    public int getConfigurationCount() {
        throw new RuntimeException("Stub!");
    }

    public void setConfigurations(USBConfig[] configs) {
        throw new RuntimeException("Stub!");
    }
}
