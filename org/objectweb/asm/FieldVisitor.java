package org.objectweb.asm;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/FieldVisitor.SCL.lombok */
public abstract class FieldVisitor {
    protected final int api;

    /* renamed from: fv */
    protected org.objectweb.asm.FieldVisitor f625fv;

    protected FieldVisitor(int r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            r0.<init>(r1, r2)
            return
    }

    protected FieldVisitor(int r6, org.objectweb.asm.FieldVisitor r7) {
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
            r0.f625fv = r1
            return
    }

    public org.objectweb.asm.FieldVisitor getDelegate() {
            r2 = this;
            r0 = r2
            org.objectweb.asm.FieldVisitor r0 = r0.f625fv
            return r0
    }

    public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String r5, boolean r6) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.FieldVisitor r0 = r0.f625fv
            if (r0 == 0) goto L11
            r0 = r4
            org.objectweb.asm.FieldVisitor r0 = r0.f625fv
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
            java.lang.String r2 = "This feature requires ASM5"
            r1.<init>(r2)
            throw r0
        L13:
            r0 = r6
            org.objectweb.asm.FieldVisitor r0 = r0.f625fv
            if (r0 == 0) goto L27
            r0 = r6
            org.objectweb.asm.FieldVisitor r0 = r0.f625fv
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
            org.objectweb.asm.FieldVisitor r0 = r0.f625fv
            if (r0 == 0) goto Lf
            r0 = r3
            org.objectweb.asm.FieldVisitor r0 = r0.f625fv
            r1 = r4
            r0.visitAttribute(r1)
        Lf:
            return
    }

    public void visitEnd() {
            r2 = this;
            r0 = r2
            org.objectweb.asm.FieldVisitor r0 = r0.f625fv
            if (r0 == 0) goto Le
            r0 = r2
            org.objectweb.asm.FieldVisitor r0 = r0.f625fv
            r0.visitEnd()
        Le:
            return
    }
}
