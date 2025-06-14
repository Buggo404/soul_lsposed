package okhttp3;

/* loaded from: classes.dex */
public interface Call extends java.lang.Cloneable {

    public interface Factory {
        okhttp3.Call newCall(okhttp3.Request r1);
    }

    void cancel();

    okhttp3.Call clone();

    void enqueue(okhttp3.Callback r1);

    okhttp3.Response execute() throws java.io.IOException;

    boolean isCanceled();

    boolean isExecuted();

    okhttp3.Request request();

    okio.Timeout timeout();
}
