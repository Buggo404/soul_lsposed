package lombok.patcher.scripts;

/* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/scripts/ExitFromMethodEarlyScript.SCL.lombok */
public class ExitFromMethodEarlyScript extends lombok.patcher.scripts.MethodLevelPatchScript {
    private final lombok.patcher.Hook decisionWrapper;
    private final lombok.patcher.Hook valueWrapper;
    private final java.util.Set<lombok.patcher.StackRequest> requests;
    private final boolean transplant;
    private final boolean insert;
    private final boolean insertCallOnly;
    static final /* synthetic */ boolean $assertionsDisabled = false;


    /* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/scripts/ExitFromMethodEarlyScript$ExitEarly.SCL.lombok */
    private class ExitEarly extends org.objectweb.asm.MethodVisitor {
        private final lombok.patcher.MethodLogistics logistics;
        private final java.lang.String ownClassSpec;
        final /* synthetic */ lombok.patcher.scripts.ExitFromMethodEarlyScript this$0;

        public ExitEarly(lombok.patcher.scripts.ExitFromMethodEarlyScript r5, org.objectweb.asm.MethodVisitor r6, lombok.patcher.MethodLogistics r7, java.lang.String r8) {
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
                return
        }

        @Override // org.objectweb.asm.MethodVisitor
        public void visitCode() {
                r7 = this;
                r0 = r7
                lombok.patcher.scripts.ExitFromMethodEarlyScript r0 = r0.this$0
                lombok.patcher.Hook r0 = lombok.patcher.scripts.ExitFromMethodEarlyScript.access$0(r0)
                if (r0 != 0) goto L27
                r0 = r7
                lombok.patcher.MethodLogistics r0 = r0.logistics
                int r0 = r0.getReturnOpcode()
                r1 = 177(0xb1, float:2.48E-43)
                if (r0 != r1) goto L22
                r0 = r7
                org.objectweb.asm.MethodVisitor r0 = r0.f626mv
                r1 = 177(0xb1, float:2.48E-43)
                r0.visitInsn(r1)
                return
            L22:
                r0 = r7
                r0.insertValueWrapperCall()
                return
            L27:
                r0 = r7
                lombok.patcher.scripts.ExitFromMethodEarlyScript r0 = r0.this$0
                java.util.Set r0 = lombok.patcher.scripts.ExitFromMethodEarlyScript.access$1(r0)
                lombok.patcher.StackRequest r1 = lombok.patcher.StackRequest.THIS
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto L44
                r0 = r7
                lombok.patcher.MethodLogistics r0 = r0.logistics
                r1 = r7
                org.objectweb.asm.MethodVisitor r1 = r1.f626mv
                r0.generateLoadOpcodeForThis(r1)
            L44:
                java.util.List<lombok.patcher.StackRequest> r0 = lombok.patcher.StackRequest.PARAMS_IN_ORDER
                java.util.Iterator r0 = r0.iterator()
                r9 = r0
                goto L7c
            L50:
                r0 = r9
                java.lang.Object r0 = r0.next()
                lombok.patcher.StackRequest r0 = (lombok.patcher.StackRequest) r0
                r8 = r0
                r0 = r7
                lombok.patcher.scripts.ExitFromMethodEarlyScript r0 = r0.this$0
                java.util.Set r0 = lombok.patcher.scripts.ExitFromMethodEarlyScript.access$1(r0)
                r1 = r8
                boolean r0 = r0.contains(r1)
                if (r0 != 0) goto L6d
                goto L7c
            L6d:
                r0 = r7
                lombok.patcher.MethodLogistics r0 = r0.logistics
                r1 = r8
                int r1 = r1.getParamPos()
                r2 = r7
                org.objectweb.asm.MethodVisitor r2 = r2.f626mv
                r0.generateLoadOpcodeForParam(r1, r2)
            L7c:
                r0 = r9
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L50
                r0 = r7
                lombok.patcher.scripts.ExitFromMethodEarlyScript r0 = r0.this$0
                boolean r0 = lombok.patcher.scripts.ExitFromMethodEarlyScript.access$2(r0)
                if (r0 == 0) goto La0
                r0 = r7
                lombok.patcher.scripts.ExitFromMethodEarlyScript r0 = r0.this$0
                lombok.patcher.Hook r0 = lombok.patcher.scripts.ExitFromMethodEarlyScript.access$0(r0)
                r1 = r7
                org.objectweb.asm.MethodVisitor r1 = r1.f626mv
                lombok.patcher.scripts.ExitFromMethodEarlyScript.access$3(r0, r1)
                goto Ld7
            La0:
                r0 = r7
                r1 = 184(0xb8, float:2.58E-43)
                r2 = r7
                lombok.patcher.scripts.ExitFromMethodEarlyScript r2 = r2.this$0
                boolean r2 = lombok.patcher.scripts.ExitFromMethodEarlyScript.access$4(r2)
                if (r2 == 0) goto Lb5
                r2 = r7
                java.lang.String r2 = r2.ownClassSpec
                goto Lbf
            Lb5:
                r2 = r7
                lombok.patcher.scripts.ExitFromMethodEarlyScript r2 = r2.this$0
                lombok.patcher.Hook r2 = lombok.patcher.scripts.ExitFromMethodEarlyScript.access$0(r2)
                java.lang.String r2 = r2.getClassSpec()
            Lbf:
                r3 = r7
                lombok.patcher.scripts.ExitFromMethodEarlyScript r3 = r3.this$0
                lombok.patcher.Hook r3 = lombok.patcher.scripts.ExitFromMethodEarlyScript.access$0(r3)
                java.lang.String r3 = r3.getMethodName()
                r4 = r7
                lombok.patcher.scripts.ExitFromMethodEarlyScript r4 = r4.this$0
                lombok.patcher.Hook r4 = lombok.patcher.scripts.ExitFromMethodEarlyScript.access$0(r4)
                java.lang.String r4 = r4.getMethodDescriptor()
                r5 = 0
                super.visitMethodInsn(r1, r2, r3, r4, r5)
            Ld7:
                r0 = r7
                lombok.patcher.scripts.ExitFromMethodEarlyScript r0 = r0.this$0
                boolean r0 = lombok.patcher.scripts.ExitFromMethodEarlyScript.access$5(r0)
                if (r0 == 0) goto Le6
                r0 = r7
                super.visitCode()
                return
            Le6:
                org.objectweb.asm.Label r0 = new org.objectweb.asm.Label
                r1 = r0
                r1.<init>()
                r8 = r0
                r0 = r7
                org.objectweb.asm.MethodVisitor r0 = r0.f626mv
                r1 = 153(0x99, float:2.14E-43)
                r2 = r8
                r0.visitJumpInsn(r1, r2)
                r0 = r7
                lombok.patcher.MethodLogistics r0 = r0.logistics
                int r0 = r0.getReturnOpcode()
                r1 = 177(0xb1, float:2.48E-43)
                if (r0 != r1) goto L113
                r0 = r7
                org.objectweb.asm.MethodVisitor r0 = r0.f626mv
                r1 = 177(0xb1, float:2.48E-43)
                r0.visitInsn(r1)
                goto L1ce
            L113:
                r0 = r7
                lombok.patcher.scripts.ExitFromMethodEarlyScript r0 = r0.this$0
                java.util.Set r0 = lombok.patcher.scripts.ExitFromMethodEarlyScript.access$1(r0)
                lombok.patcher.StackRequest r1 = lombok.patcher.StackRequest.THIS
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto L130
                r0 = r7
                lombok.patcher.MethodLogistics r0 = r0.logistics
                r1 = r7
                org.objectweb.asm.MethodVisitor r1 = r1.f626mv
                r0.generateLoadOpcodeForThis(r1)
            L130:
                java.util.List<lombok.patcher.StackRequest> r0 = lombok.patcher.StackRequest.PARAMS_IN_ORDER
                java.util.Iterator r0 = r0.iterator()
                r10 = r0
                goto L168
            L13c:
                r0 = r10
                java.lang.Object r0 = r0.next()
                lombok.patcher.StackRequest r0 = (lombok.patcher.StackRequest) r0
                r9 = r0
                r0 = r7
                lombok.patcher.scripts.ExitFromMethodEarlyScript r0 = r0.this$0
                java.util.Set r0 = lombok.patcher.scripts.ExitFromMethodEarlyScript.access$1(r0)
                r1 = r9
                boolean r0 = r0.contains(r1)
                if (r0 != 0) goto L159
                goto L168
            L159:
                r0 = r7
                lombok.patcher.MethodLogistics r0 = r0.logistics
                r1 = r9
                int r1 = r1.getParamPos()
                r2 = r7
                org.objectweb.asm.MethodVisitor r2 = r2.f626mv
                r0.generateLoadOpcodeForParam(r1, r2)
            L168:
                r0 = r10
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L13c
                r0 = r7
                lombok.patcher.scripts.ExitFromMethodEarlyScript r0 = r0.this$0
                boolean r0 = lombok.patcher.scripts.ExitFromMethodEarlyScript.access$2(r0)
                if (r0 == 0) goto L18c
                r0 = r7
                lombok.patcher.scripts.ExitFromMethodEarlyScript r0 = r0.this$0
                lombok.patcher.Hook r0 = lombok.patcher.scripts.ExitFromMethodEarlyScript.access$6(r0)
                r1 = r7
                org.objectweb.asm.MethodVisitor r1 = r1.f626mv
                lombok.patcher.scripts.ExitFromMethodEarlyScript.access$3(r0, r1)
                goto L1c3
            L18c:
                r0 = r7
                r1 = 184(0xb8, float:2.58E-43)
                r2 = r7
                lombok.patcher.scripts.ExitFromMethodEarlyScript r2 = r2.this$0
                boolean r2 = lombok.patcher.scripts.ExitFromMethodEarlyScript.access$4(r2)
                if (r2 == 0) goto L1a1
                r2 = r7
                java.lang.String r2 = r2.ownClassSpec
                goto L1ab
            L1a1:
                r2 = r7
                lombok.patcher.scripts.ExitFromMethodEarlyScript r2 = r2.this$0
                lombok.patcher.Hook r2 = lombok.patcher.scripts.ExitFromMethodEarlyScript.access$6(r2)
                java.lang.String r2 = r2.getClassSpec()
            L1ab:
                r3 = r7
                lombok.patcher.scripts.ExitFromMethodEarlyScript r3 = r3.this$0
                lombok.patcher.Hook r3 = lombok.patcher.scripts.ExitFromMethodEarlyScript.access$6(r3)
                java.lang.String r3 = r3.getMethodName()
                r4 = r7
                lombok.patcher.scripts.ExitFromMethodEarlyScript r4 = r4.this$0
                lombok.patcher.Hook r4 = lombok.patcher.scripts.ExitFromMethodEarlyScript.access$6(r4)
                java.lang.String r4 = r4.getMethodDescriptor()
                r5 = 0
                super.visitMethodInsn(r1, r2, r3, r4, r5)
            L1c3:
                r0 = r7
                lombok.patcher.MethodLogistics r0 = r0.logistics
                r1 = r7
                org.objectweb.asm.MethodVisitor r1 = r1.f626mv
                r0.generateReturnOpcode(r1)
            L1ce:
                r0 = r7
                org.objectweb.asm.MethodVisitor r0 = r0.f626mv
                r1 = r8
                r0.visitLabel(r1)
                r0 = r7
                org.objectweb.asm.MethodVisitor r0 = r0.f626mv
                r1 = 3
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r0.visitFrame(r1, r2, r3, r4, r5)
                r0 = r7
                super.visitCode()
                return
        }

