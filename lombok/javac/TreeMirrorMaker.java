package lombok.javac;

/* loaded from: com.usidqw.qwerklj.apk:lombok/javac/TreeMirrorMaker.SCL.lombok */
public class TreeMirrorMaker extends com.sun.tools.javac.tree.TreeCopier<java.lang.Void> {
    private final java.util.IdentityHashMap<com.sun.tools.javac.tree.JCTree, com.sun.tools.javac.tree.JCTree> originalToCopy;


    public TreeMirrorMaker(lombok.javac.JavacTreeMaker r5, com.sun.tools.javac.util.Context r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            com.sun.tools.javac.tree.TreeMaker r1 = r1.getUnderlyingTreeMaker()
            r0.<init>(r1)
            r0 = r4
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r2 = r1
            r2.<init>()
            r0.originalToCopy = r1
            return
    }

    public <T extends com.sun.tools.javac.tree.JCTree> T copy(T r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            com.sun.tools.javac.tree.JCTree r0 = super.copy(r1)
            r7 = r0
            r0 = r5
            r1 = r5
            java.util.IdentityHashMap<com.sun.tools.javac.tree.JCTree, com.sun.tools.javac.tree.JCTree> r1 = r1.originalToCopy
            r2 = r6
            r3 = r7
            r0.putIfAbsent(r1, r2, r3)
            r0 = r7
            return r0
    }

    public <T extends com.sun.tools.javac.tree.JCTree> T copy(T r6, java.lang.Void r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            com.sun.tools.javac.tree.JCTree r0 = super.copy(r1, r2)
            r8 = r0
            r0 = r5
            r1 = r5
            java.util.IdentityHashMap<com.sun.tools.javac.tree.JCTree, com.sun.tools.javac.tree.JCTree> r1 = r1.originalToCopy
            r2 = r6
            r3 = r8
            r0.putIfAbsent(r1, r2, r3)
            r0 = r8
            return r0
    }

    public <T extends com.sun.tools.javac.tree.JCTree> com.sun.tools.javac.util.List<T> copy(com.sun.tools.javac.util.List<T> r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            com.sun.tools.javac.util.List r0 = super.copy(r1)
            r7 = r0
            r0 = r6
            if (r0 == 0) goto L3c
            r0 = r6
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
            r0 = r7
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            goto L33
        L18:
            r0 = r5
            r1 = r5
            java.util.IdentityHashMap<com.sun.tools.javac.tree.JCTree, com.sun.tools.javac.tree.JCTree> r1 = r1.originalToCopy
            r2 = r8
            java.lang.Object r2 = r2.next()
            com.sun.tools.javac.tree.JCTree r2 = (com.sun.tools.javac.tree.JCTree) r2
            r3 = r9
            java.lang.Object r3 = r3.next()
            com.sun.tools.javac.tree.JCTree r3 = (com.sun.tools.javac.tree.JCTree) r3
            r0.putIfAbsent(r1, r2, r3)
        L33:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L18
        L3c:
            r0 = r7
            return r0
    }

    public <T extends com.sun.tools.javac.tree.JCTree> com.sun.tools.javac.util.List<T> copy(com.sun.tools.javac.util.List<T> r6, java.lang.Void r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            com.sun.tools.javac.util.List r0 = super.copy(r1, r2)
            r8 = r0
            r0 = r6
            if (r0 == 0) goto L40
            r0 = r6
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            r0 = r8
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
            goto L36
        L1a:
            r0 = r5
            r1 = r5
            java.util.IdentityHashMap<com.sun.tools.javac.tree.JCTree, com.sun.tools.javac.tree.JCTree> r1 = r1.originalToCopy
            r2 = r9
            java.lang.Object r2 = r2.next()
            com.sun.tools.javac.tree.JCTree r2 = (com.sun.tools.javac.tree.JCTree) r2
            r3 = r10
            java.lang.Object r3 = r3.next()
            com.sun.tools.javac.tree.JCTree r3 = (com.sun.tools.javac.tree.JCTree) r3
            r0.putIfAbsent(r1, r2, r3)
        L36:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L1a
        L40:
            r0 = r8
            return r0
    }

    public java.util.Map<com.sun.tools.javac.tree.JCTree, com.sun.tools.javac.tree.JCTree> getOriginalToCopyMap() {
            r2 = this;
            r0 = r2
            java.util.IdentityHashMap<com.sun.tools.javac.tree.JCTree, com.sun.tools.javac.tree.JCTree> r0 = r0.originalToCopy
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            return r0
    }

