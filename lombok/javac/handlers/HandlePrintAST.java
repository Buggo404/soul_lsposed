package lombok.javac.handlers;

@lombok.core.HandlerPriority(536870912)
/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/handlers/HandlePrintAST.SCL.lombok */
public class HandlePrintAST extends lombok.javac.JavacAnnotationHandler<lombok.core.PrintAST> {
    public HandlePrintAST() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.javac.JavacAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.core.PrintAST> r7, com.sun.tools.javac.tree.JCTree.JCAnnotation r8, lombok.javac.JavacNode r9) {
            r6 = this;
            java.io.PrintStream r0 = java.lang.System.out
            r10 = r0
            r0 = r7
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.core.PrintAST r0 = (lombok.core.PrintAST) r0
            java.lang.String r0 = r0.outfile()
            r11 = r0
            r0 = r11
            int r0 = r0.length()
            if (r0 <= 0) goto L38
            java.io.PrintStream r0 = new java.io.PrintStream     // Catch: java.io.FileNotFoundException -> L30
            r1 = r0
            java.io.File r2 = new java.io.File     // Catch: java.io.FileNotFoundException -> L30
            r3 = r2
            r4 = r11
            r3.<init>(r4)     // Catch: java.io.FileNotFoundException -> L30
            r1.<init>(r2)     // Catch: java.io.FileNotFoundException -> L30
            r10 = r0
            goto L38
        L30:
            r12 = move-exception
            r0 = r12
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        L38:
            r0 = r9
            lombok.core.LombokNode r0 = r0.m66up()     // Catch: java.lang.Throwable -> L5a
            lombok.javac.JavacNode r0 = (lombok.javac.JavacNode) r0     // Catch: java.lang.Throwable -> L5a
            lombok.javac.JavacASTVisitor$Printer r1 = new lombok.javac.JavacASTVisitor$Printer     // Catch: java.lang.Throwable -> L5a
            r2 = r1
            r3 = r7
            java.lang.annotation.Annotation r3 = r3.getInstance()     // Catch: java.lang.Throwable -> L5a
            lombok.core.PrintAST r3 = (lombok.core.PrintAST) r3     // Catch: java.lang.Throwable -> L5a
            boolean r3 = r3.printContent()     // Catch: java.lang.Throwable -> L5a
            r4 = r10
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L5a
            r0.traverse(r1)     // Catch: java.lang.Throwable -> L5a
            goto L77
        L5a:
            r12 = move-exception
            r0 = r10
            java.io.PrintStream r1 = java.lang.System.out
            if (r0 == r1) goto L74
            r0 = r10
            r0.close()     // Catch: java.lang.Exception -> L6c
            goto L74
        L6c:
            r13 = move-exception
            r0 = r13
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        L74:
            r0 = r12
            throw r0
        L77:
            r0 = r10
            java.io.PrintStream r1 = java.lang.System.out
            if (r0 == r1) goto L8f
            r0 = r10
            r0.close()     // Catch: java.lang.Exception -> L87
            goto L8f
        L87:
            r13 = move-exception
            r0 = r13
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        L8f:
            return
    }
}
