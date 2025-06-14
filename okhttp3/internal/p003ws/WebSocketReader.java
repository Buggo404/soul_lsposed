package okhttp3.internal.p003ws;

/* loaded from: classes.dex */
final class WebSocketReader {
    boolean closed;
    private final okio.Buffer controlFrameBuffer;
    final okhttp3.internal.ws.WebSocketReader.FrameCallback frameCallback;
    long frameLength;
    final boolean isClient;
    boolean isControlFrame;
    boolean isFinalFrame;
    private final okio.Buffer.UnsafeCursor maskCursor;
    private final byte[] maskKey;
    private final okio.Buffer messageFrameBuffer;
    int opcode;
    final okio.BufferedSource source;

    public interface FrameCallback {
        void onReadClose(int r1, java.lang.String r2);

        void onReadMessage(java.lang.String r1) throws java.io.IOException;

        void onReadMessage(okio.ByteString r1) throws java.io.IOException;

        void onReadPing(okio.ByteString r1);

        void onReadPong(okio.ByteString r1);
    }

    WebSocketReader(boolean r2, okio.BufferedSource r3, okhttp3.internal.ws.WebSocketReader.FrameCallback r4) {
            r1 = this;
            r1.<init>()
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r1.controlFrameBuffer = r0
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r1.messageFrameBuffer = r0
            if (r3 == 0) goto L38
            if (r4 == 0) goto L30
            r1.isClient = r2
            r1.source = r3
            r1.frameCallback = r4
            r3 = 0
            if (r2 == 0) goto L20
            r4 = r3
            goto L23
        L20:
            r4 = 4
            byte[] r4 = new byte[r4]
        L23:
            r1.maskKey = r4
            if (r2 == 0) goto L28
            goto L2d
        L28:
            okio.Buffer$UnsafeCursor r3 = new okio.Buffer$UnsafeCursor
            r3.<init>()
        L2d:
            r1.maskCursor = r3
            return
        L30:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "frameCallback == null"
            r2.<init>(r3)
            throw r2
        L38:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "source == null"
            r2.<init>(r3)
            throw r2
    }

