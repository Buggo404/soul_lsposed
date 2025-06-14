package org.objectweb.asm.commons;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/commons/ClassRemapper.SCL.lombok */
public class ClassRemapper extends org.objectweb.asm.ClassVisitor {
    protected final org.objectweb.asm.commons.Remapper remapper;
    protected java.lang.String className;

    public ClassRemapper(org.objectweb.asm.ClassVisitor r6, org.objectweb.asm.commons.Remapper r7) {
            r5 = this;
            r0 = r5
            r1 = 589824(0x90000, float:8.2652E-40)
            r2 = r6
            r3 = r7
            r0.<init>(r1, r2, r3)
            return
    }

    protected ClassRemapper(int r5, org.objectweb.asm.ClassVisitor r6, org.objectweb.asm.commons.Remapper r7) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r7
            r0.remapper = r1
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visit(int r10, int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String[] r15) {
            r9 = this;
            r0 = r9
            r1 = r12
            r0.className = r1
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r9
            org.objectweb.asm.commons.Remapper r3 = r3.remapper
            r4 = r12
            java.lang.String r3 = r3.mapType(r4)
            r4 = r9
            org.objectweb.asm.commons.Remapper r4 = r4.remapper
            r5 = r13
            r6 = 0
            java.lang.String r4 = r4.mapSignature(r5, r6)
            r5 = r9
            org.objectweb.asm.commons.Remapper r5 = r5.remapper
            r6 = r14
            java.lang.String r5 = r5.mapType(r6)
            r6 = r15
            if (r6 != 0) goto L2c
            r6 = 0
            goto L35
        L2c:
            r6 = r9
            org.objectweb.asm.commons.Remapper r6 = r6.remapper
            r7 = r15
            java.lang.String[] r6 = r6.mapTypes(r7)
        L35:
            super.visit(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public org.objectweb.asm.ModuleVisitor visitModule(java.lang.String r6, int r7, java.lang.String r8) {
            r5 = this;
            r0 = r5
            r1 = r5
            org.objectweb.asm.commons.Remapper r1 = r1.remapper
            r2 = r6
            java.lang.String r1 = r1.mapModuleName(r2)
            r2 = r7
            r3 = r8
            org.objectweb.asm.ModuleVisitor r0 = super.visitModule(r1, r2, r3)
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L19
            r0 = 0
            goto L1f
        L19:
            r0 = r5
            r1 = r9
            org.objectweb.asm.ModuleVisitor r0 = r0.createModuleRemapper(r1)
        L1f:
            return r0
    }

    @Override // org.objectweb.asm.ClassVisitor
    public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String r5, boolean r6) {
            r4 = this;
            r0 = r4
            r1 = r4
            org.objectweb.asm.commons.Remapper r1 = r1.remapper
            r2 = r5
            java.lang.String r1 = r1.mapDesc(r2)
            r2 = r6
            org.objectweb.asm.AnnotationVisitor r0 = super.visitAnnotation(r1, r2)
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L16
            r0 = 0
            goto L1c
        L16:
            r0 = r4
            r1 = r5
            r2 = r7
            org.objectweb.asm.AnnotationVisitor r0 = r0.createAnnotationRemapper(r1, r2)
        L1c:
            return r0
    }

    @Override // org.objectweb.asm.ClassVisitor
    public org.objectweb.asm.AnnotationVisitor visitTypeAnnotation(int r7, org.objectweb.asm.TypePath r8, java.lang.String r9, boolean r10) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r6
            org.objectweb.asm.commons.Remapper r3 = r3.remapper
            r4 = r9
            java.lang.String r3 = r3.mapDesc(r4)
            r4 = r10
            org.objectweb.asm.AnnotationVisitor r0 = super.visitTypeAnnotation(r1, r2, r3, r4)
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L1b
            r0 = 0
            goto L22
        L1b:
            r0 = r6
            r1 = r9
            r2 = r11
            org.objectweb.asm.AnnotationVisitor r0 = r0.createAnnotationRemapper(r1, r2)
        L22:
            return r0
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitAttribute(org.objectweb.asm.Attribute r7) {
            r6 = this;
            r0 = r7
            boolean r0 = r0 instanceof org.objectweb.asm.commons.ModuleHashesAttribute
            if (r0 == 0) goto L40
            r0 = r7
            org.objectweb.asm.commons.ModuleHashesAttribute r0 = (org.objectweb.asm.commons.ModuleHashesAttribute) r0
            r8 = r0
            r0 = r8
            java.util.List<java.lang.String> r0 = r0.modules
            r9 = r0
            r0 = 0
            r10 = r0
        L14:
            r0 = r10
            r1 = r9
            int r1 = r1.size()
            if (r0 >= r1) goto L40
            r0 = r9
            r1 = r10
            r2 = r6
            org.objectweb.asm.commons.Remapper r2 = r2.remapper
            r3 = r9
            r4 = r10
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r2 = r2.mapModuleName(r3)
            java.lang.Object r0 = r0.set(r1, r2)
            int r10 = r10 + 1
            goto L14
        L40:
            r0 = r6
            r1 = r7
            super.visitAttribute(r1)
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public org.objectweb.asm.RecordComponentVisitor visitRecordComponent(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r7 = this;
            r0 = r7
            r1 = r7
            org.objectweb.asm.commons.Remapper r1 = r1.remapper
            r2 = r7
            java.lang.String r2 = r2.className
            r3 = r8
            r4 = r9
            java.lang.String r1 = r1.mapRecordComponentName(r2, r3, r4)
            r2 = r7
            org.objectweb.asm.commons.Remapper r2 = r2.remapper
            r3 = r9
            java.lang.String r2 = r2.mapDesc(r3)
            r3 = r7
            org.objectweb.asm.commons.Remapper r3 = r3.remapper
            r4 = r10
            r5 = 1
            java.lang.String r3 = r3.mapSignature(r4, r5)
            org.objectweb.asm.RecordComponentVisitor r0 = super.visitRecordComponent(r1, r2, r3)
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L2d
            r0 = 0
            goto L33
        L2d:
            r0 = r7
            r1 = r11
            org.objectweb.asm.RecordComponentVisitor r0 = r0.createRecordComponentRemapper(r1)
        L33:
            return r0
    }

    @Override // org.objectweb.asm.ClassVisitor
    public org.objectweb.asm.FieldVisitor visitField(int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.Object r13) {
            r8 = this;
            r0 = r8
            r1 = r9
            r2 = r8
            org.objectweb.asm.commons.Remapper r2 = r2.remapper
            r3 = r8
            java.lang.String r3 = r3.className
            r4 = r10
            r5 = r11
            java.lang.String r2 = r2.mapFieldName(r3, r4, r5)
            r3 = r8
            org.objectweb.asm.commons.Remapper r3 = r3.remapper
            r4 = r11
            java.lang.String r3 = r3.mapDesc(r4)
            r4 = r8
            org.objectweb.asm.commons.Remapper r4 = r4.remapper
            r5 = r12
            r6 = 1
            java.lang.String r4 = r4.mapSignature(r5, r6)
            r5 = r13
            if (r5 != 0) goto L2a
            r5 = 0
            goto L33
        L2a:
            r5 = r8
            org.objectweb.asm.commons.Remapper r5 = r5.remapper
            r6 = r13
            java.lang.Object r5 = r5.mapValue(r6)
        L33:
            org.objectweb.asm.FieldVisitor r0 = super.visitField(r1, r2, r3, r4, r5)
            r14 = r0
            r0 = r14
            if (r0 != 0) goto L41
            r0 = 0
            goto L47
        L41:
            r0 = r8
            r1 = r14
            org.objectweb.asm.FieldVisitor r0 = r0.createFieldRemapper(r1)
        L47:
            return r0
    }

    @Override // org.objectweb.asm.ClassVisitor
    public org.objectweb.asm.MethodVisitor visitMethod(int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String[] r13) {
            r8 = this;
            r0 = r8
            org.objectweb.asm.commons.Remapper r0 = r0.remapper
            r1 = r11
            java.lang.String r0 = r0.mapMethodDesc(r1)
            r14 = r0
            r0 = r8
            r1 = r9
            r2 = r8
            org.objectweb.asm.commons.Remapper r2 = r2.remapper
            r3 = r8
            java.lang.String r3 = r3.className
            r4 = r10
            r5 = r11
            java.lang.String r2 = r2.mapMethodName(r3, r4, r5)
            r3 = r14
            r4 = r8
            org.objectweb.asm.commons.Remapper r4 = r4.remapper
            r5 = r12
            r6 = 0
            java.lang.String r4 = r4.mapSignature(r5, r6)
            r5 = r13
            if (r5 != 0) goto L2e
            r5 = 0
            goto L37
        L2e:
            r5 = r8
            org.objectweb.asm.commons.Remapper r5 = r5.remapper
            r6 = r13
            java.lang.String[] r5 = r5.mapTypes(r6)
        L37:
            org.objectweb.asm.MethodVisitor r0 = super.visitMethod(r1, r2, r3, r4, r5)
            r15 = r0
            r0 = r15
            if (r0 != 0) goto L45
            r0 = 0
            goto L4b
        L45:
            r0 = r8
            r1 = r15
            org.objectweb.asm.MethodVisitor r0 = r0.createMethodRemapper(r1)
        L4b:
            return r0
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitInnerClass(java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12) {
            r8 = this;
            r0 = r8
            r1 = r8
            org.objectweb.asm.commons.Remapper r1 = r1.remapper
            r2 = r9
            java.lang.String r1 = r1.mapType(r2)
            r2 = r10
            if (r2 != 0) goto L11
            r2 = 0
            goto L19
        L11:
            r2 = r8
            org.objectweb.asm.commons.Remapper r2 = r2.remapper
            r3 = r10
            java.lang.String r2 = r2.mapType(r3)
        L19:
            r3 = r11
            if (r3 != 0) goto L21
            r3 = 0
            goto L2b
        L21:
            r3 = r8
            org.objectweb.asm.commons.Remapper r3 = r3.remapper
            r4 = r9
            r5 = r10
            r6 = r11
            java.lang.String r3 = r3.mapInnerClassName(r4, r5, r6)
        L2b:
            r4 = r12
            super.visitInnerClass(r1, r2, r3, r4)
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitOuterClass(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r7 = this;
            r0 = r7
            r1 = r7
            org.objectweb.asm.commons.Remapper r1 = r1.remapper
            r2 = r8
            java.lang.String r1 = r1.mapType(r2)
            r2 = r9
            if (r2 != 0) goto L11
            r2 = 0
            goto L1b
        L11:
            r2 = r7
            org.objectweb.asm.commons.Remapper r2 = r2.remapper
            r3 = r8
            r4 = r9
            r5 = r10
            java.lang.String r2 = r2.mapMethodName(r3, r4, r5)
        L1b:
            r3 = r10
            if (r3 != 0) goto L23
            r3 = 0
            goto L2b
        L23:
            r3 = r7
            org.objectweb.asm.commons.Remapper r3 = r3.remapper
            r4 = r10
            java.lang.String r3 = r3.mapMethodDesc(r4)
        L2b:
            super.visitOuterClass(r1, r2, r3)
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitNestHost(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = r4
            org.objectweb.asm.commons.Remapper r1 = r1.remapper
            r2 = r5
            java.lang.String r1 = r1.mapType(r2)
            super.visitNestHost(r1)
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitNestMember(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = r4
            org.objectweb.asm.commons.Remapper r1 = r1.remapper
            r2 = r5
            java.lang.String r1 = r1.mapType(r2)
            super.visitNestMember(r1)
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitPermittedSubclass(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = r4
            org.objectweb.asm.commons.Remapper r1 = r1.remapper
            r2 = r5
            java.lang.String r1 = r1.mapType(r2)
            super.visitPermittedSubclass(r1)
            return
    }

    protected org.objectweb.asm.FieldVisitor createFieldRemapper(org.objectweb.asm.FieldVisitor r7) {
            r6 = this;
            org.objectweb.asm.commons.FieldRemapper r0 = new org.objectweb.asm.commons.FieldRemapper
            r1 = r0
            r2 = r6
            int r2 = r2.api
            r3 = r7
            r4 = r6
            org.objectweb.asm.commons.Remapper r4 = r4.remapper
            r1.<init>(r2, r3, r4)
            return r0
    }

    protected org.objectweb.asm.MethodVisitor createMethodRemapper(org.objectweb.asm.MethodVisitor r7) {
            r6 = this;
            org.objectweb.asm.commons.MethodRemapper r0 = new org.objectweb.asm.commons.MethodRemapper
            r1 = r0
            r2 = r6
            int r2 = r2.api
            r3 = r7
            r4 = r6
            org.objectweb.asm.commons.Remapper r4 = r4.remapper
            r1.<init>(r2, r3, r4)
            return r0
    }

    @java.lang.Deprecated
    protected org.objectweb.asm.AnnotationVisitor createAnnotationRemapper(org.objectweb.asm.AnnotationVisitor r8) {
            r7 = this;
            org.objectweb.asm.commons.AnnotationRemapper r0 = new org.objectweb.asm.commons.AnnotationRemapper
            r1 = r0
            r2 = r7
            int r2 = r2.api
            r3 = 0
            r4 = r8
            r5 = r7
            org.objectweb.asm.commons.Remapper r5 = r5.remapper
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    protected org.objectweb.asm.AnnotationVisitor createAnnotationRemapper(java.lang.String r8, org.objectweb.asm.AnnotationVisitor r9) {
            r7 = this;
            org.objectweb.asm.commons.AnnotationRemapper r0 = new org.objectweb.asm.commons.AnnotationRemapper
            r1 = r0
            r2 = r7
            int r2 = r2.api
            r3 = r8
            r4 = r9
            r5 = r7
            org.objectweb.asm.commons.Remapper r5 = r5.remapper
            r1.<init>(r2, r3, r4, r5)
            r1 = r7
            r2 = r9
            org.objectweb.asm.AnnotationVisitor r1 = r1.createAnnotationRemapper(r2)
            org.objectweb.asm.AnnotationVisitor r0 = r0.orDeprecatedValue(r1)
            return r0
    }

    protected org.objectweb.asm.ModuleVisitor createModuleRemapper(org.objectweb.asm.ModuleVisitor r7) {
            r6 = this;
            org.objectweb.asm.commons.ModuleRemapper r0 = new org.objectweb.asm.commons.ModuleRemapper
            r1 = r0
            r2 = r6
            int r2 = r2.api
            r3 = r7
            r4 = r6
            org.objectweb.asm.commons.Remapper r4 = r4.remapper
            r1.<init>(r2, r3, r4)
            return r0
    }

    protected org.objectweb.asm.RecordComponentVisitor createRecordComponentRemapper(org.objectweb.asm.RecordComponentVisitor r7) {
            r6 = this;
            org.objectweb.asm.commons.RecordComponentRemapper r0 = new org.objectweb.asm.commons.RecordComponentRemapper
            r1 = r0
            r2 = r6
            int r2 = r2.api
            r3 = r7
            r4 = r6
            org.objectweb.asm.commons.Remapper r4 = r4.remapper
            r1.<init>(r2, r3, r4)
            return r0
    }
}
