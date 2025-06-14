package org.objectweb.asm.tree;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/tree/ClassNode.SCL.lombok */
public class ClassNode extends org.objectweb.asm.ClassVisitor {
    public int version;
    public int access;
    public java.lang.String name;
    public java.lang.String signature;
    public java.lang.String superName;
    public java.util.List<java.lang.String> interfaces;
    public java.lang.String sourceFile;
    public java.lang.String sourceDebug;
    public org.objectweb.asm.tree.ModuleNode module;
    public java.lang.String outerClass;
    public java.lang.String outerMethod;
    public java.lang.String outerMethodDesc;
    public java.util.List<org.objectweb.asm.tree.AnnotationNode> visibleAnnotations;
    public java.util.List<org.objectweb.asm.tree.AnnotationNode> invisibleAnnotations;
    public java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> visibleTypeAnnotations;
    public java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> invisibleTypeAnnotations;
    public java.util.List<org.objectweb.asm.Attribute> attrs;
    public java.util.List<org.objectweb.asm.tree.InnerClassNode> innerClasses;
    public java.lang.String nestHostClass;
    public java.util.List<java.lang.String> nestMembers;
    public java.util.List<java.lang.String> permittedSubclasses;
    public java.util.List<org.objectweb.asm.tree.RecordComponentNode> recordComponents;
    public java.util.List<org.objectweb.asm.tree.FieldNode> fields;
    public java.util.List<org.objectweb.asm.tree.MethodNode> methods;

    public ClassNode() {
            r3 = this;
            r0 = r3
            r1 = 589824(0x90000, float:8.2652E-40)
            r0.<init>(r1)
            r0 = r3
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<org.objectweb.asm.tree.ClassNode> r1 = org.objectweb.asm.tree.ClassNode.class
            if (r0 == r1) goto L17
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r1.<init>()
            throw r0
        L17:
            return
    }

