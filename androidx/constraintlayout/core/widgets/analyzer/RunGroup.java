package androidx.constraintlayout.core.widgets.analyzer;

/* loaded from: classes.dex */
class RunGroup {
    public static final int BASELINE = 2;
    public static final int END = 1;
    public static final int START = 0;
    public static int index;
    int direction;
    public boolean dual;
    androidx.constraintlayout.core.widgets.analyzer.WidgetRun firstRun;
    int groupIndex;
    androidx.constraintlayout.core.widgets.analyzer.WidgetRun lastRun;
    public int position;
    java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> runs;

    public RunGroup(androidx.constraintlayout.core.widgets.analyzer.WidgetRun r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.position = r0
            r1.dual = r0
            r0 = 0
            r1.firstRun = r0
            r1.lastRun = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.runs = r0
            int r0 = androidx.constraintlayout.core.widgets.analyzer.RunGroup.index
            r1.groupIndex = r0
            int r0 = r0 + 1
            androidx.constraintlayout.core.widgets.analyzer.RunGroup.index = r0
            r1.firstRun = r2
            r1.lastRun = r2
            r1.direction = r3
            return
    }

    private boolean defineTerminalWidget(androidx.constraintlayout.core.widgets.analyzer.WidgetRun r6, int r7) {
            r5 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r6.widget
            boolean[] r0 = r0.isTerminalWidget
            boolean r0 = r0[r7]
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r6.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L5c
            java.lang.Object r2 = r0.next()
            androidx.constraintlayout.core.widgets.analyzer.Dependency r2 = (androidx.constraintlayout.core.widgets.analyzer.Dependency) r2
            boolean r3 = r2 instanceof androidx.constraintlayout.core.widgets.analyzer.DependencyNode
            if (r3 == 0) goto L12
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r2
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r3 = r2.run
            if (r3 != r6) goto L29
            goto L12
        L29:
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r3 = r2.run
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r3.start
            if (r2 != r3) goto L12
            boolean r3 = r6 instanceof androidx.constraintlayout.core.widgets.analyzer.ChainRun
            if (r3 == 0) goto L4c
            r3 = r6
            androidx.constraintlayout.core.widgets.analyzer.ChainRun r3 = (androidx.constraintlayout.core.widgets.analyzer.ChainRun) r3
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r3 = r3.widgets
            java.util.Iterator r3 = r3.iterator()
        L3c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L56
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r4 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r4
            r5.defineTerminalWidget(r4, r7)
            goto L3c
        L4c:
            boolean r3 = r6 instanceof androidx.constraintlayout.core.widgets.analyzer.HelperReferences
            if (r3 != 0) goto L56
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r6.widget
            boolean[] r3 = r3.isTerminalWidget
            r3[r7] = r1
        L56:
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r2 = r2.run
            r5.defineTerminalWidget(r2, r7)
            goto L12
        L5c:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r6.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            java.util.Iterator r0 = r0.iterator()
        L64:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lae
            java.lang.Object r2 = r0.next()
            androidx.constraintlayout.core.widgets.analyzer.Dependency r2 = (androidx.constraintlayout.core.widgets.analyzer.Dependency) r2
            boolean r3 = r2 instanceof androidx.constraintlayout.core.widgets.analyzer.DependencyNode
            if (r3 == 0) goto L64
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r2
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r3 = r2.run
            if (r3 != r6) goto L7b
            goto L64
        L7b:
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r3 = r2.run
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r3.start
            if (r2 != r3) goto L64
            boolean r3 = r6 instanceof androidx.constraintlayout.core.widgets.analyzer.ChainRun
            if (r3 == 0) goto L9e
            r3 = r6
            androidx.constraintlayout.core.widgets.analyzer.ChainRun r3 = (androidx.constraintlayout.core.widgets.analyzer.ChainRun) r3
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r3 = r3.widgets
            java.util.Iterator r3 = r3.iterator()
        L8e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto La8
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r4 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r4
            r5.defineTerminalWidget(r4, r7)
            goto L8e
        L9e:
            boolean r3 = r6 instanceof androidx.constraintlayout.core.widgets.analyzer.HelperReferences
            if (r3 != 0) goto La8
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r6.widget
            boolean[] r3 = r3.isTerminalWidget
            r3[r7] = r1
        La8:
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r2 = r2.run
            r5.defineTerminalWidget(r2, r7)
            goto L64
        Lae:
            return r1
    }

