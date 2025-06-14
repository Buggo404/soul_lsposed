package org.objectweb.asm.tree.analysis;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/analysis/BasicVerifier.SCL.lombok */
public class BasicVerifier extends org.objectweb.asm.tree.analysis.BasicInterpreter {
    public BasicVerifier() {
            r3 = this;
            r0 = r3
            r1 = 589824(0x90000, float:8.2652E-40)
            r0.<init>(r1)
            r0 = r3
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<org.objectweb.asm.tree.analysis.BasicVerifier> r1 = org.objectweb.asm.tree.analysis.BasicVerifier.class
            if (r0 == r1) goto L17
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r1.<init>()
            throw r0
        L17:
            return
    }

    protected BasicVerifier(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter
    public org.objectweb.asm.tree.analysis.BasicValue copyOperation(org.objectweb.asm.tree.AbstractInsnNode r8, org.objectweb.asm.tree.analysis.BasicValue r9) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r7 = this;
            r0 = r8
            int r0 = r0.getOpcode()
            switch(r0) {
                case 21: goto Lac;
                case 22: goto Lba;
                case 23: goto Lb3;
                case 24: goto Lc1;
                case 25: goto Lc8;
                case 26: goto Lfe;
                case 27: goto Lfe;
                case 28: goto Lfe;
                case 29: goto Lfe;
                case 30: goto Lfe;
                case 31: goto Lfe;
                case 32: goto Lfe;
                case 33: goto Lfe;
                case 34: goto Lfe;
                case 35: goto Lfe;
                case 36: goto Lfe;
                case 37: goto Lfe;
                case 38: goto Lfe;
                case 39: goto Lfe;
                case 40: goto Lfe;
                case 41: goto Lfe;
                case 42: goto Lfe;
                case 43: goto Lfe;
                case 44: goto Lfe;
                case 45: goto Lfe;
                case 46: goto Lfe;
                case 47: goto Lfe;
                case 48: goto Lfe;
                case 49: goto Lfe;
                case 50: goto Lfe;
                case 51: goto Lfe;
                case 52: goto Lfe;
                case 53: goto Lfe;
                case 54: goto Lac;
                case 55: goto Lba;
                case 56: goto Lb3;
                case 57: goto Lc1;
                case 58: goto Lde;
                default: goto Lfe;
            }
        Lac:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            r10 = r0
            goto L100
        Lb3:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.FLOAT_VALUE
            r10 = r0
            goto L100
        Lba:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE
            r10 = r0
            goto L100
        Lc1:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.DOUBLE_VALUE
            r10 = r0
            goto L100
        Lc8:
            r0 = r9
            boolean r0 = r0.isReference()
            if (r0 != 0) goto Ldc
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException
            r1 = r0
            r2 = r8
            r3 = 0
            java.lang.String r4 = "an object reference"
            r5 = r9
            r1.<init>(r2, r3, r4, r5)
            throw r0
        Ldc:
            r0 = r9
            return r0
        Lde:
            r0 = r9
            boolean r0 = r0.isReference()
            if (r0 != 0) goto Lfc
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.RETURNADDRESS_VALUE
            r1 = r9
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lfc
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException
            r1 = r0
            r2 = r8
            r3 = 0
            java.lang.String r4 = "an object reference or a return address"
            r5 = r9
            r1.<init>(r2, r3, r4, r5)
            throw r0
        Lfc:
            r0 = r9
            return r0
        Lfe:
            r0 = r9
            return r0
        L100:
            r0 = r10
            r1 = r9
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L114
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException
            r1 = r0
            r2 = r8
            r3 = 0
            r4 = r10
            r5 = r9
            r1.<init>(r2, r3, r4, r5)
            throw r0
        L114:
            r0 = r9
            return r0
    }

    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter
    public org.objectweb.asm.tree.analysis.BasicValue unaryOperation(org.objectweb.asm.tree.AbstractInsnNode r8, org.objectweb.asm.tree.analysis.BasicValue r9) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r7 = this;
            r0 = r8
            int r0 = r0.getOpcode()
            switch(r0) {
                case 116: goto L164;
                case 117: goto L172;
                case 118: goto L16b;
                case 119: goto L179;
                case 120: goto L1db;
                case 121: goto L1db;
                case 122: goto L1db;
                case 123: goto L1db;
                case 124: goto L1db;
                case 125: goto L1db;
                case 126: goto L1db;
                case 127: goto L1db;
                case 128: goto L1db;
                case 129: goto L1db;
                case 130: goto L1db;
                case 131: goto L1db;
                case 132: goto L164;
                case 133: goto L164;
                case 134: goto L164;
                case 135: goto L164;
                case 136: goto L172;
                case 137: goto L172;
                case 138: goto L172;
                case 139: goto L16b;
                case 140: goto L16b;
                case 141: goto L16b;
                case 142: goto L179;
                case 143: goto L179;
                case 144: goto L179;
                case 145: goto L164;
                case 146: goto L164;
                case 147: goto L164;
                case 148: goto L1db;
                case 149: goto L1db;
                case 150: goto L1db;
                case 151: goto L1db;
                case 152: goto L1db;
                case 153: goto L164;
                case 154: goto L164;
                case 155: goto L164;
                case 156: goto L164;
                case 157: goto L164;
                case 158: goto L164;
                case 159: goto L1db;
                case 160: goto L1db;
                case 161: goto L1db;
                case 162: goto L1db;
                case 163: goto L1db;
                case 164: goto L1db;
                case 165: goto L1db;
                case 166: goto L1db;
                case 167: goto L1db;
                case 168: goto L1db;
                case 169: goto L1db;
                case 170: goto L164;
                case 171: goto L164;
                case 172: goto L164;
                case 173: goto L172;
                case 174: goto L16b;
                case 175: goto L179;
                case 176: goto L1ae;
                case 177: goto L1db;
                case 178: goto L1db;
                case 179: goto L1c9;
                case 180: goto L180;
                case 181: goto L1db;
                case 182: goto L1db;
                case 183: goto L1db;
                case 184: goto L1db;
                case 185: goto L1db;
                case 186: goto L1db;
                case 187: goto L1db;
                case 188: goto L164;
                case 189: goto L164;
                case 190: goto L192;
                case 191: goto L1ae;
                case 192: goto L1ae;
                case 193: goto L1ae;
                case 194: goto L1ae;
                case 195: goto L1ae;
                case 196: goto L1db;
                case 197: goto L1db;
                case 198: goto L1ae;
                case 199: goto L1ae;
                default: goto L1db;
            }
        L164:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            r10 = r0
            goto L1e3
        L16b:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.FLOAT_VALUE
            r10 = r0
            goto L1e3
        L172:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE
            r10 = r0
            goto L1e3
        L179:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.DOUBLE_VALUE
            r10 = r0
            goto L1e3
        L180:
            r0 = r7
            r1 = r8
            org.objectweb.asm.tree.FieldInsnNode r1 = (org.objectweb.asm.tree.FieldInsnNode) r1
            java.lang.String r1 = r1.owner
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getObjectType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            r10 = r0
            goto L1e3
        L192:
            r0 = r7
            r1 = r9
            boolean r0 = r0.isArrayValue(r1)
            if (r0 != 0) goto L1a7
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException
            r1 = r0
            r2 = r8
            r3 = 0
            java.lang.String r4 = "an array reference"
            r5 = r9
            r1.<init>(r2, r3, r4, r5)
            throw r0
        L1a7:
            r0 = r7
            r1 = r8
            r2 = r9
            org.objectweb.asm.tree.analysis.BasicValue r0 = super.unaryOperation(r1, r2)
            return r0
        L1ae:
            r0 = r9
            boolean r0 = r0.isReference()
            if (r0 != 0) goto L1c2
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException
            r1 = r0
            r2 = r8
            r3 = 0
            java.lang.String r4 = "an object reference"
            r5 = r9
            r1.<init>(r2, r3, r4, r5)
            throw r0
        L1c2:
            r0 = r7
            r1 = r8
            r2 = r9
            org.objectweb.asm.tree.analysis.BasicValue r0 = super.unaryOperation(r1, r2)
            return r0
        L1c9:
            r0 = r7
            r1 = r8
            org.objectweb.asm.tree.FieldInsnNode r1 = (org.objectweb.asm.tree.FieldInsnNode) r1
            java.lang.String r1 = r1.desc
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            r10 = r0
            goto L1e3
        L1db:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L1e3:
            r0 = r7
            r1 = r9
            r2 = r10
            boolean r0 = r0.isSubTypeOf(r1, r2)
            if (r0 != 0) goto L1f8
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException
            r1 = r0
            r2 = r8
            r3 = 0
            r4 = r10
            r5 = r9
            r1.<init>(r2, r3, r4, r5)
            throw r0
        L1f8:
            r0 = r7
            r1 = r8
            r2 = r9
            org.objectweb.asm.tree.analysis.BasicValue r0 = super.unaryOperation(r1, r2)
            return r0
    }

    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter
    public org.objectweb.asm.tree.analysis.BasicValue binaryOperation(org.objectweb.asm.tree.AbstractInsnNode r8, org.objectweb.asm.tree.analysis.BasicValue r9, org.objectweb.asm.tree.analysis.BasicValue r10) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r7 = this;
            r0 = r8
            int r0 = r0.getOpcode()
            switch(r0) {
                case 46: goto L234;
                case 47: goto L29f;
                case 48: goto L2b2;
                case 49: goto L2c5;
                case 50: goto L2d8;
                case 51: goto L247;
                case 52: goto L279;
                case 53: goto L28c;
                case 54: goto L35e;
                case 55: goto L35e;
                case 56: goto L35e;
                case 57: goto L35e;
                case 58: goto L35e;
                case 59: goto L35e;
                case 60: goto L35e;
                case 61: goto L35e;
                case 62: goto L35e;
                case 63: goto L35e;
                case 64: goto L35e;
                case 65: goto L35e;
                case 66: goto L35e;
                case 67: goto L35e;
                case 68: goto L35e;
                case 69: goto L35e;
                case 70: goto L35e;
                case 71: goto L35e;
                case 72: goto L35e;
                case 73: goto L35e;
                case 74: goto L35e;
                case 75: goto L35e;
                case 76: goto L35e;
                case 77: goto L35e;
                case 78: goto L35e;
                case 79: goto L35e;
                case 80: goto L35e;
                case 81: goto L35e;
                case 82: goto L35e;
                case 83: goto L35e;
                case 84: goto L35e;
                case 85: goto L35e;
                case 86: goto L35e;
                case 87: goto L35e;
                case 88: goto L35e;
                case 89: goto L35e;
                case 90: goto L35e;
                case 91: goto L35e;
                case 92: goto L35e;
                case 93: goto L35e;
                case 94: goto L35e;
                case 95: goto L35e;
                case 96: goto L2eb;
                case 97: goto L305;
                case 98: goto L2f8;
                case 99: goto L31f;
                case 100: goto L2eb;
                case 101: goto L305;
                case 102: goto L2f8;
                case 103: goto L31f;
                case 104: goto L2eb;
                case 105: goto L305;
                case 106: goto L2f8;
                case 107: goto L31f;
                case 108: goto L2eb;
                case 109: goto L305;
                case 110: goto L2f8;
                case 111: goto L31f;
                case 112: goto L2eb;
                case 113: goto L305;
                case 114: goto L2f8;
                case 115: goto L31f;
                case 116: goto L35e;
                case 117: goto L35e;
                case 118: goto L35e;
                case 119: goto L35e;
                case 120: goto L2eb;
                case 121: goto L312;
                case 122: goto L2eb;
                case 123: goto L312;
                case 124: goto L2eb;
                case 125: goto L312;
                case 126: goto L2eb;
                case 127: goto L305;
                case 128: goto L2eb;
                case 129: goto L305;
                case 130: goto L2eb;
                case 131: goto L305;
                case 132: goto L35e;
                case 133: goto L35e;
                case 134: goto L35e;
                case 135: goto L35e;
                case 136: goto L35e;
                case 137: goto L35e;
                case 138: goto L35e;
                case 139: goto L35e;
                case 140: goto L35e;
                case 141: goto L35e;
                case 142: goto L35e;
                case 143: goto L35e;
                case 144: goto L35e;
                case 145: goto L35e;
                case 146: goto L35e;
                case 147: goto L35e;
                case 148: goto L305;
                case 149: goto L2f8;
                case 150: goto L2f8;
                case 151: goto L31f;
                case 152: goto L31f;
                case 153: goto L35e;
                case 154: goto L35e;
                case 155: goto L35e;
                case 156: goto L35e;
                case 157: goto L35e;
                case 158: goto L35e;
                case 159: goto L2eb;
                case 160: goto L2eb;
                case 161: goto L2eb;
                case 162: goto L2eb;
                case 163: goto L2eb;
                case 164: goto L2eb;
                case 165: goto L32c;
                case 166: goto L32c;
                case 167: goto L35e;
                case 168: goto L35e;
                case 169: goto L35e;
                case 170: goto L35e;
                case 171: goto L35e;
                case 172: goto L35e;
                case 173: goto L35e;
                case 174: goto L35e;
                case 175: goto L35e;
                case 176: goto L35e;
                case 177: goto L35e;
                case 178: goto L35e;
                case 179: goto L35e;
                case 180: goto L35e;
                case 181: goto L339;
                default: goto L35e;
            }
        L234:
            r0 = r7
            java.lang.String r1 = "[I"
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            r11 = r0
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            r12 = r0
            goto L366
        L247:
            r0 = r7
            r1 = r9
            r2 = r7
            java.lang.String r3 = "[Z"
            org.objectweb.asm.Type r3 = org.objectweb.asm.Type.getType(r3)
            org.objectweb.asm.tree.analysis.BasicValue r2 = r2.newValue(r3)
            boolean r0 = r0.isSubTypeOf(r1, r2)
            if (r0 == 0) goto L266
            r0 = r7
            java.lang.String r1 = "[Z"
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            r11 = r0
            goto L271
        L266:
            r0 = r7
            java.lang.String r1 = "[B"
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            r11 = r0
        L271:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            r12 = r0
            goto L366
        L279:
            r0 = r7
            java.lang.String r1 = "[C"
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            r11 = r0
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            r12 = r0
            goto L366
        L28c:
            r0 = r7
            java.lang.String r1 = "[S"
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            r11 = r0
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            r12 = r0
            goto L366
        L29f:
            r0 = r7
            java.lang.String r1 = "[J"
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            r11 = r0
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            r12 = r0
            goto L366
        L2b2:
            r0 = r7
            java.lang.String r1 = "[F"
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            r11 = r0
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            r12 = r0
            goto L366
        L2c5:
            r0 = r7
            java.lang.String r1 = "[D"
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            r11 = r0
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            r12 = r0
            goto L366
        L2d8:
            r0 = r7
            java.lang.String r1 = "[Ljava/lang/Object;"
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            r11 = r0
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            r12 = r0
            goto L366
        L2eb:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            r11 = r0
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            r12 = r0
            goto L366
        L2f8:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.FLOAT_VALUE
            r11 = r0
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.FLOAT_VALUE
            r12 = r0
            goto L366
        L305:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE
            r11 = r0
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE
            r12 = r0
            goto L366
        L312:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE
            r11 = r0
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            r12 = r0
            goto L366
        L31f:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.DOUBLE_VALUE
            r11 = r0
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.DOUBLE_VALUE
            r12 = r0
            goto L366
        L32c:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.REFERENCE_VALUE
            r11 = r0
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.REFERENCE_VALUE
            r12 = r0
            goto L366
        L339:
            r0 = r8
            org.objectweb.asm.tree.FieldInsnNode r0 = (org.objectweb.asm.tree.FieldInsnNode) r0
            r13 = r0
            r0 = r7
            r1 = r13
            java.lang.String r1 = r1.owner
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getObjectType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            r11 = r0
            r0 = r7
            r1 = r13
            java.lang.String r1 = r1.desc
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            r12 = r0
            goto L366
        L35e:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L366:
            r0 = r7
            r1 = r9
            r2 = r11
            boolean r0 = r0.isSubTypeOf(r1, r2)
            if (r0 != 0) goto L37e
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException
            r1 = r0
            r2 = r8
            java.lang.String r3 = "First argument"
            r4 = r11
            r5 = r9
            r1.<init>(r2, r3, r4, r5)
            throw r0
        L37e:
            r0 = r7
            r1 = r10
            r2 = r12
            boolean r0 = r0.isSubTypeOf(r1, r2)
            if (r0 != 0) goto L396
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException
            r1 = r0
            r2 = r8
            java.lang.String r3 = "Second argument"
            r4 = r12
            r5 = r10
            r1.<init>(r2, r3, r4, r5)
            throw r0
        L396:
            r0 = r8
            int r0 = r0.getOpcode()
            r1 = 50
            if (r0 != r1) goto L3a5
            r0 = r7
            r1 = r9
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.getElementValue(r1)
            return r0
        L3a5:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            org.objectweb.asm.tree.analysis.BasicValue r0 = super.binaryOperation(r1, r2, r3)
            return r0
    }

    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter
    public org.objectweb.asm.tree.analysis.BasicValue ternaryOperation(org.objectweb.asm.tree.AbstractInsnNode r8, org.objectweb.asm.tree.analysis.BasicValue r9, org.objectweb.asm.tree.analysis.BasicValue r10, org.objectweb.asm.tree.analysis.BasicValue r11) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r7 = this;
            r0 = r8
            int r0 = r0.getOpcode()
            switch(r0) {
                case 79: goto L34;
                case 80: goto L9f;
                case 81: goto Lb2;
                case 82: goto Lc5;
                case 83: goto Ld8;
                case 84: goto L47;
                case 85: goto L79;
                case 86: goto L8c;
                default: goto Le3;
            }
        L34:
            r0 = r7
            java.lang.String r1 = "[I"
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            r12 = r0
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            r13 = r0
            goto Leb
        L47:
            r0 = r7
            r1 = r9
            r2 = r7
            java.lang.String r3 = "[Z"
            org.objectweb.asm.Type r3 = org.objectweb.asm.Type.getType(r3)
            org.objectweb.asm.tree.analysis.BasicValue r2 = r2.newValue(r3)
            boolean r0 = r0.isSubTypeOf(r1, r2)
            if (r0 == 0) goto L66
            r0 = r7
            java.lang.String r1 = "[Z"
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            r12 = r0
            goto L71
        L66:
            r0 = r7
            java.lang.String r1 = "[B"
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            r12 = r0
        L71:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            r13 = r0
            goto Leb
        L79:
            r0 = r7
            java.lang.String r1 = "[C"
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            r12 = r0
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            r13 = r0
            goto Leb
        L8c:
            r0 = r7
            java.lang.String r1 = "[S"
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            r12 = r0
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            r13 = r0
            goto Leb
        L9f:
            r0 = r7
            java.lang.String r1 = "[J"
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            r12 = r0
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE
            r13 = r0
            goto Leb
        Lb2:
            r0 = r7
            java.lang.String r1 = "[F"
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            r12 = r0
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.FLOAT_VALUE
            r13 = r0
            goto Leb
        Lc5:
            r0 = r7
            java.lang.String r1 = "[D"
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            r12 = r0
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.DOUBLE_VALUE
            r13 = r0
            goto Leb
        Ld8:
            r0 = r9
            r12 = r0
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.REFERENCE_VALUE
            r13 = r0
            goto Leb
        Le3:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        Leb:
            r0 = r7
            r1 = r9
            r2 = r12
            boolean r0 = r0.isSubTypeOf(r1, r2)
            if (r0 != 0) goto L11a
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException
            r1 = r0
            r2 = r8
            java.lang.String r3 = "First argument"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = r4
            r5.<init>()
            java.lang.String r5 = "a "
            java.lang.StringBuilder r4 = r4.append(r5)
            r5 = r12
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = " array reference"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r5 = r9
            r1.<init>(r2, r3, r4, r5)
            throw r0
        L11a:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            r1 = r10
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L133
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException
            r1 = r0
            r2 = r8
            java.lang.String r3 = "Second argument"
            org.objectweb.asm.tree.analysis.BasicValue r4 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            r5 = r10
            r1.<init>(r2, r3, r4, r5)
            throw r0
        L133:
            r0 = r7
            r1 = r11
            r2 = r13
            boolean r0 = r0.isSubTypeOf(r1, r2)
            if (r0 != 0) goto L14d
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException
            r1 = r0
            r2 = r8
            java.lang.String r3 = "Third argument"
            r4 = r13
            r5 = r11
            r1.<init>(r2, r3, r4, r5)
            throw r0
        L14d:
            r0 = 0
            return r0
    }

    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    public org.objectweb.asm.tree.analysis.BasicValue naryOperation(org.objectweb.asm.tree.AbstractInsnNode r9, java.util.List<? extends org.objectweb.asm.tree.analysis.BasicValue> r10) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r8 = this;
            r0 = r9
            int r0 = r0.getOpcode()
            r11 = r0
            r0 = r11
            r1 = 197(0xc5, float:2.76E-43)
            if (r0 != r1) goto L4a
            r0 = r10
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
        L14:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L47
            r0 = r12
            java.lang.Object r0 = r0.next()
            org.objectweb.asm.tree.analysis.BasicValue r0 = (org.objectweb.asm.tree.analysis.BasicValue) r0
            r13 = r0
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            r1 = r13
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L44
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException
            r1 = r0
            r2 = r9
            r3 = 0
            org.objectweb.asm.tree.analysis.BasicValue r4 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            r5 = r13
            r1.<init>(r2, r3, r4, r5)
            throw r0
        L44:
            goto L14
        L47:
            goto L119
        L4a:
            r0 = 0
            r12 = r0
            r0 = 0
            r13 = r0
            r0 = r11
            r1 = 184(0xb8, float:2.58E-43)
            if (r0 == r1) goto La0
            r0 = r11
            r1 = 186(0xba, float:2.6E-43)
            if (r0 == r1) goto La0
            r0 = r9
            org.objectweb.asm.tree.MethodInsnNode r0 = (org.objectweb.asm.tree.MethodInsnNode) r0
            java.lang.String r0 = r0.owner
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getObjectType(r0)
            r14 = r0
            r0 = r8
            r1 = r10
            r2 = r12
            int r12 = r12 + 1
            java.lang.Object r1 = r1.get(r2)
            org.objectweb.asm.tree.analysis.BasicValue r1 = (org.objectweb.asm.tree.analysis.BasicValue) r1
            r2 = r8
            r3 = r14
            org.objectweb.asm.tree.analysis.BasicValue r2 = r2.newValue(r3)
            boolean r0 = r0.isSubTypeOf(r1, r2)
            if (r0 != 0) goto La0
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException
            r1 = r0
            r2 = r9
            java.lang.String r3 = "Method owner"
            r4 = r8
            r5 = r14
            org.objectweb.asm.tree.analysis.BasicValue r4 = r4.newValue(r5)
            r5 = r10
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            org.objectweb.asm.tree.analysis.Value r5 = (org.objectweb.asm.tree.analysis.Value) r5
            r1.<init>(r2, r3, r4, r5)
            throw r0
        La0:
            r0 = r11
            r1 = 186(0xba, float:2.6E-43)
            if (r0 != r1) goto Lb1
            r0 = r9
            org.objectweb.asm.tree.InvokeDynamicInsnNode r0 = (org.objectweb.asm.tree.InvokeDynamicInsnNode) r0
            java.lang.String r0 = r0.desc
            goto Lb8
        Lb1:
            r0 = r9
            org.objectweb.asm.tree.MethodInsnNode r0 = (org.objectweb.asm.tree.MethodInsnNode) r0
            java.lang.String r0 = r0.desc
        Lb8:
            r14 = r0
            r0 = r14
            org.objectweb.asm.Type[] r0 = org.objectweb.asm.Type.getArgumentTypes(r0)
            r15 = r0
        Lc1:
            r0 = r12
            r1 = r10
            int r1 = r1.size()
            if (r0 >= r1) goto L119
            r0 = r8
            r1 = r15
            r2 = r13
            int r13 = r13 + 1
            r1 = r1[r2]
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            r16 = r0
            r0 = r10
            r1 = r12
            int r12 = r12 + 1
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = (org.objectweb.asm.tree.analysis.BasicValue) r0
            r17 = r0
            r0 = r8
            r1 = r17
            r2 = r16
            boolean r0 = r0.isSubTypeOf(r1, r2)
            if (r0 != 0) goto L116
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException
            r1 = r0
            r2 = r9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            r4.<init>()
            java.lang.String r4 = "Argument "
            java.lang.StringBuilder r3 = r3.append(r4)
            r4 = r13
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = r16
            r5 = r17
            r1.<init>(r2, r3, r4, r5)
            throw r0
        L116:
            goto Lc1
        L119:
            r0 = r8
            r1 = r9
            r2 = r10
            org.objectweb.asm.tree.analysis.BasicValue r0 = super.naryOperation(r1, r2)
            return r0
    }

    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter
    public void returnOperation(org.objectweb.asm.tree.AbstractInsnNode r8, org.objectweb.asm.tree.analysis.BasicValue r9, org.objectweb.asm.tree.analysis.BasicValue r10) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r7 = this;
            r0 = r7
            r1 = r9
            r2 = r10
            boolean r0 = r0.isSubTypeOf(r1, r2)
            if (r0 != 0) goto L16
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException
            r1 = r0
            r2 = r8
            java.lang.String r3 = "Incompatible return type"
            r4 = r10
            r5 = r9
            r1.<init>(r2, r3, r4, r5)
            throw r0
        L16:
            return
    }

    protected boolean isArrayValue(org.objectweb.asm.tree.analysis.BasicValue r3) {
            r2 = this;
            r0 = r3
            boolean r0 = r0.isReference()
            return r0
    }

    protected org.objectweb.asm.tree.analysis.BasicValue getElementValue(org.objectweb.asm.tree.analysis.BasicValue r3) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r2 = this;
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.REFERENCE_VALUE
            return r0
    }

    protected boolean isSubTypeOf(org.objectweb.asm.tree.analysis.BasicValue r4, org.objectweb.asm.tree.analysis.BasicValue r5) {
            r3 = this;
            r0 = r4
            r1 = r5
            boolean r0 = r0.equals(r1)
            return r0
    }

    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    public /* bridge */ /* synthetic */ void returnOperation(org.objectweb.asm.tree.AbstractInsnNode r6, org.objectweb.asm.tree.analysis.Value r7, org.objectweb.asm.tree.analysis.Value r8) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            org.objectweb.asm.tree.analysis.BasicValue r2 = (org.objectweb.asm.tree.analysis.BasicValue) r2
            r3 = r8
            org.objectweb.asm.tree.analysis.BasicValue r3 = (org.objectweb.asm.tree.analysis.BasicValue) r3
            r0.returnOperation(r1, r2, r3)
            return
    }

    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    public /* bridge */ /* synthetic */ org.objectweb.asm.tree.analysis.Value naryOperation(org.objectweb.asm.tree.AbstractInsnNode r5, java.util.List r6) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.naryOperation(r1, r2)
            return r0
    }

    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    public /* bridge */ /* synthetic */ org.objectweb.asm.tree.analysis.Value ternaryOperation(org.objectweb.asm.tree.AbstractInsnNode r7, org.objectweb.asm.tree.analysis.Value r8, org.objectweb.asm.tree.analysis.Value r9, org.objectweb.asm.tree.analysis.Value r10) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            org.objectweb.asm.tree.analysis.BasicValue r2 = (org.objectweb.asm.tree.analysis.BasicValue) r2
            r3 = r9
            org.objectweb.asm.tree.analysis.BasicValue r3 = (org.objectweb.asm.tree.analysis.BasicValue) r3
            r4 = r10
            org.objectweb.asm.tree.analysis.BasicValue r4 = (org.objectweb.asm.tree.analysis.BasicValue) r4
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.ternaryOperation(r1, r2, r3, r4)
            return r0
    }

    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    public /* bridge */ /* synthetic */ org.objectweb.asm.tree.analysis.Value binaryOperation(org.objectweb.asm.tree.AbstractInsnNode r6, org.objectweb.asm.tree.analysis.Value r7, org.objectweb.asm.tree.analysis.Value r8) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            org.objectweb.asm.tree.analysis.BasicValue r2 = (org.objectweb.asm.tree.analysis.BasicValue) r2
            r3 = r8
            org.objectweb.asm.tree.analysis.BasicValue r3 = (org.objectweb.asm.tree.analysis.BasicValue) r3
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.binaryOperation(r1, r2, r3)
            return r0
    }

    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    public /* bridge */ /* synthetic */ org.objectweb.asm.tree.analysis.Value unaryOperation(org.objectweb.asm.tree.AbstractInsnNode r5, org.objectweb.asm.tree.analysis.Value r6) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            org.objectweb.asm.tree.analysis.BasicValue r2 = (org.objectweb.asm.tree.analysis.BasicValue) r2
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.unaryOperation(r1, r2)
            return r0
    }

    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    public /* bridge */ /* synthetic */ org.objectweb.asm.tree.analysis.Value copyOperation(org.objectweb.asm.tree.AbstractInsnNode r5, org.objectweb.asm.tree.analysis.Value r6) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            org.objectweb.asm.tree.analysis.BasicValue r2 = (org.objectweb.asm.tree.analysis.BasicValue) r2
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.copyOperation(r1, r2)
            return r0
    }
}
