package org.objectweb.asm.commons;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/commons/ModuleTargetAttribute.SCL.lombok */
public final class ModuleTargetAttribute extends org.objectweb.asm.Attribute {
    public java.lang.String platform;

    public ModuleTargetAttribute(java.lang.String r4) {
            r3 = this;
            r0 = r3
            java.lang.String r1 = "ModuleTarget"
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            r0.platform = r1
            return
    }

    public ModuleTargetAttribute() {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // org.objectweb.asm.Attribute
    protected org.objectweb.asm.Attribute read(org.objectweb.asm.ClassReader r7, int r8, int r9, char[] r10, int r11, org.objectweb.asm.Label[] r12) {
            r6 = this;
            org.objectweb.asm.commons.ModuleTargetAttribute r0 = new org.objectweb.asm.commons.ModuleTargetAttribute
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r10
            java.lang.String r2 = r2.readUTF8(r3, r4)
            r1.<init>(r2)
            return r0
    }

    @Override // org.objectweb.asm.Attribute
    protected org.objectweb.asm.ByteVector write(org.objectweb.asm.ClassWriter r5, byte[] r6, int r7, int r8, int r9) {
            r4 = this;
            org.objectweb.asm.ByteVector r0 = new org.objectweb.asm.ByteVector
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r10
            r1 = r4
            java.lang.String r1 = r1.platform
            if (r1 != 0) goto L16
            r1 = 0
            goto L1e
        L16:
            r1 = r5
            r2 = r4
            java.lang.String r2 = r2.platform
            int r1 = r1.newUTF8(r2)
        L1e:
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r10
            return r0
    }
}
