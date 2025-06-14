package okhttp3.internal;

/* loaded from: classes.dex */
public abstract class Internal {
    public static okhttp3.internal.Internal instance;

    public Internal() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void initializeInstanceForTests() {
            okhttp3.OkHttpClient r0 = new okhttp3.OkHttpClient
            r0.<init>()
            return
    }

    public abstract void addLenient(okhttp3.Headers.Builder r1, java.lang.String r2);

    public abstract void addLenient(okhttp3.Headers.Builder r1, java.lang.String r2, java.lang.String r3);

    public abstract void apply(okhttp3.ConnectionSpec r1, javax.net.ssl.SSLSocket r2, boolean r3);

    public abstract int code(okhttp3.Response.Builder r1);

    public abstract boolean equalsNonHost(okhttp3.Address r1, okhttp3.Address r2);

    @javax.annotation.Nullable
    public abstract okhttp3.internal.connection.Exchange exchange(okhttp3.Response r1);

    public abstract void initExchange(okhttp3.Response.Builder r1, okhttp3.internal.connection.Exchange r2);

    public abstract okhttp3.Call newWebSocketCall(okhttp3.OkHttpClient r1, okhttp3.Request r2);

    public abstract okhttp3.internal.connection.RealConnectionPool realConnectionPool(okhttp3.ConnectionPool r1);
}
