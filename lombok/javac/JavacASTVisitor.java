package lombok.javac;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/JavacASTVisitor.SCL.lombok */
public interface JavacASTVisitor {

    /* loaded from: com.usidqw.qwerklj.apk:lombok/javac/JavacASTVisitor$Printer.SCL.lombok */
    public static class Printer implements lombok.javac.JavacASTVisitor {
        private final java.io.PrintStream out;
        private final boolean printContent;
        private int disablePrinting;
        private int indent;

        public Printer(boolean r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                java.io.PrintStream r2 = java.lang.System.out
                r0.<init>(r1, r2)
                return
        }

        public Printer(boolean r4, java.io.PrintStream r5) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = 0
                r0.disablePrinting = r1
                r0 = r3
                r1 = 0
                r0.indent = r1
                r0 = r3
                r1 = r4
                r0.printContent = r1
                r0 = r3
                r1 = r5
                r0.out = r1
                return
        }

        @Override // lombok.javac.JavacASTVisitor
        public void setTrees(com.sun.source.util.Trees r2) {
                r1 = this;
                return
        }

        private void forcePrint(java.lang.String r5, java.lang.Object... r6) {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                r7 = r0
                r0 = 0
                r8 = r0
                goto L18
            Le:
                r0 = r7
                java.lang.String r1 = "  "
                java.lang.StringBuilder r0 = r0.append(r1)
                int r8 = r8 + 1
            L18:
                r0 = r8
                r1 = r4
                int r1 = r1.indent
                if (r0 < r1) goto Le
                r0 = r4
                java.io.PrintStream r0 = r0.out
                r1 = r7
                r2 = r5
                java.lang.StringBuilder r1 = r1.append(r2)
                r2 = 10
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r2 = r6
                java.io.PrintStream r0 = r0.printf(r1, r2)
                r0 = r4
                java.io.PrintStream r0 = r0.out
                r0.flush()
                return
        }

        private void print(java.lang.String r5, java.lang.Object... r6) {
                r4 = this;
                r0 = r4
                int r0 = r0.disablePrinting
                if (r0 != 0) goto Ld
                r0 = r4
                r1 = r5
                r2 = r6
                r0.forcePrint(r1, r2)
            Ld:
                return
        }

        @Override // lombok.javac.JavacASTVisitor
        public void visitCompilationUnit(lombok.javac.JavacNode r8, com.sun.tools.javac.tree.JCTree.JCCompilationUnit r9) {
                r7 = this;
                r0 = r7
                java.io.PrintStream r0 = r0.out
                java.lang.String r1 = "---------------------------------------------------------"
                r0.println(r1)
                r0 = r7
                java.lang.String r1 = "<CU %s>"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r8
                java.lang.String r5 = r5.getFileName()
                r3[r4] = r5
                r0.print(r1, r2)
                r0 = r7
                r1 = r0
                int r1 = r1.indent
                r2 = 1
                int r1 = r1 + r2
                r0.indent = r1
                return
        }

        @Override // lombok.javac.JavacASTVisitor
        public void endVisitCompilationUnit(lombok.javac.JavacNode r5, com.sun.tools.javac.tree.JCTree.JCCompilationUnit r6) {
                r4 = this;
                r0 = r4
                r1 = r0
                int r1 = r1.indent
                r2 = 1
                int r1 = r1 - r2
                r0.indent = r1
                r0 = r4
                java.lang.String r1 = "</CUD>"
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r0.print(r1, r2)
                return
        }

        private java.lang.String printFlags(long r4) {
                r3 = this;
                r0 = r4
                java.lang.String r0 = com.sun.tools.javac.code.Flags.toString(r0)
                return r0
        }

