package org.objectweb.asm;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/ByteVector.SCL.lombok */
public class ByteVector {
    byte[] data;
    int length;

    public ByteVector() {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = 64
            byte[] r1 = new byte[r1]
            r0.data = r1
            return
    }

    public ByteVector(int r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            byte[] r1 = new byte[r1]
            r0.data = r1
            return
    }

    ByteVector(byte[] r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.data = r1
            r0 = r3
            r1 = r4
            int r1 = r1.length
            r0.length = r1
            return
    }

    public int size() {
            r2 = this;
            r0 = r2
            int r0 = r0.length
            return r0
    }

    public org.objectweb.asm.ByteVector putByte(int r5) {
            r4 = this;
            r0 = r4
            int r0 = r0.length
            r6 = r0
            r0 = r6
            r1 = 1
            int r0 = r0 + r1
            r1 = r4
            byte[] r1 = r1.data
            int r1 = r1.length
            if (r0 <= r1) goto L15
            r0 = r4
            r1 = 1
            r0.enlarge(r1)
        L15:
            r0 = r4
            byte[] r0 = r0.data
            r1 = r6
            int r6 = r6 + 1
            r2 = r5
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r4
            r1 = r6
            r0.length = r1
            r0 = r4
            return r0
    }

    final org.objectweb.asm.ByteVector put11(int r5, int r6) {
            r4 = this;
            r0 = r4
            int r0 = r0.length
            r7 = r0
            r0 = r7
            r1 = 2
            int r0 = r0 + r1
            r1 = r4
            byte[] r1 = r1.data
            int r1 = r1.length
            if (r0 <= r1) goto L15
            r0 = r4
            r1 = 2
            r0.enlarge(r1)
        L15:
            r0 = r4
            byte[] r0 = r0.data
            r8 = r0
            r0 = r8
            r1 = r7
            int r7 = r7 + 1
            r2 = r5
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r8
            r1 = r7
            int r7 = r7 + 1
            r2 = r6
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r4
            r1 = r7
            r0.length = r1
            r0 = r4
            return r0
    }

    public org.objectweb.asm.ByteVector putShort(int r6) {
            r5 = this;
            r0 = r5
            int r0 = r0.length
            r7 = r0
            r0 = r7
            r1 = 2
            int r0 = r0 + r1
            r1 = r5
            byte[] r1 = r1.data
            int r1 = r1.length
            if (r0 <= r1) goto L15
            r0 = r5
            r1 = 2
            r0.enlarge(r1)
        L15:
            r0 = r5
            byte[] r0 = r0.data
            r8 = r0
            r0 = r8
            r1 = r7
            int r7 = r7 + 1
            r2 = r6
            r3 = 8
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r8
            r1 = r7
            int r7 = r7 + 1
            r2 = r6
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r5
            r1 = r7
            r0.length = r1
            r0 = r5
            return r0
    }

    final org.objectweb.asm.ByteVector put12(int r6, int r7) {
            r5 = this;
            r0 = r5
            int r0 = r0.length
            r8 = r0
            r0 = r8
            r1 = 3
            int r0 = r0 + r1
            r1 = r5
            byte[] r1 = r1.data
            int r1 = r1.length
            if (r0 <= r1) goto L15
            r0 = r5
            r1 = 3
            r0.enlarge(r1)
        L15:
            r0 = r5
            byte[] r0 = r0.data
            r9 = r0
            r0 = r9
            r1 = r8
            int r8 = r8 + 1
            r2 = r6
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r9
            r1 = r8
            int r8 = r8 + 1
            r2 = r7
            r3 = 8
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r9
            r1 = r8
            int r8 = r8 + 1
            r2 = r7
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r5
            r1 = r8
            r0.length = r1
            r0 = r5
            return r0
    }

    final org.objectweb.asm.ByteVector put112(int r6, int r7, int r8) {
            r5 = this;
            r0 = r5
            int r0 = r0.length
            r9 = r0
            r0 = r9
            r1 = 4
            int r0 = r0 + r1
            r1 = r5
            byte[] r1 = r1.data
            int r1 = r1.length
            if (r0 <= r1) goto L17
            r0 = r5
            r1 = 4
            r0.enlarge(r1)
        L17:
            r0 = r5
            byte[] r0 = r0.data
            r10 = r0
            r0 = r10
            r1 = r9
            int r9 = r9 + 1
            r2 = r6
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r10
            r1 = r9
            int r9 = r9 + 1
            r2 = r7
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r10
            r1 = r9
            int r9 = r9 + 1
            r2 = r8
            r3 = 8
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r10
            r1 = r9
            int r9 = r9 + 1
            r2 = r8
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r5
            r1 = r9
            r0.length = r1
            r0 = r5
            return r0
    }

