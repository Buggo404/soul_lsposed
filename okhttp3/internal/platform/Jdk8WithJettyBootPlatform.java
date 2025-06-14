package okhttp3.internal.platform;

/* loaded from: classes.dex */
class Jdk8WithJettyBootPlatform extends okhttp3.internal.platform.Platform {
    private final java.lang.Class<?> clientProviderClass;
    private final java.lang.reflect.Method getMethod;
    private final java.lang.reflect.Method putMethod;
    private final java.lang.reflect.Method removeMethod;
    private final java.lang.Class<?> serverProviderClass;

    private static class AlpnProvider implements java.lang.reflect.InvocationHandler {
        private final java.util.List<java.lang.String> protocols;
        java.lang.String selected;
        boolean unsupported;

        AlpnProvider(java.util.List<java.lang.String> r1) {
                r0 = this;
                r0.<init>()
                r0.protocols = r1
                return
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object r6, java.lang.reflect.Method r7, java.lang.Object[] r8) throws java.lang.Throwable {
                r5 = this;
                java.lang.String r6 = r7.getName()
                java.lang.Class r0 = r7.getReturnType()
                if (r8 != 0) goto Lc
                java.lang.String[] r8 = okhttp3.internal.Util.EMPTY_STRING_ARRAY
            Lc:
                java.lang.String r1 = "supports"
                boolean r1 = r6.equals(r1)
                r2 = 1
                if (r1 == 0) goto L1e
                java.lang.Class r1 = java.lang.Boolean.TYPE
                if (r1 != r0) goto L1e
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
                return r6
            L1e:
                java.lang.String r1 = "unsupported"
                boolean r1 = r6.equals(r1)
                r3 = 0
                if (r1 == 0) goto L2e
                java.lang.Class r1 = java.lang.Void.TYPE
                if (r1 != r0) goto L2e
                r5.unsupported = r2
                return r3
            L2e:
                java.lang.String r1 = "protocols"
                boolean r1 = r6.equals(r1)
                if (r1 == 0) goto L3c
                int r1 = r8.length
                if (r1 != 0) goto L3c
                java.util.List<java.lang.String> r6 = r5.protocols
                return r6
            L3c:
                java.lang.String r1 = "selectProtocol"
                boolean r1 = r6.equals(r1)
                r4 = 0
                if (r1 != 0) goto L4d
                java.lang.String r1 = "select"
                boolean r1 = r6.equals(r1)
                if (r1 == 0) goto L82
            L4d:
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                if (r1 != r0) goto L82
                int r0 = r8.length
                if (r0 != r2) goto L82
                r0 = r8[r4]
                boolean r1 = r0 instanceof java.util.List
                if (r1 == 0) goto L82
                java.util.List r0 = (java.util.List) r0
                int r6 = r0.size()
                r7 = r4
            L61:
                if (r7 >= r6) goto L77
                java.lang.Object r8 = r0.get(r7)
                java.lang.String r8 = (java.lang.String) r8
                java.util.List<java.lang.String> r1 = r5.protocols
                boolean r1 = r1.contains(r8)
                if (r1 == 0) goto L74
                r5.selected = r8
                return r8
            L74:
                int r7 = r7 + 1
                goto L61
            L77:
                java.util.List<java.lang.String> r6 = r5.protocols
                java.lang.Object r6 = r6.get(r4)
                java.lang.String r6 = (java.lang.String) r6
                r5.selected = r6
                return r6
            L82:
                java.lang.String r0 = "protocolSelected"
                boolean r0 = r6.equals(r0)
                if (r0 != 0) goto L92
                java.lang.String r0 = "selected"
                boolean r6 = r6.equals(r0)
                if (r6 == 0) goto L9c
            L92:
                int r6 = r8.length
                if (r6 != r2) goto L9c
                r6 = r8[r4]
                java.lang.String r6 = (java.lang.String) r6
                r5.selected = r6
                return r3
            L9c:
                java.lang.Object r6 = r7.invoke(r5, r8)
                return r6
        }
    }

    Jdk8WithJettyBootPlatform(java.lang.reflect.Method r1, java.lang.reflect.Method r2, java.lang.reflect.Method r3, java.lang.Class<?> r4, java.lang.Class<?> r5) {
            r0 = this;
            r0.<init>()
            r0.putMethod = r1
            r0.getMethod = r2
            r0.removeMethod = r3
            r0.clientProviderClass = r4
            r0.serverProviderClass = r5
            return
    }

