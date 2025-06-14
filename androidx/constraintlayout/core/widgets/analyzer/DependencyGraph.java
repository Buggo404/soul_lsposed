package androidx.constraintlayout.core.widgets.analyzer;

/* loaded from: classes.dex */
public class DependencyGraph {
    private static final boolean USE_GROUPS = true;
    private androidx.constraintlayout.core.widgets.ConstraintWidgetContainer container;
    private androidx.constraintlayout.core.widgets.ConstraintWidgetContainer mContainer;
    java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.RunGroup> mGroups;
    private androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure mMeasure;
    private androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer mMeasurer;
    private boolean mNeedBuildGraph;
    private boolean mNeedRedoMeasures;
    private java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> mRuns;
    private java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.RunGroup> runGroups;

    public DependencyGraph(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mNeedBuildGraph = r0
            r1.mNeedRedoMeasures = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mRuns = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.runGroups = r0
            r0 = 0
            r1.mMeasurer = r0
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r0 = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure
            r0.<init>()
            r1.mMeasure = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mGroups = r0
            r1.container = r2
            r1.mContainer = r2
            return
    }

    private void applyGroup(androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9, int r10, int r11, androidx.constraintlayout.core.widgets.analyzer.DependencyNode r12, java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.RunGroup> r13, androidx.constraintlayout.core.widgets.analyzer.RunGroup r14) {
            r8 = this;
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r9 = r9.run
            androidx.constraintlayout.core.widgets.analyzer.RunGroup r0 = r9.runGroup
            if (r0 != 0) goto L109
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r8.container
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            if (r9 == r0) goto L109
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r8.container
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            if (r9 != r0) goto L14
            goto L109
        L14:
            if (r14 != 0) goto L1e
            androidx.constraintlayout.core.widgets.analyzer.RunGroup r14 = new androidx.constraintlayout.core.widgets.analyzer.RunGroup
            r14.<init>(r9, r11)
            r13.add(r14)
        L1e:
            r9.runGroup = r14
            r14.add(r9)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r11 = r9.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r11 = r11.dependencies
            java.util.Iterator r11 = r11.iterator()
        L2b:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L48
            java.lang.Object r0 = r11.next()
            androidx.constraintlayout.core.widgets.analyzer.Dependency r0 = (androidx.constraintlayout.core.widgets.analyzer.Dependency) r0
            boolean r1 = r0 instanceof androidx.constraintlayout.core.widgets.analyzer.DependencyNode
            if (r1 == 0) goto L2b
            r1 = r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            r3 = 0
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.applyGroup(r1, r2, r3, r4, r5, r6)
            goto L2b
        L48:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r11 = r9.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r11 = r11.dependencies
            java.util.Iterator r11 = r11.iterator()
        L50:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L6d
            java.lang.Object r0 = r11.next()
            androidx.constraintlayout.core.widgets.analyzer.Dependency r0 = (androidx.constraintlayout.core.widgets.analyzer.Dependency) r0
            boolean r1 = r0 instanceof androidx.constraintlayout.core.widgets.analyzer.DependencyNode
            if (r1 == 0) goto L50
            r1 = r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            r3 = 1
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.applyGroup(r1, r2, r3, r4, r5, r6)
            goto L50
        L6d:
            r11 = 1
            if (r10 != r11) goto L9c
            boolean r0 = r9 instanceof androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun
            if (r0 == 0) goto L9c
            r0 = r9
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = (androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun) r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.baseline
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            java.util.Iterator r7 = r0.iterator()
        L7f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L9c
            java.lang.Object r0 = r7.next()
            androidx.constraintlayout.core.widgets.analyzer.Dependency r0 = (androidx.constraintlayout.core.widgets.analyzer.Dependency) r0
            boolean r1 = r0 instanceof androidx.constraintlayout.core.widgets.analyzer.DependencyNode
            if (r1 == 0) goto L7f
            r1 = r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            r3 = 2
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.applyGroup(r1, r2, r3, r4, r5, r6)
            goto L7f
        L9c:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.util.Iterator r7 = r0.iterator()
        La4:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lbf
            java.lang.Object r0 = r7.next()
            r1 = r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            if (r1 != r12) goto Lb5
            r14.dual = r11
        Lb5:
            r3 = 0
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.applyGroup(r1, r2, r3, r4, r5, r6)
            goto La4
        Lbf:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.util.Iterator r7 = r0.iterator()
        Lc7:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Le2
            java.lang.Object r0 = r7.next()
            r1 = r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            if (r1 != r12) goto Ld8
            r14.dual = r11
        Ld8:
            r3 = 1
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.applyGroup(r1, r2, r3, r4, r5, r6)
            goto Lc7
        Le2:
            if (r10 != r11) goto L109
            boolean r11 = r9 instanceof androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun
            if (r11 == 0) goto L109
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r9 = (androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun) r9
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r9.baseline
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r9 = r9.targets
            java.util.Iterator r9 = r9.iterator()
        Lf2:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L109
            java.lang.Object r11 = r9.next()
            r1 = r11
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            r3 = 2
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.applyGroup(r1, r2, r3, r4, r5, r6)
            goto Lf2
        L109:
            return
    }

