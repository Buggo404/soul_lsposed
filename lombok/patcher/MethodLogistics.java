package lombok.patcher;

/* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/MethodLogistics.SCL.lombok */
public class MethodLogistics {
    private final int staticOffset;
    private final int returnOpcode;
    private final int returnSize;
    private final java.util.List<java.lang.Integer> loadOpcodes;
    private final java.util.List<java.lang.Integer> paramSizes;
    private final java.util.List<java.lang.Integer> paramIndices;

    public MethodLogistics(int r5, java.lang.String r6) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r5
            r2 = 8
            r1 = r1 & r2
            if (r1 == 0) goto L10
            r1 = 0
            goto L11
        L10:
            r1 = 1
        L11:
            r0.staticOffset = r1
            r0 = r6
            java.util.List r0 = lombok.patcher.MethodTarget.decomposeFullDesc(r0)
            r7 = r0
            r0 = r7
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
            r0 = r8
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r9 = r0
            r0 = r4
            r1 = r9
            int r1 = sizeOf(r1)
            r0.returnSize = r1
            r0 = r4
            r1 = r9
            int r1 = returnOpcodeFor(r1)
            r0.returnOpcode = r1
            r0 = r4
            int r0 = r0.staticOffset
            r10 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r11 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r12 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r13 = r0
            goto La7
        L63:
            r0 = r8
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r14 = r0
            r0 = r14
            int r0 = sizeOf(r0)
            r15 = r0
            r0 = r11
            r1 = r15
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.add(r1)
            r0 = r12
            r1 = r10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.add(r1)
            r0 = r13
            r1 = r14
            int r1 = loadOpcodeFor(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.add(r1)
            r0 = r10
            r1 = r15
            int r0 = r0 + r1
            r10 = r0
        La7:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L63
            r0 = r4
            r1 = r11
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r0.paramSizes = r1
            r0 = r4
            r1 = r12
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r0.paramIndices = r1
            r0 = r4
            r1 = r13
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r0.loadOpcodes = r1
            return
    }

    public boolean isStatic() {
            r2 = this;
            r0 = r2
            int r0 = r0.staticOffset
            if (r0 != 0) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    public int getParamCount() {
            r2 = this;
            r0 = r2
            java.util.List<java.lang.Integer> r0 = r0.paramSizes
            int r0 = r0.size()
            return r0
    }

    public int getReturnOpcode() {
            r2 = this;
            r0 = r2
            int r0 = r0.returnOpcode
            return r0
    }

    public void generateLoadOpcodeForParam(int r6, org.objectweb.asm.MethodVisitor r7) {
            r5 = this;
            r0 = r7
            r1 = r5
            java.util.List<java.lang.Integer> r1 = r1.loadOpcodes
            r2 = r6
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = r5
            java.util.List<java.lang.Integer> r2 = r2.paramIndices
            r3 = r6
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.visitVarInsn(r1, r2)
            return
    }

    public void generateLoadOpcodeForThis(org.objectweb.asm.MethodVisitor r5) {
            r4 = this;
            r0 = r4
            boolean r0 = r0.isStatic()
            if (r0 == 0) goto Lf
            r0 = r5
            r1 = 1
            r0.visitInsn(r1)
            goto L16
        Lf:
            r0 = r5
            r1 = 25
            r2 = 0
            r0.visitVarInsn(r1, r2)
        L16:
            return
    }

    public void generateReturnOpcode(org.objectweb.asm.MethodVisitor r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            int r1 = r1.returnOpcode
            r0.visitInsn(r1)
            return
    }

    public void generatePopForReturn(org.objectweb.asm.MethodVisitor r5) {
            r4 = this;
            r0 = r5
            r1 = r4
            int r1 = r1.returnSize
            r2 = 2
            if (r1 != r2) goto Le
            r1 = 88
            goto L10
        Le:
            r1 = 87
        L10:
            r0.visitInsn(r1)
            return
    }

    public void generateDupForReturn(org.objectweb.asm.MethodVisitor r5) {
            r4 = this;
            r0 = r5
            r1 = r4
            int r1 = r1.returnSize
            r2 = 2
            if (r1 != r2) goto Le
            r1 = 92
            goto L10
        Le:
            r1 = 89
        L10:
            r0.visitInsn(r1)
            return
    }

    public static void generateDupForType(java.lang.String r3, org.objectweb.asm.MethodVisitor r4) {
            r0 = r3
            int r0 = sizeOf(r0)
            switch(r0) {
                case 0: goto L32;
                case 1: goto L20;
                case 2: goto L29;
                default: goto L20;
            }
        L20:
            r0 = r4
            r1 = 89
            r0.visitInsn(r1)
            goto L32
        L29:
            r0 = r4
            r1 = 92
            r0.visitInsn(r1)
            goto L32
        L32:
            return
    }

    private static int loadOpcodeFor(java.lang.String r6) {
            r0 = r6
            r1 = 0
            char r0 = r0.charAt(r1)
            switch(r0) {
                case 66: goto L69;
                case 68: goto L60;
                case 70: goto L66;
                case 73: goto L69;
                case 74: goto L63;
                case 76: goto L76;
                case 83: goto L69;
                case 86: goto L6c;
                case 90: goto L69;
                case 91: goto L76;
                default: goto L79;
            }
        L60:
            r0 = 24
            return r0
        L63:
            r0 = 22
            return r0
        L66:
            r0 = 23
            return r0
        L69:
            r0 = 21
            return r0
        L6c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "There's no load opcode for 'void'"
            r1.<init>(r2)
            throw r0
        L76:
            r0 = 25
            return r0
        L79:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Uhoh - bug - unrecognized JVM type: "
            r3.<init>(r4)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    private static int returnOpcodeFor(java.lang.String r6) {
            r0 = r6
            r1 = 0
            char r0 = r0.charAt(r1)
            switch(r0) {
                case 66: goto L6c;
                case 68: goto L60;
                case 70: goto L68;
                case 73: goto L6c;
                case 74: goto L64;
                case 76: goto L74;
                case 83: goto L6c;
                case 86: goto L70;
                case 90: goto L6c;
                case 91: goto L74;
                default: goto L78;
            }
        L60:
            r0 = 175(0xaf, float:2.45E-43)
            return r0
        L64:
            r0 = 173(0xad, float:2.42E-43)
            return r0
        L68:
            r0 = 174(0xae, float:2.44E-43)
            return r0
        L6c:
            r0 = 172(0xac, float:2.41E-43)
            return r0
        L70:
            r0 = 177(0xb1, float:2.48E-43)
            return r0
        L74:
            r0 = 176(0xb0, float:2.47E-43)
            return r0
        L78:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Uhoh - bug - unrecognized JVM type: "
            r3.<init>(r4)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    private static int sizeOf(java.lang.String r3) {
            r0 = r3
            r1 = 0
            char r0 = r0.charAt(r1)
            switch(r0) {
                case 68: goto L28;
                case 74: goto L28;
                case 86: goto L2a;
                default: goto L2c;
            }
        L28:
            r0 = 2
            return r0
        L2a:
            r0 = 0
            return r0
        L2c:
            r0 = 1
            return r0
    }
}
