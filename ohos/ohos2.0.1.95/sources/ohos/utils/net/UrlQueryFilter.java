package ohos.utils.net;

import java.util.List;
import java.util.Set;
import ohos.utils.Pair;

/* loaded from: ohos2.0.1.95.jar:ohos/utils/net/UrlQueryFilter.class */
public class UrlQueryFilter {
    public UrlQueryFilter() {
        throw new RuntimeException("Stub!");
    }

    public static final ValueFilter filterNulWithSpace() {
        throw new RuntimeException("Stub!");
    }

    public List<Pair<String, String>> getParamsListFiltered() {
        throw new RuntimeException("Stub!");
    }

    public Set<String> getParamsSetFiltered() {
        throw new RuntimeException("Stub!");
    }

    public void setFirstPriority(boolean value) {
        throw new RuntimeException("Stub!");
    }

    public boolean getFirstPriority() {
        throw new RuntimeException("Stub!");
    }

    public String getParamValue(String paramName) {
        throw new RuntimeException("Stub!");
    }

    public void parseUrl(String url) {
        throw new RuntimeException("Stub!");
    }

    public void parseUrlQuery(String query) {
        throw new RuntimeException("Stub!");
    }

    public void registerParameterFilter(String name, ValueFilter filter) {
        throw new RuntimeException("Stub!");
    }

    public ValueFilter getParameterFilter(String name) {
        throw new RuntimeException("Stub!");
    }

    public void setUnregisteredParamFilter(ValueFilter filter) {
        throw new RuntimeException("Stub!");
    }

    public ValueFilter getUnregisteredParamFilter() {
        throw new RuntimeException("Stub!");
    }

    public void allowUnregisteredParameters(boolean allow) {
        throw new RuntimeException("Stub!");
    }

    public boolean isAllowUnregisteredParameters() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos2.0.1.95.jar:ohos/utils/net/UrlQueryFilter$ValueFilter.class */
    public static class ValueFilter {
        public static final int ALLOW_ALL = 2047;
        public static final int ALLOW_ALL_BUT_NUL = 2045;
        public static final int ALLOW_ESCHAR = 4;
        public static final int ALLOW_NOTHING = 0;
        public static final int ALLOW_NUL = 2;
        public static final int ALLOW_SPACE = 1;

        public ValueFilter(int flags) {
            throw new RuntimeException("Stub!");
        }

        public String filterUrl(String url) {
            throw new RuntimeException("Stub!");
        }
    }
}