    public ClassNode(int r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.interfaces = r1
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.innerClasses = r1
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.fields = r1
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.methods = r1
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visit(int r4, int r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String[] r9) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.version = r1
            r0 = r3
            r1 = r5
            r0.access = r1
            r0 = r3
            r1 = r6
            r0.name = r1
            r0 = r3
            r1 = r7
            r0.signature = r1
            r0 = r3
            r1 = r8
            r0.superName = r1
            r0 = r3
            r1 = r9
            java.util.List r1 = org.objectweb.asm.tree.Util.asArrayList(r1)
            r0.interfaces = r1
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitSource(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.sourceFile = r1
            r0 = r3
            r1 = r5
            r0.sourceDebug = r1
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public org.objectweb.asm.ModuleVisitor visitModule(java.lang.String r8, int r9, java.lang.String r10) {
            r7 = this;
            r0 = r7
            org.objectweb.asm.tree.ModuleNode r1 = new org.objectweb.asm.tree.ModuleNode
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r10
            r2.<init>(r3, r4, r5)
            r0.module = r1
            r0 = r7
            org.objectweb.asm.tree.ModuleNode r0 = r0.module
            return r0
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitNestHost(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.nestHostClass = r1
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitOuterClass(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.outerClass = r1
            r0 = r3
            r1 = r5
            r0.outerMethod = r1
            r0 = r3
            r1 = r6
            r0.outerMethodDesc = r1
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String r5, boolean r6) {
            r4 = this;
            org.objectweb.asm.tree.AnnotationNode r0 = new org.objectweb.asm.tree.AnnotationNode
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r7 = r0
            r0 = r6
            if (r0 == 0) goto L1c
            r0 = r4
            r1 = r4
            java.util.List<org.objectweb.asm.tree.AnnotationNode> r1 = r1.visibleAnnotations
            r2 = r7
            java.util.List r1 = org.objectweb.asm.tree.Util.add(r1, r2)
            r0.visibleAnnotations = r1
            goto L28
        L1c:
            r0 = r4
            r1 = r4
            java.util.List<org.objectweb.asm.tree.AnnotationNode> r1 = r1.invisibleAnnotations
            r2 = r7
            java.util.List r1 = org.objectweb.asm.tree.Util.add(r1, r2)
            r0.invisibleAnnotations = r1
        L28:
            r0 = r7
            return r0
    }

    @Override // org.objectweb.asm.ClassVisitor
    public org.objectweb.asm.AnnotationVisitor visitTypeAnnotation(int r7, org.objectweb.asm.TypePath r8, java.lang.String r9, boolean r10) {
            r6 = this;
            org.objectweb.asm.tree.TypeAnnotationNode r0 = new org.objectweb.asm.tree.TypeAnnotationNode
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            r1.<init>(r2, r3, r4)
            r11 = r0
            r0 = r10
            if (r0 == 0) goto L21
            r0 = r6
            r1 = r6
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r1 = r1.visibleTypeAnnotations
            r2 = r11
            java.util.List r1 = org.objectweb.asm.tree.Util.add(r1, r2)
            r0.visibleTypeAnnotations = r1
            goto L2e
        L21:
            r0 = r6
            r1 = r6
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r1 = r1.invisibleTypeAnnotations
            r2 = r11
            java.util.List r1 = org.objectweb.asm.tree.Util.add(r1, r2)
            r0.invisibleTypeAnnotations = r1
        L2e:
            r0 = r11
            return r0
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitAttribute(org.objectweb.asm.Attribute r5) {
            r4 = this;
            r0 = r4
            r1 = r4
            java.util.List<org.objectweb.asm.Attribute> r1 = r1.attrs
            r2 = r5
            java.util.List r1 = org.objectweb.asm.tree.Util.add(r1, r2)
            r0.attrs = r1
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitNestMember(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = r4
            java.util.List<java.lang.String> r1 = r1.nestMembers
            r2 = r5
            java.util.List r1 = org.objectweb.asm.tree.Util.add(r1, r2)
            r0.nestMembers = r1
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitPermittedSubclass(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = r4
            java.util.List<java.lang.String> r1 = r1.permittedSubclasses
            r2 = r5
            java.util.List r1 = org.objectweb.asm.tree.Util.add(r1, r2)
            r0.permittedSubclasses = r1
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitInnerClass(java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11) {
            r7 = this;
            org.objectweb.asm.tree.InnerClassNode r0 = new org.objectweb.asm.tree.InnerClassNode
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5)
            r12 = r0
            r0 = r7
            java.util.List<org.objectweb.asm.tree.InnerClassNode> r0 = r0.innerClasses
            r1 = r12
            boolean r0 = r0.add(r1)
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public org.objectweb.asm.RecordComponentVisitor visitRecordComponent(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            org.objectweb.asm.tree.RecordComponentNode r0 = new org.objectweb.asm.tree.RecordComponentNode
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            r1.<init>(r2, r3, r4)
            r10 = r0
            r0 = r6
            r1 = r6
            java.util.List<org.objectweb.asm.tree.RecordComponentNode> r1 = r1.recordComponents
            r2 = r10
            java.util.List r1 = org.objectweb.asm.tree.Util.add(r1, r2)
            r0.recordComponents = r1
            r0 = r10
            return r0
    }

    @Override // org.objectweb.asm.ClassVisitor
    public org.objectweb.asm.FieldVisitor visitField(int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.Object r13) {
            r8 = this;
            org.objectweb.asm.tree.FieldNode r0 = new org.objectweb.asm.tree.FieldNode
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            r14 = r0
            r0 = r8
            java.util.List<org.objectweb.asm.tree.FieldNode> r0 = r0.fields
            r1 = r14
            boolean r0 = r0.add(r1)
            r0 = r14
            return r0
    }

    @Override // org.objectweb.asm.ClassVisitor
    public org.objectweb.asm.MethodVisitor visitMethod(int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String[] r13) {
            r8 = this;
            org.objectweb.asm.tree.MethodNode r0 = new org.objectweb.asm.tree.MethodNode
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            r14 = r0
            r0 = r8
            java.util.List<org.objectweb.asm.tree.MethodNode> r0 = r0.methods
            r1 = r14
            boolean r0 = r0.add(r1)
            r0 = r14
            return r0
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitEnd() {
            r1 = this;
            return
    }

    public void check(int r4) {
            r3 = this;
            r0 = r4
            r1 = 589824(0x90000, float:8.2652E-40)
            if (r0 >= r1) goto L15
            r0 = r3
            java.util.List<java.lang.String> r0 = r0.permittedSubclasses
            if (r0 == 0) goto L15
            org.objectweb.asm.tree.UnsupportedClassVersionException r0 = new org.objectweb.asm.tree.UnsupportedClassVersionException
            r1 = r0
            r1.<init>()
            throw r0
        L15:
            r0 = r4
            r1 = 524288(0x80000, float:7.34684E-40)
            if (r0 >= r1) goto L34
            r0 = r3
            int r0 = r0.access
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r1
            if (r0 != 0) goto L2c
            r0 = r3
            java.util.List<org.objectweb.asm.tree.RecordComponentNode> r0 = r0.recordComponents
            if (r0 == 0) goto L34
        L2c:
            org.objectweb.asm.tree.UnsupportedClassVersionException r0 = new org.objectweb.asm.tree.UnsupportedClassVersionException
            r1 = r0
            r1.<init>()
            throw r0
        L34:
            r0 = r4
            r1 = 458752(0x70000, float:6.42848E-40)
            if (r0 >= r1) goto L50
            r0 = r3
            java.lang.String r0 = r0.nestHostClass
            if (r0 != 0) goto L48
            r0 = r3
            java.util.List<java.lang.String> r0 = r0.nestMembers
            if (r0 == 0) goto L50
        L48:
            org.objectweb.asm.tree.UnsupportedClassVersionException r0 = new org.objectweb.asm.tree.UnsupportedClassVersionException
            r1 = r0
            r1.<init>()
            throw r0
        L50:
            r0 = r4
            r1 = 393216(0x60000, float:5.51013E-40)
            if (r0 >= r1) goto L65
            r0 = r3
            org.objectweb.asm.tree.ModuleNode r0 = r0.module
            if (r0 == 0) goto L65
            org.objectweb.asm.tree.UnsupportedClassVersionException r0 = new org.objectweb.asm.tree.UnsupportedClassVersionException
            r1 = r0
            r1.<init>()
            throw r0
        L65:
            r0 = r4
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 >= r1) goto La1
            r0 = r3
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.visibleTypeAnnotations
            if (r0 == 0) goto L86
            r0 = r3
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.visibleTypeAnnotations
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L86
            org.objectweb.asm.tree.UnsupportedClassVersionException r0 = new org.objectweb.asm.tree.UnsupportedClassVersionException
            r1 = r0
            r1.<init>()
            throw r0
        L86:
            r0 = r3
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.invisibleTypeAnnotations
            if (r0 == 0) goto La1
            r0 = r3
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.invisibleTypeAnnotations
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto La1
            org.objectweb.asm.tree.UnsupportedClassVersionException r0 = new org.objectweb.asm.tree.UnsupportedClassVersionException
            r1 = r0
            r1.<init>()
            throw r0
        La1:
            r0 = r3
            java.util.List<org.objectweb.asm.tree.AnnotationNode> r0 = r0.visibleAnnotations
            if (r0 == 0) goto Lcf
            r0 = r3
            java.util.List<org.objectweb.asm.tree.AnnotationNode> r0 = r0.visibleAnnotations
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
            r5 = r0
        Lb4:
            r0 = r5
            if (r0 < 0) goto Lcf
            r0 = r3
            java.util.List<org.objectweb.asm.tree.AnnotationNode> r0 = r0.visibleAnnotations
            r1 = r5
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.AnnotationNode r0 = (org.objectweb.asm.tree.AnnotationNode) r0
            r1 = r4
            r0.check(r1)
            int r5 = r5 + (-1)
            goto Lb4
        Lcf:
            r0 = r3
            java.util.List<org.objectweb.asm.tree.AnnotationNode> r0 = r0.invisibleAnnotations
            if (r0 == 0) goto Lfd
            r0 = r3
            java.util.List<org.objectweb.asm.tree.AnnotationNode> r0 = r0.invisibleAnnotations
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
            r5 = r0
        Le2:
            r0 = r5
            if (r0 < 0) goto Lfd
            r0 = r3
            java.util.List<org.objectweb.asm.tree.AnnotationNode> r0 = r0.invisibleAnnotations
            r1 = r5
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.AnnotationNode r0 = (org.objectweb.asm.tree.AnnotationNode) r0
            r1 = r4
            r0.check(r1)
            int r5 = r5 + (-1)
            goto Le2
        Lfd:
            r0 = r3
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.visibleTypeAnnotations
            if (r0 == 0) goto L12b
            r0 = r3
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.visibleTypeAnnotations
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
            r5 = r0
        L110:
            r0 = r5
            if (r0 < 0) goto L12b
            r0 = r3
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.visibleTypeAnnotations
            r1 = r5
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.TypeAnnotationNode r0 = (org.objectweb.asm.tree.TypeAnnotationNode) r0
            r1 = r4
            r0.check(r1)
            int r5 = r5 + (-1)
            goto L110
        L12b:
            r0 = r3
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.invisibleTypeAnnotations
            if (r0 == 0) goto L159
            r0 = r3
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.invisibleTypeAnnotations
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
            r5 = r0
        L13e:
            r0 = r5
            if (r0 < 0) goto L159
            r0 = r3
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.invisibleTypeAnnotations
            r1 = r5
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.TypeAnnotationNode r0 = (org.objectweb.asm.tree.TypeAnnotationNode) r0
            r1 = r4
            r0.check(r1)
            int r5 = r5 + (-1)
            goto L13e
        L159:
            r0 = r3
            java.util.List<org.objectweb.asm.tree.RecordComponentNode> r0 = r0.recordComponents
            if (r0 == 0) goto L187
            r0 = r3
            java.util.List<org.objectweb.asm.tree.RecordComponentNode> r0 = r0.recordComponents
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
            r5 = r0
        L16c:
            r0 = r5
            if (r0 < 0) goto L187
            r0 = r3
            java.util.List<org.objectweb.asm.tree.RecordComponentNode> r0 = r0.recordComponents
            r1 = r5
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.RecordComponentNode r0 = (org.objectweb.asm.tree.RecordComponentNode) r0
            r1 = r4
            r0.check(r1)
            int r5 = r5 + (-1)
            goto L16c
        L187:
            r0 = r3
            java.util.List<org.objectweb.asm.tree.FieldNode> r0 = r0.fields
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
            r5 = r0
        L193:
            r0 = r5
            if (r0 < 0) goto L1ae
            r0 = r3
            java.util.List<org.objectweb.asm.tree.FieldNode> r0 = r0.fields
            r1 = r5
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.FieldNode r0 = (org.objectweb.asm.tree.FieldNode) r0
            r1 = r4
            r0.check(r1)
            int r5 = r5 + (-1)
            goto L193
        L1ae:
            r0 = r3
            java.util.List<org.objectweb.asm.tree.MethodNode> r0 = r0.methods
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
            r5 = r0
        L1ba:
            r0 = r5
            if (r0 < 0) goto L1d5
            r0 = r3
            java.util.List<org.objectweb.asm.tree.MethodNode> r0 = r0.methods
            r1 = r5
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.MethodNode r0 = (org.objectweb.asm.tree.MethodNode) r0
            r1 = r4
            r0.check(r1)
            int r5 = r5 + (-1)
            goto L1ba
        L1d5:
            return
    }

    public void accept(org.objectweb.asm.ClassVisitor r9) {
            r8 = this;
            r0 = r8
            java.util.List<java.lang.String> r0 = r0.interfaces
            int r0 = r0.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            r10 = r0
            r0 = r8
            java.util.List<java.lang.String> r0 = r0.interfaces
            r1 = r10
            java.lang.Object[] r0 = r0.toArray(r1)
            r0 = r9
            r1 = r8
            int r1 = r1.version
            r2 = r8
            int r2 = r2.access
            r3 = r8
            java.lang.String r3 = r3.name
            r4 = r8
            java.lang.String r4 = r4.signature
            r5 = r8
            java.lang.String r5 = r5.superName
            r6 = r10
            r0.visit(r1, r2, r3, r4, r5, r6)
            r0 = r8
            java.lang.String r0 = r0.sourceFile
            if (r0 != 0) goto L3f
            r0 = r8
            java.lang.String r0 = r0.sourceDebug
            if (r0 == 0) goto L4b
        L3f:
            r0 = r9
            r1 = r8
            java.lang.String r1 = r1.sourceFile
            r2 = r8
            java.lang.String r2 = r2.sourceDebug
            r0.visitSource(r1, r2)
        L4b:
            r0 = r8
            org.objectweb.asm.tree.ModuleNode r0 = r0.module
            if (r0 == 0) goto L5a
            r0 = r8
            org.objectweb.asm.tree.ModuleNode r0 = r0.module
            r1 = r9
            r0.accept(r1)
        L5a:
            r0 = r8
            java.lang.String r0 = r0.nestHostClass
            if (r0 == 0) goto L69
            r0 = r9
            r1 = r8
            java.lang.String r1 = r1.nestHostClass
            r0.visitNestHost(r1)
        L69:
            r0 = r8
            java.lang.String r0 = r0.outerClass
            if (r0 == 0) goto L80
            r0 = r9
            r1 = r8
            java.lang.String r1 = r1.outerClass
            r2 = r8
            java.lang.String r2 = r2.outerMethod
            r3 = r8
            java.lang.String r3 = r3.outerMethodDesc
            r0.visitOuterClass(r1, r2, r3)
        L80:
            r0 = r8
            java.util.List<org.objectweb.asm.tree.AnnotationNode> r0 = r0.visibleAnnotations
            if (r0 == 0) goto Lbe
            r0 = 0
            r11 = r0
            r0 = r8
            java.util.List<org.objectweb.asm.tree.AnnotationNode> r0 = r0.visibleAnnotations
            int r0 = r0.size()
            r12 = r0
        L94:
            r0 = r11
            r1 = r12
            if (r0 >= r1) goto Lbe
            r0 = r8
            java.util.List<org.objectweb.asm.tree.AnnotationNode> r0 = r0.visibleAnnotations
            r1 = r11
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.AnnotationNode r0 = (org.objectweb.asm.tree.AnnotationNode) r0
            r13 = r0
            r0 = r13
            r1 = r9
            r2 = r13
            java.lang.String r2 = r2.desc
            r3 = 1
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitAnnotation(r2, r3)
            r0.accept(r1)
            int r11 = r11 + 1
            goto L94
        Lbe:
            r0 = r8
            java.util.List<org.objectweb.asm.tree.AnnotationNode> r0 = r0.invisibleAnnotations
            if (r0 == 0) goto Lfc
            r0 = 0
            r11 = r0
            r0 = r8
            java.util.List<org.objectweb.asm.tree.AnnotationNode> r0 = r0.invisibleAnnotations
            int r0 = r0.size()
            r12 = r0
        Ld2:
            r0 = r11
            r1 = r12
            if (r0 >= r1) goto Lfc
            r0 = r8
            java.util.List<org.objectweb.asm.tree.AnnotationNode> r0 = r0.invisibleAnnotations
            r1 = r11
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.AnnotationNode r0 = (org.objectweb.asm.tree.AnnotationNode) r0
            r13 = r0
            r0 = r13
            r1 = r9
            r2 = r13
            java.lang.String r2 = r2.desc
            r3 = 0
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitAnnotation(r2, r3)
            r0.accept(r1)
            int r11 = r11 + 1
            goto Ld2
        Lfc:
            r0 = r8
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.visibleTypeAnnotations
            if (r0 == 0) goto L144
            r0 = 0
            r11 = r0
            r0 = r8
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.visibleTypeAnnotations
            int r0 = r0.size()
            r12 = r0
        L110:
            r0 = r11
            r1 = r12
            if (r0 >= r1) goto L144
            r0 = r8
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.visibleTypeAnnotations
            r1 = r11
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.TypeAnnotationNode r0 = (org.objectweb.asm.tree.TypeAnnotationNode) r0
            r13 = r0
            r0 = r13
            r1 = r9
            r2 = r13
            int r2 = r2.typeRef
            r3 = r13
            org.objectweb.asm.TypePath r3 = r3.typePath
            r4 = r13
            java.lang.String r4 = r4.desc
            r5 = 1
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitTypeAnnotation(r2, r3, r4, r5)
            r0.accept(r1)
            int r11 = r11 + 1
            goto L110
        L144:
            r0 = r8
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.invisibleTypeAnnotations
            if (r0 == 0) goto L18c
            r0 = 0
            r11 = r0
            r0 = r8
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.invisibleTypeAnnotations
            int r0 = r0.size()
            r12 = r0
        L158:
            r0 = r11
            r1 = r12
            if (r0 >= r1) goto L18c
            r0 = r8
            java.util.List<org.objectweb.asm.tree.TypeAnnotationNode> r0 = r0.invisibleTypeAnnotations
            r1 = r11
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.TypeAnnotationNode r0 = (org.objectweb.asm.tree.TypeAnnotationNode) r0
            r13 = r0
            r0 = r13
            r1 = r9
            r2 = r13
            int r2 = r2.typeRef
            r3 = r13
            org.objectweb.asm.TypePath r3 = r3.typePath
            r4 = r13
            java.lang.String r4 = r4.desc
            r5 = 0
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitTypeAnnotation(r2, r3, r4, r5)
            r0.accept(r1)
            int r11 = r11 + 1
            goto L158
        L18c:
            r0 = r8
            java.util.List<org.objectweb.asm.Attribute> r0 = r0.attrs
            if (r0 == 0) goto L1bd
            r0 = 0
            r11 = r0
            r0 = r8
            java.util.List<org.objectweb.asm.Attribute> r0 = r0.attrs
            int r0 = r0.size()
            r12 = r0
        L1a0:
            r0 = r11
            r1 = r12
            if (r0 >= r1) goto L1bd
            r0 = r9
            r1 = r8
            java.util.List<org.objectweb.asm.Attribute> r1 = r1.attrs
            r2 = r11
            java.lang.Object r1 = r1.get(r2)
            org.objectweb.asm.Attribute r1 = (org.objectweb.asm.Attribute) r1
            r0.visitAttribute(r1)
            int r11 = r11 + 1
            goto L1a0
        L1bd:
            r0 = r8
            java.util.List<java.lang.String> r0 = r0.nestMembers
            if (r0 == 0) goto L1ee
            r0 = 0
            r11 = r0
            r0 = r8
            java.util.List<java.lang.String> r0 = r0.nestMembers
            int r0 = r0.size()
            r12 = r0
        L1d1:
            r0 = r11
            r1 = r12
            if (r0 >= r1) goto L1ee
            r0 = r9
            r1 = r8
            java.util.List<java.lang.String> r1 = r1.nestMembers
            r2 = r11
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            r0.visitNestMember(r1)
            int r11 = r11 + 1
            goto L1d1
        L1ee:
            r0 = r8
            java.util.List<java.lang.String> r0 = r0.permittedSubclasses
            if (r0 == 0) goto L21f
            r0 = 0
            r11 = r0
            r0 = r8
            java.util.List<java.lang.String> r0 = r0.permittedSubclasses
            int r0 = r0.size()
            r12 = r0
        L202:
            r0 = r11
            r1 = r12
            if (r0 >= r1) goto L21f
            r0 = r9
            r1 = r8
            java.util.List<java.lang.String> r1 = r1.permittedSubclasses
            r2 = r11
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            r0.visitPermittedSubclass(r1)
            int r11 = r11 + 1
            goto L202
        L21f:
            r0 = 0
            r11 = r0
            r0 = r8
            java.util.List<org.objectweb.asm.tree.InnerClassNode> r0 = r0.innerClasses
            int r0 = r0.size()
            r12 = r0
        L22c:
            r0 = r11
            r1 = r12
            if (r0 >= r1) goto L249
            r0 = r8
            java.util.List<org.objectweb.asm.tree.InnerClassNode> r0 = r0.innerClasses
            r1 = r11
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.InnerClassNode r0 = (org.objectweb.asm.tree.InnerClassNode) r0
            r1 = r9
            r0.accept(r1)
            int r11 = r11 + 1
            goto L22c
        L249:
            r0 = r8
            java.util.List<org.objectweb.asm.tree.RecordComponentNode> r0 = r0.recordComponents
            if (r0 == 0) goto L27a
            r0 = 0
            r11 = r0
            r0 = r8
            java.util.List<org.objectweb.asm.tree.RecordComponentNode> r0 = r0.recordComponents
            int r0 = r0.size()
            r12 = r0
        L25d:
            r0 = r11
            r1 = r12
            if (r0 >= r1) goto L27a
            r0 = r8
            java.util.List<org.objectweb.asm.tree.RecordComponentNode> r0 = r0.recordComponents
            r1 = r11
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.RecordComponentNode r0 = (org.objectweb.asm.tree.RecordComponentNode) r0
            r1 = r9
            r0.accept(r1)
            int r11 = r11 + 1
            goto L25d
        L27a:
            r0 = 0
            r11 = r0
            r0 = r8
            java.util.List<org.objectweb.asm.tree.FieldNode> r0 = r0.fields
            int r0 = r0.size()
            r12 = r0
        L287:
            r0 = r11
            r1 = r12
            if (r0 >= r1) goto L2a4
            r0 = r8
            java.util.List<org.objectweb.asm.tree.FieldNode> r0 = r0.fields
            r1 = r11
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.FieldNode r0 = (org.objectweb.asm.tree.FieldNode) r0
            r1 = r9
            r0.accept(r1)
            int r11 = r11 + 1
            goto L287
        L2a4:
            r0 = 0
            r11 = r0
            r0 = r8
            java.util.List<org.objectweb.asm.tree.MethodNode> r0 = r0.methods
            int r0 = r0.size()
            r12 = r0
        L2b1:
            r0 = r11
            r1 = r12
            if (r0 >= r1) goto L2ce
            r0 = r8
            java.util.List<org.objectweb.asm.tree.MethodNode> r0 = r0.methods
            r1 = r11
            java.lang.Object r0 = r0.get(r1)
            org.objectweb.asm.tree.MethodNode r0 = (org.objectweb.asm.tree.MethodNode) r0
            r1 = r9
            r0.accept(r1)
            int r11 = r11 + 1
            goto L2b1
        L2ce:
            r0 = r9
            r0.visitEnd()
            return
    }
}
