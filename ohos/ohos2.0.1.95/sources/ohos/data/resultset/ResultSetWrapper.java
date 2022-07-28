package ohos.data.resultset;

import java.util.List;
import ohos.data.rdb.DataObserver;
import ohos.data.resultset.ResultSet;
import ohos.utils.PacMap;
import ohos.utils.net.Uri;

/* loaded from: ohos2.0.1.95.jar:ohos/data/resultset/ResultSetWrapper.class */
public class ResultSetWrapper implements ResultSet {
    protected ResultSet mResultSet;

    public ResultSetWrapper(ResultSet inputResultSet) {
        throw new RuntimeException("Stub!");
    }

    public ResultSet getResultSet() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.ResultSet
    public String[] getAllColumnNames() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.ResultSet
    public int getColumnCount() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.ResultSet
    public ResultSet.ColumnType getColumnTypeForIndex(int columnIndex) {
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
    public int getRowCount() {
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
    public boolean goToRow(int rowIndex) {
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
    public boolean isEnded() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.ResultSet
    public boolean isStarted() {
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
    public byte[] getBlob(int columnIndex) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.ResultSet
    public String getString(int columnIndex) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.ResultSet
    public short getShort(int columnIndex) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.ResultSet
    public int getInt(int columnIndex) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.ResultSet
    public long getLong(int columnIndex) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.ResultSet
    public float getFloat(int columnIndex) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.ResultSet
    public double getDouble(int columnIndex) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.ResultSet
    public boolean isColumnNull(int columnIndex) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.ResultSet
    public boolean isClosed() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.ResultSet
    public void close() {
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
}
