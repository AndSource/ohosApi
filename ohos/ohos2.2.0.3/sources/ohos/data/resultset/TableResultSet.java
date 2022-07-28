package ohos.data.resultset;

import ohos.data.resultset.ResultSet;

/* loaded from: ohos2.2.0.3.jar:ohos/data/resultset/TableResultSet.class */
public class TableResultSet extends AbsResultSet {
    public TableResultSet(String[] columnNames, int initialCapacity) {
        throw new RuntimeException("Stub!");
    }

    public TableResultSet(String[] columnNames) {
        throw new RuntimeException("Stub!");
    }

    public RowBuilder addRowByBuilder() {
        throw new RuntimeException("Stub!");
    }

    public void addRow(Object[] columnValues) {
        throw new RuntimeException("Stub!");
    }

    public void addRow(Iterable<?> columnValues) {
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

    @Override // ohos.data.resultset.AbsResultSet, ohos.data.resultset.ResultSet
    public int getColumnCount() {
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
    public boolean goToRow(int rowIndex) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.2.0.3.jar:ohos/data/resultset/TableResultSet$RowBuilder.class */
    public class RowBuilder {
        RowBuilder(int rowCount) {
            throw new RuntimeException("Stub!");
        }

        public RowBuilder setColumnValue(Object columnValue) {
            throw new RuntimeException("Stub!");
        }

        public RowBuilder setColumnValue(String columnName, Object columnValue) {
            throw new RuntimeException("Stub!");
        }
    }
}
