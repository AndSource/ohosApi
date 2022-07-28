package ohos.net;

import java.io.File;
import java.io.IOException;
import java.net.CacheRequest;
import java.net.CacheResponse;
import java.net.ResponseCache;
import java.net.URI;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* loaded from: ohos2.2.0.3.jar:ohos/net/HttpResponseCache.class */
public final class HttpResponseCache extends ResponseCache {
    HttpResponseCache(File directory, long size) {
        throw new RuntimeException("Stub!");
    }

    public static HttpResponseCache getInstalled() {
        throw new RuntimeException("Stub!");
    }

    public static synchronized HttpResponseCache install(File directory, long size) throws IOException {
        throw new RuntimeException("Stub!");
    }

    @Override // java.net.ResponseCache
    public CacheResponse get(URI uri, String rqstMethod, Map<String, List<String>> rqstHeaders) throws IOException {
        throw new RuntimeException("Stub!");
    }

    @Override // java.net.ResponseCache
    public CacheRequest put(URI uri, URLConnection conn) throws IOException {
        throw new RuntimeException("Stub!");
    }

    public long getSize() throws IOException {
        throw new RuntimeException("Stub!");
    }

    public long getMaxSize() {
        throw new RuntimeException("Stub!");
    }

    public void flush() throws IOException {
        throw new RuntimeException("Stub!");
    }

    public int getNetworkCount() {
        throw new RuntimeException("Stub!");
    }

    public int getHitCount() {
        throw new RuntimeException("Stub!");
    }

    public int getRequestCount() {
        throw new RuntimeException("Stub!");
    }

    public void close() throws IOException {
        throw new RuntimeException("Stub!");
    }

    public void delete() throws IOException {
        throw new RuntimeException("Stub!");
    }
}