        @Override // lombok.javac.JavacASTVisitor
        public void visitType(lombok.javac.JavacNode r10, com.sun.tools.javac.tree.JCTree.JCClassDecl r11) {
                r9 = this;
                r0 = r9
                java.lang.String r1 = "<TYPE %s> %s"
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r11
                com.sun.tools.javac.util.Name r5 = r5.name
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r9
                r6 = r11
                com.sun.tools.javac.tree.JCTree$JCModifiers r6 = r6.mods
                long r6 = r6.flags
                java.lang.String r5 = r5.printFlags(r6)
                r3[r4] = r5
                r0.print(r1, r2)
                r0 = r9
                r1 = r0
                int r1 = r1.indent
                r2 = 1
                int r1 = r1 + r2
                r0.indent = r1
                r0 = r9
                boolean r0 = r0.printContent
                if (r0 == 0) goto L48
                r0 = r9
                java.lang.String r1 = "%s"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r11
                r3[r4] = r5
                r0.print(r1, r2)
                r0 = r9
                r1 = r0
                int r1 = r1.disablePrinting
                r2 = 1
                int r1 = r1 + r2
                r0.disablePrinting = r1
            L48:
                return
        }

        @Override // lombok.javac.JavacASTVisitor
        public void visitAnnotationOnType(com.sun.tools.javac.tree.JCTree.JCClassDecl r8, lombok.javac.JavacNode r9, com.sun.tools.javac.tree.JCTree.JCAnnotation r10) {
                r7 = this;
                r0 = r7
                java.lang.String r1 = "<ANNOTATION: %s />"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r10
                r3[r4] = r5
                r0.forcePrint(r1, r2)
                return
        }

        @Override // lombok.javac.JavacASTVisitor
        public void endVisitType(lombok.javac.JavacNode r8, com.sun.tools.javac.tree.JCTree.JCClassDecl r9) {
                r7 = this;
                r0 = r7
                boolean r0 = r0.printContent
                if (r0 == 0) goto L11
                r0 = r7
                r1 = r0
                int r1 = r1.disablePrinting
                r2 = 1
                int r1 = r1 - r2
                r0.disablePrinting = r1
            L11:
                r0 = r7
                r1 = r0
                int r1 = r1.indent
                r2 = 1
                int r1 = r1 - r2
                r0.indent = r1
                r0 = r7
                java.lang.String r1 = "</TYPE %s>"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r9
                com.sun.tools.javac.util.Name r5 = r5.name
                r3[r4] = r5
                r0.print(r1, r2)
                return
        }

        @Override // lombok.javac.JavacASTVisitor
        public void visitInitializer(lombok.javac.JavacNode r8, com.sun.tools.javac.tree.JCTree.JCBlock r9) {
                r7 = this;
                r0 = r7
                java.lang.String r1 = "<%s INITIALIZER>"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r9
                boolean r5 = r5.isStatic()
                if (r5 == 0) goto L15
                java.lang.String r5 = "static"
                goto L17
            L15:
                java.lang.String r5 = "instance"
            L17:
                r3[r4] = r5
                r0.print(r1, r2)
                r0 = r7
                r1 = r0
                int r1 = r1.indent
                r2 = 1
                int r1 = r1 + r2
                r0.indent = r1
                r0 = r7
                boolean r0 = r0.printContent
                if (r0 == 0) goto L44
                r0 = r7
                java.lang.String r1 = "%s"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r9
                r3[r4] = r5
                r0.print(r1, r2)
                r0 = r7
                r1 = r0
                int r1 = r1.disablePrinting
                r2 = 1
                int r1 = r1 + r2
                r0.disablePrinting = r1
            L44:
                return
        }

