package okhttp3.internal.platform;

/* loaded from: classes.dex */
class Android10Platform extends okhttp3.internal.platform.AndroidPlatform {
    Android10Platform(java.lang.Class<?> r8) {
            r7 = this;
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @javax.annotation.Nullable
    public static okhttp3.internal.platform.Platform buildIfSupported() {
            boolean r0 = okhttp3.internal.platform.Platform.isAndroid()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = getSdkInt()     // Catch: java.lang.ReflectiveOperationException -> L1c
            r2 = 29
            if (r0 < r2) goto L1c
            java.lang.String r0 = "com.android.org.conscrypt.SSLParametersImpl"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ReflectiveOperationException -> L1c
            okhttp3.internal.platform.Android10Platform r2 = new okhttp3.internal.platform.Android10Platform     // Catch: java.lang.ReflectiveOperationException -> L1c
            r2.<init>(r0)     // Catch: java.lang.ReflectiveOperationException -> L1c
            return r2
        L1c:
            return r1
    }

    private void enableSessionTickets(javax.net.ssl.SSLSocket r2) {
            r1 = this;
            boolean r0 = android.net.ssl.SSLSockets.isSupportedSocket(r2)
            if (r0 == 0) goto La
            r0 = 1
            android.net.ssl.SSLSockets.setUseSessionTickets(r2, r0)
        La:
            return
    }

    @Override // okhttp3.internal.platform.AndroidPlatform, okhttp3.internal.platform.Platform
    public void configureTlsExtensions(javax.net.ssl.SSLSocket r2, java.lang.String r3, java.util.List<okhttp3.Protocol> r4) throws java.io.IOException {
            r1 = this;
            r1.enableSessionTickets(r2)     // Catch: java.lang.IllegalArgumentException -> L1b
            javax.net.ssl.SSLParameters r3 = r2.getSSLParameters()     // Catch: java.lang.IllegalArgumentException -> L1b
            java.util.List r4 = okhttp3.internal.platform.Platform.alpnProtocolNames(r4)     // Catch: java.lang.IllegalArgumentException -> L1b
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.IllegalArgumentException -> L1b
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch: java.lang.IllegalArgumentException -> L1b
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch: java.lang.IllegalArgumentException -> L1b
            r3.setApplicationProtocols(r4)     // Catch: java.lang.IllegalArgumentException -> L1b
            r2.setSSLParameters(r3)     // Catch: java.lang.IllegalArgumentException -> L1b
            return
        L1b:
            r2 = move-exception
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "Android internal error"
            r3.<init>(r4, r2)
            throw r3
    }

    @Override // okhttp3.internal.platform.AndroidPlatform, okhttp3.internal.platform.Platform
    @javax.annotation.Nullable
    public java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket r2) {
            r1 = this;
            java.lang.String r2 = r2.getApplicationProtocol()
            if (r2 == 0) goto Le
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Ld
            goto Le
        Ld:
            return r2
        Le:
            r2 = 0
            return r2
    }
}
