package okhttp3.internal.connection;

/* loaded from: classes.dex */
final class ConnectionSpecSelector {
    private final java.util.List<okhttp3.ConnectionSpec> connectionSpecs;
    private boolean isFallback;
    private boolean isFallbackPossible;
    private int nextModeIndex;

    ConnectionSpecSelector(java.util.List<okhttp3.ConnectionSpec> r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.nextModeIndex = r0
            r1.connectionSpecs = r2
            return
    }

    private boolean isFallbackPossible(javax.net.ssl.SSLSocket r3) {
            r2 = this;
            int r0 = r2.nextModeIndex
        L2:
            java.util.List<okhttp3.ConnectionSpec> r1 = r2.connectionSpecs
            int r1 = r1.size()
            if (r0 >= r1) goto L1d
            java.util.List<okhttp3.ConnectionSpec> r1 = r2.connectionSpecs
            java.lang.Object r1 = r1.get(r0)
            okhttp3.ConnectionSpec r1 = (okhttp3.ConnectionSpec) r1
            boolean r1 = r1.isCompatible(r3)
            if (r1 == 0) goto L1a
            r3 = 1
            return r3
        L1a:
            int r0 = r0 + 1
            goto L2
        L1d:
            r3 = 0
            return r3
    }

    okhttp3.ConnectionSpec configureSecureSocket(javax.net.ssl.SSLSocket r5) throws java.io.IOException {
            r4 = this;
            int r0 = r4.nextModeIndex
            java.util.List<okhttp3.ConnectionSpec> r1 = r4.connectionSpecs
            int r1 = r1.size()
        L8:
            if (r0 >= r1) goto L20
            java.util.List<okhttp3.ConnectionSpec> r2 = r4.connectionSpecs
            java.lang.Object r2 = r2.get(r0)
            okhttp3.ConnectionSpec r2 = (okhttp3.ConnectionSpec) r2
            boolean r3 = r2.isCompatible(r5)
            if (r3 == 0) goto L1d
            int r0 = r0 + 1
            r4.nextModeIndex = r0
            goto L21
        L1d:
            int r0 = r0 + 1
            goto L8
        L20:
            r2 = 0
        L21:
            if (r2 == 0) goto L31
            boolean r0 = r4.isFallbackPossible(r5)
            r4.isFallbackPossible = r0
            okhttp3.internal.Internal r0 = okhttp3.internal.Internal.instance
            boolean r1 = r4.isFallback
            r0.apply(r2, r5, r1)
            return r2
        L31:
            java.net.UnknownServiceException r0 = new java.net.UnknownServiceException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to find acceptable protocols. isFallback="
            r1.<init>(r2)
            boolean r2 = r4.isFallback
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", modes="
            java.lang.StringBuilder r1 = r1.append(r2)
            java.util.List<okhttp3.ConnectionSpec> r2 = r4.connectionSpecs
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", supported protocols="
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String[] r5 = r5.getEnabledProtocols()
            java.lang.String r5 = java.util.Arrays.toString(r5)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
    }

    boolean connectionFailed(java.io.IOException r3) {
            r2 = this;
            r0 = 1
            r2.isFallback = r0
            boolean r0 = r2.isFallbackPossible
            r1 = 0
            if (r0 != 0) goto L9
            return r1
        L9:
            boolean r0 = r3 instanceof java.net.ProtocolException
            if (r0 == 0) goto Le
            return r1
        Le:
            boolean r0 = r3 instanceof java.io.InterruptedIOException
            if (r0 == 0) goto L13
            return r1
        L13:
            boolean r0 = r3 instanceof javax.net.ssl.SSLHandshakeException
            if (r0 == 0) goto L20
            java.lang.Throwable r0 = r3.getCause()
            boolean r0 = r0 instanceof java.security.cert.CertificateException
            if (r0 == 0) goto L20
            return r1
        L20:
            boolean r0 = r3 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r0 == 0) goto L25
            return r1
        L25:
            boolean r3 = r3 instanceof javax.net.ssl.SSLException
            return r3
    }
}