        @Override // lombok.javac.JavacASTVisitor
        public void endVisitInitializer(lombok.javac.JavacNode r8, com.sun.tools.javac.tree.JCTree.JCBlock r9) {
                r7 = this;
                r0 = r7
                boolean r0 = r0.printContent
                if (r0 == 0) goto L11
                r0 = r7
                r1 = r0
                int r1 = r1.disablePrinting
                r2 = 1
                int r1 = r1 - r2
                r0.disablePrinting = r1
            L11:
                r0 = r7
                r1 = r0
                int r1 = r1.indent
                r2 = 1
                int r1 = r1 - r2
                r0.indent = r1
                r0 = r7
                java.lang.String r1 = "</%s INITIALIZER>"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r9
                boolean r5 = r5.isStatic()
                if (r5 == 0) goto L30
                java.lang.String r5 = "static"
                goto L32
            L30:
                java.lang.String r5 = "instance"
            L32:
                r3[r4] = r5
                r0.print(r1, r2)
                return
        }

        @Override // lombok.javac.JavacASTVisitor
        public void visitField(lombok.javac.JavacNode r10, com.sun.tools.javac.tree.JCTree.JCVariableDecl r11) {
                r9 = this;
                r0 = r9
                java.lang.String r1 = "<FIELD %s %s> %s"
                r2 = 3
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r11
                com.sun.tools.javac.tree.JCTree$JCExpression r5 = r5.vartype
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r11
                com.sun.tools.javac.util.Name r5 = r5.name
                r3[r4] = r5
                r3 = r2
                r4 = 2
                r5 = r9
                r6 = r11
                com.sun.tools.javac.tree.JCTree$JCModifiers r6 = r6.mods
                long r6 = r6.flags
                java.lang.String r5 = r5.printFlags(r6)
                r3[r4] = r5
                r0.print(r1, r2)
                r0 = r9
                r1 = r0
                int r1 = r1.indent
                r2 = 1
                int r1 = r1 + r2
                r0.indent = r1
                r0 = r9
                boolean r0 = r0.printContent
                if (r0 == 0) goto L59
                r0 = r11
                com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.init
                if (r0 == 0) goto L4f
                r0 = r9
                java.lang.String r1 = "%s"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r11
                com.sun.tools.javac.tree.JCTree$JCExpression r5 = r5.init
                r3[r4] = r5
                r0.print(r1, r2)
            L4f:
                r0 = r9
                r1 = r0
                int r1 = r1.disablePrinting
                r2 = 1
                int r1 = r1 + r2
                r0.disablePrinting = r1
            L59:
                return
        }

        @Override // lombok.javac.JavacASTVisitor
        public void visitAnnotationOnField(com.sun.tools.javac.tree.JCTree.JCVariableDecl r8, lombok.javac.JavacNode r9, com.sun.tools.javac.tree.JCTree.JCAnnotation r10) {
                r7 = this;
                r0 = r7
                java.lang.String r1 = "<ANNOTATION: %s />"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r10
                r3[r4] = r5
                r0.forcePrint(r1, r2)
                return
        }

        @Override // lombok.javac.JavacASTVisitor
        public void endVisitField(lombok.javac.JavacNode r8, com.sun.tools.javac.tree.JCTree.JCVariableDecl r9) {
                r7 = this;
                r0 = r7
                boolean r0 = r0.printContent
                if (r0 == 0) goto L11
                r0 = r7
                r1 = r0
                int r1 = r1.disablePrinting
                r2 = 1
                int r1 = r1 - r2
                r0.disablePrinting = r1
            L11:
                r0 = r7
                r1 = r0
                int r1 = r1.indent
                r2 = 1
                int r1 = r1 - r2
                r0.indent = r1
                r0 = r7
                java.lang.String r1 = "</FIELD %s %s>"
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r9
                com.sun.tools.javac.tree.JCTree$JCExpression r5 = r5.vartype
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r9
                com.sun.tools.javac.util.Name r5 = r5.name
                r3[r4] = r5
                r0.print(r1, r2)
                return
        }

