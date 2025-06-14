package org.objectweb.asm.commons;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/commons/ModuleResolutionAttribute.SCL.lombok */
public final class ModuleResolutionAttribute extends org.objectweb.asm.Attribute {
    public static final int RESOLUTION_DO_NOT_RESOLVE_BY_DEFAULT = 1;
    public static final int RESOLUTION_WARN_DEPRECATED = 2;
    public static final int RESOLUTION_WARN_DEPRECATED_FOR_REMOVAL = 4;
    public static final int RESOLUTION_WARN_INCUBATING = 8;
    public int resolution;

    public ModuleResolutionAttribute(int r4) {
            r3 = this;
            r0 = r3
            java.lang.String r1 = "ModuleResolution"
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            r0.resolution = r1
            return
    }

    public ModuleResolutionAttribute() {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // org.objectweb.asm.Attribute
    protected org.objectweb.asm.Attribute read(org.objectweb.asm.ClassReader r6, int r7, int r8, char[] r9, int r10, org.objectweb.asm.Label[] r11) {
            r5 = this;
            org.objectweb.asm.commons.ModuleResolutionAttribute r0 = new org.objectweb.asm.commons.ModuleResolutionAttribute
            r1 = r0
            r2 = r6
            r3 = r7
            int r2 = r2.readUnsignedShort(r3)
            r1.<init>(r2)
            return r0
    }

    @Override // org.objectweb.asm.Attribute
    protected org.objectweb.asm.ByteVector write(org.objectweb.asm.ClassWriter r4, byte[] r5, int r6, int r7, int r8) {
            r3 = this;
            org.objectweb.asm.ByteVector r0 = new org.objectweb.asm.ByteVector
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r9
            r1 = r3
            int r1 = r1.resolution
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r9
            return r0
    }
}
