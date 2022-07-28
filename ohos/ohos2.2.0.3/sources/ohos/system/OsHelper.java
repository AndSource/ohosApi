package ohos.system;

import java.io.FileDescriptor;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;

/* loaded from: ohos2.2.0.3.jar:ohos/system/OsHelper.class */
public final class OsHelper {
    OsHelper() {
        throw new RuntimeException("Stub!");
    }

    public static String readSymbolicLink(String path) throws OsHelperErrnoException {
        throw new RuntimeException("Stub!");
    }

    public static FileStat getFileStatus(String path) throws OsHelperErrnoException {
        throw new RuntimeException("Stub!");
    }

    public static FileStat getFileStatus(FileDescriptor fd) throws OsHelperErrnoException {
        throw new RuntimeException("Stub!");
    }

    public static FileStat getLinkFileStatus(String path) throws OsHelperErrnoException {
        throw new RuntimeException("Stub!");
    }

    public static void symbolLink(String oldPath, String newPath) throws OsHelperErrnoException {
        throw new RuntimeException("Stub!");
    }

    public static long getSystemConfig(int name) {
        throw new RuntimeException("Stub!");
    }

    public static void setFileExtendedAttribute(String path, String name, byte[] value, int flag) throws OsHelperErrnoException {
        throw new RuntimeException("Stub!");
    }

    public static void setEnvironmentVar(String name, String value, boolean overwrite) throws OsHelperErrnoException {
        throw new RuntimeException("Stub!");
    }

    public static void removeFileExtendedAttribute(String path, String name) throws OsHelperErrnoException {
        throw new RuntimeException("Stub!");
    }

    public static void changeFileName(String oldPath, String newPath) throws OsHelperErrnoException {
        throw new RuntimeException("Stub!");
    }

    public static int readFile(FileDescriptor fd, ByteBuffer buffer) throws InterruptedIOException, OsHelperErrnoException {
        throw new RuntimeException("Stub!");
    }

    public static int readFile(FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount) throws InterruptedIOException, OsHelperErrnoException {
        throw new RuntimeException("Stub!");
    }

    public static int setProcessOption(int option, long arg2, long arg3, long arg4, long arg5) throws OsHelperErrnoException {
        throw new RuntimeException("Stub!");
    }

    public static void allocSpaceForFile(FileDescriptor fd, long offset, long length) throws OsHelperErrnoException {
        throw new RuntimeException("Stub!");
    }

    public static long setFileOperationPos(FileDescriptor fd, long offset, int whence) throws OsHelperErrnoException {
        throw new RuntimeException("Stub!");
    }

    public static int getUID() {
        throw new RuntimeException("Stub!");
    }

    public static FileDescriptor copyFileDescriptor(FileDescriptor oldFd, int newFd) throws OsHelperErrnoException {
        throw new RuntimeException("Stub!");
    }

    public static void closeFile(FileDescriptor fd) throws OsHelperErrnoException {
        throw new RuntimeException("Stub!");
    }

    public static void changeFilePermission(String path, int mode) throws OsHelperErrnoException {
        throw new RuntimeException("Stub!");
    }

    public static boolean checkFilePermission(String path, int mode) throws OsHelperErrnoException {
        throw new RuntimeException("Stub!");
    }

    public static void trimFile(long targetFileSize, FileDescriptor fileDescriptor) throws OsHelperErrnoException {
        throw new RuntimeException("Stub!");
    }

    public static FileDescriptor copyFileDescriptor(FileDescriptor fileDescriptor) throws OsHelperErrnoException {
        throw new RuntimeException("Stub!");
    }
}
