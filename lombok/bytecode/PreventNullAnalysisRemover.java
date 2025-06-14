package lombok.bytecode;

/* loaded from: com.usidqw.qwerklj.apk:lombok/bytecode/PreventNullAnalysisRemover.SCL.lombok */
public class PreventNullAnalysisRemover implements lombok.core.PostCompilerTransformation {



    public PreventNullAnalysisRemover() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.core.PostCompilerTransformation
    public byte[] applyTransformations(byte[] r9, java.lang.String r10, lombok.core.DiagnosticsReceiver r11) {
            r8 = this;
            lombok.bytecode.ClassFileMetaData r0 = new lombok.bytecode.ClassFileMetaData
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            java.lang.String r1 = "lombok/Lombok"
            java.lang.String r2 = "preventNullAnalysis"
            boolean r0 = r0.usesMethod(r1, r2)
            if (r0 != 0) goto L14
            r0 = 0
            return r0
        L14:
            r0 = r9
            byte[] r0 = lombok.bytecode.AsmUtil.fixJSRInlining(r0)
            r12 = r0
            org.objectweb.asm.ClassReader r0 = new org.objectweb.asm.ClassReader
            r1 = r0
            r2 = r12
            r1.<init>(r2)
            r13 = r0
            lombok.bytecode.FixedClassWriter r0 = new lombok.bytecode.FixedClassWriter
            r1 = r0
            r2 = r13
            r3 = 0
            r1.<init>(r2, r3)
            r14 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = r0
            r1.<init>()
            r15 = r0
            r0 = r13
            lombok.bytecode.PreventNullAnalysisRemover$1 r1 = new lombok.bytecode.PreventNullAnalysisRemover$1
            r2 = r1
            r3 = r8
            r4 = 589824(0x90000, float:8.2652E-40)
            r5 = r14
            r6 = r15
            r2.<init>(r3, r4, r5, r6)
            r2 = 0
            r0.accept(r1, r2)
            r0 = r15
            boolean r0 = r0.get()
            if (r0 == 0) goto L5e
            r0 = r14
            byte[] r0 = r0.toByteArray()
            goto L5f
        L5e:
            r0 = 0
        L5f:
            return r0
    }
}
