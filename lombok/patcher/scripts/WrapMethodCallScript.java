package lombok.patcher.scripts;

/* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/scripts/WrapMethodCallScript.SCL.lombok */
public class WrapMethodCallScript extends lombok.patcher.scripts.MethodLevelPatchScript {
    private final lombok.patcher.Hook wrapper;
    private final lombok.patcher.Hook callToWrap;
    private final boolean transplant;
    private final boolean insert;
    private final boolean leaveReturnValueIntact;
    private final java.util.Set<lombok.patcher.StackRequest> extraRequests;
    static final /* synthetic */ boolean $assertionsDisabled = false;


    /* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/scripts/WrapMethodCallScript$WrapMethodCall.SCL.lombok */
    private class WrapMethodCall extends org.objectweb.asm.MethodVisitor {
        private final java.lang.String ownClassSpec;
        private final lombok.patcher.MethodLogistics logistics;
        final /* synthetic */ lombok.patcher.scripts.WrapMethodCallScript this$0;

        public WrapMethodCall(lombok.patcher.scripts.WrapMethodCallScript r5, org.objectweb.asm.MethodVisitor r6, java.lang.String r7, lombok.patcher.MethodLogistics r8) {
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
                r0.ownClassSpec = r1
                r0 = r4
                r1 = r8
                r0.logistics = r1
                return
        }

