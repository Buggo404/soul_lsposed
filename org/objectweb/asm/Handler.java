package org.objectweb.asm;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/Handler.SCL.lombok */
final class Handler {
    final org.objectweb.asm.Label startPc;
    final org.objectweb.asm.Label endPc;
    final org.objectweb.asm.Label handlerPc;
    final int catchType;
    final java.lang.String catchTypeDescriptor;
    org.objectweb.asm.Handler nextHandler;

    Handler(org.objectweb.asm.Label r4, org.objectweb.asm.Label r5, org.objectweb.asm.Label r6, int r7, java.lang.String r8) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.startPc = r1
            r0 = r3
            r1 = r5
            r0.endPc = r1
            r0 = r3
            r1 = r6
            r0.handlerPc = r1
            r0 = r3
            r1 = r7
            r0.catchType = r1
            r0 = r3
            r1 = r8
            r0.catchTypeDescriptor = r1
            return
    }

    Handler(org.objectweb.asm.Handler r8, org.objectweb.asm.Label r9, org.objectweb.asm.Label r10) {
            r7 = this;
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r8
            org.objectweb.asm.Label r3 = r3.handlerPc
            r4 = r8
            int r4 = r4.catchType
            r5 = r8
            java.lang.String r5 = r5.catchTypeDescriptor
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = r7
            r1 = r8
            org.objectweb.asm.Handler r1 = r1.nextHandler
            r0.nextHandler = r1
            return
    }

    static org.objectweb.asm.Handler removeRange(org.objectweb.asm.Handler r7, org.objectweb.asm.Label r8, org.objectweb.asm.Label r9) {
            r0 = r7
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r7
            r1 = r7
            org.objectweb.asm.Handler r1 = r1.nextHandler
            r2 = r8
            r3 = r9
            org.objectweb.asm.Handler r1 = removeRange(r1, r2, r3)
            r0.nextHandler = r1
            r0 = r7
            org.objectweb.asm.Label r0 = r0.startPc
            int r0 = r0.bytecodeOffset
            r10 = r0
            r0 = r7
            org.objectweb.asm.Label r0 = r0.endPc
            int r0 = r0.bytecodeOffset
            r11 = r0
            r0 = r8
            int r0 = r0.bytecodeOffset
            r12 = r0
            r0 = r9
            if (r0 != 0) goto L33
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L37
        L33:
            r0 = r9
            int r0 = r0.bytecodeOffset
        L37:
            r13 = r0
            r0 = r12
            r1 = r11
            if (r0 >= r1) goto L46
            r0 = r13
            r1 = r10
            if (r0 > r1) goto L48
        L46:
            r0 = r7
            return r0
        L48:
            r0 = r12
            r1 = r10
            if (r0 > r1) goto L68
            r0 = r13
            r1 = r11
            if (r0 < r1) goto L5a
            r0 = r7
            org.objectweb.asm.Handler r0 = r0.nextHandler
            return r0
        L5a:
            org.objectweb.asm.Handler r0 = new org.objectweb.asm.Handler
            r1 = r0
            r2 = r7
            r3 = r9
            r4 = r7
            org.objectweb.asm.Label r4 = r4.endPc
            r1.<init>(r2, r3, r4)
            return r0
        L68:
            r0 = r13
            r1 = r11
            if (r0 < r1) goto L7d
            org.objectweb.asm.Handler r0 = new org.objectweb.asm.Handler
            r1 = r0
            r2 = r7
            r3 = r7
            org.objectweb.asm.Label r3 = r3.startPc
            r4 = r8
            r1.<init>(r2, r3, r4)
            return r0
        L7d:
            r0 = r7
            org.objectweb.asm.Handler r1 = new org.objectweb.asm.Handler
            r2 = r1
            r3 = r7
            r4 = r9
            r5 = r7
            org.objectweb.asm.Label r5 = r5.endPc
            r2.<init>(r3, r4, r5)
            r0.nextHandler = r1
            org.objectweb.asm.Handler r0 = new org.objectweb.asm.Handler
            r1 = r0
            r2 = r7
            r3 = r7
            org.objectweb.asm.Label r3 = r3.startPc
            r4 = r8
            r1.<init>(r2, r3, r4)
            return r0
    }

    static int getExceptionTableLength(org.objectweb.asm.Handler r2) {
            r0 = 0
            r3 = r0
            r0 = r2
            r4 = r0
        L4:
            r0 = r4
            if (r0 == 0) goto L13
            int r3 = r3 + 1
            r0 = r4
            org.objectweb.asm.Handler r0 = r0.nextHandler
            r4 = r0
            goto L4
        L13:
            r0 = r3
            return r0
    }

    static int getExceptionTableSize(org.objectweb.asm.Handler r4) {
            r0 = 2
            r1 = 8
            r2 = r4
            int r2 = getExceptionTableLength(r2)
            int r1 = r1 * r2
            int r0 = r0 + r1
            return r0
    }

    static void putExceptionTable(org.objectweb.asm.Handler r3, org.objectweb.asm.ByteVector r4) {
            r0 = r4
            r1 = r3
            int r1 = getExceptionTableLength(r1)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r3
            r5 = r0
        Lb:
            r0 = r5
            if (r0 == 0) goto L3e
            r0 = r4
            r1 = r5
            org.objectweb.asm.Label r1 = r1.startPc
            int r1 = r1.bytecodeOffset
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r5
            org.objectweb.asm.Label r1 = r1.endPc
            int r1 = r1.bytecodeOffset
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r5
            org.objectweb.asm.Label r1 = r1.handlerPc
            int r1 = r1.bytecodeOffset
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r5
            int r1 = r1.catchType
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r5
            org.objectweb.asm.Handler r0 = r0.nextHandler
            r5 = r0
            goto Lb
        L3e:
            return
    }
}