        @Override // lombok.javac.JavacASTVisitor
        public void visitMethod(lombok.javac.JavacNode r10, com.sun.tools.javac.tree.JCTree.JCMethodDecl r11) {
                r9 = this;
                r0 = r11
                com.sun.tools.javac.util.Name r0 = r0.name
                java.lang.String r1 = "<init>"
                boolean r0 = r0.contentEquals(r1)
                if (r0 == 0) goto L28
                r0 = r11
                com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
                long r0 = r0.flags
                r1 = 68719476736(0x1000000000, double:3.39519326554E-313)
                long r0 = r0 & r1
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L22
                java.lang.String r0 = "DEFAULTCONSTRUCTOR"
                r12 = r0
                goto L2b
            L22:
                java.lang.String r0 = "CONSTRUCTOR"
                r12 = r0
                goto L2b
            L28:
                java.lang.String r0 = "METHOD"
                r12 = r0
            L2b:
                r0 = r9
                java.lang.String r1 = "<%s %s> %s returns: %s"
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r12
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r11
                com.sun.tools.javac.util.Name r5 = r5.name
                r3[r4] = r5
                r3 = r2
                r4 = 2
                r5 = r9
                r6 = r11
                com.sun.tools.javac.tree.JCTree$JCModifiers r6 = r6.mods
                long r6 = r6.flags
                java.lang.String r5 = r5.printFlags(r6)
                r3[r4] = r5
                r3 = r2
                r4 = 3
                r5 = r11
                com.sun.tools.javac.tree.JCTree$JCExpression r5 = r5.restype
                r3[r4] = r5
                r0.print(r1, r2)
                r0 = r9
                r1 = r0
                int r1 = r1.indent
                r2 = 1
                int r1 = r1 + r2
                r0.indent = r1
                java.lang.Class<com.sun.tools.javac.tree.JCTree$JCMethodDecl> r0 = com.sun.tools.javac.tree.JCTree.JCMethodDecl.class
                java.lang.String r1 = "recvparam"
                java.lang.reflect.Field r0 = r0.getField(r1)     // Catch: java.lang.Exception -> L76
                r14 = r0
                r0 = r14
                r1 = r11
                java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L76
                com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0     // Catch: java.lang.Exception -> L76
                r13 = r0
                goto L7a
            L76:
                r0 = 0
                r13 = r0
            L7a:
                r0 = r13
                if (r0 == 0) goto L155
                r0 = r13
                com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
                com.sun.tools.javac.util.List r0 = r0.annotations
                r14 = r0
                r0 = r13
                com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
                if (r0 == 0) goto L9b
                r0 = r13
                com.sun.tools.javac.tree.JCTree$JCModifiers r0 = r0.mods
                com.sun.tools.javac.util.List r0 = r0.annotations
                r14 = r0
            L9b:
                r0 = r14
                if (r0 == 0) goto Lac
                r0 = r14
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto Lac
                r0 = 1
                goto Lad
            Lac:
                r0 = 0
            Lad:
                r15 = r0
                r0 = r9
                java.lang.String r1 = "<RECEIVER-PARAM (%s) %s %s%s> %s"
                r2 = 5
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r13
                com.sun.tools.javac.tree.JCTree$JCExpression r5 = r5.vartype
                if (r5 != 0) goto Lc5
                java.lang.String r5 = "null"
                goto Ld0
            Lc5:
                r5 = r13
                com.sun.tools.javac.tree.JCTree$JCExpression r5 = r5.vartype
                java.lang.Class r5 = r5.getClass()
                java.lang.String r5 = r5.toString()
            Ld0:
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r13
                com.sun.tools.javac.tree.JCTree$JCExpression r5 = r5.vartype
                r3[r4] = r5
                r3 = r2
                r4 = 2
                r5 = r13
                com.sun.tools.javac.util.Name r5 = r5.name
                r3[r4] = r5
                r3 = r2
                r4 = 3
                r5 = r15
                if (r5 == 0) goto Led
                java.lang.String r5 = ""
                goto Lef
            Led:
                java.lang.String r5 = " /"
            Lef:
                r3[r4] = r5
                r3 = r2
                r4 = 4
                r5 = r9
                r6 = r13
                com.sun.tools.javac.tree.JCTree$JCModifiers r6 = r6.mods
                long r6 = r6.flags
                java.lang.String r5 = r5.printFlags(r6)
                r3[r4] = r5
                r0.print(r1, r2)
                r0 = r15
                if (r0 == 0) goto L155
                r0 = r9
                r1 = r0
                int r1 = r1.indent
                r2 = 1
                int r1 = r1 + r2
                r0.indent = r1
                r0 = r14
                java.util.Iterator r0 = r0.iterator()
                r17 = r0
                goto L136
            L11b:
                r0 = r17
                java.lang.Object r0 = r0.next()
                com.sun.tools.javac.tree.JCTree$JCAnnotation r0 = (com.sun.tools.javac.tree.JCTree.JCAnnotation) r0
                r16 = r0
                r0 = r9
                java.lang.String r1 = "<ANNOTATION: %s />"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r16
                r3[r4] = r5
                r0.print(r1, r2)
            L136:
                r0 = r17
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L11b
                r0 = r9
                r1 = r0
                int r1 = r1.indent
                r2 = 1
                int r1 = r1 - r2
                r0.indent = r1
                r0 = r9
                java.lang.String r1 = "</RECEIVER-PARAM>"
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r0.print(r1, r2)
            L155:
                r0 = r9
                boolean r0 = r0.printContent
                if (r0 == 0) goto L18c
                r0 = r11
                com.sun.tools.javac.tree.JCTree$JCBlock r0 = r0.body
                if (r0 != 0) goto L171
                r0 = r9
                java.lang.String r1 = "(ABSTRACT)"
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r0.print(r1, r2)
                goto L182
            L171:
                r0 = r9
                java.lang.String r1 = "%s"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r11
                com.sun.tools.javac.tree.JCTree$JCBlock r5 = r5.body
                r3[r4] = r5
                r0.print(r1, r2)
            L182:
                r0 = r9
                r1 = r0
                int r1 = r1.disablePrinting
                r2 = 1
                int r1 = r1 + r2
                r0.disablePrinting = r1
            L18c:
                return
        }

