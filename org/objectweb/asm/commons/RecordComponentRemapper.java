package org.objectweb.asm.commons;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/commons/RecordComponentRemapper.SCL.lombok */
public class RecordComponentRemapper extends org.objectweb.asm.RecordComponentVisitor {
    protected final org.objectweb.asm.commons.Remapper remapper;

    public RecordComponentRemapper(org.objectweb.asm.RecordComponentVisitor r6, org.objectweb.asm.commons.Remapper r7) {
            r5 = this;
            r0 = r5
            r1 = 589824(0x90000, float:8.2652E-40)
            r2 = r6
            r3 = r7
            r0.<init>(r1, r2, r3)
            return
    }

    protected RecordComponentRemapper(int r5, org.objectweb.asm.RecordComponentVisitor r6, org.objectweb.asm.commons.Remapper r7) {
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

    @Override // org.objectweb.asm.RecordComponentVisitor
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

    @Override // org.objectweb.asm.RecordComponentVisitor
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
}
