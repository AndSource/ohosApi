package ohos.global.resource;

import java.io.IOException;
import java.text.Format;
import ohos.global.resource.solidxml.Pattern;
import ohos.global.resource.solidxml.Theme;

/* loaded from: ohos2.0.1.95.jar:ohos/global/resource/Element.class */
public abstract class Element {
    public abstract String getString() throws IOException, NotExistException, WrongTypeException;

    public abstract String getString(Object... objArr) throws IOException, NotExistException, WrongTypeException;

    public abstract String getString(Object obj, Format format) throws IOException, NotExistException, WrongTypeException;

    public abstract String getString(Object[] objArr, Format[] formatArr) throws IOException, NotExistException, WrongTypeException;

    public abstract boolean getBoolean() throws IOException, NotExistException, WrongTypeException;

    public abstract int getColor() throws IOException, NotExistException, WrongTypeException;

    public abstract float getFloat() throws IOException, NotExistException, WrongTypeException;

    public abstract String getConfig() throws IOException, NotExistException, WrongTypeException;

    public abstract int getInteger() throws IOException, NotExistException, WrongTypeException;

    public abstract String[] getStringArray() throws IOException, NotExistException, WrongTypeException;

    public abstract int[] getIntArray() throws IOException, NotExistException, WrongTypeException;

    public abstract String getPluralString(int i) throws IOException, NotExistException, WrongTypeException;

    public abstract String getPluralString(int i, Object... objArr) throws IOException, NotExistException, WrongTypeException;

    public abstract Theme getTheme() throws IOException, NotExistException, WrongTypeException;

    public abstract Pattern getPattern() throws IOException, NotExistException, WrongTypeException;

    public Element() {
        throw new RuntimeException("Stub!");
    }
}