        @Override // lombok.javac.JavacASTVisitor
        public void visitAnnotationOnMethod(com.sun.tools.javac.tree.JCTree.JCMethodDecl r8, lombok.javac.JavacNode r9, com.sun.tools.javac.tree.JCTree.JCAnnotation r10) {
                r7 = this;
                r0 = r7
                java.lang.String r1 = "<ANNOTATION: %s />"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r10
                r3[r4] = r5
                r0.forcePrint(r1, r2)
                return
        }

        @Override // lombok.javac.JavacASTVisitor
        public void endVisitMethod(lombok.javac.JavacNode r8, com.sun.tools.javac.tree.JCTree.JCMethodDecl r9) {
                r7 = this;
                r0 = r7
                boolean r0 = r0.printContent
                if (r0 == 0) goto L11
                r0 = r7
                r1 = r0
                int r1 = r1.disablePrinting
                r2 = 1
                int r1 = r1 - r2
                r0.disablePrinting = r1
            L11:
                r0 = r7
                r1 = r0
                int r1 = r1.indent
                r2 = 1
                int r1 = r1 - r2
                r0.indent = r1
                r0 = r7
                java.lang.String r1 = "</%s %s>"
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                java.lang.String r5 = "METHOD"
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r9
                com.sun.tools.javac.util.Name r5 = r5.name
                r3[r4] = r5
                r0.print(r1, r2)
                return
        }

