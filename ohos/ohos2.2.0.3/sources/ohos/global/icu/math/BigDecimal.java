package ohos.global.icu.math;

import java.io.Serializable;
import java.math.BigInteger;

/* loaded from: ohos2.2.0.3.jar:ohos/global/icu/math/BigDecimal.class */
public class BigDecimal extends Number implements Serializable, Comparable<BigDecimal> {
    public static final int ROUND_CEILING = 2;
    public static final int ROUND_DOWN = 1;
    public static final int ROUND_FLOOR = 3;
    public static final int ROUND_HALF_DOWN = 5;
    public static final int ROUND_HALF_EVEN = 6;
    public static final int ROUND_HALF_UP = 4;
    public static final int ROUND_UNNECESSARY = 7;
    public static final int ROUND_UP = 0;
    public static final BigDecimal ONE = null;
    public static final BigDecimal TEN = null;
    public static final BigDecimal ZERO = null;

    public BigDecimal(java.math.BigDecimal bd) {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal(BigInteger bi) {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal(BigInteger bi, int scale) {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal(char[] inchars) {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal(char[] inchars, int offset, int length) {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal(double num) {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal(int num) {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal(long num) {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal(String string) {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal abs() {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal abs(MathContext set) {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal add(BigDecimal rhs) {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal add(BigDecimal rhs, MathContext set) {
        throw new RuntimeException("Stub!");
    }

    public int compareTo(BigDecimal rhs) {
        throw new RuntimeException("Stub!");
    }

    public int compareTo(BigDecimal rhs, MathContext set) {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal divide(BigDecimal rhs) {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal divide(BigDecimal rhs, int round) {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal divide(BigDecimal rhs, int scale, int round) {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal divide(BigDecimal rhs, MathContext set) {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal divideInteger(BigDecimal rhs) {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal divideInteger(BigDecimal rhs, MathContext set) {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal max(BigDecimal rhs) {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal max(BigDecimal rhs, MathContext set) {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal min(BigDecimal rhs) {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal min(BigDecimal rhs, MathContext set) {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal multiply(BigDecimal rhs) {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal multiply(BigDecimal rhs, MathContext set) {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal negate() {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal negate(MathContext set) {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal plus() {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal plus(MathContext set) {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal pow(BigDecimal rhs) {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal pow(BigDecimal rhs, MathContext set) {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal remainder(BigDecimal rhs) {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal remainder(BigDecimal rhs, MathContext set) {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal subtract(BigDecimal rhs) {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal subtract(BigDecimal rhs, MathContext set) {
        throw new RuntimeException("Stub!");
    }

    public byte byteValueExact() {
        throw new RuntimeException("Stub!");
    }

    @Override // java.lang.Number
    public double doubleValue() {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object obj) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.lang.Number
    public float floatValue() {
        throw new RuntimeException("Stub!");
    }

    public String format(int before, int after) {
        throw new RuntimeException("Stub!");
    }

    public String format(int before, int after, int explaces, int exdigits, int exformint, int exround) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    @Override // java.lang.Number
    public int intValue() {
        throw new RuntimeException("Stub!");
    }

    public int intValueExact() {
        throw new RuntimeException("Stub!");
    }

    @Override // java.lang.Number
    public long longValue() {
        throw new RuntimeException("Stub!");
    }

    public long longValueExact() {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal movePointLeft(int n) {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal movePointRight(int n) {
        throw new RuntimeException("Stub!");
    }

    public int scale() {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal setScale(int scale) {
        throw new RuntimeException("Stub!");
    }

    public BigDecimal setScale(int scale, int round) {
        throw new RuntimeException("Stub!");
    }

    public short shortValueExact() {
        throw new RuntimeException("Stub!");
    }

    public int signum() {
        throw new RuntimeException("Stub!");
    }

    public java.math.BigDecimal toBigDecimal() {
        throw new RuntimeException("Stub!");
    }

    public BigInteger toBigInteger() {
        throw new RuntimeException("Stub!");
    }

    public BigInteger toBigIntegerExact() {
        throw new RuntimeException("Stub!");
    }

    public char[] toCharArray() {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }

    public BigInteger unscaledValue() {
        throw new RuntimeException("Stub!");
    }

    public static BigDecimal valueOf(double dub) {
        throw new RuntimeException("Stub!");
    }

    public static BigDecimal valueOf(long lint) {
        throw new RuntimeException("Stub!");
    }

    public static BigDecimal valueOf(long lint, int scale) {
        throw new RuntimeException("Stub!");
    }
}
