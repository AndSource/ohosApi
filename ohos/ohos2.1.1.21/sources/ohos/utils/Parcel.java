package ohos.utils;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import ohos.interwork.utils.PacMapEx;
import ohos.interwork.utils.ParcelableEx;

/* loaded from: ohos2.1.1.21.jar:ohos/utils/Parcel.class */
public class Parcel {
    protected Parcel() {
        throw new RuntimeException("Stub!");
    }

    protected void flushBuffer() {
        throw new RuntimeException("Stub!");
    }

    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }

    public static Parcel create() {
        throw new RuntimeException("Stub!");
    }

    public static Parcel create(long nativeHandler) {
        throw new RuntimeException("Stub!");
    }

    public void reclaim() {
        throw new RuntimeException("Stub!");
    }

    public final int getSize() {
        throw new RuntimeException("Stub!");
    }

    public final int getCapacity() {
        throw new RuntimeException("Stub!");
    }

    public final boolean setSize(int size) {
        throw new RuntimeException("Stub!");
    }

    public final boolean setCapacity(int capacity) {
        throw new RuntimeException("Stub!");
    }

    public final int getWritableBytes() {
        throw new RuntimeException("Stub!");
    }

    public final int getReadableBytes() {
        throw new RuntimeException("Stub!");
    }

    public final int getReadPosition() {
        throw new RuntimeException("Stub!");
    }

    public final int getWritePosition() {
        throw new RuntimeException("Stub!");
    }

    public final boolean rewindRead(int pos) {
        throw new RuntimeException("Stub!");
    }

    public final boolean rewindWrite(int pos) {
        throw new RuntimeException("Stub!");
    }

    public final boolean writeByte(byte val) {
        throw new RuntimeException("Stub!");
    }

    public final boolean writeShort(short val) {
        throw new RuntimeException("Stub!");
    }

    public final boolean writeInt(int val) {
        throw new RuntimeException("Stub!");
    }

    public final boolean writeLong(long val) {
        throw new RuntimeException("Stub!");
    }

    public final boolean writeFloat(float val) {
        throw new RuntimeException("Stub!");
    }

    public final boolean writeDouble(double val) {
        throw new RuntimeException("Stub!");
    }

    public final boolean writeBoolean(boolean val) {
        throw new RuntimeException("Stub!");
    }

    public final boolean writeChar(char val) {
        throw new RuntimeException("Stub!");
    }

    public final boolean writeString(String val) {
        throw new RuntimeException("Stub!");
    }

    public final void writeSequenceable(Sequenceable val) {
        throw new RuntimeException("Stub!");
    }

    public final byte readByte() {
        throw new RuntimeException("Stub!");
    }

    public final short readShort() {
        throw new RuntimeException("Stub!");
    }

    public final int readInt() {
        throw new RuntimeException("Stub!");
    }

    public final long readLong() {
        throw new RuntimeException("Stub!");
    }

    public final float readFloat() {
        throw new RuntimeException("Stub!");
    }

    public final double readDouble() {
        throw new RuntimeException("Stub!");
    }

    public final boolean readBoolean() {
        throw new RuntimeException("Stub!");
    }

    public final char readChar() {
        throw new RuntimeException("Stub!");
    }

    public final String readString() {
        throw new RuntimeException("Stub!");
    }

    public final boolean readSequenceable(Sequenceable in) {
        throw new RuntimeException("Stub!");
    }

    public final boolean writeByteArray(byte[] val) {
        throw new RuntimeException("Stub!");
    }

    public final boolean writeBytes(byte[] val) {
        throw new RuntimeException("Stub!");
    }

    public final boolean writeShortArray(short[] values) {
        throw new RuntimeException("Stub!");
    }

    public final boolean writeIntArray(int[] values) {
        throw new RuntimeException("Stub!");
    }

    public final boolean writeLongArray(long[] values) {
        throw new RuntimeException("Stub!");
    }

    public final boolean writeFloatArray(float[] values) {
        throw new RuntimeException("Stub!");
    }

    public final boolean writeDoubleArray(double[] values) {
        throw new RuntimeException("Stub!");
    }

    public final boolean writeBooleanArray(boolean[] values) {
        throw new RuntimeException("Stub!");
    }

    public final boolean writeCharArray(char[] values) {
        throw new RuntimeException("Stub!");
    }

    public final boolean writeStringArray(String[] values) {
        throw new RuntimeException("Stub!");
    }

    public final boolean writeStringList(List<String> values) {
        throw new RuntimeException("Stub!");
    }

    public final boolean writeSequenceableArray(Sequenceable[] values) {
        throw new RuntimeException("Stub!");
    }

    public final boolean writeSequenceableList(List<? extends Sequenceable> values) {
        throw new RuntimeException("Stub!");
    }

    public final boolean writeSequenceableMap(Map<String, ? extends Sequenceable> values) {
        throw new RuntimeException("Stub!");
    }

    public final void readByteArray(byte[] val) {
        throw new RuntimeException("Stub!");
    }

    public final byte[] readByteArray() {
        throw new RuntimeException("Stub!");
    }

    public final byte[] getBytes() {
        throw new RuntimeException("Stub!");
    }

    public final void readShortArray(short[] val) {
        throw new RuntimeException("Stub!");
    }

    public final short[] readShortArray() {
        throw new RuntimeException("Stub!");
    }

    public final void readIntArray(int[] val) {
        throw new RuntimeException("Stub!");
    }

    public final int[] readIntArray() {
        throw new RuntimeException("Stub!");
    }

    public final void readLongArray(long[] val) {
        throw new RuntimeException("Stub!");
    }

    public final long[] readLongArray() {
        throw new RuntimeException("Stub!");
    }

    public final void readFloatArray(float[] val) {
        throw new RuntimeException("Stub!");
    }

    public final float[] readFloatArray() {
        throw new RuntimeException("Stub!");
    }

    public final void readDoubleArray(double[] val) {
        throw new RuntimeException("Stub!");
    }

    public final double[] readDoubleArray() {
        throw new RuntimeException("Stub!");
    }

    public final void readBooleanArray(boolean[] val) {
        throw new RuntimeException("Stub!");
    }

    public final boolean[] readBooleanArray() {
        throw new RuntimeException("Stub!");
    }

    public final void readCharArray(char[] val) {
        throw new RuntimeException("Stub!");
    }

    public final char[] readCharArray() {
        throw new RuntimeException("Stub!");
    }

    public final void readStringArray(String[] val) {
        throw new RuntimeException("Stub!");
    }

    public final String[] readStringArray() {
        throw new RuntimeException("Stub!");
    }

    public final List<String> readStringList() {
        throw new RuntimeException("Stub!");
    }

    public final void readSequenceableArray(Sequenceable[] val) {
        throw new RuntimeException("Stub!");
    }

    public final <T extends Sequenceable> List<T> readSequenceableList(Class<T> clz) {
        throw new RuntimeException("Stub!");
    }

    public final <T extends Sequenceable> Map<String, T> readSequenceableMap(Class<T> valueType) {
        throw new RuntimeException("Stub!");
    }

    public final void writeTypedSequenceable(Sequenceable sequenceable) {
        throw new RuntimeException("Stub!");
    }

    public final <T extends Sequenceable> T createSequenceable() {
        throw new RuntimeException("Stub!");
    }

    public final <T extends Sequenceable> T createSequenceable(ClassLoader classLoader) {
        throw new RuntimeException("Stub!");
    }

    public final <T extends Sequenceable> void writeTypedSequenceableArray(T[] values) {
        throw new RuntimeException("Stub!");
    }

    public final void writeSerializable(Serializable object) {
        throw new RuntimeException("Stub!");
    }

    public final <T extends Serializable> T readSerializable(Class<T> clz) {
        throw new RuntimeException("Stub!");
    }

    public final Sequenceable[] createSequenceableArray() {
        throw new RuntimeException("Stub!");
    }

    public List<?> readList() {
        throw new RuntimeException("Stub!");
    }

    public void writeList(List<?> values) {
        throw new RuntimeException("Stub!");
    }

    public Map<?, ?> readMap() {
        throw new RuntimeException("Stub!");
    }

    public void writeMap(Map<?, ?> values) {
        throw new RuntimeException("Stub!");
    }

    public final void writeMap(Map<?, ?> values, boolean isCross) {
        throw new RuntimeException("Stub!");
    }

    public final void writeValue(Object value) {
        throw new RuntimeException("Stub!");
    }

    public final Object readValue() {
        throw new RuntimeException("Stub!");
    }

    public final boolean appendFrom(Parcel other) {
        throw new RuntimeException("Stub!");
    }

    public final boolean writePlainBooleanArray(PlainBooleanArray value) {
        throw new RuntimeException("Stub!");
    }

    public final PlainBooleanArray readPlainBooleanArray() {
        throw new RuntimeException("Stub!");
    }

    public final <T> void writePlainArray(PlainArray<T> value) {
        throw new RuntimeException("Stub!");
    }

    public final <T> PlainArray<T> readPlainArray(Class<T> clzType) {
        throw new RuntimeException("Stub!");
    }

    public final void writeParcelableEx(ParcelableEx val) {
        throw new RuntimeException("Stub!");
    }

    public final void writePacMapEx(PacMapEx val) {
        throw new RuntimeException("Stub!");
    }

    public final void readPacMapEx(PacMapEx pacMapEx) {
        throw new RuntimeException("Stub!");
    }

    public final ParcelableEx readParcelableEx(ClassLoader loader) {
        throw new RuntimeException("Stub!");
    }

    public void addAppClassLoader(ClassLoader newClassLoader) {
        throw new RuntimeException("Stub!");
    }
}
