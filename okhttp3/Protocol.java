package okhttp3;

/* loaded from: classes.dex */
public enum Protocol extends java.lang.Enum<okhttp3.Protocol> {
    private static final /* synthetic */ okhttp3.Protocol[] $VALUES = null;
    public static final okhttp3.Protocol H2_PRIOR_KNOWLEDGE = null;
    public static final okhttp3.Protocol HTTP_1_0 = null;
    public static final okhttp3.Protocol HTTP_1_1 = null;
    public static final okhttp3.Protocol HTTP_2 = null;
    public static final okhttp3.Protocol QUIC = null;
    public static final okhttp3.Protocol SPDY_3 = null;
    private final java.lang.String protocol;

    static {
            okhttp3.Protocol r0 = new okhttp3.Protocol
            java.lang.String r1 = "http/1.0"
            java.lang.String r2 = "HTTP_1_0"
            r3 = 0
            r0.<init>(r2, r3, r1)
            okhttp3.Protocol.HTTP_1_0 = r0
            okhttp3.Protocol r1 = new okhttp3.Protocol
            java.lang.String r2 = "http/1.1"
            java.lang.String r4 = "HTTP_1_1"
            r5 = 1
            r1.<init>(r4, r5, r2)
            okhttp3.Protocol.HTTP_1_1 = r1
            okhttp3.Protocol r2 = new okhttp3.Protocol
            java.lang.String r4 = "spdy/3.1"
            java.lang.String r6 = "SPDY_3"
            r7 = 2
            r2.<init>(r6, r7, r4)
            okhttp3.Protocol.SPDY_3 = r2
            okhttp3.Protocol r4 = new okhttp3.Protocol
            java.lang.String r6 = "h2"
            java.lang.String r8 = "HTTP_2"
            r9 = 3
            r4.<init>(r8, r9, r6)
            okhttp3.Protocol.HTTP_2 = r4
            okhttp3.Protocol r6 = new okhttp3.Protocol
            java.lang.String r8 = "h2_prior_knowledge"
            java.lang.String r10 = "H2_PRIOR_KNOWLEDGE"
            r11 = 4
            r6.<init>(r10, r11, r8)
            okhttp3.Protocol.H2_PRIOR_KNOWLEDGE = r6
            okhttp3.Protocol r8 = new okhttp3.Protocol
            java.lang.String r10 = "quic"
            java.lang.String r12 = "QUIC"
            r13 = 5
            r8.<init>(r12, r13, r10)
            okhttp3.Protocol.QUIC = r8
            r10 = 6
            okhttp3.Protocol[] r10 = new okhttp3.Protocol[r10]
            r10[r3] = r0
            r10[r5] = r1
            r10[r7] = r2
            r10[r9] = r4
            r10[r11] = r6
            r10[r13] = r8
            okhttp3.Protocol.$VALUES = r10
            return
    }

    Protocol(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.protocol = r3
            return
    }

    public static okhttp3.Protocol get(java.lang.String r3) throws java.io.IOException {
            okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_0
            java.lang.String r1 = r0.protocol
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto Lb
            return r0
        Lb:
            okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_1
            java.lang.String r1 = r0.protocol
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L16
            return r0
        L16:
            okhttp3.Protocol r0 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            java.lang.String r1 = r0.protocol
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L21
            return r0
        L21:
            okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_2
            java.lang.String r1 = r0.protocol
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L2c
            return r0
        L2c:
            okhttp3.Protocol r0 = okhttp3.Protocol.SPDY_3
            java.lang.String r1 = r0.protocol
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L37
            return r0
        L37:
            okhttp3.Protocol r0 = okhttp3.Protocol.QUIC
            java.lang.String r1 = r0.protocol
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L42
            return r0
        L42:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected protocol: "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    public static okhttp3.Protocol valueOf(java.lang.String r1) {
            java.lang.Class<okhttp3.Protocol> r0 = okhttp3.Protocol.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            okhttp3.Protocol r1 = (okhttp3.Protocol) r1
            return r1
    }

    public static okhttp3.Protocol[] values() {
            okhttp3.Protocol[] r0 = okhttp3.Protocol.$VALUES
            java.lang.Object r0 = r0.clone()
            okhttp3.Protocol[] r0 = (okhttp3.Protocol[]) r0
            return r0
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.protocol
            return r0
    }
}
