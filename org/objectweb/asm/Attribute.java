package org.objectweb.asm;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/Attribute.SCL.lombok */
public class Attribute {
    public final java.lang.String type;
    private byte[] content;
    org.objectweb.asm.Attribute nextAttribute;

    /* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/Attribute$Set.SCL.lombok */
    static final class Set {
        private static final int SIZE_INCREMENT = 6;
        private int size;
        private org.objectweb.asm.Attribute[] data;

        Set() {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = 6
                org.objectweb.asm.Attribute[] r1 = new org.objectweb.asm.Attribute[r1]
                r0.data = r1
                return
        }

        void addAttributes(org.objectweb.asm.Attribute r4) {
                r3 = this;
                r0 = r4
                r5 = r0
            L2:
                r0 = r5
                if (r0 == 0) goto L1b
                r0 = r3
                r1 = r5
                boolean r0 = r0.contains(r1)
                if (r0 != 0) goto L13
                r0 = r3
                r1 = r5
                r0.add(r1)
            L13:
                r0 = r5
                org.objectweb.asm.Attribute r0 = r0.nextAttribute
                r5 = r0
                goto L2
            L1b:
                return
        }

        org.objectweb.asm.Attribute[] toArray() {
                r6 = this;
                r0 = r6
                int r0 = r0.size
                org.objectweb.asm.Attribute[] r0 = new org.objectweb.asm.Attribute[r0]
                r7 = r0
                r0 = r6
                org.objectweb.asm.Attribute[] r0 = r0.data
                r1 = 0
                r2 = r7
                r3 = 0
                r4 = r6
                int r4 = r4.size
                java.lang.System.arraycopy(r0, r1, r2, r3, r4)
                r0 = r7
                return r0
        }

        private boolean contains(org.objectweb.asm.Attribute r4) {
                r3 = this;
                r0 = 0
                r5 = r0
            L2:
                r0 = r5
                r1 = r3
                int r1 = r1.size
                if (r0 >= r1) goto L25
                r0 = r3
                org.objectweb.asm.Attribute[] r0 = r0.data
                r1 = r5
                r0 = r0[r1]
                java.lang.String r0 = r0.type
                r1 = r4
                java.lang.String r1 = r1.type
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L1f
                r0 = 1
                return r0
            L1f:
                int r5 = r5 + 1
                goto L2
            L25:
                r0 = 0
                return r0
        }

        private void add(org.objectweb.asm.Attribute r7) {
                r6 = this;
                r0 = r6
                int r0 = r0.size
                r1 = r6
                org.objectweb.asm.Attribute[] r1 = r1.data
                int r1 = r1.length
                if (r0 < r1) goto L2b
                r0 = r6
                org.objectweb.asm.Attribute[] r0 = r0.data
                int r0 = r0.length
                r1 = 6
                int r0 = r0 + r1
                org.objectweb.asm.Attribute[] r0 = new org.objectweb.asm.Attribute[r0]
                r8 = r0
                r0 = r6
                org.objectweb.asm.Attribute[] r0 = r0.data
                r1 = 0
                r2 = r8
                r3 = 0
                r4 = r6
                int r4 = r4.size
                java.lang.System.arraycopy(r0, r1, r2, r3, r4)
                r0 = r6
                r1 = r8
                r0.data = r1
            L2b:
                r0 = r6
                org.objectweb.asm.Attribute[] r0 = r0.data
                r1 = r6
                r2 = r1
                int r2 = r2.size
                r3 = r2; r2 = r1; r1 = r3; 
                r4 = 1
                int r3 = r3 + r4
                r2.size = r3
                r2 = r7
                r0[r1] = r2
                return
        }
    }

    protected Attribute(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.type = r1
            return
    }

    public boolean isUnknown() {
            r2 = this;
            r0 = 1
            return r0
    }

    public boolean isCodeAttribute() {
            r2 = this;
            r0 = 0
            return r0
    }

    protected org.objectweb.asm.Label[] getLabels() {
            r2 = this;
            r0 = 0
            org.objectweb.asm.Label[] r0 = new org.objectweb.asm.Label[r0]
            return r0
    }

    protected org.objectweb.asm.Attribute read(org.objectweb.asm.ClassReader r7, int r8, int r9, char[] r10, int r11, org.objectweb.asm.Label[] r12) {
            r6 = this;
            org.objectweb.asm.Attribute r0 = new org.objectweb.asm.Attribute
            r1 = r0
            r2 = r6
            java.lang.String r2 = r2.type
            r1.<init>(r2)
            r13 = r0
            r0 = r13
            r1 = r9
            byte[] r1 = new byte[r1]
            r0.content = r1
            r0 = r7
            byte[] r0 = r0.classFileBuffer
            r1 = r8
            r2 = r13
            byte[] r2 = r2.content
            r3 = 0
            r4 = r9
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r13
            return r0
    }

    protected org.objectweb.asm.ByteVector write(org.objectweb.asm.ClassWriter r5, byte[] r6, int r7, int r8, int r9) {
            r4 = this;
            org.objectweb.asm.ByteVector r0 = new org.objectweb.asm.ByteVector
            r1 = r0
            r2 = r4
            byte[] r2 = r2.content
            r1.<init>(r2)
            return r0
    }

