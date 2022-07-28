package ohos.bundle;

import java.util.List;
import ohos.rpc.IRemoteBroker;
import ohos.rpc.RemoteException;

/* loaded from: ohos3.0.0.1.jar:ohos/bundle/IBundleInstaller.class */
public interface IBundleInstaller extends IRemoteBroker {
    public static final int STATUS_INSTALL_FAILURE = 1;
    public static final int STATUS_INSTALL_FAILURE_ABORTED = 2;
    public static final int STATUS_INSTALL_FAILURE_CONFLICT = 4;
    public static final int STATUS_INSTALL_FAILURE_DOWNLOAD_FAILED = 12;
    public static final int STATUS_INSTALL_FAILURE_DOWNLOAD_TIMEOUT = 11;
    public static final int STATUS_INSTALL_FAILURE_INCOMPATIBLE = 6;
    public static final int STATUS_INSTALL_FAILURE_INVALID = 3;
    public static final int STATUS_INSTALL_FAILURE_STORAGE = 5;
    public static final int STATUS_UNINSTALL_FAILURE = 7;
    public static final int STATUS_UNINSTALL_FAILURE_ABORTED = 9;
    public static final int STATUS_UNINSTALL_FAILURE_BLOCKED = 8;
    public static final int STATUS_UNINSTALL_FAILURE_CONFLICT = 10;
    public static final int SUCCESS = 0;

    boolean install(List<String> list, InstallParam installParam, InstallerCallback installerCallback) throws RemoteException;

    boolean uninstall(String str, InstallParam installParam, InstallerCallback installerCallback) throws RemoteException;
}
