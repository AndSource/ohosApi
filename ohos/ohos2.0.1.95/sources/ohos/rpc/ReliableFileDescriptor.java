package ohos.rpc;

import java.io.FileDescriptor;
import java.io.IOException;
import java.net.Socket;
import ohos.system.OsHelperErrnoException;

/* loaded from: ohos2.0.1.95.jar:ohos/rpc/ReliableFileDescriptor.class */
public class ReliableFileDescriptor {
    public ReliableFileDescriptor(FileDescriptor fd) {
        throw new RuntimeException("Stub!");
    }

    public ReliableFileDescriptor(FileDescriptor fd, FileDescriptor commonFd) {
        throw new RuntimeException("Stub!");
    }

    public FileDescriptor getFileDescriptor() {
        throw new RuntimeException("Stub!");
    }

    public int getNativeFd() {
        throw new RuntimeException("Stub!");
    }

    public static ReliableFileDescriptor[] createPipe2() throws OsHelperErrnoException {
        throw new RuntimeException("Stub!");
    }

    public static ReliableFileDescriptor[] createReliablePipe() throws IOException, OsHelperErrnoException {
        throw new RuntimeException("Stub!");
    }

    public static ReliableFileDescriptor takeChargeOfFileDescriptor(int fd) throws IOException, OsHelperErrnoException {
        throw new RuntimeException("Stub!");
    }

    public static ReliableFileDescriptor dupFromSocket(Socket socket) throws IOException, OsHelperErrnoException {
        throw new RuntimeException("Stub!");
    }

    public long getFileTotalSize() {
        throw new RuntimeException("Stub!");
    }
}
