package org.objectweb.asm.tree.analysis;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/analysis/BasicInterpreter.SCL.lombok */
public class BasicInterpreter extends org.objectweb.asm.tree.analysis.Interpreter<org.objectweb.asm.tree.analysis.BasicValue> implements org.objectweb.asm.Opcodes {
    public static final org.objectweb.asm.Type NULL_TYPE = null;

    public BasicInterpreter() {
            r3 = this;
            r0 = r3
            r1 = 589824(0x90000, float:8.2652E-40)
            r0.<init>(r1)
            r0 = r3
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<org.objectweb.asm.tree.analysis.BasicInterpreter> r1 = org.objectweb.asm.tree.analysis.BasicInterpreter.class
            if (r0 == r1) goto L17
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r1.<init>()
            throw r0
        L17:
            return
    }

    protected BasicInterpreter(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public org.objectweb.asm.tree.analysis.BasicValue newValue(org.objectweb.asm.Type r4) {
            r3 = this;
            r0 = r4
            if (r0 != 0) goto L8
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.UNINITIALIZED_VALUE
            return r0
        L8:
            r0 = r4
            int r0 = r0.getSort()
            switch(r0) {
                case 0: goto L48;
                case 1: goto L4a;
                case 2: goto L4a;
                case 3: goto L4a;
                case 4: goto L4a;
                case 5: goto L4a;
                case 6: goto L4e;
                case 7: goto L52;
                case 8: goto L56;
                case 9: goto L5a;
                case 10: goto L5a;
                default: goto L5e;
            }
        L48:
            r0 = 0
            return r0
        L4a:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            return r0
        L4e:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.FLOAT_VALUE
            return r0
        L52:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE
            return r0
        L56:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.DOUBLE_VALUE
            return r0
        L5a:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.REFERENCE_VALUE
            return r0
        L5e:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public org.objectweb.asm.tree.analysis.BasicValue newOperation(org.objectweb.asm.tree.AbstractInsnNode r7) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r6 = this;
            r0 = r7
            int r0 = r0.getOpcode()
            switch(r0) {
                case 1: goto Lb8;
                case 2: goto Lc0;
                case 3: goto Lc0;
                case 4: goto Lc0;
                case 5: goto Lc0;
                case 6: goto Lc0;
                case 7: goto Lc0;
                case 8: goto Lc0;
                case 9: goto Lc4;
                case 10: goto Lc4;
                case 11: goto Lc8;
                case 12: goto Lc8;
                case 13: goto Lc8;
                case 14: goto Lcc;
                case 15: goto Lcc;
                case 16: goto Ld0;
                case 17: goto Ld0;
                case 18: goto Ld4;
                case 168: goto L1ad;
                case 178: goto L1b1;
                case 187: goto L1c0;
                default: goto L1cf;
            }
        Lb8:
            r0 = r6
            org.objectweb.asm.Type r1 = org.objectweb.asm.tree.analysis.BasicInterpreter.NULL_TYPE
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            return r0
        Lc0:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            return r0
        Lc4:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE
            return r0
        Lc8:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.FLOAT_VALUE
            return r0
        Lcc:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.DOUBLE_VALUE
            return r0
        Ld0:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            return r0
        Ld4:
            r0 = r7
            org.objectweb.asm.tree.LdcInsnNode r0 = (org.objectweb.asm.tree.LdcInsnNode) r0
            java.lang.Object r0 = r0.cst
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 == 0) goto Le7
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            return r0
        Le7:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Float
            if (r0 == 0) goto Lf2
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.FLOAT_VALUE
            return r0
        Lf2:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Long
            if (r0 == 0) goto Lfd
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE
            return r0
        Lfd:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Double
            if (r0 == 0) goto L108
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.DOUBLE_VALUE
            return r0
        L108:
            r0 = r8
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L119
            r0 = r6
            java.lang.String r1 = "java/lang/String"
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getObjectType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            return r0
        L119:
            r0 = r8
            boolean r0 = r0 instanceof org.objectweb.asm.Type
            if (r0 == 0) goto L16a
            r0 = r8
            org.objectweb.asm.Type r0 = (org.objectweb.asm.Type) r0
            int r0 = r0.getSort()
            r9 = r0
            r0 = r9
            r1 = 10
            if (r0 == r1) goto L134
            r0 = r9
            r1 = 9
            if (r0 != r1) goto L13e
        L134:
            r0 = r6
            java.lang.String r1 = "java/lang/Class"
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getObjectType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            return r0
        L13e:
            r0 = r9
            r1 = 11
            if (r0 != r1) goto L14e
            r0 = r6
            java.lang.String r1 = "java/lang/invoke/MethodType"
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getObjectType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            return r0
        L14e:
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException
            r1 = r0
            r2 = r7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            r4.<init>()
            java.lang.String r4 = "Illegal LDC value "
            java.lang.StringBuilder r3 = r3.append(r4)
            r4 = r8
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r2, r3)
            throw r0
        L16a:
            r0 = r8
            boolean r0 = r0 instanceof org.objectweb.asm.Handle
            if (r0 == 0) goto L17b
            r0 = r6
            java.lang.String r1 = "java/lang/invoke/MethodHandle"
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getObjectType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            return r0
        L17b:
            r0 = r8
            boolean r0 = r0 instanceof org.objectweb.asm.ConstantDynamic
            if (r0 == 0) goto L191
            r0 = r6
            r1 = r8
            org.objectweb.asm.ConstantDynamic r1 = (org.objectweb.asm.ConstantDynamic) r1
            java.lang.String r1 = r1.getDescriptor()
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            return r0
        L191:
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException
            r1 = r0
            r2 = r7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            r4.<init>()
            java.lang.String r4 = "Illegal LDC value "
            java.lang.StringBuilder r3 = r3.append(r4)
            r4 = r8
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r2, r3)
            throw r0
        L1ad:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.RETURNADDRESS_VALUE
            return r0
        L1b1:
            r0 = r6
            r1 = r7
            org.objectweb.asm.tree.FieldInsnNode r1 = (org.objectweb.asm.tree.FieldInsnNode) r1
            java.lang.String r1 = r1.desc
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            return r0
        L1c0:
            r0 = r6
            r1 = r7
            org.objectweb.asm.tree.TypeInsnNode r1 = (org.objectweb.asm.tree.TypeInsnNode) r1
            java.lang.String r1 = r1.desc
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getObjectType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            return r0
        L1cf:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
    }

    public org.objectweb.asm.tree.analysis.BasicValue copyOperation(org.objectweb.asm.tree.AbstractInsnNode r3, org.objectweb.asm.tree.analysis.BasicValue r4) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r2 = this;
            r0 = r4
            return r0
    }

    public org.objectweb.asm.tree.analysis.BasicValue unaryOperation(org.objectweb.asm.tree.AbstractInsnNode r6, org.objectweb.asm.tree.analysis.BasicValue r7) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r5 = this;
            r0 = r6
            int r0 = r0.getOpcode()
            switch(r0) {
                case 116: goto L164;
                case 117: goto L16c;
                case 118: goto L168;
                case 119: goto L170;
                case 120: goto L256;
                case 121: goto L256;
                case 122: goto L256;
                case 123: goto L256;
                case 124: goto L256;
                case 125: goto L256;
                case 126: goto L256;
                case 127: goto L256;
                case 128: goto L256;
                case 129: goto L256;
                case 130: goto L256;
                case 131: goto L256;
                case 132: goto L164;
                case 133: goto L16c;
                case 134: goto L168;
                case 135: goto L170;
                case 136: goto L164;
                case 137: goto L168;
                case 138: goto L170;
                case 139: goto L164;
                case 140: goto L16c;
                case 141: goto L170;
                case 142: goto L164;
                case 143: goto L16c;
                case 144: goto L168;
                case 145: goto L164;
                case 146: goto L164;
                case 147: goto L164;
                case 148: goto L256;
                case 149: goto L256;
                case 150: goto L256;
                case 151: goto L256;
                case 152: goto L256;
                case 153: goto L174;
                case 154: goto L174;
                case 155: goto L174;
                case 156: goto L174;
                case 157: goto L174;
                case 158: goto L174;
                case 159: goto L256;
                case 160: goto L256;
                case 161: goto L256;
                case 162: goto L256;
                case 163: goto L256;
                case 164: goto L256;
                case 165: goto L256;
                case 166: goto L256;
                case 167: goto L256;
                case 168: goto L256;
                case 169: goto L256;
                case 170: goto L174;
                case 171: goto L174;
                case 172: goto L174;
                case 173: goto L174;
                case 174: goto L174;
                case 175: goto L174;
                case 176: goto L174;
                case 177: goto L256;
                case 178: goto L256;
                case 179: goto L174;
                case 180: goto L176;
                case 181: goto L256;
                case 182: goto L256;
                case 183: goto L256;
                case 184: goto L256;
                case 185: goto L256;
                case 186: goto L256;
                case 187: goto L256;
                case 188: goto L185;
                case 189: goto L217;
                case 190: goto L23b;
                case 191: goto L23f;
                case 192: goto L241;
                case 193: goto L250;
                case 194: goto L254;
                case 195: goto L254;
                case 196: goto L256;
                case 197: goto L256;
                case 198: goto L254;
                case 199: goto L254;
                default: goto L256;
            }
        L164:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            return r0
        L168:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.FLOAT_VALUE
            return r0
        L16c:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE
            return r0
        L170:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.DOUBLE_VALUE
            return r0
        L174:
            r0 = 0
            return r0
        L176:
            r0 = r5
            r1 = r6
            org.objectweb.asm.tree.FieldInsnNode r1 = (org.objectweb.asm.tree.FieldInsnNode) r1
            java.lang.String r1 = r1.desc
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            return r0
        L185:
            r0 = r6
            org.objectweb.asm.tree.IntInsnNode r0 = (org.objectweb.asm.tree.IntInsnNode) r0
            int r0 = r0.operand
            switch(r0) {
                case 4: goto L1bc;
                case 5: goto L1c6;
                case 6: goto L1ee;
                case 7: goto L1f8;
                case 8: goto L1d0;
                case 9: goto L1da;
                case 10: goto L1e4;
                case 11: goto L202;
                default: goto L20c;
            }
        L1bc:
            r0 = r5
            java.lang.String r1 = "[Z"
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            return r0
        L1c6:
            r0 = r5
            java.lang.String r1 = "[C"
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            return r0
        L1d0:
            r0 = r5
            java.lang.String r1 = "[B"
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            return r0
        L1da:
            r0 = r5
            java.lang.String r1 = "[S"
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            return r0
        L1e4:
            r0 = r5
            java.lang.String r1 = "[I"
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            return r0
        L1ee:
            r0 = r5
            java.lang.String r1 = "[F"
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            return r0
        L1f8:
            r0 = r5
            java.lang.String r1 = "[D"
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            return r0
        L202:
            r0 = r5
            java.lang.String r1 = "[J"
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            return r0
        L20c:
            org.objectweb.asm.tree.analysis.AnalyzerException r0 = new org.objectweb.asm.tree.analysis.AnalyzerException
            r1 = r0
            r2 = r6
            java.lang.String r3 = "Invalid array type"
            r1.<init>(r2, r3)
            throw r0
        L217:
            r0 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "["
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            org.objectweb.asm.tree.TypeInsnNode r2 = (org.objectweb.asm.tree.TypeInsnNode) r2
            java.lang.String r2 = r2.desc
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.getObjectType(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            return r0
        L23b:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            return r0
        L23f:
            r0 = 0
            return r0
        L241:
            r0 = r5
            r1 = r6
            org.objectweb.asm.tree.TypeInsnNode r1 = (org.objectweb.asm.tree.TypeInsnNode) r1
            java.lang.String r1 = r1.desc
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getObjectType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            return r0
        L250:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            return r0
        L254:
            r0 = 0
            return r0
        L256:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
    }

    public org.objectweb.asm.tree.analysis.BasicValue binaryOperation(org.objectweb.asm.tree.AbstractInsnNode r4, org.objectweb.asm.tree.analysis.BasicValue r5, org.objectweb.asm.tree.analysis.BasicValue r6) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r3 = this;
            r0 = r4
            int r0 = r0.getOpcode()
            switch(r0) {
                case 46: goto L234;
                case 47: goto L23c;
                case 48: goto L238;
                case 49: goto L240;
                case 50: goto L244;
                case 51: goto L234;
                case 52: goto L234;
                case 53: goto L234;
                case 54: goto L24e;
                case 55: goto L24e;
                case 56: goto L24e;
                case 57: goto L24e;
                case 58: goto L24e;
                case 59: goto L24e;
                case 60: goto L24e;
                case 61: goto L24e;
                case 62: goto L24e;
                case 63: goto L24e;
                case 64: goto L24e;
                case 65: goto L24e;
                case 66: goto L24e;
                case 67: goto L24e;
                case 68: goto L24e;
                case 69: goto L24e;
                case 70: goto L24e;
                case 71: goto L24e;
                case 72: goto L24e;
                case 73: goto L24e;
                case 74: goto L24e;
                case 75: goto L24e;
                case 76: goto L24e;
                case 77: goto L24e;
                case 78: goto L24e;
                case 79: goto L24e;
                case 80: goto L24e;
                case 81: goto L24e;
                case 82: goto L24e;
                case 83: goto L24e;
                case 84: goto L24e;
                case 85: goto L24e;
                case 86: goto L24e;
                case 87: goto L24e;
                case 88: goto L24e;
                case 89: goto L24e;
                case 90: goto L24e;
                case 91: goto L24e;
                case 92: goto L24e;
                case 93: goto L24e;
                case 94: goto L24e;
                case 95: goto L24e;
                case 96: goto L234;
                case 97: goto L23c;
                case 98: goto L238;
                case 99: goto L240;
                case 100: goto L234;
                case 101: goto L23c;
                case 102: goto L238;
                case 103: goto L240;
                case 104: goto L234;
                case 105: goto L23c;
                case 106: goto L238;
                case 107: goto L240;
                case 108: goto L234;
                case 109: goto L23c;
                case 110: goto L238;
                case 111: goto L240;
                case 112: goto L234;
                case 113: goto L23c;
                case 114: goto L238;
                case 115: goto L240;
                case 116: goto L24e;
                case 117: goto L24e;
                case 118: goto L24e;
                case 119: goto L24e;
                case 120: goto L234;
                case 121: goto L23c;
                case 122: goto L234;
                case 123: goto L23c;
                case 124: goto L234;
                case 125: goto L23c;
                case 126: goto L234;
                case 127: goto L23c;
                case 128: goto L234;
                case 129: goto L23c;
                case 130: goto L234;
                case 131: goto L23c;
                case 132: goto L24e;
                case 133: goto L24e;
                case 134: goto L24e;
                case 135: goto L24e;
                case 136: goto L24e;
                case 137: goto L24e;
                case 138: goto L24e;
                case 139: goto L24e;
                case 140: goto L24e;
                case 141: goto L24e;
                case 142: goto L24e;
                case 143: goto L24e;
                case 144: goto L24e;
                case 145: goto L24e;
                case 146: goto L24e;
                case 147: goto L24e;
                case 148: goto L248;
                case 149: goto L248;
                case 150: goto L248;
                case 151: goto L248;
                case 152: goto L248;
                case 153: goto L24e;
                case 154: goto L24e;
                case 155: goto L24e;
                case 156: goto L24e;
                case 157: goto L24e;
                case 158: goto L24e;
                case 159: goto L24c;
                case 160: goto L24c;
                case 161: goto L24c;
                case 162: goto L24c;
                case 163: goto L24c;
                case 164: goto L24c;
                case 165: goto L24c;
                case 166: goto L24c;
                case 167: goto L24e;
                case 168: goto L24e;
                case 169: goto L24e;
                case 170: goto L24e;
                case 171: goto L24e;
                case 172: goto L24e;
                case 173: goto L24e;
                case 174: goto L24e;
                case 175: goto L24e;
                case 176: goto L24e;
                case 177: goto L24e;
                case 178: goto L24e;
                case 179: goto L24e;
                case 180: goto L24e;
                case 181: goto L24c;
                default: goto L24e;
            }
        L234:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            return r0
        L238:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.FLOAT_VALUE
            return r0
        L23c:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE
            return r0
        L240:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.DOUBLE_VALUE
            return r0
        L244:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.REFERENCE_VALUE
            return r0
        L248:
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            return r0
        L24c:
            r0 = 0
            return r0
        L24e:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
    }

    public org.objectweb.asm.tree.analysis.BasicValue ternaryOperation(org.objectweb.asm.tree.AbstractInsnNode r3, org.objectweb.asm.tree.analysis.BasicValue r4, org.objectweb.asm.tree.analysis.BasicValue r5, org.objectweb.asm.tree.analysis.BasicValue r6) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public org.objectweb.asm.tree.analysis.BasicValue naryOperation(org.objectweb.asm.tree.AbstractInsnNode r4, java.util.List<? extends org.objectweb.asm.tree.analysis.BasicValue> r5) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r3 = this;
            r0 = r4
            int r0 = r0.getOpcode()
            r6 = r0
            r0 = r6
            r1 = 197(0xc5, float:2.76E-43)
            if (r0 != r1) goto L1b
            r0 = r3
            r1 = r4
            org.objectweb.asm.tree.MultiANewArrayInsnNode r1 = (org.objectweb.asm.tree.MultiANewArrayInsnNode) r1
            java.lang.String r1 = r1.desc
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            return r0
        L1b:
            r0 = r6
            r1 = 186(0xba, float:2.6E-43)
            if (r0 != r1) goto L31
            r0 = r3
            r1 = r4
            org.objectweb.asm.tree.InvokeDynamicInsnNode r1 = (org.objectweb.asm.tree.InvokeDynamicInsnNode) r1
            java.lang.String r1 = r1.desc
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getReturnType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            return r0
        L31:
            r0 = r3
            r1 = r4
            org.objectweb.asm.tree.MethodInsnNode r1 = (org.objectweb.asm.tree.MethodInsnNode) r1
            java.lang.String r1 = r1.desc
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.getReturnType(r1)
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            return r0
    }

    public void returnOperation(org.objectweb.asm.tree.AbstractInsnNode r2, org.objectweb.asm.tree.analysis.BasicValue r3, org.objectweb.asm.tree.analysis.BasicValue r4) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r1 = this;
            return
    }

    public org.objectweb.asm.tree.analysis.BasicValue merge(org.objectweb.asm.tree.analysis.BasicValue r4, org.objectweb.asm.tree.analysis.BasicValue r5) {
            r3 = this;
            r0 = r4
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lc
            org.objectweb.asm.tree.analysis.BasicValue r0 = org.objectweb.asm.tree.analysis.BasicValue.UNINITIALIZED_VALUE
            return r0
        Lc:
            r0 = r4
            return r0
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public /* bridge */ /* synthetic */ org.objectweb.asm.tree.analysis.Value merge(org.objectweb.asm.tree.analysis.Value r5, org.objectweb.asm.tree.analysis.Value r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.objectweb.asm.tree.analysis.BasicValue r1 = (org.objectweb.asm.tree.analysis.BasicValue) r1
            r2 = r6
            org.objectweb.asm.tree.analysis.BasicValue r2 = (org.objectweb.asm.tree.analysis.BasicValue) r2
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.merge(r1, r2)
            return r0
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
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

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public /* bridge */ /* synthetic */ org.objectweb.asm.tree.analysis.Value naryOperation(org.objectweb.asm.tree.AbstractInsnNode r5, java.util.List r6) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.naryOperation(r1, r2)
            return r0
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
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

    @Override // org.objectweb.asm.tree.analysis.Interpreter
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

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public /* bridge */ /* synthetic */ org.objectweb.asm.tree.analysis.Value unaryOperation(org.objectweb.asm.tree.AbstractInsnNode r5, org.objectweb.asm.tree.analysis.Value r6) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            org.objectweb.asm.tree.analysis.BasicValue r2 = (org.objectweb.asm.tree.analysis.BasicValue) r2
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.unaryOperation(r1, r2)
            return r0
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public /* bridge */ /* synthetic */ org.objectweb.asm.tree.analysis.Value copyOperation(org.objectweb.asm.tree.AbstractInsnNode r5, org.objectweb.asm.tree.analysis.Value r6) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            org.objectweb.asm.tree.analysis.BasicValue r2 = (org.objectweb.asm.tree.analysis.BasicValue) r2
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.copyOperation(r1, r2)
            return r0
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public /* bridge */ /* synthetic */ org.objectweb.asm.tree.analysis.Value newOperation(org.objectweb.asm.tree.AbstractInsnNode r4) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r3 = this;
            r0 = r3
            r1 = r4
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newOperation(r1)
            return r0
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public /* bridge */ /* synthetic */ org.objectweb.asm.tree.analysis.Value newValue(org.objectweb.asm.Type r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.objectweb.asm.tree.analysis.BasicValue r0 = r0.newValue(r1)
            return r0
    }

    static {
            java.lang.String r0 = "null"
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getObjectType(r0)
            org.objectweb.asm.tree.analysis.BasicInterpreter.NULL_TYPE = r0
            return
    }
}
