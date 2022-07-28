package ohos.net;

import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;

/* loaded from: ohos2.0.1.95.jar:ohos/net/DataFlowStatistics.class */
public class DataFlowStatistics {
    public DataFlowStatistics() {
        throw new RuntimeException("Stub!");
    }

    public static long getCellularRxBytes() {
        throw new RuntimeException("Stub!");
    }

    public static long getCellularTxBytes() {
        throw new RuntimeException("Stub!");
    }

    public static long getAllRxBytes() {
        throw new RuntimeException("Stub!");
    }

    public static long getAllTxBytes() {
        throw new RuntimeException("Stub!");
    }

    public static long getUidRxBytes(int uid) {
        throw new RuntimeException("Stub!");
    }

    public static long getUidTxBytes(int uid) {
        throw new RuntimeException("Stub!");
    }

    public static long getIfaceRxBytes(String nic) {
        throw new RuntimeException("Stub!");
    }

    public static long getIfaceTxBytes(String nic) {
        throw new RuntimeException("Stub!");
    }

    public static void clearDataFlowTag() {
        throw new RuntimeException("Stub!");
    }

    public static int getDataFlowTag() {
        throw new RuntimeException("Stub!");
    }

    public static void addOperation(int operations) {
        throw new RuntimeException("Stub!");
    }

    public static void addOperation(int tag, int operations) {
        throw new RuntimeException("Stub!");
    }

    public static void setDataFlowTag(int tag) {
        throw new RuntimeException("Stub!");
    }

    public static void setDatagramSocketTag(DatagramSocket socket) throws SocketException {
        throw new RuntimeException("Stub!");
    }

    public static void setSocketTag(Socket socket) throws SocketException {
        throw new RuntimeException("Stub!");
    }

    public static void removeDatagramSocketTag(DatagramSocket socket) throws SocketException {
        throw new RuntimeException("Stub!");
    }

    public static void removeSocketTag(Socket socket) throws SocketException {
        throw new RuntimeException("Stub!");
    }
}