    final int getAttributeCount() {
            r2 = this;
            r0 = 0
            r3 = r0
            r0 = r2
            r4 = r0
        L4:
            r0 = r4
            if (r0 == 0) goto L13
            int r3 = r3 + 1
            r0 = r4
            org.objectweb.asm.Attribute r0 = r0.nextAttribute
            r4 = r0
            goto L4
        L13:
            r0 = r3
            return r0
    }

    final int computeAttributesSize(org.objectweb.asm.SymbolTable r8) {
            r7 = this;
            r0 = 0
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = -1
            r11 = r0
            r0 = -1
            r12 = r0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = 0
            r4 = -1
            r5 = -1
            int r0 = r0.computeAttributesSize(r1, r2, r3, r4, r5)
            return r0
    }

    final int computeAttributesSize(org.objectweb.asm.SymbolTable r10, byte[] r11, int r12, int r13, int r14) {
            r9 = this;
            r0 = r10
            org.objectweb.asm.ClassWriter r0 = r0.classWriter
            r15 = r0
            r0 = 0
            r16 = r0
            r0 = r9
            r17 = r0
        Lc:
            r0 = r17
            if (r0 == 0) goto L3d
            r0 = r10
            r1 = r17
            java.lang.String r1 = r1.type
            int r0 = r0.addConstantUtf8(r1)
            r0 = r16
            r1 = 6
            r2 = r17
            r3 = r15
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            org.objectweb.asm.ByteVector r2 = r2.write(r3, r4, r5, r6, r7)
            int r2 = r2.length
            int r1 = r1 + r2
            int r0 = r0 + r1
            r16 = r0
            r0 = r17
            org.objectweb.asm.Attribute r0 = r0.nextAttribute
            r17 = r0
            goto Lc
        L3d:
            r0 = r16
            return r0
    }

    static int computeAttributesSize(org.objectweb.asm.SymbolTable r3, int r4, int r5) {
            r0 = 0
            r6 = r0
            r0 = r4
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r0 & r1
            if (r0 == 0) goto L1d
            r0 = r3
            int r0 = r0.getMajorVersion()
            r1 = 49
            if (r0 >= r1) goto L1d
            r0 = r3
            java.lang.String r1 = "Synthetic"
            int r0 = r0.addConstantUtf8(r1)
            int r6 = r6 + 6
        L1d:
            r0 = r5
            if (r0 == 0) goto L2b
            r0 = r3
            java.lang.String r1 = "Signature"
            int r0 = r0.addConstantUtf8(r1)
            int r6 = r6 + 8
        L2b:
            r0 = r4
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L3c
            r0 = r3
            java.lang.String r1 = "Deprecated"
            int r0 = r0.addConstantUtf8(r1)
            int r6 = r6 + 6
        L3c:
            r0 = r6
            return r0
    }

    final void putAttributes(org.objectweb.asm.SymbolTable r9, org.objectweb.asm.ByteVector r10) {
            r8 = this;
            r0 = 0
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = -1
            r13 = r0
            r0 = -1
            r14 = r0
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = 0
            r4 = -1
            r5 = -1
            r6 = r10
            r0.putAttributes(r1, r2, r3, r4, r5, r6)
            return
    }

    final void putAttributes(org.objectweb.asm.SymbolTable r8, byte[] r9, int r10, int r11, int r12, org.objectweb.asm.ByteVector r13) {
            r7 = this;
            r0 = r8
            org.objectweb.asm.ClassWriter r0 = r0.classWriter
            r14 = r0
            r0 = r7
            r15 = r0
        L9:
            r0 = r15
            if (r0 == 0) goto L4f
            r0 = r15
            r1 = r14
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.objectweb.asm.ByteVector r0 = r0.write(r1, r2, r3, r4, r5)
            r16 = r0
            r0 = r13
            r1 = r8
            r2 = r15
            java.lang.String r2 = r2.type
            int r1 = r1.addConstantUtf8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r16
            int r1 = r1.length
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r0 = r13
            r1 = r16
            byte[] r1 = r1.data
            r2 = 0
            r3 = r16
            int r3 = r3.length
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
            r0 = r15
            org.objectweb.asm.Attribute r0 = r0.nextAttribute
            r15 = r0
            goto L9
        L4f:
            return
    }

    static void putAttributes(org.objectweb.asm.SymbolTable r4, int r5, int r6, org.objectweb.asm.ByteVector r7) {
            r0 = r5
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r0 & r1
            if (r0 == 0) goto L20
            r0 = r4
            int r0 = r0.getMajorVersion()
            r1 = 49
            if (r0 >= r1) goto L20
            r0 = r7
            r1 = r4
            java.lang.String r2 = "Synthetic"
            int r1 = r1.addConstantUtf8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 0
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
        L20:
            r0 = r6
            if (r0 == 0) goto L37
            r0 = r7
            r1 = r4
            java.lang.String r2 = "Signature"
            int r1 = r1.addConstantUtf8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 2
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r6
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
        L37:
            r0 = r5
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L4d
            r0 = r7
            r1 = r4
            java.lang.String r2 = "Deprecated"
            int r1 = r1.addConstantUtf8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 0
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
        L4d:
            return
    }
}