        @Override // lombok.javac.JavacASTVisitor
        public void visitMethodArgument(lombok.javac.JavacNode r10, com.sun.tools.javac.tree.JCTree.JCVariableDecl r11, com.sun.tools.javac.tree.JCTree.JCMethodDecl r12) {
                r9 = this;
                r0 = r9
                java.lang.String r1 = "<METHODARG (%s) %s %s> %s"
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r11
                com.sun.tools.javac.tree.JCTree$JCExpression r5 = r5.vartype
                java.lang.Class r5 = r5.getClass()
                java.lang.String r5 = r5.toString()
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r11
                com.sun.tools.javac.tree.JCTree$JCExpression r5 = r5.vartype
                r3[r4] = r5
                r3 = r2
                r4 = 2
                r5 = r11
                com.sun.tools.javac.util.Name r5 = r5.name
                r3[r4] = r5
                r3 = r2
                r4 = 3
                r5 = r9
                r6 = r11
                com.sun.tools.javac.tree.JCTree$JCModifiers r6 = r6.mods
                long r6 = r6.flags
                java.lang.String r5 = r5.printFlags(r6)
                r3[r4] = r5
                r0.print(r1, r2)
                r0 = r9
                r1 = r0
                int r1 = r1.indent
                r2 = 1
                int r1 = r1 + r2
                r0.indent = r1
                return
        }

        @Override // lombok.javac.JavacASTVisitor
        public void visitAnnotationOnMethodArgument(com.sun.tools.javac.tree.JCTree.JCVariableDecl r8, com.sun.tools.javac.tree.JCTree.JCMethodDecl r9, lombok.javac.JavacNode r10, com.sun.tools.javac.tree.JCTree.JCAnnotation r11) {
                r7 = this;
                r0 = r7
                java.lang.String r1 = "<ANNOTATION: %s />"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r11
                r3[r4] = r5
                r0.forcePrint(r1, r2)
                return
        }

        @Override // lombok.javac.JavacASTVisitor
        public void endVisitMethodArgument(lombok.javac.JavacNode r8, com.sun.tools.javac.tree.JCTree.JCVariableDecl r9, com.sun.tools.javac.tree.JCTree.JCMethodDecl r10) {
                r7 = this;
                r0 = r7
                r1 = r0
                int r1 = r1.indent
                r2 = 1
                int r1 = r1 - r2
                r0.indent = r1
                r0 = r7
                java.lang.String r1 = "</METHODARG %s %s>"
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r9
                com.sun.tools.javac.tree.JCTree$JCExpression r5 = r5.vartype
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r9
                com.sun.tools.javac.util.Name r5 = r5.name
                r3[r4] = r5
                r0.print(r1, r2)
                return
        }

        @Override // lombok.javac.JavacASTVisitor
        public void visitLocal(lombok.javac.JavacNode r10, com.sun.tools.javac.tree.JCTree.JCVariableDecl r11) {
                r9 = this;
                r0 = r9
                java.lang.String r1 = "<LOCAL %s %s> %s"
                r2 = 3
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r11
                com.sun.tools.javac.tree.JCTree$JCExpression r5 = r5.vartype
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r11
                com.sun.tools.javac.util.Name r5 = r5.name
                r3[r4] = r5
                r3 = r2
                r4 = 2
                r5 = r9
                r6 = r11
                com.sun.tools.javac.tree.JCTree$JCModifiers r6 = r6.mods
                long r6 = r6.flags
                java.lang.String r5 = r5.printFlags(r6)
                r3[r4] = r5
                r0.print(r1, r2)
                r0 = r9
                r1 = r0
                int r1 = r1.indent
                r2 = 1
                int r1 = r1 + r2
                r0.indent = r1
                return
        }

        @Override // lombok.javac.JavacASTVisitor
        public void visitAnnotationOnLocal(com.sun.tools.javac.tree.JCTree.JCVariableDecl r8, lombok.javac.JavacNode r9, com.sun.tools.javac.tree.JCTree.JCAnnotation r10) {
                r7 = this;
                r0 = r7
                java.lang.String r1 = "<ANNOTATION: %s />"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r10
                r3[r4] = r5
                r0.print(r1, r2)
                return
        }

