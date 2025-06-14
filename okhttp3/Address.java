package okhttp3;

/* loaded from: classes.dex */
public final class Address {

    @javax.annotation.Nullable
    final okhttp3.CertificatePinner certificatePinner;
    final java.util.List<okhttp3.ConnectionSpec> connectionSpecs;
    final okhttp3.Dns dns;

    @javax.annotation.Nullable
    final javax.net.ssl.HostnameVerifier hostnameVerifier;
    final java.util.List<okhttp3.Protocol> protocols;

    @javax.annotation.Nullable
    final java.net.Proxy proxy;
    final okhttp3.Authenticator proxyAuthenticator;
    final java.net.ProxySelector proxySelector;
    final javax.net.SocketFactory socketFactory;

    @javax.annotation.Nullable
    final javax.net.ssl.SSLSocketFactory sslSocketFactory;
    final okhttp3.HttpUrl url;

    public Address(java.lang.String r3, int r4, okhttp3.Dns r5, javax.net.SocketFactory r6, @javax.annotation.Nullable javax.net.ssl.SSLSocketFactory r7, @javax.annotation.Nullable javax.net.ssl.HostnameVerifier r8, @javax.annotation.Nullable okhttp3.CertificatePinner r9, okhttp3.Authenticator r10, @javax.annotation.Nullable java.net.Proxy r11, java.util.List<okhttp3.Protocol> r12, java.util.List<okhttp3.ConnectionSpec> r13, java.net.ProxySelector r14) {
            r2 = this;
            r2.<init>()
            okhttp3.HttpUrl$Builder r0 = new okhttp3.HttpUrl$Builder
            r0.<init>()
            if (r7 == 0) goto Ld
            java.lang.String r1 = "https"
            goto Lf
        Ld:
            java.lang.String r1 = "http"
        Lf:
            okhttp3.HttpUrl$Builder r0 = r0.scheme(r1)
            okhttp3.HttpUrl$Builder r3 = r0.host(r3)
            okhttp3.HttpUrl$Builder r3 = r3.port(r4)
            okhttp3.HttpUrl r3 = r3.build()
            r2.url = r3
            if (r5 == 0) goto L72
            r2.dns = r5
            if (r6 == 0) goto L6a
            r2.socketFactory = r6
            if (r10 == 0) goto L62
            r2.proxyAuthenticator = r10
            if (r12 == 0) goto L5a
            java.util.List r3 = okhttp3.internal.Util.immutableList(r12)
            r2.protocols = r3
            if (r13 == 0) goto L52
            java.util.List r3 = okhttp3.internal.Util.immutableList(r13)
            r2.connectionSpecs = r3
            if (r14 == 0) goto L4a
            r2.proxySelector = r14
            r2.proxy = r11
            r2.sslSocketFactory = r7
            r2.hostnameVerifier = r8
            r2.certificatePinner = r9
            return
        L4a:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "proxySelector == null"
            r3.<init>(r4)
            throw r3
        L52:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "connectionSpecs == null"
            r3.<init>(r4)
            throw r3
        L5a:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "protocols == null"
            r3.<init>(r4)
            throw r3
        L62:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "proxyAuthenticator == null"
            r3.<init>(r4)
            throw r3
        L6a:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "socketFactory == null"
            r3.<init>(r4)
            throw r3
        L72:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "dns == null"
            r3.<init>(r4)
            throw r3
    }

    @javax.annotation.Nullable
    public okhttp3.CertificatePinner certificatePinner() {
            r1 = this;
            okhttp3.CertificatePinner r0 = r1.certificatePinner
            return r0
    }

    public java.util.List<okhttp3.ConnectionSpec> connectionSpecs() {
            r1 = this;
            java.util.List<okhttp3.ConnectionSpec> r0 = r1.connectionSpecs
            return r0
    }

    public okhttp3.Dns dns() {
            r1 = this;
            okhttp3.Dns r0 = r1.dns
            return r0
    }

    public boolean equals(@javax.annotation.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof okhttp3.Address
            if (r0 == 0) goto L18
            okhttp3.HttpUrl r0 = r2.url
            okhttp3.Address r3 = (okhttp3.Address) r3
            okhttp3.HttpUrl r1 = r3.url
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L18
            boolean r3 = r2.equalsNonHost(r3)
            if (r3 == 0) goto L18
            r3 = 1
            goto L19
        L18:
            r3 = 0
        L19:
            return r3
    }

