package org.objectweb.asm;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/Label.SCL.lombok */
public class Label {
    static final int FLAG_DEBUG_ONLY = 1;
    static final int FLAG_JUMP_TARGET = 2;
    static final int FLAG_RESOLVED = 4;
    static final int FLAG_REACHABLE = 8;
    static final int FLAG_SUBROUTINE_CALLER = 16;
    static final int FLAG_SUBROUTINE_START = 32;
    static final int FLAG_SUBROUTINE_END = 64;
    static final int LINE_NUMBERS_CAPACITY_INCREMENT = 4;
    static final int FORWARD_REFERENCES_CAPACITY_INCREMENT = 6;
    static final int FORWARD_REFERENCE_TYPE_MASK = -268435456;
    static final int FORWARD_REFERENCE_TYPE_SHORT = 268435456;
    static final int FORWARD_REFERENCE_TYPE_WIDE = 536870912;
    static final int FORWARD_REFERENCE_HANDLE_MASK = 268435455;
    static final org.objectweb.asm.Label EMPTY_LIST = null;
    public java.lang.Object info;
    short flags;
    private short lineNumber;
    private int[] otherLineNumbers;
    int bytecodeOffset;
    private int[] forwardReferences;
    short inputStackSize;
    short outputStackSize;
    short outputStackMax;
    short subroutineId;
    org.objectweb.asm.Frame frame;
    org.objectweb.asm.Label nextBasicBlock;
    org.objectweb.asm.Edge outgoingEdges;
    org.objectweb.asm.Label nextListElement;

    public Label() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public int getOffset() {
            r4 = this;
            r0 = r4
            short r0 = r0.flags
            r1 = 4
            r0 = r0 & r1
            if (r0 != 0) goto L13
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Label offset position has not been resolved yet"
            r1.<init>(r2)
            throw r0
        L13:
            r0 = r4
            int r0 = r0.bytecodeOffset
            return r0
    }

    final org.objectweb.asm.Label getCanonicalInstance() {
            r2 = this;
            r0 = r2
            org.objectweb.asm.Frame r0 = r0.frame
            if (r0 != 0) goto Lb
            r0 = r2
            goto L12
        Lb:
            r0 = r2
            org.objectweb.asm.Frame r0 = r0.frame
            org.objectweb.asm.Label r0 = r0.owner
        L12:
            return r0
    }

    final void addLineNumber(int r7) {
            r6 = this;
            r0 = r6
            short r0 = r0.lineNumber
            if (r0 != 0) goto L10
            r0 = r6
            r1 = r7
            short r1 = (short) r1
            r0.lineNumber = r1
            goto L58
        L10:
            r0 = r6
            int[] r0 = r0.otherLineNumbers
            if (r0 != 0) goto L1e
            r0 = r6
            r1 = 4
            int[] r1 = new int[r1]
            r0.otherLineNumbers = r1
        L1e:
            r0 = r6
            int[] r0 = r0.otherLineNumbers
            r1 = 0
            r2 = r0; r3 = r1; 
            r2 = r2[r3]
            r3 = 1
            int r2 = r2 + r3
            r3 = r2; r2 = r1; r1 = r0; r0 = r3; 
            r1[r2] = r3
            r8 = r0
            r0 = r8
            r1 = r6
            int[] r1 = r1.otherLineNumbers
            int r1 = r1.length
            if (r0 < r1) goto L51
            r0 = r6
            int[] r0 = r0.otherLineNumbers
            int r0 = r0.length
            r1 = 4
            int r0 = r0 + r1
            int[] r0 = new int[r0]
            r9 = r0
            r0 = r6
            int[] r0 = r0.otherLineNumbers
            r1 = 0
            r2 = r9
            r3 = 0
            r4 = r6
            int[] r4 = r4.otherLineNumbers
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r6
            r1 = r9
            r0.otherLineNumbers = r1
        L51:
            r0 = r6
            int[] r0 = r0.otherLineNumbers
            r1 = r8
            r2 = r7
            r0[r1] = r2
        L58:
            return
    }

