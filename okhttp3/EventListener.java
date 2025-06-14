package okhttp3;

/* loaded from: classes.dex */
public abstract class EventListener {
    public static final okhttp3.EventListener NONE = null;


    public interface Factory {
        okhttp3.EventListener create(okhttp3.Call r1);
    }

    static {
            okhttp3.EventListener$1 r0 = new okhttp3.EventListener$1
            r0.<init>()
            okhttp3.EventListener.NONE = r0
            return
    }

    public EventListener() {
            r0 = this;
            r0.<init>()
            return
    }

    static okhttp3.EventListener.Factory factory(okhttp3.EventListener r1) {
            okhttp3.EventListener$$ExternalSyntheticLambda0 r0 = new okhttp3.EventListener$$ExternalSyntheticLambda0
            r0.<init>(r1)
            return r0
    }

    static /* synthetic */ okhttp3.EventListener lambda$factory$0(okhttp3.EventListener r0, okhttp3.Call r1) {
            return r0
    }

    public void callEnd(okhttp3.Call r1) {
            r0 = this;
            return
    }

    public void callFailed(okhttp3.Call r1, java.io.IOException r2) {
            r0 = this;
            return
    }

    public void callStart(okhttp3.Call r1) {
            r0 = this;
            return
    }

    public void connectEnd(okhttp3.Call r1, java.net.InetSocketAddress r2, java.net.Proxy r3, @javax.annotation.Nullable okhttp3.Protocol r4) {
            r0 = this;
            return
    }

    public void connectFailed(okhttp3.Call r1, java.net.InetSocketAddress r2, java.net.Proxy r3, @javax.annotation.Nullable okhttp3.Protocol r4, java.io.IOException r5) {
            r0 = this;
            return
    }

    public void connectStart(okhttp3.Call r1, java.net.InetSocketAddress r2, java.net.Proxy r3) {
            r0 = this;
            return
    }

    public void connectionAcquired(okhttp3.Call r1, okhttp3.Connection r2) {
            r0 = this;
            return
    }

    public void connectionReleased(okhttp3.Call r1, okhttp3.Connection r2) {
            r0 = this;
            return
    }

    public void dnsEnd(okhttp3.Call r1, java.lang.String r2, java.util.List<java.net.InetAddress> r3) {
            r0 = this;
            return
    }

    public void dnsStart(okhttp3.Call r1, java.lang.String r2) {
            r0 = this;
            return
    }

    public void requestBodyEnd(okhttp3.Call r1, long r2) {
            r0 = this;
            return
    }

    public void requestBodyStart(okhttp3.Call r1) {
            r0 = this;
            return
    }

    public void requestFailed(okhttp3.Call r1, java.io.IOException r2) {
            r0 = this;
            return
    }

    public void requestHeadersEnd(okhttp3.Call r1, okhttp3.Request r2) {
            r0 = this;
            return
    }

    public void requestHeadersStart(okhttp3.Call r1) {
            r0 = this;
            return
    }

    public void responseBodyEnd(okhttp3.Call r1, long r2) {
            r0 = this;
            return
    }

    public void responseBodyStart(okhttp3.Call r1) {
            r0 = this;
            return
    }

    public void responseFailed(okhttp3.Call r1, java.io.IOException r2) {
            r0 = this;
            return
    }

    public void responseHeadersEnd(okhttp3.Call r1, okhttp3.Response r2) {
            r0 = this;
            return
    }

    public void responseHeadersStart(okhttp3.Call r1) {
            r0 = this;
            return
    }

    public void secureConnectEnd(okhttp3.Call r1, @javax.annotation.Nullable okhttp3.Handshake r2) {
            r0 = this;
            return
    }

    public void secureConnectStart(okhttp3.Call r1) {
            r0 = this;
            return
    }
}
