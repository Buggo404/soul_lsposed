package okhttp3;

/* loaded from: classes.dex */
public interface Interceptor {

    public interface Chain {
        okhttp3.Call call();

        int connectTimeoutMillis();

        @javax.annotation.Nullable
        okhttp3.Connection connection();

        okhttp3.Response proceed(okhttp3.Request r1) throws java.io.IOException;

        int readTimeoutMillis();

        okhttp3.Request request();

        okhttp3.Interceptor.Chain withConnectTimeout(int r1, java.util.concurrent.TimeUnit r2);

        okhttp3.Interceptor.Chain withReadTimeout(int r1, java.util.concurrent.TimeUnit r2);

        okhttp3.Interceptor.Chain withWriteTimeout(int r1, java.util.concurrent.TimeUnit r2);

        int writeTimeoutMillis();
    }

    okhttp3.Response intercept(okhttp3.Interceptor.Chain r1) throws java.io.IOException;
}
