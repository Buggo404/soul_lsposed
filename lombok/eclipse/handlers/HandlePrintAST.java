package lombok.eclipse.handlers;

@lombok.eclipse.DeferUntilPostDiet
@lombok.core.HandlerPriority(536870912)
/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/handlers/HandlePrintAST.SCL.lombok */
public class HandlePrintAST extends lombok.eclipse.EclipseAnnotationHandler<lombok.core.PrintAST> {
    public HandlePrintAST() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // lombok.eclipse.EclipseAnnotationHandler
    public void handle(lombok.core.AnnotationValues<lombok.core.PrintAST> r8, org.eclipse.jdt.internal.compiler.ast.Annotation r9, lombok.eclipse.EclipseNode r10) {
            r7 = this;
            java.io.PrintStream r0 = java.lang.System.out
            r11 = r0
            r0 = r8
            java.lang.annotation.Annotation r0 = r0.getInstance()
            lombok.core.PrintAST r0 = (lombok.core.PrintAST) r0
            java.lang.String r0 = r0.outfile()
            r12 = r0
            r0 = r12
            int r0 = r0.length()
            if (r0 <= 0) goto L38
            java.io.PrintStream r0 = new java.io.PrintStream     // Catch: java.io.FileNotFoundException -> L30
            r1 = r0
            java.io.File r2 = new java.io.File     // Catch: java.io.FileNotFoundException -> L30
            r3 = r2
            r4 = r12
            r3.<init>(r4)     // Catch: java.io.FileNotFoundException -> L30
            r1.<init>(r2)     // Catch: java.io.FileNotFoundException -> L30
            r11 = r0
            goto L38
        L30:
            r13 = move-exception
            r0 = r13
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        L38:
            r0 = r10
            lombok.core.LombokNode r0 = r0.m66up()     // Catch: java.lang.Throwable -> L66
            lombok.eclipse.EclipseNode r0 = (lombok.eclipse.EclipseNode) r0     // Catch: java.lang.Throwable -> L66
            lombok.eclipse.EclipseASTVisitor$Printer r1 = new lombok.eclipse.EclipseASTVisitor$Printer     // Catch: java.lang.Throwable -> L66
            r2 = r1
            r3 = r8
            java.lang.annotation.Annotation r3 = r3.getInstance()     // Catch: java.lang.Throwable -> L66
            lombok.core.PrintAST r3 = (lombok.core.PrintAST) r3     // Catch: java.lang.Throwable -> L66
            boolean r3 = r3.printContent()     // Catch: java.lang.Throwable -> L66
            r4 = r11
            r5 = r8
            java.lang.annotation.Annotation r5 = r5.getInstance()     // Catch: java.lang.Throwable -> L66
            lombok.core.PrintAST r5 = (lombok.core.PrintAST) r5     // Catch: java.lang.Throwable -> L66
            boolean r5 = r5.printPositions()     // Catch: java.lang.Throwable -> L66
            r2.<init>(r3, r4, r5)     // Catch: java.lang.Throwable -> L66
            r0.traverse(r1)     // Catch: java.lang.Throwable -> L66
            goto L83
        L66:
            r13 = move-exception
            r0 = r11
            java.io.PrintStream r1 = java.lang.System.out
            if (r0 == r1) goto L80
            r0 = r11
            r0.close()     // Catch: java.lang.Exception -> L78
            goto L80
        L78:
            r14 = move-exception
            r0 = r14
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        L80:
            r0 = r13
            throw r0
        L83:
            r0 = r11
            java.io.PrintStream r1 = java.lang.System.out
            if (r0 == r1) goto L9b
            r0 = r11
            r0.close()     // Catch: java.lang.Exception -> L93
            goto L9b
        L93:
            r14 = move-exception
            r0 = r14
            java.lang.RuntimeException r0 = lombok.Lombok.sneakyThrow(r0)
            throw r0
        L9b:
            return
    }
}
