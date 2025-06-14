package androidx.constraintlayout.core.widgets.analyzer;

/* loaded from: classes.dex */
public class DependencyNode implements androidx.constraintlayout.core.widgets.analyzer.Dependency {
    public boolean delegateToWidgetRun;
    java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> dependencies;
    int margin;
    androidx.constraintlayout.core.widgets.analyzer.DimensionDependency marginDependency;
    int marginFactor;
    public boolean readyToSolve;
    public boolean resolved;
    androidx.constraintlayout.core.widgets.analyzer.WidgetRun run;
    java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> targets;
    androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type type;
    public androidx.constraintlayout.core.widgets.analyzer.Dependency updateDelegate;
    public int value;

    enum Type extends java.lang.Enum<androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type> {
        private static final /* synthetic */ androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type[] $VALUES = null;
        public static final androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type BASELINE = null;
        public static final androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type BOTTOM = null;
        public static final androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type HORIZONTAL_DIMENSION = null;
        public static final androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type LEFT = null;
        public static final androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type RIGHT = null;
        public static final androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type TOP = null;
        public static final androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type UNKNOWN = null;
        public static final androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type VERTICAL_DIMENSION = null;

        static {
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type r0 = new androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type
                java.lang.String r1 = "UNKNOWN"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.UNKNOWN = r0
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type r1 = new androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type
                java.lang.String r3 = "HORIZONTAL_DIMENSION"
                r4 = 1
                r1.<init>(r3, r4)
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.HORIZONTAL_DIMENSION = r1
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type r3 = new androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type
                java.lang.String r5 = "VERTICAL_DIMENSION"
                r6 = 2
                r3.<init>(r5, r6)
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.VERTICAL_DIMENSION = r3
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type r5 = new androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type
                java.lang.String r7 = "LEFT"
                r8 = 3
                r5.<init>(r7, r8)
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.LEFT = r5
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type r7 = new androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type
                java.lang.String r9 = "RIGHT"
                r10 = 4
                r7.<init>(r9, r10)
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.RIGHT = r7
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type r9 = new androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type
                java.lang.String r11 = "TOP"
                r12 = 5
                r9.<init>(r11, r12)
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.TOP = r9
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type r11 = new androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type
                java.lang.String r13 = "BOTTOM"
                r14 = 6
                r11.<init>(r13, r14)
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.BOTTOM = r11
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type r13 = new androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type
                java.lang.String r15 = "BASELINE"
                r14 = 7
                r13.<init>(r15, r14)
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.BASELINE = r13
                r15 = 8
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type[] r15 = new androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type[r15]
                r15[r2] = r0
                r15[r4] = r1
                r15[r6] = r3
                r15[r8] = r5
                r15[r10] = r7
                r15[r12] = r9
                r0 = 6
                r15[r0] = r11
                r15[r14] = r13
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.$VALUES = r15
                return
        }

        Type(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type valueOf(java.lang.String r1) {
                java.lang.Class<androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type> r0 = androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type) r1
                return r1
        }

        public static androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type[] values() {
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type[] r0 = androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type[] r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type[]) r0
                return r0
        }
    }

    public DependencyNode(androidx.constraintlayout.core.widgets.analyzer.WidgetRun r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.updateDelegate = r0
            r1 = 0
            r3.delegateToWidgetRun = r1
            r3.readyToSolve = r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type r2 = androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.UNKNOWN
            r3.type = r2
            r2 = 1
            r3.marginFactor = r2
            r3.marginDependency = r0
            r3.resolved = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.dependencies = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.targets = r0
            r3.run = r4
            return
    }

    public void addDependency(androidx.constraintlayout.core.widgets.analyzer.Dependency r2) {
            r1 = this;
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r1.dependencies
            r0.add(r2)
            boolean r0 = r1.resolved
            if (r0 == 0) goto Lc
            r2.update(r2)
        Lc:
            return
    }

    public void clear() {
            r1 = this;
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r1.targets
            r0.clear()
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r1.dependencies
            r0.clear()
            r0 = 0
            r1.resolved = r0
            r1.value = r0
            r1.readyToSolve = r0
            r1.delegateToWidgetRun = r0
            return
    }

    public java.lang.String name() {
            r3 = this;
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r0 = r3.run
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.widget
            java.lang.String r0 = r0.getDebugName()
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type r1 = r3.type
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type r2 = androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.LEFT
            if (r1 == r2) goto L29
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type r1 = r3.type
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type r2 = androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.RIGHT
            if (r1 != r2) goto L15
            goto L29
        L15:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "_VERTICAL"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L3c
        L29:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "_HORIZONTAL"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
        L3c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = ":"
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type r1 = r3.type
            java.lang.String r1 = r1.name()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void resolve(int r2) {
            r1 = this;
            boolean r0 = r1.resolved
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.resolved = r0
            r1.value = r2
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r2 = r1.dependencies
            java.util.Iterator r2 = r2.iterator()
        L10:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r2.next()
            androidx.constraintlayout.core.widgets.analyzer.Dependency r0 = (androidx.constraintlayout.core.widgets.analyzer.Dependency) r0
            r0.update(r0)
            goto L10
        L20:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1 = r2.run
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.widget
            java.lang.String r1 = r1.getDebugName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ":"
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type r1 = r2.type
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "("
            java.lang.StringBuilder r0 = r0.append(r1)
            boolean r1 = r2.resolved
            if (r1 == 0) goto L2e
            int r1 = r2.value
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L30
        L2e:
            java.lang.String r1 = "unresolved"
        L30:
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ") <t="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r2.targets
            int r1 = r1.size()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ":d="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r1 = r2.dependencies
            int r1 = r1.size()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ">"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(androidx.constraintlayout.core.widgets.analyzer.Dependency r6) {
            r5 = this;
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r6 = r5.targets
            java.util.Iterator r6 = r6.iterator()
        L6:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L17
            java.lang.Object r0 = r6.next()
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            boolean r0 = r0.resolved
            if (r0 != 0) goto L6
            return
        L17:
            r6 = 1
            r5.readyToSolve = r6
            androidx.constraintlayout.core.widgets.analyzer.Dependency r0 = r5.updateDelegate
            if (r0 == 0) goto L21
            r0.update(r5)
        L21:
            boolean r0 = r5.delegateToWidgetRun
            if (r0 == 0) goto L2b
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r6 = r5.run
            r6.update(r5)
            return
        L2b:
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r5.targets
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
        L33:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L48
            java.lang.Object r3 = r0.next()
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r3
            boolean r4 = r3 instanceof androidx.constraintlayout.core.widgets.analyzer.DimensionDependency
            if (r4 == 0) goto L44
            goto L33
        L44:
            int r2 = r2 + 1
            r1 = r3
            goto L33
        L48:
            if (r1 == 0) goto L6b
            if (r2 != r6) goto L6b
            boolean r6 = r1.resolved
            if (r6 == 0) goto L6b
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r6 = r5.marginDependency
            if (r6 == 0) goto L63
            boolean r6 = r6.resolved
            if (r6 == 0) goto L62
            int r6 = r5.marginFactor
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r5.marginDependency
            int r0 = r0.value
            int r6 = r6 * r0
            r5.margin = r6
            goto L63
        L62:
            return
        L63:
            int r6 = r1.value
            int r0 = r5.margin
            int r6 = r6 + r0
            r5.resolve(r6)
        L6b:
            androidx.constraintlayout.core.widgets.analyzer.Dependency r6 = r5.updateDelegate
            if (r6 == 0) goto L72
            r6.update(r5)
        L72:
            return
    }
}
