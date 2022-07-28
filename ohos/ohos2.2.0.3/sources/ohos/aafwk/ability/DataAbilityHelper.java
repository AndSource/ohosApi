package ohos.aafwk.ability;

import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import ohos.app.Context;
import ohos.data.dataability.DataAbilityPredicates;
import ohos.data.rdb.ValuesBucket;
import ohos.data.resultset.ResultSet;
import ohos.global.resource.RawFileDescriptor;
import ohos.utils.PacMap;
import ohos.utils.net.Uri;

/* loaded from: ohos2.2.0.3.jar:ohos/aafwk/ability/DataAbilityHelper.class */
public class DataAbilityHelper {
    DataAbilityHelper(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static DataAbilityHelper creator(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static DataAbilityHelper creator(Context context, Uri uri) {
        throw new RuntimeException("Stub!");
    }

    public static DataAbilityHelper creator(Context context, Uri uri, boolean tryBind) {
        throw new RuntimeException("Stub!");
    }

    public boolean release() {
        throw new RuntimeException("Stub!");
    }

    public void registerObserver(Uri uri, IDataAbilityObserver dataObserver) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public void notifyChange(Uri uri) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public void unregisterObserver(Uri uri, IDataAbilityObserver dataObserver) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }

    public int insert(Uri uri, ValuesBucket value) throws DataAbilityRemoteException {
        throw new RuntimeException("Stub!");
    }

    public int batchInsert(Uri uri, ValuesBucket[] values) throws DataAbilityRemoteException {
        throw new RuntimeException("Stub!");
    }

    public int delete(Uri uri, DataAbilityPredicates predicates) throws DataAbilityRemoteException {
        throw new RuntimeException("Stub!");
    }

    public int update(Uri uri, ValuesBucket value, DataAbilityPredicates predicates) throws DataAbilityRemoteException {
        throw new RuntimeException("Stub!");
    }

    public ResultSet query(Uri uri, String[] columns, DataAbilityPredicates predicates) throws DataAbilityRemoteException {
        throw new RuntimeException("Stub!");
    }

    public DataAbilityResult[] executeBatch(Uri uri, ArrayList<DataAbilityOperation> operations) throws DataAbilityRemoteException, OperationExecuteException {
        throw new RuntimeException("Stub!");
    }

    public FileDescriptor openFile(Uri uri, String mode) throws DataAbilityRemoteException, FileNotFoundException {
        throw new RuntimeException("Stub!");
    }

    public RawFileDescriptor openRawFile(Uri uri, String mode) throws DataAbilityRemoteException, FileNotFoundException {
        throw new RuntimeException("Stub!");
    }

    public String[] getFileTypes(Uri uri, String mimeTypeFilter) throws DataAbilityRemoteException {
        throw new RuntimeException("Stub!");
    }

    public PacMap call(Uri uri, String method, String arg, PacMap extras) throws DataAbilityRemoteException {
        throw new RuntimeException("Stub!");
    }

    public String getType(Uri uri) throws DataAbilityRemoteException {
        throw new RuntimeException("Stub!");
    }

    public Uri normalizeUri(Uri uri) throws DataAbilityRemoteException {
        throw new RuntimeException("Stub!");
    }

    public Uri denormalizeUri(Uri uri) throws DataAbilityRemoteException {
        throw new RuntimeException("Stub!");
    }

    public boolean reload(Uri uri, PacMap extras) throws DataAbilityRemoteException {
        throw new RuntimeException("Stub!");
    }

    public InputStream obtainInputStream(Uri uri) throws DataAbilityRemoteException, FileNotFoundException {
        throw new RuntimeException("Stub!");
    }

    public OutputStream obtainOutputStream(Uri uri) throws DataAbilityRemoteException, FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
}
