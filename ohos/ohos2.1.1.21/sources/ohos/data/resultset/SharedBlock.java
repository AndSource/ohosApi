package ohos.data.resultset;

import ohos.data.resultset.ResultSet;
import ohos.utils.Parcel;
import ohos.utils.Sequenceable;

/* loaded from: ohos2.1.1.21.jar:ohos/data/resultset/SharedBlock.class */
public class SharedBlock implements Sequenceable {
    public SharedBlock(String name) {
        throw new RuntimeException("Stub!");
    }

    public SharedBlock(Parcel source) {
        throw new RuntimeException("Stub!");
    }

    public boolean allocateRow() {
        throw new RuntimeException("Stub!");
    }

    public void freeLastRow() {
        throw new RuntimeException("Stub!");
    }

    public ResultSet.ColumnType getType(int rowIndex, int columnIndex) {
        throw new RuntimeException("Stub!");
    }

    public String getName() {
        throw new RuntimeException("Stub!");
    }

    public void clear() {
        throw new RuntimeException("Stub!");
    }

    public int getStartRowIndex() {
        throw new RuntimeException("Stub!");
    }

    public void setStartRowIndex(int rowIndex) {
        throw new RuntimeException("Stub!");
    }

    public int getRowCount() {
        throw new RuntimeException("Stub!");
    }

    public boolean setColumnCount(int count) {
        throw new RuntimeException("Stub!");
    }

    public byte[] getBlob(int rowIndex, int columnIndex) {
        throw new RuntimeException("Stub!");
    }

    public String getString(int rowIndex, int columnIndex) {
        throw new RuntimeException("Stub!");
    }

    public long getLong(int rowIndex, int columnIndex) {
        throw new RuntimeException("Stub!");
    }

    public double getDouble(int rowIndex, int columnIndex) {
        throw new RuntimeException("Stub!");
    }

    public short getShort(int rowIndex, int columnIndex) {
        throw new RuntimeException("Stub!");
    }

    public int getInt(int rowIndex, int columnIndex) {
        throw new RuntimeException("Stub!");
    }

    public float getFloat(int rowIndex, int columnIndex) {
        throw new RuntimeException("Stub!");
    }

    public boolean putBlob(byte[] value, int rowIndex, int columnIndex) {
        throw new RuntimeException("Stub!");
    }

    public boolean putString(String value, int rowIndex, int columnIndex) {
        throw new RuntimeException("Stub!");
    }

    public boolean putLong(long value, int rowIndex, int columnIndex) {
        throw new RuntimeException("Stub!");
    }

    public boolean putDouble(double value, int rowIndex, int columnIndex) {
        throw new RuntimeException("Stub!");
    }

    public boolean putNull(int rowIndex, int columnIndex) {
        throw new RuntimeException("Stub!");
    }

    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean marshalling(Parcel out) {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean unmarshalling(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    public void close() {
        throw new RuntimeException("Stub!");
    }
}
