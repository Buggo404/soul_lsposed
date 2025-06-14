package lombok.bytecode;

/* loaded from: com.usidqw.qwerklj.apk:lombok/bytecode/FixedClassWriter.SCL.lombok */
class FixedClassWriter extends org.objectweb.asm.ClassWriter {
    FixedClassWriter(org.objectweb.asm.ClassReader r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    @Override // org.objectweb.asm.ClassWriter
    protected java.lang.String getCommonSuperClass(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.String r0 = super.getCommonSuperClass(r1, r2)     // Catch: java.lang.OutOfMemoryError -> L7 java.lang.Throwable -> La
            return r0
        L7:
            r7 = move-exception
            r0 = r7
            throw r0
        La:
            java.lang.String r0 = "java/lang/Object"
            return r0
    }
}
