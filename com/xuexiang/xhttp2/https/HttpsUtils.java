package com.xuexiang.xhttp2.https;

/* loaded from: classes.dex */
public class HttpsUtils {

    /* renamed from: com.xuexiang.xhttp2.https.HttpsUtils$1 */
    static /* synthetic */ class C09271 {
    }

    private static class MyTrustManager implements javax.net.ssl.X509TrustManager {
        private javax.net.ssl.X509TrustManager defaultTrustManager;
        private javax.net.ssl.X509TrustManager localTrustManager;

        public MyTrustManager(javax.net.ssl.X509TrustManager r4) throws java.security.NoSuchAlgorithmException, java.security.KeyStoreException {
                r3 = this;
                r3.<init>()
                java.lang.String r0 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()
                javax.net.ssl.TrustManagerFactory r0 = javax.net.ssl.TrustManagerFactory.getInstance(r0)
                r1 = 0
                r2 = r1
                java.security.KeyStore r2 = (java.security.KeyStore) r2
                r0.init(r1)
                javax.net.ssl.TrustManager[] r0 = r0.getTrustManagers()
                javax.net.ssl.X509TrustManager r0 = com.xuexiang.xhttp2.https.HttpsUtils.access$100(r0)
                r3.defaultTrustManager = r0
                r3.localTrustManager = r4
                return
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(java.security.cert.X509Certificate[] r1, java.lang.String r2) throws java.security.cert.CertificateException {
                r0 = this;
                return
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(java.security.cert.X509Certificate[] r2, java.lang.String r3) throws java.security.cert.CertificateException {
                r1 = this;
                javax.net.ssl.X509TrustManager r0 = r1.defaultTrustManager     // Catch: java.security.cert.CertificateException -> L6
                r0.checkServerTrusted(r2, r3)     // Catch: java.security.cert.CertificateException -> L6
                goto Lb
            L6:
                javax.net.ssl.X509TrustManager r0 = r1.localTrustManager
                r0.checkServerTrusted(r2, r3)
            Lb:
                return
        }

        @Override // javax.net.ssl.X509TrustManager
        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                r1 = this;
                r0 = 0
                java.security.cert.X509Certificate[] r0 = new java.security.cert.X509Certificate[r0]
                return r0
        }
    }

    public static class SSLParams {
        public javax.net.ssl.SSLSocketFactory sSLSocketFactory;
        public javax.net.ssl.X509TrustManager trustManager;

