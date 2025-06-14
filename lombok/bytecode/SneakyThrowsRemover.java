package lombok.bytecode;

/* loaded from: com.usidqw.qwerklj.apk:lombok/bytecode/SneakyThrowsRemover.SCL.lombok */
public class SneakyThrowsRemover implements lombok.core.PostCompilerTransformation {



    public SneakyThrowsRemover() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.core.PostCompilerTransformation
    public byte[] applyTransformations(byte[] r10, java.lang.String r11, lombok.core.DiagnosticsReceiver r12) {
            r9 = this;
            lombok.bytecode.ClassFileMetaData r0 = new lombok.bytecode.ClassFileMetaData
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            java.lang.String r1 = "lombok/Lombok"
            java.lang.String r2 = "sneakyThrow"
            boolean r0 = r0.usesMethod(r1, r2)
            if (r0 != 0) goto L14
            r0 = 0
            return r0
        L14:
            r0 = r10
            byte[] r0 = lombok.bytecode.AsmUtil.fixJSRInlining(r0)
            r13 = r0
            org.objectweb.asm.ClassReader r0 = new org.objectweb.asm.ClassReader
            r1 = r0
            r2 = r13
            r1.<init>(r2)
            r14 = r0
            org.objectweb.asm.ClassWriter r0 = new org.objectweb.asm.ClassWriter
            r1 = r0
            r2 = r14
            r3 = 0
            r1.<init>(r2, r3)
            r15 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = r0
            r1.<init>()
            r16 = r0
            r0 = r14
            lombok.bytecode.SneakyThrowsRemover$1 r1 = new lombok.bytecode.SneakyThrowsRemover$1
            r2 = r1
            r3 = r9
            r4 = 589824(0x90000, float:8.2652E-40)
            r5 = r15
            r6 = r12
            r7 = r16
            r2.<init>(r3, r4, r5, r6, r7)
            r2 = 0
            r0.accept(r1, r2)
            r0 = r16
            boolean r0 = r0.get()
            if (r0 == 0) goto L5f
            r0 = r15
            byte[] r0 = r0.toByteArray()
            goto L60
        L5f:
            r0 = 0
        L60:
            return r0
    }
}
