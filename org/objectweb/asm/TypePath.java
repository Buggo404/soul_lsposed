package org.objectweb.asm;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/TypePath.SCL.lombok */
public final class TypePath {
    public static final int ARRAY_ELEMENT = 0;
    public static final int INNER_TYPE = 1;
    public static final int WILDCARD_BOUND = 2;
    public static final int TYPE_ARGUMENT = 3;
    private final byte[] typePathContainer;
    private final int typePathOffset;

    TypePath(byte[] r4, int r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.typePathContainer = r1
            r0 = r3
            r1 = r5
            r0.typePathOffset = r1
            return
    }

    public int getLength() {
            r3 = this;
            r0 = r3
            byte[] r0 = r0.typePathContainer
            r1 = r3
            int r1 = r1.typePathOffset
            r0 = r0[r1]
            return r0
    }

    public int getStep(int r6) {
            r5 = this;
            r0 = r5
            byte[] r0 = r0.typePathContainer
            r1 = r5
            int r1 = r1.typePathOffset
            r2 = 2
            r3 = r6
            int r2 = r2 * r3
            int r1 = r1 + r2
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            return r0
    }

    public int getStepArgument(int r6) {
            r5 = this;
            r0 = r5
            byte[] r0 = r0.typePathContainer
            r1 = r5
            int r1 = r1.typePathOffset
            r2 = 2
            r3 = r6
            int r2 = r2 * r3
            int r1 = r1 + r2
            r2 = 2
            int r1 = r1 + r2
            r0 = r0[r1]
            return r0
    }

    public static org.objectweb.asm.TypePath fromString(java.lang.String r5) {
            r0 = r5
            if (r0 == 0) goto Lb
            r0 = r5
            int r0 = r0.length()
            if (r0 != 0) goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = r5
            int r0 = r0.length()
            r6 = r0
            org.objectweb.asm.ByteVector r0 = new org.objectweb.asm.ByteVector
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r7 = r0
            r0 = r7
            r1 = 0
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r0 = 0
            r8 = r0
        L23:
            r0 = r8
            r1 = r6
            if (r0 >= r1) goto Lcf
            r0 = r5
            r1 = r8
            int r8 = r8 + 1
            char r0 = r0.charAt(r1)
            r9 = r0
            r0 = r9
            r1 = 91
            if (r0 != r1) goto L43
            r0 = r7
            r1 = 0
            r2 = 0
            org.objectweb.asm.ByteVector r0 = r0.put11(r1, r2)
            goto Lcc
        L43:
            r0 = r9
            r1 = 46
            if (r0 != r1) goto L54
            r0 = r7
            r1 = 1
            r2 = 0
            org.objectweb.asm.ByteVector r0 = r0.put11(r1, r2)
            goto Lcc
        L54:
            r0 = r9
            r1 = 42
            if (r0 != r1) goto L65
            r0 = r7
            r1 = 2
            r2 = 0
            org.objectweb.asm.ByteVector r0 = r0.put11(r1, r2)
            goto Lcc
        L65:
            r0 = r9
            r1 = 48
            if (r0 < r1) goto Lc4
            r0 = r9
            r1 = 57
            if (r0 > r1) goto Lc4
            r0 = r9
            r1 = 48
            int r0 = r0 - r1
            r10 = r0
        L7a:
            r0 = r8
            r1 = r6
            if (r0 >= r1) goto Lb9
            r0 = r5
            r1 = r8
            int r8 = r8 + 1
            char r0 = r0.charAt(r1)
            r9 = r0
            r0 = r9
            r1 = 48
            if (r0 < r1) goto La7
            r0 = r9
            r1 = 57
            if (r0 > r1) goto La7
            r0 = r10
            r1 = 10
            int r0 = r0 * r1
            r1 = r9
            int r0 = r0 + r1
            r1 = 48
            int r0 = r0 - r1
            r10 = r0
            goto L7a
        La7:
            r0 = r9
            r1 = 59
            if (r0 != r1) goto Lb1
            goto Lb9
        Lb1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        Lb9:
            r0 = r7
            r1 = 3
            r2 = r10
            org.objectweb.asm.ByteVector r0 = r0.put11(r1, r2)
            goto Lcc
        Lc4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        Lcc:
            goto L23
        Lcf:
            r0 = r7
            byte[] r0 = r0.data
            r1 = 0
            r2 = r7
            int r2 = r2.length
            r3 = 2
            int r2 = r2 / r3
            byte r2 = (byte) r2
            r0[r1] = r2
            org.objectweb.asm.TypePath r0 = new org.objectweb.asm.TypePath
            r1 = r0
            r2 = r7
            byte[] r2 = r2.data
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public java.lang.String toString() {
            r5 = this;
            r0 = r5
            int r0 = r0.getLength()
            r6 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r6
            r3 = 2
            int r2 = r2 * r3
            r1.<init>(r2)
            r7 = r0
            r0 = 0
            r8 = r0
        L12:
            r0 = r8
            r1 = r6
            if (r0 >= r1) goto L7a
            r0 = r5
            r1 = r8
            int r0 = r0.getStep(r1)
            switch(r0) {
                case 0: goto L3c;
                case 1: goto L46;
                case 2: goto L50;
                case 3: goto L5a;
                default: goto L6c;
            }
        L3c:
            r0 = r7
            r1 = 91
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L74
        L46:
            r0 = r7
            r1 = 46
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L74
        L50:
            r0 = r7
            r1 = 42
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L74
        L5a:
            r0 = r7
            r1 = r5
            r2 = r8
            int r1 = r1.getStepArgument(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 59
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L74
        L6c:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L74:
            int r8 = r8 + 1
            goto L12
        L7a:
            r0 = r7
            java.lang.String r0 = r0.toString()
            return r0
    }

    static void put(org.objectweb.asm.TypePath r5, org.objectweb.asm.ByteVector r6) {
            r0 = r5
            if (r0 != 0) goto Ld
            r0 = r6
            r1 = 0
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            goto L29
        Ld:
            r0 = r5
            byte[] r0 = r0.typePathContainer
            r1 = r5
            int r1 = r1.typePathOffset
            r0 = r0[r1]
            r1 = 2
            int r0 = r0 * r1
            r1 = 1
            int r0 = r0 + r1
            r7 = r0
            r0 = r6
            r1 = r5
            byte[] r1 = r1.typePathContainer
            r2 = r5
            int r2 = r2.typePathOffset
            r3 = r7
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
        L29:
            return
    }
}
