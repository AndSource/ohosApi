package ohos.data.resultset;

import ohos.data.rdb.DataObserver;
import ohos.data.resultset.ResultSet;

/* loaded from: ohos2.2.0.3.jar:ohos/data/resultset/CombinedResultSet.class */
public class CombinedResultSet extends AbsResultSet {
    public CombinedResultSet(ResultSet[] resultSets) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.AbsResultSet, ohos.data.resultset.ResultSet
    public int getRowCount() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.AbsResultSet, ohos.data.resultset.ResultSet
    public String[] getAllColumnNames() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.ResultSet
    public ResultSet.ColumnType getColumnTypeForIndex(int columnIndex) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.AbsResultSet, ohos.data.resultset.ResultSet
    public byte[] getBlob(int columnIndex) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.AbsResultSet, ohos.data.resultset.ResultSet
    public String getString(int columnIndex) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.AbsResultSet, ohos.data.resultset.ResultSet
    public short getShort(int columnIndex) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.AbsResultSet, ohos.data.resultset.ResultSet
    public int getInt(int columnIndex) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.AbsResultSet, ohos.data.resultset.ResultSet
    public long getLong(int columnIndex) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.AbsResultSet, ohos.data.resultset.ResultSet
    public float getFloat(int columnIndex) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.AbsResultSet, ohos.data.resultset.ResultSet
    public double getDouble(int columnIndex) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.AbsResultSet, ohos.data.resultset.ResultSet
    public boolean isColumnNull(int columnIndex) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.AbsResultSet, ohos.data.resultset.ResultSet
    public void close() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.AbsResultSet, ohos.data.resultset.ResultSet
    public boolean goToRow(int rowIndex) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.AbsResultSet, ohos.data.resultset.ResultSet
    public void registerObserver(DataObserver observer) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.AbsResultSet, ohos.data.resultset.ResultSet
    public void unregisterObserver(DataObserver observer) {
        throw new RuntimeException("Stub!");
    }
}
