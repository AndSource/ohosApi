package ohos.utils;

/* loaded from: ohos2.0.1.95.jar:ohos/utils/Ashmem.class */
public class Ashmem {
    public static final int PROT_EXEC = 4;
    public static final int PROT_NONE = 0;
    public static final int PROT_READ = 1;
    public static final int PROT_WRITE = 2;

    Ashmem(long nativeObject) {
        throw new RuntimeException("Stub!");
    }

    public static Ashmem createAshmem(String name, int size) {
        throw new RuntimeException("Stub!");
    }

    public static Ashmem createAshmemFromExisting(long unwrappedNativeObject) {
        throw new RuntimeException("Stub!");
    }

    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }

    public void closeAshmem() {
        throw new RuntimeException("Stub!");
    }

    public boolean mapAshmem(int mapType) {
        throw new RuntimeException("Stub!");
    }

    public boolean mapReadAndWriteAShmem() {
        throw new RuntimeException("Stub!");
    }

    public boolean mapReadOnlyAShmem() {
        throw new RuntimeException("Stub!");
    }

    public void unmapAShmem() {
        throw new RuntimeException("Stub!");
    }

    public boolean setProtection(int protectionType) {
        throw new RuntimeException("Stub!");
    }

    public int getAShmemSize() {
        throw new RuntimeException("Stub!");
    }

    public boolean writeToAShmem(byte[] data, int size, int offset) {
        throw new RuntimeException("Stub!");
    }

    public byte[] readFromAShmem(int size, int offset) {
        throw new RuntimeException("Stub!");
    }

    public long getAshmemIdentity() {
        throw new RuntimeException("Stub!");
    }
}
