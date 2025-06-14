package lombok.patcher.scripts;

/* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/scripts/WrapReturnValuesScript.SCL.lombok */
public final class WrapReturnValuesScript extends lombok.patcher.scripts.MethodLevelPatchScript {
    private final lombok.patcher.Hook wrapper;
    private final java.util.Set<lombok.patcher.StackRequest> requests;
    private final boolean hijackReturnValue;
    private final boolean transplant;
    private final boolean insert;
    private final boolean cast;
    static final /* synthetic */ boolean $assertionsDisabled = false;


    /* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/scripts/WrapReturnValuesScript$WrapReturnValues.SCL.lombok */
    private class WrapReturnValues extends org.objectweb.asm.MethodVisitor {
        private final lombok.patcher.MethodLogistics logistics;
        private final java.lang.String ownClassSpec;
        private final java.lang.String returnValueDesc;
        final /* synthetic */ lombok.patcher.scripts.WrapReturnValuesScript this$0;

        public WrapReturnValues(lombok.patcher.scripts.WrapReturnValuesScript r5, org.objectweb.asm.MethodVisitor r6, lombok.patcher.MethodLogistics r7, java.lang.String r8, java.lang.String r9) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.this$0 = r1
                r0 = r4
                r1 = 589824(0x90000, float:8.2652E-40)
                r2 = r6
                r0.<init>(r1, r2)
                r0 = r4
                r1 = r7
                r0.logistics = r1
                r0 = r4
                r1 = r8
                r0.ownClassSpec = r1
                r0 = r4
                r1 = r9
                java.lang.String r1 = lombok.patcher.scripts.WrapReturnValuesScript.access$0(r1)
                r0.returnValueDesc = r1
                return
        }

