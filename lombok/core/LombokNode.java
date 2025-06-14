package lombok.core;

import lombok.core.AST;
import lombok.core.LombokNode;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/LombokNode.SCL.lombok */
public abstract class LombokNode<A extends lombok.core.AST<A, L, N>, L extends lombok.core.LombokNode<A, L, N>, N> implements lombok.core.DiagnosticsReceiver {
    protected final lombok.core.AST.Kind kind;
    protected final N node;
    protected lombok.core.LombokImmutableList<L> children;
    protected L parent;
    protected boolean isStructurallySignificant;

    protected LombokNode(N r5, java.util.List<L> r6, lombok.core.AST.Kind r7) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r7
            r0.kind = r1
            r0 = r4
            r1 = r5
            r0.node = r1
            r0 = r4
            r1 = r6
            if (r1 == 0) goto L1a
            r1 = r6
            lombok.core.LombokImmutableList r1 = lombok.core.LombokImmutableList.copyOf(r1)
            goto L1d
        L1a:
            lombok.core.LombokImmutableList r1 = lombok.core.LombokImmutableList.m59of()
        L1d:
            r0.children = r1
            r0 = r4
            lombok.core.LombokImmutableList<L extends lombok.core.LombokNode<A, L, N>> r0 = r0.children
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
            goto L50
        L2c:
            r0 = r9
            java.lang.Object r0 = r0.next()
            lombok.core.LombokNode r0 = (lombok.core.LombokNode) r0
            r8 = r0
            r0 = r8
            r1 = r4
            r0.parent = r1
            r0 = r8
            boolean r0 = r0.isStructurallySignificant
            if (r0 != 0) goto L50
            r0 = r8
            r1 = r4
            r2 = r5
            boolean r1 = r1.calculateIsStructurallySignificant(r2)
            r0.isStructurallySignificant = r1
        L50:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L2c
            r0 = r4
            r1 = r4
            r2 = 0
            boolean r1 = r1.calculateIsStructurallySignificant(r2)
            r0.isStructurallySignificant = r1
            return
    }

    public abstract A getAst();

    public java.lang.String toString() {
            r6 = this;
            java.lang.String r0 = "NODE %s (%s) %s"
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r6
            lombok.core.AST$Kind r4 = r4.kind
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r6
            N r4 = r4.node
            if (r4 != 0) goto L1b
            java.lang.String r4 = "(NULL)"
            goto L22
        L1b:
            r4 = r6
            N r4 = r4.node
            java.lang.Class r4 = r4.getClass()
        L22:
            r2[r3] = r4
            r2 = r1
            r3 = 2
            r4 = r6
            N r4 = r4.node
            if (r4 != 0) goto L31
            java.lang.String r4 = ""
            goto L35
        L31:
            r4 = r6
            N r4 = r4.node
        L35:
            r2[r3] = r4
            java.lang.String r0 = java.lang.String.format(r0, r1)
            return r0
    }

    public java.lang.String getPackageDeclaration() {
            r2 = this;
            r0 = r2
            lombok.core.AST r0 = r0.getAst()
            java.lang.String r0 = r0.getPackageDeclaration()
            return r0
    }

    public lombok.core.ImportList getImportList() {
            r2 = this;
            r0 = r2
            lombok.core.AST r0 = r0.getAst()
            lombok.core.ImportList r0 = r0.getImportList()
            return r0
    }

    public lombok.core.TypeResolver getImportListAsTypeResolver() {
            r2 = this;
            r0 = r2
            lombok.core.AST r0 = r0.getAst()
            lombok.core.TypeResolver r0 = r0.getImportListAsTypeResolver()
            return r0
    }

    protected abstract boolean calculateIsStructurallySignificant(N r1);

    public L getNodeFor(N r4) {
            r3 = this;
            r0 = r3
            lombok.core.AST r0 = r0.getAst()
            r1 = r4
            lombok.core.LombokNode r0 = r0.get(r1)
            return r0
    }

    public N get() {
            r2 = this;
            r0 = r2
            N r0 = r0.node
            return r0
    }

    public lombok.core.AST.Kind getKind() {
            r2 = this;
            r0 = r2
            lombok.core.AST$Kind r0 = r0.kind
            return r0
    }

    public abstract java.lang.String getName();

    /* renamed from: up */
    public L m66up() {
            r2 = this;
            r0 = r2
            L extends lombok.core.LombokNode<A, L, N> r0 = r0.parent
            r3 = r0
            goto Ld
        L8:
            r0 = r3
            L extends lombok.core.LombokNode<A, L, N> r0 = r0.parent
            r3 = r0
        Ld:
            r0 = r3
            if (r0 == 0) goto L18
            r0 = r3
            boolean r0 = r0.isStructurallySignificant
            if (r0 == 0) goto L8
        L18:
            r0 = r3
            return r0
    }

    public java.util.Collection<L> upFromAnnotationToFields() {
            r3 = this;
            r0 = r3
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ANNOTATION
            if (r0 == r1) goto Le
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        Le:
            r0 = r3
            lombok.core.LombokNode r0 = r0.m66up()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L21
            r0 = r4
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto L25
        L21:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L25:
            r0 = r4
            lombok.core.LombokNode r0 = r0.m66up()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L38
            r0 = r5
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.TYPE
            if (r0 == r1) goto L3c
        L38:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L3c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r5
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
            goto Lb0
        L50:
            r0 = r8
            java.lang.Object r0 = r0.next()
            lombok.core.LombokNode r0 = (lombok.core.LombokNode) r0
            r7 = r0
            r0 = r7
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.FIELD
            if (r0 == r1) goto L6a
            goto Lb0
        L6a:
            r0 = r7
            lombok.core.LombokImmutableList r0 = r0.down()
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
            goto La6
        L77:
            r0 = r10
            java.lang.Object r0 = r0.next()
            lombok.core.LombokNode r0 = (lombok.core.LombokNode) r0
            r9 = r0
            r0 = r9
            lombok.core.AST$Kind r0 = r0.getKind()
            lombok.core.AST$Kind r1 = lombok.core.AST.Kind.ANNOTATION
            if (r0 == r1) goto L91
            goto La6
        L91:
            r0 = r9
            java.lang.Object r0 = r0.get()
            r1 = r3
            java.lang.Object r1 = r1.get()
            if (r0 != r1) goto La6
            r0 = r6
            r1 = r7
            boolean r0 = r0.add(r1)
        La6:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L77
        Lb0:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L50
            r0 = r6
            return r0
    }

    public L directUp() {
            r2 = this;
            r0 = r2
            L extends lombok.core.LombokNode<A, L, N> r0 = r0.parent
            return r0
    }

    public lombok.core.LombokImmutableList<L> down() {
            r2 = this;
            r0 = r2
            lombok.core.LombokImmutableList<L extends lombok.core.LombokNode<A, L, N>> r0 = r0.children
            return r0
    }

    public int getLatestJavaSpecSupported() {
            r2 = this;
            r0 = r2
            lombok.core.AST r0 = r0.getAst()
            int r0 = r0.getLatestJavaSpecSupported()
            return r0
    }

    public int getSourceVersion() {
            r2 = this;
            r0 = r2
            lombok.core.AST r0 = r0.getAst()
            int r0 = r0.getSourceVersion()
            return r0
    }

    public L top() {
            r2 = this;
            r0 = r2
            lombok.core.AST r0 = r0.getAst()
            lombok.core.LombokNode r0 = r0.top()
            return r0
    }

    public java.lang.String getFileName() {
            r2 = this;
            r0 = r2
            lombok.core.AST r0 = r0.getAst()
            java.lang.String r0 = r0.getFileName()
            return r0
    }

    public L add(N r5, lombok.core.AST.Kind r6) {
            r4 = this;
            r0 = r4
            lombok.core.AST r0 = r0.getAst()
            r0.setChanged()
            r0 = r4
            lombok.core.AST r0 = r0.getAst()
            r1 = r5
            r2 = r6
            lombok.core.LombokNode r0 = r0.buildTree(r1, r2)
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L17
            r0 = 0
            return r0
        L17:
            r0 = r7
            r1 = r4
            r0.parent = r1
            r0 = r4
            r1 = r4
            lombok.core.LombokImmutableList<L extends lombok.core.LombokNode<A, L, N>> r1 = r1.children
            r2 = r7
            lombok.core.LombokImmutableList r1 = r1.append(r2)
            r0.children = r1
            r0 = r7
            return r0
    }

    public void rebuild() {
            r4 = this;
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r4
            r1 = r5
            r0.gatherAndRemoveChildren(r1)
            r0 = r4
            lombok.core.AST r0 = r0.getAst()
            r1 = r4
            java.lang.Object r1 = r1.get()
            r2 = r4
            lombok.core.AST$Kind r2 = r2.kind
            lombok.core.LombokNode r0 = r0.buildTree(r1, r2)
            r6 = r0
            r0 = r4
            lombok.core.AST r0 = r0.getAst()
            r0.setChanged()
            r0 = r4
            lombok.core.AST r0 = r0.getAst()
            r1 = r5
            r2 = r6
            lombok.core.LombokNode r0 = r0.replaceNewWithExistingOld(r1, r2)
            return
    }

    private void gatherAndRemoveChildren(java.util.Map<N, L> r5) {
            r4 = this;
            r0 = r4
            lombok.core.LombokImmutableList<L extends lombok.core.LombokNode<A, L, N>> r0 = r0.children
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L1a
        Lb:
            r0 = r7
            java.lang.Object r0 = r0.next()
            lombok.core.LombokNode r0 = (lombok.core.LombokNode) r0
            r6 = r0
            r0 = r6
            r1 = r5
            r0.gatherAndRemoveChildren(r1)
        L1a:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Lb
            r0 = r4
            lombok.core.AST r0 = r0.getAst()
            java.util.Map<N, N> r0 = r0.identityDetector
            r1 = r4
            java.lang.Object r1 = r1.get()
            java.lang.Object r0 = r0.remove(r1)
            r0 = r5
            r1 = r4
            java.lang.Object r1 = r1.get()
            r2 = r4
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            lombok.core.LombokImmutableList r1 = lombok.core.LombokImmutableList.m59of()
            r0.children = r1
            r0 = r4
            lombok.core.AST r0 = r0.getAst()
            java.util.Map r0 = r0.getNodeMap()
            r1 = r4
            java.lang.Object r1 = r1.get()
            java.lang.Object r0 = r0.remove(r1)
            return
    }

    public void removeChild(L r5) {
            r4 = this;
            r0 = r4
            lombok.core.AST r0 = r0.getAst()
            r0.setChanged()
            r0 = r4
            r1 = r4
            lombok.core.LombokImmutableList<L extends lombok.core.LombokNode<A, L, N>> r1 = r1.children
            r2 = r5
            lombok.core.LombokImmutableList r1 = r1.removeElement(r2)
            r0.children = r1
            return
    }

    public boolean isStructurallySignificant() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.isStructurallySignificant
            return r0
    }

    public abstract boolean hasAnnotation(java.lang.Class<? extends java.lang.annotation.Annotation> r1);

    public abstract <Z extends java.lang.annotation.Annotation> lombok.core.AnnotationValues<Z> findAnnotation(java.lang.Class<Z> r1);

    public abstract boolean isStatic();

    public abstract boolean isFinal();

    public abstract boolean isTransient();

    public abstract boolean isPrimitive();

    public abstract boolean isEnumMember();

    public abstract boolean isEnumType();

    public abstract java.lang.String fieldOrMethodBaseType();

    public abstract int countMethodParameters();

    public abstract int getStartPos();
}
