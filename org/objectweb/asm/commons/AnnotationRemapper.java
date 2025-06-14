package org.objectweb.asm.commons;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/commons/AnnotationRemapper.SCL.lombok */
public class AnnotationRemapper extends org.objectweb.asm.AnnotationVisitor {
    protected final java.lang.String descriptor;
    protected final org.objectweb.asm.commons.Remapper remapper;

    @java.lang.Deprecated
    public AnnotationRemapper(org.objectweb.asm.AnnotationVisitor r6, org.objectweb.asm.commons.Remapper r7) {
            r5 = this;
            r0 = r5
            r1 = 0
            r2 = r6
            r3 = r7
            r0.<init>(r1, r2, r3)
            return
    }

    public AnnotationRemapper(java.lang.String r7, org.objectweb.asm.AnnotationVisitor r8, org.objectweb.asm.commons.Remapper r9) {
            r6 = this;
            r0 = r6
            r1 = 589824(0x90000, float:8.2652E-40)
            r2 = r7
            r3 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @java.lang.Deprecated
    protected AnnotationRemapper(int r7, org.objectweb.asm.AnnotationVisitor r8, org.objectweb.asm.commons.Remapper r9) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = 0
            r3 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4)
            return
    }

    protected AnnotationRemapper(int r5, java.lang.String r6, org.objectweb.asm.AnnotationVisitor r7, org.objectweb.asm.commons.Remapper r8) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r7
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r6
            r0.descriptor = r1
            r0 = r4
            r1 = r8
            r0.remapper = r1
            return
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public void visit(java.lang.String r6, java.lang.Object r7) {
            r5 = this;
            r0 = r5
            r1 = r5
            r2 = r6
            java.lang.String r1 = r1.mapAnnotationAttributeName(r2)
            r2 = r5
            org.objectweb.asm.commons.Remapper r2 = r2.remapper
            r3 = r7
            java.lang.Object r2 = r2.mapValue(r3)
            super.visit(r1, r2)
            return
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public void visitEnum(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r5 = this;
            r0 = r5
            r1 = r5
            r2 = r6
            java.lang.String r1 = r1.mapAnnotationAttributeName(r2)
            r2 = r5
            org.objectweb.asm.commons.Remapper r2 = r2.remapper
            r3 = r7
            java.lang.String r2 = r2.mapDesc(r3)
            r3 = r8
            super.visitEnum(r1, r2, r3)
            return
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            r0 = r5
            r1 = r5
            r2 = r6
            java.lang.String r1 = r1.mapAnnotationAttributeName(r2)
            r2 = r5
            org.objectweb.asm.commons.Remapper r2 = r2.remapper
            r3 = r7
            java.lang.String r2 = r2.mapDesc(r3)
            org.objectweb.asm.AnnotationVisitor r0 = super.visitAnnotation(r1, r2)
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L18
            r0 = 0
            return r0
        L18:
            r0 = r8
            r1 = r5
            org.objectweb.asm.AnnotationVisitor r1 = r1.f622av
            if (r0 != r1) goto L24
            r0 = r5
            goto L2a
        L24:
            r0 = r5
            r1 = r7
            r2 = r8
            org.objectweb.asm.AnnotationVisitor r0 = r0.createAnnotationRemapper(r1, r2)
        L2a:
            return r0
    }

    @Override // org.objectweb.asm.AnnotationVisitor
    public org.objectweb.asm.AnnotationVisitor visitArray(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = r4
            r2 = r5
            java.lang.String r1 = r1.mapAnnotationAttributeName(r2)
            org.objectweb.asm.AnnotationVisitor r0 = super.visitArray(r1)
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L10
            r0 = 0
            return r0
        L10:
            r0 = r6
            r1 = r4
            org.objectweb.asm.AnnotationVisitor r1 = r1.f622av
            if (r0 != r1) goto L1c
            r0 = r4
            goto L22
        L1c:
            r0 = r4
            r1 = 0
            r2 = r6
            org.objectweb.asm.AnnotationVisitor r0 = r0.createAnnotationRemapper(r1, r2)
        L22:
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

    final org.objectweb.asm.AnnotationVisitor orDeprecatedValue(org.objectweb.asm.AnnotationVisitor r4) {
            r3 = this;
            r0 = r4
            java.lang.Class r0 = r0.getClass()
            r1 = r3
            java.lang.Class r1 = r1.getClass()
            if (r0 != r1) goto L33
            r0 = r4
            org.objectweb.asm.commons.AnnotationRemapper r0 = (org.objectweb.asm.commons.AnnotationRemapper) r0
            r5 = r0
            r0 = r5
            int r0 = r0.api
            r1 = r3
            int r1 = r1.api
            if (r0 != r1) goto L33
            r0 = r5
            org.objectweb.asm.AnnotationVisitor r0 = r0.f622av
            r1 = r3
            org.objectweb.asm.AnnotationVisitor r1 = r1.f622av
            if (r0 != r1) goto L33
            r0 = r5
            org.objectweb.asm.commons.Remapper r0 = r0.remapper
            r1 = r3
            org.objectweb.asm.commons.Remapper r1 = r1.remapper
            if (r0 != r1) goto L33
            r0 = r3
            return r0
        L33:
            r0 = r4
            return r0
    }

    private java.lang.String mapAnnotationAttributeName(java.lang.String r5) {
            r4 = this;
            r0 = r4
            java.lang.String r0 = r0.descriptor
            if (r0 != 0) goto L9
            r0 = r5
            return r0
        L9:
            r0 = r4
            org.objectweb.asm.commons.Remapper r0 = r0.remapper
            r1 = r4
            java.lang.String r1 = r1.descriptor
            r2 = r5
            java.lang.String r0 = r0.mapAnnotationAttributeName(r1, r2)
            return r0
    }
}