    boolean equalsNonHost(okhttp3.Address r3) {
            r2 = this;
            okhttp3.Dns r0 = r2.dns
            okhttp3.Dns r1 = r3.dns
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6e
            okhttp3.Authenticator r0 = r2.proxyAuthenticator
            okhttp3.Authenticator r1 = r3.proxyAuthenticator
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6e
            java.util.List<okhttp3.Protocol> r0 = r2.protocols
            java.util.List<okhttp3.Protocol> r1 = r3.protocols
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6e
            java.util.List<okhttp3.ConnectionSpec> r0 = r2.connectionSpecs
            java.util.List<okhttp3.ConnectionSpec> r1 = r3.connectionSpecs
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6e
            java.net.ProxySelector r0 = r2.proxySelector
            java.net.ProxySelector r1 = r3.proxySelector
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6e
            java.net.Proxy r0 = r2.proxy
            java.net.Proxy r1 = r3.proxy
            boolean r0 = java.util.Objects.equals(r0, r1)
            if (r0 == 0) goto L6e
            javax.net.ssl.SSLSocketFactory r0 = r2.sslSocketFactory
            javax.net.ssl.SSLSocketFactory r1 = r3.sslSocketFactory
            boolean r0 = java.util.Objects.equals(r0, r1)
            if (r0 == 0) goto L6e
            javax.net.ssl.HostnameVerifier r0 = r2.hostnameVerifier
            javax.net.ssl.HostnameVerifier r1 = r3.hostnameVerifier
            boolean r0 = java.util.Objects.equals(r0, r1)
            if (r0 == 0) goto L6e
            okhttp3.CertificatePinner r0 = r2.certificatePinner
            okhttp3.CertificatePinner r1 = r3.certificatePinner
            boolean r0 = java.util.Objects.equals(r0, r1)
            if (r0 == 0) goto L6e
            okhttp3.HttpUrl r0 = r2.url()
            int r0 = r0.port()
            okhttp3.HttpUrl r3 = r3.url()
            int r3 = r3.port()
            if (r0 != r3) goto L6e
            r3 = 1
            goto L6f
        L6e:
            r3 = 0
        L6f:
            return r3
    }

    public int hashCode() {
            r2 = this;
            okhttp3.HttpUrl r0 = r2.url
            int r0 = r0.hashCode()
            r1 = 527(0x20f, float:7.38E-43)
            int r1 = r1 + r0
            int r1 = r1 * 31
            okhttp3.Dns r0 = r2.dns
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            okhttp3.Authenticator r0 = r2.proxyAuthenticator
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.List<okhttp3.Protocol> r0 = r2.protocols
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.List<okhttp3.ConnectionSpec> r0 = r2.connectionSpecs
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.net.ProxySelector r0 = r2.proxySelector
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.net.Proxy r0 = r2.proxy
            int r0 = java.util.Objects.hashCode(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            javax.net.ssl.SSLSocketFactory r0 = r2.sslSocketFactory
            int r0 = java.util.Objects.hashCode(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            javax.net.ssl.HostnameVerifier r0 = r2.hostnameVerifier
            int r0 = java.util.Objects.hashCode(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            okhttp3.CertificatePinner r0 = r2.certificatePinner
            int r0 = java.util.Objects.hashCode(r0)
            int r1 = r1 + r0
            return r1
    }

    @javax.annotation.Nullable
    public javax.net.ssl.HostnameVerifier hostnameVerifier() {
            r1 = this;
            javax.net.ssl.HostnameVerifier r0 = r1.hostnameVerifier
            return r0
    }

    public java.util.List<okhttp3.Protocol> protocols() {
            r1 = this;
            java.util.List<okhttp3.Protocol> r0 = r1.protocols
            return r0
    }

    @javax.annotation.Nullable
    public java.net.Proxy proxy() {
            r1 = this;
            java.net.Proxy r0 = r1.proxy
            return r0
    }

    public okhttp3.Authenticator proxyAuthenticator() {
            r1 = this;
            okhttp3.Authenticator r0 = r1.proxyAuthenticator
            return r0
    }

    public java.net.ProxySelector proxySelector() {
            r1 = this;
            java.net.ProxySelector r0 = r1.proxySelector
            return r0
    }

    public javax.net.SocketFactory socketFactory() {
            r1 = this;
            javax.net.SocketFactory r0 = r1.socketFactory
            return r0
    }

    @javax.annotation.Nullable
    public javax.net.ssl.SSLSocketFactory sslSocketFactory() {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.sslSocketFactory
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Address{"
            r0.<init>(r1)
            okhttp3.HttpUrl r1 = r3.url
            java.lang.String r1 = r1.host()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ":"
            java.lang.StringBuilder r0 = r0.append(r1)
            okhttp3.HttpUrl r1 = r3.url
            int r1 = r1.port()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.net.Proxy r1 = r3.proxy
            if (r1 == 0) goto L31
            java.lang.String r1 = ", proxy="
            java.lang.StringBuilder r1 = r0.append(r1)
            java.net.Proxy r2 = r3.proxy
            r1.append(r2)
            goto L3c
        L31:
            java.lang.String r1 = ", proxySelector="
            java.lang.StringBuilder r1 = r0.append(r1)
            java.net.ProxySelector r2 = r3.proxySelector
            r1.append(r2)
        L3c:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public okhttp3.HttpUrl url() {
            r1 = this;
            okhttp3.HttpUrl r0 = r1.url
            return r0
    }
}