        @Override // org.objectweb.asm.MethodVisitor
        public void visitMethodInsn(int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, boolean r12) {
                r7 = this;
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r5 = r12
                super.visitMethodInsn(r1, r2, r3, r4, r5)
                r0 = r7
                lombok.patcher.scripts.WrapMethodCallScript r0 = r0.this$0
                lombok.patcher.Hook r0 = lombok.patcher.scripts.WrapMethodCallScript.access$0(r0)
                java.lang.String r0 = r0.getClassSpec()
                r1 = r9
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L135
                r0 = r7
                lombok.patcher.scripts.WrapMethodCallScript r0 = r0.this$0
                lombok.patcher.Hook r0 = lombok.patcher.scripts.WrapMethodCallScript.access$0(r0)
                java.lang.String r0 = r0.getMethodName()
                r1 = r10
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L135
                r0 = r7
                lombok.patcher.scripts.WrapMethodCallScript r0 = r0.this$0
                lombok.patcher.Hook r0 = lombok.patcher.scripts.WrapMethodCallScript.access$0(r0)
                java.lang.String r0 = r0.getMethodDescriptor()
                r1 = r11
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L135
                r0 = r7
                lombok.patcher.scripts.WrapMethodCallScript r0 = r0.this$0
                boolean r0 = lombok.patcher.scripts.WrapMethodCallScript.access$1(r0)
                if (r0 == 0) goto L7f
                r0 = r7
                lombok.patcher.scripts.WrapMethodCallScript r0 = r0.this$0
                lombok.patcher.Hook r0 = lombok.patcher.scripts.WrapMethodCallScript.access$0(r0)
                boolean r0 = r0.isConstructor()
                if (r0 == 0) goto L62
                r0 = r7
                org.objectweb.asm.MethodVisitor r0 = r0.f626mv
                r1 = 89
                r0.visitInsn(r1)
                goto L7f
            L62:
                r0 = r7
                lombok.patcher.scripts.WrapMethodCallScript r0 = r0.this$0
                lombok.patcher.Hook r0 = lombok.patcher.scripts.WrapMethodCallScript.access$0(r0)
                java.lang.String r0 = r0.getMethodDescriptor()
                java.util.List r0 = lombok.patcher.MethodTarget.decomposeFullDesc(r0)
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                java.lang.String r0 = (java.lang.String) r0
                r1 = r7
                org.objectweb.asm.MethodVisitor r1 = r1.f626mv
                lombok.patcher.MethodLogistics.generateDupForType(r0, r1)
            L7f:
                r0 = r7
                lombok.patcher.scripts.WrapMethodCallScript r0 = r0.this$0
                java.util.Set r0 = lombok.patcher.scripts.WrapMethodCallScript.access$2(r0)
                lombok.patcher.StackRequest r1 = lombok.patcher.StackRequest.THIS
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto L9c
                r0 = r7
                lombok.patcher.MethodLogistics r0 = r0.logistics
                r1 = r7
                org.objectweb.asm.MethodVisitor r1 = r1.f626mv
                r0.generateLoadOpcodeForThis(r1)
            L9c:
                java.util.List<lombok.patcher.StackRequest> r0 = lombok.patcher.StackRequest.PARAMS_IN_ORDER
                java.util.Iterator r0 = r0.iterator()
                r14 = r0
                goto Ld9
            La9:
                r0 = r14
                java.lang.Object r0 = r0.next()
                lombok.patcher.StackRequest r0 = (lombok.patcher.StackRequest) r0
                r13 = r0
                r0 = r7
                lombok.patcher.scripts.WrapMethodCallScript r0 = r0.this$0
                java.util.Set r0 = lombok.patcher.scripts.WrapMethodCallScript.access$2(r0)
                r1 = r13
                boolean r0 = r0.contains(r1)
                if (r0 != 0) goto Lc9
                goto Ld9
            Lc9:
                r0 = r7
                lombok.patcher.MethodLogistics r0 = r0.logistics
                r1 = r13
                int r1 = r1.getParamPos()
                r2 = r7
                org.objectweb.asm.MethodVisitor r2 = r2.f626mv
                r0.generateLoadOpcodeForParam(r1, r2)
            Ld9:
                r0 = r14
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto La9
                r0 = r7
                lombok.patcher.scripts.WrapMethodCallScript r0 = r0.this$0
                boolean r0 = lombok.patcher.scripts.WrapMethodCallScript.access$3(r0)
                if (r0 == 0) goto Lfe
                r0 = r7
                lombok.patcher.scripts.WrapMethodCallScript r0 = r0.this$0
                lombok.patcher.Hook r0 = lombok.patcher.scripts.WrapMethodCallScript.access$4(r0)
                r1 = r7
                org.objectweb.asm.MethodVisitor r1 = r1.f626mv
                lombok.patcher.scripts.WrapMethodCallScript.access$5(r0, r1)
                goto L135
            Lfe:
                r0 = r7
                r1 = 184(0xb8, float:2.58E-43)
                r2 = r7
                lombok.patcher.scripts.WrapMethodCallScript r2 = r2.this$0
                boolean r2 = lombok.patcher.scripts.WrapMethodCallScript.access$6(r2)
                if (r2 == 0) goto L113
                r2 = r7
                java.lang.String r2 = r2.ownClassSpec
                goto L11d
            L113:
                r2 = r7
                lombok.patcher.scripts.WrapMethodCallScript r2 = r2.this$0
                lombok.patcher.Hook r2 = lombok.patcher.scripts.WrapMethodCallScript.access$4(r2)
                java.lang.String r2 = r2.getClassSpec()
            L11d:
                r3 = r7
                lombok.patcher.scripts.WrapMethodCallScript r3 = r3.this$0
                lombok.patcher.Hook r3 = lombok.patcher.scripts.WrapMethodCallScript.access$4(r3)
                java.lang.String r3 = r3.getMethodName()
                r4 = r7
                lombok.patcher.scripts.WrapMethodCallScript r4 = r4.this$0
                lombok.patcher.Hook r4 = lombok.patcher.scripts.WrapMethodCallScript.access$4(r4)
                java.lang.String r4 = r4.getMethodDescriptor()
                r5 = 0
                super.visitMethodInsn(r1, r2, r3, r4, r5)
            L135:
                return
        }
    }

    static {
            java.lang.Class<lombok.patcher.scripts.WrapMethodCallScript> r0 = lombok.patcher.scripts.WrapMethodCallScript.class
            boolean r0 = r0.desiredAssertionStatus()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            lombok.patcher.scripts.WrapMethodCallScript.$assertionsDisabled = r0
            return
    }

