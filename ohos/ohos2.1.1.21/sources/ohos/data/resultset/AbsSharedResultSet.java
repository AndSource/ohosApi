package ohos.data.resultset;

import ohos.data.resultset.ResultSet;

/* loaded from: ohos2.1.1.21.jar:ohos/data/resultset/AbsSharedResultSet.class */
public abstract class AbsSharedResultSet extends AbsResultSet implements SharedResultSet {
    protected SharedBlock sharedBlock;

    public AbsSharedResultSet(String name) {
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

    @Override // ohos.data.resultset.ResultSet
    public ResultSet.ColumnType getColumnTypeForIndex(int columnIndex) {
        throw new RuntimeException("Stub!");
    }

    protected void checkState(int columnIndex) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.SharedResultSet
    public boolean onGo(int oldRowIndex, int newRowIndex) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.SharedResultSet
    public void fillBlock(int startRowIndex, SharedBlock block) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.SharedResultSet
    public SharedBlock getBlock() {
        throw new RuntimeException("Stub!");
    }

    public void setBlock(SharedBlock block) {
        throw new RuntimeException("Stub!");
    }

    public boolean hasBlock() {
        throw new RuntimeException("Stub!");
    }

    protected void closeBlock() {
        throw new RuntimeException("Stub!");
    }

    protected void clearBlock() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.AbsResultSet, ohos.data.resultset.ResultSet
    public final boolean goToRow(int rowIndex) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.AbsResultSet, ohos.data.resultset.ResultSet
    public void close() {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.data.resultset.AbsResultSet
    protected void finalize() {
        throw new RuntimeException("Stub!");
    }
}