    final void accept(org.objectweb.asm.MethodVisitor r5, boolean r6) {
            r4 = this;
            r0 = r5
            r1 = r4
            r0.visitLabel(r1)
            r0 = r6
            if (r0 == 0) goto L40
            r0 = r4
            short r0 = r0.lineNumber
            if (r0 == 0) goto L40
            r0 = r5
            r1 = r4
            short r1 = r1.lineNumber
            r2 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r2
            r2 = r4
            r0.visitLineNumber(r1, r2)
            r0 = r4
            int[] r0 = r0.otherLineNumbers
            if (r0 == 0) goto L40
            r0 = 1
            r7 = r0
        L25:
            r0 = r7
            r1 = r4
            int[] r1 = r1.otherLineNumbers
            r2 = 0
            r1 = r1[r2]
            if (r0 > r1) goto L40
            r0 = r5
            r1 = r4
            int[] r1 = r1.otherLineNumbers
            r2 = r7
            r1 = r1[r2]
            r2 = r4
            r0.visitLineNumber(r1, r2)
            int r7 = r7 + 1
            goto L25
        L40:
            return
    }

    final void put(org.objectweb.asm.ByteVector r6, int r7, boolean r8) {
            r5 = this;
            r0 = r5
            short r0 = r0.flags
            r1 = 4
            r0 = r0 & r1
            if (r0 != 0) goto L35
            r0 = r8
            if (r0 == 0) goto L21
            r0 = r5
            r1 = r7
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            r3 = r6
            int r3 = r3.length
            r0.addForwardReference(r1, r2, r3)
            r0 = r6
            r1 = -1
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            goto L52
        L21:
            r0 = r5
            r1 = r7
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r6
            int r3 = r3.length
            r0.addForwardReference(r1, r2, r3)
            r0 = r6
            r1 = -1
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            goto L52
        L35:
            r0 = r8
            if (r0 == 0) goto L47
            r0 = r6
            r1 = r5
            int r1 = r1.bytecodeOffset
            r2 = r7
            int r1 = r1 - r2
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            goto L52
        L47:
            r0 = r6
            r1 = r5
            int r1 = r1.bytecodeOffset
            r2 = r7
            int r1 = r1 - r2
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
        L52:
            return
    }

    private void addForwardReference(int r7, int r8, int r9) {
            r6 = this;
            r0 = r6
            int[] r0 = r0.forwardReferences
            if (r0 != 0) goto Lf
            r0 = r6
            r1 = 6
            int[] r1 = new int[r1]
            r0.forwardReferences = r1
        Lf:
            r0 = r6
            int[] r0 = r0.forwardReferences
            r1 = 0
            r0 = r0[r1]
            r10 = r0
            r0 = r10
            r1 = 2
            int r0 = r0 + r1
            r1 = r6
            int[] r1 = r1.forwardReferences
            int r1 = r1.length
            if (r0 < r1) goto L45
            r0 = r6
            int[] r0 = r0.forwardReferences
            int r0 = r0.length
            r1 = 6
            int r0 = r0 + r1
            int[] r0 = new int[r0]
            r11 = r0
            r0 = r6
            int[] r0 = r0.forwardReferences
            r1 = 0
            r2 = r11
            r3 = 0
            r4 = r6
            int[] r4 = r4.forwardReferences
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r6
            r1 = r11
            r0.forwardReferences = r1
        L45:
            r0 = r6
            int[] r0 = r0.forwardReferences
            int r10 = r10 + 1
            r1 = r10
            r2 = r7
            r0[r1] = r2
            r0 = r6
            int[] r0 = r0.forwardReferences
            int r10 = r10 + 1
            r1 = r10
            r2 = r8
            r3 = r9
            r2 = r2 | r3
            r0[r1] = r2
            r0 = r6
            int[] r0 = r0.forwardReferences
            r1 = 0
            r2 = r10
            r0[r1] = r2
            return
    }

