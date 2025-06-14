package org.objectweb.asm.commons;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/commons/SerialVersionUIDAdder.SCL.lombok */
public class SerialVersionUIDAdder extends org.objectweb.asm.ClassVisitor {
    private static final java.lang.String CLINIT = "<clinit>";
    private boolean computeSvuid;
    private boolean hasSvuid;
    private int access;
    private java.lang.String name;
    private java.lang.String[] interfaces;
    private java.util.Collection<org.objectweb.asm.commons.SerialVersionUIDAdder.Item> svuidFields;
    private boolean hasStaticInitializer;
    private java.util.Collection<org.objectweb.asm.commons.SerialVersionUIDAdder.Item> svuidConstructors;
    private java.util.Collection<org.objectweb.asm.commons.SerialVersionUIDAdder.Item> svuidMethods;

    /* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/commons/SerialVersionUIDAdder$Item.SCL.lombok */
    private static final class Item implements java.lang.Comparable<org.objectweb.asm.commons.SerialVersionUIDAdder.Item> {
        final java.lang.String name;
        final int access;
        final java.lang.String descriptor;

        Item(java.lang.String r4, int r5, java.lang.String r6) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.name = r1
                r0 = r3
                r1 = r5
                r0.access = r1
                r0 = r3
                r1 = r6
                r0.descriptor = r1
                return
        }

