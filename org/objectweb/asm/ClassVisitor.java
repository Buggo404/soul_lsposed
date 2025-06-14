package org.objectweb.asm;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/ClassVisitor.SCL.lombok */
public abstract class ClassVisitor {
    protected final int api;

    /* renamed from: cv */
    protected org.objectweb.asm.ClassVisitor f624cv;

    protected ClassVisitor(int r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            r0.<init>(r1, r2)
            return
    }

    protected ClassVisitor(int r6, org.objectweb.asm.ClassVisitor r7) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r6
            r1 = 589824(0x90000, float:8.2652E-40)
            if (r0 == r1) goto L49
            r0 = r6
            r1 = 524288(0x80000, float:7.34684E-40)
            if (r0 == r1) goto L49
            r0 = r6
            r1 = 458752(0x70000, float:6.42848E-40)
            if (r0 == r1) goto L49
            r0 = r6
            r1 = 393216(0x60000, float:5.51013E-40)
            if (r0 == r1) goto L49
            r0 = r6
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 == r1) goto L49
            r0 = r6
            r1 = 262144(0x40000, float:3.67342E-40)
            if (r0 == r1) goto L49
            r0 = r6
            r1 = 17432576(0x10a0000, float:2.5346597E-38)
            if (r0 == r1) goto L49
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Unsupported api "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L49:
            r0 = r6
            r1 = 17432576(0x10a0000, float:2.5346597E-38)
            if (r0 != r1) goto L53
            r0 = r5
            org.objectweb.asm.Constants.checkAsmExperimental(r0)
        L53:
            r0 = r5
            r1 = r6
            r0.api = r1
            r0 = r5
            r1 = r7
            r0.f624cv = r1
            return
    }

    public org.objectweb.asm.ClassVisitor getDelegate() {
            r2 = this;
            r0 = r2
            org.objectweb.asm.ClassVisitor r0 = r0.f624cv
            return r0
    }

    public void visit(int r9, int r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String[] r14) {
            r8 = this;
            r0 = r8
            int r0 = r0.api
            r1 = 524288(0x80000, float:7.34684E-40)
            if (r0 >= r1) goto L1a
            r0 = r10
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L1a
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Records requires ASM8"
            r1.<init>(r2)
            throw r0
        L1a:
            r0 = r8
            org.objectweb.asm.ClassVisitor r0 = r0.f624cv
            if (r0 == 0) goto L31
            r0 = r8
            org.objectweb.asm.ClassVisitor r0 = r0.f624cv
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.visit(r1, r2, r3, r4, r5, r6)
        L31:
            return
    }

    public void visitSource(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.ClassVisitor r0 = r0.f624cv
            if (r0 == 0) goto L10
            r0 = r4
            org.objectweb.asm.ClassVisitor r0 = r0.f624cv
            r1 = r5
            r2 = r6
            r0.visitSource(r1, r2)
        L10:
            return
    }

    public org.objectweb.asm.ModuleVisitor visitModule(java.lang.String r6, int r7, java.lang.String r8) {
            r5 = this;
            r0 = r5
            int r0 = r0.api
            r1 = 393216(0x60000, float:5.51013E-40)
            if (r0 >= r1) goto L13
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Module requires ASM6"
            r1.<init>(r2)
            throw r0
        L13:
            r0 = r5
            org.objectweb.asm.ClassVisitor r0 = r0.f624cv
            if (r0 == 0) goto L25
            r0 = r5
            org.objectweb.asm.ClassVisitor r0 = r0.f624cv
            r1 = r6
            r2 = r7
            r3 = r8
            org.objectweb.asm.ModuleVisitor r0 = r0.visitModule(r1, r2, r3)
            return r0
        L25:
            r0 = 0
            return r0
    }

    public void visitNestHost(java.lang.String r5) {
            r4 = this;
            r0 = r4
            int r0 = r0.api
            r1 = 458752(0x70000, float:6.42848E-40)
            if (r0 >= r1) goto L13
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "NestHost requires ASM7"
            r1.<init>(r2)
            throw r0
        L13:
            r0 = r4
            org.objectweb.asm.ClassVisitor r0 = r0.f624cv
            if (r0 == 0) goto L22
            r0 = r4
            org.objectweb.asm.ClassVisitor r0 = r0.f624cv
            r1 = r5
            r0.visitNestHost(r1)
        L22:
            return
    }

    public void visitOuterClass(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r5 = this;
            r0 = r5
            org.objectweb.asm.ClassVisitor r0 = r0.f624cv
            if (r0 == 0) goto L11
            r0 = r5
            org.objectweb.asm.ClassVisitor r0 = r0.f624cv
            r1 = r6
            r2 = r7
            r3 = r8
            r0.visitOuterClass(r1, r2, r3)
        L11:
            return
    }

    public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String r5, boolean r6) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.ClassVisitor r0 = r0.f624cv
            if (r0 == 0) goto L11
            r0 = r4
            org.objectweb.asm.ClassVisitor r0 = r0.f624cv
            r1 = r5
            r2 = r6
            org.objectweb.asm.AnnotationVisitor r0 = r0.visitAnnotation(r1, r2)
            return r0
        L11:
            r0 = 0
            return r0
    }

    public org.objectweb.asm.AnnotationVisitor visitTypeAnnotation(int r7, org.objectweb.asm.TypePath r8, java.lang.String r9, boolean r10) {
            r6 = this;
            r0 = r6
            int r0 = r0.api
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 >= r1) goto L13
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "TypeAnnotation requires ASM5"
            r1.<init>(r2)
            throw r0
        L13:
            r0 = r6
            org.objectweb.asm.ClassVisitor r0 = r0.f624cv
            if (r0 == 0) goto L27
            r0 = r6
            org.objectweb.asm.ClassVisitor r0 = r0.f624cv
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.objectweb.asm.AnnotationVisitor r0 = r0.visitTypeAnnotation(r1, r2, r3, r4)
            return r0
        L27:
            r0 = 0
            return r0
    }

    public void visitAttribute(org.objectweb.asm.Attribute r4) {
            r3 = this;
            r0 = r3
            org.objectweb.asm.ClassVisitor r0 = r0.f624cv
            if (r0 == 0) goto Lf
            r0 = r3
            org.objectweb.asm.ClassVisitor r0 = r0.f624cv
            r1 = r4
            r0.visitAttribute(r1)
        Lf:
            return
    }

    public void visitNestMember(java.lang.String r5) {
            r4 = this;
            r0 = r4
            int r0 = r0.api
            r1 = 458752(0x70000, float:6.42848E-40)
            if (r0 >= r1) goto L13
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "NestMember requires ASM7"
            r1.<init>(r2)
            throw r0
        L13:
            r0 = r4
            org.objectweb.asm.ClassVisitor r0 = r0.f624cv
            if (r0 == 0) goto L22
            r0 = r4
            org.objectweb.asm.ClassVisitor r0 = r0.f624cv
            r1 = r5
            r0.visitNestMember(r1)
        L22:
            return
    }

    public void visitPermittedSubclass(java.lang.String r5) {
            r4 = this;
            r0 = r4
            int r0 = r0.api
            r1 = 589824(0x90000, float:8.2652E-40)
            if (r0 >= r1) goto L13
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "PermittedSubclasses requires ASM9"
            r1.<init>(r2)
            throw r0
        L13:
            r0 = r4
            org.objectweb.asm.ClassVisitor r0 = r0.f624cv
            if (r0 == 0) goto L22
            r0 = r4
            org.objectweb.asm.ClassVisitor r0 = r0.f624cv
            r1 = r5
            r0.visitPermittedSubclass(r1)
        L22:
            return
    }

    public void visitInnerClass(java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10) {
            r6 = this;
            r0 = r6
            org.objectweb.asm.ClassVisitor r0 = r0.f624cv
            if (r0 == 0) goto L13
            r0 = r6
            org.objectweb.asm.ClassVisitor r0 = r0.f624cv
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.visitInnerClass(r1, r2, r3, r4)
        L13:
            return
    }

    public org.objectweb.asm.RecordComponentVisitor visitRecordComponent(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r5 = this;
            r0 = r5
            int r0 = r0.api
            r1 = 524288(0x80000, float:7.34684E-40)
            if (r0 >= r1) goto L13
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Record requires ASM8"
            r1.<init>(r2)
            throw r0
        L13:
            r0 = r5
            org.objectweb.asm.ClassVisitor r0 = r0.f624cv
            if (r0 == 0) goto L25
            r0 = r5
            org.objectweb.asm.ClassVisitor r0 = r0.f624cv
            r1 = r6
            r2 = r7
            r3 = r8
            org.objectweb.asm.RecordComponentVisitor r0 = r0.visitRecordComponent(r1, r2, r3)
            return r0
        L25:
            r0 = 0
            return r0
    }

    public org.objectweb.asm.FieldVisitor visitField(int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.Object r12) {
            r7 = this;
            r0 = r7
            org.objectweb.asm.ClassVisitor r0 = r0.f624cv
            if (r0 == 0) goto L16
            r0 = r7
            org.objectweb.asm.ClassVisitor r0 = r0.f624cv
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.objectweb.asm.FieldVisitor r0 = r0.visitField(r1, r2, r3, r4, r5)
            return r0
        L16:
            r0 = 0
            return r0
    }

    public org.objectweb.asm.MethodVisitor visitMethod(int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String[] r12) {
            r7 = this;
            r0 = r7
            org.objectweb.asm.ClassVisitor r0 = r0.f624cv
            if (r0 == 0) goto L16
            r0 = r7
            org.objectweb.asm.ClassVisitor r0 = r0.f624cv
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.objectweb.asm.MethodVisitor r0 = r0.visitMethod(r1, r2, r3, r4, r5)
            return r0
        L16:
            r0 = 0
            return r0
    }

    public void visitEnd() {
            r2 = this;
            r0 = r2
            org.objectweb.asm.ClassVisitor r0 = r0.f624cv
            if (r0 == 0) goto Le
            r0 = r2
            org.objectweb.asm.ClassVisitor r0 = r0.f624cv
            r0.visitEnd()
        Le:
            return
    }
}