    private void readControlFrame() throws java.io.IOException {
            r6 = this;
            long r0 = r6.frameLength
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L2b
            okio.BufferedSource r4 = r6.source
            okio.Buffer r5 = r6.controlFrameBuffer
            r4.readFully(r5, r0)
            boolean r0 = r6.isClient
            if (r0 != 0) goto L2b
            okio.Buffer r0 = r6.controlFrameBuffer
            okio.Buffer$UnsafeCursor r1 = r6.maskCursor
            r0.readAndWriteUnsafe(r1)
            okio.Buffer$UnsafeCursor r0 = r6.maskCursor
            r0.seek(r2)
            okio.Buffer$UnsafeCursor r0 = r6.maskCursor
            byte[] r1 = r6.maskKey
            okhttp3.internal.p003ws.WebSocketProtocol.toggleMask(r0, r1)
            okio.Buffer$UnsafeCursor r0 = r6.maskCursor
            r0.close()
        L2b:
            int r0 = r6.opcode
            switch(r0) {
                case 8: goto L63;
                case 9: goto L57;
                case 10: goto L4b;
                default: goto L30;
            }
        L30:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown control opcode: "
            r1.<init>(r2)
            int r2 = r6.opcode
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L4b:
            okhttp3.internal.ws.WebSocketReader$FrameCallback r0 = r6.frameCallback
            okio.Buffer r1 = r6.controlFrameBuffer
            okio.ByteString r1 = r1.readByteString()
            r0.onReadPong(r1)
            goto L98
        L57:
            okhttp3.internal.ws.WebSocketReader$FrameCallback r0 = r6.frameCallback
            okio.Buffer r1 = r6.controlFrameBuffer
            okio.ByteString r1 = r1.readByteString()
            r0.onReadPing(r1)
            goto L98
        L63:
            okio.Buffer r0 = r6.controlFrameBuffer
            long r0 = r0.size()
            r4 = 1
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 == 0) goto L99
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L8c
            okio.Buffer r0 = r6.controlFrameBuffer
            short r0 = r0.readShort()
            okio.Buffer r1 = r6.controlFrameBuffer
            java.lang.String r1 = r1.readUtf8()
            java.lang.String r2 = okhttp3.internal.p003ws.WebSocketProtocol.closeCodeExceptionMessage(r0)
            if (r2 != 0) goto L86
            goto L90
        L86:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            r0.<init>(r2)
            throw r0
        L8c:
            r0 = 1005(0x3ed, float:1.408E-42)
            java.lang.String r1 = ""
        L90:
            okhttp3.internal.ws.WebSocketReader$FrameCallback r2 = r6.frameCallback
            r2.onReadClose(r0, r1)
            r0 = 1
            r6.closed = r0
        L98:
            return
        L99:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Malformed close payload length of 1."
            r0.<init>(r1)
            throw r0
    }

    private void readHeader() throws java.io.IOException {
            r6 = this;
            boolean r0 = r6.closed
            if (r0 != 0) goto L10e
            okio.BufferedSource r0 = r6.source
            okio.Timeout r0 = r0.timeout()
            long r0 = r0.timeoutNanos()
            okio.BufferedSource r2 = r6.source
            okio.Timeout r2 = r2.timeout()
            r2.clearTimeout()
            okio.BufferedSource r2 = r6.source     // Catch: java.lang.Throwable -> L101
            byte r2 = r2.readByte()     // Catch: java.lang.Throwable -> L101
            r2 = r2 & 255(0xff, float:3.57E-43)
            okio.BufferedSource r3 = r6.source
            okio.Timeout r3 = r3.timeout()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS
            r3.timeout(r0, r4)
            r0 = r2 & 15
            r6.opcode = r0
            r0 = r2 & 128(0x80, float:1.794E-43)
            r1 = 1
            r3 = 0
            if (r0 == 0) goto L36
            r0 = r1
            goto L37
        L36:
            r0 = r3
        L37:
            r6.isFinalFrame = r0
            r4 = r2 & 8
            if (r4 == 0) goto L3f
            r4 = r1
            goto L40
        L3f:
            r4 = r3
        L40:
            r6.isControlFrame = r4
            if (r4 == 0) goto L4f
            if (r0 == 0) goto L47
            goto L4f
        L47:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Control frames must be final."
            r0.<init>(r1)
            throw r0
        L4f:
            r0 = r2 & 64
            if (r0 == 0) goto L55
            r0 = r1
            goto L56
        L55:
            r0 = r3
        L56:
            r4 = r2 & 32
            if (r4 == 0) goto L5c
            r4 = r1
            goto L5d
        L5c:
            r4 = r3
        L5d:
            r2 = r2 & 16
            if (r2 == 0) goto L63
            r2 = r1
            goto L64
        L63:
            r2 = r3
        L64:
            if (r0 != 0) goto Lf9
            if (r4 != 0) goto Lf9
            if (r2 != 0) goto Lf9
            okio.BufferedSource r0 = r6.source
            byte r0 = r0.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = r0 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L77
            goto L78
        L77:
            r1 = r3
        L78:
            boolean r2 = r6.isClient
            if (r1 != r2) goto L8b
            java.net.ProtocolException r0 = new java.net.ProtocolException
            boolean r1 = r6.isClient
            if (r1 == 0) goto L85
            java.lang.String r1 = "Server-sent frames must not be masked."
            goto L87
        L85:
            java.lang.String r1 = "Client-sent frames must be masked."
        L87:
            r0.<init>(r1)
            throw r0
        L8b:
            r0 = r0 & 127(0x7f, float:1.78E-43)
            long r2 = (long) r0
            r6.frameLength = r2
            r4 = 126(0x7e, double:6.23E-322)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto La4
            okio.BufferedSource r0 = r6.source
            short r0 = r0.readShort()
            long r2 = (long) r0
            r4 = 65535(0xffff, double:3.23786E-319)
            long r2 = r2 & r4
            r6.frameLength = r2
            goto Lda
        La4:
            r4 = 127(0x7f, double:6.27E-322)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto Lda
            okio.BufferedSource r0 = r6.source
            long r2 = r0.readLong()
            r6.frameLength = r2
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto Lb9
            goto Lda
        Lb9:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Frame length 0x"
            r1.<init>(r2)
            long r2 = r6.frameLength
            java.lang.String r2 = java.lang.Long.toHexString(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " > 0x7FFFFFFFFFFFFFFF"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lda:
            boolean r0 = r6.isControlFrame
            if (r0 == 0) goto Lef
            long r2 = r6.frameLength
            r4 = 125(0x7d, double:6.2E-322)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto Le7
            goto Lef
        Le7:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Control frame must be less than 125B."
            r0.<init>(r1)
            throw r0
        Lef:
            if (r1 == 0) goto Lf8
            okio.BufferedSource r0 = r6.source
            byte[] r1 = r6.maskKey
            r0.readFully(r1)
        Lf8:
            return
        Lf9:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Reserved flags are unsupported."
            r0.<init>(r1)
            throw r0
        L101:
            r2 = move-exception
            okio.BufferedSource r3 = r6.source
            okio.Timeout r3 = r3.timeout()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS
            r3.timeout(r0, r4)
            throw r2
        L10e:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "closed"
            r0.<init>(r1)
            throw r0
    }

    private void readMessage() throws java.io.IOException {
            r5 = this;
        L0:
            boolean r0 = r5.closed
            if (r0 != 0) goto L60
            long r0 = r5.frameLength
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L38
            okio.BufferedSource r2 = r5.source
            okio.Buffer r3 = r5.messageFrameBuffer
            r2.readFully(r3, r0)
            boolean r0 = r5.isClient
            if (r0 != 0) goto L38
            okio.Buffer r0 = r5.messageFrameBuffer
            okio.Buffer$UnsafeCursor r1 = r5.maskCursor
            r0.readAndWriteUnsafe(r1)
            okio.Buffer$UnsafeCursor r0 = r5.maskCursor
            okio.Buffer r1 = r5.messageFrameBuffer
            long r1 = r1.size()
            long r3 = r5.frameLength
            long r1 = r1 - r3
            r0.seek(r1)
            okio.Buffer$UnsafeCursor r0 = r5.maskCursor
            byte[] r1 = r5.maskKey
            okhttp3.internal.p003ws.WebSocketProtocol.toggleMask(r0, r1)
            okio.Buffer$UnsafeCursor r0 = r5.maskCursor
            r0.close()
        L38:
            boolean r0 = r5.isFinalFrame
            if (r0 == 0) goto L3d
            return
        L3d:
            r5.readUntilNonControlFrame()
            int r0 = r5.opcode
            if (r0 != 0) goto L45
            goto L0
        L45:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected continuation opcode. Got: "
            r1.<init>(r2)
            int r2 = r5.opcode
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L60:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "closed"
            r0.<init>(r1)
            throw r0
    }

    private void readMessageFrame() throws java.io.IOException {
            r4 = this;
            int r0 = r4.opcode
            r1 = 1
            if (r0 == r1) goto L22
            r2 = 2
            if (r0 != r2) goto L9
            goto L22
        L9:
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown opcode: "
            r2.<init>(r3)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L22:
            r4.readMessage()
            if (r0 != r1) goto L33
            okhttp3.internal.ws.WebSocketReader$FrameCallback r0 = r4.frameCallback
            okio.Buffer r1 = r4.messageFrameBuffer
            java.lang.String r1 = r1.readUtf8()
            r0.onReadMessage(r1)
            goto L3e
        L33:
            okhttp3.internal.ws.WebSocketReader$FrameCallback r0 = r4.frameCallback
            okio.Buffer r1 = r4.messageFrameBuffer
            okio.ByteString r1 = r1.readByteString()
            r0.onReadMessage(r1)
        L3e:
            return
    }

    private void readUntilNonControlFrame() throws java.io.IOException {
            r1 = this;
        L0:
            boolean r0 = r1.closed
            if (r0 != 0) goto L10
            r1.readHeader()
            boolean r0 = r1.isControlFrame
            if (r0 != 0) goto Lc
            goto L10
        Lc:
            r1.readControlFrame()
            goto L0
        L10:
            return
    }

    void processNextFrame() throws java.io.IOException {
            r1 = this;
            r1.readHeader()
            boolean r0 = r1.isControlFrame
            if (r0 == 0) goto Lb
            r1.readControlFrame()
            goto Le
        Lb:
            r1.readMessageFrame()
        Le:
            return
    }
}
