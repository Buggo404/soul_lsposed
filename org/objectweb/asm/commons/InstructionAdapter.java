package org.objectweb.asm.commons;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/commons/InstructionAdapter.SCL.lombok */
public class InstructionAdapter extends org.objectweb.asm.MethodVisitor {
    public static final org.objectweb.asm.Type OBJECT_TYPE = null;

    public InstructionAdapter(org.objectweb.asm.MethodVisitor r5) {
            r4 = this;
            r0 = r4
            r1 = 589824(0x90000, float:8.2652E-40)
            r2 = r5
            r0.<init>(r1, r2)
            r0 = r4
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<org.objectweb.asm.commons.InstructionAdapter> r1 = org.objectweb.asm.commons.InstructionAdapter.class
            if (r0 == r1) goto L18
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r1.<init>()
            throw r0
        L18:
            return
    }

    protected InstructionAdapter(int r5, org.objectweb.asm.MethodVisitor r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInsn(int r5) {
            r4 = this;
            r0 = r5
            switch(r0) {
                case 0: goto L320;
                case 1: goto L327;
                case 2: goto L32f;
                case 3: goto L32f;
                case 4: goto L32f;
                case 5: goto L32f;
                case 6: goto L32f;
                case 7: goto L32f;
                case 8: goto L32f;
                case 9: goto L339;
                case 10: goto L339;
                case 11: goto L345;
                case 12: goto L345;
                case 13: goto L345;
                case 14: goto L351;
                case 15: goto L351;
                case 16: goto L6ee;
                case 17: goto L6ee;
                case 18: goto L6ee;
                case 19: goto L6ee;
                case 20: goto L6ee;
                case 21: goto L6ee;
                case 22: goto L6ee;
                case 23: goto L6ee;
                case 24: goto L6ee;
                case 25: goto L6ee;
                case 26: goto L6ee;
                case 27: goto L6ee;
                case 28: goto L6ee;
                case 29: goto L6ee;
                case 30: goto L6ee;
                case 31: goto L6ee;
                case 32: goto L6ee;
                case 33: goto L6ee;
                case 34: goto L6ee;
                case 35: goto L6ee;
                case 36: goto L6ee;
                case 37: goto L6ee;
                case 38: goto L6ee;
                case 39: goto L6ee;
                case 40: goto L6ee;
                case 41: goto L6ee;
                case 42: goto L6ee;
                case 43: goto L6ee;
                case 44: goto L6ee;
                case 45: goto L6ee;
                case 46: goto L35d;
                case 47: goto L367;
                case 48: goto L371;
                case 49: goto L37b;
                case 50: goto L385;
                case 51: goto L38f;
                case 52: goto L399;
                case 53: goto L3a3;
                case 54: goto L6ee;
                case 55: goto L6ee;
                case 56: goto L6ee;
                case 57: goto L6ee;
                case 58: goto L6ee;
                case 59: goto L6ee;
                case 60: goto L6ee;
                case 61: goto L6ee;
                case 62: goto L6ee;
                case 63: goto L6ee;
                case 64: goto L6ee;
                case 65: goto L6ee;
                case 66: goto L6ee;
                case 67: goto L6ee;
                case 68: goto L6ee;
                case 69: goto L6ee;
                case 70: goto L6ee;
                case 71: goto L6ee;
                case 72: goto L6ee;
                case 73: goto L6ee;
                case 74: goto L6ee;
                case 75: goto L6ee;
                case 76: goto L6ee;
                case 77: goto L6ee;
                case 78: goto L6ee;
                case 79: goto L3ad;
                case 80: goto L3b7;
                case 81: goto L3c1;
                case 82: goto L3cb;
                case 83: goto L3d5;
                case 84: goto L3df;
                case 85: goto L3e9;
                case 86: goto L3f3;
                case 87: goto L3fd;
                case 88: goto L404;
                case 89: goto L40b;
                case 90: goto L412;
                case 91: goto L419;
                case 92: goto L420;
                case 93: goto L427;
                case 94: goto L42e;
                case 95: goto L435;
                case 96: goto L43c;
                case 97: goto L446;
                case 98: goto L450;
                case 99: goto L45a;
                case 100: goto L464;
                case 101: goto L46e;
                case 102: goto L478;
                case 103: goto L482;
                case 104: goto L48c;
                case 105: goto L496;
                case 106: goto L4a0;
                case 107: goto L4aa;
                case 108: goto L4b4;
                case 109: goto L4be;
                case 110: goto L4c8;
                case 111: goto L4d2;
                case 112: goto L4dc;
                case 113: goto L4e6;
                case 114: goto L4f0;
                case 115: goto L4fa;
                case 116: goto L504;
                case 117: goto L50e;
                case 118: goto L518;
                case 119: goto L522;
                case 120: goto L52c;
                case 121: goto L536;
                case 122: goto L540;
                case 123: goto L54a;
                case 124: goto L554;
                case 125: goto L55e;
                case 126: goto L568;
                case 127: goto L572;
                case 128: goto L57c;
                case 129: goto L586;
                case 130: goto L590;
                case 131: goto L59a;
                case 132: goto L6ee;
                case 133: goto L5a4;
                case 134: goto L5b1;
                case 135: goto L5be;
                case 136: goto L5cb;
                case 137: goto L5d8;
                case 138: goto L5e5;
                case 139: goto L5f2;
                case 140: goto L5ff;
                case 141: goto L60c;
                case 142: goto L619;
                case 143: goto L626;
                case 144: goto L633;
                case 145: goto L640;
                case 146: goto L64d;
                case 147: goto L65a;
                case 148: goto L667;
                case 149: goto L66e;
                case 150: goto L678;
                case 151: goto L682;
                case 152: goto L68c;
                case 153: goto L6ee;
                case 154: goto L6ee;
                case 155: goto L6ee;
                case 156: goto L6ee;
                case 157: goto L6ee;
                case 158: goto L6ee;
                case 159: goto L6ee;
                case 160: goto L6ee;
                case 161: goto L6ee;
                case 162: goto L6ee;
                case 163: goto L6ee;
                case 164: goto L6ee;
                case 165: goto L6ee;
                case 166: goto L6ee;
                case 167: goto L6ee;
                case 168: goto L6ee;
                case 169: goto L6ee;
                case 170: goto L6ee;
                case 171: goto L6ee;
                case 172: goto L696;
                case 173: goto L6a0;
                case 174: goto L6aa;
                case 175: goto L6b4;
                case 176: goto L6be;
                case 177: goto L6c8;
                case 178: goto L6ee;
                case 179: goto L6ee;
                case 180: goto L6ee;
                case 181: goto L6ee;
                case 182: goto L6ee;
                case 183: goto L6ee;
                case 184: goto L6ee;
                case 185: goto L6ee;
                case 186: goto L6ee;
                case 187: goto L6ee;
                case 188: goto L6ee;
                case 189: goto L6ee;
                case 190: goto L6d2;
                case 191: goto L6d9;
                case 192: goto L6ee;
                case 193: goto L6ee;
                case 194: goto L6e0;
                case 195: goto L6e7;
                default: goto L6ee;
            }
        L320:
            r0 = r4
            r0.nop()
            goto L6f6
        L327:
            r0 = r4
            r1 = 0
            r0.aconst(r1)
            goto L6f6
        L32f:
            r0 = r4
            r1 = r5
            r2 = 3
            int r1 = r1 - r2
            r0.iconst(r1)
            goto L6f6
        L339:
            r0 = r4
            r1 = r5
            r2 = 9
            int r1 = r1 - r2
            long r1 = (long) r1
            r0.lconst(r1)
            goto L6f6
        L345:
            r0 = r4
            r1 = r5
            r2 = 11
            int r1 = r1 - r2
            float r1 = (float) r1
            r0.fconst(r1)
            goto L6f6
        L351:
            r0 = r4
            r1 = r5
            r2 = 14
            int r1 = r1 - r2
            double r1 = (double) r1
            r0.dconst(r1)
            goto L6f6
        L35d:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.INT_TYPE
            r0.aload(r1)
            goto L6f6
        L367:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.LONG_TYPE
            r0.aload(r1)
            goto L6f6
        L371:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.FLOAT_TYPE
            r0.aload(r1)
            goto L6f6
        L37b:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.DOUBLE_TYPE
            r0.aload(r1)
            goto L6f6
        L385:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.commons.InstructionAdapter.OBJECT_TYPE
            r0.aload(r1)
            goto L6f6
        L38f:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.BYTE_TYPE
            r0.aload(r1)
            goto L6f6
        L399:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.CHAR_TYPE
            r0.aload(r1)
            goto L6f6
        L3a3:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.SHORT_TYPE
            r0.aload(r1)
            goto L6f6
        L3ad:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.INT_TYPE
            r0.astore(r1)
            goto L6f6
        L3b7:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.LONG_TYPE
            r0.astore(r1)
            goto L6f6
        L3c1:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.FLOAT_TYPE
            r0.astore(r1)
            goto L6f6
        L3cb:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.DOUBLE_TYPE
            r0.astore(r1)
            goto L6f6
        L3d5:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.commons.InstructionAdapter.OBJECT_TYPE
            r0.astore(r1)
            goto L6f6
        L3df:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.BYTE_TYPE
            r0.astore(r1)
            goto L6f6
        L3e9:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.CHAR_TYPE
            r0.astore(r1)
            goto L6f6
        L3f3:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.SHORT_TYPE
            r0.astore(r1)
            goto L6f6
        L3fd:
            r0 = r4
            r0.pop()
            goto L6f6
        L404:
            r0 = r4
            r0.pop2()
            goto L6f6
        L40b:
            r0 = r4
            r0.dup()
            goto L6f6
        L412:
            r0 = r4
            r0.dupX1()
            goto L6f6
        L419:
            r0 = r4
            r0.dupX2()
            goto L6f6
        L420:
            r0 = r4
            r0.dup2()
            goto L6f6
        L427:
            r0 = r4
            r0.dup2X1()
            goto L6f6
        L42e:
            r0 = r4
            r0.dup2X2()
            goto L6f6
        L435:
            r0 = r4
            r0.swap()
            goto L6f6
        L43c:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.INT_TYPE
            r0.add(r1)
            goto L6f6
        L446:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.LONG_TYPE
            r0.add(r1)
            goto L6f6
        L450:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.FLOAT_TYPE
            r0.add(r1)
            goto L6f6
        L45a:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.DOUBLE_TYPE
            r0.add(r1)
            goto L6f6
        L464:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.INT_TYPE
            r0.sub(r1)
            goto L6f6
        L46e:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.LONG_TYPE
            r0.sub(r1)
            goto L6f6
        L478:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.FLOAT_TYPE
            r0.sub(r1)
            goto L6f6
        L482:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.DOUBLE_TYPE
            r0.sub(r1)
            goto L6f6
        L48c:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.INT_TYPE
            r0.mul(r1)
            goto L6f6
        L496:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.LONG_TYPE
            r0.mul(r1)
            goto L6f6
        L4a0:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.FLOAT_TYPE
            r0.mul(r1)
            goto L6f6
        L4aa:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.DOUBLE_TYPE
            r0.mul(r1)
            goto L6f6
        L4b4:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.INT_TYPE
            r0.div(r1)
            goto L6f6
        L4be:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.LONG_TYPE
            r0.div(r1)
            goto L6f6
        L4c8:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.FLOAT_TYPE
            r0.div(r1)
            goto L6f6
        L4d2:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.DOUBLE_TYPE
            r0.div(r1)
            goto L6f6
        L4dc:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.INT_TYPE
            r0.rem(r1)
            goto L6f6
        L4e6:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.LONG_TYPE
            r0.rem(r1)
            goto L6f6
        L4f0:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.FLOAT_TYPE
            r0.rem(r1)
            goto L6f6
        L4fa:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.DOUBLE_TYPE
            r0.rem(r1)
            goto L6f6
        L504:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.INT_TYPE
            r0.neg(r1)
            goto L6f6
        L50e:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.LONG_TYPE
            r0.neg(r1)
            goto L6f6
        L518:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.FLOAT_TYPE
            r0.neg(r1)
            goto L6f6
        L522:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.DOUBLE_TYPE
            r0.neg(r1)
            goto L6f6
        L52c:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.INT_TYPE
            r0.shl(r1)
            goto L6f6
        L536:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.LONG_TYPE
            r0.shl(r1)
            goto L6f6
        L540:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.INT_TYPE
            r0.shr(r1)
            goto L6f6
        L54a:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.LONG_TYPE
            r0.shr(r1)
            goto L6f6
        L554:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.INT_TYPE
            r0.ushr(r1)
            goto L6f6
        L55e:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.LONG_TYPE
            r0.ushr(r1)
            goto L6f6
        L568:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.INT_TYPE
            r0.and(r1)
            goto L6f6
        L572:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.LONG_TYPE
            r0.and(r1)
            goto L6f6
        L57c:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.INT_TYPE
            r0.m122or(r1)
            goto L6f6
        L586:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.LONG_TYPE
            r0.m122or(r1)
            goto L6f6
        L590:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.INT_TYPE
            r0.xor(r1)
            goto L6f6
        L59a:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.LONG_TYPE
            r0.xor(r1)
            goto L6f6
        L5a4:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.INT_TYPE
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.LONG_TYPE
            r0.cast(r1, r2)
            goto L6f6
        L5b1:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.INT_TYPE
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.FLOAT_TYPE
            r0.cast(r1, r2)
            goto L6f6
        L5be:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.INT_TYPE
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.DOUBLE_TYPE
            r0.cast(r1, r2)
            goto L6f6
        L5cb:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.LONG_TYPE
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.INT_TYPE
            r0.cast(r1, r2)
            goto L6f6
        L5d8:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.LONG_TYPE
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.FLOAT_TYPE
            r0.cast(r1, r2)
            goto L6f6
        L5e5:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.LONG_TYPE
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.DOUBLE_TYPE
            r0.cast(r1, r2)
            goto L6f6
        L5f2:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.FLOAT_TYPE
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.INT_TYPE
            r0.cast(r1, r2)
            goto L6f6
        L5ff:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.FLOAT_TYPE
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.LONG_TYPE
            r0.cast(r1, r2)
            goto L6f6
        L60c:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.FLOAT_TYPE
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.DOUBLE_TYPE
            r0.cast(r1, r2)
            goto L6f6
        L619:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.DOUBLE_TYPE
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.INT_TYPE
            r0.cast(r1, r2)
            goto L6f6
        L626:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.DOUBLE_TYPE
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.LONG_TYPE
            r0.cast(r1, r2)
            goto L6f6
        L633:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.DOUBLE_TYPE
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.FLOAT_TYPE
            r0.cast(r1, r2)
            goto L6f6
        L640:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.INT_TYPE
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.BYTE_TYPE
            r0.cast(r1, r2)
            goto L6f6
        L64d:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.INT_TYPE
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.CHAR_TYPE
            r0.cast(r1, r2)
            goto L6f6
        L65a:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.INT_TYPE
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.SHORT_TYPE
            r0.cast(r1, r2)
            goto L6f6
        L667:
            r0 = r4
            r0.lcmp()
            goto L6f6
        L66e:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.FLOAT_TYPE
            r0.cmpl(r1)
            goto L6f6
        L678:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.FLOAT_TYPE
            r0.cmpg(r1)
            goto L6f6
        L682:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.DOUBLE_TYPE
            r0.cmpl(r1)
            goto L6f6
        L68c:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.DOUBLE_TYPE
            r0.cmpg(r1)
            goto L6f6
        L696:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.INT_TYPE
            r0.areturn(r1)
            goto L6f6
        L6a0:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.LONG_TYPE
            r0.areturn(r1)
            goto L6f6
        L6aa:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.FLOAT_TYPE
            r0.areturn(r1)
            goto L6f6
        L6b4:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.DOUBLE_TYPE
            r0.areturn(r1)
            goto L6f6
        L6be:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.commons.InstructionAdapter.OBJECT_TYPE
            r0.areturn(r1)
            goto L6f6
        L6c8:
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.VOID_TYPE
            r0.areturn(r1)
            goto L6f6
        L6d2:
            r0 = r4
            r0.arraylength()
            goto L6f6
        L6d9:
            r0 = r4
            r0.athrow()
            goto L6f6
        L6e0:
            r0 = r4
            r0.monitorenter()
            goto L6f6
        L6e7:
            r0 = r4
            r0.monitorexit()
            goto L6f6
        L6ee:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L6f6:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int r4, int r5) {
            r3 = this;
            r0 = r4
            switch(r0) {
                case 16: goto L24;
                case 17: goto L2c;
                case 188: goto L34;
                default: goto Lbc;
            }
        L24:
            r0 = r3
            r1 = r5
            r0.iconst(r1)
            goto Lc4
        L2c:
            r0 = r3
            r1 = r5
            r0.iconst(r1)
            goto Lc4
        L34:
            r0 = r5
            switch(r0) {
                case 4: goto L64;
                case 5: goto L6e;
                case 6: goto L96;
                case 7: goto Laa;
                case 8: goto L78;
                case 9: goto L82;
                case 10: goto L8c;
                case 11: goto La0;
                default: goto Lb4;
            }
        L64:
            r0 = r3
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.BOOLEAN_TYPE
            r0.newarray(r1)
            goto Lc4
        L6e:
            r0 = r3
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.CHAR_TYPE
            r0.newarray(r1)
            goto Lc4
        L78:
            r0 = r3
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.BYTE_TYPE
            r0.newarray(r1)
            goto Lc4
        L82:
            r0 = r3
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.SHORT_TYPE
            r0.newarray(r1)
            goto Lc4
        L8c:
            r0 = r3
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.INT_TYPE
            r0.newarray(r1)
            goto Lc4
        L96:
            r0 = r3
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.FLOAT_TYPE
            r0.newarray(r1)
            goto Lc4
        La0:
            r0 = r3
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.LONG_TYPE
            r0.newarray(r1)
            goto Lc4
        Laa:
            r0 = r3
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.DOUBLE_TYPE
            r0.newarray(r1)
            goto Lc4
        Lb4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        Lbc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        Lc4:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int r5, int r6) {
            r4 = this;
            r0 = r5
            switch(r0) {
                case 21: goto L64;
                case 22: goto L6f;
                case 23: goto L7a;
                case 24: goto L85;
                case 25: goto L90;
                case 54: goto L9b;
                case 55: goto La6;
                case 56: goto Lb1;
                case 57: goto Lbc;
                case 58: goto Lc7;
                case 169: goto Ld2;
                default: goto Lda;
            }
        L64:
            r0 = r4
            r1 = r6
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.INT_TYPE
            r0.load(r1, r2)
            goto Le2
        L6f:
            r0 = r4
            r1 = r6
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.LONG_TYPE
            r0.load(r1, r2)
            goto Le2
        L7a:
            r0 = r4
            r1 = r6
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.FLOAT_TYPE
            r0.load(r1, r2)
            goto Le2
        L85:
            r0 = r4
            r1 = r6
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.DOUBLE_TYPE
            r0.load(r1, r2)
            goto Le2
        L90:
            r0 = r4
            r1 = r6
            org.objectweb.asm.Type r2 = org.objectweb.asm.commons.InstructionAdapter.OBJECT_TYPE
            r0.load(r1, r2)
            goto Le2
        L9b:
            r0 = r4
            r1 = r6
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.INT_TYPE
            r0.store(r1, r2)
            goto Le2
        La6:
            r0 = r4
            r1 = r6
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.LONG_TYPE
            r0.store(r1, r2)
            goto Le2
        Lb1:
            r0 = r4
            r1 = r6
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.FLOAT_TYPE
            r0.store(r1, r2)
            goto Le2
        Lbc:
            r0 = r4
            r1 = r6
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.DOUBLE_TYPE
            r0.store(r1, r2)
            goto Le2
        Lc7:
            r0 = r4
            r1 = r6
            org.objectweb.asm.Type r2 = org.objectweb.asm.commons.InstructionAdapter.OBJECT_TYPE
            r0.store(r1, r2)
            goto Le2
        Ld2:
            r0 = r4
            r1 = r6
            r0.ret(r1)
            goto Le2
        Lda:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        Le2:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int r4, java.lang.String r5) {
            r3 = this;
            r0 = r5
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getObjectType(r0)
            r6 = r0
            r0 = r4
            switch(r0) {
                case 187: goto L30;
                case 188: goto L50;
                case 189: goto L38;
                case 190: goto L50;
                case 191: goto L50;
                case 192: goto L40;
                case 193: goto L48;
                default: goto L50;
            }
        L30:
            r0 = r3
            r1 = r6
            r0.anew(r1)
            goto L58
        L38:
            r0 = r3
            r1 = r6
            r0.newarray(r1)
            goto L58
        L40:
            r0 = r3
            r1 = r6
            r0.checkcast(r1)
            goto L58
        L48:
            r0 = r3
            r1 = r6
            r0.instanceOf(r1)
            goto L58
        L50:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L58:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r5 = this;
            r0 = r6
            switch(r0) {
                case 178: goto L20;
                case 179: goto L2b;
                case 180: goto L36;
                case 181: goto L41;
                default: goto L4c;
            }
        L20:
            r0 = r5
            r1 = r7
            r2 = r8
            r3 = r9
            r0.getstatic(r1, r2, r3)
            goto L54
        L2b:
            r0 = r5
            r1 = r7
            r2 = r8
            r3 = r9
            r0.putstatic(r1, r2, r3)
            goto L54
        L36:
            r0 = r5
            r1 = r7
            r2 = r8
            r3 = r9
            r0.getfield(r1, r2, r3)
            goto L54
        L41:
            r0 = r5
            r1 = r7
            r2 = r8
            r3 = r9
            r0.putfield(r1, r2, r3)
            goto L54
        L4c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L54:
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
            r0 = r8
            r1 = -257(0xfffffffffffffeff, float:NaN)
            r0 = r0 & r1
            r13 = r0
            r0 = r13
            switch(r0) {
                case 182: goto L51;
                case 183: goto L44;
                case 184: goto L5e;
                case 185: goto L6b;
                default: goto L76;
            }
        L44:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r0.invokespecial(r1, r2, r3, r4)
            goto L7e
        L51:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r0.invokevirtual(r1, r2, r3, r4)
            goto L7e
        L5e:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r0.invokestatic(r1, r2, r3, r4)
            goto L7e
        L6b:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            r0.invokeinterface(r1, r2, r3)
            goto L7e
        L76:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L7e:
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
            r0.invokedynamic(r1, r2, r3, r4)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int r4, org.objectweb.asm.Label r5) {
            r3 = this;
            r0 = r4
            switch(r0) {
                case 153: goto Lcc;
                case 154: goto Ld4;
                case 155: goto Ldc;
                case 156: goto Le4;
                case 157: goto Lec;
                case 158: goto Lf4;
                case 159: goto Lfc;
                case 160: goto L104;
                case 161: goto L10c;
                case 162: goto L114;
                case 163: goto L11c;
                case 164: goto L124;
                case 165: goto L12c;
                case 166: goto L134;
                case 167: goto L13c;
                case 168: goto L144;
                case 169: goto L15c;
                case 170: goto L15c;
                case 171: goto L15c;
                case 172: goto L15c;
                case 173: goto L15c;
                case 174: goto L15c;
                case 175: goto L15c;
                case 176: goto L15c;
                case 177: goto L15c;
                case 178: goto L15c;
                case 179: goto L15c;
                case 180: goto L15c;
                case 181: goto L15c;
                case 182: goto L15c;
                case 183: goto L15c;
                case 184: goto L15c;
                case 185: goto L15c;
                case 186: goto L15c;
                case 187: goto L15c;
                case 188: goto L15c;
                case 189: goto L15c;
                case 190: goto L15c;
                case 191: goto L15c;
                case 192: goto L15c;
                case 193: goto L15c;
                case 194: goto L15c;
                case 195: goto L15c;
                case 196: goto L15c;
                case 197: goto L15c;
                case 198: goto L14c;
                case 199: goto L154;
                default: goto L15c;
            }
        Lcc:
            r0 = r3
            r1 = r5
            r0.ifeq(r1)
            goto L164
        Ld4:
            r0 = r3
            r1 = r5
            r0.ifne(r1)
            goto L164
        Ldc:
            r0 = r3
            r1 = r5
            r0.iflt(r1)
            goto L164
        Le4:
            r0 = r3
            r1 = r5
            r0.ifge(r1)
            goto L164
        Lec:
            r0 = r3
            r1 = r5
            r0.ifgt(r1)
            goto L164
        Lf4:
            r0 = r3
            r1 = r5
            r0.ifle(r1)
            goto L164
        Lfc:
            r0 = r3
            r1 = r5
            r0.ificmpeq(r1)
            goto L164
        L104:
            r0 = r3
            r1 = r5
            r0.ificmpne(r1)
            goto L164
        L10c:
            r0 = r3
            r1 = r5
            r0.ificmplt(r1)
            goto L164
        L114:
            r0 = r3
            r1 = r5
            r0.ificmpge(r1)
            goto L164
        L11c:
            r0 = r3
            r1 = r5
            r0.ificmpgt(r1)
            goto L164
        L124:
            r0 = r3
            r1 = r5
            r0.ificmple(r1)
            goto L164
        L12c:
            r0 = r3
            r1 = r5
            r0.ifacmpeq(r1)
            goto L164
        L134:
            r0 = r3
            r1 = r5
            r0.ifacmpne(r1)
            goto L164
        L13c:
            r0 = r3
            r1 = r5
            r0.goTo(r1)
            goto L164
        L144:
            r0 = r3
            r1 = r5
            r0.jsr(r1)
            goto L164
        L14c:
            r0 = r3
            r1 = r5
            r0.ifnull(r1)
            goto L164
        L154:
            r0 = r3
            r1 = r5
            r0.ifnonnull(r1)
            goto L164
        L15c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L164:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLabel(org.objectweb.asm.Label r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.mark(r1)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(java.lang.Object r5) {
            r4 = this;
            r0 = r4
            int r0 = r0.api
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 >= r1) goto L2e
            r0 = r5
            boolean r0 = r0 instanceof org.objectweb.asm.Handle
            if (r0 != 0) goto L23
            r0 = r5
            boolean r0 = r0 instanceof org.objectweb.asm.Type
            if (r0 == 0) goto L2e
            r0 = r5
            org.objectweb.asm.Type r0 = (org.objectweb.asm.Type) r0
            int r0 = r0.getSort()
            r1 = 11
            if (r0 != r1) goto L2e
        L23:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "This feature requires ASM5"
            r1.<init>(r2)
            throw r0
        L2e:
            r0 = r4
            int r0 = r0.api
            r1 = 458752(0x70000, float:6.42848E-40)
            if (r0 >= r1) goto L4a
            r0 = r5
            boolean r0 = r0 instanceof org.objectweb.asm.ConstantDynamic
            if (r0 == 0) goto L4a
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "This feature requires ASM7"
            r1.<init>(r2)
            throw r0
        L4a:
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 == 0) goto L5f
            r0 = r4
            r1 = r5
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.iconst(r1)
            goto L147
        L5f:
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Byte
            if (r0 == 0) goto L74
            r0 = r4
            r1 = r5
            java.lang.Byte r1 = (java.lang.Byte) r1
            int r1 = r1.intValue()
            r0.iconst(r1)
            goto L147
        L74:
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Character
            if (r0 == 0) goto L89
            r0 = r4
            r1 = r5
            java.lang.Character r1 = (java.lang.Character) r1
            char r1 = r1.charValue()
            r0.iconst(r1)
            goto L147
        L89:
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Short
            if (r0 == 0) goto L9e
            r0 = r4
            r1 = r5
            java.lang.Short r1 = (java.lang.Short) r1
            int r1 = r1.intValue()
            r0.iconst(r1)
            goto L147
        L9e:
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Boolean
            if (r0 == 0) goto Lbb
            r0 = r4
            r1 = r5
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Lb4
            r1 = 1
            goto Lb5
        Lb4:
            r1 = 0
        Lb5:
            r0.iconst(r1)
            goto L147
        Lbb:
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Float
            if (r0 == 0) goto Ld0
            r0 = r4
            r1 = r5
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r0.fconst(r1)
            goto L147
        Ld0:
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Long
            if (r0 == 0) goto Le5
            r0 = r4
            r1 = r5
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r0.lconst(r1)
            goto L147
        Le5:
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Double
            if (r0 == 0) goto Lfa
            r0 = r4
            r1 = r5
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            r0.dconst(r1)
            goto L147
        Lfa:
            r0 = r5
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L109
            r0 = r4
            r1 = r5
            r0.aconst(r1)
            goto L147
        L109:
            r0 = r5
            boolean r0 = r0 instanceof org.objectweb.asm.Type
            if (r0 == 0) goto L11b
            r0 = r4
            r1 = r5
            org.objectweb.asm.Type r1 = (org.objectweb.asm.Type) r1
            r0.tconst(r1)
            goto L147
        L11b:
            r0 = r5
            boolean r0 = r0 instanceof org.objectweb.asm.Handle
            if (r0 == 0) goto L12d
            r0 = r4
            r1 = r5
            org.objectweb.asm.Handle r1 = (org.objectweb.asm.Handle) r1
            r0.hconst(r1)
            goto L147
        L12d:
            r0 = r5
            boolean r0 = r0 instanceof org.objectweb.asm.ConstantDynamic
            if (r0 == 0) goto L13f
            r0 = r4
            r1 = r5
            org.objectweb.asm.ConstantDynamic r1 = (org.objectweb.asm.ConstantDynamic) r1
            r0.cconst(r1)
            goto L147
        L13f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L147:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.iinc(r1, r2)
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
            r0.tableswitch(r1, r2, r3, r4)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(org.objectweb.asm.Label r6, int[] r7, org.objectweb.asm.Label[] r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.lookupswitch(r1, r2, r3)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(java.lang.String r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.multianewarray(r1, r2)
            return
    }

    public void nop() {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 0
            r0.visitInsn(r1)
            return
    }

    public void aconst(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            if (r0 != 0) goto Lf
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 1
            r0.visitInsn(r1)
            goto L17
        Lf:
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r4
            r0.visitLdcInsn(r1)
        L17:
            return
    }

    public void iconst(int r5) {
            r4 = this;
            r0 = r5
            r1 = -1
            if (r0 < r1) goto L17
            r0 = r5
            r1 = 5
            if (r0 > r1) goto L17
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 3
            r2 = r5
            int r1 = r1 + r2
            r0.visitInsn(r1)
            goto L56
        L17:
            r0 = r5
            r1 = -128(0xffffffffffffff80, float:NaN)
            if (r0 < r1) goto L30
            r0 = r5
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 > r1) goto L30
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 16
            r2 = r5
            r0.visitIntInsn(r1, r2)
            goto L56
        L30:
            r0 = r5
            r1 = -32768(0xffffffffffff8000, float:NaN)
            if (r0 < r1) goto L4b
            r0 = r5
            r1 = 32767(0x7fff, float:4.5916E-41)
            if (r0 > r1) goto L4b
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 17
            r2 = r5
            r0.visitIntInsn(r1, r2)
            goto L56
        L4b:
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.visitLdcInsn(r1)
        L56:
            return
    }

    public void lconst(long r6) {
            r5 = this;
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lc
            r0 = r6
            r1 = 1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L1b
        Lc:
            r0 = r5
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 9
            r2 = r6
            int r2 = (int) r2
            int r1 = r1 + r2
            r0.visitInsn(r1)
            goto L26
        L1b:
            r0 = r5
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r6
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.visitLdcInsn(r1)
        L26:
            return
    }

    public void fconst(float r6) {
            r5 = this;
            r0 = r6
            int r0 = java.lang.Float.floatToIntBits(r0)
            r7 = r0
            r0 = r7
            long r0 = (long) r0
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L1a
            r0 = r7
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == r1) goto L1a
            r0 = r7
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L29
        L1a:
            r0 = r5
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 11
            r2 = r6
            int r2 = (int) r2
            int r1 = r1 + r2
            r0.visitInsn(r1)
            goto L34
        L29:
            r0 = r5
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r6
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r0.visitLdcInsn(r1)
        L34:
            return
    }

    public void dconst(double r6) {
            r5 = this;
            r0 = r6
            long r0 = java.lang.Double.doubleToLongBits(r0)
            r8 = r0
            r0 = r8
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L13
            r0 = r8
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L22
        L13:
            r0 = r5
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 14
            r2 = r6
            int r2 = (int) r2
            int r1 = r1 + r2
            r0.visitInsn(r1)
            goto L2d
        L22:
            r0 = r5
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r6
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.visitLdcInsn(r1)
        L2d:
            return
    }

    public void tconst(org.objectweb.asm.Type r4) {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r4
            r0.visitLdcInsn(r1)
            return
    }

    public void hconst(org.objectweb.asm.Handle r4) {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r4
            r0.visitLdcInsn(r1)
            return
    }

    public void cconst(org.objectweb.asm.ConstantDynamic r4) {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r4
            r0.visitLdcInsn(r1)
            return
    }

    public void load(int r5, org.objectweb.asm.Type r6) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r6
            r2 = 21
            int r1 = r1.getOpcode(r2)
            r2 = r5
            r0.visitVarInsn(r1, r2)
            return
    }