    final boolean resolve(byte[] r6, int r7) {
            r5 = this;
            r0 = r5
            r1 = r0
            short r1 = r1.flags
            r2 = 4
            r1 = r1 | r2
            short r1 = (short) r1
            r0.flags = r1
            r0 = r5
            r1 = r7
            r0.bytecodeOffset = r1
            r0 = r5
            int[] r0 = r0.forwardReferences
            if (r0 != 0) goto L19
            r0 = 0
            return r0
        L19:
            r0 = 0
            r8 = r0
            r0 = r5
            int[] r0 = r0.forwardReferences
            r1 = 0
            r0 = r0[r1]
            r9 = r0
        L23:
            r0 = r9
            if (r0 <= 0) goto Ld9
            r0 = r5
            int[] r0 = r0.forwardReferences
            r1 = r9
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r10 = r0
            r0 = r5
            int[] r0 = r0.forwardReferences
            r1 = r9
            r0 = r0[r1]
            r11 = r0
            r0 = r7
            r1 = r10
            int r0 = r0 - r1
            r12 = r0
            r0 = r11
            r1 = 268435455(0xfffffff, float:2.5243547E-29)
            r0 = r0 & r1
            r13 = r0
            r0 = r11
            r1 = -268435456(0xfffffffff0000000, float:-1.58456325E29)
            r0 = r0 & r1
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            if (r0 != r1) goto La5
            r0 = r12
            r1 = -32768(0xffffffffffff8000, float:NaN)
            if (r0 < r1) goto L63
            r0 = r12
            r1 = 32767(0x7fff, float:4.5916E-41)
            if (r0 <= r1) goto L8e
        L63:
            r0 = r6
            r1 = r10
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r14 = r0
            r0 = r14
            r1 = 198(0xc6, float:2.77E-43)
            if (r0 >= r1) goto L82
            r0 = r6
            r1 = r10
            r2 = r14
            r3 = 49
            int r2 = r2 + r3
            byte r2 = (byte) r2
            r0[r1] = r2
            goto L8c
        L82:
            r0 = r6
            r1 = r10
            r2 = r14
            r3 = 20
            int r2 = r2 + r3
            byte r2 = (byte) r2
            r0[r1] = r2
        L8c:
            r0 = 1
            r8 = r0
        L8e:
            r0 = r6
            r1 = r13
            int r13 = r13 + 1
            r2 = r12
            r3 = 8
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r6
            r1 = r13
            r2 = r12
            byte r2 = (byte) r2
            r0[r1] = r2
            goto Ld3
        La5:
            r0 = r6
            r1 = r13
            int r13 = r13 + 1
            r2 = r12
            r3 = 24
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r6
            r1 = r13
            int r13 = r13 + 1
            r2 = r12
            r3 = 16
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r6
            r1 = r13
            int r13 = r13 + 1
            r2 = r12
            r3 = 8
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r6
            r1 = r13
            r2 = r12
            byte r2 = (byte) r2
            r0[r1] = r2
        Ld3:
            int r9 = r9 + (-2)
            goto L23
        Ld9:
            r0 = r8
            return r0
    }

    final void markSubroutine(short r4) {
            r3 = this;
            r0 = r3
            r5 = r0
            r0 = r5
            org.objectweb.asm.Label r1 = org.objectweb.asm.Label.EMPTY_LIST
            r0.nextListElement = r1
        L9:
            r0 = r5
            org.objectweb.asm.Label r1 = org.objectweb.asm.Label.EMPTY_LIST
            if (r0 == r1) goto L31
            r0 = r5
            r6 = r0
            r0 = r5
            org.objectweb.asm.Label r0 = r0.nextListElement
            r5 = r0
            r0 = r6
            r1 = 0
            r0.nextListElement = r1
            r0 = r6
            short r0 = r0.subroutineId
            if (r0 != 0) goto L2e
            r0 = r6
            r1 = r4
            r0.subroutineId = r1
            r0 = r6
            r1 = r5
            org.objectweb.asm.Label r0 = r0.pushSuccessors(r1)
            r5 = r0
        L2e:
            goto L9
        L31:
            return
    }