        @Override // lombok.javac.JavacASTVisitor
        public void endVisitLocal(lombok.javac.JavacNode r8, com.sun.tools.javac.tree.JCTree.JCVariableDecl r9) {
                r7 = this;
                r0 = r7
                r1 = r0
                int r1 = r1.indent
                r2 = 1
                int r1 = r1 - r2
                r0.indent = r1
                r0 = r7
                java.lang.String r1 = "</LOCAL %s %s>"
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r9
                com.sun.tools.javac.tree.JCTree$JCExpression r5 = r5.vartype
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r9
                com.sun.tools.javac.util.Name r5 = r5.name
                r3[r4] = r5
                r0.print(r1, r2)
                return
        }

        @Override // lombok.javac.JavacASTVisitor
        public void visitTypeUse(lombok.javac.JavacNode r8, com.sun.tools.javac.tree.JCTree r9) {
                r7 = this;
                r0 = r7
                java.lang.String r1 = "<TYPE %s>"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r9
                java.lang.Class r5 = r5.getClass()
                r3[r4] = r5
                r0.print(r1, r2)
                r0 = r7
                r1 = r0
                int r1 = r1.indent
                r2 = 1
                int r1 = r1 + r2
                r0.indent = r1
                r0 = r7
                java.lang.String r1 = "%s"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r9
                r3[r4] = r5
                r0.print(r1, r2)
                return
        }

        @Override // lombok.javac.JavacASTVisitor
        public void visitAnnotationOnTypeUse(com.sun.tools.javac.tree.JCTree r8, lombok.javac.JavacNode r9, com.sun.tools.javac.tree.JCTree.JCAnnotation r10) {
                r7 = this;
                r0 = r7
                java.lang.String r1 = "<ANNOTATION: %s />"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r10
                r3[r4] = r5
                r0.print(r1, r2)
                return
        }

        @Override // lombok.javac.JavacASTVisitor
        public void endVisitTypeUse(lombok.javac.JavacNode r8, com.sun.tools.javac.tree.JCTree r9) {
                r7 = this;
                r0 = r7
                r1 = r0
                int r1 = r1.indent
                r2 = 1
                int r1 = r1 - r2
                r0.indent = r1
                r0 = r7
                java.lang.String r1 = "</TYPE %s>"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r9
                java.lang.Class r5 = r5.getClass()
                r3[r4] = r5
                r0.print(r1, r2)
                return
        }

        @Override // lombok.javac.JavacASTVisitor
        public void visitStatement(lombok.javac.JavacNode r8, com.sun.tools.javac.tree.JCTree r9) {
                r7 = this;
                r0 = r7
                java.lang.String r1 = "<%s>"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r9
                java.lang.Class r5 = r5.getClass()
                r3[r4] = r5
                r0.print(r1, r2)
                r0 = r7
                r1 = r0
                int r1 = r1.indent
                r2 = 1
                int r1 = r1 + r2
                r0.indent = r1
                r0 = r7
                java.lang.String r1 = "%s"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r9
                r3[r4] = r5
                r0.print(r1, r2)
                return
        }