    private long traverseEnd(androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9, long r10) {
            r8 = this;
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r0 = r9.run
            boolean r1 = r0 instanceof androidx.constraintlayout.core.widgets.analyzer.HelperReferences
            if (r1 == 0) goto L7
            return r10
        L7:
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r1 = r9.dependencies
            int r1 = r1.size()
            r2 = 0
            r3 = r10
        Lf:
            if (r2 >= r1) goto L33
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r5 = r9.dependencies
            java.lang.Object r5 = r5.get(r2)
            androidx.constraintlayout.core.widgets.analyzer.Dependency r5 = (androidx.constraintlayout.core.widgets.analyzer.Dependency) r5
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.analyzer.DependencyNode
            if (r6 == 0) goto L30
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r5
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r6 = r5.run
            if (r6 != r0) goto L24
            goto L30
        L24:
            int r6 = r5.margin
            long r6 = (long) r6
            long r6 = r6 + r10
            long r5 = r8.traverseEnd(r5, r6)
            long r3 = java.lang.Math.min(r3, r5)
        L30:
            int r2 = r2 + 1
            goto Lf
        L33:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.end
            if (r9 != r1) goto L50
            long r1 = r0.getWrapDimension()
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r0.start
            long r10 = r10 - r1
            long r1 = r8.traverseEnd(r9, r10)
            long r1 = java.lang.Math.min(r3, r1)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r0.start
            int r9 = r9.margin
            long r3 = (long) r9
            long r10 = r10 - r3
            long r3 = java.lang.Math.min(r1, r10)
        L50:
            return r3
    }

    private long traverseStart(androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9, long r10) {
            r8 = this;
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r0 = r9.run
            boolean r1 = r0 instanceof androidx.constraintlayout.core.widgets.analyzer.HelperReferences
            if (r1 == 0) goto L7
            return r10
        L7:
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r1 = r9.dependencies
            int r1 = r1.size()
            r2 = 0
            r3 = r10
        Lf:
            if (r2 >= r1) goto L33
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r5 = r9.dependencies
            java.lang.Object r5 = r5.get(r2)
            androidx.constraintlayout.core.widgets.analyzer.Dependency r5 = (androidx.constraintlayout.core.widgets.analyzer.Dependency) r5
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.analyzer.DependencyNode
            if (r6 == 0) goto L30
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r5
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r6 = r5.run
            if (r6 != r0) goto L24
            goto L30
        L24:
            int r6 = r5.margin
            long r6 = (long) r6
            long r6 = r6 + r10
            long r5 = r8.traverseStart(r5, r6)
            long r3 = java.lang.Math.max(r3, r5)
        L30:
            int r2 = r2 + 1
            goto Lf
        L33:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.start
            if (r9 != r1) goto L50
            long r1 = r0.getWrapDimension()
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r0.end
            long r10 = r10 + r1
            long r1 = r8.traverseStart(r9, r10)
            long r1 = java.lang.Math.max(r3, r1)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r0.end
            int r9 = r9.margin
            long r3 = (long) r9
            long r10 = r10 - r3
            long r3 = java.lang.Math.max(r1, r10)
        L50:
            return r3
    }

    public void add(androidx.constraintlayout.core.widgets.analyzer.WidgetRun r2) {
            r1 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r0 = r1.runs
            r0.add(r2)
            r1.lastRun = r2
            return
    }

