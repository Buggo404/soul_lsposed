package androidx.constraintlayout.core.widgets.analyzer;

/* loaded from: classes.dex */
public class VerticalWidgetRun extends androidx.constraintlayout.core.widgets.analyzer.WidgetRun {
    public androidx.constraintlayout.core.widgets.analyzer.DependencyNode baseline;
    androidx.constraintlayout.core.widgets.analyzer.DimensionDependency baselineDimension;

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun$1 */
    static /* synthetic */ class C01311 {

        /* renamed from: $SwitchMap$androidx$constraintlayout$core$widgets$analyzer$WidgetRun$RunType */
        static final /* synthetic */ int[] f46x56910102 = null;

        static {
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType[] r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun.C01311.f46x56910102 = r0
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.START     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun.C01311.f46x56910102     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.END     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun.C01311.f46x56910102     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.CENTER     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    public VerticalWidgetRun(androidx.constraintlayout.core.widgets.ConstraintWidget r2) {
            r1 = this;
            r1.<init>(r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = new androidx.constraintlayout.core.widgets.analyzer.DependencyNode
            r2.<init>(r1)
            r1.baseline = r2
            r2 = 0
            r1.baselineDimension = r2
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type r0 = androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.TOP
            r2.type = r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.end
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type r0 = androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.BOTTOM
            r2.type = r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r1.baseline
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type r0 = androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.BASELINE
            r2.type = r0
            r2 = 1
            r1.orientation = r2
            return
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void apply() {
            r7 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            boolean r0 = r0.measured
            if (r0 == 0) goto L11
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r7.dimension
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r7.widget
            int r1 = r1.getHeight()
            r0.resolve(r1)
        L11:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r7.dimension
            boolean r0 = r0.resolved
            if (r0 != 0) goto L9b
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r0.getVerticalDimensionBehaviour()
            r7.dimensionBehavior = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            boolean r0 = r0.hasBaseline()
            if (r0 == 0) goto L2e
            androidx.constraintlayout.core.widgets.analyzer.BaselineDimensionDependency r0 = new androidx.constraintlayout.core.widgets.analyzer.BaselineDimensionDependency
            r0.<init>(r7)
            r7.baselineDimension = r0
        L2e:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r7.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 == r1) goto Ld5
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r7.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r0 != r1) goto L89
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getParent()
            if (r0 == 0) goto L89
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r0.getVerticalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r1 != r2) goto L89
            int r1 = r0.getHeight()
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTop
            int r2 = r2.getMargin()
            int r1 = r1 - r2
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mBottom
            int r2 = r2.getMargin()
            int r1 = r1 - r2
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r7.start
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r3 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r3.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.mTop
            int r4 = r4.getMargin()
            r7.addTarget(r2, r3, r4)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r7.end
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mBottom
            int r3 = r3.getMargin()
            int r3 = -r3
            r7.addTarget(r2, r0, r3)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r7.dimension
            r0.resolve(r1)
            return
        L89:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r7.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r0 != r1) goto Ld5
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r7.dimension
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r7.widget
            int r1 = r1.getHeight()
            r0.resolve(r1)
            goto Ld5
        L9b:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r7.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r0 != r1) goto Ld5
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getParent()
            if (r0 == 0) goto Ld5
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r0.getVerticalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r1 != r2) goto Ld5
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r2 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r2.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mTop
            int r3 = r3.getMargin()
            r7.addTarget(r1, r2, r3)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r7.end
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mBottom
            int r2 = r2.getMargin()
            int r2 = -r2
            r7.addTarget(r1, r0, r2)
            return
        Ld5:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r7.dimension
            boolean r0 = r0.resolved
            r1 = 0
            r2 = 4
            r3 = 1
            r4 = 2
            r5 = 3
            if (r0 == 0) goto L28d
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            boolean r0 = r0.measured
            if (r0 == 0) goto L28d
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r4]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 == 0) goto L176
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r5]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 == 0) goto L176
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            boolean r0 = r0.isInVerticalChain()
            if (r0 == 0) goto L120
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r7.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            r1 = r1[r4]
            int r1 = r1.getMargin()
            r0.margin = r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r7.end
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            r1 = r1[r5]
            int r1 = r1.getMargin()
            int r1 = -r1
            r0.margin = r1
            goto L15f
        L120:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r4]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r7.getTarget(r0)
            if (r0 == 0) goto L13b
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r2.mListAnchors
            r2 = r2[r4]
            int r2 = r2.getMargin()
            r7.addTarget(r1, r0, r2)
        L13b:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r5]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r7.getTarget(r0)
            if (r0 == 0) goto L157
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r7.end
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r2.mListAnchors
            r2 = r2[r5]
            int r2 = r2.getMargin()
            int r2 = -r2
            r7.addTarget(r1, r0, r2)
        L157:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r7.start
            r0.delegateToWidgetRun = r3
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r7.end
            r0.delegateToWidgetRun = r3
        L15f:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            boolean r0 = r0.hasBaseline()
            if (r0 == 0) goto L4f0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r7.baseline
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r7.widget
            int r2 = r2.getBaselineDistance()
            r7.addTarget(r0, r1, r2)
            goto L4f0
        L176:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r4]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 == 0) goto L1bd
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r4]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r7.getTarget(r0)
            if (r0 == 0) goto L4f0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r2.mListAnchors
            r2 = r2[r4]
            int r2 = r2.getMargin()
            r7.addTarget(r1, r0, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r7.end
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r7.dimension
            int r2 = r2.value
            r7.addTarget(r0, r1, r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            boolean r0 = r0.hasBaseline()
            if (r0 == 0) goto L4f0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r7.baseline
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r7.widget
            int r2 = r2.getBaselineDistance()
            r7.addTarget(r0, r1, r2)
            goto L4f0
        L1bd:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r5]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 == 0) goto L206
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r5]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r7.getTarget(r0)
            if (r0 == 0) goto L1ef
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r7.end
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r2.mListAnchors
            r2 = r2[r5]
            int r2 = r2.getMargin()
            int r2 = -r2
            r7.addTarget(r1, r0, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r7.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r7.end
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r7.dimension
            int r2 = r2.value
            int r2 = -r2
            r7.addTarget(r0, r1, r2)
        L1ef:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            boolean r0 = r0.hasBaseline()
            if (r0 == 0) goto L4f0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r7.baseline
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r7.widget
            int r2 = r2.getBaselineDistance()
            r7.addTarget(r0, r1, r2)
            goto L4f0
        L206:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r2]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 == 0) goto L23c
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r2]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r7.getTarget(r0)
            if (r0 == 0) goto L4f0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r7.baseline
            r7.addTarget(r2, r0, r1)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r7.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r7.baseline
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r7.widget
            int r2 = r2.getBaselineDistance()
            int r2 = -r2
            r7.addTarget(r0, r1, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r7.end
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r7.dimension
            int r2 = r2.value
            r7.addTarget(r0, r1, r2)
            goto L4f0
        L23c:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            boolean r0 = r0 instanceof androidx.constraintlayout.core.widgets.Helper
            if (r0 != 0) goto L4f0
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getParent()
            if (r0 == 0) goto L4f0
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.getAnchor(r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 != 0) goto L4f0
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getParent()
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r7.widget
            int r2 = r2.getY()
            r7.addTarget(r1, r0, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r7.end
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r7.dimension
            int r2 = r2.value
            r7.addTarget(r0, r1, r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            boolean r0 = r0.hasBaseline()
            if (r0 == 0) goto L4f0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r7.baseline
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r7.widget
            int r2 = r2.getBaselineDistance()
            r7.addTarget(r0, r1, r2)
            goto L4f0
        L28d:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r7.dimension
            boolean r0 = r0.resolved
            if (r0 != 0) goto L30e
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r7.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r6) goto L30e
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            int r0 = r0.mMatchConstraintDefaultHeight
            if (r0 == r4) goto L2dc
            if (r0 == r5) goto L2a2
            goto L313
        L2a2:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            boolean r0 = r0.isInVerticalChain()
            if (r0 != 0) goto L313
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            int r0 = r0.mMatchConstraintDefaultWidth
            if (r0 != r5) goto L2b1
            goto L313
        L2b1:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r6 = r7.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r6 = r6.targets
            r6.add(r0)
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r6 = r7.dimension
            r0.add(r6)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r7.dimension
            r0.delegateToWidgetRun = r3
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r7.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r7.start
            r0.add(r6)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r7.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r7.end
            r0.add(r6)
            goto L313
        L2dc:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getParent()
            if (r0 != 0) goto L2e5
            goto L313
        L2e5:
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r6 = r7.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r6 = r6.targets
            r6.add(r0)
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r6 = r7.dimension
            r0.add(r6)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r7.dimension
            r0.delegateToWidgetRun = r3
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r7.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r7.start
            r0.add(r6)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r7.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r7.end
            r0.add(r6)
            goto L313
        L30e:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r7.dimension
            r0.addDependency(r7)
        L313:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r4]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 == 0) goto L382
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r5]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 == 0) goto L382
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            boolean r0 = r0.isInVerticalChain()
            if (r0 == 0) goto L34d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r7.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            r1 = r1[r4]
            int r1 = r1.getMargin()
            r0.margin = r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r7.end
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            r1 = r1[r5]
            int r1 = r1.getMargin()
            int r1 = -r1
            r0.margin = r1
            goto L36f
        L34d:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r4]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r7.getTarget(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            r1 = r1[r5]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r7.getTarget(r1)
            if (r0 == 0) goto L366
            r0.addDependency(r7)
        L366:
            if (r1 == 0) goto L36b
            r1.addDependency(r7)
        L36b:
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.CENTER
            r7.mRunType = r0
        L36f:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            boolean r0 = r0.hasBaseline()
            if (r0 == 0) goto L4e2
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r7.baseline
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r7.baselineDimension
            r7.addTarget(r0, r1, r3, r2)
            goto L4e2
        L382:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r4]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            r6 = 0
            if (r0 == 0) goto L3fc
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r4]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r7.getTarget(r0)
            if (r0 == 0) goto L4e2
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r2.mListAnchors
            r2 = r2[r4]
            int r2 = r2.getMargin()
            r7.addTarget(r1, r0, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r7.end
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r7.dimension
            r7.addTarget(r0, r1, r3, r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            boolean r0 = r0.hasBaseline()
            if (r0 == 0) goto L3c2
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r7.baseline
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r7.baselineDimension
            r7.addTarget(r0, r1, r3, r2)
        L3c2:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r7.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r1) goto L4e2
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            float r0 = r0.getDimensionRatio()
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 <= 0) goto L4e2
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r0.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r1) goto L4e2
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r7.dimension
            r0.add(r1)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r7.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r7.widget
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r1 = r1.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r1.dimension
            r0.add(r1)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r7.dimension
            r0.updateDelegate = r7
            goto L4e2
        L3fc:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r5]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            r4 = -1
            if (r0 == 0) goto L43f
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r5]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r7.getTarget(r0)
            if (r0 == 0) goto L4e2
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r7.end
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r2.mListAnchors
            r2 = r2[r5]
            int r2 = r2.getMargin()
            int r2 = -r2
            r7.addTarget(r1, r0, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r7.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r7.end
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r7.dimension
            r7.addTarget(r0, r1, r4, r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            boolean r0 = r0.hasBaseline()
            if (r0 == 0) goto L4e2
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r7.baseline
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r7.baselineDimension
            r7.addTarget(r0, r1, r3, r2)
            goto L4e2
        L43f:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r2]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 == 0) goto L46d
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r2]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r7.getTarget(r0)
            if (r0 == 0) goto L4e2
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r7.baseline
            r7.addTarget(r2, r0, r1)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r7.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r7.baseline
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r7.baselineDimension
            r7.addTarget(r0, r1, r4, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r7.end
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r7.dimension
            r7.addTarget(r0, r1, r3, r2)
            goto L4e2
        L46d:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            boolean r0 = r0 instanceof androidx.constraintlayout.core.widgets.Helper
            if (r0 != 0) goto L4e2
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getParent()
            if (r0 == 0) goto L4e2
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getParent()
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r7.widget
            int r2 = r2.getY()
            r7.addTarget(r1, r0, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r7.end
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r7.dimension
            r7.addTarget(r0, r1, r3, r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            boolean r0 = r0.hasBaseline()
            if (r0 == 0) goto L4aa
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r7.baseline
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r7.baselineDimension
            r7.addTarget(r0, r1, r3, r2)
        L4aa:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r7.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r1) goto L4e2
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            float r0 = r0.getDimensionRatio()
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 <= 0) goto L4e2
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r0.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r1) goto L4e2
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r7.dimension
            r0.add(r1)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r7.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r7.widget
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r1 = r1.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r1.dimension
            r0.add(r1)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r7.dimension
            r0.updateDelegate = r7
        L4e2:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r7.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            int r0 = r0.size()
            if (r0 != 0) goto L4f0
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r7.dimension
            r0.readyToSolve = r3
        L4f0:
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
            r0.setY(r1)
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
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r1.baseline
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
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r2.baseline
            r1.clear()
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r2.baseline
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
            int r0 = r0.mMatchConstraintDefaultHeight
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
            java.lang.String r1 = "VerticalRun "
            r0.<init>(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r2.widget
            java.lang.String r1 = r1.getDebugName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(androidx.constraintlayout.core.widgets.analyzer.Dependency r7) {
            r6 = this;
            int[] r0 = androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun.C01311.f46x56910102
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = r6.mRunType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 3
            r2 = 2
            r3 = 1
            if (r0 == r3) goto L24
            if (r0 == r2) goto L20
            if (r0 == r1) goto L14
            goto L27
        L14:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r6.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTop
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r6.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mBottom
            r6.updateRunCenter(r7, r0, r1, r3)
            return
        L20:
            r6.updateRunEnd(r7)
            goto L27
        L24:
            r6.updateRunStart(r7)
        L27:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r7 = r6.dimension
            boolean r7 = r7.readyToSolve
            r0 = 1056964608(0x3f000000, float:0.5)
            r4 = 0
            if (r7 == 0) goto Lbb
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r7 = r6.dimension
            boolean r7 = r7.resolved
            if (r7 != 0) goto Lbb
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = r6.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r7 != r5) goto Lbb
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r6.widget
            int r7 = r7.mMatchConstraintDefaultHeight
            if (r7 == r2) goto L98
            if (r7 == r1) goto L46
            goto Lbb
        L46:
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r6.widget
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r7 = r7.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r7 = r7.dimension
            boolean r7 = r7.resolved
            if (r7 == 0) goto Lbb
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r6.widget
            int r7 = r7.getDimensionRatioSide()
            r1 = -1
            if (r7 == r1) goto L80
            if (r7 == 0) goto L6f
            if (r7 == r3) goto L5f
            r7 = r4
            goto L92
        L5f:
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r6.widget
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r7 = r7.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r7 = r7.dimension
            int r7 = r7.value
            float r7 = (float) r7
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r6.widget
            float r1 = r1.getDimensionRatio()
            goto L8f
        L6f:
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r6.widget
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r7 = r7.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r7 = r7.dimension
            int r7 = r7.value
            float r7 = (float) r7
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r6.widget
            float r1 = r1.getDimensionRatio()
            float r7 = r7 * r1
            goto L90
        L80:
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r6.widget
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r7 = r7.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r7 = r7.dimension
            int r7 = r7.value
            float r7 = (float) r7
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r6.widget
            float r1 = r1.getDimensionRatio()
        L8f:
            float r7 = r7 / r1
        L90:
            float r7 = r7 + r0
            int r7 = (int) r7
        L92:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r6.dimension
            r1.resolve(r7)
            goto Lbb
        L98:
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r6.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r7.getParent()
            if (r7 == 0) goto Lbb
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r1 = r7.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r1.dimension
            boolean r1 = r1.resolved
            if (r1 == 0) goto Lbb
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r6.widget
            float r1 = r1.mMatchConstraintPercentHeight
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r7 = r7.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r7 = r7.dimension
            int r7 = r7.value
            float r7 = (float) r7
            float r7 = r7 * r1
            float r7 = r7 + r0
            int r7 = (int) r7
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r6.dimension
            r1.resolve(r7)
        Lbb:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r6.start
            boolean r7 = r7.readyToSolve
            if (r7 == 0) goto L1ef
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r6.end
            boolean r7 = r7.readyToSolve
            if (r7 != 0) goto Lc9
            goto L1ef
        Lc9:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r6.start
            boolean r7 = r7.resolved
            if (r7 == 0) goto Ldc
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r6.end
            boolean r7 = r7.resolved
            if (r7 == 0) goto Ldc
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r7 = r6.dimension
            boolean r7 = r7.resolved
            if (r7 == 0) goto Ldc
            return
        Ldc:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r7 = r6.dimension
            boolean r7 = r7.resolved
            if (r7 != 0) goto L12a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = r6.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r7 != r1) goto L12a
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r6.widget
            int r7 = r7.mMatchConstraintDefaultWidth
            if (r7 != 0) goto L12a
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r6.widget
            boolean r7 = r7.isInVerticalChain()
            if (r7 != 0) goto L12a
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r6.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r7 = r7.targets
            java.lang.Object r7 = r7.get(r4)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r7
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r6.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.lang.Object r0 = r0.get(r4)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r7 = r7.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r6.start
            int r1 = r1.margin
            int r7 = r7 + r1
            int r0 = r0.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r6.end
            int r1 = r1.margin
            int r0 = r0 + r1
            int r1 = r0 - r7
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r6.start
            r2.resolve(r7)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r6.end
            r7.resolve(r0)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r7 = r6.dimension
            r7.resolve(r1)
            return
        L12a:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r7 = r6.dimension
            boolean r7 = r7.resolved
            if (r7 != 0) goto L186
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = r6.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r7 != r1) goto L186
            int r7 = r6.matchConstraintsType
            if (r7 != r3) goto L186
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r6.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r7 = r7.targets
            int r7 = r7.size()
            if (r7 <= 0) goto L186
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r6.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r7 = r7.targets
            int r7 = r7.size()
            if (r7 <= 0) goto L186
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r6.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r7 = r7.targets
            java.lang.Object r7 = r7.get(r4)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r7
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r6.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r1.targets
            java.lang.Object r1 = r1.get(r4)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r7 = r7.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r6.start
            int r2 = r2.margin
            int r7 = r7 + r2
            int r1 = r1.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r6.end
            int r2 = r2.margin
            int r1 = r1 + r2
            int r1 = r1 - r7
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r7 = r6.dimension
            int r7 = r7.wrapValue
            if (r1 >= r7) goto L17d
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r7 = r6.dimension
            r7.resolve(r1)
            goto L186
        L17d:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r7 = r6.dimension
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r6.dimension
            int r1 = r1.wrapValue
            r7.resolve(r1)
        L186:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r7 = r6.dimension
            boolean r7 = r7.resolved
            if (r7 != 0) goto L18d
            return
        L18d:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r6.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r7 = r7.targets
            int r7 = r7.size()
            if (r7 <= 0) goto L1ef
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r6.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r7 = r7.targets
            int r7 = r7.size()
            if (r7 <= 0) goto L1ef
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r6.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r7 = r7.targets
            java.lang.Object r7 = r7.get(r4)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r7
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r6.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r1.targets
            java.lang.Object r1 = r1.get(r4)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r2 = r7.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r6.start
            int r3 = r3.margin
            int r2 = r2 + r3
            int r3 = r1.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r6.end
            int r4 = r4.margin
            int r3 = r3 + r4
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r6.widget
            float r4 = r4.getVerticalBiasPercent()
            if (r7 != r1) goto L1d0
            int r2 = r7.value
            int r3 = r1.value
            r4 = r0
        L1d0:
            int r3 = r3 - r2
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r7 = r6.dimension
            int r7 = r7.value
            int r3 = r3 - r7
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r6.start
            float r1 = (float) r2
            float r1 = r1 + r0
            float r0 = (float) r3
            float r0 = r0 * r4
            float r1 = r1 + r0
            int r0 = (int) r1
            r7.resolve(r0)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r6.end
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r6.start
            int r0 = r0.value
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r6.dimension
            int r1 = r1.value
            int r0 = r0 + r1
            r7.resolve(r0)
        L1ef:
            return
    }
}
