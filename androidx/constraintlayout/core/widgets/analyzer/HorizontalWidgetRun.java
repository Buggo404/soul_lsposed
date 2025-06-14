package androidx.constraintlayout.core.widgets.analyzer;

/* loaded from: classes.dex */
public class HorizontalWidgetRun extends androidx.constraintlayout.core.widgets.analyzer.WidgetRun {
    private static int[] tempDimensions;

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun$1 */
    static /* synthetic */ class C01301 {

        /* renamed from: $SwitchMap$androidx$constraintlayout$core$widgets$analyzer$WidgetRun$RunType */
        static final /* synthetic */ int[] f45x56910102 = null;

        static {
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType[] r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun.C01301.f45x56910102 = r0
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.START     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun.C01301.f45x56910102     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.END     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun.C01301.f45x56910102     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.CENTER     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    static {
            r0 = 2
            int[] r0 = new int[r0]
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun.tempDimensions = r0
            return
    }

    public HorizontalWidgetRun(androidx.constraintlayout.core.widgets.ConstraintWidget r2) {
            r1 = this;
            r1.<init>(r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type r0 = androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.LEFT
            r2.type = r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.end
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type r0 = androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.RIGHT
            r2.type = r0
            r2 = 0
            r1.orientation = r2
            return
    }

    private void computeInsetRatio(int[] r3, int r4, int r5, int r6, int r7, float r8, int r9) {
            r2 = this;
            int r5 = r5 - r4
            int r7 = r7 - r6
            r4 = -1
            r6 = 0
            r0 = 1056964608(0x3f000000, float:0.5)
            r1 = 1
            if (r9 == r4) goto L20
            if (r9 == 0) goto L17
            if (r9 == r1) goto Le
            goto L35
        Le:
            float r4 = (float) r5
            float r4 = r4 * r8
            float r4 = r4 + r0
            int r4 = (int) r4
            r3[r6] = r5
            r3[r1] = r4
            goto L35
        L17:
            float r4 = (float) r7
            float r4 = r4 * r8
            float r4 = r4 + r0
            int r4 = (int) r4
            r3[r6] = r4
            r3[r1] = r7
            goto L35
        L20:
            float r4 = (float) r7
            float r4 = r4 * r8
            float r4 = r4 + r0
            int r4 = (int) r4
            float r9 = (float) r5
            float r9 = r9 / r8
            float r9 = r9 + r0
            int r8 = (int) r9
            if (r4 > r5) goto L2f
            r3[r6] = r4
            r3[r1] = r7
            goto L35
        L2f:
            if (r8 > r7) goto L35
            r3[r6] = r5
            r3[r1] = r8
        L35:
            return
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void apply() {
            r5 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            boolean r0 = r0.measured
            if (r0 == 0) goto L11
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r5.dimension
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r5.widget
            int r1 = r1.getWidth()
            r0.resolve(r1)
        L11:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r5.dimension
            boolean r0 = r0.resolved
            if (r0 != 0) goto L94
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r0.getHorizontalDimensionBehaviour()
            r5.dimensionBehavior = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r5.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 == r1) goto Ld6
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r5.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r0 != r1) goto L82
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getParent()
            if (r0 == 0) goto L82
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r0.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r1 == r2) goto L43
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r0.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r1 != r2) goto L82
        L43:
            int r1 = r0.getWidth()
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mLeft
            int r2 = r2.getMargin()
            int r1 = r1 - r2
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mRight
            int r2 = r2.getMargin()
            int r1 = r1 - r2
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r5.start
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r3 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r3.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.mLeft
            int r4 = r4.getMargin()
            r5.addTarget(r2, r3, r4)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r5.end
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mRight
            int r3 = r3.getMargin()
            int r3 = -r3
            r5.addTarget(r2, r0, r3)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r5.dimension
            r0.resolve(r1)
            return
        L82:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r5.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r0 != r1) goto Ld6
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r5.dimension
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r5.widget
            int r1 = r1.getWidth()
            r0.resolve(r1)
            goto Ld6
        L94:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r5.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r0 != r1) goto Ld6
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getParent()
            if (r0 == 0) goto Ld6
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r0.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r1 == r2) goto Lb2
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r0.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r1 != r2) goto Ld6
        Lb2:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r5.start
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r2 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r2.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mLeft
            int r3 = r3.getMargin()
            r5.addTarget(r1, r2, r3)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r5.end
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mRight
            int r2 = r2.getMargin()
            int r2 = -r2
            r5.addTarget(r1, r0, r2)
            return
        Ld6:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r5.dimension
            boolean r0 = r0.resolved
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L202
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            boolean r0 = r0.measured
            if (r0 == 0) goto L202
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r1]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 == 0) goto L160
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r2]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 == 0) goto L160
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            boolean r0 = r0.isInHorizontalChain()
            if (r0 == 0) goto L11f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r3.mListAnchors
            r1 = r3[r1]
            int r1 = r1.getMargin()
            r0.margin = r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.end
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            r1 = r1[r2]
            int r1 = r1.getMargin()
            int r1 = -r1
            r0.margin = r1
            goto L43c
        L11f:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r1]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.getTarget(r0)
            if (r0 == 0) goto L13a
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r5.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r4 = r4.mListAnchors
            r1 = r4[r1]
            int r1 = r1.getMargin()
            r5.addTarget(r3, r0, r1)
        L13a:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r2]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.getTarget(r0)
            if (r0 == 0) goto L156
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r5.end
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r3.mListAnchors
            r3 = r3[r2]
            int r3 = r3.getMargin()
            int r3 = -r3
            r5.addTarget(r1, r0, r3)
        L156:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.start
            r0.delegateToWidgetRun = r2
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.end
            r0.delegateToWidgetRun = r2
            goto L43c
        L160:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r1]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 == 0) goto L192
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r1]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.getTarget(r0)
            if (r0 == 0) goto L43c
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r5.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r3.mListAnchors
            r1 = r3[r1]
            int r1 = r1.getMargin()
            r5.addTarget(r2, r0, r1)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.end
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r5.start
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r5.dimension
            int r2 = r2.value
            r5.addTarget(r0, r1, r2)
            goto L43c
        L192:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r2]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 == 0) goto L1c6
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r2]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.getTarget(r0)
            if (r0 == 0) goto L43c
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r5.end
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r3.mListAnchors
            r2 = r3[r2]
            int r2 = r2.getMargin()
            int r2 = -r2
            r5.addTarget(r1, r0, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r5.end
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r5.dimension
            int r2 = r2.value
            int r2 = -r2
            r5.addTarget(r0, r1, r2)
            goto L43c
        L1c6:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            boolean r0 = r0 instanceof androidx.constraintlayout.core.widgets.Helper
            if (r0 != 0) goto L43c
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getParent()
            if (r0 == 0) goto L43c
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.getAnchor(r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 != 0) goto L43c
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getParent()
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r5.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r5.widget
            int r2 = r2.getX()
            r5.addTarget(r1, r0, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.end
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r5.start
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r5.dimension
            int r2 = r2.value
            r5.addTarget(r0, r1, r2)
            goto L43c
        L202:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r5.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r3) goto L351
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            int r0 = r0.mMatchConstraintDefaultWidth
            r3 = 2
            if (r0 == r3) goto L320
            r3 = 3
            if (r0 == r3) goto L214
            goto L351
        L214:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            int r0 = r0.mMatchConstraintDefaultHeight
            if (r0 != r3) goto L2c9
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.start
            r0.updateDelegate = r5
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.end
            r0.updateDelegate = r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            r0.updateDelegate = r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            r0.updateDelegate = r5
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r5.dimension
            r0.updateDelegate = r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            boolean r0 = r0.isInVerticalChain()
            if (r0 == 0) goto L296
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r5.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r5.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r3 = r3.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r3.dimension
            r0.add(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r5.dimension
            r0.add(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            r0.updateDelegate = r5
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r5.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r5.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r3 = r3.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r3.start
            r0.add(r3)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r5.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r5.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r3 = r3.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r3.end
            r0.add(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r5.dimension
            r0.add(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r5.dimension
            r0.add(r3)
            goto L351
        L296:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            boolean r0 = r0.isInHorizontalChain()
            if (r0 == 0) goto L2ba
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r5.dimension
            r0.add(r3)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r5.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r5.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r3 = r3.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r3.dimension
            r0.add(r3)
            goto L351
        L2ba:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r5.dimension
            r0.add(r3)
            goto L351
        L2c9:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r5.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r3 = r3.targets
            r3.add(r0)
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r5.dimension
            r0.add(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r5.dimension
            r0.add(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r5.dimension
            r0.add(r3)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r5.dimension
            r0.delegateToWidgetRun = r2
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r5.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r5.start
            r0.add(r3)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r5.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r5.end
            r0.add(r3)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r5.dimension
            r0.add(r3)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r5.dimension
            r0.add(r3)
            goto L351
        L320:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getParent()
            if (r0 != 0) goto L329
            goto L351
        L329:
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r5.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r3 = r3.targets
            r3.add(r0)
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r5.dimension
            r0.add(r3)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r5.dimension
            r0.delegateToWidgetRun = r2
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r5.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r5.start
            r0.add(r3)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r5.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r5.end
            r0.add(r3)
        L351:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r1]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 == 0) goto L3b0
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r2]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 == 0) goto L3b0
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            boolean r0 = r0.isInHorizontalChain()
            if (r0 == 0) goto L38c
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r3.mListAnchors
            r1 = r3[r1]
            int r1 = r1.getMargin()
            r0.margin = r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.end
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            r1 = r1[r2]
            int r1 = r1.getMargin()
            int r1 = -r1
            r0.margin = r1
            goto L43c
        L38c:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r1]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.getTarget(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            r1 = r1[r2]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r5.getTarget(r1)
            if (r0 == 0) goto L3a5
            r0.addDependency(r5)
        L3a5:
            if (r1 == 0) goto L3aa
            r1.addDependency(r5)
        L3aa:
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.CENTER
            r5.mRunType = r0
            goto L43c
        L3b0:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r1]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 == 0) goto L3df
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r1]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.getTarget(r0)
            if (r0 == 0) goto L43c
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r5.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r4 = r4.mListAnchors
            r1 = r4[r1]
            int r1 = r1.getMargin()
            r5.addTarget(r3, r0, r1)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.end
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r5.start
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r5.dimension
            r5.addTarget(r0, r1, r2, r3)
            goto L43c
        L3df:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r2]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 == 0) goto L410
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r2]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.getTarget(r0)
            if (r0 == 0) goto L43c
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r5.end
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r3.mListAnchors
            r2 = r3[r2]
            int r2 = r2.getMargin()
            int r2 = -r2
            r5.addTarget(r1, r0, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r5.end
            r2 = -1
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r5.dimension
            r5.addTarget(r0, r1, r2, r3)
            goto L43c
        L410:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            boolean r0 = r0 instanceof androidx.constraintlayout.core.widgets.Helper
            if (r0 != 0) goto L43c
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getParent()
            if (r0 == 0) goto L43c
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getParent()
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r5.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r5.widget
            int r3 = r3.getX()
            r5.addTarget(r1, r0, r3)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.end
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r5.start
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r5.dimension
            r5.addTarget(r0, r1, r2, r3)
        L43c:
            return
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void applyToWidget() {
            r2 = this;
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r2.start
            boolean r0 = r0.resolved
            if (r0 == 0) goto Lf
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r2.widget
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r2.start
            int r1 = r1.value
            r0.setX(r1)
        Lf:
            return
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void clear() {
            r1 = this;
            r0 = 0
            r1.runGroup = r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r1.start
            r0.clear()
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r1.end
            r0.clear()
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r1.dimension
            r0.clear()
            r0 = 0
            r1.resolved = r0
            return
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void reset() {
            r2 = this;
            r0 = 0
            r2.resolved = r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r2.start
            r1.clear()
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r2.start
            r1.resolved = r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r2.end
            r1.clear()
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r2.end
            r1.resolved = r0
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r2.dimension
            r1.resolved = r0
            return
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    boolean supportsWrapComputation() {
            r3 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r3.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r2 = 1
            if (r0 != r1) goto L10
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r3.widget
            int r0 = r0.mMatchConstraintDefaultWidth
            if (r0 != 0) goto Le
            return r2
        Le:
            r0 = 0
            return r0
        L10:
            return r2
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HorizontalRun "
            r0.<init>(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r2.widget
            java.lang.String r1 = r1.getDebugName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(androidx.constraintlayout.core.widgets.analyzer.Dependency r17) {
            r16 = this;
            r8 = r16
            int[] r0 = androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun.C01301.f45x56910102
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = r8.mRunType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 3
            r9 = 1
            r10 = 0
            if (r0 == r9) goto L2b
            if (r0 == r1) goto L25
            if (r0 == r2) goto L17
            goto L30
        L17:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mLeft
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r8.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mRight
            r3 = r17
            r8.updateRunCenter(r3, r0, r1, r10)
            return
        L25:
            r3 = r17
            r16.updateRunEnd(r17)
            goto L30
        L2b:
            r3 = r17
            r16.updateRunStart(r17)
        L30:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            boolean r0 = r0.resolved
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r0 != 0) goto L351
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r8.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r3) goto L351
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            int r0 = r0.mMatchConstraintDefaultWidth
            if (r0 == r1) goto L32e
            if (r0 == r2) goto L48
            goto L351
        L48:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            int r0 = r0.mMatchConstraintDefaultHeight
            r1 = -1
            if (r0 == 0) goto L9e
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            int r0 = r0.mMatchConstraintDefaultHeight
            if (r0 != r2) goto L56
            goto L9e
        L56:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            int r0 = r0.getDimensionRatioSide()
            if (r0 == r1) goto L85
            if (r0 == 0) goto L74
            if (r0 == r9) goto L64
            r0 = r10
            goto L97
        L64:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            int r0 = r0.value
            float r0 = (float) r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r8.widget
            float r1 = r1.getDimensionRatio()
            goto L94
        L74:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            int r0 = r0.value
            float r0 = (float) r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r8.widget
            float r1 = r1.getDimensionRatio()
            float r0 = r0 / r1
            goto L95
        L85:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            int r0 = r0.value
            float r0 = (float) r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r8.widget
            float r1 = r1.getDimensionRatio()
        L94:
            float r0 = r0 * r1
        L95:
            float r0 = r0 + r11
            int r0 = (int) r0
        L97:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r8.dimension
            r1.resolve(r0)
            goto L351
        L9e:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r12 = r0.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r13 = r0.end
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 == 0) goto Lb4
            r0 = r9
            goto Lb5
        Lb4:
            r0 = r10
        Lb5:
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r8.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 == 0) goto Lbf
            r2 = r9
            goto Lc0
        Lbf:
            r2 = r10
        Lc0:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r8.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 == 0) goto Lca
            r3 = r9
            goto Lcb
        Lca:
            r3 = r10
        Lcb:
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r8.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.mTarget
            if (r4 == 0) goto Ld5
            r4 = r9
            goto Ld6
        Ld5:
            r4 = r10
        Ld6:
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r8.widget
            int r14 = r5.getDimensionRatioSide()
            if (r0 == 0) goto L22c
            if (r2 == 0) goto L22c
            if (r3 == 0) goto L22c
            if (r4 == 0) goto L22c
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            float r15 = r0.getDimensionRatio()
            boolean r0 = r12.resolved
            if (r0 == 0) goto L14f
            boolean r0 = r13.resolved
            if (r0 == 0) goto L14f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.start
            boolean r0 = r0.readyToSolve
            if (r0 == 0) goto L14e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.end
            boolean r0 = r0.readyToSolve
            if (r0 != 0) goto Lff
            goto L14e
        Lff:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.start
            int r1 = r1.margin
            int r2 = r0 + r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.end
            int r1 = r1.margin
            int r3 = r0 - r1
            int r0 = r12.value
            int r1 = r12.margin
            int r4 = r0 + r1
            int r0 = r13.value
            int r1 = r13.margin
            int r5 = r0 - r1
            int[] r1 = androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun.tempDimensions
            r0 = r16
            r6 = r15
            r7 = r14
            r0.computeInsetRatio(r1, r2, r3, r4, r5, r6, r7)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            int[] r1 = androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun.tempDimensions
            r1 = r1[r10]
            r0.resolve(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            int[] r1 = androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun.tempDimensions
            r1 = r1[r9]
            r0.resolve(r1)
        L14e:
            return
        L14f:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.start
            boolean r0 = r0.resolved
            if (r0 == 0) goto L1b5
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.end
            boolean r0 = r0.resolved
            if (r0 == 0) goto L1b5
            boolean r0 = r12.readyToSolve
            if (r0 == 0) goto L1b4
            boolean r0 = r13.readyToSolve
            if (r0 != 0) goto L164
            goto L1b4
        L164:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.start
            int r0 = r0.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.start
            int r1 = r1.margin
            int r2 = r0 + r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.end
            int r0 = r0.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.end
            int r1 = r1.margin
            int r3 = r0 - r1
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r12.targets
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.value
            int r1 = r12.margin
            int r4 = r0 + r1
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r13.targets
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.value
            int r1 = r13.margin
            int r5 = r0 - r1
            int[] r1 = androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun.tempDimensions
            r0 = r16
            r6 = r15
            r7 = r14
            r0.computeInsetRatio(r1, r2, r3, r4, r5, r6, r7)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            int[] r1 = androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun.tempDimensions
            r1 = r1[r10]
            r0.resolve(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            int[] r1 = androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun.tempDimensions
            r1 = r1[r9]
            r0.resolve(r1)
            goto L1b5
        L1b4:
            return
        L1b5:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.start
            boolean r0 = r0.readyToSolve
            if (r0 == 0) goto L22b
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.end
            boolean r0 = r0.readyToSolve
            if (r0 == 0) goto L22b
            boolean r0 = r12.readyToSolve
            if (r0 == 0) goto L22b
            boolean r0 = r13.readyToSolve
            if (r0 != 0) goto L1ca
            goto L22b
        L1ca:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.start
            int r1 = r1.margin
            int r2 = r0 + r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.end
            int r1 = r1.margin
            int r3 = r0 - r1
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r12.targets
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.value
            int r1 = r12.margin
            int r4 = r0 + r1
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r13.targets
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.value
            int r1 = r13.margin
            int r5 = r0 - r1
            int[] r1 = androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun.tempDimensions
            r0 = r16
            r6 = r15
            r7 = r14
            r0.computeInsetRatio(r1, r2, r3, r4, r5, r6, r7)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            int[] r1 = androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun.tempDimensions
            r1 = r1[r10]
            r0.resolve(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            int[] r1 = androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun.tempDimensions
            r1 = r1[r9]
            r0.resolve(r1)
            goto L351
        L22b:
            return
        L22c:
            if (r0 == 0) goto L2b5
            if (r3 == 0) goto L2b5
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.start
            boolean r0 = r0.readyToSolve
            if (r0 == 0) goto L2b4
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.end
            boolean r0 = r0.readyToSolve
            if (r0 != 0) goto L23e
            goto L2b4
        L23e:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            float r0 = r0.getDimensionRatio()
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r2 = r2.targets
            java.lang.Object r2 = r2.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r2
            int r2 = r2.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r8.start
            int r3 = r3.margin
            int r2 = r2 + r3
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r8.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r3 = r3.targets
            java.lang.Object r3 = r3.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r3
            int r3 = r3.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r8.end
            int r4 = r4.margin
            int r3 = r3 - r4
            if (r14 == r1) goto L291
            if (r14 == 0) goto L291
            if (r14 == r9) goto L26e
            goto L351
        L26e:
            int r3 = r3 - r2
            int r1 = r8.getLimitedDimension(r3, r10)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.getLimitedDimension(r2, r9)
            if (r2 == r3) goto L281
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L281:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            r0.resolve(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            r0.resolve(r3)
            goto L351
        L291:
            int r3 = r3 - r2
            int r1 = r8.getLimitedDimension(r3, r10)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.getLimitedDimension(r2, r9)
            if (r2 == r3) goto L2a4
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L2a4:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            r0.resolve(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            r0.resolve(r3)
            goto L351
        L2b4:
            return
        L2b5:
            if (r2 == 0) goto L351
            if (r4 == 0) goto L351
            boolean r0 = r12.readyToSolve
            if (r0 == 0) goto L32d
            boolean r0 = r13.readyToSolve
            if (r0 != 0) goto L2c2
            goto L32d
        L2c2:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            float r0 = r0.getDimensionRatio()
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r2 = r12.targets
            java.lang.Object r2 = r2.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r2
            int r2 = r2.value
            int r3 = r12.margin
            int r2 = r2 + r3
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r3 = r13.targets
            java.lang.Object r3 = r3.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r3
            int r3 = r3.value
            int r4 = r13.margin
            int r3 = r3 - r4
            if (r14 == r1) goto L30b
            if (r14 == 0) goto L2e9
            if (r14 == r9) goto L30b
            goto L351
        L2e9:
            int r3 = r3 - r2
            int r1 = r8.getLimitedDimension(r3, r9)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.getLimitedDimension(r2, r10)
            if (r2 == r3) goto L2fc
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L2fc:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            r0.resolve(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            r0.resolve(r1)
            goto L351
        L30b:
            int r3 = r3 - r2
            int r1 = r8.getLimitedDimension(r3, r9)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.getLimitedDimension(r2, r10)
            if (r2 == r3) goto L31e
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L31e:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            r0.resolve(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            r0.resolve(r1)
            goto L351
        L32d:
            return
        L32e:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getParent()
            if (r0 == 0) goto L351
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r1 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r1.dimension
            boolean r1 = r1.resolved
            if (r1 == 0) goto L351
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r8.widget
            float r1 = r1.mMatchConstraintPercentWidth
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            int r0 = r0.value
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r11
            int r0 = (int) r0
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r8.dimension
            r1.resolve(r0)
        L351:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.start
            boolean r0 = r0.readyToSolve
            if (r0 == 0) goto L47b
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.end
            boolean r0 = r0.readyToSolve
            if (r0 != 0) goto L35f
            goto L47b
        L35f:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.start
            boolean r0 = r0.resolved
            if (r0 == 0) goto L372
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.end
            boolean r0 = r0.resolved
            if (r0 == 0) goto L372
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            boolean r0 = r0.resolved
            if (r0 == 0) goto L372
            return
        L372:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            boolean r0 = r0.resolved
            if (r0 != 0) goto L3c0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r8.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r1) goto L3c0
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            int r0 = r0.mMatchConstraintDefaultWidth
            if (r0 != 0) goto L3c0
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            boolean r0 = r0.isInHorizontalChain()
            if (r0 != 0) goto L3c0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r1.targets
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r0 = r0.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.start
            int r2 = r2.margin
            int r0 = r0 + r2
            int r1 = r1.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.end
            int r2 = r2.margin
            int r1 = r1 + r2
            int r2 = r1 - r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r8.start
            r3.resolve(r0)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.end
            r0.resolve(r1)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            r0.resolve(r2)
            return
        L3c0:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            boolean r0 = r0.resolved
            if (r0 != 0) goto L426
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r8.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r1) goto L426
            int r0 = r8.matchConstraintsType
            if (r0 != r9) goto L426
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            int r0 = r0.size()
            if (r0 <= 0) goto L426
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            int r0 = r0.size()
            if (r0 <= 0) goto L426
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r1.targets
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r0 = r0.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.start
            int r2 = r2.margin
            int r0 = r0 + r2
            int r1 = r1.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.end
            int r2 = r2.margin
            int r1 = r1 + r2
            int r1 = r1 - r0
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            int r0 = r0.wrapValue
            int r0 = java.lang.Math.min(r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r8.widget
            int r1 = r1.mMatchConstraintMaxWidth
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r8.widget
            int r2 = r2.mMatchConstraintMinWidth
            int r0 = java.lang.Math.max(r2, r0)
            if (r1 <= 0) goto L421
            int r0 = java.lang.Math.min(r1, r0)
        L421:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r8.dimension
            r1.resolve(r0)
        L426:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            boolean r0 = r0.resolved
            if (r0 != 0) goto L42d
            return
        L42d:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r1.targets
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r2 = r0.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r8.start
            int r3 = r3.margin
            int r2 = r2 + r3
            int r3 = r1.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r8.end
            int r4 = r4.margin
            int r3 = r3 + r4
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r8.widget
            float r4 = r4.getHorizontalBiasPercent()
            if (r0 != r1) goto L45c
            int r2 = r0.value
            int r3 = r1.value
            r4 = r11
        L45c:
            int r3 = r3 - r2
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            int r0 = r0.value
            int r3 = r3 - r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.start
            float r1 = (float) r2
            float r1 = r1 + r11
            float r2 = (float) r3
            float r2 = r2 * r4
            float r1 = r1 + r2
            int r1 = (int) r1
            r0.resolve(r1)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.end
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.start
            int r1 = r1.value
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r8.dimension
            int r2 = r2.value
            int r1 = r1 + r2
            r0.resolve(r1)
        L47b:
            return
    }
}
