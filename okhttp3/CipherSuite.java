package okhttp3;

/* loaded from: classes.dex */
public final class CipherSuite {
    private static final java.util.Map<java.lang.String, okhttp3.CipherSuite> INSTANCES = null;
    static final java.util.Comparator<java.lang.String> ORDER_BY_NAME = null;
    public static final okhttp3.CipherSuite TLS_AES_128_CCM_8_SHA256 = null;
    public static final okhttp3.CipherSuite TLS_AES_128_CCM_SHA256 = null;
    public static final okhttp3.CipherSuite TLS_AES_128_GCM_SHA256 = null;
    public static final okhttp3.CipherSuite TLS_AES_256_GCM_SHA384 = null;
    public static final okhttp3.CipherSuite TLS_CHACHA20_POLY1305_SHA256 = null;
    public static final okhttp3.CipherSuite TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_DHE_DSS_WITH_AES_128_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_DHE_DSS_WITH_AES_128_CBC_SHA256 = null;
    public static final okhttp3.CipherSuite TLS_DHE_DSS_WITH_AES_128_GCM_SHA256 = null;
    public static final okhttp3.CipherSuite TLS_DHE_DSS_WITH_AES_256_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_DHE_DSS_WITH_AES_256_CBC_SHA256 = null;
    public static final okhttp3.CipherSuite TLS_DHE_DSS_WITH_AES_256_GCM_SHA384 = null;
    public static final okhttp3.CipherSuite TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_DHE_DSS_WITH_DES_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_DHE_RSA_WITH_AES_128_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_DHE_RSA_WITH_AES_128_CBC_SHA256 = null;
    public static final okhttp3.CipherSuite TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 = null;
    public static final okhttp3.CipherSuite TLS_DHE_RSA_WITH_AES_256_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_DHE_RSA_WITH_AES_256_CBC_SHA256 = null;
    public static final okhttp3.CipherSuite TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 = null;
    public static final okhttp3.CipherSuite TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = null;
    public static final okhttp3.CipherSuite TLS_DHE_RSA_WITH_DES_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_DH_anon_EXPORT_WITH_RC4_40_MD5 = null;
    public static final okhttp3.CipherSuite TLS_DH_anon_WITH_3DES_EDE_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_DH_anon_WITH_AES_128_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_DH_anon_WITH_AES_128_CBC_SHA256 = null;
    public static final okhttp3.CipherSuite TLS_DH_anon_WITH_AES_128_GCM_SHA256 = null;
    public static final okhttp3.CipherSuite TLS_DH_anon_WITH_AES_256_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_DH_anon_WITH_AES_256_CBC_SHA256 = null;
    public static final okhttp3.CipherSuite TLS_DH_anon_WITH_AES_256_GCM_SHA384 = null;
    public static final okhttp3.CipherSuite TLS_DH_anon_WITH_DES_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_DH_anon_WITH_RC4_128_MD5 = null;
    public static final okhttp3.CipherSuite TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 = null;
    public static final okhttp3.CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 = null;
    public static final okhttp3.CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 = null;
    public static final okhttp3.CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 = null;
    public static final okhttp3.CipherSuite TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256 = null;
    public static final okhttp3.CipherSuite TLS_ECDHE_ECDSA_WITH_NULL_SHA = null;
    public static final okhttp3.CipherSuite TLS_ECDHE_ECDSA_WITH_RC4_128_SHA = null;
    public static final okhttp3.CipherSuite TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256 = null;
    public static final okhttp3.CipherSuite TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 = null;
    public static final okhttp3.CipherSuite TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 = null;
    public static final okhttp3.CipherSuite TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 = null;
    public static final okhttp3.CipherSuite TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 = null;
    public static final okhttp3.CipherSuite TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = null;
    public static final okhttp3.CipherSuite TLS_ECDHE_RSA_WITH_NULL_SHA = null;
    public static final okhttp3.CipherSuite TLS_ECDHE_RSA_WITH_RC4_128_SHA = null;
    public static final okhttp3.CipherSuite TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256 = null;
    public static final okhttp3.CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256 = null;
    public static final okhttp3.CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384 = null;
    public static final okhttp3.CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384 = null;
    public static final okhttp3.CipherSuite TLS_ECDH_ECDSA_WITH_NULL_SHA = null;
    public static final okhttp3.CipherSuite TLS_ECDH_ECDSA_WITH_RC4_128_SHA = null;
    public static final okhttp3.CipherSuite TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_ECDH_RSA_WITH_AES_128_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256 = null;
    public static final okhttp3.CipherSuite TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256 = null;
    public static final okhttp3.CipherSuite TLS_ECDH_RSA_WITH_AES_256_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384 = null;
    public static final okhttp3.CipherSuite TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384 = null;
    public static final okhttp3.CipherSuite TLS_ECDH_RSA_WITH_NULL_SHA = null;
    public static final okhttp3.CipherSuite TLS_ECDH_RSA_WITH_RC4_128_SHA = null;
    public static final okhttp3.CipherSuite TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_ECDH_anon_WITH_AES_128_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_ECDH_anon_WITH_AES_256_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_ECDH_anon_WITH_NULL_SHA = null;
    public static final okhttp3.CipherSuite TLS_ECDH_anon_WITH_RC4_128_SHA = null;
    public static final okhttp3.CipherSuite TLS_EMPTY_RENEGOTIATION_INFO_SCSV = null;
    public static final okhttp3.CipherSuite TLS_FALLBACK_SCSV = null;
    public static final okhttp3.CipherSuite TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5 = null;
    public static final okhttp3.CipherSuite TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA = null;
    public static final okhttp3.CipherSuite TLS_KRB5_EXPORT_WITH_RC4_40_MD5 = null;
    public static final okhttp3.CipherSuite TLS_KRB5_EXPORT_WITH_RC4_40_SHA = null;
    public static final okhttp3.CipherSuite TLS_KRB5_WITH_3DES_EDE_CBC_MD5 = null;
    public static final okhttp3.CipherSuite TLS_KRB5_WITH_3DES_EDE_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_KRB5_WITH_DES_CBC_MD5 = null;
    public static final okhttp3.CipherSuite TLS_KRB5_WITH_DES_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_KRB5_WITH_RC4_128_MD5 = null;
    public static final okhttp3.CipherSuite TLS_KRB5_WITH_RC4_128_SHA = null;
    public static final okhttp3.CipherSuite TLS_PSK_WITH_3DES_EDE_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_PSK_WITH_AES_128_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_PSK_WITH_AES_256_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_PSK_WITH_RC4_128_SHA = null;
    public static final okhttp3.CipherSuite TLS_RSA_EXPORT_WITH_DES40_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_RSA_EXPORT_WITH_RC4_40_MD5 = null;
    public static final okhttp3.CipherSuite TLS_RSA_WITH_3DES_EDE_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_RSA_WITH_AES_128_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_RSA_WITH_AES_128_CBC_SHA256 = null;
    public static final okhttp3.CipherSuite TLS_RSA_WITH_AES_128_GCM_SHA256 = null;
    public static final okhttp3.CipherSuite TLS_RSA_WITH_AES_256_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_RSA_WITH_AES_256_CBC_SHA256 = null;
    public static final okhttp3.CipherSuite TLS_RSA_WITH_AES_256_GCM_SHA384 = null;
    public static final okhttp3.CipherSuite TLS_RSA_WITH_CAMELLIA_128_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_RSA_WITH_CAMELLIA_256_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_RSA_WITH_DES_CBC_SHA = null;
    public static final okhttp3.CipherSuite TLS_RSA_WITH_NULL_MD5 = null;
    public static final okhttp3.CipherSuite TLS_RSA_WITH_NULL_SHA = null;
    public static final okhttp3.CipherSuite TLS_RSA_WITH_NULL_SHA256 = null;
    public static final okhttp3.CipherSuite TLS_RSA_WITH_RC4_128_MD5 = null;
    public static final okhttp3.CipherSuite TLS_RSA_WITH_RC4_128_SHA = null;
    public static final okhttp3.CipherSuite TLS_RSA_WITH_SEED_CBC_SHA = null;
    final java.lang.String javaName;

