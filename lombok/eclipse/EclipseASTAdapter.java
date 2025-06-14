package lombok.eclipse;

/* loaded from: com.usidqw.qwerklj.apk:lombok/eclipse/EclipseASTAdapter.SCL.lombok */
public abstract class EclipseASTAdapter implements lombok.eclipse.EclipseASTVisitor {
    private final boolean deferUntilPostDiet;

    public EclipseASTAdapter() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r4
            java.lang.Class r1 = r1.getClass()
            java.lang.Class<lombok.eclipse.DeferUntilPostDiet> r2 = lombok.eclipse.DeferUntilPostDiet.class
            boolean r1 = r1.isAnnotationPresent(r2)
            r0.deferUntilPostDiet = r1
            return
    }

    @Override // lombok.eclipse.EclipseASTVisitor
    public void visitCompilationUnit(lombok.eclipse.EclipseNode r2, org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r3) {
            r1 = this;
            return
    }

    @Override // lombok.eclipse.EclipseASTVisitor
    public void endVisitCompilationUnit(lombok.eclipse.EclipseNode r2, org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration r3) {
            r1 = this;
            return
    }

    @Override // lombok.eclipse.EclipseASTVisitor
    public void visitType(lombok.eclipse.EclipseNode r2, org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r3) {
            r1 = this;
            return
    }

    @Override // lombok.eclipse.EclipseASTVisitor
    public void visitAnnotationOnType(org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r2, lombok.eclipse.EclipseNode r3, org.eclipse.jdt.internal.compiler.ast.Annotation r4) {
            r1 = this;
            return
    }

    @Override // lombok.eclipse.EclipseASTVisitor
    public void endVisitType(lombok.eclipse.EclipseNode r2, org.eclipse.jdt.internal.compiler.ast.TypeDeclaration r3) {
            r1 = this;
            return
    }

    @Override // lombok.eclipse.EclipseASTVisitor
    public void visitInitializer(lombok.eclipse.EclipseNode r2, org.eclipse.jdt.internal.compiler.ast.Initializer r3) {
            r1 = this;
            return
    }

    @Override // lombok.eclipse.EclipseASTVisitor
    public void endVisitInitializer(lombok.eclipse.EclipseNode r2, org.eclipse.jdt.internal.compiler.ast.Initializer r3) {
            r1 = this;
            return
    }

    @Override // lombok.eclipse.EclipseASTVisitor
    public void visitField(lombok.eclipse.EclipseNode r2, org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r3) {
            r1 = this;
            return
    }

    @Override // lombok.eclipse.EclipseASTVisitor
    public void visitAnnotationOnField(org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r2, lombok.eclipse.EclipseNode r3, org.eclipse.jdt.internal.compiler.ast.Annotation r4) {
            r1 = this;
            return
    }

    @Override // lombok.eclipse.EclipseASTVisitor
    public void endVisitField(lombok.eclipse.EclipseNode r2, org.eclipse.jdt.internal.compiler.ast.FieldDeclaration r3) {
            r1 = this;
            return
    }

    @Override // lombok.eclipse.EclipseASTVisitor
    public void visitMethod(lombok.eclipse.EclipseNode r2, org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r3) {
            r1 = this;
            return
    }

    @Override // lombok.eclipse.EclipseASTVisitor
    public void visitAnnotationOnMethod(org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r2, lombok.eclipse.EclipseNode r3, org.eclipse.jdt.internal.compiler.ast.Annotation r4) {
            r1 = this;
            return
    }

    @Override // lombok.eclipse.EclipseASTVisitor
    public void endVisitMethod(lombok.eclipse.EclipseNode r2, org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r3) {
            r1 = this;
            return
    }

    @Override // lombok.eclipse.EclipseASTVisitor
    public void visitMethodArgument(lombok.eclipse.EclipseNode r2, org.eclipse.jdt.internal.compiler.ast.Argument r3, org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r4) {
            r1 = this;
            return
    }

    @Override // lombok.eclipse.EclipseASTVisitor
    public void visitAnnotationOnMethodArgument(org.eclipse.jdt.internal.compiler.ast.Argument r2, org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r3, lombok.eclipse.EclipseNode r4, org.eclipse.jdt.internal.compiler.ast.Annotation r5) {
            r1 = this;
            return
    }

    @Override // lombok.eclipse.EclipseASTVisitor
    public void endVisitMethodArgument(lombok.eclipse.EclipseNode r2, org.eclipse.jdt.internal.compiler.ast.Argument r3, org.eclipse.jdt.internal.compiler.ast.AbstractMethodDeclaration r4) {
            r1 = this;
            return
    }

    @Override // lombok.eclipse.EclipseASTVisitor
    public void visitLocal(lombok.eclipse.EclipseNode r2, org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r3) {
            r1 = this;
            return
    }

    @Override // lombok.eclipse.EclipseASTVisitor
    public void visitAnnotationOnLocal(org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r2, lombok.eclipse.EclipseNode r3, org.eclipse.jdt.internal.compiler.ast.Annotation r4) {
            r1 = this;
            return
    }

    @Override // lombok.eclipse.EclipseASTVisitor
    public void endVisitLocal(lombok.eclipse.EclipseNode r2, org.eclipse.jdt.internal.compiler.ast.LocalDeclaration r3) {
            r1 = this;
            return
    }

    @Override // lombok.eclipse.EclipseASTVisitor
    public void visitTypeUse(lombok.eclipse.EclipseNode r2, org.eclipse.jdt.internal.compiler.ast.TypeReference r3) {
            r1 = this;
            return
    }

    @Override // lombok.eclipse.EclipseASTVisitor
    public void visitAnnotationOnTypeUse(org.eclipse.jdt.internal.compiler.ast.TypeReference r2, lombok.eclipse.EclipseNode r3, org.eclipse.jdt.internal.compiler.ast.Annotation r4) {
            r1 = this;
            return
    }

    @Override // lombok.eclipse.EclipseASTVisitor
    public void endVisitTypeUse(lombok.eclipse.EclipseNode r2, org.eclipse.jdt.internal.compiler.ast.TypeReference r3) {
            r1 = this;
            return
    }

    @Override // lombok.eclipse.EclipseASTVisitor
    public void visitStatement(lombok.eclipse.EclipseNode r2, org.eclipse.jdt.internal.compiler.ast.Statement r3) {
            r1 = this;
            return
    }

    @Override // lombok.eclipse.EclipseASTVisitor
    public void endVisitStatement(lombok.eclipse.EclipseNode r2, org.eclipse.jdt.internal.compiler.ast.Statement r3) {
            r1 = this;
            return
    }

    @Override // lombok.eclipse.EclipseASTVisitor
    public boolean isDeferUntilPostDiet() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.deferUntilPostDiet
            return r0
    }
}
