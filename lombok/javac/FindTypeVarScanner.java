package lombok.javac;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/FindTypeVarScanner.SCL.lombok */
public class FindTypeVarScanner extends javax.lang.model.util.AbstractTypeVisitor6<java.lang.Void, java.lang.Void> {
    private java.util.Set<java.lang.String> typeVariables;

    public FindTypeVarScanner() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            java.util.HashSet r1 = new java.util.HashSet
            r2 = r1
            r2.<init>()
            r0.typeVariables = r1
            return
    }

    public java.util.Set<java.lang.String> getTypeVariables() {
            r2 = this;
            r0 = r2
            java.util.Set<java.lang.String> r0 = r0.typeVariables
            return r0
    }

    private java.lang.Void subVisit(javax.lang.model.type.TypeMirror r5) {
            r4 = this;
            r0 = r5
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r5
            r1 = r4
            r2 = 0
            java.lang.Object r0 = r0.accept(r1, r2)
            java.lang.Void r0 = (java.lang.Void) r0
            return r0
    }

    public java.lang.Void visitPrimitive(javax.lang.model.type.PrimitiveType r3, java.lang.Void r4) {
            r2 = this;
            r0 = 0
            return r0
    }

    public java.lang.Void visitNull(javax.lang.model.type.NullType r3, java.lang.Void r4) {
            r2 = this;
            r0 = 0
            return r0
    }

    public java.lang.Void visitNoType(javax.lang.model.type.NoType r3, java.lang.Void r4) {
            r2 = this;
            r0 = 0
            return r0
    }

    public java.lang.Void visitUnknown(javax.lang.model.type.TypeMirror r3, java.lang.Void r4) {
            r2 = this;
            r0 = 0
            return r0
    }

    public java.lang.Void visitError(javax.lang.model.type.ErrorType r3, java.lang.Void r4) {
            r2 = this;
            r0 = 0
            return r0
    }

    public java.lang.Void visitArray(javax.lang.model.type.ArrayType r4, java.lang.Void r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            javax.lang.model.type.TypeMirror r1 = r1.getComponentType()
            java.lang.Void r0 = r0.subVisit(r1)
            return r0
    }

    public java.lang.Void visitDeclared(javax.lang.model.type.DeclaredType r4, java.lang.Void r5) {
            r3 = this;
            r0 = r4
            java.util.List r0 = r0.getTypeArguments()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L21
        L10:
            r0 = r7
            java.lang.Object r0 = r0.next()
            javax.lang.model.type.TypeMirror r0 = (javax.lang.model.type.TypeMirror) r0
            r6 = r0
            r0 = r3
            r1 = r6
            java.lang.Void r0 = r0.subVisit(r1)
        L21:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L10
            r0 = 0
            return r0
    }

    public java.lang.Void visitTypeVariable(javax.lang.model.type.TypeVariable r4, java.lang.Void r5) {
            r3 = this;
            r0 = 0
            r6 = r0
            r0 = r4
            com.sun.tools.javac.code.Type r0 = (com.sun.tools.javac.code.Type) r0     // Catch: java.lang.NullPointerException -> L10
            com.sun.tools.javac.code.Symbol$TypeSymbol r0 = r0.tsym     // Catch: java.lang.NullPointerException -> L10
            com.sun.tools.javac.util.Name r0 = r0.name     // Catch: java.lang.NullPointerException -> L10
            r6 = r0
            goto L11
        L10:
        L11:
            r0 = r6
            if (r0 == 0) goto L25
            r0 = r3
            java.util.Set<java.lang.String> r0 = r0.typeVariables
            r1 = r6
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
        L25:
            r0 = r3
            r1 = r4
            javax.lang.model.type.TypeMirror r1 = r1.getLowerBound()
            java.lang.Void r0 = r0.subVisit(r1)
            r0 = r3
            r1 = r4
            javax.lang.model.type.TypeMirror r1 = r1.getUpperBound()
            java.lang.Void r0 = r0.subVisit(r1)
            r0 = 0
            return r0
    }

    public java.lang.Void visitWildcard(javax.lang.model.type.WildcardType r4, java.lang.Void r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            javax.lang.model.type.TypeMirror r1 = r1.getSuperBound()
            java.lang.Void r0 = r0.subVisit(r1)
            r0 = r3
            r1 = r4
            javax.lang.model.type.TypeMirror r1 = r1.getExtendsBound()
            java.lang.Void r0 = r0.subVisit(r1)
            r0 = 0
            return r0
    }

    public java.lang.Void visitExecutable(javax.lang.model.type.ExecutableType r4, java.lang.Void r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            javax.lang.model.type.TypeMirror r1 = r1.getReturnType()
            java.lang.Void r0 = r0.subVisit(r1)
            r0 = r4
            java.util.List r0 = r0.getParameterTypes()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L2c
        L1b:
            r0 = r7
            java.lang.Object r0 = r0.next()
            javax.lang.model.type.TypeMirror r0 = (javax.lang.model.type.TypeMirror) r0
            r6 = r0
            r0 = r3
            r1 = r6
            java.lang.Void r0 = r0.subVisit(r1)
        L2c:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1b
            r0 = r4
            java.util.List r0 = r0.getThrownTypes()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L57
        L46:
            r0 = r7
            java.lang.Object r0 = r0.next()
            javax.lang.model.type.TypeMirror r0 = (javax.lang.model.type.TypeMirror) r0
            r6 = r0
            r0 = r3
            r1 = r6
            java.lang.Void r0 = r0.subVisit(r1)
        L57:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L46
            r0 = r4
            java.util.List r0 = r0.getTypeVariables()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L82
        L71:
            r0 = r7
            java.lang.Object r0 = r0.next()
            javax.lang.model.type.TypeVariable r0 = (javax.lang.model.type.TypeVariable) r0
            r6 = r0
            r0 = r3
            r1 = r6
            java.lang.Void r0 = r0.subVisit(r1)
        L82:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L71
            r0 = 0
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object visitError(javax.lang.model.type.ErrorType r5, java.lang.Object r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.Void r2 = (java.lang.Void) r2
            java.lang.Void r0 = r0.visitError(r1, r2)
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object visitWildcard(javax.lang.model.type.WildcardType r5, java.lang.Object r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.Void r2 = (java.lang.Void) r2
            java.lang.Void r0 = r0.visitWildcard(r1, r2)
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object visitArray(javax.lang.model.type.ArrayType r5, java.lang.Object r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.Void r2 = (java.lang.Void) r2
            java.lang.Void r0 = r0.visitArray(r1, r2)
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object visitExecutable(javax.lang.model.type.ExecutableType r5, java.lang.Object r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.Void r2 = (java.lang.Void) r2
            java.lang.Void r0 = r0.visitExecutable(r1, r2)
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object visitDeclared(javax.lang.model.type.DeclaredType r5, java.lang.Object r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.Void r2 = (java.lang.Void) r2
            java.lang.Void r0 = r0.visitDeclared(r1, r2)
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object visitUnknown(javax.lang.model.type.TypeMirror r5, java.lang.Object r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.Void r2 = (java.lang.Void) r2
            java.lang.Void r0 = r0.visitUnknown(r1, r2)
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object visitTypeVariable(javax.lang.model.type.TypeVariable r5, java.lang.Object r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.Void r2 = (java.lang.Void) r2
            java.lang.Void r0 = r0.visitTypeVariable(r1, r2)
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object visitNull(javax.lang.model.type.NullType r5, java.lang.Object r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.Void r2 = (java.lang.Void) r2
            java.lang.Void r0 = r0.visitNull(r1, r2)
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object visitPrimitive(javax.lang.model.type.PrimitiveType r5, java.lang.Object r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.Void r2 = (java.lang.Void) r2
            java.lang.Void r0 = r0.visitPrimitive(r1, r2)
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object visitNoType(javax.lang.model.type.NoType r5, java.lang.Object r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.Void r2 = (java.lang.Void) r2
            java.lang.Void r0 = r0.visitNoType(r1, r2)
            return r0
    }
}
