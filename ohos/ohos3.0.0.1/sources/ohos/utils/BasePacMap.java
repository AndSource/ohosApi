package ohos.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

/* loaded from: ohos3.0.0.1.jar:ohos/utils/BasePacMap.class */
public class BasePacMap implements Sequenceable, Cloneable {
    protected HashMap<String, Object> dataMap;

    public BasePacMap(int capacity) {
        throw new RuntimeException("Stub!");
    }

    public BasePacMap() {
        throw new RuntimeException("Stub!");
    }

    public void putAll(BasePacMap map) {
        throw new RuntimeException("Stub!");
    }

    protected void putAll(Map<String, Object> map) {
        throw new RuntimeException("Stub!");
    }

    protected void putObjectValue(String key, Object value) {
        throw new RuntimeException("Stub!");
    }

    public void putByteValue(String key, byte value) {
        throw new RuntimeException("Stub!");
    }

    public void putShortValue(String key, short value) {
        throw new RuntimeException("Stub!");
    }

    public void putIntValue(String key, int value) {
        throw new RuntimeException("Stub!");
    }

    public void putLongValue(String key, long value) {
        throw new RuntimeException("Stub!");
    }

    public void putFloatValue(String key, float value) {
        throw new RuntimeException("Stub!");
    }

    public void putDoubleValue(String key, double value) {
        throw new RuntimeException("Stub!");
    }

    public void putBooleanValue(String key, boolean value) {
        throw new RuntimeException("Stub!");
    }

    public void putChar(String key, char value) {
        throw new RuntimeException("Stub!");
    }

    public void putString(String key, String value) {
        throw new RuntimeException("Stub!");
    }

    public void putByteValueArray(String key, byte[] value) {
        throw new RuntimeException("Stub!");
    }

    public void putShortValueArray(String key, short[] value) {
        throw new RuntimeException("Stub!");
    }

    public void putIntValueArray(String key, int[] value) {
        throw new RuntimeException("Stub!");
    }

    public void putLongValueArray(String key, long[] value) {
        throw new RuntimeException("Stub!");
    }

    public void putFloatValueArray(String key, float[] value) {
        throw new RuntimeException("Stub!");
    }

    public void putDoubleValueArray(String key, double[] value) {
        throw new RuntimeException("Stub!");
    }

    public void putBooleanValueArray(String key, boolean[] value) {
        throw new RuntimeException("Stub!");
    }

    public void putCharArray(String key, char[] value) {
        throw new RuntimeException("Stub!");
    }

    public void putStringArray(String key, String[] value) {
        throw new RuntimeException("Stub!");
    }

    public void setClassLoader(ClassLoader loader) {
        throw new RuntimeException("Stub!");
    }

    public ClassLoader getClassLoader() {
        throw new RuntimeException("Stub!");
    }

    public void putPlainArray(String key, PlainArray<? extends Sequenceable> value) {
        throw new RuntimeException("Stub!");
    }

    public PlainArray<?> getPlainArray(String key) {
        throw new RuntimeException("Stub!");
    }

    public void putRemoteObject(String key, Object value) {
        throw new RuntimeException("Stub!");
    }

    public <T> T getRemoteObject(String key, Class<T> clz) {
        throw new RuntimeException("Stub!");
    }

    public void putDimension(String key, Dimension value) {
        throw new RuntimeException("Stub!");
    }

    public Dimension getDimension(String key) {
        throw new RuntimeException("Stub!");
    }

    public void putFloatDimension(String key, FloatDimension value) {
        throw new RuntimeException("Stub!");
    }

    public FloatDimension getFloatDimension(String key) {
        throw new RuntimeException("Stub!");
    }

    protected Map<String, Object> getAll() {
        throw new RuntimeException("Stub!");
    }

    public Optional<Object> getObjectValue(String key) {
        throw new RuntimeException("Stub!");
    }

    protected final <T> Optional<T> getObjectValue(String key, Class<T> clazz) {
        throw new RuntimeException("Stub!");
    }

    public byte getByteValue(String key, byte defaultValue) {
        throw new RuntimeException("Stub!");
    }

    public byte getByteValue(String key) {
        throw new RuntimeException("Stub!");
    }

    public short getShortValue(String key, short defaultValue) {
        throw new RuntimeException("Stub!");
    }

    public short getShortValue(String key) {
        throw new RuntimeException("Stub!");
    }

    public int getIntValue(String key, int defaultValue) {
        throw new RuntimeException("Stub!");
    }

    public int getIntValue(String key) {
        throw new RuntimeException("Stub!");
    }

    public long getLongValue(String key, long defaultValue) {
        throw new RuntimeException("Stub!");
    }

    public long getLongValue(String key) {
        throw new RuntimeException("Stub!");
    }

    public float getFloatValue(String key, float defaultValue) {
        throw new RuntimeException("Stub!");
    }

    public float getFloatValue(String key) {
        throw new RuntimeException("Stub!");
    }

    public double getDoubleValue(String key, double defaultValue) {
        throw new RuntimeException("Stub!");
    }

    public double getDoubleValue(String key) {
        throw new RuntimeException("Stub!");
    }

    public boolean getBooleanValue(String key, boolean defaultValue) {
        throw new RuntimeException("Stub!");
    }

    public boolean getBooleanValue(String key) {
        throw new RuntimeException("Stub!");
    }

    public char getChar(String key, char defaultValue) {
        throw new RuntimeException("Stub!");
    }

    public char getChar(String key) {
        throw new RuntimeException("Stub!");
    }

    public String getString(String key, String defaultValue) {
        throw new RuntimeException("Stub!");
    }

    public String getString(String key) {
        throw new RuntimeException("Stub!");
    }

    public byte[] getByteValueArray(String key) {
        throw new RuntimeException("Stub!");
    }

    public short[] getShortValueArray(String key) {
        throw new RuntimeException("Stub!");
    }

    public int[] getIntValueArray(String key) {
        throw new RuntimeException("Stub!");
    }

    public long[] getLongValueArray(String key) {
        throw new RuntimeException("Stub!");
    }

    public float[] getFloatValueArray(String key) {
        throw new RuntimeException("Stub!");
    }

    public double[] getDoubleValueArray(String key) {
        throw new RuntimeException("Stub!");
    }

    public boolean[] getBooleanValueArray(String key) {
        throw new RuntimeException("Stub!");
    }

    public char[] getCharArray(String key) {
        throw new RuntimeException("Stub!");
    }

    public String[] getStringArray(String key) {
        throw new RuntimeException("Stub!");
    }

    public int getSize() {
        throw new RuntimeException("Stub!");
    }

    public boolean isEmpty() {
        throw new RuntimeException("Stub!");
    }

    public Set<String> getKeys() {
        throw new RuntimeException("Stub!");
    }

    public boolean hasKey(String key) {
        throw new RuntimeException("Stub!");
    }

    public void remove(String key) {
        throw new RuntimeException("Stub!");
    }

    public void clear() {
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

    public boolean equals(Object object) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    protected Object clone() throws CloneNotSupportedException {
        throw new RuntimeException("Stub!");
    }

    @Override // ohos.utils.Sequenceable
    public boolean hasFileDescriptor() {
        throw new RuntimeException("Stub!");
    }
}
