package okhttp3.internal.http2;

/* loaded from: classes.dex */
public interface PushObserver {
    public static final okhttp3.internal.http2.PushObserver CANCEL = null;


    static {
            okhttp3.internal.http2.PushObserver$1 r0 = new okhttp3.internal.http2.PushObserver$1
            r0.<init>()
            okhttp3.internal.http2.PushObserver.CANCEL = r0
            return
    }

    boolean onData(int r1, okio.BufferedSource r2, int r3, boolean r4) throws java.io.IOException;

    boolean onHeaders(int r1, java.util.List<okhttp3.internal.http2.Header> r2, boolean r3);

    boolean onRequest(int r1, java.util.List<okhttp3.internal.http2.Header> r2);

    void onReset(int r1, okhttp3.internal.http2.ErrorCode r2);
}