        public SSLParams() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    private static class UnSafeTrustManager implements javax.net.ssl.X509TrustManager {
        private UnSafeTrustManager() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ UnSafeTrustManager(com.xuexiang.xhttp2.https.HttpsUtils.C09271 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(java.security.cert.X509Certificate[] r1, java.lang.String r2) throws java.security.cert.CertificateException {
                r0 = this;
                return
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(java.security.cert.X509Certificate[] r1, java.lang.String r2) throws java.security.cert.CertificateException {
                r0 = this;
                return
        }

        @Override // javax.net.ssl.X509TrustManager
        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                r1 = this;
                r0 = 0
                java.security.cert.X509Certificate[] r0 = new java.security.cert.X509Certificate[r0]
                return r0
        }
    }

    public HttpsUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ javax.net.ssl.X509TrustManager access$100(javax.net.ssl.TrustManager[] r0) {
            javax.net.ssl.X509TrustManager r0 = chooseTrustManager(r0)
            return r0
    }

    private static javax.net.ssl.X509TrustManager chooseTrustManager(javax.net.ssl.TrustManager[] r4) {
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L10
            r2 = r4[r1]
            boolean r3 = r2 instanceof javax.net.ssl.X509TrustManager
            if (r3 == 0) goto Ld
            javax.net.ssl.X509TrustManager r2 = (javax.net.ssl.X509TrustManager) r2
            return r2
        Ld:
            int r1 = r1 + 1
            goto L2
        L10:
            r4 = 0
            return r4
    }

    public static com.xuexiang.xhttp2.https.HttpsUtils.SSLParams getSslSocketFactory(java.io.InputStream r4, java.lang.String r5, java.io.InputStream[] r6) {
            com.xuexiang.xhttp2.https.HttpsUtils$SSLParams r0 = new com.xuexiang.xhttp2.https.HttpsUtils$SSLParams
            r0.<init>()
            javax.net.ssl.KeyManager[] r4 = prepareKeyManager(r4, r5)     // Catch: java.security.KeyStoreException -> L37 java.security.KeyManagementException -> L3e java.security.NoSuchAlgorithmException -> L45
            javax.net.ssl.TrustManager[] r5 = prepareTrustManager(r6)     // Catch: java.security.KeyStoreException -> L37 java.security.KeyManagementException -> L3e java.security.NoSuchAlgorithmException -> L45
            java.lang.String r6 = "TLS"
            javax.net.ssl.SSLContext r6 = javax.net.ssl.SSLContext.getInstance(r6)     // Catch: java.security.KeyStoreException -> L37 java.security.KeyManagementException -> L3e java.security.NoSuchAlgorithmException -> L45
            r1 = 0
            if (r5 == 0) goto L20
            com.xuexiang.xhttp2.https.HttpsUtils$MyTrustManager r2 = new com.xuexiang.xhttp2.https.HttpsUtils$MyTrustManager     // Catch: java.security.KeyStoreException -> L37 java.security.KeyManagementException -> L3e java.security.NoSuchAlgorithmException -> L45
            javax.net.ssl.X509TrustManager r5 = chooseTrustManager(r5)     // Catch: java.security.KeyStoreException -> L37 java.security.KeyManagementException -> L3e java.security.NoSuchAlgorithmException -> L45
            r2.<init>(r5)     // Catch: java.security.KeyStoreException -> L37 java.security.KeyManagementException -> L3e java.security.NoSuchAlgorithmException -> L45
            goto L25
        L20:
            com.xuexiang.xhttp2.https.HttpsUtils$UnSafeTrustManager r2 = new com.xuexiang.xhttp2.https.HttpsUtils$UnSafeTrustManager     // Catch: java.security.KeyStoreException -> L37 java.security.KeyManagementException -> L3e java.security.NoSuchAlgorithmException -> L45
            r2.<init>(r1)     // Catch: java.security.KeyStoreException -> L37 java.security.KeyManagementException -> L3e java.security.NoSuchAlgorithmException -> L45
        L25:
            r5 = 1
            javax.net.ssl.TrustManager[] r5 = new javax.net.ssl.TrustManager[r5]     // Catch: java.security.KeyStoreException -> L37 java.security.KeyManagementException -> L3e java.security.NoSuchAlgorithmException -> L45
            r3 = 0
            r5[r3] = r2     // Catch: java.security.KeyStoreException -> L37 java.security.KeyManagementException -> L3e java.security.NoSuchAlgorithmException -> L45
            r6.init(r4, r5, r1)     // Catch: java.security.KeyStoreException -> L37 java.security.KeyManagementException -> L3e java.security.NoSuchAlgorithmException -> L45
            javax.net.ssl.SSLSocketFactory r4 = r6.getSocketFactory()     // Catch: java.security.KeyStoreException -> L37 java.security.KeyManagementException -> L3e java.security.NoSuchAlgorithmException -> L45
            r0.sSLSocketFactory = r4     // Catch: java.security.KeyStoreException -> L37 java.security.KeyManagementException -> L3e java.security.NoSuchAlgorithmException -> L45
            r0.trustManager = r2     // Catch: java.security.KeyStoreException -> L37 java.security.KeyManagementException -> L3e java.security.NoSuchAlgorithmException -> L45
            return r0
        L37:
            r4 = move-exception
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>(r4)
            throw r5
        L3e:
            r4 = move-exception
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>(r4)
            throw r5
        L45:
            r4 = move-exception
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>(r4)
            throw r5
    }

    private static javax.net.ssl.KeyManager[] prepareKeyManager(java.io.InputStream r3, java.lang.String r4) {
            r0 = 0
            if (r3 == 0) goto L44
            if (r4 != 0) goto L6
            goto L44
        L6:
            java.lang.String r1 = "BKS"
            java.security.KeyStore r1 = java.security.KeyStore.getInstance(r1)     // Catch: java.lang.Exception -> L27 java.io.IOException -> L2c java.security.cert.CertificateException -> L31 java.security.UnrecoverableKeyException -> L36 java.security.NoSuchAlgorithmException -> L3b java.security.KeyStoreException -> L40
            char[] r2 = r4.toCharArray()     // Catch: java.lang.Exception -> L27 java.io.IOException -> L2c java.security.cert.CertificateException -> L31 java.security.UnrecoverableKeyException -> L36 java.security.NoSuchAlgorithmException -> L3b java.security.KeyStoreException -> L40
            r1.load(r3, r2)     // Catch: java.lang.Exception -> L27 java.io.IOException -> L2c java.security.cert.CertificateException -> L31 java.security.UnrecoverableKeyException -> L36 java.security.NoSuchAlgorithmException -> L3b java.security.KeyStoreException -> L40
            java.lang.String r3 = javax.net.ssl.KeyManagerFactory.getDefaultAlgorithm()     // Catch: java.lang.Exception -> L27 java.io.IOException -> L2c java.security.cert.CertificateException -> L31 java.security.UnrecoverableKeyException -> L36 java.security.NoSuchAlgorithmException -> L3b java.security.KeyStoreException -> L40
            javax.net.ssl.KeyManagerFactory r3 = javax.net.ssl.KeyManagerFactory.getInstance(r3)     // Catch: java.lang.Exception -> L27 java.io.IOException -> L2c java.security.cert.CertificateException -> L31 java.security.UnrecoverableKeyException -> L36 java.security.NoSuchAlgorithmException -> L3b java.security.KeyStoreException -> L40
            char[] r4 = r4.toCharArray()     // Catch: java.lang.Exception -> L27 java.io.IOException -> L2c java.security.cert.CertificateException -> L31 java.security.UnrecoverableKeyException -> L36 java.security.NoSuchAlgorithmException -> L3b java.security.KeyStoreException -> L40
            r3.init(r1, r4)     // Catch: java.lang.Exception -> L27 java.io.IOException -> L2c java.security.cert.CertificateException -> L31 java.security.UnrecoverableKeyException -> L36 java.security.NoSuchAlgorithmException -> L3b java.security.KeyStoreException -> L40
            javax.net.ssl.KeyManager[] r3 = r3.getKeyManagers()     // Catch: java.lang.Exception -> L27 java.io.IOException -> L2c java.security.cert.CertificateException -> L31 java.security.UnrecoverableKeyException -> L36 java.security.NoSuchAlgorithmException -> L3b java.security.KeyStoreException -> L40
            return r3
        L27:
            r3 = move-exception
            com.xuexiang.xhttp2.logs.HttpLog.m36e(r3)
            goto L44
        L2c:
            r3 = move-exception
            com.xuexiang.xhttp2.logs.HttpLog.m36e(r3)
            goto L44
        L31:
            r3 = move-exception
            com.xuexiang.xhttp2.logs.HttpLog.m36e(r3)
            goto L44
        L36:
            r3 = move-exception
            com.xuexiang.xhttp2.logs.HttpLog.m36e(r3)
            goto L44
        L3b:
            r3 = move-exception
            com.xuexiang.xhttp2.logs.HttpLog.m36e(r3)
            goto L44
        L40:
            r3 = move-exception
            com.xuexiang.xhttp2.logs.HttpLog.m36e(r3)
        L44:
            return r0
    }

    private static javax.net.ssl.TrustManager[] prepareTrustManager(java.io.InputStream... r9) {
            r0 = 0
            if (r9 == 0) goto L5d
            int r1 = r9.length
            if (r1 > 0) goto L7
            goto L5d
        L7:
            java.lang.String r1 = "X.509"
            java.security.cert.CertificateFactory r1 = java.security.cert.CertificateFactory.getInstance(r1)     // Catch: java.lang.Exception -> L4a java.security.KeyStoreException -> L4f java.security.cert.CertificateException -> L54 java.security.NoSuchAlgorithmException -> L59
            java.lang.String r2 = java.security.KeyStore.getDefaultType()     // Catch: java.lang.Exception -> L4a java.security.KeyStoreException -> L4f java.security.cert.CertificateException -> L54 java.security.NoSuchAlgorithmException -> L59
            java.security.KeyStore r2 = java.security.KeyStore.getInstance(r2)     // Catch: java.lang.Exception -> L4a java.security.KeyStoreException -> L4f java.security.cert.CertificateException -> L54 java.security.NoSuchAlgorithmException -> L59
            r2.load(r0)     // Catch: java.lang.Exception -> L4a java.security.KeyStoreException -> L4f java.security.cert.CertificateException -> L54 java.security.NoSuchAlgorithmException -> L59
            int r3 = r9.length     // Catch: java.lang.Exception -> L4a java.security.KeyStoreException -> L4f java.security.cert.CertificateException -> L54 java.security.NoSuchAlgorithmException -> L59
            r4 = 0
            r5 = r4
        L1b:
            if (r4 >= r3) goto L3a
            r6 = r9[r4]     // Catch: java.lang.Exception -> L4a java.security.KeyStoreException -> L4f java.security.cert.CertificateException -> L54 java.security.NoSuchAlgorithmException -> L59
            int r7 = r5 + 1
            java.lang.String r5 = java.lang.Integer.toString(r5)     // Catch: java.lang.Exception -> L4a java.security.KeyStoreException -> L4f java.security.cert.CertificateException -> L54 java.security.NoSuchAlgorithmException -> L59
            java.security.cert.Certificate r8 = r1.generateCertificate(r6)     // Catch: java.lang.Exception -> L4a java.security.KeyStoreException -> L4f java.security.cert.CertificateException -> L54 java.security.NoSuchAlgorithmException -> L59
            r2.setCertificateEntry(r5, r8)     // Catch: java.lang.Exception -> L4a java.security.KeyStoreException -> L4f java.security.cert.CertificateException -> L54 java.security.NoSuchAlgorithmException -> L59
            if (r6 == 0) goto L36
            r6.close()     // Catch: java.io.IOException -> L32 java.lang.Exception -> L4a java.security.KeyStoreException -> L4f java.security.cert.CertificateException -> L54 java.security.NoSuchAlgorithmException -> L59
            goto L36
        L32:
            r5 = move-exception
            com.xuexiang.xhttp2.logs.HttpLog.m36e(r5)     // Catch: java.lang.Exception -> L4a java.security.KeyStoreException -> L4f java.security.cert.CertificateException -> L54 java.security.NoSuchAlgorithmException -> L59
        L36:
            int r4 = r4 + 1
            r5 = r7
            goto L1b
        L3a:
            java.lang.String r9 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()     // Catch: java.lang.Exception -> L4a java.security.KeyStoreException -> L4f java.security.cert.CertificateException -> L54 java.security.NoSuchAlgorithmException -> L59
            javax.net.ssl.TrustManagerFactory r9 = javax.net.ssl.TrustManagerFactory.getInstance(r9)     // Catch: java.lang.Exception -> L4a java.security.KeyStoreException -> L4f java.security.cert.CertificateException -> L54 java.security.NoSuchAlgorithmException -> L59
            r9.init(r2)     // Catch: java.lang.Exception -> L4a java.security.KeyStoreException -> L4f java.security.cert.CertificateException -> L54 java.security.NoSuchAlgorithmException -> L59
            javax.net.ssl.TrustManager[] r9 = r9.getTrustManagers()     // Catch: java.lang.Exception -> L4a java.security.KeyStoreException -> L4f java.security.cert.CertificateException -> L54 java.security.NoSuchAlgorithmException -> L59
            return r9
        L4a:
            r9 = move-exception
            com.xuexiang.xhttp2.logs.HttpLog.m36e(r9)
            goto L5d
        L4f:
            r9 = move-exception
            com.xuexiang.xhttp2.logs.HttpLog.m36e(r9)
            goto L5d
        L54:
            r9 = move-exception
            com.xuexiang.xhttp2.logs.HttpLog.m36e(r9)
            goto L5d
        L59:
            r9 = move-exception
            com.xuexiang.xhttp2.logs.HttpLog.m36e(r9)
        L5d:
            return r0
    }
}
