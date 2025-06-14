package okhttp3.internal.proxy;

/* loaded from: classes.dex */
public class NullProxySelector extends java.net.ProxySelector {
    public NullProxySelector() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.net.ProxySelector
    public void connectFailed(java.net.URI r1, java.net.SocketAddress r2, java.io.IOException r3) {
            r0 = this;
            return
    }

    @Override // java.net.ProxySelector
    public java.util.List<java.net.Proxy> select(java.net.URI r2) {
            r1 = this;
            if (r2 == 0) goto L9
            java.net.Proxy r2 = java.net.Proxy.NO_PROXY
            java.util.List r2 = java.util.Collections.singletonList(r2)
            return r2
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "uri must not be null"
            r2.<init>(r0)
            throw r2
    }
}
