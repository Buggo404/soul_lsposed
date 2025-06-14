package okhttp3.internal.platform;

/* loaded from: classes.dex */
final class Jdk9Platform extends okhttp3.internal.platform.Platform {
    final java.lang.reflect.Method getProtocolMethod;
    final java.lang.reflect.Method setProtocolMethod;

    Jdk9Platform(java.lang.reflect.Method r1, java.lang.reflect.Method r2) {
            r0 = this;
            r0.<init>()
            r0.setProtocolMethod = r1
            r0.getProtocolMethod = r2
            return
    }

    public static okhttp3.internal.platform.Jdk9Platform buildIfSupported() {
            java.lang.Class<javax.net.ssl.SSLParameters> r0 = javax.net.ssl.SSLParameters.class
            java.lang.String r1 = "setApplicationProtocols"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L20
            java.lang.Class<java.lang.String[]> r3 = java.lang.String[].class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.NoSuchMethodException -> L20
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L20
            java.lang.Class<javax.net.ssl.SSLSocket> r1 = javax.net.ssl.SSLSocket.class
            java.lang.String r2 = "getApplicationProtocol"
            java.lang.Class[] r3 = new java.lang.Class[r4]     // Catch: java.lang.NoSuchMethodException -> L20
            java.lang.reflect.Method r1 = r1.getMethod(r2, r3)     // Catch: java.lang.NoSuchMethodException -> L20
            okhttp3.internal.platform.Jdk9Platform r2 = new okhttp3.internal.platform.Jdk9Platform     // Catch: java.lang.NoSuchMethodException -> L20
            r2.<init>(r0, r1)     // Catch: java.lang.NoSuchMethodException -> L20
            return r2
        L20:
            r0 = 0
            return r0
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(javax.net.ssl.SSLSocket r4, java.lang.String r5, java.util.List<okhttp3.Protocol> r6) {
            r3 = this;
            javax.net.ssl.SSLParameters r5 = r4.getSSLParameters()     // Catch: java.lang.reflect.InvocationTargetException -> L21 java.lang.IllegalAccessException -> L23
            java.util.List r6 = alpnProtocolNames(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L21 java.lang.IllegalAccessException -> L23
            java.lang.reflect.Method r0 = r3.setProtocolMethod     // Catch: java.lang.reflect.InvocationTargetException -> L21 java.lang.IllegalAccessException -> L23
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L21 java.lang.IllegalAccessException -> L23
            int r2 = r6.size()     // Catch: java.lang.reflect.InvocationTargetException -> L21 java.lang.IllegalAccessException -> L23
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L21 java.lang.IllegalAccessException -> L23
            java.lang.Object[] r6 = r6.toArray(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L21 java.lang.IllegalAccessException -> L23
            r2 = 0
            r1[r2] = r6     // Catch: java.lang.reflect.InvocationTargetException -> L21 java.lang.IllegalAccessException -> L23
            r0.invoke(r5, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L21 java.lang.IllegalAccessException -> L23
            r4.setSSLParameters(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L21 java.lang.IllegalAccessException -> L23
            return
        L21:
            r4 = move-exception
            goto L24
        L23:
            r4 = move-exception
        L24:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            java.lang.String r6 = "failed to set SSL parameters"
            r5.<init>(r6, r4)
            throw r5
    }

    @Override // okhttp3.internal.platform.Platform
    @javax.annotation.Nullable
    public java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket r5) {
            r4 = this;
            java.lang.String r0 = "failed to get ALPN selected protocol"
            r1 = 0
            java.lang.reflect.Method r2 = r4.getProtocolMethod     // Catch: java.lang.IllegalAccessException -> L1b java.lang.reflect.InvocationTargetException -> L22
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.IllegalAccessException -> L1b java.lang.reflect.InvocationTargetException -> L22
            java.lang.Object r5 = r2.invoke(r5, r3)     // Catch: java.lang.IllegalAccessException -> L1b java.lang.reflect.InvocationTargetException -> L22
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.IllegalAccessException -> L1b java.lang.reflect.InvocationTargetException -> L22
            if (r5 == 0) goto L1a
            java.lang.String r2 = ""
            boolean r0 = r5.equals(r2)     // Catch: java.lang.IllegalAccessException -> L1b java.lang.reflect.InvocationTargetException -> L22
            if (r0 == 0) goto L19
            goto L1a
        L19:
            return r5
        L1a:
            return r1
        L1b:
            r5 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0, r5)
            throw r1
        L22:
            r5 = move-exception
            java.lang.Throwable r2 = r5.getCause()
            boolean r2 = r2 instanceof java.lang.UnsupportedOperationException
            if (r2 == 0) goto L2c
            return r1
        L2c:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0, r5)
            throw r1
    }

    @Override // okhttp3.internal.platform.Platform
    public javax.net.ssl.X509TrustManager trustManager(javax.net.ssl.SSLSocketFactory r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+"
            r2.<init>(r0)
            throw r2
    }
}