        private void insertValueWrapperCall() {
                r7 = this;
                r0 = r7
                lombok.patcher.scripts.ExitFromMethodEarlyScript r0 = r0.this$0
                java.util.Set r0 = lombok.patcher.scripts.ExitFromMethodEarlyScript.access$1(r0)
                lombok.patcher.StackRequest r1 = lombok.patcher.StackRequest.THIS
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto L1d
                r0 = r7
                lombok.patcher.MethodLogistics r0 = r0.logistics
                r1 = r7
                org.objectweb.asm.MethodVisitor r1 = r1.f626mv
                r0.generateLoadOpcodeForThis(r1)
            L1d:
                java.util.List<lombok.patcher.StackRequest> r0 = lombok.patcher.StackRequest.PARAMS_IN_ORDER
                java.util.Iterator r0 = r0.iterator()
                r9 = r0
                goto L55
            L29:
                r0 = r9
                java.lang.Object r0 = r0.next()
                lombok.patcher.StackRequest r0 = (lombok.patcher.StackRequest) r0
                r8 = r0
                r0 = r7
                lombok.patcher.scripts.ExitFromMethodEarlyScript r0 = r0.this$0
                java.util.Set r0 = lombok.patcher.scripts.ExitFromMethodEarlyScript.access$1(r0)
                r1 = r8
                boolean r0 = r0.contains(r1)
                if (r0 != 0) goto L46
                goto L55
            L46:
                r0 = r7
                lombok.patcher.MethodLogistics r0 = r0.logistics
                r1 = r8
                int r1 = r1.getParamPos()
                r2 = r7
                org.objectweb.asm.MethodVisitor r2 = r2.f626mv
                r0.generateLoadOpcodeForParam(r1, r2)
            L55:
                r0 = r9
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L29
                r0 = r7
                lombok.patcher.scripts.ExitFromMethodEarlyScript r0 = r0.this$0
                boolean r0 = lombok.patcher.scripts.ExitFromMethodEarlyScript.access$2(r0)
                if (r0 == 0) goto L79
                r0 = r7
                lombok.patcher.scripts.ExitFromMethodEarlyScript r0 = r0.this$0
                lombok.patcher.Hook r0 = lombok.patcher.scripts.ExitFromMethodEarlyScript.access$6(r0)
                r1 = r7
                org.objectweb.asm.MethodVisitor r1 = r1.f626mv
                lombok.patcher.scripts.ExitFromMethodEarlyScript.access$3(r0, r1)
                goto Lb0
            L79:
                r0 = r7
                r1 = 184(0xb8, float:2.58E-43)
                r2 = r7
                lombok.patcher.scripts.ExitFromMethodEarlyScript r2 = r2.this$0
                boolean r2 = lombok.patcher.scripts.ExitFromMethodEarlyScript.access$4(r2)
                if (r2 == 0) goto L8e
                r2 = r7
                java.lang.String r2 = r2.ownClassSpec
                goto L98
            L8e:
                r2 = r7
                lombok.patcher.scripts.ExitFromMethodEarlyScript r2 = r2.this$0
                lombok.patcher.Hook r2 = lombok.patcher.scripts.ExitFromMethodEarlyScript.access$6(r2)
                java.lang.String r2 = r2.getClassSpec()
            L98:
                r3 = r7
                lombok.patcher.scripts.ExitFromMethodEarlyScript r3 = r3.this$0
                lombok.patcher.Hook r3 = lombok.patcher.scripts.ExitFromMethodEarlyScript.access$6(r3)
                java.lang.String r3 = r3.getMethodName()
                r4 = r7
                lombok.patcher.scripts.ExitFromMethodEarlyScript r4 = r4.this$0
                lombok.patcher.Hook r4 = lombok.patcher.scripts.ExitFromMethodEarlyScript.access$6(r4)
                java.lang.String r4 = r4.getMethodDescriptor()
                r5 = 0
                super.visitMethodInsn(r1, r2, r3, r4, r5)
            Lb0:
                r0 = r7
                lombok.patcher.MethodLogistics r0 = r0.logistics
                r1 = r7
                org.objectweb.asm.MethodVisitor r1 = r1.f626mv
                r0.generateReturnOpcode(r1)
                return
        }
    }