    public static okhttp3.internal.platform.Platform buildIfSupported() {
            r0 = 0
            java.lang.String r1 = "org.eclipse.jetty.alpn.ALPN"
            r2 = 1
            java.lang.Class r1 = java.lang.Class.forName(r1, r2, r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r3 = "org.eclipse.jetty.alpn.ALPN$Provider"
            java.lang.Class r3 = java.lang.Class.forName(r3, r2, r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r4 = "org.eclipse.jetty.alpn.ALPN$ClientProvider"
            java.lang.Class r9 = java.lang.Class.forName(r4, r2, r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r4 = "org.eclipse.jetty.alpn.ALPN$ServerProvider"
            java.lang.Class r10 = java.lang.Class.forName(r4, r2, r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r4 = "put"
            r5 = 2
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L4a
            java.lang.Class<javax.net.ssl.SSLSocket> r6 = javax.net.ssl.SSLSocket.class
            r7 = 0
            r5[r7] = r6     // Catch: java.lang.Throwable -> L4a
            r5[r2] = r3     // Catch: java.lang.Throwable -> L4a
            java.lang.reflect.Method r6 = r1.getMethod(r4, r5)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r3 = "get"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L4a
            java.lang.Class<javax.net.ssl.SSLSocket> r5 = javax.net.ssl.SSLSocket.class
            r4[r7] = r5     // Catch: java.lang.Throwable -> L4a
            java.lang.reflect.Method r3 = r1.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r4 = "remove"
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L4a
            java.lang.Class<javax.net.ssl.SSLSocket> r5 = javax.net.ssl.SSLSocket.class
            r2[r7] = r5     // Catch: java.lang.Throwable -> L4a
            java.lang.reflect.Method r8 = r1.getMethod(r4, r2)     // Catch: java.lang.Throwable -> L4a
            okhttp3.internal.platform.Jdk8WithJettyBootPlatform r1 = new okhttp3.internal.platform.Jdk8WithJettyBootPlatform     // Catch: java.lang.Throwable -> L4a
            r5 = r1
            r7 = r3
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L4a
            return r1
        L4a:
            return r0
    }

    @Override // okhttp3.internal.platform.Platform
    public void afterHandshake(javax.net.ssl.SSLSocket r4) {
            r3 = this;
            java.lang.reflect.Method r0 = r3.removeMethod     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.IllegalAccessException -> Lf
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.IllegalAccessException -> Lf
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.IllegalAccessException -> Lf
            r4 = 0
            r0.invoke(r4, r1)     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.IllegalAccessException -> Lf
            return
        Ld:
            r4 = move-exception
            goto L10
        Lf:
            r4 = move-exception
        L10:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "failed to remove ALPN"
            r0.<init>(r1, r4)
            throw r0
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(javax.net.ssl.SSLSocket r6, java.lang.String r7, java.util.List<okhttp3.Protocol> r8) {
            r5 = this;
            java.util.List r7 = alpnProtocolNames(r8)
            java.lang.Class<okhttp3.internal.platform.Platform> r8 = okhttp3.internal.platform.Platform.class
            java.lang.ClassLoader r8 = r8.getClassLoader()     // Catch: java.lang.IllegalAccessException -> L2d java.lang.reflect.InvocationTargetException -> L2f
            r0 = 2
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch: java.lang.IllegalAccessException -> L2d java.lang.reflect.InvocationTargetException -> L2f
            java.lang.Class<?> r2 = r5.clientProviderClass     // Catch: java.lang.IllegalAccessException -> L2d java.lang.reflect.InvocationTargetException -> L2f
            r3 = 0
            r1[r3] = r2     // Catch: java.lang.IllegalAccessException -> L2d java.lang.reflect.InvocationTargetException -> L2f
            java.lang.Class<?> r2 = r5.serverProviderClass     // Catch: java.lang.IllegalAccessException -> L2d java.lang.reflect.InvocationTargetException -> L2f
            r4 = 1
            r1[r4] = r2     // Catch: java.lang.IllegalAccessException -> L2d java.lang.reflect.InvocationTargetException -> L2f
            okhttp3.internal.platform.Jdk8WithJettyBootPlatform$AlpnProvider r2 = new okhttp3.internal.platform.Jdk8WithJettyBootPlatform$AlpnProvider     // Catch: java.lang.IllegalAccessException -> L2d java.lang.reflect.InvocationTargetException -> L2f
            r2.<init>(r7)     // Catch: java.lang.IllegalAccessException -> L2d java.lang.reflect.InvocationTargetException -> L2f
            java.lang.Object r7 = java.lang.reflect.Proxy.newProxyInstance(r8, r1, r2)     // Catch: java.lang.IllegalAccessException -> L2d java.lang.reflect.InvocationTargetException -> L2f
            java.lang.reflect.Method r8 = r5.putMethod     // Catch: java.lang.IllegalAccessException -> L2d java.lang.reflect.InvocationTargetException -> L2f
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.IllegalAccessException -> L2d java.lang.reflect.InvocationTargetException -> L2f
            r0[r3] = r6     // Catch: java.lang.IllegalAccessException -> L2d java.lang.reflect.InvocationTargetException -> L2f
            r0[r4] = r7     // Catch: java.lang.IllegalAccessException -> L2d java.lang.reflect.InvocationTargetException -> L2f
            r6 = 0
            r8.invoke(r6, r0)     // Catch: java.lang.IllegalAccessException -> L2d java.lang.reflect.InvocationTargetException -> L2f
            return
        L2d:
            r6 = move-exception
            goto L30
        L2f:
            r6 = move-exception
        L30:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.String r8 = "failed to set ALPN"
            r7.<init>(r8, r6)
            throw r7
    }

    @Override // okhttp3.internal.platform.Platform
    @javax.annotation.Nullable
    public java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket r4) {
            r3 = this;
            java.lang.reflect.Method r0 = r3.getMethod     // Catch: java.lang.IllegalAccessException -> L2e java.lang.reflect.InvocationTargetException -> L30
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.IllegalAccessException -> L2e java.lang.reflect.InvocationTargetException -> L30
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.IllegalAccessException -> L2e java.lang.reflect.InvocationTargetException -> L30
            r4 = 0
            java.lang.Object r0 = r0.invoke(r4, r1)     // Catch: java.lang.IllegalAccessException -> L2e java.lang.reflect.InvocationTargetException -> L30
            java.lang.reflect.InvocationHandler r0 = java.lang.reflect.Proxy.getInvocationHandler(r0)     // Catch: java.lang.IllegalAccessException -> L2e java.lang.reflect.InvocationTargetException -> L30
            okhttp3.internal.platform.Jdk8WithJettyBootPlatform$AlpnProvider r0 = (okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider) r0     // Catch: java.lang.IllegalAccessException -> L2e java.lang.reflect.InvocationTargetException -> L30
            boolean r1 = r0.unsupported     // Catch: java.lang.IllegalAccessException -> L2e java.lang.reflect.InvocationTargetException -> L30
            if (r1 != 0) goto L26
            java.lang.String r1 = r0.selected     // Catch: java.lang.IllegalAccessException -> L2e java.lang.reflect.InvocationTargetException -> L30
            if (r1 != 0) goto L26
            okhttp3.internal.platform.Platform r0 = okhttp3.internal.platform.Platform.get()     // Catch: java.lang.IllegalAccessException -> L2e java.lang.reflect.InvocationTargetException -> L30
            java.lang.String r1 = "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?"
            r2 = 4
            r0.log(r2, r1, r4)     // Catch: java.lang.IllegalAccessException -> L2e java.lang.reflect.InvocationTargetException -> L30
            return r4
        L26:
            boolean r1 = r0.unsupported     // Catch: java.lang.IllegalAccessException -> L2e java.lang.reflect.InvocationTargetException -> L30
            if (r1 == 0) goto L2b
            goto L2d
        L2b:
            java.lang.String r4 = r0.selected     // Catch: java.lang.IllegalAccessException -> L2e java.lang.reflect.InvocationTargetException -> L30
        L2d:
            return r4
        L2e:
            r4 = move-exception
            goto L31
        L30:
            r4 = move-exception
        L31:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "failed to get ALPN selected protocol"
            r0.<init>(r1, r4)
            throw r0
    }
}