    public org.objectweb.asm.ByteVector putInt(int r6) {
            r5 = this;
            r0 = r5
            int r0 = r0.length
            r7 = r0
            r0 = r7
            r1 = 4
            int r0 = r0 + r1
            r1 = r5
            byte[] r1 = r1.data
            int r1 = r1.length
            if (r0 <= r1) goto L15
            r0 = r5
            r1 = 4
            r0.enlarge(r1)
        L15:
            r0 = r5
            byte[] r0 = r0.data
            r8 = r0
            r0 = r8
            r1 = r7
            int r7 = r7 + 1
            r2 = r6
            r3 = 24
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r8
            r1 = r7
            int r7 = r7 + 1
            r2 = r6
            r3 = 16
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r8
            r1 = r7
            int r7 = r7 + 1
            r2 = r6
            r3 = 8
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r8
            r1 = r7
            int r7 = r7 + 1
            r2 = r6
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r5
            r1 = r7
            r0.length = r1
            r0 = r5
            return r0
    }

    final org.objectweb.asm.ByteVector put122(int r6, int r7, int r8) {
            r5 = this;
            r0 = r5
            int r0 = r0.length
            r9 = r0
            r0 = r9
            r1 = 5
            int r0 = r0 + r1
            r1 = r5
            byte[] r1 = r1.data
            int r1 = r1.length
            if (r0 <= r1) goto L17
            r0 = r5
            r1 = 5
            r0.enlarge(r1)
        L17:
            r0 = r5
            byte[] r0 = r0.data
            r10 = r0
            r0 = r10
            r1 = r9
            int r9 = r9 + 1
            r2 = r6
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r10
            r1 = r9
            int r9 = r9 + 1
            r2 = r7
            r3 = 8
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r10
            r1 = r9
            int r9 = r9 + 1
            r2 = r7
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r10
            r1 = r9
            int r9 = r9 + 1
            r2 = r8
            r3 = 8
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r10
            r1 = r9
            int r9 = r9 + 1
            r2 = r8
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r5
            r1 = r9
            r0.length = r1
            r0 = r5
            return r0
    }

    public org.objectweb.asm.ByteVector putLong(long r6) {
            r5 = this;
            r0 = r5
            int r0 = r0.length
            r8 = r0
            r0 = r8
            r1 = 8
            int r0 = r0 + r1
            r1 = r5
            byte[] r1 = r1.data
            int r1 = r1.length
            if (r0 <= r1) goto L17
            r0 = r5
            r1 = 8
            r0.enlarge(r1)
        L17:
            r0 = r5
            byte[] r0 = r0.data
            r9 = r0
            r0 = r6
            r1 = 32
            long r0 = r0 >>> r1
            int r0 = (int) r0
            r10 = r0
            r0 = r9
            r1 = r8
            int r8 = r8 + 1
            r2 = r10
            r3 = 24
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r9
            r1 = r8
            int r8 = r8 + 1
            r2 = r10
            r3 = 16
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r9
            r1 = r8
            int r8 = r8 + 1
            r2 = r10
            r3 = 8
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r9
            r1 = r8
            int r8 = r8 + 1
            r2 = r10
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r6
            int r0 = (int) r0
            r10 = r0
            r0 = r9
            r1 = r8
            int r8 = r8 + 1
            r2 = r10
            r3 = 24
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r9
            r1 = r8
            int r8 = r8 + 1
            r2 = r10
            r3 = 16
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r9
            r1 = r8
            int r8 = r8 + 1
            r2 = r10
            r3 = 8
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r9
            r1 = r8
            int r8 = r8 + 1
            r2 = r10
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r5
            r1 = r8
            r0.length = r1
            r0 = r5
            return r0
    }