        @Override // lombok.javac.JavacASTVisitor
        public void endVisitStatement(lombok.javac.JavacNode r8, com.sun.tools.javac.tree.JCTree r9) {
                r7 = this;
                r0 = r7
                r1 = r0
                int r1 = r1.indent
                r2 = 1
                int r1 = r1 - r2
                r0.indent = r1
                r0 = r7
                java.lang.String r1 = "</%s>"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r9
                java.lang.Class r5 = r5.getClass()
                r3[r4] = r5
                r0.print(r1, r2)
                return
        }
    }

    void setTrees(com.sun.source.util.Trees r1);

    void visitCompilationUnit(lombok.javac.JavacNode r1, com.sun.tools.javac.tree.JCTree.JCCompilationUnit r2);

    void endVisitCompilationUnit(lombok.javac.JavacNode r1, com.sun.tools.javac.tree.JCTree.JCCompilationUnit r2);

    void visitType(lombok.javac.JavacNode r1, com.sun.tools.javac.tree.JCTree.JCClassDecl r2);

    void visitAnnotationOnType(com.sun.tools.javac.tree.JCTree.JCClassDecl r1, lombok.javac.JavacNode r2, com.sun.tools.javac.tree.JCTree.JCAnnotation r3);

    void endVisitType(lombok.javac.JavacNode r1, com.sun.tools.javac.tree.JCTree.JCClassDecl r2);

    void visitField(lombok.javac.JavacNode r1, com.sun.tools.javac.tree.JCTree.JCVariableDecl r2);

    void visitAnnotationOnField(com.sun.tools.javac.tree.JCTree.JCVariableDecl r1, lombok.javac.JavacNode r2, com.sun.tools.javac.tree.JCTree.JCAnnotation r3);

    void endVisitField(lombok.javac.JavacNode r1, com.sun.tools.javac.tree.JCTree.JCVariableDecl r2);

    void visitInitializer(lombok.javac.JavacNode r1, com.sun.tools.javac.tree.JCTree.JCBlock r2);

    void endVisitInitializer(lombok.javac.JavacNode r1, com.sun.tools.javac.tree.JCTree.JCBlock r2);

    void visitMethod(lombok.javac.JavacNode r1, com.sun.tools.javac.tree.JCTree.JCMethodDecl r2);

    void visitAnnotationOnMethod(com.sun.tools.javac.tree.JCTree.JCMethodDecl r1, lombok.javac.JavacNode r2, com.sun.tools.javac.tree.JCTree.JCAnnotation r3);

    void endVisitMethod(lombok.javac.JavacNode r1, com.sun.tools.javac.tree.JCTree.JCMethodDecl r2);

    void visitMethodArgument(lombok.javac.JavacNode r1, com.sun.tools.javac.tree.JCTree.JCVariableDecl r2, com.sun.tools.javac.tree.JCTree.JCMethodDecl r3);

    void visitAnnotationOnMethodArgument(com.sun.tools.javac.tree.JCTree.JCVariableDecl r1, com.sun.tools.javac.tree.JCTree.JCMethodDecl r2, lombok.javac.JavacNode r3, com.sun.tools.javac.tree.JCTree.JCAnnotation r4);

    void endVisitMethodArgument(lombok.javac.JavacNode r1, com.sun.tools.javac.tree.JCTree.JCVariableDecl r2, com.sun.tools.javac.tree.JCTree.JCMethodDecl r3);

    void visitLocal(lombok.javac.JavacNode r1, com.sun.tools.javac.tree.JCTree.JCVariableDecl r2);

    void visitAnnotationOnLocal(com.sun.tools.javac.tree.JCTree.JCVariableDecl r1, lombok.javac.JavacNode r2, com.sun.tools.javac.tree.JCTree.JCAnnotation r3);

    void endVisitLocal(lombok.javac.JavacNode r1, com.sun.tools.javac.tree.JCTree.JCVariableDecl r2);

    void visitTypeUse(lombok.javac.JavacNode r1, com.sun.tools.javac.tree.JCTree r2);

    void visitAnnotationOnTypeUse(com.sun.tools.javac.tree.JCTree r1, lombok.javac.JavacNode r2, com.sun.tools.javac.tree.JCTree.JCAnnotation r3);

    void endVisitTypeUse(lombok.javac.JavacNode r1, com.sun.tools.javac.tree.JCTree r2);

    void visitStatement(lombok.javac.JavacNode r1, com.sun.tools.javac.tree.JCTree r2);

    void endVisitStatement(lombok.javac.JavacNode r1, com.sun.tools.javac.tree.JCTree r2);
}
