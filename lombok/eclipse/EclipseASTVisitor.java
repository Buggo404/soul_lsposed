package lombok.eclipse;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/EclipseASTVisitor.SCL.lombok */
public interface EclipseASTVisitor {

    /* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/EclipseASTVisitor$Printer.SCL.lombok */
    public static class Printer implements lombok.eclipse.EclipseASTVisitor {
        private final java.io.PrintStream out;
        private final boolean printContent;
        private int disablePrinting;
        private int indent;
        private boolean printClassNames;
        private final boolean printPositions;

        public boolean deferUntilPostDiet() {
                r2 = this;
                r0 = 0
                return r0
        }

        public Printer(boolean r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                java.io.PrintStream r2 = java.lang.System.out
                r3 = 0
                r0.<init>(r1, r2, r3)
                return
        }

        public Printer(boolean r4, java.io.PrintStream r5, boolean r6) {
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
                r1 = 0
                r0.printClassNames = r1
                r0 = r3
                r1 = r4
                r0.printContent = r1
                r0 = r3
                r1 = r5
                r0.out = r1
                r0 = r3
                r1 = r6
                r0.printPositions = r1
                return
        }

        private void forcePrint(java.lang.String r6, java.lang.Object... r7) {
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                r8 = r0
                r0 = 0
                r9 = r0
                goto L18
            Le:
                r0 = r8
                java.lang.String r1 = "  "
                java.lang.StringBuilder r0 = r0.append(r1)
                int r9 = r9 + 1
            L18:
                r0 = r9
                r1 = r5
                int r1 = r1.indent
                if (r0 < r1) goto Le
                r0 = r8
                r1 = r6
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r5
                boolean r0 = r0.printClassNames
                if (r0 == 0) goto La5
                r0 = r7
                int r0 = r0.length
                if (r0 <= 0) goto La5
                r0 = r8
                java.lang.String r1 = " ["
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = 0
                r10 = r0
                goto L56
            L40:
                r0 = r10
                if (r0 <= 0) goto L4c
                r0 = r8
                java.lang.String r1 = ", "
                java.lang.StringBuilder r0 = r0.append(r1)
            L4c:
                r0 = r8
                java.lang.String r1 = "%s"
                java.lang.StringBuilder r0 = r0.append(r1)
                int r10 = r10 + 1
            L56:
                r0 = r10
                r1 = r7
                int r1 = r1.length
                if (r0 < r1) goto L40
                r0 = r8
                java.lang.String r1 = "]"
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r7
                int r0 = r0.length
                r1 = r7
                int r1 = r1.length
                int r0 = r0 + r1
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r9 = r0
                r0 = 0
                r10 = r0
                goto L9b
            L74:
                r0 = r9
                r1 = r10
                r2 = r7
                r3 = r10
                r2 = r2[r3]
                r0[r1] = r2
                r0 = r9
                r1 = r10
                r2 = r7
                int r2 = r2.length
                int r1 = r1 + r2
                r2 = r7
                r3 = r10
                r2 = r2[r3]
                if (r2 != 0) goto L90
                java.lang.String r2 = "NULL "
                goto L97
            L90:
                r2 = r7
                r3 = r10
                r2 = r2[r3]
                java.lang.Class r2 = r2.getClass()
            L97:
                r0[r1] = r2
                int r10 = r10 + 1
            L9b:
                r0 = r10
                r1 = r7
                int r1 = r1.length
                if (r0 < r1) goto L74
                goto La8
            La5:
                r0 = r7
                r9 = r0
            La8:
                r0 = r8
                java.lang.String r1 = "\n"
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r5
                java.io.PrintStream r0 = r0.out
                r1 = r8
                java.lang.String r1 = r1.toString()
                r2 = r9
                java.io.PrintStream r0 = r0.printf(r1, r2)
                r0 = r5
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

        private java.lang.String str(char[] r5) {
                r4 = this;
                r0 = r5
                if (r0 != 0) goto L7
                java.lang.String r0 = "(NULL)"
                return r0
            L7:
                java.lang.String r0 = new java.lang.String
                r1 = r0
                r2 = r5
                r1.<init>(r2)
                return r0
        }

        private java.lang.String str(org.eclipse.jdt.internal.compiler.ast.TypeReference r6) {
                r5 = this;
                r0 = r6
                if (r0 != 0) goto L7
                java.lang.String r0 = "(NULL)"
                return r0
            L7:
                r0 = r6
                char[][] r0 = r0.getTypeName()
                r7 = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                r8 = r0
                r0 = 1
                r9 = r0
                r0 = r7
                r1 = r0
                r13 = r1
                int r0 = r0.length
                r12 = r0
                r0 = 0
                r11 = r0
                goto L4e
            L24:
                r0 = r13
                r1 = r11
                r0 = r0[r1]
                r10 = r0
                r0 = r8
                r1 = r9
                if (r1 == 0) goto L36
                java.lang.String r1 = ""
                goto L38
            L36:
                java.lang.String r1 = "."
            L38:
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = new java.lang.String
                r2 = r1
                r3 = r10
                r2.<init>(r3)
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = 0
                r9 = r0
                int r11 = r11 + 1
            L4e:
                r0 = r11
                r1 = r12
                if (r0 < r1) goto L24
                r0 = r8
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // lombok.eclipse.EclipseASTVisitor
        public void visitCompilationUnit(lombok.eclipse.EclipseNode r9, org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r10) {
                r8 = this;
                r0 = r8
                java.io.PrintStream r0 = r0.out
                java.lang.String r1 = "---------------------------------------------------------"
                r0.println(r1)
                r0 = r8
                java.io.PrintStream r0 = r0.out
                r1 = r9
                boolean r1 = r1.isCompleteParse()
                if (r1 == 0) goto L19
                java.lang.String r1 = "COMPLETE"
                goto L1b
            L19:
                java.lang.String r1 = "incomplete"
            L1b:
                r0.println(r1)
                r0 = r8
                java.lang.String r1 = "<CUD %s%s%s>"
                r2 = 3
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r9
                java.lang.String r5 = r5.getFileName()
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r10
                boolean r5 = lombok.eclipse.handlers.EclipseHandlerUtil.isGenerated(r5)
                if (r5 == 0) goto L3a
                java.lang.String r5 = " (GENERATED)"
                goto L3c
            L3a:
                java.lang.String r5 = ""
            L3c:
                r3[r4] = r5
                r3 = r2
                r4 = 2
                r5 = r8
                r6 = r9
                java.lang.String r5 = r5.position(r6)
                r3[r4] = r5
                r0.print(r1, r2)
                r0 = r8
                r1 = r0
                int r1 = r1.indent
                r2 = 1
                int r1 = r1 + r2
                r0.indent = r1
                return
        }

        @Override // lombok.eclipse.EclipseASTVisitor
        public void endVisitCompilationUnit(lombok.eclipse.EclipseNode r5, org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r6) {
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

        private java.lang.String printFlags(int r8, org.eclipse.jdt.internal.compiler.ast.ASTNode r9) {
                r7 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                r10 = r0
                r0 = r8
                r1 = 1
                r0 = r0 & r1
                if (r0 == 0) goto L1a
                r0 = r8
                r1 = -2
                r0 = r0 & r1
                r8 = r0
                r0 = r10
                java.lang.String r1 = "public "
                java.lang.StringBuilder r0 = r0.append(r1)
            L1a:
                r0 = r8
                r1 = 2
                r0 = r0 & r1
                if (r0 == 0) goto L2c
                r0 = r8
                r1 = -3
                r0 = r0 & r1
                r8 = r0
                r0 = r10
                java.lang.String r1 = "private "
                java.lang.StringBuilder r0 = r0.append(r1)
            L2c:
                r0 = r8
                r1 = 4
                r0 = r0 & r1
                if (r0 == 0) goto L3e
                r0 = r8
                r1 = -5
                r0 = r0 & r1
                r8 = r0
                r0 = r10
                java.lang.String r1 = "protected "
                java.lang.StringBuilder r0 = r0.append(r1)
            L3e:
                r0 = r8
                r1 = 8
                r0 = r0 & r1
                if (r0 == 0) goto L51
                r0 = r8
                r1 = -9
                r0 = r0 & r1
                r8 = r0
                r0 = r10
                java.lang.String r1 = "static "
                java.lang.StringBuilder r0 = r0.append(r1)
            L51:
                r0 = r8
                r1 = 16
                r0 = r0 & r1
                if (r0 == 0) goto L64
                r0 = r8
                r1 = -17
                r0 = r0 & r1
                r8 = r0
                r0 = r10
                java.lang.String r1 = "final "
                java.lang.StringBuilder r0 = r0.append(r1)
            L64:
                r0 = r8
                r1 = 32
                r0 = r0 & r1
                if (r0 == 0) goto L77
                r0 = r8
                r1 = -33
                r0 = r0 & r1
                r8 = r0
                r0 = r10
                java.lang.String r1 = "synchronized "
                java.lang.StringBuilder r0 = r0.append(r1)
            L77:
                r0 = r8
                r1 = 256(0x100, float:3.59E-43)
                r0 = r0 & r1
                if (r0 == 0) goto L8c
                r0 = r8
                r1 = -257(0xfffffffffffffeff, float:NaN)
                r0 = r0 & r1
                r8 = r0
                r0 = r10
                java.lang.String r1 = "native "
                java.lang.StringBuilder r0 = r0.append(r1)
            L8c:
                r0 = r8
                r1 = 512(0x200, float:7.175E-43)
                r0 = r0 & r1
                if (r0 == 0) goto La1
                r0 = r8
                r1 = -513(0xfffffffffffffdff, float:NaN)
                r0 = r0 & r1
                r8 = r0
                r0 = r10
                java.lang.String r1 = "interface "
                java.lang.StringBuilder r0 = r0.append(r1)
            La1:
                r0 = r8
                r1 = 1024(0x400, float:1.435E-42)
                r0 = r0 & r1
                if (r0 == 0) goto Lb6
                r0 = r8
                r1 = -1025(0xfffffffffffffbff, float:NaN)
                r0 = r0 & r1
                r8 = r0
                r0 = r10
                java.lang.String r1 = "abstract "
                java.lang.StringBuilder r0 = r0.append(r1)
            Lb6:
                r0 = r8
                r1 = 2048(0x800, float:2.87E-42)
                r0 = r0 & r1
                if (r0 == 0) goto Lcb
                r0 = r8
                r1 = -2049(0xfffffffffffff7ff, float:NaN)
                r0 = r0 & r1
                r8 = r0
                r0 = r10
                java.lang.String r1 = "strictfp "
                java.lang.StringBuilder r0 = r0.append(r1)
            Lcb:
                r0 = r8
                r1 = 4096(0x1000, float:5.74E-42)
                r0 = r0 & r1
                if (r0 == 0) goto Le0
                r0 = r8
                r1 = -4097(0xffffffffffffefff, float:NaN)
                r0 = r0 & r1
                r8 = r0
                r0 = r10
                java.lang.String r1 = "synthetic "
                java.lang.StringBuilder r0 = r0.append(r1)
            Le0:
                r0 = r8
                r1 = 8192(0x2000, float:1.14794E-41)
                r0 = r0 & r1
                if (r0 == 0) goto Lf5
                r0 = r8
                r1 = -8193(0xffffffffffffdfff, float:NaN)
                r0 = r0 & r1
                r8 = r0
                r0 = r10
                java.lang.String r1 = "annotation "
                java.lang.StringBuilder r0 = r0.append(r1)
            Lf5:
                r0 = r8
                r1 = 16384(0x4000, float:2.2959E-41)
                r0 = r0 & r1
                if (r0 == 0) goto L10a
                r0 = r8
                r1 = -16385(0xffffffffffffbfff, float:NaN)
                r0 = r0 & r1
                r8 = r0
                r0 = r10
                java.lang.String r1 = "enum "
                java.lang.StringBuilder r0 = r0.append(r1)
            L10a:
                r0 = r8
                r1 = 64
                r0 = r0 & r1
                if (r0 == 0) goto L12e
                r0 = r8
                r1 = -65
                r0 = r0 & r1
                r8 = r0
                r0 = r9
                boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.FieldDeclaration
                if (r0 == 0) goto L127
                r0 = r10
                java.lang.String r1 = "volatile "
                java.lang.StringBuilder r0 = r0.append(r1)
                goto L12e
            L127:
                r0 = r10
                java.lang.String r1 = "volatile/bridge "
                java.lang.StringBuilder r0 = r0.append(r1)
            L12e:
                r0 = r8
                r1 = 128(0x80, float:1.794E-43)
                r0 = r0 & r1
                if (r0 == 0) goto L165
                r0 = r8
                r1 = -129(0xffffffffffffff7f, float:NaN)
                r0 = r0 & r1
                r8 = r0
                r0 = r9
                boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.Argument
                if (r0 == 0) goto L14d
                r0 = r10
                java.lang.String r1 = "varargs "
                java.lang.StringBuilder r0 = r0.append(r1)
                goto L165
            L14d:
                r0 = r9
                boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.FieldDeclaration
                if (r0 == 0) goto L15e
                r0 = r10
                java.lang.String r1 = "transient "
                java.lang.StringBuilder r0 = r0.append(r1)
                goto L165
            L15e:
                r0 = r10
                java.lang.String r1 = "transient/varargs "
                java.lang.StringBuilder r0 = r0.append(r1)
            L165:
                r0 = r8
                if (r0 == 0) goto L17e
                r0 = r10
                java.lang.String r1 = " 0x%08X "
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r8
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r3[r4] = r5
                java.lang.String r1 = java.lang.String.format(r1, r2)
                java.lang.StringBuilder r0 = r0.append(r1)
            L17e:
                r0 = r10
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = r0.trim()
                return r0
        }

        @Override // lombok.eclipse.EclipseASTVisitor
        public void visitType(lombok.eclipse.EclipseNode r10, org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r11) {
                r9 = this;
                r0 = r9
                java.lang.String r1 = "<TYPE %s%s%s> %s"
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r9
                r6 = r11
                char[] r6 = r6.name
                java.lang.String r5 = r5.str(r6)
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r11
                boolean r5 = lombok.eclipse.handlers.EclipseHandlerUtil.isGenerated(r5)
                if (r5 == 0) goto L20
                java.lang.String r5 = " (GENERATED)"
                goto L22
            L20:
                java.lang.String r5 = ""
            L22:
                r3[r4] = r5
                r3 = r2
                r4 = 2
                r5 = r9
                r6 = r10
                java.lang.String r5 = r5.position(r6)
                r3[r4] = r5
                r3 = r2
                r4 = 3
                r5 = r9
                r6 = r11
                int r6 = r6.modifiers
                r7 = r11
                java.lang.String r5 = r5.printFlags(r6, r7)
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
                if (r0 == 0) goto L63
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
            L63:
                return
        }

        @Override // lombok.eclipse.EclipseASTVisitor
        public void visitAnnotationOnType(org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r9, lombok.eclipse.EclipseNode r10, org.eclipse.jdt.internal.compiler.ast.Annotation r11) {
                r8 = this;
                r0 = r8
                java.lang.String r1 = "<ANNOTATION%s: %s%s />"
                r2 = 3
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r11
                boolean r5 = lombok.eclipse.handlers.EclipseHandlerUtil.isGenerated(r5)
                if (r5 == 0) goto L15
                java.lang.String r5 = " (GENERATED)"
                goto L17
            L15:
                java.lang.String r5 = ""
            L17:
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r11
                r3[r4] = r5
                r3 = r2
                r4 = 2
                r5 = r8
                r6 = r10
                java.lang.String r5 = r5.position(r6)
                r3[r4] = r5
                r0.forcePrint(r1, r2)
                return
        }

        @Override // lombok.eclipse.EclipseASTVisitor
        public void endVisitType(lombok.eclipse.EclipseNode r9, org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r10) {
                r8 = this;
                r0 = r8
                boolean r0 = r0.printContent
                if (r0 == 0) goto L11
                r0 = r8
                r1 = r0
                int r1 = r1.disablePrinting
                r2 = 1
                int r1 = r1 - r2
                r0.disablePrinting = r1
            L11:
                r0 = r8
                r1 = r0
                int r1 = r1.indent
                r2 = 1
                int r1 = r1 - r2
                r0.indent = r1
                r0 = r8
                java.lang.String r1 = "</TYPE %s>"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r8
                r6 = r10
                char[] r6 = r6.name
                java.lang.String r5 = r5.str(r6)
                r3[r4] = r5
                r0.print(r1, r2)
                return
        }

        @Override // lombok.eclipse.EclipseASTVisitor
        public void visitInitializer(lombok.eclipse.EclipseNode r9, org.eclipse.jdt.internal.compiler.ast.Initializer r10) {
                r8 = this;
                r0 = r10
                org.eclipse.jdt.internal.compiler.ast.Block r0 = r0.block
                r11 = r0
                r0 = r11
                if (r0 == 0) goto L14
                r0 = r11
                org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
                if (r0 == 0) goto L14
                r0 = 1
                goto L15
            L14:
                r0 = 0
            L15:
                r12 = r0
                r0 = r8
                java.lang.String r1 = "<%s INITIALIZER: %s%s%s>"
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r10
                int r5 = r5.modifiers
                r6 = 8
                r5 = r5 & r6
                if (r5 == 0) goto L31
                java.lang.String r5 = "static"
                goto L34
            L31:
                java.lang.String r5 = "instance"
            L34:
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r12
                if (r5 == 0) goto L42
                java.lang.String r5 = "filled"
                goto L45
            L42:
                java.lang.String r5 = "blank"
            L45:
                r3[r4] = r5
                r3 = r2
                r4 = 2
                r5 = r10
                boolean r5 = lombok.eclipse.handlers.EclipseHandlerUtil.isGenerated(r5)
                if (r5 == 0) goto L54
                java.lang.String r5 = " (GENERATED)"
                goto L56
            L54:
                java.lang.String r5 = ""
            L56:
                r3[r4] = r5
                r3 = r2
                r4 = 3
                r5 = r8
                r6 = r9
                java.lang.String r5 = r5.position(r6)
                r3[r4] = r5
                r0.print(r1, r2)
                r0 = r8
                r1 = r0
                int r1 = r1.indent
                r2 = 1
                int r1 = r1 + r2
                r0.indent = r1
                r0 = r8
                boolean r0 = r0.printContent
                if (r0 == 0) goto L95
                r0 = r10
                org.eclipse.jdt.internal.compiler.ast.Block r0 = r0.block
                if (r0 == 0) goto L8b
                r0 = r8
                java.lang.String r1 = "%s"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r10
                org.eclipse.jdt.internal.compiler.ast.Block r5 = r5.block
                r3[r4] = r5
                r0.print(r1, r2)
            L8b:
                r0 = r8
                r1 = r0
                int r1 = r1.disablePrinting
                r2 = 1
                int r1 = r1 + r2
                r0.disablePrinting = r1
            L95:
                return
        }

        @Override // lombok.eclipse.EclipseASTVisitor
        public void endVisitInitializer(lombok.eclipse.EclipseNode r9, org.eclipse.jdt.internal.compiler.ast.Initializer r10) {
                r8 = this;
                r0 = r8
                boolean r0 = r0.printContent
                if (r0 == 0) goto L11
                r0 = r8
                r1 = r0
                int r1 = r1.disablePrinting
                r2 = 1
                int r1 = r1 - r2
                r0.disablePrinting = r1
            L11:
                r0 = r8
                r1 = r0
                int r1 = r1.indent
                r2 = 1
                int r1 = r1 - r2
                r0.indent = r1
                r0 = r8
                java.lang.String r1 = "</%s INITIALIZER>"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r10
                int r5 = r5.modifiers
                r6 = 8
                r5 = r5 & r6
                if (r5 == 0) goto L35
                java.lang.String r5 = "static"
                goto L38
            L35:
                java.lang.String r5 = "instance"
            L38:
                r3[r4] = r5
                r0.print(r1, r2)
                return
        }

        @Override // lombok.eclipse.EclipseASTVisitor
        public void visitField(lombok.eclipse.EclipseNode r10, org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r11) {
                r9 = this;
                r0 = r9
                java.lang.String r1 = "<FIELD%s %s %s = %s%s> %s"
                r2 = 6
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r11
                boolean r5 = lombok.eclipse.handlers.EclipseHandlerUtil.isGenerated(r5)
                if (r5 == 0) goto L17
                java.lang.String r5 = " (GENERATED)"
                goto L19
            L17:
                java.lang.String r5 = ""
            L19:
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r9
                r6 = r11
                org.eclipse.jdt.internal.compiler.ast.TypeReference r6 = r6.type
                java.lang.String r5 = r5.str(r6)
                r3[r4] = r5
                r3 = r2
                r4 = 2
                r5 = r9
                r6 = r11
                char[] r6 = r6.name
                java.lang.String r5 = r5.str(r6)
                r3[r4] = r5
                r3 = r2
                r4 = 3
                r5 = r11
                org.eclipse.jdt.internal.compiler.ast.Expression r5 = r5.initialization
                r3[r4] = r5
                r3 = r2
                r4 = 4
                r5 = r9
                r6 = r10
                java.lang.String r5 = r5.position(r6)
                r3[r4] = r5
                r3 = r2
                r4 = 5
                r5 = r9
                r6 = r11
                int r6 = r6.modifiers
                r7 = r11
                java.lang.String r5 = r5.printFlags(r6, r7)
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
                if (r0 == 0) goto L81
                r0 = r11
                org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.initialization
                if (r0 == 0) goto L77
                r0 = r9
                java.lang.String r1 = "%s"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r11
                org.eclipse.jdt.internal.compiler.ast.Expression r5 = r5.initialization
                r3[r4] = r5
                r0.print(r1, r2)
            L77:
                r0 = r9
                r1 = r0
                int r1 = r1.disablePrinting
                r2 = 1
                int r1 = r1 + r2
                r0.disablePrinting = r1
            L81:
                return
        }

        @Override // lombok.eclipse.EclipseASTVisitor
        public void visitAnnotationOnField(org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r9, lombok.eclipse.EclipseNode r10, org.eclipse.jdt.internal.compiler.ast.Annotation r11) {
                r8 = this;
                r0 = r8
                java.lang.String r1 = "<ANNOTATION%s: %s%s />"
                r2 = 3
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r11
                boolean r5 = lombok.eclipse.handlers.EclipseHandlerUtil.isGenerated(r5)
                if (r5 == 0) goto L15
                java.lang.String r5 = " (GENERATED)"
                goto L17
            L15:
                java.lang.String r5 = ""
            L17:
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r11
                r3[r4] = r5
                r3 = r2
                r4 = 2
                r5 = r8
                r6 = r10
                java.lang.String r5 = r5.position(r6)
                r3[r4] = r5
                r0.forcePrint(r1, r2)
                return
        }

        @Override // lombok.eclipse.EclipseASTVisitor
        public void endVisitField(lombok.eclipse.EclipseNode r9, org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r10) {
                r8 = this;
                r0 = r8
                boolean r0 = r0.printContent
                if (r0 == 0) goto L11
                r0 = r8
                r1 = r0
                int r1 = r1.disablePrinting
                r2 = 1
                int r1 = r1 - r2
                r0.disablePrinting = r1
            L11:
                r0 = r8
                r1 = r0
                int r1 = r1.indent
                r2 = 1
                int r1 = r1 - r2
                r0.indent = r1
                r0 = r8
                java.lang.String r1 = "</FIELD %s %s>"
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r8
                r6 = r10
                org.eclipse.jdt.internal.compiler.ast.TypeReference r6 = r6.type
                java.lang.String r5 = r5.str(r6)
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r8
                r6 = r10
                char[] r6 = r6.name
                java.lang.String r5 = r5.str(r6)
                r3[r4] = r5
                r0.print(r1, r2)
                return
        }

        @Override // lombok.eclipse.EclipseASTVisitor
        public void visitMethod(lombok.eclipse.EclipseNode r10, org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r11) {
                r9 = this;
                r0 = r11
                boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration
                if (r0 == 0) goto Ld
                java.lang.String r0 = "CONSTRUCTOR"
                goto L10
            Ld:
                java.lang.String r0 = "METHOD"
            L10:
                r12 = r0
                r0 = r9
                java.lang.String r1 = "<%s %s: %s%s%s> %s"
                r2 = 6
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r12
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r9
                r6 = r11
                char[] r6 = r6.selector
                java.lang.String r5 = r5.str(r6)
                r3[r4] = r5
                r3 = r2
                r4 = 2
                r5 = r11
                org.eclipse.jdt.internal.compiler.ast.Statement[] r5 = r5.statements
                if (r5 == 0) goto L50
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r6 = r5
                java.lang.String r7 = "filled("
                r6.<init>(r7)
                r6 = r11
                org.eclipse.jdt.internal.compiler.ast.Statement[] r6 = r6.statements
                int r6 = r6.length
                java.lang.StringBuilder r5 = r5.append(r6)
                java.lang.String r6 = ")"
                java.lang.StringBuilder r5 = r5.append(r6)
                java.lang.String r5 = r5.toString()
                goto L53
            L50:
                java.lang.String r5 = "blank"
            L53:
                r3[r4] = r5
                r3 = r2
                r4 = 3
                r5 = r11
                boolean r5 = lombok.eclipse.handlers.EclipseHandlerUtil.isGenerated(r5)
                if (r5 == 0) goto L62
                java.lang.String r5 = " (GENERATED)"
                goto L64
            L62:
                java.lang.String r5 = ""
            L64:
                r3[r4] = r5
                r3 = r2
                r4 = 4
                r5 = r9
                r6 = r10
                java.lang.String r5 = r5.position(r6)
                r3[r4] = r5
                r3 = r2
                r4 = 5
                r5 = r9
                r6 = r11
                int r6 = r6.modifiers
                r7 = r11
                java.lang.String r5 = r5.printFlags(r6, r7)
                r3[r4] = r5
                r0.print(r1, r2)
                r0 = r9
                r1 = r0
                int r1 = r1.indent
                r2 = 1
                int r1 = r1 + r2
                r0.indent = r1
                r0 = r11
                boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration
                if (r0 == 0) goto Lb4
                r0 = r11
                org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration r0 = (org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration) r0
                r13 = r0
                r0 = r9
                java.lang.String r1 = "--> constructorCall: %s"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r13
                org.eclipse.jdt.internal.compiler.ast.ExplicitConstructorCall r5 = r5.constructorCall
                if (r5 != 0) goto Lab
                java.lang.String r5 = "-NONE-"
                goto Lb0
            Lab:
                r5 = r13
                org.eclipse.jdt.internal.compiler.ast.ExplicitConstructorCall r5 = r5.constructorCall
            Lb0:
                r3[r4] = r5
                r0.print(r1, r2)
            Lb4:
                r0 = r9
                boolean r0 = r0.printContent
                if (r0 == 0) goto Lda
                r0 = r11
                org.eclipse.jdt.internal.compiler.ast.Statement[] r0 = r0.statements
                if (r0 == 0) goto Ld0
                r0 = r9
                java.lang.String r1 = "%s"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r11
                r3[r4] = r5
                r0.print(r1, r2)
            Ld0:
                r0 = r9
                r1 = r0
                int r1 = r1.disablePrinting
                r2 = 1
                int r1 = r1 + r2
                r0.disablePrinting = r1
            Lda:
                return
        }

        @Override // lombok.eclipse.EclipseASTVisitor
        public void visitAnnotationOnMethod(org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r10, lombok.eclipse.EclipseNode r11, org.eclipse.jdt.internal.compiler.ast.Annotation r12) {
                r9 = this;
                r0 = r9
                java.lang.String r1 = "<ANNOTATION%s: %s%s>"
                r2 = 3
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r10
                boolean r5 = lombok.eclipse.handlers.EclipseHandlerUtil.isGenerated(r5)
                if (r5 == 0) goto L16
                java.lang.String r5 = " (GENERATED)"
                goto L18
            L16:
                java.lang.String r5 = ""
            L18:
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r12
                r3[r4] = r5
                r3 = r2
                r4 = 2
                r5 = r9
                r6 = r11
                java.lang.String r5 = r5.position(r6)
                r3[r4] = r5
                r0.forcePrint(r1, r2)
                r0 = r12
                boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.MarkerAnnotation
                if (r0 != 0) goto L36
                r0 = r9
                int r0 = r0.disablePrinting
                if (r0 == 0) goto L60
            L36:
                r0 = r9
                java.lang.String r1 = "<ANNOTATION%s: %s%s />"
                r2 = 3
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r10
                boolean r5 = lombok.eclipse.handlers.EclipseHandlerUtil.isGenerated(r5)
                if (r5 == 0) goto L4b
                java.lang.String r5 = " (GENERATED)"
                goto L4d
            L4b:
                java.lang.String r5 = ""
            L4d:
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r12
                r3[r4] = r5
                r3 = r2
                r4 = 2
                r5 = r9
                r6 = r11
                java.lang.String r5 = r5.position(r6)
                r3[r4] = r5
                r0.forcePrint(r1, r2)
                goto L11c
            L60:
                r0 = r9
                java.lang.String r1 = "<ANNOTATION%s: %s%s>"
                r2 = 3
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r10
                boolean r5 = lombok.eclipse.handlers.EclipseHandlerUtil.isGenerated(r5)
                if (r5 == 0) goto L76
                java.lang.String r5 = " (GENERATED)"
                goto L78
            L76:
                java.lang.String r5 = ""
            L78:
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r12
                r3[r4] = r5
                r3 = r2
                r4 = 2
                r5 = r9
                r6 = r11
                java.lang.String r5 = r5.position(r6)
                r3[r4] = r5
                r0.forcePrint(r1, r2)
                r0 = r9
                r1 = r0
                int r1 = r1.indent
                r2 = 1
                int r1 = r1 + r2
                r0.indent = r1
                r0 = r12
                boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.SingleMemberAnnotation
                if (r0 == 0) goto Lba
                r0 = r12
                org.eclipse.jdt.internal.compiler.ast.SingleMemberAnnotation r0 = (org.eclipse.jdt.internal.compiler.ast.SingleMemberAnnotation) r0
                org.eclipse.jdt.internal.compiler.ast.Expression r0 = r0.memberValue
                r13 = r0
                r0 = r9
                java.lang.String r1 = "<SINGLE-MEMBER-VALUE %s /> %s"
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r13
                java.lang.Class r5 = r5.getClass()
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r13
                r3[r4] = r5
                r0.print(r1, r2)
            Lba:
                r0 = r12
                boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.NormalAnnotation
                if (r0 == 0) goto L112
                r0 = r12
                org.eclipse.jdt.internal.compiler.ast.NormalAnnotation r0 = (org.eclipse.jdt.internal.compiler.ast.NormalAnnotation) r0
                org.eclipse.jdt.internal.compiler.ast.MemberValuePair[] r0 = r0.memberValuePairs
                r1 = r0
                r16 = r1
                int r0 = r0.length
                r15 = r0
                r0 = 0
                r14 = r0
                goto L10b
            Ld4:
                r0 = r16
                r1 = r14
                r0 = r0[r1]
                r13 = r0
                r0 = r9
                java.lang.String r1 = "<Member %s: %s /> %s"
                r2 = 3
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                java.lang.String r5 = new java.lang.String
                r6 = r5
                r7 = r13
                char[] r7 = r7.name
                r6.<init>(r7)
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r13
                org.eclipse.jdt.internal.compiler.ast.Expression r5 = r5.value
                java.lang.Class r5 = r5.getClass()
                r3[r4] = r5
                r3 = r2
                r4 = 2
                r5 = r13
                org.eclipse.jdt.internal.compiler.ast.Expression r5 = r5.value
                r3[r4] = r5
                r0.print(r1, r2)
                int r14 = r14 + 1
            L10b:
                r0 = r14
                r1 = r15
                if (r0 < r1) goto Ld4
            L112:
                r0 = r9
                r1 = r0
                int r1 = r1.indent
                r2 = 1
                int r1 = r1 - r2
                r0.indent = r1
            L11c:
                return
        }

        @Override // lombok.eclipse.EclipseASTVisitor
        public void endVisitMethod(lombok.eclipse.EclipseNode r9, org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r10) {
                r8 = this;
                r0 = r8
                boolean r0 = r0.printContent
                if (r0 == 0) goto L11
                r0 = r8
                r1 = r0
                int r1 = r1.disablePrinting
                r2 = 1
                int r1 = r1 - r2
                r0.disablePrinting = r1
            L11:
                r0 = r10
                boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.ConstructorDeclaration
                if (r0 == 0) goto L1e
                java.lang.String r0 = "CONSTRUCTOR"
                goto L21
            L1e:
                java.lang.String r0 = "METHOD"
            L21:
                r11 = r0
                r0 = r8
                r1 = r0
                int r1 = r1.indent
                r2 = 1
                int r1 = r1 - r2
                r0.indent = r1
                r0 = r8
                java.lang.String r1 = "</%s %s>"
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r11
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r8
                r6 = r10
                char[] r6 = r6.selector
                java.lang.String r5 = r5.str(r6)
                r3[r4] = r5
                r0.print(r1, r2)
                return
        }

        @Override // lombok.eclipse.EclipseASTVisitor
        public void visitMethodArgument(lombok.eclipse.EclipseNode r10, org.eclipse.jdt.internal.compiler.ast.Argument r11, org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r12) {
                r9 = this;
                r0 = r9
                java.lang.String r1 = "<METHODARG%s %s %s = %s%s> %s"
                r2 = 6
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r11
                boolean r5 = lombok.eclipse.handlers.EclipseHandlerUtil.isGenerated(r5)
                if (r5 == 0) goto L17
                java.lang.String r5 = " (GENERATED)"
                goto L19
            L17:
                java.lang.String r5 = ""
            L19:
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r9
                r6 = r11
                org.eclipse.jdt.internal.compiler.ast.TypeReference r6 = r6.type
                java.lang.String r5 = r5.str(r6)
                r3[r4] = r5
                r3 = r2
                r4 = 2
                r5 = r9
                r6 = r11
                char[] r6 = r6.name
                java.lang.String r5 = r5.str(r6)
                r3[r4] = r5
                r3 = r2
                r4 = 3
                r5 = r11
                org.eclipse.jdt.internal.compiler.ast.Expression r5 = r5.initialization
                r3[r4] = r5
                r3 = r2
                r4 = 4
                r5 = r9
                r6 = r10
                java.lang.String r5 = r5.position(r6)
                r3[r4] = r5
                r3 = r2
                r4 = 5
                r5 = r9
                r6 = r11
                int r6 = r6.modifiers
                r7 = r11
                java.lang.String r5 = r5.printFlags(r6, r7)
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

        @Override // lombok.eclipse.EclipseASTVisitor
        public void visitAnnotationOnMethodArgument(org.eclipse.jdt.internal.compiler.ast.Argument r9, org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r10, lombok.eclipse.EclipseNode r11, org.eclipse.jdt.internal.compiler.ast.Annotation r12) {
                r8 = this;
                r0 = r8
                java.lang.String r1 = "<ANNOTATION%s: %s%s />"
                r2 = 3
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r12
                boolean r5 = lombok.eclipse.handlers.EclipseHandlerUtil.isGenerated(r5)
                if (r5 == 0) goto L16
                java.lang.String r5 = " (GENERATED)"
                goto L18
            L16:
                java.lang.String r5 = ""
            L18:
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r12
                r3[r4] = r5
                r3 = r2
                r4 = 2
                r5 = r8
                r6 = r11
                java.lang.String r5 = r5.position(r6)
                r3[r4] = r5
                r0.print(r1, r2)
                return
        }

        @Override // lombok.eclipse.EclipseASTVisitor
        public void endVisitMethodArgument(lombok.eclipse.EclipseNode r9, org.eclipse.jdt.internal.compiler.ast.Argument r10, org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r11) {
                r8 = this;
                r0 = r8
                r1 = r0
                int r1 = r1.indent
                r2 = 1
                int r1 = r1 - r2
                r0.indent = r1
                r0 = r8
                java.lang.String r1 = "</METHODARG %s %s>"
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r8
                r6 = r10
                org.eclipse.jdt.internal.compiler.ast.TypeReference r6 = r6.type
                java.lang.String r5 = r5.str(r6)
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r8
                r6 = r10
                char[] r6 = r6.name
                java.lang.String r5 = r5.str(r6)
                r3[r4] = r5
                r0.print(r1, r2)
                return
        }

        @Override // lombok.eclipse.EclipseASTVisitor
        public void visitLocal(lombok.eclipse.EclipseNode r10, org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r11) {
                r9 = this;
                r0 = r9
                java.lang.String r1 = "<LOCAL%s %s %s = %s%s> %s"
                r2 = 6
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r11
                boolean r5 = lombok.eclipse.handlers.EclipseHandlerUtil.isGenerated(r5)
                if (r5 == 0) goto L17
                java.lang.String r5 = " (GENERATED)"
                goto L19
            L17:
                java.lang.String r5 = ""
            L19:
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r9
                r6 = r11
                org.eclipse.jdt.internal.compiler.ast.TypeReference r6 = r6.type
                java.lang.String r5 = r5.str(r6)
                r3[r4] = r5
                r3 = r2
                r4 = 2
                r5 = r9
                r6 = r11
                char[] r6 = r6.name
                java.lang.String r5 = r5.str(r6)
                r3[r4] = r5
                r3 = r2
                r4 = 3
                r5 = r11
                org.eclipse.jdt.internal.compiler.ast.Expression r5 = r5.initialization
                r3[r4] = r5
                r3 = r2
                r4 = 4
                r5 = r9
                r6 = r10
                java.lang.String r5 = r5.position(r6)
                r3[r4] = r5
                r3 = r2
                r4 = 5
                r5 = r9
                r6 = r11
                int r6 = r6.modifiers
                r7 = r11
                java.lang.String r5 = r5.printFlags(r6, r7)
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

        @Override // lombok.eclipse.EclipseASTVisitor
        public void visitAnnotationOnLocal(org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r8, lombok.eclipse.EclipseNode r9, org.eclipse.jdt.internal.compiler.ast.Annotation r10) {
                r7 = this;
                r0 = r7
                java.lang.String r1 = "<ANNOTATION%s: %s />"
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r10
                boolean r5 = lombok.eclipse.handlers.EclipseHandlerUtil.isGenerated(r5)
                if (r5 == 0) goto L16
                java.lang.String r5 = " (GENERATED)"
                goto L18
            L16:
                java.lang.String r5 = ""
            L18:
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r10
                r3[r4] = r5
                r0.print(r1, r2)
                return
        }

        @Override // lombok.eclipse.EclipseASTVisitor
        public void endVisitLocal(lombok.eclipse.EclipseNode r9, org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r10) {
                r8 = this;
                r0 = r8
                r1 = r0
                int r1 = r1.indent
                r2 = 1
                int r1 = r1 - r2
                r0.indent = r1
                r0 = r8
                java.lang.String r1 = "</LOCAL %s %s>"
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r8
                r6 = r10
                org.eclipse.jdt.internal.compiler.ast.TypeReference r6 = r6.type
                java.lang.String r5 = r5.str(r6)
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r8
                r6 = r10
                char[] r6 = r6.name
                java.lang.String r5 = r5.str(r6)
                r3[r4] = r5
                r0.print(r1, r2)
                return
        }

        @Override // lombok.eclipse.EclipseASTVisitor
        public void visitTypeUse(lombok.eclipse.EclipseNode r8, org.eclipse.jdt.internal.compiler.ast.TypeReference r9) {
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

        @Override // lombok.eclipse.EclipseASTVisitor
        public void visitAnnotationOnTypeUse(org.eclipse.jdt.internal.compiler.ast.TypeReference r8, lombok.eclipse.EclipseNode r9, org.eclipse.jdt.internal.compiler.ast.Annotation r10) {
                r7 = this;
                r0 = r7
                java.lang.String r1 = "<ANNOTATION%s: %s />"
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r10
                boolean r5 = lombok.eclipse.handlers.EclipseHandlerUtil.isGenerated(r5)
                if (r5 == 0) goto L16
                java.lang.String r5 = " (GENERATED)"
                goto L18
            L16:
                java.lang.String r5 = ""
            L18:
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r10
                r3[r4] = r5
                r0.print(r1, r2)
                return
        }

        @Override // lombok.eclipse.EclipseASTVisitor
        public void endVisitTypeUse(lombok.eclipse.EclipseNode r8, org.eclipse.jdt.internal.compiler.ast.TypeReference r9) {
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

        @Override // lombok.eclipse.EclipseASTVisitor
        public void visitStatement(lombok.eclipse.EclipseNode r9, org.eclipse.jdt.internal.compiler.ast.Statement r10) {
                r8 = this;
                r0 = r8
                java.lang.String r1 = "<%s%s%s>"
                r2 = 3
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r10
                java.lang.Class r5 = r5.getClass()
                r3[r4] = r5
                r3 = r2
                r4 = 1
                r5 = r10
                boolean r5 = lombok.eclipse.handlers.EclipseHandlerUtil.isGenerated(r5)
                if (r5 == 0) goto L1d
                java.lang.String r5 = " (GENERATED)"
                goto L1f
            L1d:
                java.lang.String r5 = ""
            L1f:
                r3[r4] = r5
                r3 = r2
                r4 = 2
                r5 = r8
                r6 = r9
                java.lang.String r5 = r5.position(r6)
                r3[r4] = r5
                r0.print(r1, r2)
                r0 = r10
                boolean r0 = r0 instanceof org.eclipse.jdt.internal.compiler.ast.AllocationExpression
                if (r0 == 0) goto Lc7
                r0 = r10
                org.eclipse.jdt.internal.compiler.ast.AllocationExpression r0 = (org.eclipse.jdt.internal.compiler.ast.AllocationExpression) r0
                r11 = r0
                r0 = r8
                java.lang.String r1 = " --> arguments: %s"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r11
                org.eclipse.jdt.internal.compiler.ast.Expression[] r5 = r5.arguments
                if (r5 != 0) goto L4e
                java.lang.String r5 = "NULL"
                goto L56
            L4e:
                r5 = r11
                org.eclipse.jdt.internal.compiler.ast.Expression[] r5 = r5.arguments
                int r5 = r5.length
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            L56:
                r3[r4] = r5
                r0.print(r1, r2)
                r0 = r8
                java.lang.String r1 = " --> genericTypeArguments: %s"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r11
                org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r5 = r5.genericTypeArguments
                if (r5 != 0) goto L71
                java.lang.String r5 = "NULL"
                goto L79
            L71:
                r5 = r11
                org.eclipse.jdt.internal.compiler.lookup.TypeBinding[] r5 = r5.genericTypeArguments
                int r5 = r5.length
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            L79:
                r3[r4] = r5
                r0.print(r1, r2)
                r0 = r8
                java.lang.String r1 = " --> typeArguments: %s"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r11
                org.eclipse.jdt.internal.compiler.ast.TypeReference[] r5 = r5.typeArguments
                if (r5 != 0) goto L94
                java.lang.String r5 = "NULL"
                goto L9c
            L94:
                r5 = r11
                org.eclipse.jdt.internal.compiler.ast.TypeReference[] r5 = r5.typeArguments
                int r5 = r5.length
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            L9c:
                r3[r4] = r5
                r0.print(r1, r2)
                r0 = r8
                java.lang.String r1 = " --> enumConstant: %s"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r11
                org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r5 = r5.enumConstant
                r3[r4] = r5
                r0.print(r1, r2)
                r0 = r8
                java.lang.String r1 = " --> inferredReturnType: %s"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r11
                boolean r5 = r5.inferredReturnType
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                r3[r4] = r5
                r0.print(r1, r2)
            Lc7:
                r0 = r8
                r1 = r0
                int r1 = r1.indent
                r2 = 1
                int r1 = r1 + r2
                r0.indent = r1
                r0 = r8
                java.lang.String r1 = "%s"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                r5 = r10
                r3[r4] = r5
                r0.print(r1, r2)
                return
        }

        @Override // lombok.eclipse.EclipseASTVisitor
        public void endVisitStatement(lombok.eclipse.EclipseNode r8, org.eclipse.jdt.internal.compiler.ast.Statement r9) {
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

        java.lang.String position(lombok.eclipse.EclipseNode r7) {
                r6 = this;
                r0 = r6
                boolean r0 = r0.printPositions
                if (r0 != 0) goto La
                java.lang.String r0 = ""
                return r0
            La:
                r0 = r7
                java.lang.Object r0 = r0.get()
                org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r0
                int r0 = r0.sourceStart()
                r8 = r0
                r0 = r7
                java.lang.Object r0 = r0.get()
                org.eclipse.jdt.internal.compiler.ast.ASTNode r0 = (org.eclipse.jdt.internal.compiler.ast.ASTNode) r0
                int r0 = r0.sourceEnd()
                r9 = r0
                java.lang.String r0 = " [%d, %d]"
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = r1
                r3 = 0
                r4 = r8
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r2[r3] = r4
                r2 = r1
                r3 = 1
                r4 = r9
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r2[r3] = r4
                java.lang.String r0 = java.lang.String.format(r0, r1)
                return r0
        }

        @Override // lombok.eclipse.EclipseASTVisitor
        public boolean isDeferUntilPostDiet() {
                r2 = this;
                r0 = 0
                return r0
        }
    }

    void visitCompilationUnit(lombok.eclipse.EclipseNode r1, org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r2);

    void endVisitCompilationUnit(lombok.eclipse.EclipseNode r1, org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r2);

    void visitType(lombok.eclipse.EclipseNode r1, org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r2);

    void visitAnnotationOnType(org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r1, lombok.eclipse.EclipseNode r2, org.eclipse.jdt.internal.compiler.ast.Annotation r3);

    void endVisitType(lombok.eclipse.EclipseNode r1, org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r2);

    void visitField(lombok.eclipse.EclipseNode r1, org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r2);

    void visitAnnotationOnField(org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r1, lombok.eclipse.EclipseNode r2, org.eclipse.jdt.internal.compiler.ast.Annotation r3);

    void endVisitField(lombok.eclipse.EclipseNode r1, org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r2);

    void visitInitializer(lombok.eclipse.EclipseNode r1, org.eclipse.jdt.internal.compiler.ast.Initializer r2);

    void endVisitInitializer(lombok.eclipse.EclipseNode r1, org.eclipse.jdt.internal.compiler.ast.Initializer r2);

    void visitMethod(lombok.eclipse.EclipseNode r1, org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r2);

    void visitAnnotationOnMethod(org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r1, lombok.eclipse.EclipseNode r2, org.eclipse.jdt.internal.compiler.ast.Annotation r3);

    void endVisitMethod(lombok.eclipse.EclipseNode r1, org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r2);

    void visitMethodArgument(lombok.eclipse.EclipseNode r1, org.eclipse.jdt.internal.compiler.ast.Argument r2, org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r3);

    void visitAnnotationOnMethodArgument(org.eclipse.jdt.internal.compiler.ast.Argument r1, org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r2, lombok.eclipse.EclipseNode r3, org.eclipse.jdt.internal.compiler.ast.Annotation r4);

    void endVisitMethodArgument(lombok.eclipse.EclipseNode r1, org.eclipse.jdt.internal.compiler.ast.Argument r2, org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r3);

    void visitLocal(lombok.eclipse.EclipseNode r1, org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r2);

    void visitAnnotationOnLocal(org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r1, lombok.eclipse.EclipseNode r2, org.eclipse.jdt.internal.compiler.ast.Annotation r3);

    void endVisitLocal(lombok.eclipse.EclipseNode r1, org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r2);

    void visitTypeUse(lombok.eclipse.EclipseNode r1, org.eclipse.jdt.internal.compiler.ast.TypeReference r2);

    void visitAnnotationOnTypeUse(org.eclipse.jdt.internal.compiler.ast.TypeReference r1, lombok.eclipse.EclipseNode r2, org.eclipse.jdt.internal.compiler.ast.Annotation r3);

    void endVisitTypeUse(lombok.eclipse.EclipseNode r1, org.eclipse.jdt.internal.compiler.ast.TypeReference r2);

    void visitStatement(lombok.eclipse.EclipseNode r1, org.eclipse.jdt.internal.compiler.ast.Statement r2);

    void endVisitStatement(lombok.eclipse.EclipseNode r1, org.eclipse.jdt.internal.compiler.ast.Statement r2);

    boolean isDeferUntilPostDiet();
}