    private boolean basicMeasureWidgets(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r13) {
            r12 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r13.mChildren
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L37e
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r1.mListDimensionBehaviors
            r3 = r3[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r1.mListDimensionBehaviors
            r9 = 1
            r4 = r4[r9]
            int r5 = r1.getVisibility()
            r6 = 8
            if (r5 != r6) goto L27
            r1.measured = r9
            goto L6
        L27:
            float r5 = r1.mMatchConstraintPercentWidth
            r10 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            r6 = 2
            if (r5 >= 0) goto L36
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 != r5) goto L36
            r1.mMatchConstraintDefaultWidth = r6
        L36:
            float r5 = r1.mMatchConstraintPercentHeight
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 >= 0) goto L42
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 != r5) goto L42
            r1.mMatchConstraintDefaultHeight = r6
        L42:
            float r5 = r1.getDimensionRatio()
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r7 = 3
            if (r5 <= 0) goto L7e
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 != r5) goto L5b
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r4 == r5) goto L58
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r4 != r5) goto L5b
        L58:
            r1.mMatchConstraintDefaultWidth = r7
            goto L7e
        L5b:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 != r5) goto L6a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 == r5) goto L67
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r3 != r5) goto L6a
        L67:
            r1.mMatchConstraintDefaultHeight = r7
            goto L7e
        L6a:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 != r5) goto L7e
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 != r5) goto L7e
            int r5 = r1.mMatchConstraintDefaultWidth
            if (r5 != 0) goto L78
            r1.mMatchConstraintDefaultWidth = r7
        L78:
            int r5 = r1.mMatchConstraintDefaultHeight
            if (r5 != 0) goto L7e
            r1.mMatchConstraintDefaultHeight = r7
        L7e:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 != r5) goto L94
            int r5 = r1.mMatchConstraintDefaultWidth
            if (r5 != r9) goto L94
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r1.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto L92
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r1.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 != 0) goto L94
        L92:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
        L94:
            r5 = r3
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 != r3) goto Lad
            int r3 = r1.mMatchConstraintDefaultHeight
            if (r3 != r9) goto Lad
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r1.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 == 0) goto La9
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r1.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 != 0) goto Lad
        La9:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r8 = r3
            goto Lae
        Lad:
            r8 = r4
        Lae:
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r3 = r1.horizontalRun
            r3.dimensionBehavior = r5
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r3 = r1.horizontalRun
            int r4 = r1.mMatchConstraintDefaultWidth
            r3.matchConstraintsType = r4
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r3 = r1.verticalRun
            r3.dimensionBehavior = r8
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r3 = r1.verticalRun
            int r4 = r1.mMatchConstraintDefaultHeight
            r3.matchConstraintsType = r4
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r5 == r3) goto Lce
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r5 == r3) goto Lce
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r5 != r3) goto Ldc
        Lce:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r8 == r3) goto L326
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r8 == r3) goto L326
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r8 != r3) goto Ldc
            goto L326
        Ldc:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r5 != r3) goto L1bf
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r8 == r3) goto Lea
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r8 != r3) goto L1bf
        Lea:
            int r3 = r1.mMatchConstraintDefaultWidth
            if (r3 != r7) goto L12a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r8 != r2) goto Lfd
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r6 = 0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r8 = 0
            r3 = r12
            r4 = r1
            r3.measure(r4, r5, r6, r7, r8)
        Lfd:
            int r8 = r1.getHeight()
            float r2 = (float) r8
            float r3 = r1.mDimensionRatio
            float r2 = r2 * r3
            float r2 = r2 + r11
            int r6 = (int) r2
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r3 = r12
            r4 = r1
            r3.measure(r4, r5, r6, r7, r8)
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r2 = r1.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r1.getWidth()
            r2.resolve(r3)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r2 = r1.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r1.getHeight()
            r2.resolve(r3)
            r1.measured = r9
            goto L6
        L12a:
            int r3 = r1.mMatchConstraintDefaultWidth
            if (r3 != r9) goto L145
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r6 = 0
            r2 = 0
            r3 = r12
            r4 = r1
            r7 = r8
            r8 = r2
            r3.measure(r4, r5, r6, r7, r8)
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r2 = r1.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r1 = r1.getWidth()
            r2.wrapValue = r1
            goto L6
        L145:
            int r3 = r1.mMatchConstraintDefaultWidth
            if (r3 != r6) goto L18a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r13.mListDimensionBehaviors
            r3 = r3[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r3 == r4) goto L159
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r13.mListDimensionBehaviors
            r3 = r3[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r3 != r4) goto L1bf
        L159:
            float r2 = r1.mMatchConstraintPercentWidth
            int r3 = r13.getWidth()
            float r3 = (float) r3
            float r2 = r2 * r3
            float r2 = r2 + r11
            int r6 = (int) r2
            int r2 = r1.getHeight()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r3 = r12
            r4 = r1
            r7 = r8
            r8 = r2
            r3.measure(r4, r5, r6, r7, r8)
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r2 = r1.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r1.getWidth()
            r2.resolve(r3)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r2 = r1.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r1.getHeight()
            r2.resolve(r3)
            r1.measured = r9
            goto L6
        L18a:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r1.mListAnchors
            r3 = r3[r2]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 == 0) goto L19a
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r1.mListAnchors
            r3 = r3[r9]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 != 0) goto L1bf
        L19a:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r6 = 0
            r2 = 0
            r3 = r12
            r4 = r1
            r7 = r8
            r8 = r2
            r3.measure(r4, r5, r6, r7, r8)
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r2 = r1.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r1.getWidth()
            r2.resolve(r3)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r2 = r1.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r1.getHeight()
            r2.resolve(r3)
            r1.measured = r9
            goto L6
        L1bf:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r8 != r3) goto L2a5
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r5 == r3) goto L1cb
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r5 != r3) goto L2a5
        L1cb:
            int r3 = r1.mMatchConstraintDefaultHeight
            if (r3 != r7) goto L214
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r5 != r2) goto L1de
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r6 = 0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r8 = 0
            r3 = r12
            r4 = r1
            r3.measure(r4, r5, r6, r7, r8)
        L1de:
            int r6 = r1.getWidth()
            float r2 = r1.mDimensionRatio
            int r3 = r1.getDimensionRatioSide()
            r4 = -1
            if (r3 != r4) goto L1ed
            float r2 = r10 / r2
        L1ed:
            float r3 = (float) r6
            float r3 = r3 * r2
            float r3 = r3 + r11
            int r8 = (int) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r3 = r12
            r4 = r1
            r3.measure(r4, r5, r6, r7, r8)
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r2 = r1.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r1.getWidth()
            r2.resolve(r3)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r2 = r1.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r1.getHeight()
            r2.resolve(r3)
            r1.measured = r9
            goto L6
        L214:
            int r3 = r1.mMatchConstraintDefaultHeight
            if (r3 != r9) goto L22d
            r6 = 0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r8 = 0
            r3 = r12
            r4 = r1
            r3.measure(r4, r5, r6, r7, r8)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r2 = r1.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r1 = r1.getHeight()
            r2.wrapValue = r1
            goto L6
        L22d:
            int r3 = r1.mMatchConstraintDefaultHeight
            if (r3 != r6) goto L270
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r13.mListDimensionBehaviors
            r3 = r3[r9]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r3 == r4) goto L241
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r13.mListDimensionBehaviors
            r3 = r3[r9]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r3 != r4) goto L2a5
        L241:
            float r2 = r1.mMatchConstraintPercentHeight
            int r6 = r1.getWidth()
            int r3 = r13.getHeight()
            float r3 = (float) r3
            float r2 = r2 * r3
            float r2 = r2 + r11
            int r8 = (int) r2
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r3 = r12
            r4 = r1
            r3.measure(r4, r5, r6, r7, r8)
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r2 = r1.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r1.getWidth()
            r2.resolve(r3)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r2 = r1.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r1.getHeight()
            r2.resolve(r3)
            r1.measured = r9
            goto L6
        L270:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r1.mListAnchors
            r3 = r3[r6]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 == 0) goto L280
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r1.mListAnchors
            r3 = r3[r7]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 != 0) goto L2a5
        L280:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r6 = 0
            r2 = 0
            r3 = r12
            r4 = r1
            r7 = r8
            r8 = r2
            r3.measure(r4, r5, r6, r7, r8)
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r2 = r1.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r1.getWidth()
            r2.resolve(r3)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r2 = r1.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r1.getHeight()
            r2.resolve(r3)
            r1.measured = r9
            goto L6
        L2a5:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r3) goto L6
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r8 != r3) goto L6
            int r3 = r1.mMatchConstraintDefaultWidth
            if (r3 == r9) goto L305
            int r3 = r1.mMatchConstraintDefaultHeight
            if (r3 != r9) goto L2b6
            goto L305
        L2b6:
            int r3 = r1.mMatchConstraintDefaultHeight
            if (r3 != r6) goto L6
            int r3 = r1.mMatchConstraintDefaultWidth
            if (r3 != r6) goto L6
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r13.mListDimensionBehaviors
            r2 = r3[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r2 != r3) goto L6
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r13.mListDimensionBehaviors
            r2 = r2[r9]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r2 != r3) goto L6
            float r2 = r1.mMatchConstraintPercentWidth
            float r3 = r1.mMatchConstraintPercentHeight
            int r4 = r13.getWidth()
            float r4 = (float) r4
            float r2 = r2 * r4
            float r2 = r2 + r11
            int r6 = (int) r2
            int r2 = r13.getHeight()
            float r2 = (float) r2
            float r3 = r3 * r2
            float r3 = r3 + r11
            int r8 = (int) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r3 = r12
            r4 = r1
            r3.measure(r4, r5, r6, r7, r8)
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r2 = r1.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r1.getWidth()
            r2.resolve(r3)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r2 = r1.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r1.getHeight()
            r2.resolve(r3)
            r1.measured = r9
            goto L6
        L305:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r6 = 0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r8 = 0
            r3 = r12
            r4 = r1
            r3.measure(r4, r5, r6, r7, r8)
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r2 = r1.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r1.getWidth()
            r2.wrapValue = r3
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r2 = r1.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r1 = r1.getHeight()
            r2.wrapValue = r1
            goto L6
        L326:
            int r2 = r1.getWidth()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r5 != r3) goto L341
            int r2 = r13.getWidth()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r1.mLeft
            int r3 = r3.mMargin
            int r2 = r2 - r3
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r1.mRight
            int r3 = r3.mMargin
            int r2 = r2 - r3
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r6 = r2
            r5 = r3
            goto L342
        L341:
            r6 = r2
        L342:
            int r2 = r1.getHeight()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r8 != r3) goto L35d
            int r2 = r13.getHeight()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r1.mTop
            int r3 = r3.mMargin
            int r2 = r2 - r3
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r1.mBottom
            int r3 = r3.mMargin
            int r2 = r2 - r3
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r8 = r2
            r7 = r3
            goto L35f
        L35d:
            r7 = r8
            r8 = r2
        L35f:
            r3 = r12
            r4 = r1
            r3.measure(r4, r5, r6, r7, r8)
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r2 = r1.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r1.getWidth()
            r2.resolve(r3)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r2 = r1.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r1.getHeight()
            r2.resolve(r3)
            r1.measured = r9
            goto L6
        L37e:
            return r2
    }

    private int computeWrap(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r7, int r8) {
            r6 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.RunGroup> r0 = r6.mGroups
            int r0 = r0.size()
            r1 = 0
            r3 = 0
        L9:
            if (r3 >= r0) goto L1e
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.RunGroup> r4 = r6.mGroups
            java.lang.Object r4 = r4.get(r3)
            androidx.constraintlayout.core.widgets.analyzer.RunGroup r4 = (androidx.constraintlayout.core.widgets.analyzer.RunGroup) r4
            long r4 = r4.computeWrapSize(r7, r8)
            long r1 = java.lang.Math.max(r1, r4)
            int r3 = r3 + 1
            goto L9
        L1e:
            int r7 = (int) r1
            return r7
    }

    private void displayGraph() {
            r4 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r0 = r4.mRuns
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r1 = "digraph {\n"
        L8:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L19
            java.lang.Object r2 = r0.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r2 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r2
            java.lang.String r1 = r4.generateDisplayGraph(r2, r1)
            goto L8
        L19:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "\n}\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "content:<<\n"
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = "\n>>"
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1.println(r0)
            return
    }

    private void findGroup(androidx.constraintlayout.core.widgets.analyzer.WidgetRun r11, int r12, java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.RunGroup> r13) {
            r10 = this;
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r11.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L39
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.core.widgets.analyzer.Dependency r1 = (androidx.constraintlayout.core.widgets.analyzer.Dependency) r1
            boolean r2 = r1 instanceof androidx.constraintlayout.core.widgets.analyzer.DependencyNode
            if (r2 == 0) goto L26
            r4 = r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r4
            r6 = 0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r11.end
            r9 = 0
            r3 = r10
            r5 = r12
            r8 = r13
            r3.applyGroup(r4, r5, r6, r7, r8, r9)
            goto L8
        L26:
            boolean r2 = r1 instanceof androidx.constraintlayout.core.widgets.analyzer.WidgetRun
            if (r2 == 0) goto L8
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r1.start
            r5 = 0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r11.end
            r8 = 0
            r2 = r10
            r4 = r12
            r7 = r13
            r2.applyGroup(r3, r4, r5, r6, r7, r8)
            goto L8
        L39:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r11.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            java.util.Iterator r0 = r0.iterator()
        L41:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L72
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.core.widgets.analyzer.Dependency r1 = (androidx.constraintlayout.core.widgets.analyzer.Dependency) r1
            boolean r2 = r1 instanceof androidx.constraintlayout.core.widgets.analyzer.DependencyNode
            if (r2 == 0) goto L5f
            r4 = r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r4
            r6 = 1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r11.start
            r9 = 0
            r3 = r10
            r5 = r12
            r8 = r13
            r3.applyGroup(r4, r5, r6, r7, r8, r9)
            goto L41
        L5f:
            boolean r2 = r1 instanceof androidx.constraintlayout.core.widgets.analyzer.WidgetRun
            if (r2 == 0) goto L41
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r1.end
            r5 = 1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r11.start
            r8 = 0
            r2 = r10
            r4 = r12
            r7 = r13
            r2.applyGroup(r3, r4, r5, r6, r7, r8)
            goto L41
        L72:
            r0 = 1
            if (r12 != r0) goto L9c
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r11 = (androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun) r11
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r11 = r11.baseline
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r11 = r11.dependencies
            java.util.Iterator r11 = r11.iterator()
        L7f:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L9c
            java.lang.Object r0 = r11.next()
            androidx.constraintlayout.core.widgets.analyzer.Dependency r0 = (androidx.constraintlayout.core.widgets.analyzer.Dependency) r0
            boolean r1 = r0 instanceof androidx.constraintlayout.core.widgets.analyzer.DependencyNode
            if (r1 == 0) goto L7f
            r3 = r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r3
            r5 = 2
            r6 = 0
            r8 = 0
            r2 = r10
            r4 = r12
            r7 = r13
            r2.applyGroup(r3, r4, r5, r6, r7, r8)
            goto L7f
        L9c:
            return
    }

    private java.lang.String generateChainDisplayGraph(androidx.constraintlayout.core.widgets.analyzer.ChainRun r6, java.lang.String r7) {
            r5 = this;
            int r0 = r6.orientation
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "subgraph cluster_"
            r1.<init>(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r6.widget
            java.lang.String r2 = r2.getDebugName()
            r1.append(r2)
            if (r0 != 0) goto L1a
            java.lang.String r2 = "_h"
            r1.append(r2)
            goto L1f
        L1a:
            java.lang.String r2 = "_v"
            r1.append(r2)
        L1f:
            java.lang.String r2 = " {\n"
            r1.append(r2)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r6 = r6.widgets
            java.util.Iterator r6 = r6.iterator()
            java.lang.String r2 = ""
        L2c:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L58
            java.lang.Object r3 = r6.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r3 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r3.widget
            java.lang.String r4 = r4.getDebugName()
            r1.append(r4)
            if (r0 != 0) goto L49
            java.lang.String r4 = "_HORIZONTAL"
            r1.append(r4)
            goto L4e
        L49:
            java.lang.String r4 = "_VERTICAL"
            r1.append(r4)
        L4e:
            java.lang.String r4 = ";\n"
            r1.append(r4)
            java.lang.String r2 = r5.generateDisplayGraph(r3, r2)
            goto L2c
        L58:
            java.lang.String r6 = "}\n"
            r1.append(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r2)
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r6 = r6.toString()
            return r6
    }

    private java.lang.String generateDisplayGraph(androidx.constraintlayout.core.widgets.analyzer.WidgetRun r10, java.lang.String r11) {
            r9 = this;
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r10.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r10.end
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r11)
            boolean r3 = r10 instanceof androidx.constraintlayout.core.widgets.analyzer.HelperReferences
            if (r3 != 0) goto L2d
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r3 = r0.dependencies
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L2d
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r3 = r1.dependencies
            boolean r3 = r3.isEmpty()
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r4 = r0.targets
            boolean r4 = r4.isEmpty()
            r3 = r3 & r4
            if (r3 == 0) goto L2d
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r3 = r1.targets
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L2d
            return r11
        L2d:
            java.lang.String r3 = r9.nodeDefinition(r10)
            r2.append(r3)
            boolean r3 = r9.isCenteredConnection(r0, r1)
            java.lang.String r11 = r9.generateDisplayNode(r0, r3, r11)
            java.lang.String r11 = r9.generateDisplayNode(r1, r3, r11)
            boolean r4 = r10 instanceof androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun
            if (r4 == 0) goto L4d
            r5 = r10
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r5 = (androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun) r5
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = r5.baseline
            java.lang.String r11 = r9.generateDisplayNode(r5, r3, r11)
        L4d:
            boolean r3 = r10 instanceof androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun
            r5 = 0
            java.lang.String r6 = " -> "
            java.lang.String r7 = "\n"
            if (r3 != 0) goto Lff
            boolean r3 = r10 instanceof androidx.constraintlayout.core.widgets.analyzer.ChainRun
            if (r3 == 0) goto L63
            r8 = r10
            androidx.constraintlayout.core.widgets.analyzer.ChainRun r8 = (androidx.constraintlayout.core.widgets.analyzer.ChainRun) r8
            int r8 = r8.orientation
            if (r8 != 0) goto L63
            goto Lff
        L63:
            if (r4 != 0) goto L6f
            if (r3 == 0) goto L18b
            r3 = r10
            androidx.constraintlayout.core.widgets.analyzer.ChainRun r3 = (androidx.constraintlayout.core.widgets.analyzer.ChainRun) r3
            int r3 = r3.orientation
            r4 = 1
            if (r3 != r4) goto L18b
        L6f:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r10.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = r3.getVerticalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r3 == r4) goto Lad
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != r4) goto L7e
            goto Lad
        L7e:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 != r0) goto L18b
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r10.widget
            float r0 = r0.getDimensionRatio()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L18b
            r2.append(r7)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r10.widget
            java.lang.String r0 = r0.getDebugName()
            r2.append(r0)
            java.lang.String r0 = "_VERTICAL -> "
            r2.append(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r10.widget
            java.lang.String r0 = r0.getDebugName()
            r2.append(r0)
            java.lang.String r0 = "_HORIZONTAL;\n"
            r2.append(r0)
            goto L18b
        Lad:
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r3 = r0.targets
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto Ld6
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r3 = r1.targets
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto Ld6
            r2.append(r7)
            java.lang.String r1 = r1.name()
            r2.append(r1)
            r2.append(r6)
            java.lang.String r0 = r0.name()
            r2.append(r0)
            r2.append(r7)
            goto L18b
        Ld6:
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r3 = r0.targets
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L18b
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r3 = r1.targets
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L18b
            r2.append(r7)
            java.lang.String r0 = r0.name()
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = r1.name()
            r2.append(r0)
            r2.append(r7)
            goto L18b
        Lff:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r10.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = r3.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r3 == r4) goto L13c
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != r4) goto L10e
            goto L13c
        L10e:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 != r0) goto L18b
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r10.widget
            float r0 = r0.getDimensionRatio()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L18b
            r2.append(r7)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r10.widget
            java.lang.String r0 = r0.getDebugName()
            r2.append(r0)
            java.lang.String r0 = "_HORIZONTAL -> "
            r2.append(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r10.widget
            java.lang.String r0 = r0.getDebugName()
            r2.append(r0)
            java.lang.String r0 = "_VERTICAL;\n"
            r2.append(r0)
            goto L18b
        L13c:
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r3 = r0.targets
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L164
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r3 = r1.targets
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L164
            r2.append(r7)
            java.lang.String r1 = r1.name()
            r2.append(r1)
            r2.append(r6)
            java.lang.String r0 = r0.name()
            r2.append(r0)
            r2.append(r7)
            goto L18b
        L164:
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r3 = r0.targets
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L18b
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r3 = r1.targets
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L18b
            r2.append(r7)
            java.lang.String r0 = r0.name()
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = r1.name()
            r2.append(r0)
            r2.append(r7)
        L18b:
            boolean r0 = r10 instanceof androidx.constraintlayout.core.widgets.analyzer.ChainRun
            if (r0 == 0) goto L196
            androidx.constraintlayout.core.widgets.analyzer.ChainRun r10 = (androidx.constraintlayout.core.widgets.analyzer.ChainRun) r10
            java.lang.String r10 = r9.generateChainDisplayGraph(r10, r11)
            return r10
        L196:
            java.lang.String r10 = r2.toString()
            return r10
    }

    private java.lang.String generateDisplayNode(androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6, boolean r7, java.lang.String r8) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r8)
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r8 = r6.targets
            java.util.Iterator r8 = r8.iterator()
        Lb:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto Lf3
            java.lang.Object r1 = r8.next()
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "\n"
            r2.<init>(r3)
            java.lang.String r4 = r6.name()
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r4 = " -> "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r1 = r1.name()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            int r2 = r6.margin
            if (r2 > 0) goto L51
            if (r7 != 0) goto L51
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r2 = r6.run
            boolean r2 = r2 instanceof androidx.constraintlayout.core.widgets.analyzer.HelperReferences
            if (r2 == 0) goto Ldd
        L51:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = "["
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            int r2 = r6.margin
            if (r2 <= 0) goto L9c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = "label=\""
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r6.margin
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\""
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            if (r7 == 0) goto L9c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = ","
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
        L9c:
            if (r7 == 0) goto Lb1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = " style=dashed "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
        Lb1:
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r2 = r6.run
            boolean r2 = r2 instanceof androidx.constraintlayout.core.widgets.analyzer.HelperReferences
            if (r2 == 0) goto Lca
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = " style=bold,color=gray "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
        Lca:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = "]"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
        Ldd:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            goto Lb
        Lf3:
            java.lang.String r6 = r0.toString()
            return r6
    }

    private boolean isCenteredConnection(androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5, androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6) {
            r4 = this;
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r5.targets
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L19
            java.lang.Object r3 = r0.next()
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r3
            if (r3 == r6) goto L8
            int r2 = r2 + 1
            goto L8
        L19:
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r6 = r6.targets
            java.util.Iterator r6 = r6.iterator()
            r0 = r1
        L20:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L31
            java.lang.Object r3 = r6.next()
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r3
            if (r3 == r5) goto L20
            int r0 = r0 + 1
            goto L20
        L31:
            if (r2 <= 0) goto L36
            if (r0 <= 0) goto L36
            r1 = 1
        L36:
            return r1
    }

    private void measure(androidx.constraintlayout.core.widgets.ConstraintWidget r2, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r3, int r4, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r5, int r6) {
            r1 = this;
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r0 = r1.mMeasure
            r0.horizontalBehavior = r3
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r3 = r1.mMeasure
            r3.verticalBehavior = r5
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r3 = r1.mMeasure
            r3.horizontalDimension = r4
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r3 = r1.mMeasure
            r3.verticalDimension = r6
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer r3 = r1.mMeasurer
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r4 = r1.mMeasure
            r3.measure(r2, r4)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r3 = r1.mMeasure
            int r3 = r3.measuredWidth
            r2.setWidth(r3)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r3 = r1.mMeasure
            int r3 = r3.measuredHeight
            r2.setHeight(r3)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r3 = r1.mMeasure
            boolean r3 = r3.measuredHasBaseline
            r2.setHasBaseline(r3)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r3 = r1.mMeasure
            int r3 = r3.measuredBaseline
            r2.setBaselineDistance(r3)
            return
    }

    private java.lang.String nodeDefinition(androidx.constraintlayout.core.widgets.analyzer.WidgetRun r9) {
            r8 = this;
            boolean r0 = r9 instanceof androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r9.widget
            java.lang.String r1 = r1.getDebugName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r9.widget
            if (r0 != 0) goto L16
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = r3.getHorizontalDimensionBehaviour()
            goto L1a
        L16:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = r3.getVerticalDimensionBehaviour()
        L1a:
            androidx.constraintlayout.core.widgets.analyzer.RunGroup r4 = r9.runGroup
            if (r0 != 0) goto L24
            java.lang.String r5 = "_HORIZONTAL"
            r2.append(r5)
            goto L29
        L24:
            java.lang.String r5 = "_VERTICAL"
            r2.append(r5)
        L29:
            java.lang.String r5 = " [shape=none, label=<<TABLE BORDER=\"0\" CELLSPACING=\"0\" CELLPADDING=\"2\">  <TR>"
            r2.append(r5)
            java.lang.String r5 = "    <TD "
            java.lang.String r6 = " BGCOLOR=\"green\""
            if (r0 != 0) goto L46
            r2.append(r5)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r9.start
            boolean r7 = r7.resolved
            if (r7 == 0) goto L40
            r2.append(r6)
        L40:
            java.lang.String r7 = " PORT=\"LEFT\" BORDER=\"1\">L</TD>"
            r2.append(r7)
            goto L57
        L46:
            r2.append(r5)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r9.start
            boolean r7 = r7.resolved
            if (r7 == 0) goto L52
            r2.append(r6)
        L52:
            java.lang.String r7 = " PORT=\"TOP\" BORDER=\"1\">T</TD>"
            r2.append(r7)
        L57:
            java.lang.String r7 = "    <TD BORDER=\"1\" "
            r2.append(r7)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r7 = r9.dimension
            boolean r7 = r7.resolved
            if (r7 == 0) goto L6e
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r9.widget
            boolean r7 = r7.measured
            if (r7 != 0) goto L6e
            java.lang.String r7 = " BGCOLOR=\"green\" "
            r2.append(r7)
            goto L85
        L6e:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r7 = r9.dimension
            boolean r7 = r7.resolved
            if (r7 == 0) goto L7a
            java.lang.String r7 = " BGCOLOR=\"lightgray\" "
            r2.append(r7)
            goto L85
        L7a:
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r9.widget
            boolean r7 = r7.measured
            if (r7 == 0) goto L85
            java.lang.String r7 = " BGCOLOR=\"yellow\" "
            r2.append(r7)
        L85:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 != r7) goto L8e
            java.lang.String r3 = "style=\"dashed\""
            r2.append(r3)
        L8e:
            java.lang.String r3 = ">"
            r2.append(r3)
            r2.append(r1)
            if (r4 == 0) goto Lb3
            java.lang.String r1 = " ["
            r2.append(r1)
            int r1 = r4.groupIndex
            int r1 = r1 + 1
            r2.append(r1)
            java.lang.String r1 = "/"
            r2.append(r1)
            int r1 = androidx.constraintlayout.core.widgets.analyzer.RunGroup.index
            r2.append(r1)
            java.lang.String r1 = "]"
            r2.append(r1)
        Lb3:
            java.lang.String r1 = " </TD>"
            r2.append(r1)
            if (r0 != 0) goto Lcc
            r2.append(r5)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r9.end
            boolean r9 = r9.resolved
            if (r9 == 0) goto Lc6
            r2.append(r6)
        Lc6:
            java.lang.String r9 = " PORT=\"RIGHT\" BORDER=\"1\">R</TD>"
            r2.append(r9)
            goto Lee
        Lcc:
            r2.append(r5)
            r0 = r9
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = (androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun) r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.baseline
            boolean r0 = r0.resolved
            if (r0 == 0) goto Ldb
            r2.append(r6)
        Ldb:
            java.lang.String r0 = " PORT=\"BASELINE\" BORDER=\"1\">b</TD>    <TD "
            r2.append(r0)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r9.end
            boolean r9 = r9.resolved
            if (r9 == 0) goto Le9
            r2.append(r6)
        Le9:
            java.lang.String r9 = " PORT=\"BOTTOM\" BORDER=\"1\">B</TD>"
            r2.append(r9)
        Lee:
            java.lang.String r9 = "  </TR></TABLE>>];\n"
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            return r9
    }

    public void buildGraph() {
            r4 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r0 = r4.mRuns
            r4.buildGraph(r0)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.RunGroup> r0 = r4.mGroups
            r0.clear()
            r0 = 0
            androidx.constraintlayout.core.widgets.analyzer.RunGroup.index = r0
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r4.container
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r1 = r1.horizontalRun
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.RunGroup> r2 = r4.mGroups
            r4.findGroup(r1, r0, r2)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r4.container
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r1 = r1.verticalRun
            r2 = 1
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.RunGroup> r3 = r4.mGroups
            r4.findGroup(r1, r2, r3)
            r4.mNeedBuildGraph = r0
            return
    }

    public void buildGraph(java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r6) {
            r5 = this;
            r6.clear()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r5.mContainer
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            r0.clear()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r5.mContainer
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            r0.clear()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r5.mContainer
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            r6.add(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r5.mContainer
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            r6.add(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r5.mContainer
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r0.mChildren
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L28:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L96
            java.lang.Object r2 = r0.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            boolean r3 = r2 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r3 == 0) goto L41
            androidx.constraintlayout.core.widgets.analyzer.GuidelineReference r3 = new androidx.constraintlayout.core.widgets.analyzer.GuidelineReference
            r3.<init>(r2)
            r6.add(r3)
            goto L28
        L41:
            boolean r3 = r2.isInHorizontalChain()
            if (r3 == 0) goto L60
            androidx.constraintlayout.core.widgets.analyzer.ChainRun r3 = r2.horizontalChainRun
            if (r3 != 0) goto L53
            androidx.constraintlayout.core.widgets.analyzer.ChainRun r3 = new androidx.constraintlayout.core.widgets.analyzer.ChainRun
            r4 = 0
            r3.<init>(r2, r4)
            r2.horizontalChainRun = r3
        L53:
            if (r1 != 0) goto L5a
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
        L5a:
            androidx.constraintlayout.core.widgets.analyzer.ChainRun r3 = r2.horizontalChainRun
            r1.add(r3)
            goto L65
        L60:
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r3 = r2.horizontalRun
            r6.add(r3)
        L65:
            boolean r3 = r2.isInVerticalChain()
            if (r3 == 0) goto L84
            androidx.constraintlayout.core.widgets.analyzer.ChainRun r3 = r2.verticalChainRun
            if (r3 != 0) goto L77
            androidx.constraintlayout.core.widgets.analyzer.ChainRun r3 = new androidx.constraintlayout.core.widgets.analyzer.ChainRun
            r4 = 1
            r3.<init>(r2, r4)
            r2.verticalChainRun = r3
        L77:
            if (r1 != 0) goto L7e
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
        L7e:
            androidx.constraintlayout.core.widgets.analyzer.ChainRun r3 = r2.verticalChainRun
            r1.add(r3)
            goto L89
        L84:
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r3 = r2.verticalRun
            r6.add(r3)
        L89:
            boolean r3 = r2 instanceof androidx.constraintlayout.core.widgets.HelperWidget
            if (r3 == 0) goto L28
            androidx.constraintlayout.core.widgets.analyzer.HelperReferences r3 = new androidx.constraintlayout.core.widgets.analyzer.HelperReferences
            r3.<init>(r2)
            r6.add(r3)
            goto L28
        L96:
            if (r1 == 0) goto L9b
            r6.addAll(r1)
        L9b:
            java.util.Iterator r0 = r6.iterator()
        L9f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Laf
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r1
            r1.clear()
            goto L9f
        Laf:
            java.util.Iterator r6 = r6.iterator()
        Lb3:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lca
            java.lang.Object r0 = r6.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r0 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.widget
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r2 = r5.mContainer
            if (r1 != r2) goto Lc6
            goto Lb3
        Lc6:
            r0.apply()
            goto Lb3
        Lca:
            return
    }

    public void defineTerminalWidgets(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r7, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r8) {
            r6 = this;
            boolean r0 = r6.mNeedBuildGraph
            if (r0 == 0) goto L52
            r6.buildGraph()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r6.container
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r0.mChildren
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L11:
            boolean r3 = r0.hasNext()
            r4 = 1
            if (r3 == 0) goto L2c
            java.lang.Object r3 = r0.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r3
            boolean[] r5 = r3.isTerminalWidget
            r5[r1] = r4
            boolean[] r5 = r3.isTerminalWidget
            r5[r4] = r4
            boolean r3 = r3 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r3 == 0) goto L11
            r2 = r4
            goto L11
        L2c:
            if (r2 != 0) goto L52
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.RunGroup> r0 = r6.mGroups
            java.util.Iterator r0 = r0.iterator()
        L34:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L52
            java.lang.Object r2 = r0.next()
            androidx.constraintlayout.core.widgets.analyzer.RunGroup r2 = (androidx.constraintlayout.core.widgets.analyzer.RunGroup) r2
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r7 != r3) goto L46
            r3 = r4
            goto L47
        L46:
            r3 = r1
        L47:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r8 != r5) goto L4d
            r5 = r4
            goto L4e
        L4d:
            r5 = r1
        L4e:
            r2.defineTerminalWidgets(r3, r5)
            goto L34
        L52:
            return
    }

    public boolean directMeasure(boolean r9) {
            r8 = this;
            r0 = 1
            r9 = r9 & r0
            boolean r1 = r8.mNeedBuildGraph
            r2 = 0
            if (r1 != 0) goto Lb
            boolean r1 = r8.mNeedRedoMeasures
            if (r1 == 0) goto L48
        Lb:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r8.container
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r1 = r1.mChildren
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r1.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r3
            r3.ensureWidgetRuns()
            r3.measured = r2
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r4 = r3.horizontalRun
            r4.reset()
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r3 = r3.verticalRun
            r3.reset()
            goto L13
        L2f:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r8.container
            r1.ensureWidgetRuns()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r8.container
            r1.measured = r2
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r8.container
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r1 = r1.horizontalRun
            r1.reset()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r8.container
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r1 = r1.verticalRun
            r1.reset()
            r8.mNeedRedoMeasures = r2
        L48:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r8.mContainer
            boolean r1 = r8.basicMeasureWidgets(r1)
            if (r1 == 0) goto L51
            return r2
        L51:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r8.container
            r1.setX(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r8.container
            r1.setY(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r8.container
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r1.getDimensionBehaviour(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r3 = r8.container
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = r3.getDimensionBehaviour(r0)
            boolean r4 = r8.mNeedBuildGraph
            if (r4 == 0) goto L6e
            r8.buildGraph()
        L6e:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r4 = r8.container
            int r4 = r4.getX()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = r8.container
            int r5 = r5.getY()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r6 = r8.container
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r6 = r6.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r6.start
            r6.resolve(r4)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r6 = r8.container
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r6 = r6.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r6.start
            r6.resolve(r5)
            r8.measureWidgets()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 == r6) goto L97
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != r6) goto Lfc
        L97:
            if (r9 == 0) goto Lb2
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r6 = r8.mRuns
            java.util.Iterator r6 = r6.iterator()
        L9f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lb2
            java.lang.Object r7 = r6.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r7 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r7
            boolean r7 = r7.supportsWrapComputation()
            if (r7 != 0) goto L9f
            r9 = r2
        Lb2:
            if (r9 == 0) goto Ld7
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 != r6) goto Ld7
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r6 = r8.container
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r6.setHorizontalDimensionBehaviour(r7)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r6 = r8.container
            int r7 = r8.computeWrap(r6, r2)
            r6.setWidth(r7)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r6 = r8.container
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r6 = r6.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r6 = r6.dimension
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r7 = r8.container
            int r7 = r7.getWidth()
            r6.resolve(r7)
        Ld7:
            if (r9 == 0) goto Lfc
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != r9) goto Lfc
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r9 = r8.container
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r9.setVerticalDimensionBehaviour(r6)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r9 = r8.container
            int r6 = r8.computeWrap(r9, r0)
            r9.setHeight(r6)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r9 = r8.container
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r9 = r9.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r9 = r9.dimension
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r6 = r8.container
            int r6 = r6.getHeight()
            r9.resolve(r6)
        Lfc:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r9 = r8.container
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r9 = r9.mListDimensionBehaviors
            r9 = r9[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r9 == r6) goto L113
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r9 = r8.container
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r9 = r9.mListDimensionBehaviors
            r9 = r9[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r9 != r6) goto L111
            goto L113
        L111:
            r9 = r2
            goto L162
        L113:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r9 = r8.container
            int r9 = r9.getWidth()
            int r9 = r9 + r4
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r6 = r8.container
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r6 = r6.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r6.end
            r6.resolve(r9)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r6 = r8.container
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r6 = r6.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r6 = r6.dimension
            int r9 = r9 - r4
            r6.resolve(r9)
            r8.measureWidgets()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r9 = r8.container
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r9 = r9.mListDimensionBehaviors
            r9 = r9[r0]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r9 == r4) goto L144
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r9 = r8.container
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r9 = r9.mListDimensionBehaviors
            r9 = r9[r0]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r9 != r4) goto L15e
        L144:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r9 = r8.container
            int r9 = r9.getHeight()
            int r9 = r9 + r5
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r4 = r8.container
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r4 = r4.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r4.end
            r4.resolve(r9)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r4 = r8.container
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r4 = r4.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r4 = r4.dimension
            int r9 = r9 - r5
            r4.resolve(r9)
        L15e:
            r8.measureWidgets()
            r9 = r0
        L162:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r4 = r8.mRuns
            java.util.Iterator r4 = r4.iterator()
        L168:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L183
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r5 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r7 = r8.container
            if (r6 != r7) goto L17f
            boolean r6 = r5.resolved
            if (r6 != 0) goto L17f
            goto L168
        L17f:
            r5.applyToWidget()
            goto L168
        L183:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r4 = r8.mRuns
            java.util.Iterator r4 = r4.iterator()
        L189:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L1c0
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r5 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r5
            if (r9 != 0) goto L19e
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r7 = r8.container
            if (r6 != r7) goto L19e
            goto L189
        L19e:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r5.start
            boolean r6 = r6.resolved
            if (r6 != 0) goto L1a6
        L1a4:
            r0 = r2
            goto L1c0
        L1a6:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r5.end
            boolean r6 = r6.resolved
            if (r6 != 0) goto L1b1
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.analyzer.GuidelineReference
            if (r6 != 0) goto L1b1
            goto L1a4
        L1b1:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r6 = r5.dimension
            boolean r6 = r6.resolved
            if (r6 != 0) goto L189
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.analyzer.ChainRun
            if (r6 != 0) goto L189
            boolean r5 = r5 instanceof androidx.constraintlayout.core.widgets.analyzer.GuidelineReference
            if (r5 != 0) goto L189
            goto L1a4
        L1c0:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r9 = r8.container
            r9.setHorizontalDimensionBehaviour(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r9 = r8.container
            r9.setVerticalDimensionBehaviour(r3)
            return r0
    }

    public boolean directMeasureSetup(boolean r4) {
            r3 = this;
            boolean r4 = r3.mNeedBuildGraph
            r0 = 0
            if (r4 == 0) goto L73
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r4 = r3.container
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r4 = r4.mChildren
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r1
            r1.ensureWidgetRuns()
            r1.measured = r0
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r2 = r1.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.dimension
            r2.resolved = r0
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r2 = r1.horizontalRun
            r2.resolved = r0
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r2 = r1.horizontalRun
            r2.reset()
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r2 = r1.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.dimension
            r2.resolved = r0
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r2 = r1.verticalRun
            r2.resolved = r0
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r1 = r1.verticalRun
            r1.reset()
            goto Ld
        L3d:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r4 = r3.container
            r4.ensureWidgetRuns()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r4 = r3.container
            r4.measured = r0
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r4 = r3.container
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r4 = r4.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r4 = r4.dimension
            r4.resolved = r0
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r4 = r3.container
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r4 = r4.horizontalRun
            r4.resolved = r0
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r4 = r3.container
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r4 = r4.horizontalRun
            r4.reset()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r4 = r3.container
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r4 = r4.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r4 = r4.dimension
            r4.resolved = r0
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r4 = r3.container
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r4 = r4.verticalRun
            r4.resolved = r0
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r4 = r3.container
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r4 = r4.verticalRun
            r4.reset()
            r3.buildGraph()
        L73:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r4 = r3.mContainer
            boolean r4 = r3.basicMeasureWidgets(r4)
            if (r4 == 0) goto L7c
            return r0
        L7c:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r4 = r3.container
            r4.setX(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r4 = r3.container
            r4.setY(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r4 = r3.container
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r4 = r4.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r4.start
            r4.resolve(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r4 = r3.container
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r4 = r4.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r4.start
            r4.resolve(r0)
            r4 = 1
            return r4
    }

    public boolean directMeasureWithOrientation(boolean r10, int r11) {
            r9 = this;
            r0 = 1
            r10 = r10 & r0
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r9.container
            r2 = 0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r1.getDimensionBehaviour(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r3 = r9.container
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = r3.getDimensionBehaviour(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r4 = r9.container
            int r4 = r4.getX()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = r9.container
            int r5 = r5.getY()
            if (r10 == 0) goto L8f
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 == r6) goto L25
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != r6) goto L8f
        L25:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r6 = r9.mRuns
            java.util.Iterator r6 = r6.iterator()
        L2b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L42
            java.lang.Object r7 = r6.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r7 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r7
            int r8 = r7.orientation
            if (r8 != r11) goto L2b
            boolean r7 = r7.supportsWrapComputation()
            if (r7 != 0) goto L2b
            r10 = r2
        L42:
            if (r11 != 0) goto L6a
            if (r10 == 0) goto L8f
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 != r10) goto L8f
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r10.setHorizontalDimensionBehaviour(r6)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            int r6 = r9.computeWrap(r10, r2)
            r10.setWidth(r6)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r10 = r10.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r10 = r10.dimension
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r6 = r9.container
            int r6 = r6.getWidth()
            r10.resolve(r6)
            goto L8f
        L6a:
            if (r10 == 0) goto L8f
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != r10) goto L8f
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r10.setVerticalDimensionBehaviour(r6)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            int r6 = r9.computeWrap(r10, r0)
            r10.setHeight(r6)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r10 = r10.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r10 = r10.dimension
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r6 = r9.container
            int r6 = r6.getHeight()
            r10.resolve(r6)
        L8f:
            if (r11 != 0) goto Lc0
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r10 = r10.mListDimensionBehaviors
            r10 = r10[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r10 == r5) goto La5
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r10 = r10.mListDimensionBehaviors
            r10 = r10[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r10 != r5) goto Ld5
        La5:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            int r10 = r10.getWidth()
            int r10 = r10 + r4
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = r9.container
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r5 = r5.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = r5.end
            r5.resolve(r10)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = r9.container
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r5 = r5.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r5 = r5.dimension
            int r10 = r10 - r4
            r5.resolve(r10)
            goto Lf1
        Lc0:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r10 = r10.mListDimensionBehaviors
            r10 = r10[r0]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r10 == r4) goto Ld7
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r10 = r10.mListDimensionBehaviors
            r10 = r10[r0]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r10 != r4) goto Ld5
            goto Ld7
        Ld5:
            r10 = r2
            goto Lf2
        Ld7:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            int r10 = r10.getHeight()
            int r10 = r10 + r5
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r4 = r9.container
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r4 = r4.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r4.end
            r4.resolve(r10)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r4 = r9.container
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r4 = r4.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r4 = r4.dimension
            int r10 = r10 - r5
            r4.resolve(r10)
        Lf1:
            r10 = r0
        Lf2:
            r9.measureWidgets()
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r4 = r9.mRuns
            java.util.Iterator r4 = r4.iterator()
        Lfb:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L11b
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r5 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r5
            int r6 = r5.orientation
            if (r6 == r11) goto L10c
            goto Lfb
        L10c:
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r7 = r9.container
            if (r6 != r7) goto L117
            boolean r6 = r5.resolved
            if (r6 != 0) goto L117
            goto Lfb
        L117:
            r5.applyToWidget()
            goto Lfb
        L11b:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r4 = r9.mRuns
            java.util.Iterator r4 = r4.iterator()
        L121:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L155
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r5 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r5
            int r6 = r5.orientation
            if (r6 == r11) goto L132
            goto L121
        L132:
            if (r10 != 0) goto L13b
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r7 = r9.container
            if (r6 != r7) goto L13b
            goto L121
        L13b:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r5.start
            boolean r6 = r6.resolved
            if (r6 != 0) goto L143
        L141:
            r0 = r2
            goto L155
        L143:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r5.end
            boolean r6 = r6.resolved
            if (r6 != 0) goto L14a
            goto L141
        L14a:
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.analyzer.ChainRun
            if (r6 != 0) goto L121
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r5 = r5.dimension
            boolean r5 = r5.resolved
            if (r5 != 0) goto L121
            goto L141
        L155:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            r10.setHorizontalDimensionBehaviour(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            r10.setVerticalDimensionBehaviour(r3)
            return r0
    }

    public void invalidateGraph() {
            r1 = this;
            r0 = 1
            r1.mNeedBuildGraph = r0
            return
    }

    public void invalidateMeasures() {
            r1 = this;
            r0 = 1
            r1.mNeedRedoMeasures = r0
            return
    }

    public void measureWidgets() {
            r11 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r11.container
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r0.mChildren
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Leb
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r1
            boolean r2 = r1.measured
            if (r2 == 0) goto L19
            goto L8
        L19:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r1.mListDimensionBehaviors
            r3 = 0
            r8 = r2[r3]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r1.mListDimensionBehaviors
            r9 = 1
            r10 = r2[r9]
            int r2 = r1.mMatchConstraintDefaultWidth
            int r4 = r1.mMatchConstraintDefaultHeight
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r8 == r5) goto L34
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r8 != r5) goto L32
            if (r2 != r9) goto L32
            goto L34
        L32:
            r2 = r3
            goto L35
        L34:
            r2 = r9
        L35:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r10 == r5) goto L3f
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r10 != r5) goto L40
            if (r4 != r9) goto L40
        L3f:
            r3 = r9
        L40:
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r4 = r1.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r4 = r4.dimension
            boolean r4 = r4.resolved
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r5 = r1.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r5 = r5.dimension
            boolean r5 = r5.resolved
            if (r4 == 0) goto L69
            if (r5 == 0) goto L69
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r2 = r1.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r5 = r2.value
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r2 = r1.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r7 = r2.value
            r2 = r11
            r3 = r1
            r2.measure(r3, r4, r5, r6, r7)
            r1.measured = r9
            goto Ld4
        L69:
            if (r4 == 0) goto L9f
            if (r3 == 0) goto L9f
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r2 = r1.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r5 = r2.value
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r2 = r1.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r7 = r2.value
            r2 = r11
            r3 = r1
            r2.measure(r3, r4, r5, r6, r7)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r10 != r2) goto L91
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r2 = r1.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r1.getHeight()
            r2.wrapValue = r3
            goto Ld4
        L91:
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r2 = r1.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r1.getHeight()
            r2.resolve(r3)
            r1.measured = r9
            goto Ld4
        L9f:
            if (r5 == 0) goto Ld4
            if (r2 == 0) goto Ld4
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r2 = r1.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r5 = r2.value
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r2 = r1.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r7 = r2.value
            r2 = r11
            r3 = r1
            r2.measure(r3, r4, r5, r6, r7)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r8 != r2) goto Lc7
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r2 = r1.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r1.getWidth()
            r2.wrapValue = r3
            goto Ld4
        Lc7:
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r2 = r1.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.dimension
            int r3 = r1.getWidth()
            r2.resolve(r3)
            r1.measured = r9
        Ld4:
            boolean r2 = r1.measured
            if (r2 == 0) goto L8
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r2 = r1.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.baselineDimension
            if (r2 == 0) goto L8
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r2 = r1.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r2.baselineDimension
            int r1 = r1.getBaselineDistance()
            r2.resolve(r1)
            goto L8
        Leb:
            return
    }

    public void setMeasurer(androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer r1) {
            r0 = this;
            r0.mMeasurer = r1
            return
    }
}
