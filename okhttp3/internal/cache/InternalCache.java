package okhttp3.internal.cache;

/* loaded from: classes.dex */
public interface InternalCache {
    @javax.annotation.Nullable
    okhttp3.Response get(okhttp3.Request r1) throws java.io.IOException;

    @javax.annotation.Nullable
    okhttp3.internal.cache.CacheRequest put(okhttp3.Response r1) throws java.io.IOException;

    void remove(okhttp3.Request r1) throws java.io.IOException;

    void trackConditionalCacheHit();

    void trackResponse(okhttp3.internal.cache.CacheStrategy r1);

    void update(okhttp3.Response r1, okhttp3.Response r2);
}