    static {
            okhttp3.CipherSuite$$ExternalSyntheticLambda0 r0 = new okhttp3.CipherSuite$$ExternalSyntheticLambda0
            r0.<init>()
            okhttp3.CipherSuite.ORDER_BY_NAME = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            okhttp3.CipherSuite.INSTANCES = r0
            java.lang.String r0 = "SSL_RSA_WITH_NULL_MD5"
            r1 = 1
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_RSA_WITH_NULL_MD5 = r0
            java.lang.String r0 = "SSL_RSA_WITH_NULL_SHA"
            r1 = 2
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_RSA_WITH_NULL_SHA = r0
            java.lang.String r0 = "SSL_RSA_EXPORT_WITH_RC4_40_MD5"
            r1 = 3
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_RSA_EXPORT_WITH_RC4_40_MD5 = r0
            java.lang.String r0 = "SSL_RSA_WITH_RC4_128_MD5"
            r1 = 4
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_RSA_WITH_RC4_128_MD5 = r0
            java.lang.String r0 = "SSL_RSA_WITH_RC4_128_SHA"
            r1 = 5
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_RSA_WITH_RC4_128_SHA = r0
            java.lang.String r0 = "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA"
            r1 = 8
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_RSA_EXPORT_WITH_DES40_CBC_SHA = r0
            java.lang.String r0 = "SSL_RSA_WITH_DES_CBC_SHA"
            r1 = 9
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_RSA_WITH_DES_CBC_SHA = r0
            java.lang.String r0 = "SSL_RSA_WITH_3DES_EDE_CBC_SHA"
            r1 = 10
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA = r0
            java.lang.String r0 = "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA"
            r1 = 17
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA = r0
            java.lang.String r0 = "SSL_DHE_DSS_WITH_DES_CBC_SHA"
            r1 = 18
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_DHE_DSS_WITH_DES_CBC_SHA = r0
            java.lang.String r0 = "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA"
            r1 = 19
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA = r0
            java.lang.String r0 = "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA"
            r1 = 20
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA = r0
            java.lang.String r0 = "SSL_DHE_RSA_WITH_DES_CBC_SHA"
            r1 = 21
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_DHE_RSA_WITH_DES_CBC_SHA = r0
            java.lang.String r0 = "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA"
            r1 = 22
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA = r0
            java.lang.String r0 = "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5"
            r1 = 23
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_DH_anon_EXPORT_WITH_RC4_40_MD5 = r0
            java.lang.String r0 = "SSL_DH_anon_WITH_RC4_128_MD5"
            r1 = 24
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_DH_anon_WITH_RC4_128_MD5 = r0
            java.lang.String r0 = "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA"
            r1 = 25
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA = r0
            java.lang.String r0 = "SSL_DH_anon_WITH_DES_CBC_SHA"
            r1 = 26
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_DH_anon_WITH_DES_CBC_SHA = r0
            java.lang.String r0 = "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA"
            r1 = 27
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_DH_anon_WITH_3DES_EDE_CBC_SHA = r0
            java.lang.String r0 = "TLS_KRB5_WITH_DES_CBC_SHA"
            r1 = 30
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_KRB5_WITH_DES_CBC_SHA = r0
            java.lang.String r0 = "TLS_KRB5_WITH_3DES_EDE_CBC_SHA"
            r1 = 31
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_KRB5_WITH_3DES_EDE_CBC_SHA = r0
            java.lang.String r0 = "TLS_KRB5_WITH_RC4_128_SHA"
            r1 = 32
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_KRB5_WITH_RC4_128_SHA = r0
            java.lang.String r0 = "TLS_KRB5_WITH_DES_CBC_MD5"
            r1 = 34
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_KRB5_WITH_DES_CBC_MD5 = r0
            java.lang.String r0 = "TLS_KRB5_WITH_3DES_EDE_CBC_MD5"
            r1 = 35
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_KRB5_WITH_3DES_EDE_CBC_MD5 = r0
            java.lang.String r0 = "TLS_KRB5_WITH_RC4_128_MD5"
            r1 = 36
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_KRB5_WITH_RC4_128_MD5 = r0
            java.lang.String r0 = "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA"
            r1 = 38
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA = r0
            java.lang.String r0 = "TLS_KRB5_EXPORT_WITH_RC4_40_SHA"
            r1 = 40
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_KRB5_EXPORT_WITH_RC4_40_SHA = r0
            java.lang.String r0 = "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5"
            r1 = 41
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5 = r0
            java.lang.String r0 = "TLS_KRB5_EXPORT_WITH_RC4_40_MD5"
            r1 = 43
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_KRB5_EXPORT_WITH_RC4_40_MD5 = r0
            java.lang.String r0 = "TLS_RSA_WITH_AES_128_CBC_SHA"
            r1 = 47
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA = r0
            java.lang.String r0 = "TLS_DHE_DSS_WITH_AES_128_CBC_SHA"
            r1 = 50
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_DHE_DSS_WITH_AES_128_CBC_SHA = r0
            java.lang.String r0 = "TLS_DHE_RSA_WITH_AES_128_CBC_SHA"
            r1 = 51
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_DHE_RSA_WITH_AES_128_CBC_SHA = r0
            java.lang.String r0 = "TLS_DH_anon_WITH_AES_128_CBC_SHA"
            r1 = 52
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_DH_anon_WITH_AES_128_CBC_SHA = r0
            java.lang.String r0 = "TLS_RSA_WITH_AES_256_CBC_SHA"
            r1 = 53
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA = r0
            java.lang.String r0 = "TLS_DHE_DSS_WITH_AES_256_CBC_SHA"
            r1 = 56
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_DHE_DSS_WITH_AES_256_CBC_SHA = r0
            java.lang.String r0 = "TLS_DHE_RSA_WITH_AES_256_CBC_SHA"
            r1 = 57
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_DHE_RSA_WITH_AES_256_CBC_SHA = r0
            java.lang.String r0 = "TLS_DH_anon_WITH_AES_256_CBC_SHA"
            r1 = 58
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_DH_anon_WITH_AES_256_CBC_SHA = r0
            java.lang.String r0 = "TLS_RSA_WITH_NULL_SHA256"
            r1 = 59
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_RSA_WITH_NULL_SHA256 = r0
            java.lang.String r0 = "TLS_RSA_WITH_AES_128_CBC_SHA256"
            r1 = 60
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA256 = r0
            java.lang.String r0 = "TLS_RSA_WITH_AES_256_CBC_SHA256"
            r1 = 61
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA256 = r0
            java.lang.String r0 = "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256"
            r1 = 64
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_DHE_DSS_WITH_AES_128_CBC_SHA256 = r0
            java.lang.String r0 = "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA"
            r1 = 65
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA = r0
            java.lang.String r0 = "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA"
            r1 = 68
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA = r0
            java.lang.String r0 = "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA"
            r1 = 69
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA = r0
            java.lang.String r0 = "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256"
            r1 = 103(0x67, float:1.44E-43)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_DHE_RSA_WITH_AES_128_CBC_SHA256 = r0
            java.lang.String r0 = "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256"
            r1 = 106(0x6a, float:1.49E-43)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_DHE_DSS_WITH_AES_256_CBC_SHA256 = r0
            java.lang.String r0 = "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256"
            r1 = 107(0x6b, float:1.5E-43)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_DHE_RSA_WITH_AES_256_CBC_SHA256 = r0
            java.lang.String r0 = "TLS_DH_anon_WITH_AES_128_CBC_SHA256"
            r1 = 108(0x6c, float:1.51E-43)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_DH_anon_WITH_AES_128_CBC_SHA256 = r0
            java.lang.String r0 = "TLS_DH_anon_WITH_AES_256_CBC_SHA256"
            r1 = 109(0x6d, float:1.53E-43)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_DH_anon_WITH_AES_256_CBC_SHA256 = r0
            java.lang.String r0 = "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA"
            r1 = 132(0x84, float:1.85E-43)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA = r0
            java.lang.String r0 = "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA"
            r1 = 135(0x87, float:1.89E-43)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA = r0
            java.lang.String r0 = "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA"
            r1 = 136(0x88, float:1.9E-43)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA = r0
            java.lang.String r0 = "TLS_PSK_WITH_RC4_128_SHA"
            r1 = 138(0x8a, float:1.93E-43)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_PSK_WITH_RC4_128_SHA = r0
            java.lang.String r0 = "TLS_PSK_WITH_3DES_EDE_CBC_SHA"
            r1 = 139(0x8b, float:1.95E-43)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA = r0
            java.lang.String r0 = "TLS_PSK_WITH_AES_128_CBC_SHA"
            r1 = 140(0x8c, float:1.96E-43)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA = r0
            java.lang.String r0 = "TLS_PSK_WITH_AES_256_CBC_SHA"
            r1 = 141(0x8d, float:1.98E-43)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA = r0
            java.lang.String r0 = "TLS_RSA_WITH_SEED_CBC_SHA"
            r1 = 150(0x96, float:2.1E-43)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_RSA_WITH_SEED_CBC_SHA = r0
            java.lang.String r0 = "TLS_RSA_WITH_AES_128_GCM_SHA256"
            r1 = 156(0x9c, float:2.19E-43)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256 = r0
            java.lang.String r0 = "TLS_RSA_WITH_AES_256_GCM_SHA384"
            r1 = 157(0x9d, float:2.2E-43)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384 = r0
            java.lang.String r0 = "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256"
            r1 = 158(0x9e, float:2.21E-43)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 = r0
            java.lang.String r0 = "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384"
            r1 = 159(0x9f, float:2.23E-43)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 = r0
            java.lang.String r0 = "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256"
            r1 = 162(0xa2, float:2.27E-43)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256 = r0
            java.lang.String r0 = "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384"
            r1 = 163(0xa3, float:2.28E-43)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384 = r0
            java.lang.String r0 = "TLS_DH_anon_WITH_AES_128_GCM_SHA256"
            r1 = 166(0xa6, float:2.33E-43)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256 = r0
            java.lang.String r0 = "TLS_DH_anon_WITH_AES_256_GCM_SHA384"
            r1 = 167(0xa7, float:2.34E-43)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384 = r0
            java.lang.String r0 = "TLS_EMPTY_RENEGOTIATION_INFO_SCSV"
            r1 = 255(0xff, float:3.57E-43)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_EMPTY_RENEGOTIATION_INFO_SCSV = r0
            java.lang.String r0 = "TLS_FALLBACK_SCSV"
            r1 = 22016(0x5600, float:3.0851E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_FALLBACK_SCSV = r0
            java.lang.String r0 = "TLS_ECDH_ECDSA_WITH_NULL_SHA"
            r1 = 49153(0xc001, float:6.8878E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDH_ECDSA_WITH_NULL_SHA = r0
            java.lang.String r0 = "TLS_ECDH_ECDSA_WITH_RC4_128_SHA"
            r1 = 49154(0xc002, float:6.888E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDH_ECDSA_WITH_RC4_128_SHA = r0
            java.lang.String r0 = "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA"
            r1 = 49155(0xc003, float:6.8881E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA = r0
            java.lang.String r0 = "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA"
            r1 = 49156(0xc004, float:6.8882E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA = r0
            java.lang.String r0 = "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA"
            r1 = 49157(0xc005, float:6.8884E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA = r0
            java.lang.String r0 = "TLS_ECDHE_ECDSA_WITH_NULL_SHA"
            r1 = 49158(0xc006, float:6.8885E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_NULL_SHA = r0
            java.lang.String r0 = "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA"
            r1 = 49159(0xc007, float:6.8886E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_RC4_128_SHA = r0
            java.lang.String r0 = "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA"
            r1 = 49160(0xc008, float:6.8888E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA = r0
            java.lang.String r0 = "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA"
            r1 = 49161(0xc009, float:6.8889E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA = r0
            java.lang.String r0 = "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA"
            r1 = 49162(0xc00a, float:6.889E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA = r0
            java.lang.String r0 = "TLS_ECDH_RSA_WITH_NULL_SHA"
            r1 = 49163(0xc00b, float:6.8892E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDH_RSA_WITH_NULL_SHA = r0
            java.lang.String r0 = "TLS_ECDH_RSA_WITH_RC4_128_SHA"
            r1 = 49164(0xc00c, float:6.8893E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDH_RSA_WITH_RC4_128_SHA = r0
            java.lang.String r0 = "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA"
            r1 = 49165(0xc00d, float:6.8895E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA = r0
            java.lang.String r0 = "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA"
            r1 = 49166(0xc00e, float:6.8896E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDH_RSA_WITH_AES_128_CBC_SHA = r0
            java.lang.String r0 = "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA"
            r1 = 49167(0xc00f, float:6.8898E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDH_RSA_WITH_AES_256_CBC_SHA = r0
            java.lang.String r0 = "TLS_ECDHE_RSA_WITH_NULL_SHA"
            r1 = 49168(0xc010, float:6.8899E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_NULL_SHA = r0
            java.lang.String r0 = "TLS_ECDHE_RSA_WITH_RC4_128_SHA"
            r1 = 49169(0xc011, float:6.89E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_RC4_128_SHA = r0
            java.lang.String r0 = "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA"
            r1 = 49170(0xc012, float:6.8902E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA = r0
            java.lang.String r0 = "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA"
            r1 = 49171(0xc013, float:6.8903E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA = r0
            java.lang.String r0 = "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA"
            r1 = 49172(0xc014, float:6.8905E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA = r0
            java.lang.String r0 = "TLS_ECDH_anon_WITH_NULL_SHA"
            r1 = 49173(0xc015, float:6.8906E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDH_anon_WITH_NULL_SHA = r0
            java.lang.String r0 = "TLS_ECDH_anon_WITH_RC4_128_SHA"
            r1 = 49174(0xc016, float:6.8907E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDH_anon_WITH_RC4_128_SHA = r0
            java.lang.String r0 = "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA"
            r1 = 49175(0xc017, float:6.8909E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA = r0
            java.lang.String r0 = "TLS_ECDH_anon_WITH_AES_128_CBC_SHA"
            r1 = 49176(0xc018, float:6.891E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDH_anon_WITH_AES_128_CBC_SHA = r0
            java.lang.String r0 = "TLS_ECDH_anon_WITH_AES_256_CBC_SHA"
            r1 = 49177(0xc019, float:6.8912E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDH_anon_WITH_AES_256_CBC_SHA = r0
            java.lang.String r0 = "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256"
            r1 = 49187(0xc023, float:6.8926E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 = r0
            java.lang.String r0 = "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384"
            r1 = 49188(0xc024, float:6.8927E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 = r0
            java.lang.String r0 = "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256"
            r1 = 49189(0xc025, float:6.8928E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256 = r0
            java.lang.String r0 = "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384"
            r1 = 49190(0xc026, float:6.893E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384 = r0
            java.lang.String r0 = "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256"
            r1 = 49191(0xc027, float:6.8931E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 = r0
            java.lang.String r0 = "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384"
            r1 = 49192(0xc028, float:6.8933E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 = r0
            java.lang.String r0 = "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256"
            r1 = 49193(0xc029, float:6.8934E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256 = r0
            java.lang.String r0 = "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384"
            r1 = 49194(0xc02a, float:6.8935E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384 = r0
            java.lang.String r0 = "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256"
            r1 = 49195(0xc02b, float:6.8937E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 = r0
            java.lang.String r0 = "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384"
            r1 = 49196(0xc02c, float:6.8938E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 = r0
            java.lang.String r0 = "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256"
            r1 = 49197(0xc02d, float:6.894E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256 = r0
            java.lang.String r0 = "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384"
            r1 = 49198(0xc02e, float:6.8941E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384 = r0
            java.lang.String r0 = "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256"
            r1 = 49199(0xc02f, float:6.8942E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 = r0
            java.lang.String r0 = "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384"
            r1 = 49200(0xc030, float:6.8944E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 = r0
            java.lang.String r0 = "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256"
            r1 = 49201(0xc031, float:6.8945E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256 = r0
            java.lang.String r0 = "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384"
            r1 = 49202(0xc032, float:6.8947E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384 = r0
            java.lang.String r0 = "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA"
            r1 = 49205(0xc035, float:6.8951E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA = r0
            java.lang.String r0 = "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA"
            r1 = 49206(0xc036, float:6.8952E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA = r0
            java.lang.String r0 = "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256"
            r1 = 52392(0xcca8, float:7.3417E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = r0
            java.lang.String r0 = "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256"
            r1 = 52393(0xcca9, float:7.3418E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256 = r0
            java.lang.String r0 = "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256"
            r1 = 52394(0xccaa, float:7.342E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = r0
            java.lang.String r0 = "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256"
            r1 = 52396(0xccac, float:7.3422E-41)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256 = r0
            java.lang.String r0 = "TLS_AES_128_GCM_SHA256"
            r1 = 4865(0x1301, float:6.817E-42)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_AES_128_GCM_SHA256 = r0
            java.lang.String r0 = "TLS_AES_256_GCM_SHA384"
            r1 = 4866(0x1302, float:6.819E-42)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_AES_256_GCM_SHA384 = r0
            java.lang.String r0 = "TLS_CHACHA20_POLY1305_SHA256"
            r1 = 4867(0x1303, float:6.82E-42)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_CHACHA20_POLY1305_SHA256 = r0
            java.lang.String r0 = "TLS_AES_128_CCM_SHA256"
            r1 = 4868(0x1304, float:6.822E-42)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_AES_128_CCM_SHA256 = r0
            java.lang.String r0 = "TLS_AES_128_CCM_8_SHA256"
            r1 = 4869(0x1305, float:6.823E-42)
            okhttp3.CipherSuite r0 = init(r0, r1)
            okhttp3.CipherSuite.TLS_AES_128_CCM_8_SHA256 = r0
            return
    }

    private CipherSuite(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r1.getClass()
            r0.javaName = r1
            return
    }

    public static synchronized okhttp3.CipherSuite forJavaName(java.lang.String r3) {
            java.lang.Class<okhttp3.CipherSuite> r0 = okhttp3.CipherSuite.class
            monitor-enter(r0)
            java.util.Map<java.lang.String, okhttp3.CipherSuite> r1 = okhttp3.CipherSuite.INSTANCES     // Catch: java.lang.Throwable -> L23
            java.lang.Object r2 = r1.get(r3)     // Catch: java.lang.Throwable -> L23
            okhttp3.CipherSuite r2 = (okhttp3.CipherSuite) r2     // Catch: java.lang.Throwable -> L23
            if (r2 != 0) goto L21
            java.lang.String r2 = secondaryName(r3)     // Catch: java.lang.Throwable -> L23
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> L23
            okhttp3.CipherSuite r2 = (okhttp3.CipherSuite) r2     // Catch: java.lang.Throwable -> L23
            if (r2 != 0) goto L1e
            okhttp3.CipherSuite r2 = new okhttp3.CipherSuite     // Catch: java.lang.Throwable -> L23
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L23
        L1e:
            r1.put(r3, r2)     // Catch: java.lang.Throwable -> L23
        L21:
            monitor-exit(r0)
            return r2
        L23:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    static java.util.List<okhttp3.CipherSuite> forJavaNames(java.lang.String... r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.length
            r0.<init>(r1)
            int r1 = r4.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L16
            r3 = r4[r2]
            okhttp3.CipherSuite r3 = forJavaName(r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto L8
        L16:
            java.util.List r4 = java.util.Collections.unmodifiableList(r0)
            return r4
    }

    private static okhttp3.CipherSuite init(java.lang.String r1, int r2) {
            okhttp3.CipherSuite r2 = new okhttp3.CipherSuite
            r2.<init>(r1)
            java.util.Map<java.lang.String, okhttp3.CipherSuite> r0 = okhttp3.CipherSuite.INSTANCES
            r0.put(r1, r2)
            return r2
    }

    static /* synthetic */ int lambda$static$0(java.lang.String r6, java.lang.String r7) {
            int r0 = r6.length()
            int r1 = r7.length()
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 4
        Ld:
            r2 = -1
            r3 = 1
            if (r1 >= r0) goto L23
            char r4 = r6.charAt(r1)
            char r5 = r7.charAt(r1)
            if (r4 == r5) goto L20
            if (r4 >= r5) goto L1e
            goto L1f
        L1e:
            r2 = r3
        L1f:
            return r2
        L20:
            int r1 = r1 + 1
            goto Ld
        L23:
            int r6 = r6.length()
            int r7 = r7.length()
            if (r6 == r7) goto L32
            if (r6 >= r7) goto L30
            goto L31
        L30:
            r2 = r3
        L31:
            return r2
        L32:
            r6 = 0
            return r6
    }

    private static java.lang.String secondaryName(java.lang.String r4) {
            java.lang.String r0 = "TLS_"
            boolean r1 = r4.startsWith(r0)
            r2 = 4
            java.lang.String r3 = "SSL_"
            if (r1 == 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            java.lang.String r4 = r4.substring(r2)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            return r4
        L1d:
            boolean r1 = r4.startsWith(r3)
            if (r1 == 0) goto L34
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r4 = r4.substring(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
        L34:
            return r4
    }

    public java.lang.String javaName() {
            r1 = this;
            java.lang.String r0 = r1.javaName
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.javaName
            return r0
    }
}
