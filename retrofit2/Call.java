package retrofit2;

/* loaded from: classes.dex */
public interface Call<T> extends java.lang.Cloneable {
    void cancel();

    /* renamed from: clone */
    retrofit2.Call<T> mo371clone();

    void enqueue(retrofit2.Callback<T> r1);

    retrofit2.Response<T> execute() throws java.io.IOException;

    boolean isCanceled();

    boolean isExecuted();

    okhttp3.Request request();

    okio.Timeout timeout();
}