    public org.objectweb.asm.ByteVector putUTF8(java.lang.String r6) {
            r5 = this;
            r0 = r6
            int r0 = r0.length()
            r7 = r0
            r0 = r7
            r1 = 65535(0xffff, float:9.1834E-41)
            if (r0 <= r1) goto L15
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "UTF8 string too large"
            r1.<init>(r2)
            throw r0
        L15:
            r0 = r5
            int r0 = r0.length
            r8 = r0
            r0 = r8
            r1 = 2
            int r0 = r0 + r1
            r1 = r7
            int r0 = r0 + r1
            r1 = r5
            byte[] r1 = r1.data
            int r1 = r1.length
            if (r0 <= r1) goto L2e
            r0 = r5
            r1 = 2
            r2 = r7
            int r1 = r1 + r2
            r0.enlarge(r1)
        L2e:
            r0 = r5
            byte[] r0 = r0.data
            r9 = r0
            r0 = r9
            r1 = r8
            int r8 = r8 + 1
            r2 = r7
            r3 = 8
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r9
            r1 = r8
            int r8 = r8 + 1
            r2 = r7
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = 0
            r10 = r0
        L4c:
            r0 = r10
            r1 = r7
            if (r0 >= r1) goto L89
            r0 = r6
            r1 = r10
            char r0 = r0.charAt(r1)
            r11 = r0
            r0 = r11
            r1 = 1
            if (r0 < r1) goto L74
            r0 = r11
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 > r1) goto L74
            r0 = r9
            r1 = r8
            int r8 = r8 + 1
            r2 = r11
            byte r2 = (byte) r2
            r0[r1] = r2
            goto L83
        L74:
            r0 = r5
            r1 = r8
            r0.length = r1
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = 65535(0xffff, float:9.1834E-41)
            org.objectweb.asm.ByteVector r0 = r0.encodeUtf8(r1, r2, r3)
            return r0
        L83:
            int r10 = r10 + 1
            goto L4c
        L89:
            r0 = r5
            r1 = r8
            r0.length = r1
            r0 = r5
            return r0
    }

    final org.objectweb.asm.ByteVector encodeUtf8(java.lang.String r7, int r8, int r9) {
            r6 = this;
            r0 = r7
            int r0 = r0.length()
            r10 = r0
            r0 = r8
            r11 = r0
            r0 = r8
            r12 = r0
        Lc:
            r0 = r12
            r1 = r10
            if (r0 >= r1) goto L45
            r0 = r7
            r1 = r12
            char r0 = r0.charAt(r1)
            r13 = r0
            r0 = r13
            r1 = 1
            if (r0 < r1) goto L2e
            r0 = r13
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 > r1) goto L2e
            int r11 = r11 + 1
            goto L3f
        L2e:
            r0 = r13
            r1 = 2047(0x7ff, float:2.868E-42)
            if (r0 > r1) goto L3c
            int r11 = r11 + 2
            goto L3f
        L3c:
            int r11 = r11 + 3
        L3f:
            int r12 = r12 + 1
            goto Lc
        L45:
            r0 = r11
            r1 = r9
            if (r0 <= r1) goto L55
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "UTF8 string too large"
            r1.<init>(r2)
            throw r0
        L55:
            r0 = r6
            int r0 = r0.length
            r1 = r8
            int r0 = r0 - r1
            r1 = 2
            int r0 = r0 - r1
            r12 = r0
            r0 = r12
            if (r0 < 0) goto L7d
            r0 = r6
            byte[] r0 = r0.data
            r1 = r12
            r2 = r11
            r3 = 8
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r6
            byte[] r0 = r0.data
            r1 = r12
            r2 = 1
            int r1 = r1 + r2
            r2 = r11
            byte r2 = (byte) r2
            r0[r1] = r2
        L7d:
            r0 = r6
            int r0 = r0.length
            r1 = r11
            int r0 = r0 + r1
            r1 = r8
            int r0 = r0 - r1
            r1 = r6
            byte[] r1 = r1.data
            int r1 = r1.length
            if (r0 <= r1) goto L96
            r0 = r6
            r1 = r11
            r2 = r8
            int r1 = r1 - r2
            r0.enlarge(r1)
        L96:
            r0 = r6
            int r0 = r0.length
            r13 = r0
            r0 = r8
            r14 = r0
        L9f:
            r0 = r14
            r1 = r10
            if (r0 >= r1) goto L149
            r0 = r7
            r1 = r14
            char r0 = r0.charAt(r1)
            r15 = r0
            r0 = r15
            r1 = 1
            if (r0 < r1) goto Lcb
            r0 = r15
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 > r1) goto Lcb
            r0 = r6
            byte[] r0 = r0.data
            r1 = r13
            int r13 = r13 + 1
            r2 = r15
            byte r2 = (byte) r2
            r0[r1] = r2
            goto L143
        Lcb:
            r0 = r15
            r1 = 2047(0x7ff, float:2.868E-42)
            if (r0 > r1) goto L101
            r0 = r6
            byte[] r0 = r0.data
            r1 = r13
            int r13 = r13 + 1
            r2 = 192(0xc0, float:2.69E-43)
            r3 = r15
            r4 = 6
            int r3 = r3 >> r4
            r4 = 31
            r3 = r3 & r4
            r2 = r2 | r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r6
            byte[] r0 = r0.data
            r1 = r13
            int r13 = r13 + 1
            r2 = 128(0x80, float:1.794E-43)
            r3 = r15
            r4 = 63
            r3 = r3 & r4
            r2 = r2 | r3
            byte r2 = (byte) r2
            r0[r1] = r2
            goto L143
        L101:
            r0 = r6
            byte[] r0 = r0.data
            r1 = r13
            int r13 = r13 + 1
            r2 = 224(0xe0, float:3.14E-43)
            r3 = r15
            r4 = 12
            int r3 = r3 >> r4
            r4 = 15
            r3 = r3 & r4
            r2 = r2 | r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r6
            byte[] r0 = r0.data
            r1 = r13
            int r13 = r13 + 1
            r2 = 128(0x80, float:1.794E-43)
            r3 = r15
            r4 = 6
            int r3 = r3 >> r4
            r4 = 63
            r3 = r3 & r4
            r2 = r2 | r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r6
            byte[] r0 = r0.data
            r1 = r13
            int r13 = r13 + 1
            r2 = 128(0x80, float:1.794E-43)
            r3 = r15
            r4 = 63
            r3 = r3 & r4
            r2 = r2 | r3
            byte r2 = (byte) r2
            r0[r1] = r2
        L143:
            int r14 = r14 + 1
            goto L9f
        L149:
            r0 = r6
            r1 = r13
            r0.length = r1
            r0 = r6
            return r0
    }

    public org.objectweb.asm.ByteVector putByteArray(byte[] r7, int r8, int r9) {
            r6 = this;
            r0 = r6
            int r0 = r0.length
            r1 = r9
            int r0 = r0 + r1
            r1 = r6
            byte[] r1 = r1.data
            int r1 = r1.length
            if (r0 <= r1) goto L13
            r0 = r6
            r1 = r9
            r0.enlarge(r1)
        L13:
            r0 = r7
            if (r0 == 0) goto L25
            r0 = r7
            r1 = r8
            r2 = r6
            byte[] r2 = r2.data
            r3 = r6
            int r3 = r3.length
            r4 = r9
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
        L25:
            r0 = r6
            r1 = r0
            int r1 = r1.length
            r2 = r9
            int r1 = r1 + r2
            r0.length = r1
            r0 = r6
            return r0
    }

    private void enlarge(int r7) {
            r6 = this;
            r0 = r6
            int r0 = r0.length
            r1 = r6
            byte[] r1 = r1.data
            int r1 = r1.length
            if (r0 <= r1) goto L16
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            java.lang.String r2 = "Internal error"
            r1.<init>(r2)
            throw r0
        L16:
            r0 = 2
            r1 = r6
            byte[] r1 = r1.data
            int r1 = r1.length
            int r0 = r0 * r1
            r8 = r0
            r0 = r6
            int r0 = r0.length
            r1 = r7
            int r0 = r0 + r1
            r9 = r0
            r0 = r8
            r1 = r9
            if (r0 <= r1) goto L2e
            r0 = r8
            goto L2f
        L2e:
            r0 = r9
        L2f:
            byte[] r0 = new byte[r0]
            r10 = r0
            r0 = r6
            byte[] r0 = r0.data
            r1 = 0
            r2 = r10
            r3 = 0
            r4 = r6
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r6
            r1 = r10
            r0.data = r1
            return
    }
}