    public long computeWrapSize(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r11, int r12) {
            r10 = this;
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r0 = r10.firstRun
            boolean r1 = r0 instanceof androidx.constraintlayout.core.widgets.analyzer.ChainRun
            r2 = 0
            if (r1 == 0) goto Lf
            androidx.constraintlayout.core.widgets.analyzer.ChainRun r0 = (androidx.constraintlayout.core.widgets.analyzer.ChainRun) r0
            int r0 = r0.orientation
            if (r0 == r12) goto L1b
            return r2
        Lf:
            if (r12 != 0) goto L16
            boolean r0 = r0 instanceof androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun
            if (r0 != 0) goto L1b
            return r2
        L16:
            boolean r0 = r0 instanceof androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun
            if (r0 != 0) goto L1b
            return r2
        L1b:
            if (r12 != 0) goto L22
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r11.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            goto L26
        L22:
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r11.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
        L26:
            if (r12 != 0) goto L2d
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r11 = r11.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r11 = r11.end
            goto L31
        L2d:
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r11 = r11.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r11 = r11.end
        L31:
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1 = r10.firstRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r1.targets
            boolean r0 = r1.contains(r0)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1 = r10.firstRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r1.targets
            boolean r11 = r1.contains(r11)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1 = r10.firstRun
            long r4 = r1.getWrapDimension()
            if (r0 == 0) goto Lc4
            if (r11 == 0) goto Lc4
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r11 = r10.firstRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r11 = r11.start
            long r0 = r10.traverseStart(r11, r2)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r11 = r10.firstRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r11 = r11.end
            long r6 = r10.traverseEnd(r11, r2)
            long r0 = r0 - r4
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r11 = r10.firstRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r11 = r11.end
            int r11 = r11.margin
            int r11 = -r11
            long r8 = (long) r11
            int r11 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r11 < 0) goto L74
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r11 = r10.firstRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r11 = r11.end
            int r11 = r11.margin
            long r8 = (long) r11
            long r0 = r0 + r8
        L74:
            long r6 = -r6
            long r6 = r6 - r4
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r11 = r10.firstRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r11 = r11.start
            int r11 = r11.margin
            long r8 = (long) r11
            long r6 = r6 - r8
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r11 = r10.firstRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r11 = r11.start
            int r11 = r11.margin
            long r8 = (long) r11
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 < 0) goto L91
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r11 = r10.firstRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r11 = r11.start
            int r11 = r11.margin
            long r8 = (long) r11
            long r6 = r6 - r8
        L91:
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r11 = r10.firstRun
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r11.widget
            float r11 = r11.getBiasPercent(r12)
            r12 = 0
            int r12 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r12 <= 0) goto La8
            float r12 = (float) r6
            float r12 = r12 / r11
            float r0 = (float) r0
            float r1 = r8 - r11
            float r0 = r0 / r1
            float r12 = r12 + r0
            long r2 = (long) r12
        La8:
            float r12 = (float) r2
            float r0 = r12 * r11
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            long r2 = (long) r0
            float r8 = r8 - r11
            float r12 = r12 * r8
            float r12 = r12 + r1
            long r11 = (long) r12
            long r2 = r2 + r4
            long r2 = r2 + r11
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r11 = r10.firstRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r11 = r11.start
            int r11 = r11.margin
            long r11 = (long) r11
            long r11 = r11 + r2
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r0 = r10.firstRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            int r0 = r0.margin
            goto L116
        Lc4:
            if (r0 == 0) goto Le2
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r11 = r10.firstRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r11 = r11.start
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r12 = r10.firstRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r12 = r12.start
            int r12 = r12.margin
            long r0 = (long) r12
            long r11 = r10.traverseStart(r11, r0)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r0 = r10.firstRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            int r0 = r0.margin
            long r0 = (long) r0
            long r0 = r0 + r4
            long r11 = java.lang.Math.max(r11, r0)
            goto L118
        Le2:
            if (r11 == 0) goto L102
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r11 = r10.firstRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r11 = r11.end
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r12 = r10.firstRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r12 = r12.end
            int r12 = r12.margin
            long r0 = (long) r12
            long r11 = r10.traverseEnd(r11, r0)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r0 = r10.firstRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            int r0 = r0.margin
            int r0 = -r0
            long r0 = (long) r0
            long r0 = r0 + r4
            long r11 = -r11
            long r11 = java.lang.Math.max(r11, r0)
            goto L118
        L102:
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r11 = r10.firstRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r11 = r11.start
            int r11 = r11.margin
            long r11 = (long) r11
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r0 = r10.firstRun
            long r0 = r0.getWrapDimension()
            long r11 = r11 + r0
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r0 = r10.firstRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            int r0 = r0.margin
        L116:
            long r0 = (long) r0
            long r11 = r11 - r0
        L118:
            return r11
    }

    public void defineTerminalWidgets(boolean r2, boolean r3) {
            r1 = this;
            if (r2 == 0) goto Lc
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r2 = r1.firstRun
            boolean r0 = r2 instanceof androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun
            if (r0 == 0) goto Lc
            r0 = 0
            r1.defineTerminalWidget(r2, r0)
        Lc:
            if (r3 == 0) goto L18
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r2 = r1.firstRun
            boolean r3 = r2 instanceof androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun
            if (r3 == 0) goto L18
            r3 = 1
            r1.defineTerminalWidget(r2, r3)
        L18:
            return
    }
}
