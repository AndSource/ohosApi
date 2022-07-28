package ohos.rpc;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import ohos.system.OsHelperErrnoException;

/* loaded from: ohos2.2.0.3.jar:ohos/rpc/ReliableFileDescriptor.class */
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

    public void close() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/rpc/ReliableFileDescriptor$AutoCloseFileInputStream.class */
    public static class AutoCloseFileInputStream extends FileInputStream {
        public AutoCloseFileInputStream(ReliableFileDescriptor reliablefd) {
            super((FileDescriptor) null);
            throw new RuntimeException("Stub!");
        }

        @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new RuntimeException("Stub!");
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public int read() throws IOException {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/rpc/ReliableFileDescriptor$AutoCloseFileOutputStream.class */
    public static class AutoCloseFileOutputStream extends FileOutputStream {
        public AutoCloseFileOutputStream(ReliableFileDescriptor reliablefd) {
            super((FileDescriptor) null);
            throw new RuntimeException("Stub!");
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new RuntimeException("Stub!");
        }
    }
}
