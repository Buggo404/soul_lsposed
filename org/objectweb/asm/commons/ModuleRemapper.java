package org.objectweb.asm.commons;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/commons/ModuleRemapper.SCL.lombok */
public class ModuleRemapper extends org.objectweb.asm.ModuleVisitor {
    protected final org.objectweb.asm.commons.Remapper remapper;

    public ModuleRemapper(org.objectweb.asm.ModuleVisitor r6, org.objectweb.asm.commons.Remapper r7) {
            r5 = this;
            r0 = r5
            r1 = 589824(0x90000, float:8.2652E-40)
            r2 = r6
            r3 = r7
            r0.<init>(r1, r2, r3)
            return
    }

    protected ModuleRemapper(int r5, org.objectweb.asm.ModuleVisitor r6, org.objectweb.asm.commons.Remapper r7) {
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

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitMainClass(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = r4
            org.objectweb.asm.commons.Remapper r1 = r1.remapper
            r2 = r5
            java.lang.String r1 = r1.mapType(r2)
            super.visitMainClass(r1)
            return
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitPackage(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = r4
            org.objectweb.asm.commons.Remapper r1 = r1.remapper
            r2 = r5
            java.lang.String r1 = r1.mapPackageName(r2)
            super.visitPackage(r1)
            return
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitRequire(java.lang.String r6, int r7, java.lang.String r8) {
            r5 = this;
            r0 = r5
            r1 = r5
            org.objectweb.asm.commons.Remapper r1 = r1.remapper
            r2 = r6
            java.lang.String r1 = r1.mapModuleName(r2)
            r2 = r7
            r3 = r8
            super.visitRequire(r1, r2, r3)
            return
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitExport(java.lang.String r7, int r8, java.lang.String... r9) {
            r6 = this;
            r0 = 0
            r10 = r0
            r0 = r9
            if (r0 == 0) goto L2e
            r0 = r9
            int r0 = r0.length
            java.lang.String[] r0 = new java.lang.String[r0]
            r10 = r0
            r0 = 0
            r11 = r0
        L11:
            r0 = r11
            r1 = r9
            int r1 = r1.length
            if (r0 >= r1) goto L2e
            r0 = r10
            r1 = r11
            r2 = r6
            org.objectweb.asm.commons.Remapper r2 = r2.remapper
            r3 = r9
            r4 = r11
            r3 = r3[r4]
            java.lang.String r2 = r2.mapModuleName(r3)
            r0[r1] = r2
            int r11 = r11 + 1
            goto L11
        L2e:
            r0 = r6
            r1 = r6
            org.objectweb.asm.commons.Remapper r1 = r1.remapper
            r2 = r7
            java.lang.String r1 = r1.mapPackageName(r2)
            r2 = r8
            r3 = r10
            super.visitExport(r1, r2, r3)
            return
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitOpen(java.lang.String r7, int r8, java.lang.String... r9) {
            r6 = this;
            r0 = 0
            r10 = r0
            r0 = r9
            if (r0 == 0) goto L2e
            r0 = r9
            int r0 = r0.length
            java.lang.String[] r0 = new java.lang.String[r0]
            r10 = r0
            r0 = 0
            r11 = r0
        L11:
            r0 = r11
            r1 = r9
            int r1 = r1.length
            if (r0 >= r1) goto L2e
            r0 = r10
            r1 = r11
            r2 = r6
            org.objectweb.asm.commons.Remapper r2 = r2.remapper
            r3 = r9
            r4 = r11
            r3 = r3[r4]
            java.lang.String r2 = r2.mapModuleName(r3)
            r0[r1] = r2
            int r11 = r11 + 1
            goto L11
        L2e:
            r0 = r6
            r1 = r6
            org.objectweb.asm.commons.Remapper r1 = r1.remapper
            r2 = r7
            java.lang.String r1 = r1.mapPackageName(r2)
            r2 = r8
            r3 = r10
            super.visitOpen(r1, r2, r3)
            return
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitUse(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = r4
            org.objectweb.asm.commons.Remapper r1 = r1.remapper
            r2 = r5
            java.lang.String r1 = r1.mapType(r2)
            super.visitUse(r1)
            return
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitProvide(java.lang.String r7, java.lang.String... r8) {
            r6 = this;
            r0 = r8
            int r0 = r0.length
            java.lang.String[] r0 = new java.lang.String[r0]
            r9 = r0
            r0 = 0
            r10 = r0
        L9:
            r0 = r10
            r1 = r8
            int r1 = r1.length
            if (r0 >= r1) goto L25
            r0 = r9
            r1 = r10
            r2 = r6
            org.objectweb.asm.commons.Remapper r2 = r2.remapper
            r3 = r8
            r4 = r10
            r3 = r3[r4]
            java.lang.String r2 = r2.mapType(r3)
            r0[r1] = r2
            int r10 = r10 + 1
            goto L9
        L25:
            r0 = r6
            r1 = r6
            org.objectweb.asm.commons.Remapper r1 = r1.remapper
            r2 = r7
            java.lang.String r1 = r1.mapType(r2)
            r2 = r9
            super.visitProvide(r1, r2)
            return
    }
}
