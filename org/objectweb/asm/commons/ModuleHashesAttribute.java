package org.objectweb.asm.commons;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/commons/ModuleHashesAttribute.SCL.lombok */
public final class ModuleHashesAttribute extends org.objectweb.asm.Attribute {
    public java.lang.String algorithm;
    public java.util.List<java.lang.String> modules;
    public java.util.List<byte[]> hashes;

    public ModuleHashesAttribute(java.lang.String r4, java.util.List<java.lang.String> r5, java.util.List<byte[]> r6) {
            r3 = this;
            r0 = r3
            java.lang.String r1 = "ModuleHashes"
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            r0.algorithm = r1
            r0 = r3
            r1 = r5
            r0.modules = r1
            r0 = r3
            r1 = r6
            r0.hashes = r1
            return
    }

    public ModuleHashesAttribute() {
            r5 = this;
            r0 = r5
            r1 = 0
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // org.objectweb.asm.Attribute
    protected org.objectweb.asm.Attribute read(org.objectweb.asm.ClassReader r7, int r8, int r9, char[] r10, int r11, org.objectweb.asm.Label[] r12) {
            r6 = this;
            r0 = r8
            r13 = r0
            r0 = r7
            r1 = r13
            r2 = r10
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r14 = r0
            int r13 = r13 + 2
            r0 = r7
            r1 = r13
            int r0 = r0.readUnsignedShort(r1)
            r15 = r0
            int r13 = r13 + 2
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = r15
            r1.<init>(r2)
            r16 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = r15
            r1.<init>(r2)
            r17 = r0
            r0 = 0
            r18 = r0
        L34:
            r0 = r18
            r1 = r15
            if (r0 >= r1) goto L8e
            r0 = r7
            r1 = r13
            r2 = r10
            java.lang.String r0 = r0.readModule(r1, r2)
            r19 = r0
            int r13 = r13 + 2
            r0 = r16
            r1 = r19
            boolean r0 = r0.add(r1)
            r0 = r7
            r1 = r13
            int r0 = r0.readUnsignedShort(r1)
            r20 = r0
            int r13 = r13 + 2
            r0 = r20
            byte[] r0 = new byte[r0]
            r21 = r0
            r0 = 0
            r22 = r0
        L64:
            r0 = r22
            r1 = r20
            if (r0 >= r1) goto L80
            r0 = r21
            r1 = r22
            r2 = r7
            r3 = r13
            int r2 = r2.readByte(r3)
            byte r2 = (byte) r2
            r0[r1] = r2
            int r13 = r13 + 1
            int r22 = r22 + 1
            goto L64
        L80:
            r0 = r17
            r1 = r21
            boolean r0 = r0.add(r1)
            int r18 = r18 + 1
            goto L34
        L8e:
            org.objectweb.asm.commons.ModuleHashesAttribute r0 = new org.objectweb.asm.commons.ModuleHashesAttribute
            r1 = r0
            r2 = r14
            r3 = r16
            r4 = r17
            r1.<init>(r2, r3, r4)
            return r0
    }

    @Override // org.objectweb.asm.Attribute
    protected org.objectweb.asm.ByteVector write(org.objectweb.asm.ClassWriter r6, byte[] r7, int r8, int r9, int r10) {
            r5 = this;
            org.objectweb.asm.ByteVector r0 = new org.objectweb.asm.ByteVector
            r1 = r0
            r1.<init>()
            r11 = r0
            r0 = r11
            r1 = r6
            r2 = r5
            java.lang.String r2 = r2.algorithm
            int r1 = r1.newUTF8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r5
            java.util.List<java.lang.String> r0 = r0.modules
            if (r0 != 0) goto L28
            r0 = r11
            r1 = 0
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            goto L86
        L28:
            r0 = r5
            java.util.List<java.lang.String> r0 = r0.modules
            int r0 = r0.size()
            r12 = r0
            r0 = r11
            r1 = r12
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = 0
            r13 = r0
        L3e:
            r0 = r13
            r1 = r12
            if (r0 >= r1) goto L86
            r0 = r5
            java.util.List<java.lang.String> r0 = r0.modules
            r1 = r13
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r14 = r0
            r0 = r5
            java.util.List<byte[]> r0 = r0.hashes
            r1 = r13
            java.lang.Object r0 = r0.get(r1)
            byte[] r0 = (byte[]) r0
            r15 = r0
            r0 = r11
            r1 = r6
            r2 = r14
            int r1 = r1.newModule(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r15
            int r1 = r1.length
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r15
            r2 = 0
            r3 = r15
            int r3 = r3.length
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
            int r13 = r13 + 1
            goto L3e
        L86:
            r0 = r11
            return r0
    }
}
