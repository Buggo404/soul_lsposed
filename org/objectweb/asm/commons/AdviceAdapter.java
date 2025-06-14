package org.objectweb.asm.commons;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/commons/AdviceAdapter.SCL.lombok */
public abstract class AdviceAdapter extends org.objectweb.asm.commons.GeneratorAdapter implements org.objectweb.asm.Opcodes {
    private static final java.lang.Object UNINITIALIZED_THIS = null;
    private static final java.lang.Object OTHER = null;
    private static final java.lang.String INVALID_OPCODE = "Invalid opcode ";
    protected int methodAccess;
    protected java.lang.String methodDesc;
    private final boolean isConstructor;
    private boolean superClassConstructorCalled;
    private java.util.List<java.lang.Object> stackFrame;
    private java.util.Map<org.objectweb.asm.Label, java.util.List<java.lang.Object>> forwardJumpStackFrames;

    protected AdviceAdapter(int r8, org.objectweb.asm.MethodVisitor r9, int r10, java.lang.String r11, java.lang.String r12) {
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = r7
            r1 = r10
            r0.methodAccess = r1
            r0 = r7
            r1 = r12
            r0.methodDesc = r1
            r0 = r7
            java.lang.String r1 = "<init>"
            r2 = r11
            boolean r1 = r1.equals(r2)
            r0.isConstructor = r1
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitCode() {
            r4 = this;
            r0 = r4
            super.visitCode()
            r0 = r4
            boolean r0 = r0.isConstructor
            if (r0 == 0) goto L24
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.stackFrame = r1
            r0 = r4
            java.util.HashMap r1 = new java.util.HashMap
            r2 = r1
            r2.<init>()
            r0.forwardJumpStackFrames = r1
            goto L28
        L24:
            r0 = r4
            r0.onMethodEnter()
        L28:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLabel(org.objectweb.asm.Label r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.visitLabel(r1)
            r0 = r3
            boolean r0 = r0.isConstructor
            if (r0 == 0) goto L3a
            r0 = r3
            java.util.Map<org.objectweb.asm.Label, java.util.List<java.lang.Object>> r0 = r0.forwardJumpStackFrames
            if (r0 == 0) goto L3a
            r0 = r3
            java.util.Map<org.objectweb.asm.Label, java.util.List<java.lang.Object>> r0 = r0.forwardJumpStackFrames
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L3a
            r0 = r3
            r1 = r5
            r0.stackFrame = r1
            r0 = r3
            r1 = 0
            r0.superClassConstructorCalled = r1
            r0 = r3
            java.util.Map<org.objectweb.asm.Label, java.util.List<java.lang.Object>> r0 = r0.forwardJumpStackFrames
            r1 = r4
            java.lang.Object r0 = r0.remove(r1)
        L3a:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInsn(int r7) {
            r6 = this;
            r0 = r6
            boolean r0 = r0.isConstructor
            if (r0 == 0) goto L506
            r0 = r6
            boolean r0 = r0.superClassConstructorCalled
            if (r0 != 0) goto L506
            r0 = r7
            switch(r0) {
                case 0: goto L353;
                case 1: goto L356;
                case 2: goto L356;
                case 3: goto L356;
                case 4: goto L356;
                case 5: goto L356;
                case 6: goto L356;
                case 7: goto L356;
                case 8: goto L356;
                case 9: goto L360;
                case 10: goto L360;
                case 11: goto L356;
                case 12: goto L356;
                case 13: goto L356;
                case 14: goto L360;
                case 15: goto L360;
                case 16: goto L4eb;
                case 17: goto L4eb;
                case 18: goto L4eb;
                case 19: goto L4eb;
                case 20: goto L4eb;
                case 21: goto L4eb;
                case 22: goto L4eb;
                case 23: goto L4eb;
                case 24: goto L4eb;
                case 25: goto L4eb;
                case 26: goto L4eb;
                case 27: goto L4eb;
                case 28: goto L4eb;
                case 29: goto L4eb;
                case 30: goto L4eb;
                case 31: goto L4eb;
                case 32: goto L4eb;
                case 33: goto L4eb;
                case 34: goto L4eb;
                case 35: goto L4eb;
                case 36: goto L4eb;
                case 37: goto L4eb;
                case 38: goto L4eb;
                case 39: goto L4eb;
                case 40: goto L4eb;
                case 41: goto L4eb;
                case 42: goto L4eb;
                case 43: goto L4eb;
                case 44: goto L4eb;
                case 45: goto L4eb;
                case 46: goto L371;
                case 47: goto L353;
                case 48: goto L371;
                case 49: goto L353;
                case 50: goto L371;
                case 51: goto L371;
                case 52: goto L371;
                case 53: goto L371;
                case 54: goto L4eb;
                case 55: goto L4eb;
                case 56: goto L4eb;
                case 57: goto L4eb;
                case 58: goto L4eb;
                case 59: goto L4eb;
                case 60: goto L4eb;
                case 61: goto L4eb;
                case 62: goto L4eb;
                case 63: goto L4eb;
                case 64: goto L4eb;
                case 65: goto L4eb;
                case 66: goto L4eb;
                case 67: goto L4eb;
                case 68: goto L4eb;
                case 69: goto L4eb;
                case 70: goto L4eb;
                case 71: goto L4eb;
                case 72: goto L4eb;
                case 73: goto L4eb;
                case 74: goto L4eb;
                case 75: goto L4eb;
                case 76: goto L4eb;
                case 77: goto L4eb;
                case 78: goto L4eb;
                case 79: goto L386;
                case 80: goto L398;
                case 81: goto L386;
                case 82: goto L398;
                case 83: goto L386;
                case 84: goto L386;
                case 85: goto L386;
                case 86: goto L386;
                case 87: goto L371;
                case 88: goto L379;
                case 89: goto L3af;
                case 90: goto L3ba;
                case 91: goto L3df;
                case 92: goto L404;
                case 93: goto L441;
                case 94: goto L47e;
                case 95: goto L4bb;
                case 96: goto L371;
                case 97: goto L379;
                case 98: goto L371;
                case 99: goto L379;
                case 100: goto L371;
                case 101: goto L379;
                case 102: goto L371;
                case 103: goto L379;
                case 104: goto L371;
                case 105: goto L379;
                case 106: goto L371;
                case 107: goto L379;
                case 108: goto L371;
                case 109: goto L379;
                case 110: goto L371;
                case 111: goto L379;
                case 112: goto L371;
                case 113: goto L379;
                case 114: goto L371;
                case 115: goto L379;
                case 116: goto L353;
                case 117: goto L353;
                case 118: goto L353;
                case 119: goto L353;
                case 120: goto L371;
                case 121: goto L371;
                case 122: goto L371;
                case 123: goto L371;
                case 124: goto L371;
                case 125: goto L371;
                case 126: goto L371;
                case 127: goto L379;
                case 128: goto L371;
                case 129: goto L379;
                case 130: goto L371;
                case 131: goto L379;
                case 132: goto L4eb;
                case 133: goto L356;
                case 134: goto L353;
                case 135: goto L356;
                case 136: goto L371;
                case 137: goto L371;
                case 138: goto L353;
                case 139: goto L353;
                case 140: goto L356;
                case 141: goto L356;
                case 142: goto L371;
                case 143: goto L353;
                case 144: goto L371;
                case 145: goto L353;
                case 146: goto L353;
                case 147: goto L353;
                case 148: goto L386;
                case 149: goto L371;
                case 150: goto L371;
                case 151: goto L386;
                case 152: goto L386;
                case 153: goto L4eb;
                case 154: goto L4eb;
                case 155: goto L4eb;
                case 156: goto L4eb;
                case 157: goto L4eb;
                case 158: goto L4eb;
                case 159: goto L4eb;
                case 160: goto L4eb;
                case 161: goto L4eb;
                case 162: goto L4eb;
                case 163: goto L4eb;
                case 164: goto L4eb;
                case 165: goto L4eb;
                case 166: goto L4eb;
                case 167: goto L4eb;
                case 168: goto L4eb;
                case 169: goto L4eb;
                case 170: goto L4eb;
                case 171: goto L4eb;
                case 172: goto L32c;
                case 173: goto L32c;
                case 174: goto L32c;
                case 175: goto L32c;
                case 176: goto L32c;
                case 177: goto L336;
                case 178: goto L4eb;
                case 179: goto L4eb;
                case 180: goto L4eb;
                case 181: goto L4eb;
                case 182: goto L4eb;
                case 183: goto L4eb;
                case 184: goto L4eb;
                case 185: goto L4eb;
                case 186: goto L4eb;
                case 187: goto L4eb;
                case 188: goto L4eb;
                case 189: goto L4eb;
                case 190: goto L353;
                case 191: goto L342;
                case 192: goto L4eb;
                case 193: goto L4eb;
                case 194: goto L371;
                case 195: goto L371;
                default: goto L4eb;
            }
        L32c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Invalid return in constructor"
            r1.<init>(r2)
            throw r0
        L336:
            r0 = r6
            r1 = r7
            r0.onMethodExit(r1)
            r0 = r6
            r0.endConstructorBasicBlockWithoutSuccessor()
            goto L56c
        L342:
            r0 = r6
            java.lang.Object r0 = r0.popValue()
            r0 = r6
            r1 = r7
            r0.onMethodExit(r1)
            r0 = r6
            r0.endConstructorBasicBlockWithoutSuccessor()
            goto L56c
        L353:
            goto L56c
        L356:
            r0 = r6
            java.lang.Object r1 = org.objectweb.asm.commons.AdviceAdapter.OTHER
            r0.pushValue(r1)
            goto L56c
        L360:
            r0 = r6
            java.lang.Object r1 = org.objectweb.asm.commons.AdviceAdapter.OTHER
            r0.pushValue(r1)
            r0 = r6
            java.lang.Object r1 = org.objectweb.asm.commons.AdviceAdapter.OTHER
            r0.pushValue(r1)
            goto L56c
        L371:
            r0 = r6
            java.lang.Object r0 = r0.popValue()
            goto L56c
        L379:
            r0 = r6
            java.lang.Object r0 = r0.popValue()
            r0 = r6
            java.lang.Object r0 = r0.popValue()
            goto L56c
        L386:
            r0 = r6
            java.lang.Object r0 = r0.popValue()
            r0 = r6
            java.lang.Object r0 = r0.popValue()
            r0 = r6
            java.lang.Object r0 = r0.popValue()
            goto L56c
        L398:
            r0 = r6
            java.lang.Object r0 = r0.popValue()
            r0 = r6
            java.lang.Object r0 = r0.popValue()
            r0 = r6
            java.lang.Object r0 = r0.popValue()
            r0 = r6
            java.lang.Object r0 = r0.popValue()
            goto L56c
        L3af:
            r0 = r6
            r1 = r6
            java.lang.Object r1 = r1.peekValue()
            r0.pushValue(r1)
            goto L56c
        L3ba:
            r0 = r6
            java.util.List<java.lang.Object> r0 = r0.stackFrame
            int r0 = r0.size()
            r8 = r0
            r0 = r6
            java.util.List<java.lang.Object> r0 = r0.stackFrame
            r1 = r8
            r2 = 2
            int r1 = r1 - r2
            r2 = r6
            java.util.List<java.lang.Object> r2 = r2.stackFrame
            r3 = r8
            r4 = 1
            int r3 = r3 - r4
            java.lang.Object r2 = r2.get(r3)
            r0.add(r1, r2)
            goto L56c
        L3df:
            r0 = r6
            java.util.List<java.lang.Object> r0 = r0.stackFrame
            int r0 = r0.size()
            r8 = r0
            r0 = r6
            java.util.List<java.lang.Object> r0 = r0.stackFrame
            r1 = r8
            r2 = 3
            int r1 = r1 - r2
            r2 = r6
            java.util.List<java.lang.Object> r2 = r2.stackFrame
            r3 = r8
            r4 = 1
            int r3 = r3 - r4
            java.lang.Object r2 = r2.get(r3)
            r0.add(r1, r2)
            goto L56c
        L404:
            r0 = r6
            java.util.List<java.lang.Object> r0 = r0.stackFrame
            int r0 = r0.size()
            r8 = r0
            r0 = r6
            java.util.List<java.lang.Object> r0 = r0.stackFrame
            r1 = r8
            r2 = 2
            int r1 = r1 - r2
            r2 = r6
            java.util.List<java.lang.Object> r2 = r2.stackFrame
            r3 = r8
            r4 = 1
            int r3 = r3 - r4
            java.lang.Object r2 = r2.get(r3)
            r0.add(r1, r2)
            r0 = r6
            java.util.List<java.lang.Object> r0 = r0.stackFrame
            r1 = r8
            r2 = 2
            int r1 = r1 - r2
            r2 = r6
            java.util.List<java.lang.Object> r2 = r2.stackFrame
            r3 = r8
            r4 = 1
            int r3 = r3 - r4
            java.lang.Object r2 = r2.get(r3)
            r0.add(r1, r2)
            goto L56c
        L441:
            r0 = r6
            java.util.List<java.lang.Object> r0 = r0.stackFrame
            int r0 = r0.size()
            r8 = r0
            r0 = r6
            java.util.List<java.lang.Object> r0 = r0.stackFrame
            r1 = r8
            r2 = 3
            int r1 = r1 - r2
            r2 = r6
            java.util.List<java.lang.Object> r2 = r2.stackFrame
            r3 = r8
            r4 = 1
            int r3 = r3 - r4
            java.lang.Object r2 = r2.get(r3)
            r0.add(r1, r2)
            r0 = r6
            java.util.List<java.lang.Object> r0 = r0.stackFrame
            r1 = r8
            r2 = 3
            int r1 = r1 - r2
            r2 = r6
            java.util.List<java.lang.Object> r2 = r2.stackFrame
            r3 = r8
            r4 = 1
            int r3 = r3 - r4
            java.lang.Object r2 = r2.get(r3)
            r0.add(r1, r2)
            goto L56c
        L47e:
            r0 = r6
            java.util.List<java.lang.Object> r0 = r0.stackFrame
            int r0 = r0.size()
            r8 = r0
            r0 = r6
            java.util.List<java.lang.Object> r0 = r0.stackFrame
            r1 = r8
            r2 = 4
            int r1 = r1 - r2
            r2 = r6
            java.util.List<java.lang.Object> r2 = r2.stackFrame
            r3 = r8
            r4 = 1
            int r3 = r3 - r4
            java.lang.Object r2 = r2.get(r3)
            r0.add(r1, r2)
            r0 = r6
            java.util.List<java.lang.Object> r0 = r0.stackFrame
            r1 = r8
            r2 = 4
            int r1 = r1 - r2
            r2 = r6
            java.util.List<java.lang.Object> r2 = r2.stackFrame
            r3 = r8
            r4 = 1
            int r3 = r3 - r4
            java.lang.Object r2 = r2.get(r3)
            r0.add(r1, r2)
            goto L56c
        L4bb:
            r0 = r6
            java.util.List<java.lang.Object> r0 = r0.stackFrame
            int r0 = r0.size()
            r8 = r0
            r0 = r6
            java.util.List<java.lang.Object> r0 = r0.stackFrame
            r1 = r8
            r2 = 2
            int r1 = r1 - r2
            r2 = r6
            java.util.List<java.lang.Object> r2 = r2.stackFrame
            r3 = r8
            r4 = 1
            int r3 = r3 - r4
            java.lang.Object r2 = r2.get(r3)
            r0.add(r1, r2)
            r0 = r6
            java.util.List<java.lang.Object> r0 = r0.stackFrame
            r1 = r8
            java.lang.Object r0 = r0.remove(r1)
            goto L56c
        L4eb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Invalid opcode "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L506:
            r0 = r7
            switch(r0) {
                case 172: goto L564;
                case 173: goto L564;
                case 174: goto L564;
                case 175: goto L564;
                case 176: goto L564;
                case 177: goto L564;
                case 178: goto L56c;
                case 179: goto L56c;
                case 180: goto L56c;
                case 181: goto L56c;
                case 182: goto L56c;
                case 183: goto L56c;
                case 184: goto L56c;
                case 185: goto L56c;
                case 186: goto L56c;
                case 187: goto L56c;
                case 188: goto L56c;
                case 189: goto L56c;
                case 190: goto L56c;
                case 191: goto L564;
                default: goto L56c;
            }
        L564:
            r0 = r6
            r1 = r7
            r0.onMethodExit(r1)
            goto L56c
        L56c:
            r0 = r6
            r1 = r7
            super.visitInsn(r1)
            return
    }

    @Override // org.objectweb.asm.commons.LocalVariablesSorter, org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int r6, int r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            super.visitVarInsn(r1, r2)
            r0 = r5
            boolean r0 = r0.isConstructor
            if (r0 == 0) goto Lde
            r0 = r5
            boolean r0 = r0.superClassConstructorCalled
            if (r0 != 0) goto Lde
            r0 = r6
            switch(r0) {
                case 21: goto L78;
                case 22: goto L82;
                case 23: goto L78;
                case 24: goto L82;
                case 25: goto L93;
                case 54: goto La7;
                case 55: goto Laf;
                case 56: goto La7;
                case 57: goto Laf;
                case 58: goto La7;
                case 169: goto Lbc;
                default: goto Lc3;
            }
        L78:
            r0 = r5
            java.lang.Object r1 = org.objectweb.asm.commons.AdviceAdapter.OTHER
            r0.pushValue(r1)
            goto Lde
        L82:
            r0 = r5
            java.lang.Object r1 = org.objectweb.asm.commons.AdviceAdapter.OTHER
            r0.pushValue(r1)
            r0 = r5
            java.lang.Object r1 = org.objectweb.asm.commons.AdviceAdapter.OTHER
            r0.pushValue(r1)
            goto Lde
        L93:
            r0 = r5
            r1 = r7
            if (r1 != 0) goto L9e
            java.lang.Object r1 = org.objectweb.asm.commons.AdviceAdapter.UNINITIALIZED_THIS
            goto La1
        L9e:
            java.lang.Object r1 = org.objectweb.asm.commons.AdviceAdapter.OTHER
        La1:
            r0.pushValue(r1)
            goto Lde
        La7:
            r0 = r5
            java.lang.Object r0 = r0.popValue()
            goto Lde
        Laf:
            r0 = r5
            java.lang.Object r0 = r0.popValue()
            r0 = r5
            java.lang.Object r0 = r0.popValue()
            goto Lde
        Lbc:
            r0 = r5
            r0.endConstructorBasicBlockWithoutSuccessor()
            goto Lde
        Lc3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Invalid opcode "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        Lde:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            super.visitFieldInsn(r1, r2, r3, r4)
            r0 = r6
            boolean r0 = r0.isConstructor
            if (r0 == 0) goto Lbd
            r0 = r6
            boolean r0 = r0.superClassConstructorCalled
            if (r0 != 0) goto Lbd
            r0 = r10
            r1 = 0
            char r0 = r0.charAt(r1)
            r11 = r0
            r0 = r11
            r1 = 74
            if (r0 == r1) goto L2d
            r0 = r11
            r1 = 68
            if (r0 != r1) goto L31
        L2d:
            r0 = 1
            goto L32
        L31:
            r0 = 0
        L32:
            r12 = r0
            r0 = r7
            switch(r0) {
                case 178: goto L54;
                case 179: goto L6a;
                case 180: goto L93;
                case 181: goto L7c;
                default: goto La2;
            }
        L54:
            r0 = r6
            java.lang.Object r1 = org.objectweb.asm.commons.AdviceAdapter.OTHER
            r0.pushValue(r1)
            r0 = r12
            if (r0 == 0) goto Lbd
            r0 = r6
            java.lang.Object r1 = org.objectweb.asm.commons.AdviceAdapter.OTHER
            r0.pushValue(r1)
            goto Lbd
        L6a:
            r0 = r6
            java.lang.Object r0 = r0.popValue()
            r0 = r12
            if (r0 == 0) goto Lbd
            r0 = r6
            java.lang.Object r0 = r0.popValue()
            goto Lbd
        L7c:
            r0 = r6
            java.lang.Object r0 = r0.popValue()
            r0 = r6
            java.lang.Object r0 = r0.popValue()
            r0 = r12
            if (r0 == 0) goto Lbd
            r0 = r6
            java.lang.Object r0 = r0.popValue()
            goto Lbd
        L93:
            r0 = r12
            if (r0 == 0) goto Lbd
            r0 = r6
            java.lang.Object r1 = org.objectweb.asm.commons.AdviceAdapter.OTHER
            r0.pushValue(r1)
            goto Lbd
        La2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Invalid opcode "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        Lbd:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            super.visitIntInsn(r1, r2)
            r0 = r4
            boolean r0 = r0.isConstructor
            if (r0 == 0) goto L22
            r0 = r4
            boolean r0 = r0.superClassConstructorCalled
            if (r0 != 0) goto L22
            r0 = r5
            r1 = 188(0xbc, float:2.63E-43)
            if (r0 == r1) goto L22
            r0 = r4
            java.lang.Object r1 = org.objectweb.asm.commons.AdviceAdapter.OTHER
            r0.pushValue(r1)
        L22:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(java.lang.Object r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.visitLdcInsn(r1)
            r0 = r3
            boolean r0 = r0.isConstructor
            if (r0 == 0) goto L41
            r0 = r3
            boolean r0 = r0.superClassConstructorCalled
            if (r0 != 0) goto L41
            r0 = r3
            java.lang.Object r1 = org.objectweb.asm.commons.AdviceAdapter.OTHER
            r0.pushValue(r1)
            r0 = r4
            boolean r0 = r0 instanceof java.lang.Double
            if (r0 != 0) goto L3a
            r0 = r4
            boolean r0 = r0 instanceof java.lang.Long
            if (r0 != 0) goto L3a
            r0 = r4
            boolean r0 = r0 instanceof org.objectweb.asm.ConstantDynamic
            if (r0 == 0) goto L41
            r0 = r4
            org.objectweb.asm.ConstantDynamic r0 = (org.objectweb.asm.ConstantDynamic) r0
            int r0 = r0.getSize()
            r1 = 2
            if (r0 != r1) goto L41
        L3a:
            r0 = r3
            java.lang.Object r1 = org.objectweb.asm.commons.AdviceAdapter.OTHER
            r0.pushValue(r1)
        L41:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(java.lang.String r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            super.visitMultiANewArrayInsn(r1, r2)
            r0 = r4
            boolean r0 = r0.isConstructor
            if (r0 == 0) goto L2d
            r0 = r4
            boolean r0 = r0.superClassConstructorCalled
            if (r0 != 0) goto L2d
            r0 = 0
            r7 = r0
        L16:
            r0 = r7
            r1 = r6
            if (r0 >= r1) goto L26
            r0 = r4
            java.lang.Object r0 = r0.popValue()
            int r7 = r7 + 1
            goto L16
        L26:
            r0 = r4
            java.lang.Object r1 = org.objectweb.asm.commons.AdviceAdapter.OTHER
            r0.pushValue(r1)
        L2d:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int r5, java.lang.String r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            super.visitTypeInsn(r1, r2)
            r0 = r4
            boolean r0 = r0.isConstructor
            if (r0 == 0) goto L22
            r0 = r4
            boolean r0 = r0.superClassConstructorCalled
            if (r0 != 0) goto L22
            r0 = r5
            r1 = 187(0xbb, float:2.62E-43)
            if (r0 != r1) goto L22
            r0 = r4
            java.lang.Object r1 = org.objectweb.asm.commons.AdviceAdapter.OTHER
            r0.pushValue(r1)
        L22:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, boolean r12) {
            r7 = this;
            r0 = r7
            int r0 = r0.api
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 >= r1) goto L1d
            r0 = r8
            r1 = 256(0x100, float:3.59E-43)
            r0 = r0 & r1
            if (r0 != 0) goto L1d
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            super.visitMethodInsn(r1, r2, r3, r4, r5)
            return
        L1d:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            super.visitMethodInsn(r1, r2, r3, r4, r5)
            r0 = r8
            r1 = -257(0xfffffffffffffeff, float:NaN)
            r0 = r0 & r1
            r13 = r0
            r0 = r7
            r1 = r13
            r2 = r10
            r3 = r11
            r0.doVisitMethodInsn(r1, r2, r3)
            return
    }

    private void doVisitMethodInsn(int r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            r0 = r3
            boolean r0 = r0.isConstructor
            if (r0 == 0) goto Lbb
            r0 = r3
            boolean r0 = r0.superClassConstructorCalled
            if (r0 != 0) goto Lbb
            r0 = r6
            org.objectweb.asm.Type[] r0 = org.objectweb.asm.Type.getArgumentTypes(r0)
            r7 = r0
            r0 = r7
            int r0 = r0.length
            r8 = r0
            r0 = 0
            r9 = r0
        L1c:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto L43
            r0 = r7
            r1 = r9
            r0 = r0[r1]
            r10 = r0
            r0 = r3
            java.lang.Object r0 = r0.popValue()
            r0 = r10
            int r0 = r0.getSize()
            r1 = 2
            if (r0 != r1) goto L3d
            r0 = r3
            java.lang.Object r0 = r0.popValue()
        L3d:
            int r9 = r9 + 1
            goto L1c
        L43:
            r0 = r4
            switch(r0) {
                case 182: goto L64;
                case 183: goto L6c;
                case 184: goto L96;
                case 185: goto L64;
                default: goto L96;
            }
        L64:
            r0 = r3
            java.lang.Object r0 = r0.popValue()
            goto L96
        L6c:
            r0 = r3
            java.lang.Object r0 = r0.popValue()
            r7 = r0
            r0 = r7
            java.lang.Object r1 = org.objectweb.asm.commons.AdviceAdapter.UNINITIALIZED_THIS
            if (r0 != r1) goto L96
            r0 = r3
            boolean r0 = r0.superClassConstructorCalled
            if (r0 != 0) goto L96
            r0 = r5
            java.lang.String r1 = "<init>"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L96
            r0 = r3
            r1 = 1
            r0.superClassConstructorCalled = r1
            r0 = r3
            r0.onMethodEnter()
            goto L96
        L96:
            r0 = r6
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getReturnType(r0)
            r7 = r0
            r0 = r7
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.VOID_TYPE
            if (r0 == r1) goto Lbb
            r0 = r3
            java.lang.Object r1 = org.objectweb.asm.commons.AdviceAdapter.OTHER
            r0.pushValue(r1)
            r0 = r7
            int r0 = r0.getSize()
            r1 = 2
            if (r0 != r1) goto Lbb
            r0 = r3
            java.lang.Object r1 = org.objectweb.asm.commons.AdviceAdapter.OTHER
            r0.pushValue(r1)
        Lbb:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(java.lang.String r7, java.lang.String r8, org.objectweb.asm.Handle r9, java.lang.Object... r10) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            super.visitInvokeDynamicInsn(r1, r2, r3, r4)
            r0 = r6
            r1 = 186(0xba, float:2.6E-43)
            r2 = r7
            r3 = r8
            r0.doVisitMethodInsn(r1, r2, r3)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int r5, org.objectweb.asm.Label r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            super.visitJumpInsn(r1, r2)
            r0 = r4
            boolean r0 = r0.isConstructor
            if (r0 == 0) goto L10b
            r0 = r4
            boolean r0 = r0.superClassConstructorCalled
            if (r0 != 0) goto L10b
            r0 = r5
            switch(r0) {
                case 153: goto Le0;
                case 154: goto Le0;
                case 155: goto Le0;
                case 156: goto Le0;
                case 157: goto Le0;
                case 158: goto Le0;
                case 159: goto Le8;
                case 160: goto Le8;
                case 161: goto Le8;
                case 162: goto Le8;
                case 163: goto Le8;
                case 164: goto Le8;
                case 165: goto Le8;
                case 166: goto Le8;
                case 167: goto Lff;
                case 168: goto Lf5;
                case 169: goto L106;
                case 170: goto L106;
                case 171: goto L106;
                case 172: goto L106;
                case 173: goto L106;
                case 174: goto L106;
                case 175: goto L106;
                case 176: goto L106;
                case 177: goto L106;
                case 178: goto L106;
                case 179: goto L106;
                case 180: goto L106;
                case 181: goto L106;
                case 182: goto L106;
                case 183: goto L106;
                case 184: goto L106;
                case 185: goto L106;
                case 186: goto L106;
                case 187: goto L106;
                case 188: goto L106;
                case 189: goto L106;
                case 190: goto L106;
                case 191: goto L106;
                case 192: goto L106;
                case 193: goto L106;
                case 194: goto L106;
                case 195: goto L106;
                case 196: goto L106;
                case 197: goto L106;
                case 198: goto Le0;
                case 199: goto Le0;
                default: goto L106;
            }
        Le0:
            r0 = r4
            java.lang.Object r0 = r0.popValue()
            goto L106
        Le8:
            r0 = r4
            java.lang.Object r0 = r0.popValue()
            r0 = r4
            java.lang.Object r0 = r0.popValue()
            goto L106
        Lf5:
            r0 = r4
            java.lang.Object r1 = org.objectweb.asm.commons.AdviceAdapter.OTHER
            r0.pushValue(r1)
            goto L106
        Lff:
            r0 = r4
            r0.endConstructorBasicBlockWithoutSuccessor()
            goto L106
        L106:
            r0 = r4
            r1 = r6
            r0.addForwardJump(r1)
        L10b:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(org.objectweb.asm.Label r6, int[] r7, org.objectweb.asm.Label[] r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            super.visitLookupSwitchInsn(r1, r2, r3)
            r0 = r5
            boolean r0 = r0.isConstructor
            if (r0 == 0) goto L24
            r0 = r5
            boolean r0 = r0.superClassConstructorCalled
            if (r0 != 0) goto L24
            r0 = r5
            java.lang.Object r0 = r0.popValue()
            r0 = r5
            r1 = r6
            r2 = r8
            r0.addForwardJumps(r1, r2)
            r0 = r5
            r0.endConstructorBasicBlockWithoutSuccessor()
        L24:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int r7, int r8, org.objectweb.asm.Label r9, org.objectweb.asm.Label... r10) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            super.visitTableSwitchInsn(r1, r2, r3, r4)
            r0 = r6
            boolean r0 = r0.isConstructor
            if (r0 == 0) goto L27
            r0 = r6
            boolean r0 = r0.superClassConstructorCalled
            if (r0 != 0) goto L27
            r0 = r6
            java.lang.Object r0 = r0.popValue()
            r0 = r6
            r1 = r9
            r2 = r10
            r0.addForwardJumps(r1, r2)
            r0 = r6
            r0.endConstructorBasicBlockWithoutSuccessor()
        L27:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTryCatchBlock(org.objectweb.asm.Label r7, org.objectweb.asm.Label r8, org.objectweb.asm.Label r9, java.lang.String r10) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            super.visitTryCatchBlock(r1, r2, r3, r4)
            r0 = r6
            boolean r0 = r0.isConstructor
            if (r0 == 0) goto L3e
            r0 = r6
            java.util.Map<org.objectweb.asm.Label, java.util.List<java.lang.Object>> r0 = r0.forwardJumpStackFrames
            r1 = r9
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L3e
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r11 = r0
            r0 = r11
            java.lang.Object r1 = org.objectweb.asm.commons.AdviceAdapter.OTHER
            boolean r0 = r0.add(r1)
            r0 = r6
            java.util.Map<org.objectweb.asm.Label, java.util.List<java.lang.Object>> r0 = r0.forwardJumpStackFrames
            r1 = r9
            r2 = r11
            java.lang.Object r0 = r0.put(r1, r2)
        L3e:
            return
    }

    private void addForwardJumps(org.objectweb.asm.Label r4, org.objectweb.asm.Label[] r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.addForwardJump(r1)
            r0 = r5
            r6 = r0
            r0 = r6
            int r0 = r0.length
            r7 = r0
            r0 = 0
            r8 = r0
        Le:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L27
            r0 = r6
            r1 = r8
            r0 = r0[r1]
            r9 = r0
            r0 = r3
            r1 = r9
            r0.addForwardJump(r1)
            int r8 = r8 + 1
            goto Le
        L27:
            return
    }

    private void addForwardJump(org.objectweb.asm.Label r7) {
            r6 = this;
            r0 = r6
            java.util.Map<org.objectweb.asm.Label, java.util.List<java.lang.Object>> r0 = r0.forwardJumpStackFrames
            r1 = r7
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto Le
            return
        Le:
            r0 = r6
            java.util.Map<org.objectweb.asm.Label, java.util.List<java.lang.Object>> r0 = r0.forwardJumpStackFrames
            r1 = r7
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = r2
            r4 = r6
            java.util.List<java.lang.Object> r4 = r4.stackFrame
            r3.<init>(r4)
            java.lang.Object r0 = r0.put(r1, r2)
            return
    }

    private void endConstructorBasicBlockWithoutSuccessor() {
            r3 = this;
            r0 = r3
            r1 = 1
            r0.superClassConstructorCalled = r1
            return
    }

    private java.lang.Object popValue() {
            r4 = this;
            r0 = r4
            java.util.List<java.lang.Object> r0 = r0.stackFrame
            r1 = r4
            java.util.List<java.lang.Object> r1 = r1.stackFrame
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object r0 = r0.remove(r1)
            return r0
    }

    private java.lang.Object peekValue() {
            r4 = this;
            r0 = r4
            java.util.List<java.lang.Object> r0 = r0.stackFrame
            r1 = r4
            java.util.List<java.lang.Object> r1 = r1.stackFrame
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    private void pushValue(java.lang.Object r4) {
            r3 = this;
            r0 = r3
            java.util.List<java.lang.Object> r0 = r0.stackFrame
            r1 = r4
            boolean r0 = r0.add(r1)
            return
    }

    protected void onMethodEnter() {
            r1 = this;
            return
    }

    protected void onMethodExit(int r2) {
            r1 = this;
            return
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r1 = r0
            r1.<init>()
            org.objectweb.asm.commons.AdviceAdapter.UNINITIALIZED_THIS = r0
            java.lang.Object r0 = new java.lang.Object
            r1 = r0
            r1.<init>()
            org.objectweb.asm.commons.AdviceAdapter.OTHER = r0
            return
    }
}