    @Override // lombok.patcher.PatchScript
    public java.lang.String getPatchScriptName() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "wrap "
            r1.<init>(r2)
            r1 = r4
            lombok.patcher.Hook r1 = r1.callToWrap
            java.lang.String r1 = r1.getMethodName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " with "
            java.lang.StringBuilder r0 = r0.append(r1)
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

    WrapMethodCallScript(java.util.List<lombok.patcher.TargetMatcher> r5, lombok.patcher.Hook r6, lombok.patcher.Hook r7, boolean r8, boolean r9, java.util.Set<lombok.patcher.StackRequest> r10) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            r0 = r6
            if (r0 != 0) goto L13
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.String r2 = "callToWrap"
            r1.<init>(r2)
            throw r0
        L13:
            r0 = r7
            if (r0 != 0) goto L21
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.String r2 = "wrapper"
            r1.<init>(r2)
            throw r0
        L21:
            r0 = r4
            r1 = r7
            java.lang.String r1 = r1.getMethodDescriptor()
            java.lang.String r2 = ")V"
            boolean r1 = r1.endsWith(r2)
            if (r1 == 0) goto L45
            r1 = r6
            java.lang.String r1 = r1.getMethodDescriptor()
            java.lang.String r2 = ")V"
            boolean r1 = r1.endsWith(r2)
            if (r1 == 0) goto L41
            r1 = r6
            boolean r1 = r1.isConstructor()
            if (r1 == 0) goto L45
        L41:
            r1 = 1
            goto L46
        L45:
            r1 = 0
        L46:
            r0.leaveReturnValueIntact = r1
            r0 = r4
            r1 = r6
            r0.callToWrap = r1
            r0 = r4
            r1 = r7
            r0.wrapper = r1
            r0 = r4
            r1 = r8
            r0.transplant = r1
            r0 = r4
            r1 = r9
            r0.insert = r1
            boolean r0 = lombok.patcher.scripts.WrapMethodCallScript.$assertionsDisabled
            if (r0 != 0) goto L77
            r0 = r9
            if (r0 == 0) goto L77
            r0 = r8
            if (r0 == 0) goto L77
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L77:
            r0 = r4
            r1 = r10
            r0.extraRequests = r1
            return
    }

    @Override // lombok.patcher.scripts.MethodLevelPatchScript
    protected lombok.patcher.PatchScript.MethodPatcher createPatcher(org.objectweb.asm.ClassWriter r10, java.lang.String r11, lombok.patcher.TransplantMapper r12) {
            r9 = this;
            lombok.patcher.PatchScript$MethodPatcher r0 = new lombok.patcher.PatchScript$MethodPatcher
            r1 = r0
            r2 = r10
            r3 = r12
            lombok.patcher.scripts.WrapMethodCallScript$1 r4 = new lombok.patcher.scripts.WrapMethodCallScript$1
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

    static /* synthetic */ lombok.patcher.Hook access$0(lombok.patcher.scripts.WrapMethodCallScript r2) {
            r0 = r2
            lombok.patcher.Hook r0 = r0.callToWrap
            return r0
    }

    static /* synthetic */ boolean access$1(lombok.patcher.scripts.WrapMethodCallScript r2) {
            r0 = r2
            boolean r0 = r0.leaveReturnValueIntact
            return r0
    }

    static /* synthetic */ java.util.Set access$2(lombok.patcher.scripts.WrapMethodCallScript r2) {
            r0 = r2
            java.util.Set<lombok.patcher.StackRequest> r0 = r0.extraRequests
            return r0
    }

    static /* synthetic */ boolean access$3(lombok.patcher.scripts.WrapMethodCallScript r2) {
            r0 = r2
            boolean r0 = r0.insert
            return r0
    }

    static /* synthetic */ lombok.patcher.Hook access$4(lombok.patcher.scripts.WrapMethodCallScript r2) {
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

    static /* synthetic */ boolean access$6(lombok.patcher.scripts.WrapMethodCallScript r2) {
            r0 = r2
            boolean r0 = r0.transplant
            return r0
    }
}
