package lombok.bytecode;

/* loaded from: com.usidqw.qwerklj.apk:lombok/bytecode/AsmUtil.SCL.lombok */
class AsmUtil {


    private AsmUtil() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    static byte[] fixJSRInlining(byte[] r5) {
            org.objectweb.asm.ClassReader r0 = new org.objectweb.asm.ClassReader
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r6 = r0
            lombok.bytecode.FixedClassWriter r0 = new lombok.bytecode.FixedClassWriter
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            r7 = r0
            lombok.bytecode.AsmUtil$1 r0 = new lombok.bytecode.AsmUtil$1
            r1 = r0
            r2 = 589824(0x90000, float:8.2652E-40)
            r3 = r7
            r1.<init>(r2, r3)
            r8 = r0
            r0 = r6
            r1 = r8
            r2 = 0
            r0.accept(r1, r2)
            r0 = r7
            byte[] r0 = r0.toByteArray()
            return r0
    }
}
