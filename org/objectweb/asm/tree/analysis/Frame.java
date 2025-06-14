package org.objectweb.asm.tree.analysis;

import org.objectweb.asm.tree.analysis.Value;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/analysis/Frame.SCL.lombok */
public class Frame<V extends org.objectweb.asm.tree.analysis.Value> {
    private static final int MAX_STACK_SIZE = 65536;
    private V returnValue;
    private V[] values;
    private int numLocals;
    private int numStack;
    private int maxStack;

    public Frame(int r5, int r6) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r5
            r2 = r6
            if (r2 < 0) goto Le
            r2 = r6
            goto Lf
        Le:
            r2 = 4
        Lf:
            int r1 = r1 + r2
            org.objectweb.asm.tree.analysis.Value[] r1 = new org.objectweb.asm.tree.analysis.Value[r1]
            r0.values = r1
            r0 = r4
            r1 = r5
            r0.numLocals = r1
            r0 = r4
            r1 = 0
            r0.numStack = r1
            r0 = r4
            r1 = r6
            if (r1 < 0) goto L29
            r1 = r6
            goto L2b
        L29:
            r1 = 65536(0x10000, float:9.18355E-41)
        L2b:
            r0.maxStack = r1
            return
    }

    public Frame(org.objectweb.asm.tree.analysis.Frame<? extends V> r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            int r1 = r1.numLocals
            r2 = r6
            V extends org.objectweb.asm.tree.analysis.Value[] r2 = r2.values
            int r2 = r2.length
            r3 = r6
            int r3 = r3.numLocals
            int r2 = r2 - r3
            r0.<init>(r1, r2)
            r0 = r5
            r1 = r6
            org.objectweb.asm.tree.analysis.Frame r0 = r0.init(r1)
            return
    }

    public org.objectweb.asm.tree.analysis.Frame<V> init(org.objectweb.asm.tree.analysis.Frame<? extends V> r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            V extends org.objectweb.asm.tree.analysis.Value r1 = r1.returnValue
            r0.returnValue = r1
            r0 = r6
            V extends org.objectweb.asm.tree.analysis.Value[] r0 = r0.values
            int r0 = r0.length
            r1 = r7
            V extends org.objectweb.asm.tree.analysis.Value[] r1 = r1.values
            int r1 = r1.length
            if (r0 >= r1) goto L26
            r0 = r6
            r1 = r7
            V extends org.objectweb.asm.tree.analysis.Value[] r1 = r1.values
            java.lang.Object r1 = r1.clone()
            org.objectweb.asm.tree.analysis.Value[] r1 = (org.objectweb.asm.tree.analysis.Value[]) r1
            r0.values = r1
            goto L38
        L26:
            r0 = r7
            V extends org.objectweb.asm.tree.analysis.Value[] r0 = r0.values
            r1 = 0
            r2 = r6
            V extends org.objectweb.asm.tree.analysis.Value[] r2 = r2.values
            r3 = 0
            r4 = r7
            V extends org.objectweb.asm.tree.analysis.Value[] r4 = r4.values
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
        L38:
            r0 = r6
            r1 = r7
            int r1 = r1.numLocals
            r0.numLocals = r1
            r0 = r6
            r1 = r7
            int r1 = r1.numStack
            r0.numStack = r1
            r0 = r6
            r1 = r7
            int r1 = r1.maxStack
            r0.maxStack = r1
            r0 = r6
            return r0
    }

    public void initJumpTarget(int r2, org.objectweb.asm.tree.LabelNode r3) {
            r1 = this;
            return
    }

    public void setReturn(V r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.returnValue = r1
            return
    }

    public int getLocals() {
            r2 = this;
            r0 = r2
            int r0 = r0.numLocals
            return r0
    }

    public int getMaxStackSize() {
            r2 = this;
            r0 = r2
            int r0 = r0.maxStack
            return r0
    }

    public V getLocal(int r6) {
            r5 = this;
            r0 = r6
            r1 = r5
            int r1 = r1.numLocals
            if (r0 < r1) goto L23
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Trying to get an inexistant local variable "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L23:
            r0 = r5
            V extends org.objectweb.asm.tree.analysis.Value[] r0 = r0.values
            r1 = r6
            r0 = r0[r1]
            return r0
    }

    public void setLocal(int r6, V r7) {
            r5 = this;
            r0 = r6
            r1 = r5
            int r1 = r1.numLocals
            if (r0 < r1) goto L23
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Trying to set an inexistant local variable "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L23:
            r0 = r5
            V extends org.objectweb.asm.tree.analysis.Value[] r0 = r0.values
            r1 = r6
            r2 = r7
            r0[r1] = r2
            return
    }

    public int getStackSize() {
            r2 = this;
            r0 = r2
            int r0 = r0.numStack
            return r0
    }

    public V getStack(int r5) {
            r4 = this;
            r0 = r4
            V extends org.objectweb.asm.tree.analysis.Value[] r0 = r0.values
            r1 = r4
            int r1 = r1.numLocals
            r2 = r5
            int r1 = r1 + r2
            r0 = r0[r1]
            return r0
    }

    public void setStack(int r5, V r6) {
            r4 = this;
            r0 = r4
            V extends org.objectweb.asm.tree.analysis.Value[] r0 = r0.values
            r1 = r4
            int r1 = r1.numLocals
            r2 = r5
            int r1 = r1 + r2
            r2 = r6
            r0[r1] = r2
            return
    }

    public void clearStack() {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.numStack = r1
            return
    }

    public V pop() {
            r6 = this;
            r0 = r6
            int r0 = r0.numStack
            if (r0 != 0) goto L11
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r1 = r0
            java.lang.String r2 = "Cannot pop operand off an empty stack."
            r1.<init>(r2)
            throw r0
        L11:
            r0 = r6
            V extends org.objectweb.asm.tree.analysis.Value[] r0 = r0.values
            r1 = r6
            int r1 = r1.numLocals
            r2 = r6
            r3 = r2
            int r3 = r3.numStack
            r4 = 1
            int r3 = r3 - r4
            r4 = r3; r3 = r2; r2 = r4; 
            r3.numStack = r4
            int r1 = r1 + r2
            r0 = r0[r1]
            return r0
    }

    public void push(V r8) {
            r7 = this;
            r0 = r7
            int r0 = r0.numLocals
            r1 = r7
            int r1 = r1.numStack
            int r0 = r0 + r1
            r1 = r7
            V extends org.objectweb.asm.tree.analysis.Value[] r1 = r1.values
            int r1 = r1.length
            if (r0 < r1) goto L4a
            r0 = r7
            int r0 = r0.numLocals
            r1 = r7
            int r1 = r1.numStack
            int r0 = r0 + r1
            r1 = r7
            int r1 = r1.maxStack
            if (r0 < r1) goto L2b
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r1 = r0
            java.lang.String r2 = "Insufficient maximum stack size."
            r1.<init>(r2)
            throw r0
        L2b:
            r0 = r7
            V extends org.objectweb.asm.tree.analysis.Value[] r0 = r0.values
            r9 = r0
            r0 = r7
            r1 = 2
            r2 = r7
            V extends org.objectweb.asm.tree.analysis.Value[] r2 = r2.values
            int r2 = r2.length
            int r1 = r1 * r2
            org.objectweb.asm.tree.analysis.Value[] r1 = new org.objectweb.asm.tree.analysis.Value[r1]
            r0.values = r1
            r0 = r9
            r1 = 0
            r2 = r7
            V extends org.objectweb.asm.tree.analysis.Value[] r2 = r2.values
            r3 = 0
            r4 = r9
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
        L4a:
            r0 = r7
            V extends org.objectweb.asm.tree.analysis.Value[] r0 = r0.values
            r1 = r7
            int r1 = r1.numLocals
            r2 = r7
            r3 = r2
            int r3 = r3.numStack
            r4 = r3; r3 = r2; r2 = r4; 
            r5 = 1
            int r4 = r4 + r5
            r3.numStack = r4
            int r1 = r1 + r2
            r2 = r8
            r0[r1] = r2
            return
    }

    public void execute(org.objectweb.asm.tree.AbstractInsnNode r8, org.objectweb.asm.tree.analysis.Interpreter<V> r9) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r7 = this;
            r0 = r8
            int r0 = r0.getOpcode()
            switch(r0) {
                case 0: goto L334;
                case 1: goto L337;
                case 2: goto L337;
                case 3: goto L337;
                case 4: goto L337;
                case 5: goto L337;
                case 6: goto L337;
                case 7: goto L337;
                case 8: goto L337;
                case 9: goto L337;
                case 10: goto L337;
                case 11: goto L337;
                case 12: goto L337;
                case 13: goto L337;
                case 14: goto L337;
                case 15: goto L337;
                case 16: goto L337;
                case 17: goto L337;
                case 18: goto L337;
                case 19: goto L82d;
                case 20: goto L82d;
                case 21: goto L343;
                case 22: goto L343;
                case 23: goto L343;
                case 24: goto L343;
                case 25: goto L343;
                case 26: goto L82d;
                case 27: goto L82d;
                case 28: goto L82d;
                case 29: goto L82d;
                case 30: goto L82d;
                case 31: goto L82d;
                case 32: goto L82d;
                case 33: goto L82d;
                case 34: goto L82d;
                case 35: goto L82d;
                case 36: goto L82d;
                case 37: goto L82d;
                case 38: goto L82d;
                case 39: goto L82d;
                case 40: goto L82d;
                case 41: goto L82d;
                case 42: goto L82d;
                case 43: goto L82d;
                case 44: goto L82d;
                case 45: goto L82d;
                case 46: goto L695;
                case 47: goto L695;
                case 48: goto L695;
                case 49: goto L695;
                case 50: goto L695;
                case 51: goto L695;
                case 52: goto L695;
                case 53: goto L695;
                case 54: goto L35a;
                case 55: goto L35a;
                case 56: goto L35a;
                case 57: goto L35a;
                case 58: goto L35a;
                case 59: goto L82d;
                case 60: goto L82d;
                case 61: goto L82d;
                case 62: goto L82d;
                case 63: goto L82d;
                case 64: goto L82d;
                case 65: goto L82d;
                case 66: goto L82d;
                case 67: goto L82d;
                case 68: goto L82d;
                case 69: goto L82d;
                case 70: goto L82d;
                case 71: goto L82d;
                case 72: goto L82d;
                case 73: goto L82d;
                case 74: goto L82d;
                case 75: goto L82d;
                case 76: goto L82d;
                case 77: goto L82d;
                case 78: goto L82d;
                case 79: goto L3c0;
                case 80: goto L3c0;
                case 81: goto L3c0;
                case 82: goto L3c0;
                case 83: goto L3c0;
                case 84: goto L3c0;
                case 85: goto L3c0;
                case 86: goto L3c0;
                case 87: goto L3df;
                case 88: goto L3f7;
                case 89: goto L41c;
                case 90: goto L448;
                case 91: goto L48b;
                case 92: goto L4b2;
                case 93: goto L512;
                case 94: goto L5a0;
                case 95: goto L652;
                case 96: goto L695;
                case 97: goto L695;
                case 98: goto L695;
                case 99: goto L695;
                case 100: goto L695;
                case 101: goto L695;
                case 102: goto L695;
                case 103: goto L695;
                case 104: goto L695;
                case 105: goto L695;
                case 106: goto L695;
                case 107: goto L695;
                case 108: goto L695;
                case 109: goto L695;
                case 110: goto L695;
                case 111: goto L695;
                case 112: goto L695;
                case 113: goto L695;
                case 114: goto L695;
                case 115: goto L695;
                case 116: goto L6af;
                case 117: goto L6af;
                case 118: goto L6af;
                case 119: goto L6af;
                case 120: goto L695;
                case 121: goto L695;
                case 122: goto L695;
                case 123: goto L695;
                case 124: goto L695;
                case 125: goto L695;
                case 126: goto L695;
                case 127: goto L695;
                case 128: goto L695;
                case 129: goto L695;
                case 130: goto L695;
                case 131: goto L695;
                case 132: goto L6bf;
                case 133: goto L6dc;
                case 134: goto L6dc;
                case 135: goto L6dc;
                case 136: goto L6dc;
                case 137: goto L6dc;
                case 138: goto L6dc;
                case 139: goto L6dc;
                case 140: goto L6dc;
                case 141: goto L6dc;
                case 142: goto L6dc;
                case 143: goto L6dc;
                case 144: goto L6dc;
                case 145: goto L6dc;
                case 146: goto L6dc;
                case 147: goto L6dc;
                case 148: goto L695;
                case 149: goto L695;
                case 150: goto L695;
                case 151: goto L695;
                case 152: goto L695;
                case 153: goto L6ec;
                case 154: goto L6ec;
                case 155: goto L6ec;
                case 156: goto L6ec;
                case 157: goto L6ec;
                case 158: goto L6ec;
                case 159: goto L6f9;
                case 160: goto L6f9;
                case 161: goto L6f9;
                case 162: goto L6f9;
                case 163: goto L6f9;
                case 164: goto L6f9;
                case 165: goto L6f9;
                case 166: goto L6f9;
                case 167: goto L710;
                case 168: goto L713;
                case 169: goto L71f;
                case 170: goto L722;
                case 171: goto L722;
                case 172: goto L72f;
                case 173: goto L72f;
                case 174: goto L72f;
                case 175: goto L72f;
                case 176: goto L72f;
                case 177: goto L748;
                case 178: goto L75a;
                case 179: goto L766;
                case 180: goto L773;
                case 181: goto L6f9;
                case 182: goto L783;
                case 183: goto L783;
                case 184: goto L783;
                case 185: goto L783;
                case 186: goto L793;
                case 187: goto L7a3;
                case 188: goto L7af;
                case 189: goto L7af;
                case 190: goto L7af;
                case 191: goto L7bf;
                case 192: goto L7cc;
                case 193: goto L7cc;
                case 194: goto L7dc;
                case 195: goto L7dc;
                case 196: goto L82d;
                case 197: goto L7e9;
                case 198: goto L820;
                case 199: goto L820;
                default: goto L82d;
            }
        L334:
            goto L84c
        L337:
            r0 = r7
            r1 = r9
            r2 = r8
            org.objectweb.asm.tree.analysis.Value r1 = r1.newOperation(r2)
            r0.push(r1)
            goto L84c
        L343:
            r0 = r7
            r1 = r9
            r2 = r8
            r3 = r7
            r4 = r8
            org.objectweb.asm.tree.VarInsnNode r4 = (org.objectweb.asm.tree.VarInsnNode) r4
            int r4 = r4.var
            org.objectweb.asm.tree.analysis.Value r3 = r3.getLocal(r4)
            org.objectweb.asm.tree.analysis.Value r1 = r1.copyOperation(r2, r3)
            r0.push(r1)
            goto L84c
        L35a:
            r0 = r9
            r1 = r8
            r2 = r7
            org.objectweb.asm.tree.analysis.Value r2 = r2.pop()
            org.objectweb.asm.tree.analysis.Value r0 = r0.copyOperation(r1, r2)
            r10 = r0
            r0 = r8
            org.objectweb.asm.tree.VarInsnNode r0 = (org.objectweb.asm.tree.VarInsnNode) r0
            int r0 = r0.var
            r14 = r0
            r0 = r7
            r1 = r14
            r2 = r10
            r0.setLocal(r1, r2)
            r0 = r10
            int r0 = r0.getSize()
            r1 = 2
            if (r0 != r1) goto L38e
            r0 = r7
            r1 = r14
            r2 = 1
            int r1 = r1 + r2
            r2 = r9
            r3 = r14
            r4 = 1
            int r3 = r3 + r4
            org.objectweb.asm.tree.analysis.Value r2 = r2.newEmptyValue(r3)
            r0.setLocal(r1, r2)
        L38e:
            r0 = r14
            if (r0 <= 0) goto L84c
            r0 = r7
            r1 = r14
            r2 = 1
            int r1 = r1 - r2
            org.objectweb.asm.tree.analysis.Value r0 = r0.getLocal(r1)
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L3bd
            r0 = r15
            int r0 = r0.getSize()
            r1 = 2
            if (r0 != r1) goto L3bd
            r0 = r7
            r1 = r14
            r2 = 1
            int r1 = r1 - r2
            r2 = r9
            r3 = r14
            r4 = 1
            int r3 = r3 - r4
            org.objectweb.asm.tree.analysis.Value r2 = r2.newEmptyValue(r3)
            r0.setLocal(r1, r2)
        L3bd:
            goto L84c
        L3c0:
            r0 = r7
            org.objectweb.asm.tree.analysis.Value r0 = r0.pop()
            r12 = r0
            r0 = r7
            org.objectweb.asm.tree.analysis.Value r0 = r0.pop()
            r11 = r0
            r0 = r7
            org.objectweb.asm.tree.analysis.Value r0 = r0.pop()
            r10 = r0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r11
            r4 = r12
            org.objectweb.asm.tree.analysis.Value r0 = r0.ternaryOperation(r1, r2, r3, r4)
            goto L84c
        L3df:
            r0 = r7
            org.objectweb.asm.tree.analysis.Value r0 = r0.pop()
            int r0 = r0.getSize()
            r1 = 2
            if (r0 != r1) goto L84c
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException
            r1 = r0
            r2 = r8
            java.lang.String r3 = "Illegal use of POP"
            r1.<init>(r2, r3)
            throw r0
        L3f7:
            r0 = r7
            org.objectweb.asm.tree.analysis.Value r0 = r0.pop()
            int r0 = r0.getSize()
            r1 = 1
            if (r0 != r1) goto L84c
            r0 = r7
            org.objectweb.asm.tree.analysis.Value r0 = r0.pop()
            int r0 = r0.getSize()
            r1 = 1
            if (r0 == r1) goto L84c
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException
            r1 = r0
            r2 = r8
            java.lang.String r3 = "Illegal use of POP2"
            r1.<init>(r2, r3)
            throw r0
        L41c:
            r0 = r7
            org.objectweb.asm.tree.analysis.Value r0 = r0.pop()
            r10 = r0
            r0 = r10
            int r0 = r0.getSize()
            r1 = 1
            if (r0 == r1) goto L436
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException
            r1 = r0
            r2 = r8
            java.lang.String r3 = "Illegal use of DUP"
            r1.<init>(r2, r3)
            throw r0
        L436:
            r0 = r7
            r1 = r10
            r0.push(r1)
            r0 = r7
            r1 = r9
            r2 = r8
            r3 = r10
            org.objectweb.asm.tree.analysis.Value r1 = r1.copyOperation(r2, r3)
            r0.push(r1)
            goto L84c
        L448:
            r0 = r7
            org.objectweb.asm.tree.analysis.Value r0 = r0.pop()
            r10 = r0
            r0 = r7
            org.objectweb.asm.tree.analysis.Value r0 = r0.pop()
            r11 = r0
            r0 = r10
            int r0 = r0.getSize()
            r1 = 1
            if (r0 != r1) goto L468
            r0 = r11
            int r0 = r0.getSize()
            r1 = 1
            if (r0 == r1) goto L473
        L468:
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException
            r1 = r0
            r2 = r8
            java.lang.String r3 = "Illegal use of DUP_X1"
            r1.<init>(r2, r3)
            throw r0
        L473:
            r0 = r7
            r1 = r9
            r2 = r8
            r3 = r10
            org.objectweb.asm.tree.analysis.Value r1 = r1.copyOperation(r2, r3)
            r0.push(r1)
            r0 = r7
            r1 = r11
            r0.push(r1)
            r0 = r7
            r1 = r10
            r0.push(r1)
            goto L84c
        L48b:
            r0 = r7
            org.objectweb.asm.tree.analysis.Value r0 = r0.pop()
            r10 = r0
            r0 = r10
            int r0 = r0.getSize()
            r1 = 1
            if (r0 != r1) goto L4a7
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r9
            boolean r0 = r0.executeDupX2(r1, r2, r3)
            if (r0 == 0) goto L4a7
            goto L84c
        L4a7:
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException
            r1 = r0
            r2 = r8
            java.lang.String r3 = "Illegal use of DUP_X2"
            r1.<init>(r2, r3)
            throw r0
        L4b2:
            r0 = r7
            org.objectweb.asm.tree.analysis.Value r0 = r0.pop()
            r10 = r0
            r0 = r10
            int r0 = r0.getSize()
            r1 = 1
            if (r0 != r1) goto L4f5
            r0 = r7
            org.objectweb.asm.tree.analysis.Value r0 = r0.pop()
            r11 = r0
            r0 = r11
            int r0 = r0.getSize()
            r1 = 1
            if (r0 != r1) goto L507
            r0 = r7
            r1 = r11
            r0.push(r1)
            r0 = r7
            r1 = r10
            r0.push(r1)
            r0 = r7
            r1 = r9
            r2 = r8
            r3 = r11
            org.objectweb.asm.tree.analysis.Value r1 = r1.copyOperation(r2, r3)
            r0.push(r1)
            r0 = r7
            r1 = r9
            r2 = r8
            r3 = r10
            org.objectweb.asm.tree.analysis.Value r1 = r1.copyOperation(r2, r3)
            r0.push(r1)
            goto L84c
        L4f5:
            r0 = r7
            r1 = r10
            r0.push(r1)
            r0 = r7
            r1 = r9
            r2 = r8
            r3 = r10
            org.objectweb.asm.tree.analysis.Value r1 = r1.copyOperation(r2, r3)
            r0.push(r1)
            goto L84c
        L507:
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException
            r1 = r0
            r2 = r8
            java.lang.String r3 = "Illegal use of DUP2"
            r1.<init>(r2, r3)
            throw r0
        L512:
            r0 = r7
            org.objectweb.asm.tree.analysis.Value r0 = r0.pop()
            r10 = r0
            r0 = r10
            int r0 = r0.getSize()
            r1 = 1
            if (r0 != r1) goto L56c
            r0 = r7
            org.objectweb.asm.tree.analysis.Value r0 = r0.pop()
            r11 = r0
            r0 = r11
            int r0 = r0.getSize()
            r1 = 1
            if (r0 != r1) goto L595
            r0 = r7
            org.objectweb.asm.tree.analysis.Value r0 = r0.pop()
            r12 = r0
            r0 = r12
            int r0 = r0.getSize()
            r1 = 1
            if (r0 != r1) goto L595
            r0 = r7
            r1 = r9
            r2 = r8
            r3 = r11
            org.objectweb.asm.tree.analysis.Value r1 = r1.copyOperation(r2, r3)
            r0.push(r1)
            r0 = r7
            r1 = r9
            r2 = r8
            r3 = r10
            org.objectweb.asm.tree.analysis.Value r1 = r1.copyOperation(r2, r3)
            r0.push(r1)
            r0 = r7
            r1 = r12
            r0.push(r1)
            r0 = r7
            r1 = r11
            r0.push(r1)
            r0 = r7
            r1 = r10
            r0.push(r1)
            goto L84c
        L56c:
            r0 = r7
            org.objectweb.asm.tree.analysis.Value r0 = r0.pop()
            r11 = r0
            r0 = r11
            int r0 = r0.getSize()
            r1 = 1
            if (r0 != r1) goto L595
            r0 = r7
            r1 = r9
            r2 = r8
            r3 = r10
            org.objectweb.asm.tree.analysis.Value r1 = r1.copyOperation(r2, r3)
            r0.push(r1)
            r0 = r7
            r1 = r11
            r0.push(r1)
            r0 = r7
            r1 = r10
            r0.push(r1)
            goto L84c
        L595:
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException
            r1 = r0
            r2 = r8
            java.lang.String r3 = "Illegal use of DUP2_X1"
            r1.<init>(r2, r3)
            throw r0
        L5a0:
            r0 = r7
            org.objectweb.asm.tree.analysis.Value r0 = r0.pop()
            r10 = r0
            r0 = r10
            int r0 = r0.getSize()
            r1 = 1
            if (r0 != r1) goto L63a
            r0 = r7
            org.objectweb.asm.tree.analysis.Value r0 = r0.pop()
            r11 = r0
            r0 = r11
            int r0 = r0.getSize()
            r1 = 1
            if (r0 != r1) goto L647
            r0 = r7
            org.objectweb.asm.tree.analysis.Value r0 = r0.pop()
            r12 = r0
            r0 = r12
            int r0 = r0.getSize()
            r1 = 1
            if (r0 != r1) goto L611
            r0 = r7
            org.objectweb.asm.tree.analysis.Value r0 = r0.pop()
            r13 = r0
            r0 = r13
            int r0 = r0.getSize()
            r1 = 1
            if (r0 != r1) goto L647
            r0 = r7
            r1 = r9
            r2 = r8
            r3 = r11
            org.objectweb.asm.tree.analysis.Value r1 = r1.copyOperation(r2, r3)
            r0.push(r1)
            r0 = r7
            r1 = r9
            r2 = r8
            r3 = r10
            org.objectweb.asm.tree.analysis.Value r1 = r1.copyOperation(r2, r3)
            r0.push(r1)
            r0 = r7
            r1 = r13
            r0.push(r1)
            r0 = r7
            r1 = r12
            r0.push(r1)
            r0 = r7
            r1 = r11
            r0.push(r1)
            r0 = r7
            r1 = r10
            r0.push(r1)
            goto L84c
        L611:
            r0 = r7
            r1 = r9
            r2 = r8
            r3 = r11
            org.objectweb.asm.tree.analysis.Value r1 = r1.copyOperation(r2, r3)
            r0.push(r1)
            r0 = r7
            r1 = r9
            r2 = r8
            r3 = r10
            org.objectweb.asm.tree.analysis.Value r1 = r1.copyOperation(r2, r3)
            r0.push(r1)
            r0 = r7
            r1 = r12
            r0.push(r1)
            r0 = r7
            r1 = r11
            r0.push(r1)
            r0 = r7
            r1 = r10
            r0.push(r1)
            goto L84c
        L63a:
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r9
            boolean r0 = r0.executeDupX2(r1, r2, r3)
            if (r0 == 0) goto L647
            goto L84c
        L647:
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException
            r1 = r0
            r2 = r8
            java.lang.String r3 = "Illegal use of DUP2_X2"
            r1.<init>(r2, r3)
            throw r0
        L652:
            r0 = r7
            org.objectweb.asm.tree.analysis.Value r0 = r0.pop()
            r11 = r0
            r0 = r7
            org.objectweb.asm.tree.analysis.Value r0 = r0.pop()
            r10 = r0
            r0 = r10
            int r0 = r0.getSize()
            r1 = 1
            if (r0 != r1) goto L672
            r0 = r11
            int r0 = r0.getSize()
            r1 = 1
            if (r0 == r1) goto L67d
        L672:
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException
            r1 = r0
            r2 = r8
            java.lang.String r3 = "Illegal use of SWAP"
            r1.<init>(r2, r3)
            throw r0
        L67d:
            r0 = r7
            r1 = r9
            r2 = r8
            r3 = r11
            org.objectweb.asm.tree.analysis.Value r1 = r1.copyOperation(r2, r3)
            r0.push(r1)
            r0 = r7
            r1 = r9
            r2 = r8
            r3 = r10
            org.objectweb.asm.tree.analysis.Value r1 = r1.copyOperation(r2, r3)
            r0.push(r1)
            goto L84c
        L695:
            r0 = r7
            org.objectweb.asm.tree.analysis.Value r0 = r0.pop()
            r11 = r0
            r0 = r7
            org.objectweb.asm.tree.analysis.Value r0 = r0.pop()
            r10 = r0
            r0 = r7
            r1 = r9
            r2 = r8
            r3 = r10
            r4 = r11
            org.objectweb.asm.tree.analysis.Value r1 = r1.binaryOperation(r2, r3, r4)
            r0.push(r1)
            goto L84c
        L6af:
            r0 = r7
            r1 = r9
            r2 = r8
            r3 = r7
            org.objectweb.asm.tree.analysis.Value r3 = r3.pop()
            org.objectweb.asm.tree.analysis.Value r1 = r1.unaryOperation(r2, r3)
            r0.push(r1)
            goto L84c
        L6bf:
            r0 = r8
            org.objectweb.asm.tree.IincInsnNode r0 = (org.objectweb.asm.tree.IincInsnNode) r0
            int r0 = r0.var
            r14 = r0
            r0 = r7
            r1 = r14
            r2 = r9
            r3 = r8
            r4 = r7
            r5 = r14
            org.objectweb.asm.tree.analysis.Value r4 = r4.getLocal(r5)
            org.objectweb.asm.tree.analysis.Value r2 = r2.unaryOperation(r3, r4)
            r0.setLocal(r1, r2)
            goto L84c
        L6dc:
            r0 = r7
            r1 = r9
            r2 = r8
            r3 = r7
            org.objectweb.asm.tree.analysis.Value r3 = r3.pop()
            org.objectweb.asm.tree.analysis.Value r1 = r1.unaryOperation(r2, r3)
            r0.push(r1)
            goto L84c
        L6ec:
            r0 = r9
            r1 = r8
            r2 = r7
            org.objectweb.asm.tree.analysis.Value r2 = r2.pop()
            org.objectweb.asm.tree.analysis.Value r0 = r0.unaryOperation(r1, r2)
            goto L84c
        L6f9:
            r0 = r7
            org.objectweb.asm.tree.analysis.Value r0 = r0.pop()
            r11 = r0
            r0 = r7
            org.objectweb.asm.tree.analysis.Value r0 = r0.pop()
            r10 = r0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r11
            org.objectweb.asm.tree.analysis.Value r0 = r0.binaryOperation(r1, r2, r3)
            goto L84c
        L710:
            goto L84c
        L713:
            r0 = r7
            r1 = r9
            r2 = r8
            org.objectweb.asm.tree.analysis.Value r1 = r1.newOperation(r2)
            r0.push(r1)
            goto L84c
        L71f:
            goto L84c
        L722:
            r0 = r9
            r1 = r8
            r2 = r7
            org.objectweb.asm.tree.analysis.Value r2 = r2.pop()
            org.objectweb.asm.tree.analysis.Value r0 = r0.unaryOperation(r1, r2)
            goto L84c
        L72f:
            r0 = r7
            org.objectweb.asm.tree.analysis.Value r0 = r0.pop()
            r10 = r0
            r0 = r9
            r1 = r8
            r2 = r10
            org.objectweb.asm.tree.analysis.Value r0 = r0.unaryOperation(r1, r2)
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r7
            V extends org.objectweb.asm.tree.analysis.Value r3 = r3.returnValue
            r0.returnOperation(r1, r2, r3)
            goto L84c
        L748:
            r0 = r7
            V extends org.objectweb.asm.tree.analysis.Value r0 = r0.returnValue
            if (r0 == 0) goto L84c
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException
            r1 = r0
            r2 = r8
            java.lang.String r3 = "Incompatible return type"
            r1.<init>(r2, r3)
            throw r0
        L75a:
            r0 = r7
            r1 = r9
            r2 = r8
            org.objectweb.asm.tree.analysis.Value r1 = r1.newOperation(r2)
            r0.push(r1)
            goto L84c
        L766:
            r0 = r9
            r1 = r8
            r2 = r7
            org.objectweb.asm.tree.analysis.Value r2 = r2.pop()
            org.objectweb.asm.tree.analysis.Value r0 = r0.unaryOperation(r1, r2)
            goto L84c
        L773:
            r0 = r7
            r1 = r9
            r2 = r8
            r3 = r7
            org.objectweb.asm.tree.analysis.Value r3 = r3.pop()
            org.objectweb.asm.tree.analysis.Value r1 = r1.unaryOperation(r2, r3)
            r0.push(r1)
            goto L84c
        L783:
            r0 = r7
            r1 = r8
            r2 = r8
            org.objectweb.asm.tree.MethodInsnNode r2 = (org.objectweb.asm.tree.MethodInsnNode) r2
            java.lang.String r2 = r2.desc
            r3 = r9
            r0.executeInvokeInsn(r1, r2, r3)
            goto L84c
        L793:
            r0 = r7
            r1 = r8
            r2 = r8
            org.objectweb.asm.tree.InvokeDynamicInsnNode r2 = (org.objectweb.asm.tree.InvokeDynamicInsnNode) r2
            java.lang.String r2 = r2.desc
            r3 = r9
            r0.executeInvokeInsn(r1, r2, r3)
            goto L84c
        L7a3:
            r0 = r7
            r1 = r9
            r2 = r8
            org.objectweb.asm.tree.analysis.Value r1 = r1.newOperation(r2)
            r0.push(r1)
            goto L84c
        L7af:
            r0 = r7
            r1 = r9
            r2 = r8
            r3 = r7
            org.objectweb.asm.tree.analysis.Value r3 = r3.pop()
            org.objectweb.asm.tree.analysis.Value r1 = r1.unaryOperation(r2, r3)
            r0.push(r1)
            goto L84c
        L7bf:
            r0 = r9
            r1 = r8
            r2 = r7
            org.objectweb.asm.tree.analysis.Value r2 = r2.pop()
            org.objectweb.asm.tree.analysis.Value r0 = r0.unaryOperation(r1, r2)
            goto L84c
        L7cc:
            r0 = r7
            r1 = r9
            r2 = r8
            r3 = r7
            org.objectweb.asm.tree.analysis.Value r3 = r3.pop()
            org.objectweb.asm.tree.analysis.Value r1 = r1.unaryOperation(r2, r3)
            r0.push(r1)
            goto L84c
        L7dc:
            r0 = r9
            r1 = r8
            r2 = r7
            org.objectweb.asm.tree.analysis.Value r2 = r2.pop()
            org.objectweb.asm.tree.analysis.Value r0 = r0.unaryOperation(r1, r2)
            goto L84c
        L7e9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r15 = r0
            r0 = r8
            org.objectweb.asm.tree.MultiANewArrayInsnNode r0 = (org.objectweb.asm.tree.MultiANewArrayInsnNode) r0
            int r0 = r0.dims
            r16 = r0
        L7fb:
            r0 = r16
            if (r0 <= 0) goto L812
            r0 = r15
            r1 = 0
            r2 = r7
            org.objectweb.asm.tree.analysis.Value r2 = r2.pop()
            r0.add(r1, r2)
            int r16 = r16 + (-1)
            goto L7fb
        L812:
            r0 = r7
            r1 = r9
            r2 = r8
            r3 = r15
            org.objectweb.asm.tree.analysis.Value r1 = r1.naryOperation(r2, r3)
            r0.push(r1)
            goto L84c
        L820:
            r0 = r9
            r1 = r8
            r2 = r7
            org.objectweb.asm.tree.analysis.Value r2 = r2.pop()
            org.objectweb.asm.tree.analysis.Value r0 = r0.unaryOperation(r1, r2)
            goto L84c
        L82d:
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException
            r1 = r0
            r2 = r8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            r4.<init>()
            java.lang.String r4 = "Illegal opcode "
            java.lang.StringBuilder r3 = r3.append(r4)
            r4 = r8
            int r4 = r4.getOpcode()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r2, r3)
            throw r0
        L84c:
            return
    }

    private boolean executeDupX2(org.objectweb.asm.tree.AbstractInsnNode r6, V r7, org.objectweb.asm.tree.analysis.Interpreter<V> r8) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r5 = this;
            r0 = r5
            org.objectweb.asm.tree.analysis.Value r0 = r0.pop()
            r9 = r0
            r0 = r9
            int r0 = r0.getSize()
            r1 = 1
            if (r0 != r1) goto L42
            r0 = r5
            org.objectweb.asm.tree.analysis.Value r0 = r0.pop()
            r10 = r0
            r0 = r10
            int r0 = r0.getSize()
            r1 = 1
            if (r0 != r1) goto L3f
            r0 = r5
            r1 = r8
            r2 = r6
            r3 = r7
            org.objectweb.asm.tree.analysis.Value r1 = r1.copyOperation(r2, r3)
            r0.push(r1)
            r0 = r5
            r1 = r10
            r0.push(r1)
            r0 = r5
            r1 = r9
            r0.push(r1)
            r0 = r5
            r1 = r7
            r0.push(r1)
            r0 = 1
            return r0
        L3f:
            goto L59
        L42:
            r0 = r5
            r1 = r8
            r2 = r6
            r3 = r7
            org.objectweb.asm.tree.analysis.Value r1 = r1.copyOperation(r2, r3)
            r0.push(r1)
            r0 = r5
            r1 = r9
            r0.push(r1)
            r0 = r5
            r1 = r7
            r0.push(r1)
            r0 = 1
            return r0
        L59:
            r0 = 0
            return r0
    }

    private void executeInvokeInsn(org.objectweb.asm.tree.AbstractInsnNode r6, java.lang.String r7, org.objectweb.asm.tree.analysis.Interpreter<V> r8) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r7
            org.objectweb.asm.Type[] r0 = org.objectweb.asm.Type.getArgumentTypes(r0)
            int r0 = r0.length
            r10 = r0
        L10:
            r0 = r10
            if (r0 <= 0) goto L25
            r0 = r9
            r1 = 0
            r2 = r5
            org.objectweb.asm.tree.analysis.Value r2 = r2.pop()
            r0.add(r1, r2)
            int r10 = r10 + (-1)
            goto L10
        L25:
            r0 = r6
            int r0 = r0.getOpcode()
            r1 = 184(0xb8, float:2.58E-43)
            if (r0 == r1) goto L43
            r0 = r6
            int r0 = r0.getOpcode()
            r1 = 186(0xba, float:2.6E-43)
            if (r0 == r1) goto L43
            r0 = r9
            r1 = 0
            r2 = r5
            org.objectweb.asm.tree.analysis.Value r2 = r2.pop()
            r0.add(r1, r2)
        L43:
            r0 = r7
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getReturnType(r0)
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.VOID_TYPE
            if (r0 != r1) goto L58
            r0 = r8
            r1 = r6
            r2 = r9
            org.objectweb.asm.tree.analysis.Value r0 = r0.naryOperation(r1, r2)
            goto L63
        L58:
            r0 = r5
            r1 = r8
            r2 = r6
            r3 = r9
            org.objectweb.asm.tree.analysis.Value r1 = r1.naryOperation(r2, r3)
            r0.push(r1)
        L63:
            return
    }

    public boolean merge(org.objectweb.asm.tree.analysis.Frame<? extends V> r6, org.objectweb.asm.tree.analysis.Interpreter<V> r7) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r5 = this;
            r0 = r5
            int r0 = r0.numStack
            r1 = r6
            int r1 = r1.numStack
            if (r0 == r1) goto L17
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException
            r1 = r0
            r2 = 0
            java.lang.String r3 = "Incompatible stack heights"
            r1.<init>(r2, r3)
            throw r0
        L17:
            r0 = 0
            r8 = r0
            r0 = 0
            r9 = r0
        L1c:
            r0 = r9
            r1 = r5
            int r1 = r1.numLocals
            r2 = r5
            int r2 = r2.numStack
            int r1 = r1 + r2
            if (r0 >= r1) goto L5e
            r0 = r7
            r1 = r5
            V extends org.objectweb.asm.tree.analysis.Value[] r1 = r1.values
            r2 = r9
            r1 = r1[r2]
            r2 = r6
            V extends org.objectweb.asm.tree.analysis.Value[] r2 = r2.values
            r3 = r9
            r2 = r2[r3]
            org.objectweb.asm.tree.analysis.Value r0 = r0.merge(r1, r2)
            r10 = r0
            r0 = r10
            r1 = r5
            V extends org.objectweb.asm.tree.analysis.Value[] r1 = r1.values
            r2 = r9
            r1 = r1[r2]
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L58
            r0 = r5
            V extends org.objectweb.asm.tree.analysis.Value[] r0 = r0.values
            r1 = r9
            r2 = r10
            r0[r1] = r2
            r0 = 1
            r8 = r0
        L58:
            int r9 = r9 + 1
            goto L1c
        L5e:
            r0 = r8
            return r0
    }

    public boolean merge(org.objectweb.asm.tree.analysis.Frame<? extends V> r6, boolean[] r7) {
            r5 = this;
            r0 = 0
            r8 = r0
            r0 = 0
            r9 = r0
        L5:
            r0 = r9
            r1 = r5
            int r1 = r1.numLocals
            if (r0 >= r1) goto L3f
            r0 = r7
            r1 = r9
            r0 = r0[r1]
            if (r0 != 0) goto L39
            r0 = r5
            V extends org.objectweb.asm.tree.analysis.Value[] r0 = r0.values
            r1 = r9
            r0 = r0[r1]
            r1 = r6
            V extends org.objectweb.asm.tree.analysis.Value[] r1 = r1.values
            r2 = r9
            r1 = r1[r2]
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L39
            r0 = r5
            V extends org.objectweb.asm.tree.analysis.Value[] r0 = r0.values
            r1 = r9
            r2 = r6
            V extends org.objectweb.asm.tree.analysis.Value[] r2 = r2.values
            r3 = r9
            r2 = r2[r3]
            r0[r1] = r2
            r0 = 1
            r8 = r0
        L39:
            int r9 = r9 + 1
            goto L5
        L3f:
            r0 = r8
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = 0
            r6 = r0
        La:
            r0 = r6
            r1 = r4
            int r1 = r1.getLocals()
            if (r0 >= r1) goto L22
            r0 = r5
            r1 = r4
            r2 = r6
            org.objectweb.asm.tree.analysis.Value r1 = r1.getLocal(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            int r6 = r6 + 1
            goto La
        L22:
            r0 = r5
            r1 = 32
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = 0
            r6 = r0
        L2b:
            r0 = r6
            r1 = r4
            int r1 = r1.getStackSize()
            if (r0 >= r1) goto L46
            r0 = r5
            r1 = r4
            r2 = r6
            org.objectweb.asm.tree.analysis.Value r1 = r1.getStack(r2)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            int r6 = r6 + 1
            goto L2b
        L46:
            r0 = r5
            java.lang.String r0 = r0.toString()
            return r0
    }
}
