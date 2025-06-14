package androidx.constraintlayout.core.widgets.analyzer;

/* loaded from: classes.dex */
class HelperReferences extends androidx.constraintlayout.core.widgets.analyzer.WidgetRun {
    public HelperReferences(androidx.constraintlayout.core.widgets.ConstraintWidget r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private void addDependency(androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r1.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            r0.add(r2)
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r2 = r2.targets
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r1.start
            r2.add(r0)
            return
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void apply() {
            r7 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            boolean r0 = r0 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r0 == 0) goto L123
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r7.start
            r1 = 1
            r0.delegateToWidgetRun = r1
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.Barrier r0 = (androidx.constraintlayout.core.widgets.Barrier) r0
            int r2 = r0.getBarrierType()
            boolean r3 = r0.getAllowsGoneWidget()
            r4 = 8
            r5 = 0
            if (r2 == 0) goto Le5
            if (r2 == r1) goto La6
            r1 = 2
            if (r2 == r1) goto L66
            r1 = 3
            if (r2 == r1) goto L26
            goto L123
        L26:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type r2 = androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.BOTTOM
            r1.type = r2
        L2c:
            int r1 = r0.mWidgetsCount
            if (r5 >= r1) goto L52
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r1 = r0.mWidgets
            r1 = r1[r5]
            if (r3 != 0) goto L3d
            int r2 = r1.getVisibility()
            if (r2 != r4) goto L3d
            goto L4f
        L3d:
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r1 = r1.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r2 = r1.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r7.start
            r2.add(r6)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r7.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r2 = r2.targets
            r2.add(r1)
        L4f:
            int r5 = r5 + 1
            goto L2c
        L52:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            r7.addDependency(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            r7.addDependency(r0)
            goto L123
        L66:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type r2 = androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.TOP
            r1.type = r2
        L6c:
            int r1 = r0.mWidgetsCount
            if (r5 >= r1) goto L92
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r1 = r0.mWidgets
            r1 = r1[r5]
            if (r3 != 0) goto L7d
            int r2 = r1.getVisibility()
            if (r2 != r4) goto L7d
            goto L8f
        L7d:
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r1 = r1.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r2 = r1.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r7.start
            r2.add(r6)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r7.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r2 = r2.targets
            r2.add(r1)
        L8f:
            int r5 = r5 + 1
            goto L6c
        L92:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            r7.addDependency(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            r7.addDependency(r0)
            goto L123
        La6:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type r2 = androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.RIGHT
            r1.type = r2
        Lac:
            int r1 = r0.mWidgetsCount
            if (r5 >= r1) goto Ld2
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r1 = r0.mWidgets
            r1 = r1[r5]
            if (r3 != 0) goto Lbd
            int r2 = r1.getVisibility()
            if (r2 != r4) goto Lbd
            goto Lcf
        Lbd:
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r1 = r1.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r2 = r1.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r7.start
            r2.add(r6)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r7.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r2 = r2.targets
            r2.add(r1)
        Lcf:
            int r5 = r5 + 1
            goto Lac
        Ld2:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            r7.addDependency(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            r7.addDependency(r0)
            goto L123
        Le5:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r7.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode$Type r2 = androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.LEFT
            r1.type = r2
        Leb:
            int r1 = r0.mWidgetsCount
            if (r5 >= r1) goto L111
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r1 = r0.mWidgets
            r1 = r1[r5]
            if (r3 != 0) goto Lfc
            int r2 = r1.getVisibility()
            if (r2 != r4) goto Lfc
            goto L10e
        Lfc:
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r1 = r1.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r2 = r1.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r7.start
            r2.add(r6)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r7.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r2 = r2.targets
            r2.add(r1)
        L10e:
            int r5 = r5 + 1
            goto Leb
        L111:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            r7.addDependency(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.widget
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            r7.addDependency(r0)
        L123:
            return
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void applyToWidget() {
            r2 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r2.widget
            boolean r0 = r0 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r0 == 0) goto L27
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r2.widget
            androidx.constraintlayout.core.widgets.Barrier r0 = (androidx.constraintlayout.core.widgets.Barrier) r0
            int r0 = r0.getBarrierType()
            if (r0 == 0) goto L1e
            r1 = 1
            if (r0 != r1) goto L14
            goto L1e
        L14:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r2.widget
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r2.start
            int r1 = r1.value
            r0.setY(r1)
            goto L27
        L1e:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r2.widget
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r2.start
            int r1 = r1.value
            r0.setX(r1)
        L27:
            return
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void clear() {
            r1 = this;
            r0 = 0
            r1.runGroup = r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r1.start
            r0.clear()
            return
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void reset() {
            r2 = this;
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r2.start
            r1 = 0
            r0.resolved = r1
            return
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    boolean supportsWrapComputation() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(androidx.constraintlayout.core.widgets.analyzer.Dependency r7) {
            r6 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r6.widget
            androidx.constraintlayout.core.widgets.Barrier r7 = (androidx.constraintlayout.core.widgets.Barrier) r7
            int r0 = r7.getBarrierType()
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r6.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r1.targets
            java.util.Iterator r1 = r1.iterator()
            r2 = -1
            r3 = 0
            r4 = r2
        L13:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L2a
            java.lang.Object r5 = r1.next()
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r5
            int r5 = r5.value
            if (r4 == r2) goto L25
            if (r5 >= r4) goto L26
        L25:
            r4 = r5
        L26:
            if (r3 >= r5) goto L13
            r3 = r5
            goto L13
        L2a:
            if (r0 == 0) goto L3b
            r1 = 2
            if (r0 != r1) goto L30
            goto L3b
        L30:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r6.start
            int r7 = r7.getMargin()
            int r3 = r3 + r7
            r0.resolve(r3)
            goto L45
        L3b:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r6.start
            int r7 = r7.getMargin()
            int r4 = r4 + r7
            r0.resolve(r4)
        L45:
            return
    }
}
