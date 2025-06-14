package okhttp3;

/* loaded from: classes.dex */
public abstract class WebSocketListener {
    public WebSocketListener() {
            r0 = this;
            r0.<init>()
            return
    }

    public void onClosed(okhttp3.WebSocket r1, int r2, java.lang.String r3) {
            r0 = this;
            return
    }

    public void onClosing(okhttp3.WebSocket r1, int r2, java.lang.String r3) {
            r0 = this;
            return
    }

    public void onFailure(okhttp3.WebSocket r1, java.lang.Throwable r2, @javax.annotation.Nullable okhttp3.Response r3) {
            r0 = this;
            return
    }

    public void onMessage(okhttp3.WebSocket r1, java.lang.String r2) {
            r0 = this;
            return
    }

    public void onMessage(okhttp3.WebSocket r1, okio.ByteString r2) {
            r0 = this;
            return
    }

    public void onOpen(okhttp3.WebSocket r1, okhttp3.Response r2) {
            r0 = this;
            return
    }
}