    public com.sun.tools.javac.tree.JCTree visitVariable(com.sun.source.tree.VariableTree r6, java.lang.Void r7) {
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof com.sun.tools.javac.tree.JCTree.JCVariableDecl
            if (r0 == 0) goto Le
            r0 = r6
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            goto Lf
        Le:
            r0 = 0
        Lf:
            r8 = r0
            r0 = r5
            r1 = r6
            r2 = r7
            com.sun.tools.javac.tree.JCTree r0 = super.visitVariable(r1, r2)
            com.sun.tools.javac.tree.JCTree$JCVariableDecl r0 = (com.sun.tools.javac.tree.JCTree.JCVariableDecl) r0
            r9 = r0
            r0 = r8
            if (r0 != 0) goto L22
            r0 = r9
            return r0
        L22:
            r0 = r9
            r1 = r8
            com.sun.tools.javac.code.Symbol$VarSymbol r1 = r1.sym
            r0.sym = r1
            r0 = r9
            com.sun.tools.javac.code.Symbol$VarSymbol r0 = r0.sym
            if (r0 == 0) goto L3c
            r0 = r9
            r1 = r8
            com.sun.tools.javac.code.Type r1 = r1.type
            r0.type = r1
        L3c:
            r0 = r9
            com.sun.tools.javac.code.Type r0 = r0.type
            if (r0 == 0) goto Lc9
            r0 = r9
            com.sun.tools.javac.code.Type r0 = r0.type
            boolean r0 = r0.isErroneous()
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L90
            r0 = r9
            com.sun.tools.javac.code.Type r0 = r0.type
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.JavacTreeMaker.TypeTag.typeTag(r0)
            r11 = r0
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.Javac.CTC_NONE
            r1 = r11
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L8d
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.Javac.CTC_ERROR
            r1 = r11
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L8d
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.Javac.CTC_UNKNOWN
            r1 = r11
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L8d
            lombok.javac.JavacTreeMaker$TypeTag r0 = lombok.javac.Javac.CTC_UNDETVAR
            r1 = r11
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L8d
            r0 = 0
            goto L8e
        L8d:
            r0 = 1
        L8e:
            r10 = r0
        L90:
            r0 = r10
            if (r0 == 0) goto La4
            r0 = r9
            r1 = 0
            r0.sym = r1
            r0 = r9
            r1 = 0
            r0.type = r1
            goto Lc9
        La4:
            r0 = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.vartype
            if (r0 == 0) goto Lc9
            r0 = r9
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.vartype
            r1 = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r1 = r1.vartype
            com.sun.tools.javac.code.Type r1 = r1.type
            r0.type = r1
            r0 = r8
            com.sun.tools.javac.tree.JCTree$JCExpression r0 = r0.vartype
            lombok.javac.TreeMirrorMaker$1 r1 = new lombok.javac.TreeMirrorMaker$1
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r0.accept(r1)
        Lc9:
            r0 = r9
            return r0
    }

    public com.sun.tools.javac.tree.JCTree visitLabeledStatement(com.sun.source.tree.LabeledStatementTree r5, java.lang.Void r6) {
            r4 = this;
            r0 = r5
            com.sun.source.tree.StatementTree r0 = r0.getStatement()
            r1 = r4
            r2 = r6
            java.lang.Object r0 = r0.accept(r1, r2)
            com.sun.tools.javac.tree.JCTree r0 = (com.sun.tools.javac.tree.JCTree) r0
            return r0
    }

    private <K, V> void putIfAbsent(java.util.Map<K, V> r5, K r6, V r7) {
            r4 = this;
            r0 = r5
            r1 = r6
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L13
            r0 = r5
            r1 = r6
            r2 = r7
            java.lang.Object r0 = r0.put(r1, r2)
        L13:
            return
    }

    public /* bridge */ /* synthetic */ com.sun.tools.javac.tree.JCTree visitLabeledStatement(com.sun.source.tree.LabeledStatementTree r5, java.lang.Object r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.Void r2 = (java.lang.Void) r2
            com.sun.tools.javac.tree.JCTree r0 = r0.visitLabeledStatement(r1, r2)
            return r0
    }

    public /* bridge */ /* synthetic */ com.sun.tools.javac.tree.JCTree visitVariable(com.sun.source.tree.VariableTree r5, java.lang.Object r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.Void r2 = (java.lang.Void) r2
            com.sun.tools.javac.tree.JCTree r0 = r0.visitVariable(r1, r2)
            return r0
    }

    public /* bridge */ /* synthetic */ com.sun.tools.javac.util.List copy(com.sun.tools.javac.util.List r5, java.lang.Object r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            com.sun.tools.javac.util.List r1 = (com.sun.tools.javac.util.List) r1
            r2 = r6
            java.lang.Void r2 = (java.lang.Void) r2
            com.sun.tools.javac.util.List r0 = r0.copy(r1, r2)
            return r0
    }

    public /* bridge */ /* synthetic */ com.sun.tools.javac.tree.JCTree copy(com.sun.tools.javac.tree.JCTree r5, java.lang.Object r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            com.sun.tools.javac.tree.JCTree r1 = (com.sun.tools.javac.tree.JCTree) r1
            r2 = r6
            java.lang.Void r2 = (java.lang.Void) r2
            com.sun.tools.javac.tree.JCTree r0 = r0.copy(r1, r2)
            return r0
    }

    static /* synthetic */ java.util.IdentityHashMap access$4(lombok.javac.TreeMirrorMaker r2) {
            r0 = r2
            java.util.IdentityHashMap<com.sun.tools.javac.tree.JCTree, com.sun.tools.javac.tree.JCTree> r0 = r0.originalToCopy
            return r0
    }
}
