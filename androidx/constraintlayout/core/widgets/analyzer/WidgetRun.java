package androidx.constraintlayout.core.widgets.analyzer;

/* loaded from: classes.dex */
public abstract class WidgetRun implements androidx.constraintlayout.core.widgets.analyzer.Dependency {
    androidx.constraintlayout.core.widgets.analyzer.DimensionDependency dimension;
    protected androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehavior;
    public androidx.constraintlayout.core.widgets.analyzer.DependencyNode end;
    protected androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType mRunType;
    public int matchConstraintsType;
    public int orientation;
    boolean resolved;
    androidx.constraintlayout.core.widgets.analyzer.RunGroup runGroup;
    public androidx.constraintlayout.core.widgets.analyzer.DependencyNode start;
    androidx.constraintlayout.core.widgets.ConstraintWidget widget;

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.WidgetRun$1 */
    static /* synthetic */ class C01321 {

        /* renamed from: $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type */
        static final /* synthetic */ int[] f48x6930e354 = null;

        static {
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type[] r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun.C01321.f48x6930e354 = r0
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.C01321.f48x6930e354     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.C01321.f48x6930e354     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.C01321.f48x6930e354     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.C01321.f48x6930e354     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }
    }

    enum RunType extends java.lang.Enum<androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType> {
        private static final /* synthetic */ androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType[] $VALUES = null;
        public static final androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType CENTER = null;
        public static final androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType END = null;
        public static final androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType NONE = null;
        public static final androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType START = null;

        static {
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r0 = new androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType
                java.lang.String r1 = "NONE"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.NONE = r0
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = new androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType
                java.lang.String r3 = "START"
                r4 = 1
                r1.<init>(r3, r4)
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.START = r1
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r3 = new androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType
                java.lang.String r5 = "END"
                r6 = 2
                r3.<init>(r5, r6)
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.END = r3
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r5 = new androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType
                java.lang.String r7 = "CENTER"
                r8 = 3
                r5.<init>(r7, r8)
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.CENTER = r5
                r7 = 4
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType[] r7 = new androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.$VALUES = r7
                return
        }

        RunType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType valueOf(java.lang.String r1) {
                java.lang.Class<androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType> r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType) r1
                return r1
        }