    final void addSubroutineRetSuccessors(org.objectweb.asm.Label r8) {
            r7 = this;
            org.objectweb.asm.Label r0 = org.objectweb.asm.Label.EMPTY_LIST
            r9 = r0
            r0 = r7
            r10 = r0
            r0 = r10
            org.objectweb.asm.Label r1 = org.objectweb.asm.Label.EMPTY_LIST
            r0.nextListElement = r1
        Ld:
            r0 = r10
            org.objectweb.asm.Label r1 = org.objectweb.asm.Label.EMPTY_LIST
            if (r0 == r1) goto L64
            r0 = r10
            r11 = r0
            r0 = r11
            org.objectweb.asm.Label r0 = r0.nextListElement
            r10 = r0
            r0 = r11
            r1 = r9
            r0.nextListElement = r1
            r0 = r11
            r9 = r0
            r0 = r11
            short r0 = r0.flags
            r1 = 64
            r0 = r0 & r1
            if (r0 == 0) goto L5a
            r0 = r11
            short r0 = r0.subroutineId
            r1 = r8
            short r1 = r1.subroutineId
            if (r0 == r1) goto L5a
            r0 = r11
            org.objectweb.asm.Edge r1 = new org.objectweb.asm.Edge
            r2 = r1
            r3 = r11
            short r3 = r3.outputStackSize
            r4 = r8
            org.objectweb.asm.Edge r4 = r4.outgoingEdges
            org.objectweb.asm.Label r4 = r4.successor
            r5 = r11
            org.objectweb.asm.Edge r5 = r5.outgoingEdges
            r2.<init>(r3, r4, r5)
            r0.outgoingEdges = r1
        L5a:
            r0 = r11
            r1 = r10
            org.objectweb.asm.Label r0 = r0.pushSuccessors(r1)
            r10 = r0
            goto Ld
        L64:
            r0 = r9
            org.objectweb.asm.Label r1 = org.objectweb.asm.Label.EMPTY_LIST
            if (r0 == r1) goto L7c
            r0 = r9
            org.objectweb.asm.Label r0 = r0.nextListElement
            r11 = r0
            r0 = r9
            r1 = 0
            r0.nextListElement = r1
            r0 = r11
            r9 = r0
            goto L64
        L7c:
            return
    }

    private org.objectweb.asm.Label pushSuccessors(org.objectweb.asm.Label r4) {
            r3 = this;
            r0 = r4
            r5 = r0
            r0 = r3
            org.objectweb.asm.Edge r0 = r0.outgoingEdges
            r6 = r0
        L7:
            r0 = r6
            if (r0 == 0) goto L4b
            r0 = r3
            short r0 = r0.flags
            r1 = 16
            r0 = r0 & r1
            if (r0 == 0) goto L24
            r0 = r6
            r1 = r3
            org.objectweb.asm.Edge r1 = r1.outgoingEdges
            org.objectweb.asm.Edge r1 = r1.nextEdge
            if (r0 != r1) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L43
            r0 = r6
            org.objectweb.asm.Label r0 = r0.successor
            org.objectweb.asm.Label r0 = r0.nextListElement
            if (r0 != 0) goto L43
            r0 = r6
            org.objectweb.asm.Label r0 = r0.successor
            r1 = r5
            r0.nextListElement = r1
            r0 = r6
            org.objectweb.asm.Label r0 = r0.successor
            r5 = r0
        L43:
            r0 = r6
            org.objectweb.asm.Edge r0 = r0.nextEdge
            r6 = r0
            goto L7
        L4b:
            r0 = r5
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "L"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            int r1 = java.lang.System.identityHashCode(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    static {
            org.objectweb.asm.Label r0 = new org.objectweb.asm.Label
            r1 = r0
            r1.<init>()
            org.objectweb.asm.Label.EMPTY_LIST = r0
            return
    }
}
