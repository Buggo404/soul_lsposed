package okhttp3.internal.p003ws;

/* loaded from: classes.dex */
public final class WebSocketProtocol {
    static final java.lang.String ACCEPT_MAGIC = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    static final int B0_FLAG_FIN = 128;
    static final int B0_FLAG_RSV1 = 64;
    static final int B0_FLAG_RSV2 = 32;
    static final int B0_FLAG_RSV3 = 16;
    static final int B0_MASK_OPCODE = 15;
    static final int B1_FLAG_MASK = 128;
    static final int B1_MASK_LENGTH = 127;
    static final int CLOSE_CLIENT_GOING_AWAY = 1001;
    static final long CLOSE_MESSAGE_MAX = 123;
    static final int CLOSE_NO_STATUS_CODE = 1005;
    static final int OPCODE_BINARY = 2;
    static final int OPCODE_CONTINUATION = 0;
    static final int OPCODE_CONTROL_CLOSE = 8;
    static final int OPCODE_CONTROL_PING = 9;
    static final int OPCODE_CONTROL_PONG = 10;
    static final int OPCODE_FLAG_CONTROL = 8;
    static final int OPCODE_TEXT = 1;
    static final long PAYLOAD_BYTE_MAX = 125;
    static final int PAYLOAD_LONG = 127;
    static final int PAYLOAD_SHORT = 126;
    static final long PAYLOAD_SHORT_MAX = 65535;

    private WebSocketProtocol() {
            r2 = this;
            r2.<init>()
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "No instances."
            r0.<init>(r1)
            throw r0
    }

    public static java.lang.String acceptHeader(java.lang.String r1) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.String r0 = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11"
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r1 = r1.toString()
            okio.ByteString r1 = okio.ByteString.encodeUtf8(r1)
            okio.ByteString r1 = r1.sha1()
            java.lang.String r1 = r1.base64()
            return r1
    }

    static java.lang.String closeCodeExceptionMessage(int r2) {
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r2 < r0) goto L31
            r0 = 5000(0x1388, float:7.006E-42)
            if (r2 < r0) goto L9
            goto L31
        L9:
            r0 = 1004(0x3ec, float:1.407E-42)
            if (r2 < r0) goto L11
            r0 = 1006(0x3ee, float:1.41E-42)
            if (r2 <= r0) goto L19
        L11:
            r0 = 1012(0x3f4, float:1.418E-42)
            if (r2 < r0) goto L2f
            r0 = 2999(0xbb7, float:4.202E-42)
            if (r2 > r0) goto L2f
        L19:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Code "
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = " is reserved and may not be used."
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
        L2f:
            r2 = 0
            return r2
        L31:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Code must be in range [1000,5000): "
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            return r2
    }

    static void toggleMask(okio.Buffer.UnsafeCursor r7, byte[] r8) {
            int r0 = r8.length
            r1 = 0
        L2:
            byte[] r2 = r7.data
            int r3 = r7.start
            int r4 = r7.end
        L8:
            if (r3 >= r4) goto L18
            int r1 = r1 % r0
            r5 = r2[r3]
            r6 = r8[r1]
            r5 = r5 ^ r6
            byte r5 = (byte) r5
            r2[r3] = r5
            int r3 = r3 + 1
            int r1 = r1 + 1
            goto L8
        L18:
            int r2 = r7.next()
            r3 = -1
            if (r2 != r3) goto L2
            return
    }

    static void validateCloseCode(int r1) {
            java.lang.String r1 = closeCodeExceptionMessage(r1)
            if (r1 != 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
    }
}
