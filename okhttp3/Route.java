package okhttp3;

/* loaded from: classes.dex */
public final class Route {
    final okhttp3.Address address;
    final java.net.InetSocketAddress inetSocketAddress;
    final java.net.Proxy proxy;

    public Route(okhttp3.Address r1, java.net.Proxy r2, java.net.InetSocketAddress r3) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L20
            if (r2 == 0) goto L18
            if (r3 == 0) goto L10
            r0.address = r1
            r0.proxy = r2
            r0.inetSocketAddress = r3
            return
        L10:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "inetSocketAddress == null"
            r1.<init>(r2)
            throw r1
        L18:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "proxy == null"
            r1.<init>(r2)
            throw r1
        L20:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "address == null"
            r1.<init>(r2)
            throw r1
    }

    public okhttp3.Address address() {
            r1 = this;
            okhttp3.Address r0 = r1.address
            return r0
    }

    public boolean equals(@javax.annotation.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof okhttp3.Route
            if (r0 == 0) goto L26
            okhttp3.Route r3 = (okhttp3.Route) r3
            okhttp3.Address r0 = r3.address
            okhttp3.Address r1 = r2.address
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L26
            java.net.Proxy r0 = r3.proxy
            java.net.Proxy r1 = r2.proxy
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L26
            java.net.InetSocketAddress r3 = r3.inetSocketAddress
            java.net.InetSocketAddress r0 = r2.inetSocketAddress
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L26
            r3 = 1
            goto L27
        L26:
            r3 = 0
        L27:
            return r3
    }

    public int hashCode() {
            r2 = this;
            okhttp3.Address r0 = r2.address
            int r0 = r0.hashCode()
            r1 = 527(0x20f, float:7.38E-43)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.net.Proxy r0 = r2.proxy
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.net.InetSocketAddress r0 = r2.inetSocketAddress
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.net.Proxy proxy() {
            r1 = this;
            java.net.Proxy r0 = r1.proxy
            return r0
    }

    public boolean requiresTunnel() {
            r2 = this;
            okhttp3.Address r0 = r2.address
            javax.net.ssl.SSLSocketFactory r0 = r0.sslSocketFactory
            if (r0 == 0) goto L12
            java.net.Proxy r0 = r2.proxy
            java.net.Proxy$Type r0 = r0.type()
            java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP
            if (r0 != r1) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    public java.net.InetSocketAddress socketAddress() {
            r1 = this;
            java.net.InetSocketAddress r0 = r1.inetSocketAddress
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Route{"
            r0.<init>(r1)
            java.net.InetSocketAddress r1 = r2.inetSocketAddress
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "}"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
