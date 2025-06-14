package okhttp3;

/* loaded from: classes.dex */
public interface WebSocket {

    public interface Factory {
        okhttp3.WebSocket newWebSocket(okhttp3.Request r1, okhttp3.WebSocketListener r2);
    }

    void cancel();

    boolean close(int r1, @javax.annotation.Nullable java.lang.String r2);

    long queueSize();

    okhttp3.Request request();

    boolean send(java.lang.String r1);

    boolean send(okio.ByteString r1);
}
