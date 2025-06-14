package lombok.patcher.scripts;

/* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/scripts/SetSymbolDuringMethodCallScript.SCL.lombok */
public class SetSymbolDuringMethodCallScript extends lombok.patcher.scripts.MethodLevelPatchScript {
    private final lombok.patcher.Hook callToWrap;
    private final java.lang.String symbol;
    private final boolean report;



    /* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/scripts/SetSymbolDuringMethodCallScript$WrapWithSymbol.SCL.lombok */
    private class WrapWithSymbol extends org.objectweb.asm.MethodVisitor {
        private final java.lang.String selfMethodName;
        private final java.lang.String selfTypeName;
        private final java.util.List<lombok.patcher.scripts.WrapperMethodDescriptor> descriptors;
        final /* synthetic */ lombok.patcher.scripts.SetSymbolDuringMethodCallScript this$0;

        public WrapWithSymbol(lombok.patcher.scripts.SetSymbolDuringMethodCallScript r5, java.lang.String r6, org.objectweb.asm.MethodVisitor r7, java.lang.String r8, java.util.List<lombok.patcher.scripts.WrapperMethodDescriptor> r9) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.this$0 = r1
                r0 = r4
                r1 = 589824(0x90000, float:8.2652E-40)
                r2 = r7
                r0.<init>(r1, r2)
                r0 = r4
                r1 = r6
                r0.selfMethodName = r1
                r0 = r4
                r1 = r8
                r0.selfTypeName = r1
                r0 = r4
                r1 = r9
                r0.descriptors = r1
                return
        }