    static {
            java.lang.Class<lombok.patcher.scripts.ExitFromMethodEarlyScript> r0 = lombok.patcher.scripts.ExitFromMethodEarlyScript.class
            boolean r0 = r0.desiredAssertionStatus()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            lombok.patcher.scripts.ExitFromMethodEarlyScript.$assertionsDisabled = r0
            return
    }

    @Override // lombok.patcher.PatchScript
    public java.lang.String getPatchScriptName() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "Exit Early from "
            r1.<init>(r2)
            r1 = r4
            java.lang.String r1 = r1.describeMatchers()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    ExitFromMethodEarlyScript(java.util.List<lombok.patcher.TargetMatcher> r5, lombok.patcher.Hook r6, lombok.patcher.Hook r7, boolean r8, boolean r9, java.util.Set<lombok.patcher.StackRequest> r10) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            r0 = r4
            r1 = r6
            r0.decisionWrapper = r1
            r0 = r4
            r1 = r7
            r0.valueWrapper = r1
            r0 = r4
            r1 = r10
            r0.requests = r1
            r0 = r4
            r1 = r8
            r0.transplant = r1
            r0 = r4
            r1 = r9
            r0.insert = r1
            r0 = r4
            r1 = r6
            if (r1 == 0) goto L36
            r1 = r6
            java.lang.String r1 = r1.getMethodDescriptor()
            java.lang.String r2 = ")V"
            boolean r1 = r1.endsWith(r2)
            if (r1 == 0) goto L36
            r1 = 1
            goto L37
        L36:
            r1 = 0
        L37:
            r0.insertCallOnly = r1
            r0 = r4
            boolean r0 = r0.insertCallOnly
            if (r0 != 0) goto L5b
            r0 = r6
            if (r0 == 0) goto L5b
            r0 = r6
            java.lang.String r0 = r0.getMethodDescriptor()
            java.lang.String r1 = ")Z"
            boolean r0 = r0.endsWith(r1)
            if (r0 != 0) goto L5b
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "The decisionWrapper method must either return 'boolean' or return 'void'."
            r1.<init>(r2)
            throw r0
        L5b:
            boolean r0 = lombok.patcher.scripts.ExitFromMethodEarlyScript.$assertionsDisabled
            if (r0 != 0) goto L73
            r0 = r9
            if (r0 == 0) goto L73
            r0 = r8
            if (r0 == 0) goto L73
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L73:
            return
    }

    @Override // lombok.patcher.scripts.MethodLevelPatchScript
    protected lombok.patcher.PatchScript.MethodPatcher createPatcher(org.objectweb.asm.ClassWriter r10, java.lang.String r11, lombok.patcher.TransplantMapper r12) {
            r9 = this;
            lombok.patcher.PatchScript$MethodPatcher r0 = new lombok.patcher.PatchScript$MethodPatcher
            r1 = r0
            r2 = r10
            r3 = r12
            lombok.patcher.scripts.ExitFromMethodEarlyScript$1 r4 = new lombok.patcher.scripts.ExitFromMethodEarlyScript$1
            r5 = r4
            r6 = r9
            r7 = r11
            r5.<init>(r6, r7)
            r1.<init>(r2, r3, r4)
            r13 = r0
            r0 = r9
            boolean r0 = r0.transplant
            if (r0 == 0) goto L34
            r0 = r13
            r1 = r9
            lombok.patcher.Hook r1 = r1.decisionWrapper
            r0.addTransplant(r1)
            r0 = r9
            lombok.patcher.Hook r0 = r0.valueWrapper
            if (r0 == 0) goto L34
            r0 = r13
            r1 = r9
            lombok.patcher.Hook r1 = r1.valueWrapper
            r0.addTransplant(r1)
        L34:
            r0 = r13
            return r0
    }

    static /* synthetic */ lombok.patcher.Hook access$0(lombok.patcher.scripts.ExitFromMethodEarlyScript r2) {
            r0 = r2
            lombok.patcher.Hook r0 = r0.decisionWrapper
            return r0
    }

    static /* synthetic */ java.util.Set access$1(lombok.patcher.scripts.ExitFromMethodEarlyScript r2) {
            r0 = r2
            java.util.Set<lombok.patcher.StackRequest> r0 = r0.requests
            return r0
    }

    static /* synthetic */ boolean access$2(lombok.patcher.scripts.ExitFromMethodEarlyScript r2) {
            r0 = r2
            boolean r0 = r0.insert
            return r0
    }

    static /* synthetic */ void access$3(lombok.patcher.Hook r3, org.objectweb.asm.MethodVisitor r4) {
            r0 = r3
            r1 = r4
            insertMethod(r0, r1)
            return
    }

    static /* synthetic */ boolean access$4(lombok.patcher.scripts.ExitFromMethodEarlyScript r2) {
            r0 = r2
            boolean r0 = r0.transplant
            return r0
    }

    static /* synthetic */ boolean access$5(lombok.patcher.scripts.ExitFromMethodEarlyScript r2) {
            r0 = r2
            boolean r0 = r0.insertCallOnly
            return r0
    }

    static /* synthetic */ lombok.patcher.Hook access$6(lombok.patcher.scripts.ExitFromMethodEarlyScript r2) {
            r0 = r2
            lombok.patcher.Hook r0 = r0.valueWrapper
            return r0
    }
}