        @Override // org.objectweb.asm.MethodVisitor
        public void visitInsn(int r8) {
                r7 = this;
                r0 = r8
                r1 = r7
                lombok.patcher.MethodLogistics r1 = r1.logistics
                int r1 = r1.getReturnOpcode()
                if (r0 == r1) goto L11
                r0 = r7
                r1 = r8
                super.visitInsn(r1)
                return
            L11:
                r0 = r7
                lombok.patcher.scripts.WrapReturnValuesScript r0 = r0.this$0
                java.util.Set r0 = lombok.patcher.scripts.WrapReturnValuesScript.access$1(r0)
                lombok.patcher.StackRequest r1 = lombok.patcher.StackRequest.RETURN_VALUE
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto L3b
                r0 = r7
                lombok.patcher.scripts.WrapReturnValuesScript r0 = r0.this$0
                boolean r0 = lombok.patcher.scripts.WrapReturnValuesScript.access$2(r0)
                if (r0 != 0) goto L50
                r0 = r7
                lombok.patcher.MethodLogistics r0 = r0.logistics
                r1 = r7
                org.objectweb.asm.MethodVisitor r1 = r1.f626mv
                r0.generateDupForReturn(r1)
                goto L50
            L3b:
                r0 = r7
                lombok.patcher.scripts.WrapReturnValuesScript r0 = r0.this$0
                boolean r0 = lombok.patcher.scripts.WrapReturnValuesScript.access$2(r0)
                if (r0 == 0) goto L50
                r0 = r7
                lombok.patcher.MethodLogistics r0 = r0.logistics
                r1 = r7
                org.objectweb.asm.MethodVisitor r1 = r1.f626mv
                r0.generatePopForReturn(r1)
            L50:
                r0 = r7
                lombok.patcher.scripts.WrapReturnValuesScript r0 = r0.this$0
                java.util.Set r0 = lombok.patcher.scripts.WrapReturnValuesScript.access$1(r0)
                lombok.patcher.StackRequest r1 = lombok.patcher.StackRequest.THIS
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto L6d
                r0 = r7
                lombok.patcher.MethodLogistics r0 = r0.logistics
                r1 = r7
                org.objectweb.asm.MethodVisitor r1 = r1.f626mv
                r0.generateLoadOpcodeForThis(r1)
            L6d:
                java.util.List<lombok.patcher.StackRequest> r0 = lombok.patcher.StackRequest.PARAMS_IN_ORDER
                java.util.Iterator r0 = r0.iterator()
                r10 = r0
                goto La5
            L79:
                r0 = r10
                java.lang.Object r0 = r0.next()
                lombok.patcher.StackRequest r0 = (lombok.patcher.StackRequest) r0
                r9 = r0
                r0 = r7
                lombok.patcher.scripts.WrapReturnValuesScript r0 = r0.this$0
                java.util.Set r0 = lombok.patcher.scripts.WrapReturnValuesScript.access$1(r0)
                r1 = r9
                boolean r0 = r0.contains(r1)
                if (r0 != 0) goto L96
                goto La5
            L96:
                r0 = r7
                lombok.patcher.MethodLogistics r0 = r0.logistics
                r1 = r9
                int r1 = r1.getParamPos()
                r2 = r7
                org.objectweb.asm.MethodVisitor r2 = r2.f626mv
                r0.generateLoadOpcodeForParam(r1, r2)
            La5:
                r0 = r10
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L79
                r0 = r7
                lombok.patcher.scripts.WrapReturnValuesScript r0 = r0.this$0
                boolean r0 = lombok.patcher.scripts.WrapReturnValuesScript.access$3(r0)
                if (r0 == 0) goto Lc9
                r0 = r7
                lombok.patcher.scripts.WrapReturnValuesScript r0 = r0.this$0
                lombok.patcher.Hook r0 = lombok.patcher.scripts.WrapReturnValuesScript.access$4(r0)
                r1 = r7
                org.objectweb.asm.MethodVisitor r1 = r1.f626mv
                lombok.patcher.scripts.WrapReturnValuesScript.access$5(r0, r1)
                goto L100
            Lc9:
                r0 = r7
                r1 = 184(0xb8, float:2.58E-43)
                r2 = r7
                lombok.patcher.scripts.WrapReturnValuesScript r2 = r2.this$0
                boolean r2 = lombok.patcher.scripts.WrapReturnValuesScript.access$6(r2)
                if (r2 == 0) goto Lde
                r2 = r7
                java.lang.String r2 = r2.ownClassSpec
                goto Le8
            Lde:
                r2 = r7
                lombok.patcher.scripts.WrapReturnValuesScript r2 = r2.this$0
                lombok.patcher.Hook r2 = lombok.patcher.scripts.WrapReturnValuesScript.access$4(r2)
                java.lang.String r2 = r2.getClassSpec()
            Le8:
                r3 = r7
                lombok.patcher.scripts.WrapReturnValuesScript r3 = r3.this$0
                lombok.patcher.Hook r3 = lombok.patcher.scripts.WrapReturnValuesScript.access$4(r3)
                java.lang.String r3 = r3.getMethodName()
                r4 = r7
                lombok.patcher.scripts.WrapReturnValuesScript r4 = r4.this$0
                lombok.patcher.Hook r4 = lombok.patcher.scripts.WrapReturnValuesScript.access$4(r4)
                java.lang.String r4 = r4.getMethodDescriptor()
                r5 = 0
                super.visitMethodInsn(r1, r2, r3, r4, r5)
            L100:
                r0 = r7
                lombok.patcher.scripts.WrapReturnValuesScript r0 = r0.this$0
                boolean r0 = lombok.patcher.scripts.WrapReturnValuesScript.access$7(r0)
                if (r0 == 0) goto L115
                r0 = r7
                r1 = 192(0xc0, float:2.69E-43)
                r2 = r7
                java.lang.String r2 = r2.returnValueDesc
                super.visitTypeInsn(r1, r2)
            L115:
                r0 = r7
                r1 = r8
                super.visitInsn(r1)
                return
        }
    }

    static {
            java.lang.Class<lombok.patcher.scripts.WrapReturnValuesScript> r0 = lombok.patcher.scripts.WrapReturnValuesScript.class
            boolean r0 = r0.desiredAssertionStatus()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            lombok.patcher.scripts.WrapReturnValuesScript.$assertionsDisabled = r0
            return
    }

    @Override // lombok.patcher.PatchScript
    public java.lang.String getPatchScriptName() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "wrap returns with "
            r1.<init>(r2)
            r1 = r4
            lombok.patcher.Hook r1 = r1.wrapper
            java.lang.String r1 = r1.getMethodName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " in "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.lang.String r1 = r1.describeMatchers()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    WrapReturnValuesScript(java.util.List<lombok.patcher.TargetMatcher> r5, lombok.patcher.Hook r6, boolean r7, boolean r8, boolean r9, java.util.Set<lombok.patcher.StackRequest> r10) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            r0 = r6
            if (r0 != 0) goto L13
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.String r2 = "wrapper"
            r1.<init>(r2)
            throw r0
        L13:
            r0 = r4
            r1 = r6
            r0.wrapper = r1
            r0 = r4
            r1 = r6
            java.lang.String r1 = r1.getMethodDescriptor()
            java.lang.String r2 = ")V"
            boolean r1 = r1.endsWith(r2)
            if (r1 == 0) goto L29
            r1 = 0
            goto L2a
        L29:
            r1 = 1
        L2a:
            r0.hijackReturnValue = r1
            r0 = r4
            r1 = r10
            r0.requests = r1
            r0 = r4
            r1 = r7
            r0.transplant = r1
            r0 = r4
            r1 = r8
            r0.insert = r1
            r0 = r4
            r1 = r9
            if (r1 == 0) goto L4f
            r1 = r4
            boolean r1 = r1.hijackReturnValue
            if (r1 == 0) goto L4f
            r1 = 1
            goto L50
        L4f:
            r1 = 0
        L50:
            r0.cast = r1
            boolean r0 = lombok.patcher.scripts.WrapReturnValuesScript.$assertionsDisabled
            if (r0 != 0) goto L6a
            r0 = r8
            if (r0 == 0) goto L6a
            r0 = r7
            if (r0 == 0) goto L6a
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L6a:
            boolean r0 = lombok.patcher.scripts.WrapReturnValuesScript.$assertionsDisabled
            if (r0 != 0) goto L82
            r0 = r9
            if (r0 == 0) goto L82
            r0 = r8
            if (r0 == 0) goto L82
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L82:
            return
    }

    @Override // lombok.patcher.scripts.MethodLevelPatchScript
    protected lombok.patcher.PatchScript.MethodPatcher createPatcher(org.objectweb.asm.ClassWriter r10, java.lang.String r11, lombok.patcher.TransplantMapper r12) {
            r9 = this;
            lombok.patcher.PatchScript$MethodPatcher r0 = new lombok.patcher.PatchScript$MethodPatcher
            r1 = r0
            r2 = r10
            r3 = r12
            lombok.patcher.scripts.WrapReturnValuesScript$1 r4 = new lombok.patcher.scripts.WrapReturnValuesScript$1
            r5 = r4
            r6 = r9
            r7 = r11
            r5.<init>(r6, r7)
            r1.<init>(r2, r3, r4)
            r13 = r0
            r0 = r9
            boolean r0 = r0.transplant
            if (r0 == 0) goto L24
            r0 = r13
            r1 = r9
            lombok.patcher.Hook r1 = r1.wrapper
            r0.addTransplant(r1)
        L24:
            r0 = r13
            return r0
    }

    private static java.lang.String extractReturnValueFromDesc(java.lang.String r5) {
            r0 = r5
            if (r0 != 0) goto L8
            r0 = -1
            goto Le
        L8:
            r0 = r5
            r1 = 41
            int r0 = r0.lastIndexOf(r1)
        Le:
            r6 = r0
            r0 = r6
            r1 = -1
            if (r0 != r1) goto L16
            r0 = 0
            return r0
        L16:
            r0 = r5
            r1 = r6
            r2 = 1
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r1)
            r7 = r0
            r0 = r7
            java.lang.String r1 = "L"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L3c
            r0 = r7
            java.lang.String r1 = ";"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L3c
            r0 = r7
            r1 = 1
            r2 = r7
            int r2 = r2.length()
            r3 = 1
            int r2 = r2 - r3
            java.lang.String r0 = r0.substring(r1, r2)
            return r0
        L3c:
            r0 = r7
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "WrapReturnValues(wrapper: "
            r1.<init>(r2)
            r1 = r4
            lombok.patcher.Hook r1 = r1.wrapper
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", hijackReturn: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            boolean r1 = r1.hijackReturnValue
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", transplant: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            boolean r1 = r1.transplant
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", insert: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            boolean r1 = r1.insert
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", requests: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.util.Set<lombok.patcher.StackRequest> r1 = r1.requests
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    static /* synthetic */ java.lang.String access$0(java.lang.String r2) {
            r0 = r2
            java.lang.String r0 = extractReturnValueFromDesc(r0)
            return r0
    }

    static /* synthetic */ java.util.Set access$1(lombok.patcher.scripts.WrapReturnValuesScript r2) {
            r0 = r2
            java.util.Set<lombok.patcher.StackRequest> r0 = r0.requests
            return r0
    }

    static /* synthetic */ boolean access$2(lombok.patcher.scripts.WrapReturnValuesScript r2) {
            r0 = r2
            boolean r0 = r0.hijackReturnValue
            return r0
    }

    static /* synthetic */ boolean access$3(lombok.patcher.scripts.WrapReturnValuesScript r2) {
            r0 = r2
            boolean r0 = r0.insert
            return r0
    }

    static /* synthetic */ lombok.patcher.Hook access$4(lombok.patcher.scripts.WrapReturnValuesScript r2) {
            r0 = r2
            lombok.patcher.Hook r0 = r0.wrapper
            return r0
    }

    static /* synthetic */ void access$5(lombok.patcher.Hook r3, org.objectweb.asm.MethodVisitor r4) {
            r0 = r3
            r1 = r4
            insertMethod(r0, r1)
            return
    }

    static /* synthetic */ boolean access$6(lombok.patcher.scripts.WrapReturnValuesScript r2) {
            r0 = r2
            boolean r0 = r0.transplant
            return r0
    }

    static /* synthetic */ boolean access$7(lombok.patcher.scripts.WrapReturnValuesScript r2) {
            r0 = r2
            boolean r0 = r0.cast
            return r0
    }
}