        public static androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType[] values() {
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType[] r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType[] r0 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType[]) r0
                return r0
        }
    }

    public WidgetRun(androidx.constraintlayout.core.widgets.ConstraintWidget r2) {
            r1 = this;
            r1.<init>()
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = new androidx.constraintlayout.core.widgets.analyzer.DimensionDependency
            r0.<init>(r1)
            r1.dimension = r0
            r0 = 0
            r1.orientation = r0
            r1.resolved = r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = new androidx.constraintlayout.core.widgets.analyzer.DependencyNode
            r0.<init>(r1)
            r1.start = r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = new androidx.constraintlayout.core.widgets.analyzer.DependencyNode
            r0.<init>(r1)
            r1.end = r0
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.NONE
            r1.mRunType = r0
            r1.widget = r2
            return
    }

    private void resolveDimension(int r5, int r6) {
            r4 = this;
            int r0 = r4.matchConstraintsType
            if (r0 == 0) goto La7
            r1 = 1
            if (r0 == r1) goto L95
            r6 = 2
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == r6) goto L65
            r6 = 3
            if (r0 == r6) goto L11
            goto Lb0
        L11:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r4.widget
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r0.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r3) goto L37
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r4.widget
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            int r0 = r0.matchConstraintsType
            if (r0 != r6) goto L37
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r4.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r0.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r3) goto L37
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r4.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            int r0 = r0.matchConstraintsType
            if (r0 != r6) goto L37
            goto Lb0
        L37:
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r4.widget
            if (r5 != 0) goto L3e
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r6 = r6.verticalRun
            goto L40
        L3e:
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r6 = r6.horizontalRun
        L40:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r6.dimension
            boolean r0 = r0.resolved
            if (r0 == 0) goto Lb0
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r4.widget
            float r0 = r0.getDimensionRatio()
            if (r5 != r1) goto L57
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r5 = r6.dimension
            int r5 = r5.value
            float r5 = (float) r5
            float r5 = r5 / r0
            float r5 = r5 + r2
            int r5 = (int) r5
            goto L5f
        L57:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r5 = r6.dimension
            int r5 = r5.value
            float r5 = (float) r5
            float r0 = r0 * r5
            float r0 = r0 + r2
            int r5 = (int) r0
        L5f:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r6 = r4.dimension
            r6.resolve(r5)
            goto Lb0
        L65:
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r4.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r6.getParent()
            if (r6 == 0) goto Lb0
            if (r5 != 0) goto L72
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r6 = r6.horizontalRun
            goto L74
        L72:
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r6 = r6.verticalRun
        L74:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r6.dimension
            boolean r0 = r0.resolved
            if (r0 == 0) goto Lb0
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r4.widget
            if (r5 != 0) goto L81
            float r0 = r0.mMatchConstraintPercentWidth
            goto L83
        L81:
            float r0 = r0.mMatchConstraintPercentHeight
        L83:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r6 = r6.dimension
            int r6 = r6.value
            float r6 = (float) r6
            float r6 = r6 * r0
            float r6 = r6 + r2
            int r6 = (int) r6
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r4.dimension
            int r5 = r4.getLimitedDimension(r6, r5)
            r0.resolve(r5)
            goto Lb0
        L95:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r4.dimension
            int r0 = r0.wrapValue
            int r5 = r4.getLimitedDimension(r0, r5)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r4.dimension
            int r5 = java.lang.Math.min(r5, r6)
            r0.resolve(r5)
            goto Lb0
        La7:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r4.dimension
            int r5 = r4.getLimitedDimension(r6, r5)
            r0.resolve(r5)
        Lb0:
            return
    }

    protected final void addTarget(androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2, androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3, int r4) {
            r1 = this;
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r2.targets
            r0.add(r3)
            r2.margin = r4
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r3 = r3.dependencies
            r3.add(r2)
            return
    }

    protected final void addTarget(androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3, androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4, int r5, androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r6) {
            r2 = this;
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r3.targets
            r0.add(r4)
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r3.targets
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r2.dimension
            r0.add(r1)
            r3.marginFactor = r5
            r3.marginDependency = r6
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r4 = r4.dependencies
            r4.add(r3)
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r4 = r6.dependencies
            r4.add(r3)
            return
    }

    abstract void apply();

    abstract void applyToWidget();

    abstract void clear();

    protected final int getLimitedDimension(int r2, int r3) {
            r1 = this;
            if (r3 != 0) goto L17
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r1.widget
            int r3 = r3.mMatchConstraintMaxWidth
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.widget
            int r0 = r0.mMatchConstraintMinWidth
            int r0 = java.lang.Math.max(r0, r2)
            if (r3 <= 0) goto L14
            int r0 = java.lang.Math.min(r3, r2)
        L14:
            if (r0 == r2) goto L2c
            goto L2b
        L17:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r1.widget
            int r3 = r3.mMatchConstraintMaxHeight
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.widget
            int r0 = r0.mMatchConstraintMinHeight
            int r0 = java.lang.Math.max(r0, r2)
            if (r3 <= 0) goto L29
            int r0 = java.lang.Math.min(r3, r2)
        L29:
            if (r0 == r2) goto L2c
        L2b:
            r2 = r0
        L2c:
            return r2
    }

    protected final androidx.constraintlayout.core.widgets.analyzer.DependencyNode getTarget(androidx.constraintlayout.core.widgets.ConstraintAnchor r4) {
            r3 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r4.mTarget
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r4.mTarget
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.mOwner
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.mTarget
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = r4.mType
            int[] r2 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.C01321.f48x6930e354
            int r4 = r4.ordinal()
            r4 = r2[r4]
            r2 = 1
            if (r4 == r2) goto L3a
            r2 = 2
            if (r4 == r2) goto L35
            r2 = 3
            if (r4 == r2) goto L30
            r2 = 4
            if (r4 == r2) goto L2b
            r2 = 5
            if (r4 == r2) goto L26
            goto L3e
        L26:
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r4 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r4.end
            goto L3e
        L2b:
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r4 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r4.baseline
            goto L3e
        L30:
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r4 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r4.start
            goto L3e
        L35:
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r4 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r4.end
            goto L3e
        L3a:
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r4 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r4.start
        L3e:
            return r1
    }

    protected final androidx.constraintlayout.core.widgets.analyzer.DependencyNode getTarget(androidx.constraintlayout.core.widgets.ConstraintAnchor r3, int r4) {
            r2 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.mTarget
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.mTarget
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.mOwner
            if (r4 != 0) goto Lf
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r4 = r0.horizontalRun
            goto L11
        Lf:
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r4 = r0.verticalRun
        L11:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mTarget
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = r3.mType
            int[] r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.C01321.f48x6930e354
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            if (r3 == r0) goto L2d
            r0 = 2
            if (r3 == r0) goto L2a
            r0 = 3
            if (r3 == r0) goto L2d
            r0 = 5
            if (r3 == r0) goto L2a
            goto L2f
        L2a:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r4.end
            goto L2f
        L2d:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r4.start
        L2f:
            return r1
    }

    public long getWrapDimension() {
            r2 = this;
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r2.dimension
            boolean r0 = r0.resolved
            if (r0 == 0) goto Lc
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r2.dimension
            int r0 = r0.value
            long r0 = (long) r0
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public boolean isCenterConnection() {
            r5 = this;
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            int r0 = r0.size()
            r1 = 0
            r2 = r1
            r3 = r2
        Lb:
            if (r2 >= r0) goto L20
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r5.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r4 = r4.targets
            java.lang.Object r4 = r4.get(r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r4
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r4 = r4.run
            if (r4 == r5) goto L1d
            int r3 = r3 + 1
        L1d:
            int r2 = r2 + 1
            goto Lb
        L20:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            int r0 = r0.size()
            r2 = r1
        L29:
            if (r2 >= r0) goto L3e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r5.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r4 = r4.targets
            java.lang.Object r4 = r4.get(r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r4
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r4 = r4.run
            if (r4 == r5) goto L3b
            int r3 = r3 + 1
        L3b:
            int r2 = r2 + 1
            goto L29
        L3e:
            r0 = 2
            if (r3 < r0) goto L42
            r1 = 1
        L42:
            return r1
    }

    public boolean isDimensionResolved() {
            r1 = this;
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r1.dimension
            boolean r0 = r0.resolved
            return r0
    }

    public boolean isResolved() {
            r1 = this;
            boolean r0 = r1.resolved
            return r0
    }

    abstract void reset();

    abstract boolean supportsWrapComputation();

    @Override // androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(androidx.constraintlayout.core.widgets.analyzer.Dependency r1) {
            r0 = this;
            return
    }

    protected void updateRunCenter(androidx.constraintlayout.core.widgets.analyzer.Dependency r5, androidx.constraintlayout.core.widgets.ConstraintAnchor r6, androidx.constraintlayout.core.widgets.ConstraintAnchor r7, int r8) {
            r4 = this;
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = r4.getTarget(r6)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r4.getTarget(r7)
            boolean r1 = r5.resolved
            if (r1 == 0) goto L7d
            boolean r1 = r0.resolved
            if (r1 != 0) goto L11
            goto L7d
        L11:
            int r1 = r5.value
            int r6 = r6.getMargin()
            int r1 = r1 + r6
            int r6 = r0.value
            int r7 = r7.getMargin()
            int r6 = r6 - r7
            int r7 = r6 - r1
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r4.dimension
            boolean r2 = r2.resolved
            if (r2 != 0) goto L30
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = r4.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r3) goto L30
            r4.resolveDimension(r8, r7)
        L30:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r4.dimension
            boolean r2 = r2.resolved
            if (r2 != 0) goto L37
            return
        L37:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r4.dimension
            int r2 = r2.value
            if (r2 != r7) goto L48
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = r4.start
            r5.resolve(r1)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = r4.end
            r5.resolve(r6)
            return
        L48:
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r4.widget
            if (r8 != 0) goto L51
            float r7 = r7.getHorizontalBiasPercent()
            goto L55
        L51:
            float r7 = r7.getVerticalBiasPercent()
        L55:
            r8 = 1056964608(0x3f000000, float:0.5)
            if (r5 != r0) goto L5e
            int r1 = r5.value
            int r6 = r0.value
            r7 = r8
        L5e:
            int r6 = r6 - r1
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r5 = r4.dimension
            int r5 = r5.value
            int r6 = r6 - r5
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = r4.start
            float r0 = (float) r1
            float r0 = r0 + r8
            float r6 = (float) r6
            float r6 = r6 * r7
            float r0 = r0 + r6
            int r6 = (int) r0
            r5.resolve(r6)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = r4.end
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r4.start
            int r6 = r6.value
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r7 = r4.dimension
            int r7 = r7.value
            int r6 = r6 + r7
            r5.resolve(r6)
        L7d:
            return
    }

    protected void updateRunEnd(androidx.constraintlayout.core.widgets.analyzer.Dependency r1) {
            r0 = this;
            return
    }

    protected void updateRunStart(androidx.constraintlayout.core.widgets.analyzer.Dependency r1) {
            r0 = this;
            return
    }

    public long wrapSize(int r5) {
            r4 = this;
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r4.dimension
            boolean r0 = r0.resolved
            if (r0 == 0) goto L2b
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r4.dimension
            int r0 = r0.value
            long r0 = (long) r0
            boolean r2 = r4.isCenterConnection()
            if (r2 == 0) goto L1d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = r4.start
            int r5 = r5.margin
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r4.end
            int r2 = r2.margin
            int r5 = r5 - r2
        L1a:
            long r2 = (long) r5
            long r0 = r0 + r2
            goto L2a
        L1d:
            if (r5 != 0) goto L24
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = r4.start
            int r5 = r5.margin
            goto L1a
        L24:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = r4.end
            int r5 = r5.margin
            long r2 = (long) r5
            long r0 = r0 - r2
        L2a:
            return r0
        L2b:
            r0 = 0
            return r0
    }
}