    public void aload(org.objectweb.asm.Type r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            r2 = 46
            int r1 = r1.getOpcode(r2)
            r0.visitInsn(r1)
            return
    }

    public void store(int r5, org.objectweb.asm.Type r6) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r6
            r2 = 54
            int r1 = r1.getOpcode(r2)
            r2 = r5
            r0.visitVarInsn(r1, r2)
            return
    }

    public void astore(org.objectweb.asm.Type r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            r2 = 79
            int r1 = r1.getOpcode(r2)
            r0.visitInsn(r1)
            return
    }

    public void pop() {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 87
            r0.visitInsn(r1)
            return
    }

    public void pop2() {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 88
            r0.visitInsn(r1)
            return
    }

    public void dup() {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 89
            r0.visitInsn(r1)
            return
    }

    public void dup2() {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 92
            r0.visitInsn(r1)
            return
    }

    public void dupX1() {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 90
            r0.visitInsn(r1)
            return
    }

    public void dupX2() {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 91
            r0.visitInsn(r1)
            return
    }

    public void dup2X1() {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 93
            r0.visitInsn(r1)
            return
    }

    public void dup2X2() {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 94
            r0.visitInsn(r1)
            return
    }

    public void swap() {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 95
            r0.visitInsn(r1)
            return
    }

    public void add(org.objectweb.asm.Type r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            r2 = 96
            int r1 = r1.getOpcode(r2)
            r0.visitInsn(r1)
            return
    }

    public void sub(org.objectweb.asm.Type r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            r2 = 100
            int r1 = r1.getOpcode(r2)
            r0.visitInsn(r1)
            return
    }

    public void mul(org.objectweb.asm.Type r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            r2 = 104(0x68, float:1.46E-43)
            int r1 = r1.getOpcode(r2)
            r0.visitInsn(r1)
            return
    }

    public void div(org.objectweb.asm.Type r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            r2 = 108(0x6c, float:1.51E-43)
            int r1 = r1.getOpcode(r2)
            r0.visitInsn(r1)
            return
    }

    public void rem(org.objectweb.asm.Type r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            r2 = 112(0x70, float:1.57E-43)
            int r1 = r1.getOpcode(r2)
            r0.visitInsn(r1)
            return
    }

    public void neg(org.objectweb.asm.Type r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            r2 = 116(0x74, float:1.63E-43)
            int r1 = r1.getOpcode(r2)
            r0.visitInsn(r1)
            return
    }

    public void shl(org.objectweb.asm.Type r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            r2 = 120(0x78, float:1.68E-43)
            int r1 = r1.getOpcode(r2)
            r0.visitInsn(r1)
            return
    }

    public void shr(org.objectweb.asm.Type r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            r2 = 122(0x7a, float:1.71E-43)
            int r1 = r1.getOpcode(r2)
            r0.visitInsn(r1)
            return
    }

    public void ushr(org.objectweb.asm.Type r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            r2 = 124(0x7c, float:1.74E-43)
            int r1 = r1.getOpcode(r2)
            r0.visitInsn(r1)
            return
    }

    public void and(org.objectweb.asm.Type r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            r2 = 126(0x7e, float:1.77E-43)
            int r1 = r1.getOpcode(r2)
            r0.visitInsn(r1)
            return
    }

    /* renamed from: or */
    public void m122or(org.objectweb.asm.Type r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            r2 = 128(0x80, float:1.794E-43)
            int r1 = r1.getOpcode(r2)
            r0.visitInsn(r1)
            return
    }

    public void xor(org.objectweb.asm.Type r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            r2 = 130(0x82, float:1.82E-43)
            int r1 = r1.getOpcode(r2)
            r0.visitInsn(r1)
            return
    }

    public void iinc(int r5, int r6) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            r2 = r6
            r0.visitIincInsn(r1, r2)
            return
    }

    public void cast(org.objectweb.asm.Type r5, org.objectweb.asm.Type r6) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            r2 = r6
            cast(r0, r1, r2)
            return
    }

    static void cast(org.objectweb.asm.MethodVisitor r4, org.objectweb.asm.Type r5, org.objectweb.asm.Type r6) {
            r0 = r5
            r1 = r6
            if (r0 == r1) goto L119
            r0 = r5
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.DOUBLE_TYPE
            if (r0 != r1) goto L40
            r0 = r6
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.FLOAT_TYPE
            if (r0 != r1) goto L1d
            r0 = r4
            r1 = 144(0x90, float:2.02E-43)
            r0.visitInsn(r1)
            goto L119
        L1d:
            r0 = r6
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.LONG_TYPE
            if (r0 != r1) goto L2e
            r0 = r4
            r1 = 143(0x8f, float:2.0E-43)
            r0.visitInsn(r1)
            goto L119
        L2e:
            r0 = r4
            r1 = 142(0x8e, float:1.99E-43)
            r0.visitInsn(r1)
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.INT_TYPE
            r2 = r6
            cast(r0, r1, r2)
            goto L119
        L40:
            r0 = r5
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.FLOAT_TYPE
            if (r0 != r1) goto L7b
            r0 = r6
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.DOUBLE_TYPE
            if (r0 != r1) goto L58
            r0 = r4
            r1 = 141(0x8d, float:1.98E-43)
            r0.visitInsn(r1)
            goto L119
        L58:
            r0 = r6
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.LONG_TYPE
            if (r0 != r1) goto L69
            r0 = r4
            r1 = 140(0x8c, float:1.96E-43)
            r0.visitInsn(r1)
            goto L119
        L69:
            r0 = r4
            r1 = 139(0x8b, float:1.95E-43)
            r0.visitInsn(r1)
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.INT_TYPE
            r2 = r6
            cast(r0, r1, r2)
            goto L119
        L7b:
            r0 = r5
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.LONG_TYPE
            if (r0 != r1) goto Lb6
            r0 = r6
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.DOUBLE_TYPE
            if (r0 != r1) goto L93
            r0 = r4
            r1 = 138(0x8a, float:1.93E-43)
            r0.visitInsn(r1)
            goto L119
        L93:
            r0 = r6
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.FLOAT_TYPE
            if (r0 != r1) goto La4
            r0 = r4
            r1 = 137(0x89, float:1.92E-43)
            r0.visitInsn(r1)
            goto L119
        La4:
            r0 = r4
            r1 = 136(0x88, float:1.9E-43)
            r0.visitInsn(r1)
            r0 = r4
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.INT_TYPE
            r2 = r6
            cast(r0, r1, r2)
            goto L119
        Lb6:
            r0 = r6
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.BYTE_TYPE
            if (r0 != r1) goto Lc7
            r0 = r4
            r1 = 145(0x91, float:2.03E-43)
            r0.visitInsn(r1)
            goto L119
        Lc7:
            r0 = r6
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.CHAR_TYPE
            if (r0 != r1) goto Ld8
            r0 = r4
            r1 = 146(0x92, float:2.05E-43)
            r0.visitInsn(r1)
            goto L119
        Ld8:
            r0 = r6
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.DOUBLE_TYPE
            if (r0 != r1) goto Le9
            r0 = r4
            r1 = 135(0x87, float:1.89E-43)
            r0.visitInsn(r1)
            goto L119
        Le9:
            r0 = r6
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.FLOAT_TYPE
            if (r0 != r1) goto Lfa
            r0 = r4
            r1 = 134(0x86, float:1.88E-43)
            r0.visitInsn(r1)
            goto L119
        Lfa:
            r0 = r6
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.LONG_TYPE
            if (r0 != r1) goto L10b
            r0 = r4
            r1 = 133(0x85, float:1.86E-43)
            r0.visitInsn(r1)
            goto L119
        L10b:
            r0 = r6
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.SHORT_TYPE
            if (r0 != r1) goto L119
            r0 = r4
            r1 = 147(0x93, float:2.06E-43)
            r0.visitInsn(r1)
        L119:
            return
    }

    public void lcmp() {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 148(0x94, float:2.07E-43)
            r0.visitInsn(r1)
            return
    }

    public void cmpl(org.objectweb.asm.Type r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.FLOAT_TYPE
            if (r1 != r2) goto L11
            r1 = 149(0x95, float:2.09E-43)
            goto L14
        L11:
            r1 = 151(0x97, float:2.12E-43)
        L14:
            r0.visitInsn(r1)
            return
    }

    public void cmpg(org.objectweb.asm.Type r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.FLOAT_TYPE
            if (r1 != r2) goto L11
            r1 = 150(0x96, float:2.1E-43)
            goto L14
        L11:
            r1 = 152(0x98, float:2.13E-43)
        L14:
            r0.visitInsn(r1)
            return
    }

    public void ifeq(org.objectweb.asm.Label r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 153(0x99, float:2.14E-43)
            r2 = r5
            r0.visitJumpInsn(r1, r2)
            return
    }

    public void ifne(org.objectweb.asm.Label r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 154(0x9a, float:2.16E-43)
            r2 = r5
            r0.visitJumpInsn(r1, r2)
            return
    }

    public void iflt(org.objectweb.asm.Label r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 155(0x9b, float:2.17E-43)
            r2 = r5
            r0.visitJumpInsn(r1, r2)
            return
    }

    public void ifge(org.objectweb.asm.Label r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 156(0x9c, float:2.19E-43)
            r2 = r5
            r0.visitJumpInsn(r1, r2)
            return
    }

    public void ifgt(org.objectweb.asm.Label r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 157(0x9d, float:2.2E-43)
            r2 = r5
            r0.visitJumpInsn(r1, r2)
            return
    }

    public void ifle(org.objectweb.asm.Label r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 158(0x9e, float:2.21E-43)
            r2 = r5
            r0.visitJumpInsn(r1, r2)
            return
    }

    public void ificmpeq(org.objectweb.asm.Label r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 159(0x9f, float:2.23E-43)
            r2 = r5
            r0.visitJumpInsn(r1, r2)
            return
    }

    public void ificmpne(org.objectweb.asm.Label r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 160(0xa0, float:2.24E-43)
            r2 = r5
            r0.visitJumpInsn(r1, r2)
            return
    }

    public void ificmplt(org.objectweb.asm.Label r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 161(0xa1, float:2.26E-43)
            r2 = r5
            r0.visitJumpInsn(r1, r2)
            return
    }

    public void ificmpge(org.objectweb.asm.Label r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 162(0xa2, float:2.27E-43)
            r2 = r5
            r0.visitJumpInsn(r1, r2)
            return
    }

    public void ificmpgt(org.objectweb.asm.Label r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 163(0xa3, float:2.28E-43)
            r2 = r5
            r0.visitJumpInsn(r1, r2)
            return
    }

    public void ificmple(org.objectweb.asm.Label r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 164(0xa4, float:2.3E-43)
            r2 = r5
            r0.visitJumpInsn(r1, r2)
            return
    }

    public void ifacmpeq(org.objectweb.asm.Label r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 165(0xa5, float:2.31E-43)
            r2 = r5
            r0.visitJumpInsn(r1, r2)
            return
    }

    public void ifacmpne(org.objectweb.asm.Label r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 166(0xa6, float:2.33E-43)
            r2 = r5
            r0.visitJumpInsn(r1, r2)
            return
    }

    public void goTo(org.objectweb.asm.Label r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 167(0xa7, float:2.34E-43)
            r2 = r5
            r0.visitJumpInsn(r1, r2)
            return
    }

    public void jsr(org.objectweb.asm.Label r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 168(0xa8, float:2.35E-43)
            r2 = r5
            r0.visitJumpInsn(r1, r2)
            return
    }

    public void ret(int r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 169(0xa9, float:2.37E-43)
            r2 = r5
            r0.visitVarInsn(r1, r2)
            return
    }

    public void tableswitch(int r7, int r8, org.objectweb.asm.Label r9, org.objectweb.asm.Label... r10) {
            r6 = this;
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.visitTableSwitchInsn(r1, r2, r3, r4)
            return
    }

    public void lookupswitch(org.objectweb.asm.Label r6, int[] r7, org.objectweb.asm.Label[] r8) {
            r5 = this;
            r0 = r5
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r6
            r2 = r7
            r3 = r8
            r0.visitLookupSwitchInsn(r1, r2, r3)
            return
    }

    public void areturn(org.objectweb.asm.Type r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            r2 = 172(0xac, float:2.41E-43)
            int r1 = r1.getOpcode(r2)
            r0.visitInsn(r1)
            return
    }

    public void getstatic(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 178(0xb2, float:2.5E-43)
            r2 = r7
            r3 = r8
            r4 = r9
            r0.visitFieldInsn(r1, r2, r3, r4)
            return
    }

    public void putstatic(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 179(0xb3, float:2.51E-43)
            r2 = r7
            r3 = r8
            r4 = r9
            r0.visitFieldInsn(r1, r2, r3, r4)
            return
    }

    public void getfield(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 180(0xb4, float:2.52E-43)
            r2 = r7
            r3 = r8
            r4 = r9
            r0.visitFieldInsn(r1, r2, r3, r4)
            return
    }

    public void putfield(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 181(0xb5, float:2.54E-43)
            r2 = r7
            r3 = r8
            r4 = r9
            r0.visitFieldInsn(r1, r2, r3, r4)
            return
    }

    @java.lang.Deprecated
    public void invokevirtual(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            r0 = r6
            int r0 = r0.api
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 < r1) goto L12
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = 0
            r0.invokevirtual(r1, r2, r3, r4)
            return
        L12:
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 182(0xb6, float:2.55E-43)
            r2 = r7
            r3 = r8
            r4 = r9
            r0.visitMethodInsn(r1, r2, r3, r4)
            return
    }

    public void invokevirtual(java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11) {
            r7 = this;
            r0 = r7
            int r0 = r0.api
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 >= r1) goto L21
            r0 = r11
            if (r0 == 0) goto L19
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "INVOKEVIRTUAL on interfaces require ASM 5"
            r1.<init>(r2)
            throw r0
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.invokevirtual(r1, r2, r3)
            return
        L21:
            r0 = r7
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 182(0xb6, float:2.55E-43)
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.visitMethodInsn(r1, r2, r3, r4, r5)
            return
    }

    @java.lang.Deprecated
    public void invokespecial(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r7 = this;
            r0 = r7
            int r0 = r0.api
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 < r1) goto L12
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = 0
            r0.invokespecial(r1, r2, r3, r4)
            return
        L12:
            r0 = r7
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 183(0xb7, float:2.56E-43)
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = 0
            r0.visitMethodInsn(r1, r2, r3, r4, r5)
            return
    }

    public void invokespecial(java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11) {
            r7 = this;
            r0 = r7
            int r0 = r0.api
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 >= r1) goto L21
            r0 = r11
            if (r0 == 0) goto L19
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "INVOKESPECIAL on interfaces require ASM 5"
            r1.<init>(r2)
            throw r0
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.invokespecial(r1, r2, r3)
            return
        L21:
            r0 = r7
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 183(0xb7, float:2.56E-43)
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.visitMethodInsn(r1, r2, r3, r4, r5)
            return
    }

    @java.lang.Deprecated
    public void invokestatic(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r7 = this;
            r0 = r7
            int r0 = r0.api
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 < r1) goto L12
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = 0
            r0.invokestatic(r1, r2, r3, r4)
            return
        L12:
            r0 = r7
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 184(0xb8, float:2.58E-43)
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = 0
            r0.visitMethodInsn(r1, r2, r3, r4, r5)
            return
    }

    public void invokestatic(java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11) {
            r7 = this;
            r0 = r7
            int r0 = r0.api
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 >= r1) goto L21
            r0 = r11
            if (r0 == 0) goto L19
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "INVOKESTATIC on interfaces require ASM 5"
            r1.<init>(r2)
            throw r0
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.invokestatic(r1, r2, r3)
            return
        L21:
            r0 = r7
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 184(0xb8, float:2.58E-43)
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.visitMethodInsn(r1, r2, r3, r4, r5)
            return
    }

    public void invokeinterface(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r7 = this;
            r0 = r7
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 185(0xb9, float:2.59E-43)
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = 1
            r0.visitMethodInsn(r1, r2, r3, r4, r5)
            return
    }

    public void invokedynamic(java.lang.String r7, java.lang.String r8, org.objectweb.asm.Handle r9, java.lang.Object[] r10) {
            r6 = this;
            r0 = r6
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.visitInvokeDynamicInsn(r1, r2, r3, r4)
            return
    }

    public void anew(org.objectweb.asm.Type r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 187(0xbb, float:2.62E-43)
            r2 = r5
            java.lang.String r2 = r2.getInternalName()
            r0.visitTypeInsn(r1, r2)
            return
    }

    public void newarray(org.objectweb.asm.Type r4) {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r4
            newarray(r0, r1)
            return
    }

    static void newarray(org.objectweb.asm.MethodVisitor r4, org.objectweb.asm.Type r5) {
            r0 = r5
            int r0 = r0.getSort()
            switch(r0) {
                case 1: goto L34;
                case 2: goto L39;
                case 3: goto L3e;
                case 4: goto L44;
                case 5: goto L4a;
                case 6: goto L50;
                case 7: goto L56;
                case 8: goto L5c;
                default: goto L62;
            }
        L34:
            r0 = 4
            r6 = r0
            goto L6e
        L39:
            r0 = 5
            r6 = r0
            goto L6e
        L3e:
            r0 = 8
            r6 = r0
            goto L6e
        L44:
            r0 = 9
            r6 = r0
            goto L6e
        L4a:
            r0 = 10
            r6 = r0
            goto L6e
        L50:
            r0 = 6
            r6 = r0
            goto L6e
        L56:
            r0 = 11
            r6 = r0
            goto L6e
        L5c:
            r0 = 7
            r6 = r0
            goto L6e
        L62:
            r0 = r4
            r1 = 189(0xbd, float:2.65E-43)
            r2 = r5
            java.lang.String r2 = r2.getInternalName()
            r0.visitTypeInsn(r1, r2)
            return
        L6e:
            r0 = r4
            r1 = 188(0xbc, float:2.63E-43)
            r2 = r6
            r0.visitIntInsn(r1, r2)
            return
    }

    public void arraylength() {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 190(0xbe, float:2.66E-43)
            r0.visitInsn(r1)
            return
    }

    public void athrow() {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 191(0xbf, float:2.68E-43)
            r0.visitInsn(r1)
            return
    }

    public void checkcast(org.objectweb.asm.Type r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 192(0xc0, float:2.69E-43)
            r2 = r5
            java.lang.String r2 = r2.getInternalName()
            r0.visitTypeInsn(r1, r2)
            return
    }

    public void instanceOf(org.objectweb.asm.Type r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 193(0xc1, float:2.7E-43)
            r2 = r5
            java.lang.String r2 = r2.getInternalName()
            r0.visitTypeInsn(r1, r2)
            return
    }

    public void monitorenter() {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 194(0xc2, float:2.72E-43)
            r0.visitInsn(r1)
            return
    }

    public void monitorexit() {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 195(0xc3, float:2.73E-43)
            r0.visitInsn(r1)
            return
    }

    public void multianewarray(java.lang.String r5, int r6) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r5
            r2 = r6
            r0.visitMultiANewArrayInsn(r1, r2)
            return
    }

    public void ifnull(org.objectweb.asm.Label r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 198(0xc6, float:2.77E-43)
            r2 = r5
            r0.visitJumpInsn(r1, r2)
            return
    }

    public void ifnonnull(org.objectweb.asm.Label r5) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = 199(0xc7, float:2.79E-43)
            r2 = r5
            r0.visitJumpInsn(r1, r2)
            return
    }

    public void mark(org.objectweb.asm.Label r4) {
            r3 = this;
            r0 = r3
            org.objectweb.asm.MethodVisitor r0 = r0.f626mv
            r1 = r4
            r0.visitLabel(r1)
            return
    }

    static {
            java.lang.String r0 = "Ljava/lang/Object;"
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getType(r0)
            org.objectweb.asm.commons.InstructionAdapter.OBJECT_TYPE = r0
            return
    }
}
