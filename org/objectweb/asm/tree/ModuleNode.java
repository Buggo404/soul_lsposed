package org.objectweb.asm.tree;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/ModuleNode.SCL.lombok */
public class ModuleNode extends org.objectweb.asm.ModuleVisitor {
    public java.lang.String name;
    public int access;
    public java.lang.String version;
    public java.lang.String mainClass;
    public java.util.List<java.lang.String> packages;
    public java.util.List<org.objectweb.asm.tree.ModuleRequireNode> requires;
    public java.util.List<org.objectweb.asm.tree.ModuleExportNode> exports;
    public java.util.List<org.objectweb.asm.tree.ModuleOpenNode> opens;
    public java.util.List<java.lang.String> uses;
    public java.util.List<org.objectweb.asm.tree.ModuleProvideNode> provides;

    public ModuleNode(java.lang.String r4, int r5, java.lang.String r6) {
            r3 = this;
            r0 = r3
            r1 = 589824(0x90000, float:8.2652E-40)
            r0.<init>(r1)
            r0 = r3
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<org.objectweb.asm.tree.ModuleNode> r1 = org.objectweb.asm.tree.ModuleNode.class
            if (r0 == r1) goto L17
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r1.<init>()
            throw r0
        L17:
            r0 = r3
            r1 = r4
            r0.name = r1
            r0 = r3
            r1 = r5
            r0.access = r1
            r0 = r3
            r1 = r6
            r0.version = r1
            return
    }

