package org.objectweb.asm.commons;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/commons/StaticInitMerger.SCL.lombok */
public class StaticInitMerger extends org.objectweb.asm.ClassVisitor {
    private java.lang.String owner;
    private final java.lang.String renamedClinitMethodPrefix;
    private int numClinitMethods;
    private org.objectweb.asm.MethodVisitor mergedClinitVisitor;

    public StaticInitMerger(java.lang.String r6, org.objectweb.asm.ClassVisitor r7) {
            r5 = this;
            r0 = r5
            r1 = 589824(0x90000, float:8.2652E-40)
            r2 = r6
            r3 = r7
            r0.<init>(r1, r2, r3)
            return
    }

    protected StaticInitMerger(int r5, java.lang.String r6, org.objectweb.asm.ClassVisitor r7) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r7
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r6
            r0.renamedClinitMethodPrefix = r1
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visit(int r9, int r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String[] r14) {
            r8 = this;
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            super.visit(r1, r2, r3, r4, r5, r6)
            r0 = r8
            r1 = r11
            r0.owner = r1
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public org.objectweb.asm.MethodVisitor visitMethod(int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String[] r13) {
            r8 = this;
            java.lang.String r0 = "<clinit>"
            r1 = r10
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L67
            r0 = 10
            r15 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r8
            java.lang.String r1 = r1.renamedClinitMethodPrefix
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r8
            r2 = r1
            int r2 = r2.numClinitMethods
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.numClinitMethods = r3
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r16 = r0
            r0 = r8
            r1 = r15
            r2 = r16
            r3 = r11
            r4 = r12
            r5 = r13
            org.objectweb.asm.MethodVisitor r0 = super.visitMethod(r1, r2, r3, r4, r5)
            r14 = r0
            r0 = r8
            org.objectweb.asm.MethodVisitor r0 = r0.mergedClinitVisitor
            if (r0 != 0) goto L52
            r0 = r8
            r1 = r8
            r2 = r15
            r3 = r10
            r4 = r11
            r5 = 0
            r6 = 0
            org.objectweb.asm.MethodVisitor r1 = super.visitMethod(r2, r3, r4, r5, r6)
            r0.mergedClinitVisitor = r1
        L52:
            r0 = r8
            org.objectweb.asm.MethodVisitor r0 = r0.mergedClinitVisitor
            r1 = 184(0xb8, float:2.58E-43)
            r2 = r8
            java.lang.String r2 = r2.owner
            r3 = r16
            r4 = r11
            r5 = 0
            r0.visitMethodInsn(r1, r2, r3, r4, r5)
            goto L74
        L67:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            org.objectweb.asm.MethodVisitor r0 = super.visitMethod(r1, r2, r3, r4, r5)
            r14 = r0
        L74:
            r0 = r14
            return r0
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitEnd() {
            r4 = this;
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.mergedClinitVisitor
            if (r0 == 0) goto L1a
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.mergedClinitVisitor
            r1 = 177(0xb1, float:2.48E-43)
            r0.visitInsn(r1)
            r0 = r4
            org.objectweb.asm.MethodVisitor r0 = r0.mergedClinitVisitor
            r1 = 0
            r2 = 0
            r0.visitMaxs(r1, r2)
        L1a:
            r0 = r4
            super.visitEnd()
            return
    }
}
