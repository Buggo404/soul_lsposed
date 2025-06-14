package org.objectweb.asm.tree.analysis;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/analysis/SourceInterpreter.SCL.lombok */
public class SourceInterpreter extends org.objectweb.asm.tree.analysis.Interpreter<org.objectweb.asm.tree.analysis.SourceValue> implements org.objectweb.asm.Opcodes {
    public SourceInterpreter() {
            r3 = this;
            r0 = r3
            r1 = 589824(0x90000, float:8.2652E-40)
            r0.<init>(r1)
            r0 = r3
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<org.objectweb.asm.tree.analysis.SourceInterpreter> r1 = org.objectweb.asm.tree.analysis.SourceInterpreter.class
            if (r0 == r1) goto L17
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r1.<init>()
            throw r0
        L17:
            return
    }

    protected SourceInterpreter(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public org.objectweb.asm.tree.analysis.SourceValue newValue(org.objectweb.asm.Type r5) {
            r4 = this;
            r0 = r5
            org.objectweb.asm.Type r1 = org.objectweb.asm.Type.VOID_TYPE
            if (r0 != r1) goto L9
            r0 = 0
            return r0
        L9:
            org.objectweb.asm.tree.analysis.SourceValue r0 = new org.objectweb.asm.tree.analysis.SourceValue
            r1 = r0
            r2 = r5
            if (r2 != 0) goto L15
            r2 = 1
            goto L19
        L15:
            r2 = r5
            int r2 = r2.getSize()
        L19:
            r1.<init>(r2)
            return r0
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public org.objectweb.asm.tree.analysis.SourceValue newOperation(org.objectweb.asm.tree.AbstractInsnNode r6) {
            r5 = this;
            r0 = r6
            int r0 = r0.getOpcode()
            switch(r0) {
                case 9: goto L40;
                case 10: goto L40;
                case 14: goto L40;
                case 15: goto L40;
                case 18: goto L45;
                case 178: goto L64;
                default: goto L75;
            }
        L40:
            r0 = 2
            r7 = r0
            goto L77
        L45:
            r0 = r6
            org.objectweb.asm.tree.LdcInsnNode r0 = (org.objectweb.asm.tree.LdcInsnNode) r0
            java.lang.Object r0 = r0.cst
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Long
            if (r0 != 0) goto L5b
            r0 = r8
            boolean r0 = r0 instanceof java.lang.Double
            if (r0 == 0) goto L5f
        L5b:
            r0 = 2
            goto L60
        L5f:
            r0 = 1
        L60:
            r7 = r0
            goto L77
        L64:
            r0 = r6
            org.objectweb.asm.tree.FieldInsnNode r0 = (org.objectweb.asm.tree.FieldInsnNode) r0
            java.lang.String r0 = r0.desc
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getType(r0)
            int r0 = r0.getSize()
            r7 = r0
            goto L77
        L75:
            r0 = 1
            r7 = r0
        L77:
            org.objectweb.asm.tree.analysis.SourceValue r0 = new org.objectweb.asm.tree.analysis.SourceValue
            r1 = r0
            r2 = r7
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public org.objectweb.asm.tree.analysis.SourceValue copyOperation(org.objectweb.asm.tree.AbstractInsnNode r6, org.objectweb.asm.tree.analysis.SourceValue r7) {
            r5 = this;
            org.objectweb.asm.tree.analysis.SourceValue r0 = new org.objectweb.asm.tree.analysis.SourceValue
            r1 = r0
            r2 = r7
            int r2 = r2.getSize()
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public org.objectweb.asm.tree.analysis.SourceValue unaryOperation(org.objectweb.asm.tree.AbstractInsnNode r6, org.objectweb.asm.tree.analysis.SourceValue r7) {
            r5 = this;
            r0 = r6
            int r0 = r0.getOpcode()
            switch(r0) {
                case 117: goto L58;
                case 119: goto L58;
                case 133: goto L58;
                case 135: goto L58;
                case 138: goto L58;
                case 140: goto L58;
                case 141: goto L58;
                case 143: goto L58;
                case 180: goto L5d;
                default: goto L6e;
            }
        L58:
            r0 = 2
            r8 = r0
            goto L70
        L5d:
            r0 = r6
            org.objectweb.asm.tree.FieldInsnNode r0 = (org.objectweb.asm.tree.FieldInsnNode) r0
            java.lang.String r0 = r0.desc
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getType(r0)
            int r0 = r0.getSize()
            r8 = r0
            goto L70
        L6e:
            r0 = 1
            r8 = r0
        L70:
            org.objectweb.asm.tree.analysis.SourceValue r0 = new org.objectweb.asm.tree.analysis.SourceValue
            r1 = r0
            r2 = r8
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public org.objectweb.asm.tree.analysis.SourceValue binaryOperation(org.objectweb.asm.tree.AbstractInsnNode r6, org.objectweb.asm.tree.analysis.SourceValue r7, org.objectweb.asm.tree.analysis.SourceValue r8) {
            r5 = this;
            r0 = r6
            int r0 = r0.getOpcode()
            switch(r0) {
                case 47: goto La0;
                case 49: goto La0;
                case 97: goto La0;
                case 99: goto La0;
                case 101: goto La0;
                case 103: goto La0;
                case 105: goto La0;
                case 107: goto La0;
                case 109: goto La0;
                case 111: goto La0;
                case 113: goto La0;
                case 115: goto La0;
                case 121: goto La0;
                case 123: goto La0;
                case 125: goto La0;
                case 127: goto La0;
                case 129: goto La0;
                case 131: goto La0;
                default: goto La6;
            }
        La0:
            r0 = 2
            r9 = r0
            goto La9
        La6:
            r0 = 1
            r9 = r0
        La9:
            org.objectweb.asm.tree.analysis.SourceValue r0 = new org.objectweb.asm.tree.analysis.SourceValue
            r1 = r0
            r2 = r9
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public org.objectweb.asm.tree.analysis.SourceValue ternaryOperation(org.objectweb.asm.tree.AbstractInsnNode r6, org.objectweb.asm.tree.analysis.SourceValue r7, org.objectweb.asm.tree.analysis.SourceValue r8, org.objectweb.asm.tree.analysis.SourceValue r9) {
            r5 = this;
            org.objectweb.asm.tree.analysis.SourceValue r0 = new org.objectweb.asm.tree.analysis.SourceValue
            r1 = r0
            r2 = 1
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public org.objectweb.asm.tree.analysis.SourceValue naryOperation(org.objectweb.asm.tree.AbstractInsnNode r6, java.util.List<? extends org.objectweb.asm.tree.analysis.SourceValue> r7) {
            r5 = this;
            r0 = r6
            int r0 = r0.getOpcode()
            r9 = r0
            r0 = r9
            r1 = 197(0xc5, float:2.76E-43)
            if (r0 != r1) goto L13
            r0 = 1
            r8 = r0
            goto L3a
        L13:
            r0 = r9
            r1 = 186(0xba, float:2.6E-43)
            if (r0 != r1) goto L2c
            r0 = r6
            org.objectweb.asm.tree.InvokeDynamicInsnNode r0 = (org.objectweb.asm.tree.InvokeDynamicInsnNode) r0
            java.lang.String r0 = r0.desc
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getReturnType(r0)
            int r0 = r0.getSize()
            r8 = r0
            goto L3a
        L2c:
            r0 = r6
            org.objectweb.asm.tree.MethodInsnNode r0 = (org.objectweb.asm.tree.MethodInsnNode) r0
            java.lang.String r0 = r0.desc
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getReturnType(r0)
            int r0 = r0.getSize()
            r8 = r0
        L3a:
            org.objectweb.asm.tree.analysis.SourceValue r0 = new org.objectweb.asm.tree.analysis.SourceValue
            r1 = r0
            r2 = r8
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public void returnOperation(org.objectweb.asm.tree.AbstractInsnNode r2, org.objectweb.asm.tree.analysis.SourceValue r3, org.objectweb.asm.tree.analysis.SourceValue r4) {
            r1 = this;
            return
    }

    public org.objectweb.asm.tree.analysis.SourceValue merge(org.objectweb.asm.tree.analysis.SourceValue r6, org.objectweb.asm.tree.analysis.SourceValue r7) {
            r5 = this;
            r0 = r6
            java.util.Set<org.objectweb.asm.tree.AbstractInsnNode> r0 = r0.insns
            boolean r0 = r0 instanceof org.objectweb.asm.tree.analysis.SmallSet
            if (r0 == 0) goto L4f
            r0 = r7
            java.util.Set<org.objectweb.asm.tree.AbstractInsnNode> r0 = r0.insns
            boolean r0 = r0 instanceof org.objectweb.asm.tree.analysis.SmallSet
            if (r0 == 0) goto L4f
            r0 = r6
            java.util.Set<org.objectweb.asm.tree.AbstractInsnNode> r0 = r0.insns
            org.objectweb.asm.tree.analysis.SmallSet r0 = (org.objectweb.asm.tree.analysis.SmallSet) r0
            r1 = r7
            java.util.Set<org.objectweb.asm.tree.AbstractInsnNode> r1 = r1.insns
            org.objectweb.asm.tree.analysis.SmallSet r1 = (org.objectweb.asm.tree.analysis.SmallSet) r1
            java.util.Set r0 = r0.union(r1)
            r8 = r0
            r0 = r8
            r1 = r6
            java.util.Set<org.objectweb.asm.tree.AbstractInsnNode> r1 = r1.insns
            if (r0 != r1) goto L3b
            r0 = r6
            int r0 = r0.size
            r1 = r7
            int r1 = r1.size
            if (r0 != r1) goto L3b
            r0 = r6
            return r0
        L3b:
            org.objectweb.asm.tree.analysis.SourceValue r0 = new org.objectweb.asm.tree.analysis.SourceValue
            r1 = r0
            r2 = r6
            int r2 = r2.size
            r3 = r7
            int r3 = r3.size
            int r2 = java.lang.Math.min(r2, r3)
            r3 = r8
            r1.<init>(r2, r3)
            return r0
        L4f:
            r0 = r6
            int r0 = r0.size
            r1 = r7
            int r1 = r1.size
            if (r0 != r1) goto L68
            r0 = r6
            java.util.Set<org.objectweb.asm.tree.AbstractInsnNode> r0 = r0.insns
            r1 = r7
            java.util.Set<org.objectweb.asm.tree.AbstractInsnNode> r1 = r1.insns
            boolean r0 = containsAll(r0, r1)
            if (r0 != 0) goto L96
        L68:
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r8
            r1 = r6
            java.util.Set<org.objectweb.asm.tree.AbstractInsnNode> r1 = r1.insns
            boolean r0 = r0.addAll(r1)
            r0 = r8
            r1 = r7
            java.util.Set<org.objectweb.asm.tree.AbstractInsnNode> r1 = r1.insns
            boolean r0 = r0.addAll(r1)
            org.objectweb.asm.tree.analysis.SourceValue r0 = new org.objectweb.asm.tree.analysis.SourceValue
            r1 = r0
            r2 = r6
            int r2 = r2.size
            r3 = r7
            int r3 = r3.size
            int r2 = java.lang.Math.min(r2, r3)
            r3 = r8
            r1.<init>(r2, r3)
            return r0
        L96:
            r0 = r6
            return r0
    }

    private static <E> boolean containsAll(java.util.Set<E> r3, java.util.Set<E> r4) {
            r0 = r3
            int r0 = r0.size()
            r1 = r4
            int r1 = r1.size()
            if (r0 >= r1) goto L11
            r0 = 0
            return r0
        L11:
            r0 = r3
            r1 = r4
            boolean r0 = r0.containsAll(r1)
            return r0
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public /* bridge */ /* synthetic */ org.objectweb.asm.tree.analysis.Value merge(org.objectweb.asm.tree.analysis.Value r5, org.objectweb.asm.tree.analysis.Value r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.objectweb.asm.tree.analysis.SourceValue r1 = (org.objectweb.asm.tree.analysis.SourceValue) r1
            r2 = r6
            org.objectweb.asm.tree.analysis.SourceValue r2 = (org.objectweb.asm.tree.analysis.SourceValue) r2
            org.objectweb.asm.tree.analysis.SourceValue r0 = r0.merge(r1, r2)
            return r0
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public /* bridge */ /* synthetic */ void returnOperation(org.objectweb.asm.tree.AbstractInsnNode r6, org.objectweb.asm.tree.analysis.Value r7, org.objectweb.asm.tree.analysis.Value r8) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            org.objectweb.asm.tree.analysis.SourceValue r2 = (org.objectweb.asm.tree.analysis.SourceValue) r2
            r3 = r8
            org.objectweb.asm.tree.analysis.SourceValue r3 = (org.objectweb.asm.tree.analysis.SourceValue) r3
            r0.returnOperation(r1, r2, r3)
            return
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public /* bridge */ /* synthetic */ org.objectweb.asm.tree.analysis.Value naryOperation(org.objectweb.asm.tree.AbstractInsnNode r5, java.util.List r6) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            org.objectweb.asm.tree.analysis.SourceValue r0 = r0.naryOperation(r1, r2)
            return r0
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public /* bridge */ /* synthetic */ org.objectweb.asm.tree.analysis.Value ternaryOperation(org.objectweb.asm.tree.AbstractInsnNode r7, org.objectweb.asm.tree.analysis.Value r8, org.objectweb.asm.tree.analysis.Value r9, org.objectweb.asm.tree.analysis.Value r10) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            org.objectweb.asm.tree.analysis.SourceValue r2 = (org.objectweb.asm.tree.analysis.SourceValue) r2
            r3 = r9
            org.objectweb.asm.tree.analysis.SourceValue r3 = (org.objectweb.asm.tree.analysis.SourceValue) r3
            r4 = r10
            org.objectweb.asm.tree.analysis.SourceValue r4 = (org.objectweb.asm.tree.analysis.SourceValue) r4
            org.objectweb.asm.tree.analysis.SourceValue r0 = r0.ternaryOperation(r1, r2, r3, r4)
            return r0
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public /* bridge */ /* synthetic */ org.objectweb.asm.tree.analysis.Value binaryOperation(org.objectweb.asm.tree.AbstractInsnNode r6, org.objectweb.asm.tree.analysis.Value r7, org.objectweb.asm.tree.analysis.Value r8) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            org.objectweb.asm.tree.analysis.SourceValue r2 = (org.objectweb.asm.tree.analysis.SourceValue) r2
            r3 = r8
            org.objectweb.asm.tree.analysis.SourceValue r3 = (org.objectweb.asm.tree.analysis.SourceValue) r3
            org.objectweb.asm.tree.analysis.SourceValue r0 = r0.binaryOperation(r1, r2, r3)
            return r0
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public /* bridge */ /* synthetic */ org.objectweb.asm.tree.analysis.Value unaryOperation(org.objectweb.asm.tree.AbstractInsnNode r5, org.objectweb.asm.tree.analysis.Value r6) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            org.objectweb.asm.tree.analysis.SourceValue r2 = (org.objectweb.asm.tree.analysis.SourceValue) r2
            org.objectweb.asm.tree.analysis.SourceValue r0 = r0.unaryOperation(r1, r2)
            return r0
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public /* bridge */ /* synthetic */ org.objectweb.asm.tree.analysis.Value copyOperation(org.objectweb.asm.tree.AbstractInsnNode r5, org.objectweb.asm.tree.analysis.Value r6) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            org.objectweb.asm.tree.analysis.SourceValue r2 = (org.objectweb.asm.tree.analysis.SourceValue) r2
            org.objectweb.asm.tree.analysis.SourceValue r0 = r0.copyOperation(r1, r2)
            return r0
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public /* bridge */ /* synthetic */ org.objectweb.asm.tree.analysis.Value newOperation(org.objectweb.asm.tree.AbstractInsnNode r4) throws org.objectweb.asm.tree.analysis.AnalyzerException {
            r3 = this;
            r0 = r3
            r1 = r4
            org.objectweb.asm.tree.analysis.SourceValue r0 = r0.newOperation(r1)
            return r0
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public /* bridge */ /* synthetic */ org.objectweb.asm.tree.analysis.Value newValue(org.objectweb.asm.Type r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.objectweb.asm.tree.analysis.SourceValue r0 = r0.newValue(r1)
            return r0
    }
}