    public ModuleNode(int r4, java.lang.String r5, int r6, java.lang.String r7, java.util.List<org.objectweb.asm.tree.ModuleRequireNode> r8, java.util.List<org.objectweb.asm.tree.ModuleExportNode> r9, java.util.List<org.objectweb.asm.tree.ModuleOpenNode> r10, java.util.List<java.lang.String> r11, java.util.List<org.objectweb.asm.tree.ModuleProvideNode> r12) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            r0 = r3
            r1 = r5
            r0.name = r1
            r0 = r3
            r1 = r6
            r0.access = r1
            r0 = r3
            r1 = r7
            r0.version = r1
            r0 = r3
            r1 = r8
            r0.requires = r1
            r0 = r3
            r1 = r9
            r0.exports = r1
            r0 = r3
            r1 = r10
            r0.opens = r1
            r0 = r3
            r1 = r11
            r0.uses = r1
            r0 = r3
            r1 = r12
            r0.provides = r1
            return
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitMainClass(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.mainClass = r1
            return
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitPackage(java.lang.String r6) {
            r5 = this;
            r0 = r5
            java.util.List<java.lang.String> r0 = r0.packages
            if (r0 != 0) goto L13
            r0 = r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r3 = 5
            r2.<init>(r3)
            r0.packages = r1
        L13:
            r0 = r5
            java.util.List<java.lang.String> r0 = r0.packages
            r1 = r6
            boolean r0 = r0.add(r1)
            return
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitRequire(java.lang.String r8, int r9, java.lang.String r10) {
            r7 = this;
            r0 = r7
            java.util.List<org.objectweb.asm.tree.ModuleRequireNode> r0 = r0.requires
            if (r0 != 0) goto L13
            r0 = r7
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r3 = 5
            r2.<init>(r3)
            r0.requires = r1
        L13:
            r0 = r7
            java.util.List<org.objectweb.asm.tree.ModuleRequireNode> r0 = r0.requires
            org.objectweb.asm.tree.ModuleRequireNode r1 = new org.objectweb.asm.tree.ModuleRequireNode
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r10
            r2.<init>(r3, r4, r5)
            boolean r0 = r0.add(r1)
            return
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitExport(java.lang.String r8, int r9, java.lang.String... r10) {
            r7 = this;
            r0 = r7
            java.util.List<org.objectweb.asm.tree.ModuleExportNode> r0 = r0.exports
            if (r0 != 0) goto L13
            r0 = r7
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r3 = 5
            r2.<init>(r3)
            r0.exports = r1
        L13:
            r0 = r7
            java.util.List<org.objectweb.asm.tree.ModuleExportNode> r0 = r0.exports
            org.objectweb.asm.tree.ModuleExportNode r1 = new org.objectweb.asm.tree.ModuleExportNode
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r10
            java.util.List r5 = org.objectweb.asm.tree.Util.asArrayList(r5)
            r2.<init>(r3, r4, r5)
            boolean r0 = r0.add(r1)
            return
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitOpen(java.lang.String r8, int r9, java.lang.String... r10) {
            r7 = this;
            r0 = r7
            java.util.List<org.objectweb.asm.tree.ModuleOpenNode> r0 = r0.opens
            if (r0 != 0) goto L13
            r0 = r7
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r3 = 5
            r2.<init>(r3)
            r0.opens = r1
        L13:
            r0 = r7
            java.util.List<org.objectweb.asm.tree.ModuleOpenNode> r0 = r0.opens
            org.objectweb.asm.tree.ModuleOpenNode r1 = new org.objectweb.asm.tree.ModuleOpenNode
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r10
            java.util.List r5 = org.objectweb.asm.tree.Util.asArrayList(r5)
            r2.<init>(r3, r4, r5)
            boolean r0 = r0.add(r1)
            return
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitUse(java.lang.String r6) {
            r5 = this;
            r0 = r5
            java.util.List<java.lang.String> r0 = r0.uses
            if (r0 != 0) goto L13
            r0 = r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r3 = 5
            r2.<init>(r3)
            r0.uses = r1
        L13:
            r0 = r5
            java.util.List<java.lang.String> r0 = r0.uses
            r1 = r6
            boolean r0 = r0.add(r1)
            return
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitProvide(java.lang.String r7, java.lang.String... r8) {
            r6 = this;
            r0 = r6
            java.util.List<org.objectweb.asm.tree.ModuleProvideNode> r0 = r0.provides
            if (r0 != 0) goto L13
            r0 = r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r3 = 5
            r2.<init>(r3)
            r0.provides = r1
        L13:
            r0 = r6
            java.util.List<org.objectweb.asm.tree.ModuleProvideNode> r0 = r0.provides
            org.objectweb.asm.tree.ModuleProvideNode r1 = new org.objectweb.asm.tree.ModuleProvideNode
            r2 = r1
            r3 = r7
            r4 = r8
            java.util.List r4 = org.objectweb.asm.tree.Util.asArrayList(r4)
            r2.<init>(r3, r4)
            boolean r0 = r0.add(r1)
            return
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitEnd() {
            r1 = this;
            return
    }

    public void accept(org.objectweb.asm.ClassVisitor r6) {
            r5 = this;
            r0 = r6
            r1 = r5
            java.lang.String r1 = r1.name
            r2 = r5
            int r2 = r2.access
            r3 = r5
            java.lang.String r3 = r3.version
            org.objectweb.asm.ModuleVisitor r0 = r0.visitModule(r1, r2, r3)
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L16
            return
        L16:
            r0 = r5
            java.lang.String r0 = r0.mainClass
            if (r0 == 0) goto L25
            r0 = r7
            r1 = r5
            java.lang.String r1 = r1.mainClass
            r0.visitMainClass(r1)
        L25:
            r0 = r5
            java.util.List<java.lang.String> r0 = r0.packages
            if (r0 == 0) goto L56
            r0 = 0
            r8 = r0
            r0 = r5
            java.util.List<java.lang.String> r0 = r0.packages
            int r0 = r0.size()
            r9 = r0
        L39:
            r0 = r8
            r1 = r9
            if (r0 >= r1) goto L56
            r0 = r7
            r1 = r5
            java.util.List<java.lang.String> r1 = r1.packages
            r2 = r8
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            r0.visitPackage(r1)
            int r8 = r8 + 1
            goto L39
        L56:
            r0 = r5
            java.util.List<org.objectweb.asm.tree.ModuleRequireNode> r0 = r0.requires
            if (r0 == 0) goto L87
            r0 = 0
            r8 = r0
            r0 = r5
            java.util.List<org.objectweb.asm.tree.ModuleRequireNode> r0 = r0.requires
            int r0 = r0.size()
            r9 = r0
        L6a:
            r0 = r8
            r1 = r9
            if (r0 >= r1) goto L87
            r0 = r5
            java.util.List<org.objectweb.asm.tree.ModuleRequireNode> r0 = r0.requires
            r1 = r8
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.ModuleRequireNode r0 = (org.objectweb.asm.tree.ModuleRequireNode) r0
            r1 = r7
            r0.accept(r1)
            int r8 = r8 + 1
            goto L6a
        L87:
            r0 = r5
            java.util.List<org.objectweb.asm.tree.ModuleExportNode> r0 = r0.exports
            if (r0 == 0) goto Lb8
            r0 = 0
            r8 = r0
            r0 = r5
            java.util.List<org.objectweb.asm.tree.ModuleExportNode> r0 = r0.exports
            int r0 = r0.size()
            r9 = r0
        L9b:
            r0 = r8
            r1 = r9
            if (r0 >= r1) goto Lb8
            r0 = r5
            java.util.List<org.objectweb.asm.tree.ModuleExportNode> r0 = r0.exports
            r1 = r8
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.ModuleExportNode r0 = (org.objectweb.asm.tree.ModuleExportNode) r0
            r1 = r7
            r0.accept(r1)
            int r8 = r8 + 1
            goto L9b
        Lb8:
            r0 = r5
            java.util.List<org.objectweb.asm.tree.ModuleOpenNode> r0 = r0.opens
            if (r0 == 0) goto Le9
            r0 = 0
            r8 = r0
            r0 = r5
            java.util.List<org.objectweb.asm.tree.ModuleOpenNode> r0 = r0.opens
            int r0 = r0.size()
            r9 = r0
        Lcc:
            r0 = r8
            r1 = r9
            if (r0 >= r1) goto Le9
            r0 = r5
            java.util.List<org.objectweb.asm.tree.ModuleOpenNode> r0 = r0.opens
            r1 = r8
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.ModuleOpenNode r0 = (org.objectweb.asm.tree.ModuleOpenNode) r0
            r1 = r7
            r0.accept(r1)
            int r8 = r8 + 1
            goto Lcc
        Le9:
            r0 = r5
            java.util.List<java.lang.String> r0 = r0.uses
            if (r0 == 0) goto L11a
            r0 = 0
            r8 = r0
            r0 = r5
            java.util.List<java.lang.String> r0 = r0.uses
            int r0 = r0.size()
            r9 = r0
        Lfd:
            r0 = r8
            r1 = r9
            if (r0 >= r1) goto L11a
            r0 = r7
            r1 = r5
            java.util.List<java.lang.String> r1 = r1.uses
            r2 = r8
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            r0.visitUse(r1)
            int r8 = r8 + 1
            goto Lfd
        L11a:
            r0 = r5
            java.util.List<org.objectweb.asm.tree.ModuleProvideNode> r0 = r0.provides
            if (r0 == 0) goto L14b
            r0 = 0
            r8 = r0
            r0 = r5
            java.util.List<org.objectweb.asm.tree.ModuleProvideNode> r0 = r0.provides
            int r0 = r0.size()
            r9 = r0
        L12e:
            r0 = r8
            r1 = r9
            if (r0 >= r1) goto L14b
            r0 = r5
            java.util.List<org.objectweb.asm.tree.ModuleProvideNode> r0 = r0.provides
            r1 = r8
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.ModuleProvideNode r0 = (org.objectweb.asm.tree.ModuleProvideNode) r0
            r1 = r7
            r0.accept(r1)
            int r8 = r8 + 1
            goto L12e
        L14b:
            return
    }
}