        @Override // org.objectweb.asm.MethodVisitor
        public void visitMethodInsn(int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15) {
                r10 = this;
                r0 = r11
                r1 = 185(0xb9, float:2.59E-43)
                if (r0 == r1) goto Le
                r0 = r11
                r1 = 182(0xb6, float:2.55E-43)
                if (r0 != r1) goto L14
            Le:
                r0 = 1
                r16 = r0
                goto L2d
            L14:
                r0 = r11
                r1 = 184(0xb8, float:2.58E-43)
                if (r0 != r1) goto L21
                r0 = 0
                r16 = r0
                goto L2d
            L21:
                r0 = r10
                r1 = r11
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                super.visitMethodInsn(r1, r2, r3, r4, r5)
                return
            L2d:
                r0 = r10
                lombok.patcher.scripts.SetSymbolDuringMethodCallScript r0 = r0.this$0
                lombok.patcher.Hook r0 = lombok.patcher.scripts.SetSymbolDuringMethodCallScript.access$0(r0)
                java.lang.String r0 = r0.getClassSpec()
                r1 = r12
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L61
                r0 = r10
                lombok.patcher.scripts.SetSymbolDuringMethodCallScript r0 = r0.this$0
                lombok.patcher.Hook r0 = lombok.patcher.scripts.SetSymbolDuringMethodCallScript.access$0(r0)
                java.lang.String r0 = r0.getMethodName()
                r1 = r13
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L61
                r0 = r10
                lombok.patcher.scripts.SetSymbolDuringMethodCallScript r0 = r0.this$0
                lombok.patcher.Hook r0 = lombok.patcher.scripts.SetSymbolDuringMethodCallScript.access$0(r0)
                java.lang.String r0 = r0.getMethodDescriptor()
                r1 = r14
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L6d
            L61:
                r0 = r10
                r1 = r11
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                super.visitMethodInsn(r1, r2, r3, r4, r5)
                return
            L6d:
                r0 = r16
                if (r0 == 0) goto L9e
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                java.lang.String r2 = "(L"
                r1.<init>(r2)
                r1 = r10
                lombok.patcher.scripts.SetSymbolDuringMethodCallScript r1 = r1.this$0
                lombok.patcher.Hook r1 = lombok.patcher.scripts.SetSymbolDuringMethodCallScript.access$0(r1)
                java.lang.String r1 = r1.getClassSpec()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ";"
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r14
                r2 = 1
                java.lang.String r1 = r1.substring(r2)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                r17 = r0
                goto La2
            L9e:
                r0 = r14
                r17 = r0
            La2:
                lombok.patcher.scripts.WrapperMethodDescriptor r0 = new lombok.patcher.scripts.WrapperMethodDescriptor
                r1 = r0
                r2 = r10
                java.util.List<lombok.patcher.scripts.WrapperMethodDescriptor> r2 = r2.descriptors
                int r2 = r2.size()
                r3 = r11
                r4 = r12
                r5 = r13
                r6 = r17
                r7 = r14
                r8 = r15
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                r18 = r0
                r0 = r10
                lombok.patcher.scripts.SetSymbolDuringMethodCallScript r0 = r0.this$0
                boolean r0 = lombok.patcher.scripts.SetSymbolDuringMethodCallScript.access$1(r0)
                if (r0 == 0) goto L10d
                java.io.PrintStream r0 = java.lang.System.out
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r2 = r1
                java.lang.String r3 = "Changing method "
                r2.<init>(r3)
                r2 = r10
                java.lang.String r2 = r2.selfTypeName
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = "::"
                java.lang.StringBuilder r1 = r1.append(r2)
                r2 = r10
                java.lang.String r2 = r2.selfMethodName
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = " wrapping call to "
                java.lang.StringBuilder r1 = r1.append(r2)
                r2 = r12
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = "::"
                java.lang.StringBuilder r1 = r1.append(r2)
                r2 = r13
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = " to set symbol "
                java.lang.StringBuilder r1 = r1.append(r2)
                r2 = r10
                lombok.patcher.scripts.SetSymbolDuringMethodCallScript r2 = r2.this$0
                java.lang.String r2 = lombok.patcher.scripts.SetSymbolDuringMethodCallScript.access$2(r2)
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.println(r1)
            L10d:
                r0 = r10
                r1 = 184(0xb8, float:2.58E-43)
                r2 = r10
                java.lang.String r2 = r2.selfTypeName
                r3 = r18
                java.lang.String r3 = r3.getWrapperName()
                r4 = r17
                r5 = 0
                super.visitMethodInsn(r1, r2, r3, r4, r5)
                r0 = r10
                java.util.List<lombok.patcher.scripts.WrapperMethodDescriptor> r0 = r0.descriptors
                r1 = r18
                boolean r0 = r0.add(r1)
                return
        }
    }

    @Override // lombok.patcher.PatchScript
    public java.lang.String getPatchScriptName() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "set symbol "
            r1.<init>(r2)
            r1 = r4
            java.lang.String r1 = r1.symbol
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " if "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            lombok.patcher.Hook r1 = r1.callToWrap
            java.lang.String r1 = r1.getMethodName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " is invoked in "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.lang.String r1 = r1.describeMatchers()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    SetSymbolDuringMethodCallScript(java.util.List<lombok.patcher.TargetMatcher> r5, lombok.patcher.Hook r6, java.lang.String r7, boolean r8) {
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
            java.lang.String r2 = "symbol"
            r1.<init>(r2)
            throw r0
        L21:
            r0 = r4
            r1 = r6
            r0.callToWrap = r1
            r0 = r4
            r1 = r7
            r0.symbol = r1
            r0 = r4
            r1 = r8
            r0.report = r1
            return
    }

    @Override // lombok.patcher.scripts.MethodLevelPatchScript
    protected lombok.patcher.PatchScript.MethodPatcher createPatcher(org.objectweb.asm.ClassWriter r12, java.lang.String r13, lombok.patcher.TransplantMapper r14) {
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r15 = r0
            lombok.patcher.scripts.SetSymbolDuringMethodCallScript$2 r0 = new lombok.patcher.scripts.SetSymbolDuringMethodCallScript$2
            r1 = r0
            r2 = r11
            r3 = r12
            r4 = r14
            lombok.patcher.scripts.SetSymbolDuringMethodCallScript$1 r5 = new lombok.patcher.scripts.SetSymbolDuringMethodCallScript$1
            r6 = r5
            r7 = r11
            r8 = r13
            r9 = r15
            r6.<init>(r7, r8, r9)
            r6 = r15
            r1.<init>(r2, r3, r4, r5, r6)
            r16 = r0
            r0 = r16
            return r0
    }

    private void makeWrapperMethod(org.objectweb.asm.ClassVisitor r11, lombok.patcher.scripts.WrapperMethodDescriptor r12) {
            r10 = this;
            r0 = r11
            r1 = 4106(0x100a, float:5.754E-42)
            r2 = r12
            java.lang.String r2 = r2.getWrapperName()
            r3 = r12
            java.lang.String r3 = r3.getWrapperDescriptor()
            r4 = 0
            r5 = 0
            org.objectweb.asm.MethodVisitor r0 = r0.visitMethod(r1, r2, r3, r4, r5)
            r13 = r0
            lombok.patcher.MethodLogistics r0 = new lombok.patcher.MethodLogistics
            r1 = r0
            r2 = 8
            r3 = r12
            java.lang.String r3 = r3.getWrapperDescriptor()
            r1.<init>(r2, r3)
            r14 = r0
            r0 = r13
            r0.visitCode()
            org.objectweb.asm.Label r0 = new org.objectweb.asm.Label
            r1 = r0
            r1.<init>()
            r15 = r0
            org.objectweb.asm.Label r0 = new org.objectweb.asm.Label
            r1 = r0
            r1.<init>()
            r16 = r0
            org.objectweb.asm.Label r0 = new org.objectweb.asm.Label
            r1 = r0
            r1.<init>()
            r17 = r0
            r0 = r13
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = 0
            r0.visitTryCatchBlock(r1, r2, r3, r4)
            r0 = r13
            r1 = r15
            r0.visitLabel(r1)
            r0 = r13
            r1 = r10
            java.lang.String r1 = r1.symbol
            r0.visitLdcInsn(r1)
            r0 = r13
            r1 = 184(0xb8, float:2.58E-43)
            java.lang.String r2 = "lombok/patcher/Symbols"
            java.lang.String r3 = "push"
            java.lang.String r4 = "(Ljava/lang/String;)V"
            r5 = 0
            r0.visitMethodInsn(r1, r2, r3, r4, r5)
            r0 = 0
            r18 = r0
            goto L78
        L6d:
            r0 = r14
            r1 = r18
            r2 = r13
            r0.generateLoadOpcodeForParam(r1, r2)
            int r18 = r18 + 1
        L78:
            r0 = r18
            r1 = r14
            int r1 = r1.getParamCount()
            if (r0 < r1) goto L6d
            r0 = r13
            r1 = r12
            int r1 = r1.getOpcode()
            r2 = r12
            java.lang.String r2 = r2.getOwner()
            r3 = r12
            java.lang.String r3 = r3.getName()
            r4 = r12
            java.lang.String r4 = r4.getTargetDescriptor()
            r5 = r12
            boolean r5 = r5.isItf()
            r0.visitMethodInsn(r1, r2, r3, r4, r5)
            r0 = r13
            r1 = r16
            r0.visitLabel(r1)
            r0 = r13
            r1 = 184(0xb8, float:2.58E-43)
            java.lang.String r2 = "lombok/patcher/Symbols"
            java.lang.String r3 = "pop"
            java.lang.String r4 = "()V"
            r5 = 0
            r0.visitMethodInsn(r1, r2, r3, r4, r5)
            r0 = r14
            r1 = r13
            r0.generateReturnOpcode(r1)
            r0 = r13
            r1 = r17
            r0.visitLabel(r1)
            r0 = r13
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 1
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = r5
            r7 = 0
            java.lang.String r8 = "java/lang/Throwable"
            r6[r7] = r8
            r0.visitFrame(r1, r2, r3, r4, r5)
            r0 = r13
            r1 = 184(0xb8, float:2.58E-43)
            java.lang.String r2 = "lombok/patcher/Symbols"
            java.lang.String r3 = "pop"
            java.lang.String r4 = "()V"
            r5 = 0
            r0.visitMethodInsn(r1, r2, r3, r4, r5)
            r0 = r13
            r1 = 191(0xbf, float:2.68E-43)
            r0.visitInsn(r1)
            r0 = r13
            r1 = 1
            r2 = r14
            int r2 = r2.getParamCount()
            int r1 = java.lang.Math.max(r1, r2)
            r2 = r14
            int r2 = r2.getParamCount()
            r0.visitMaxs(r1, r2)
            r0 = r13
            r0.visitEnd()
            return
    }

    static /* synthetic */ lombok.patcher.Hook access$0(lombok.patcher.scripts.SetSymbolDuringMethodCallScript r2) {
            r0 = r2
            lombok.patcher.Hook r0 = r0.callToWrap
            return r0
    }

    static /* synthetic */ boolean access$1(lombok.patcher.scripts.SetSymbolDuringMethodCallScript r2) {
            r0 = r2
            boolean r0 = r0.report
            return r0
    }

    static /* synthetic */ java.lang.String access$2(lombok.patcher.scripts.SetSymbolDuringMethodCallScript r2) {
            r0 = r2
            java.lang.String r0 = r0.symbol
            return r0
    }

    static /* synthetic */ void access$3(lombok.patcher.scripts.SetSymbolDuringMethodCallScript r4, org.objectweb.asm.ClassVisitor r5, lombok.patcher.scripts.WrapperMethodDescriptor r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            r0.makeWrapperMethod(r1, r2)
            return
    }
}
