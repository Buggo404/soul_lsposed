package okhttp3.internal.http2;

/* loaded from: classes.dex */
public enum ErrorCode extends java.lang.Enum<okhttp3.internal.http2.ErrorCode> {
    private static final /* synthetic */ okhttp3.internal.http2.ErrorCode[] $VALUES = null;
    public static final okhttp3.internal.http2.ErrorCode CANCEL = null;
    public static final okhttp3.internal.http2.ErrorCode COMPRESSION_ERROR = null;
    public static final okhttp3.internal.http2.ErrorCode CONNECT_ERROR = null;
    public static final okhttp3.internal.http2.ErrorCode ENHANCE_YOUR_CALM = null;
    public static final okhttp3.internal.http2.ErrorCode FLOW_CONTROL_ERROR = null;
    public static final okhttp3.internal.http2.ErrorCode HTTP_1_1_REQUIRED = null;
    public static final okhttp3.internal.http2.ErrorCode INADEQUATE_SECURITY = null;
    public static final okhttp3.internal.http2.ErrorCode INTERNAL_ERROR = null;
    public static final okhttp3.internal.http2.ErrorCode NO_ERROR = null;
    public static final okhttp3.internal.http2.ErrorCode PROTOCOL_ERROR = null;
    public static final okhttp3.internal.http2.ErrorCode REFUSED_STREAM = null;
    public final int httpCode;

    static {
            okhttp3.internal.http2.ErrorCode r0 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r1 = "NO_ERROR"
            r2 = 0
            r0.<init>(r1, r2, r2)
            okhttp3.internal.http2.ErrorCode.NO_ERROR = r0
            okhttp3.internal.http2.ErrorCode r1 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r3 = "PROTOCOL_ERROR"
            r4 = 1
            r1.<init>(r3, r4, r4)
            okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR = r1
            okhttp3.internal.http2.ErrorCode r3 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r5 = "INTERNAL_ERROR"
            r6 = 2
            r3.<init>(r5, r6, r6)
            okhttp3.internal.http2.ErrorCode.INTERNAL_ERROR = r3
            okhttp3.internal.http2.ErrorCode r5 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r7 = "FLOW_CONTROL_ERROR"
            r8 = 3
            r5.<init>(r7, r8, r8)
            okhttp3.internal.http2.ErrorCode.FLOW_CONTROL_ERROR = r5
            okhttp3.internal.http2.ErrorCode r7 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r9 = "REFUSED_STREAM"
            r10 = 4
            r11 = 7
            r7.<init>(r9, r10, r11)
            okhttp3.internal.http2.ErrorCode.REFUSED_STREAM = r7
            okhttp3.internal.http2.ErrorCode r9 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r12 = "CANCEL"
            r13 = 5
            r14 = 8
            r9.<init>(r12, r13, r14)
            okhttp3.internal.http2.ErrorCode.CANCEL = r9
            okhttp3.internal.http2.ErrorCode r12 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r15 = "COMPRESSION_ERROR"
            r13 = 6
            r10 = 9
            r12.<init>(r15, r13, r10)
            okhttp3.internal.http2.ErrorCode.COMPRESSION_ERROR = r12
            okhttp3.internal.http2.ErrorCode r15 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r13 = "CONNECT_ERROR"
            r8 = 10
            r15.<init>(r13, r11, r8)
            okhttp3.internal.http2.ErrorCode.CONNECT_ERROR = r15
            okhttp3.internal.http2.ErrorCode r13 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r11 = "ENHANCE_YOUR_CALM"
            r6 = 11
            r13.<init>(r11, r14, r6)
            okhttp3.internal.http2.ErrorCode.ENHANCE_YOUR_CALM = r13
            okhttp3.internal.http2.ErrorCode r11 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r14 = "INADEQUATE_SECURITY"
            r4 = 12
            r11.<init>(r14, r10, r4)
            okhttp3.internal.http2.ErrorCode.INADEQUATE_SECURITY = r11
            okhttp3.internal.http2.ErrorCode r4 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r14 = "HTTP_1_1_REQUIRED"
            r10 = 13
            r4.<init>(r14, r8, r10)
            okhttp3.internal.http2.ErrorCode.HTTP_1_1_REQUIRED = r4
            okhttp3.internal.http2.ErrorCode[] r6 = new okhttp3.internal.http2.ErrorCode[r6]
            r6[r2] = r0
            r0 = 1
            r6[r0] = r1
            r0 = 2
            r6[r0] = r3
            r0 = 3
            r6[r0] = r5
            r0 = 4
            r6[r0] = r7
            r0 = 5
            r6[r0] = r9
            r0 = 6
            r6[r0] = r12
            r0 = 7
            r6[r0] = r15
            r0 = 8
            r6[r0] = r13
            r0 = 9
            r6[r0] = r11
            r6[r8] = r4
            okhttp3.internal.http2.ErrorCode.$VALUES = r6
            return
    }

    ErrorCode(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.httpCode = r3
            return
    }

    public static okhttp3.internal.http2.ErrorCode fromHttp2(int r5) {
            okhttp3.internal.http2.ErrorCode[] r0 = values()
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            int r4 = r3.httpCode
            if (r4 != r5) goto Lf
            return r3
        Lf:
            int r2 = r2 + 1
            goto L6
        L12:
            r5 = 0
            return r5
    }

    public static okhttp3.internal.http2.ErrorCode valueOf(java.lang.String r1) {
            java.lang.Class<okhttp3.internal.http2.ErrorCode> r0 = okhttp3.internal.http2.ErrorCode.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            okhttp3.internal.http2.ErrorCode r1 = (okhttp3.internal.http2.ErrorCode) r1
            return r1
    }

    public static okhttp3.internal.http2.ErrorCode[] values() {
            okhttp3.internal.http2.ErrorCode[] r0 = okhttp3.internal.http2.ErrorCode.$VALUES
            java.lang.Object r0 = r0.clone()
            okhttp3.internal.http2.ErrorCode[] r0 = (okhttp3.internal.http2.ErrorCode[]) r0
            return r0
    }
}