        /* renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(org.objectweb.asm.commons.SerialVersionUIDAdder.Item r4) {
                r3 = this;
                r0 = r3
                java.lang.String r0 = r0.name
                r1 = r4
                java.lang.String r1 = r1.name
                int r0 = r0.compareTo(r1)
                r5 = r0
                r0 = r5
                if (r0 != 0) goto L1c
                r0 = r3
                java.lang.String r0 = r0.descriptor
                r1 = r4
                java.lang.String r1 = r1.descriptor
                int r0 = r0.compareTo(r1)
                r5 = r0
            L1c:
                r0 = r5
                return r0
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                r0 = r4
                boolean r0 = r0 instanceof org.objectweb.asm.commons.SerialVersionUIDAdder.Item
                if (r0 == 0) goto L18
                r0 = r3
                r1 = r4
                org.objectweb.asm.commons.SerialVersionUIDAdder$Item r1 = (org.objectweb.asm.commons.SerialVersionUIDAdder.Item) r1
                int r0 = r0.compareTo2(r1)
                if (r0 != 0) goto L16
                r0 = 1
                goto L17
            L16:
                r0 = 0
            L17:
                return r0
            L18:
                r0 = 0
                return r0
        }

        public int hashCode() {
                r3 = this;
                r0 = r3
                java.lang.String r0 = r0.name
                int r0 = r0.hashCode()
                r1 = r3
                java.lang.String r1 = r1.descriptor
                int r1 = r1.hashCode()
                r0 = r0 ^ r1
                return r0
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(org.objectweb.asm.commons.SerialVersionUIDAdder.Item r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.objectweb.asm.commons.SerialVersionUIDAdder$Item r1 = (org.objectweb.asm.commons.SerialVersionUIDAdder.Item) r1
                int r0 = r0.compareTo2(r1)
                return r0
        }
    }

    public SerialVersionUIDAdder(org.objectweb.asm.ClassVisitor r5) {
            r4 = this;
            r0 = r4
            r1 = 589824(0x90000, float:8.2652E-40)
            r2 = r5
            r0.<init>(r1, r2)
            r0 = r4
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<org.objectweb.asm.commons.SerialVersionUIDAdder> r1 = org.objectweb.asm.commons.SerialVersionUIDAdder.class
            if (r0 == r1) goto L18
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r1.<init>()
            throw r0
        L18:
            return
    }

    protected SerialVersionUIDAdder(int r5, org.objectweb.asm.ClassVisitor r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visit(int r9, int r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String[] r14) {
            r8 = this;
            r0 = r8
            r1 = r10
            r2 = 16384(0x4000, float:2.2959E-41)
            r1 = r1 & r2
            if (r1 != 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            r0.computeSvuid = r1
            r0 = r8
            boolean r0 = r0.computeSvuid
            if (r0 == 0) goto L4f
            r0 = r8
            r1 = r11
            r0.name = r1
            r0 = r8
            r1 = r10
            r0.access = r1
            r0 = r8
            r1 = r14
            java.lang.Object r1 = r1.clone()
            java.lang.String[] r1 = (java.lang.String[]) r1
            r0.interfaces = r1
            r0 = r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.svuidFields = r1
            r0 = r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.svuidConstructors = r1
            r0 = r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.svuidMethods = r1
        L4f:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            super.visit(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public org.objectweb.asm.MethodVisitor visitMethod(int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String[] r12) {
            r7 = this;
            r0 = r7
            boolean r0 = r0.computeSvuid
            if (r0 == 0) goto L61
            java.lang.String r0 = "<clinit>"
            r1 = r9
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L15
            r0 = r7
            r1 = 1
            r0.hasStaticInitializer = r1
        L15:
            r0 = r8
            r1 = 3391(0xd3f, float:4.752E-42)
            r0 = r0 & r1
            r13 = r0
            r0 = r8
            r1 = 2
            r0 = r0 & r1
            if (r0 != 0) goto L61
            java.lang.String r0 = "<init>"
            r1 = r9
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L43
            r0 = r7
            java.util.Collection<org.objectweb.asm.commons.SerialVersionUIDAdder$Item> r0 = r0.svuidConstructors
            org.objectweb.asm.commons.SerialVersionUIDAdder$Item r1 = new org.objectweb.asm.commons.SerialVersionUIDAdder$Item
            r2 = r1
            r3 = r9
            r4 = r13
            r5 = r10
            r2.<init>(r3, r4, r5)
            boolean r0 = r0.add(r1)
            goto L61
        L43:
            java.lang.String r0 = "<clinit>"
            r1 = r9
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L61
            r0 = r7
            java.util.Collection<org.objectweb.asm.commons.SerialVersionUIDAdder$Item> r0 = r0.svuidMethods
            org.objectweb.asm.commons.SerialVersionUIDAdder$Item r1 = new org.objectweb.asm.commons.SerialVersionUIDAdder$Item
            r2 = r1
            r3 = r9
            r4 = r13
            r5 = r10
            r2.<init>(r3, r4, r5)
            boolean r0 = r0.add(r1)
        L61:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.objectweb.asm.MethodVisitor r0 = super.visitMethod(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // org.objectweb.asm.ClassVisitor
    public org.objectweb.asm.FieldVisitor visitField(int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.Object r12) {
            r7 = this;
            r0 = r7
            boolean r0 = r0.computeSvuid
            if (r0 == 0) goto L44
            java.lang.String r0 = "serialVersionUID"
            r1 = r9
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1a
            r0 = r7
            r1 = 0
            r0.computeSvuid = r1
            r0 = r7
            r1 = 1
            r0.hasSvuid = r1
        L1a:
            r0 = r8
            r1 = 2
            r0 = r0 & r1
            if (r0 == 0) goto L28
            r0 = r8
            r1 = 136(0x88, float:1.9E-43)
            r0 = r0 & r1
            if (r0 != 0) goto L44
        L28:
            r0 = r8
            r1 = 223(0xdf, float:3.12E-43)
            r0 = r0 & r1
            r13 = r0
            r0 = r7
            java.util.Collection<org.objectweb.asm.commons.SerialVersionUIDAdder$Item> r0 = r0.svuidFields
            org.objectweb.asm.commons.SerialVersionUIDAdder$Item r1 = new org.objectweb.asm.commons.SerialVersionUIDAdder$Item
            r2 = r1
            r3 = r9
            r4 = r13
            r5 = r10
            r2.<init>(r3, r4, r5)
            boolean r0 = r0.add(r1)
        L44:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.objectweb.asm.FieldVisitor r0 = super.visitField(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitInnerClass(java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10) {
            r6 = this;
            r0 = r6
            java.lang.String r0 = r0.name
            if (r0 == 0) goto L18
            r0 = r6
            java.lang.String r0 = r0.name
            r1 = r7
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L18
            r0 = r6
            r1 = r10
            r0.access = r1
        L18:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            super.visitInnerClass(r1, r2, r3, r4)
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitEnd() {
            r5 = this;
            r0 = r5
            boolean r0 = r0.computeSvuid
            if (r0 == 0) goto L39
            r0 = r5
            boolean r0 = r0.hasSvuid
            if (r0 != 0) goto L39
            r0 = r5
            r1 = r5
            long r1 = r1.computeSVUID()     // Catch: java.io.IOException -> L19
            r0.addSVUID(r1)     // Catch: java.io.IOException -> L19
            goto L39
        L19:
            r6 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Error while computing SVUID for "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.String r3 = r3.name
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r6
            r1.<init>(r2, r3)
            throw r0
        L39:
            r0 = r5
            super.visitEnd()
            return
    }

    public boolean hasSVUID() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.hasSvuid
            return r0
    }

    protected void addSVUID(long r9) {
            r8 = this;
            r0 = r8
            r1 = 24
            java.lang.String r2 = "serialVersionUID"
            java.lang.String r3 = "J"
            r4 = 0
            r5 = r9
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            org.objectweb.asm.FieldVisitor r0 = super.visitField(r1, r2, r3, r4, r5)
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L18
            r0 = r11
            r0.visitEnd()
        L18:
            return
    }

    protected long computeSVUID() throws java.io.IOException {
            r5 = this;
            r0 = 0
            r6 = r0
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = r0
            r1.<init>()
            r8 = r0
            java.io.DataOutputStream r0 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> L125
            r1 = r0
            r2 = r8
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L125
            r9 = r0
            r0 = r9
            r1 = r5
            java.lang.String r1 = r1.name     // Catch: java.lang.Throwable -> L10a java.lang.Throwable -> L125
            r2 = 47
            r3 = 46
            java.lang.String r1 = r1.replace(r2, r3)     // Catch: java.lang.Throwable -> L10a java.lang.Throwable -> L125
            r0.writeUTF(r1)     // Catch: java.lang.Throwable -> L10a java.lang.Throwable -> L125
            r0 = r5
            int r0 = r0.access     // Catch: java.lang.Throwable -> L10a java.lang.Throwable -> L125
            r10 = r0
            r0 = r10
            r1 = 512(0x200, float:7.175E-43)
            r0 = r0 & r1
            if (r0 == 0) goto L50
            r0 = r5
            java.util.Collection<org.objectweb.asm.commons.SerialVersionUIDAdder$Item> r0 = r0.svuidMethods     // Catch: java.lang.Throwable -> L10a java.lang.Throwable -> L125
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L10a java.lang.Throwable -> L125
            if (r0 == 0) goto L48
            r0 = r10
            r1 = -1025(0xfffffffffffffbff, float:NaN)
            r0 = r0 & r1
            goto L4e
        L48:
            r0 = r10
            r1 = 1024(0x400, float:1.435E-42)
            r0 = r0 | r1
        L4e:
            r10 = r0
        L50:
            r0 = r9
            r1 = r10
            r2 = 1553(0x611, float:2.176E-42)
            r1 = r1 & r2
            r0.writeInt(r1)     // Catch: java.lang.Throwable -> L10a java.lang.Throwable -> L125
            r0 = r5
            java.lang.String[] r0 = r0.interfaces     // Catch: java.lang.Throwable -> L10a java.lang.Throwable -> L125
            java.util.Arrays.sort(r0)     // Catch: java.lang.Throwable -> L10a java.lang.Throwable -> L125
            r0 = r5
            java.lang.String[] r0 = r0.interfaces     // Catch: java.lang.Throwable -> L10a java.lang.Throwable -> L125
            r11 = r0
            r0 = r11
            int r0 = r0.length     // Catch: java.lang.Throwable -> L10a java.lang.Throwable -> L125
            r12 = r0
            r0 = 0
            r13 = r0
        L70:
            r0 = r13
            r1 = r12
            if (r0 >= r1) goto L92
            r0 = r11
            r1 = r13
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L10a java.lang.Throwable -> L125
            r14 = r0
            r0 = r9
            r1 = r14
            r2 = 47
            r3 = 46
            java.lang.String r1 = r1.replace(r2, r3)     // Catch: java.lang.Throwable -> L10a java.lang.Throwable -> L125
            r0.writeUTF(r1)     // Catch: java.lang.Throwable -> L10a java.lang.Throwable -> L125
            int r13 = r13 + 1
            goto L70
        L92:
            r0 = r5
            java.util.Collection<org.objectweb.asm.commons.SerialVersionUIDAdder$Item> r0 = r0.svuidFields     // Catch: java.lang.Throwable -> L10a java.lang.Throwable -> L125
            r1 = r9
            r2 = 0
            writeItems(r0, r1, r2)     // Catch: java.lang.Throwable -> L10a java.lang.Throwable -> L125
            r0 = r5
            boolean r0 = r0.hasStaticInitializer     // Catch: java.lang.Throwable -> L10a java.lang.Throwable -> L125
            if (r0 == 0) goto Lb8
            r0 = r9
            java.lang.String r1 = "<clinit>"
            r0.writeUTF(r1)     // Catch: java.lang.Throwable -> L10a java.lang.Throwable -> L125
            r0 = r9
            r1 = 8
            r0.writeInt(r1)     // Catch: java.lang.Throwable -> L10a java.lang.Throwable -> L125
            r0 = r9
            java.lang.String r1 = "()V"
            r0.writeUTF(r1)     // Catch: java.lang.Throwable -> L10a java.lang.Throwable -> L125
        Lb8:
            r0 = r5
            java.util.Collection<org.objectweb.asm.commons.SerialVersionUIDAdder$Item> r0 = r0.svuidConstructors     // Catch: java.lang.Throwable -> L10a java.lang.Throwable -> L125
            r1 = r9
            r2 = 1
            writeItems(r0, r1, r2)     // Catch: java.lang.Throwable -> L10a java.lang.Throwable -> L125
            r0 = r5
            java.util.Collection<org.objectweb.asm.commons.SerialVersionUIDAdder$Item> r0 = r0.svuidMethods     // Catch: java.lang.Throwable -> L10a java.lang.Throwable -> L125
            r1 = r9
            r2 = 1
            writeItems(r0, r1, r2)     // Catch: java.lang.Throwable -> L10a java.lang.Throwable -> L125
            r0 = r9
            r0.flush()     // Catch: java.lang.Throwable -> L10a java.lang.Throwable -> L125
            r0 = r5
            r1 = r8
            byte[] r1 = r1.toByteArray()     // Catch: java.lang.Throwable -> L10a java.lang.Throwable -> L125
            byte[] r0 = r0.computeSHAdigest(r1)     // Catch: java.lang.Throwable -> L10a java.lang.Throwable -> L125
            r11 = r0
            r0 = r11
            int r0 = r0.length     // Catch: java.lang.Throwable -> L10a java.lang.Throwable -> L125
            r1 = 8
            int r0 = java.lang.Math.min(r0, r1)     // Catch: java.lang.Throwable -> L10a java.lang.Throwable -> L125
            r1 = 1
            int r0 = r0 - r1
            r12 = r0
        Le7:
            r0 = r12
            if (r0 < 0) goto L102
            r0 = r6
            r1 = 8
            long r0 = r0 << r1
            r1 = r11
            r2 = r12
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L10a java.lang.Throwable -> L125
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L10a java.lang.Throwable -> L125
            long r0 = r0 | r1
            r6 = r0
            int r12 = r12 + (-1)
            goto Le7
        L102:
            r0 = r9
            r0.close()     // Catch: java.lang.Throwable -> L125
            goto L11e
        L10a:
            r10 = move-exception
            r0 = r9
            r0.close()     // Catch: java.lang.Throwable -> L114 java.lang.Throwable -> L125
            goto L11b
        L114:
            r11 = move-exception
            r0 = r10
            r1 = r11
        L11b:
            r0 = r10
            throw r0     // Catch: java.lang.Throwable -> L125
        L11e:
            r0 = r8
            r0.close()
            goto L138
        L125:
            r9 = move-exception
            r0 = r8
            r0.close()     // Catch: java.lang.Throwable -> L12e
            goto L135
        L12e:
            r10 = move-exception
            r0 = r9
            r1 = r10
        L135:
            r0 = r9
            throw r0
        L138:
            r0 = r6
            return r0
    }

    protected byte[] computeSHAdigest(byte[] r5) {
            r4 = this;
            java.lang.String r0 = "SHA"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> La
            r1 = r5
            byte[] r0 = r0.digest(r1)     // Catch: java.security.NoSuchAlgorithmException -> La
            return r0
        La:
            r6 = move-exception
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            throw r0
    }

    private static void writeItems(java.util.Collection<org.objectweb.asm.commons.SerialVersionUIDAdder.Item> r5, java.io.DataOutput r6, boolean r7) throws java.io.IOException {
            r0 = r5
            r1 = 0
            org.objectweb.asm.commons.SerialVersionUIDAdder$Item[] r1 = new org.objectweb.asm.commons.SerialVersionUIDAdder.Item[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            org.objectweb.asm.commons.SerialVersionUIDAdder$Item[] r0 = (org.objectweb.asm.commons.SerialVersionUIDAdder.Item[]) r0
            r8 = r0
            r0 = r8
            java.util.Arrays.sort(r0)
            r0 = r8
            r9 = r0
            r0 = r9
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r11 = r0
        L1d:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L65
            r0 = r9
            r1 = r11
            r0 = r0[r1]
            r12 = r0
            r0 = r6
            r1 = r12
            java.lang.String r1 = r1.name
            r0.writeUTF(r1)
            r0 = r6
            r1 = r12
            int r1 = r1.access
            r0.writeInt(r1)
            r0 = r6
            r1 = r7
            if (r1 == 0) goto L55
            r1 = r12
            java.lang.String r1 = r1.descriptor
            r2 = 47
            r3 = 46
            java.lang.String r1 = r1.replace(r2, r3)
            goto L5a
        L55:
            r1 = r12
            java.lang.String r1 = r1.descriptor
        L5a:
            r0.writeUTF(r1)
            int r11 = r11 + 1
            goto L1d
        L65:
            return
    }
}
