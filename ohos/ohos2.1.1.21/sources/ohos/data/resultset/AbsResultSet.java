package ohos.data.resultset;

import java.util.List;
import ohos.data.rdb.DataObserver;
import ohos.utils.PacMap;
import ohos.utils.net.Uri;

/* loaded from: ohos2.1.1.21.jar:ohos/data/resultset/AbsResultSet.class */
public abstract class AbsResultSet implements ResultSet {
    protected static final int DEFAULT_POS = -1;
    protected boolean isClosed = false;
    protected int pos = -1;

    @Override // ohos.data.resultset.ResultSet
    public abstract int getRowCount();

    @Override // ohos.data.resultset.ResultSet
    public abstract String[] getAllColumnNames();

    @Override // ohos.data.resultset.ResultSet
    public abstract byte[] getBlob(int i);

    @Override // ohos.data.resultset.ResultSet
    public abstract String getString(int i);

    @Override // ohos.data.resultset.ResultSet
    public abstract short getShort(int i);

    @Override // ohos.data.resultset.ResultSet
    public abstract int getInt(int i);

    @Override // ohos.data.resultset.ResultSet
    public abstract long getLong(int i);

    @Override // ohos.data.resultset.ResultSet
    public abstract float getFloat(int i);

    @Override // ohos.data.resultset.ResultSet
    public abstract double getDouble(int i);

    @Override // ohos.data.resultset.ResultSet
    public abstract boolean isColumnNull(int i);

    @Override // ohos.data.resultset.ResultSet
    public abstract boolean goToRow(int i);

    public AbsResultSet() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.ResultSet
    public int getRowIndex() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.ResultSet
    public boolean goTo(int offset) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.ResultSet
    public boolean goToFirstRow() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.ResultSet
    public boolean goToLastRow() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.ResultSet
    public boolean goToNextRow() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.ResultSet
    public boolean goToPreviousRow() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.ResultSet
    public boolean isAtFirstRow() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.ResultSet
    public boolean isAtLastRow() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.ResultSet
    public boolean isStarted() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.ResultSet
    public boolean isEnded() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.ResultSet
    public int getColumnCount() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.ResultSet
    public int getColumnIndexForName(String columnName) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.ResultSet
    public String getColumnNameForIndex(int columnIndex) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.ResultSet
    public void setExtensions(PacMap extensions) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.ResultSet
    public PacMap getExtensions() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.ResultSet
    public void setAffectedByUris(Object context, List<Uri> uris) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.ResultSet
    public List<Uri> getAffectedByUris() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.ResultSet
    public void registerObserver(DataObserver observer) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.ResultSet
    public void unregisterObserver(DataObserver observer) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.ResultSet
    public void close() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.ResultSet
    public boolean isClosed() {
        throw new RuntimeException("Stub!");
    }

    protected void finalize() {
        throw new RuntimeException("Stub!");
    }

    protected void notifyChange() {
        throw new RuntimeException("Stub!");
    }
}
