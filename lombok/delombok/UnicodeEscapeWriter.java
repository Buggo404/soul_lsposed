package lombok.delombok;

/* loaded from: com.usidqw.qwerklj.apk:lombok/delombok/UnicodeEscapeWriter.SCL.lombok */
public class UnicodeEscapeWriter extends java.io.Writer {
    private final java.io.Writer writer;
    private java.nio.charset.CharsetEncoder encoder;

    public UnicodeEscapeWriter(java.io.Writer r4, java.nio.charset.Charset r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.writer = r1
            r0 = r3
            r1 = r5
            java.nio.charset.CharsetEncoder r1 = r1.newEncoder()
            r0.encoder = r1
            return
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            r0 = r2
            java.io.Writer r0 = r0.writer
            r0.close()
            return
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws java.io.IOException {
            r2 = this;
            r0 = r2
            java.io.Writer r0 = r0.writer
            r0.flush()
            return
    }

    @Override // java.io.Writer
    public final void write(char[] r7, int r8, int r9) throws java.io.IOException {
            r6 = this;
            r0 = r8
            r10 = r0
            r0 = r10
            r11 = r0
            r0 = r8
            r1 = r9
            int r0 = r0 + r1
            r12 = r0
            goto L3d
        Lf:
            r0 = r6
            java.nio.charset.CharsetEncoder r0 = r0.encoder
            r1 = r7
            r2 = r11
            char r1 = r1[r2]
            boolean r0 = r0.canEncode(r1)
            if (r0 != 0) goto L3a
            r0 = r6
            java.io.Writer r0 = r0.writer
            r1 = r7
            r2 = r10
            r3 = r11
            r4 = r10
            int r3 = r3 - r4
            r0.write(r1, r2, r3)
            r0 = r6
            r1 = r7
            r2 = r11
            char r1 = r1[r2]
            r0.writeUnicodeEscape(r1)
            r0 = r11
            r1 = 1
            int r0 = r0 + r1
            r10 = r0
        L3a:
            int r11 = r11 + 1
        L3d:
            r0 = r11
            r1 = r12
            if (r0 < r1) goto Lf
            r0 = r10
            r1 = r12
            if (r0 >= r1) goto L5a
            r0 = r6
            java.io.Writer r0 = r0.writer
            r1 = r7
            r2 = r10
            r3 = r12
            r4 = r10
            int r3 = r3 - r4
            r0.write(r1, r2, r3)
        L5a:
            return
    }

    protected void writeUnicodeEscape(char r8) throws java.io.IOException {
            r7 = this;
            r0 = r7
            java.io.Writer r0 = r0.writer
            java.lang.String r1 = "\\u%04x"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r4] = r5
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.write(r1)
            return
    }
}
