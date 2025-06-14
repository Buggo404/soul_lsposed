package androidx.constraintlayout.core.widgets.analyzer;

/* loaded from: classes.dex */
public class ChainRun extends androidx.constraintlayout.core.widgets.analyzer.WidgetRun {
    private int chainStyle;
    java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> widgets;

    public ChainRun(androidx.constraintlayout.core.widgets.ConstraintWidget r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.widgets = r1
            r0.orientation = r2
            r0.build()
            return
    }

    private void build() {
            r5 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            int r1 = r5.orientation
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.getPreviousChainMember(r1)
        L8:
            r4 = r1
            r1 = r0
            r0 = r4
            if (r0 == 0) goto L14
            int r1 = r5.orientation
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.getPreviousChainMember(r1)
            goto L8
        L14:
            r5.widget = r1
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r0 = r5.widgets
            int r2 = r5.orientation
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r2 = r1.getRun(r2)
            r0.add(r2)
            int r0 = r5.orientation
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.getNextChainMember(r0)
        L27:
            if (r0 == 0) goto L3b
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r1 = r5.widgets
            int r2 = r5.orientation
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r2 = r0.getRun(r2)
            r1.add(r2)
            int r1 = r5.orientation
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getNextChainMember(r1)
            goto L27
        L3b:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r0 = r5.widgets
            java.util.Iterator r0 = r0.iterator()
        L41:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L60
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r1
            int r3 = r5.orientation
            if (r3 != 0) goto L57
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.widget
            r1.horizontalChainRun = r5
            goto L41
        L57:
            int r3 = r5.orientation
            if (r3 != r2) goto L41
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.widget
            r1.verticalChainRun = r5
            goto L41
        L60:
            int r0 = r5.orientation
            if (r0 != 0) goto L74
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getParent()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r0
            boolean r0 = r0.isRtl()
            if (r0 == 0) goto L74
            r0 = r2
            goto L75
        L74:
            r0 = 0
        L75:
            if (r0 == 0) goto L90
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r0 = r5.widgets
            int r0 = r0.size()
            if (r0 <= r2) goto L90
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r0 = r5.widgets
            int r1 = r0.size()
            int r1 = r1 - r2
            java.lang.Object r0 = r0.get(r1)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r0 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.widget
            r5.widget = r0
        L90:
            int r0 = r5.orientation
            if (r0 != 0) goto L9b
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            int r0 = r0.getHorizontalChainStyle()
            goto La1
        L9b:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            int r0 = r0.getVerticalChainStyle()
        La1:
            r5.chainStyle = r0
            return
    }

    private androidx.constraintlayout.core.widgets.ConstraintWidget getFirstVisibleWidget() {
            r4 = this;
            r0 = 0
        L1:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r1 = r4.widgets
            int r1 = r1.size()
            if (r0 >= r1) goto L21
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r1 = r4.widgets
            java.lang.Object r1 = r1.get(r0)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r1
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r1.widget
            int r2 = r2.getVisibility()
            r3 = 8
            if (r2 == r3) goto L1e
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.widget
            return r0
        L1e:
            int r0 = r0 + 1
            goto L1
        L21:
            r0 = 0
            return r0
    }

    private androidx.constraintlayout.core.widgets.ConstraintWidget getLastVisibleWidget() {
            r4 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r0 = r4.widgets
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L22
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r1 = r4.widgets
            java.lang.Object r1 = r1.get(r0)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r1
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r1.widget
            int r2 = r2.getVisibility()
            r3 = 8
            if (r2 == r3) goto L1f
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.widget
            return r0
        L1f:
            int r0 = r0 + (-1)
            goto L8
        L22:
            r0 = 0
            return r0
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void apply() {
            r5 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r0 = r5.widgets
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r1
            r1.apply()
            goto L6
        L16:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r0 = r5.widgets
            int r0 = r0.size()
            r1 = 1
            if (r0 >= r1) goto L20
            return
        L20:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r2 = r5.widgets
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r2 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r2
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r2.widget
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r4 = r5.widgets
            int r0 = r0 - r1
            java.lang.Object r0 = r4.get(r0)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r0 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.widget
            int r4 = r5.orientation
            if (r4 != 0) goto L76
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r2.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mRight
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r5.getTarget(r1, r3)
            int r1 = r1.getMargin()
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r5.getFirstVisibleWidget()
            if (r4 == 0) goto L52
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r4.mLeft
            int r1 = r1.getMargin()
        L52:
            if (r2 == 0) goto L59
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r5.start
            r5.addTarget(r4, r2, r1)
        L59:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r5.getTarget(r0, r3)
            int r0 = r0.getMargin()
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r5.getLastVisibleWidget()
            if (r2 == 0) goto L6d
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.mRight
            int r0 = r0.getMargin()
        L6d:
            if (r1 == 0) goto Lb1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r5.end
            int r0 = -r0
            r5.addTarget(r2, r1, r0)
            goto Lb1
        L76:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mBottom
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r5.getTarget(r2, r1)
            int r2 = r2.getMargin()
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r5.getFirstVisibleWidget()
            if (r4 == 0) goto L8e
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r4.mTop
            int r2 = r2.getMargin()
        L8e:
            if (r3 == 0) goto L95
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r5.start
            r5.addTarget(r4, r3, r2)
        L95:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r5.getTarget(r0, r1)
            int r0 = r0.getMargin()
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r5.getLastVisibleWidget()
            if (r2 == 0) goto La9
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.mBottom
            int r0 = r0.getMargin()
        La9:
            if (r1 == 0) goto Lb1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r5.end
            int r0 = -r0
            r5.addTarget(r2, r1, r0)
        Lb1:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.start
            r0.updateDelegate = r5
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.end
            r0.updateDelegate = r5
            return
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void applyToWidget() {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r1 = r2.widgets
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r1 = r2.widgets
            java.lang.Object r1 = r1.get(r0)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r1
            r1.applyToWidget()
            int r0 = r0 + 1
            goto L1
        L17:
            return
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void clear() {
            r2 = this;
            r0 = 0
            r2.runGroup = r0
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r0 = r2.widgets
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r1
            r1.clear()
            goto L9
        L19:
            return
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public long getWrapDimension() {
            r7 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r0 = r7.widgets
            int r0 = r0.size()
            r1 = 0
            r3 = 0
        L9:
            if (r3 >= r0) goto L27
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r4 = r7.widgets
            java.lang.Object r4 = r4.get(r3)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r4 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r4
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = r4.start
            int r5 = r5.margin
            long r5 = (long) r5
            long r1 = r1 + r5
            long r5 = r4.getWrapDimension()
            long r1 = r1 + r5
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r4.end
            int r4 = r4.margin
            long r4 = (long) r4
            long r1 = r1 + r4
            int r3 = r3 + 1
            goto L9
        L27:
            return r1
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void reset() {
            r2 = this;
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r2.start
            r1 = 0
            r0.resolved = r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r2.end
            r0.resolved = r1
            return
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    boolean supportsWrapComputation() {
            r4 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r0 = r4.widgets
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L1c
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r3 = r4.widgets
            java.lang.Object r3 = r3.get(r2)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r3 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r3
            boolean r3 = r3.supportsWrapComputation()
            if (r3 != 0) goto L19
            return r1
        L19:
            int r2 = r2 + 1
            goto L8
        L1c:
            r0 = 1
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ChainRun "
            r0.<init>(r1)
            int r1 = r4.orientation
            if (r1 != 0) goto Le
            java.lang.String r1 = "horizontal : "
            goto L10
        Le:
            java.lang.String r1 = "vertical : "
        L10:
            r0.append(r1)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r1 = r4.widgets
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r2 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r2
            java.lang.String r3 = "<"
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = "> "
            r0.append(r2)
            goto L19
        L33:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(androidx.constraintlayout.core.widgets.analyzer.Dependency r23) {
            r22 = this;
            r0 = r22
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.start
            boolean r1 = r1.resolved
            if (r1 == 0) goto L40f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.end
            boolean r1 = r1.resolved
            if (r1 != 0) goto L10
            goto L40f
        L10:
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.getParent()
            boolean r2 = r1 instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer
            if (r2 == 0) goto L21
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r1
            boolean r1 = r1.isRtl()
            goto L22
        L21:
            r1 = 0
        L22:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r0.end
            int r2 = r2.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r0.start
            int r4 = r4.value
            int r2 = r2 - r4
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r4 = r0.widgets
            int r4 = r4.size()
            r5 = 0
        L32:
            r6 = -1
            r7 = 8
            if (r5 >= r4) goto L4a
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r8 = r0.widgets
            java.lang.Object r8 = r8.get(r5)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r8 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r8
            androidx.constraintlayout.core.widgets.ConstraintWidget r8 = r8.widget
            int r8 = r8.getVisibility()
            if (r8 != r7) goto L4b
            int r5 = r5 + 1
            goto L32
        L4a:
            r5 = r6
        L4b:
            int r8 = r4 + (-1)
            r9 = r8
        L4e:
            if (r9 < 0) goto L64
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r10 = r0.widgets
            java.lang.Object r10 = r10.get(r9)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r10 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r10
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r10.widget
            int r10 = r10.getVisibility()
            if (r10 != r7) goto L63
            int r9 = r9 + (-1)
            goto L4e
        L63:
            r6 = r9
        L64:
            r9 = 0
        L65:
            r11 = 2
            r12 = 1
            if (r9 >= r11) goto L104
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L70:
            if (r13 >= r4) goto Lf6
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r3 = r0.widgets
            java.lang.Object r3 = r3.get(r13)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r3 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r3.widget
            int r11 = r11.getVisibility()
            if (r11 != r7) goto L84
            goto Lef
        L84:
            int r16 = r16 + 1
            if (r13 <= 0) goto L8f
            if (r13 < r5) goto L8f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r11 = r3.start
            int r11 = r11.margin
            int r14 = r14 + r11
        L8f:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r11 = r3.dimension
            int r11 = r11.value
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = r3.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r7 == r10) goto L9b
            r7 = r12
            goto L9c
        L9b:
            r7 = 0
        L9c:
            if (r7 == 0) goto Lbc
            int r10 = r0.orientation
            if (r10 != 0) goto Lad
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r3.widget
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r10 = r10.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r10 = r10.dimension
            boolean r10 = r10.resolved
            if (r10 != 0) goto Lad
            return
        Lad:
            int r10 = r0.orientation
            if (r10 != r12) goto Ld0
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r3.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r10 = r10.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r10 = r10.dimension
            boolean r10 = r10.resolved
            if (r10 != 0) goto Ld0
            return
        Lbc:
            int r10 = r3.matchConstraintsType
            if (r10 != r12) goto Lc9
            if (r9 != 0) goto Lc9
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r7 = r3.dimension
            int r11 = r7.wrapValue
            int r15 = r15 + 1
            goto Lcf
        Lc9:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r10 = r3.dimension
            boolean r10 = r10.resolved
            if (r10 == 0) goto Ld0
        Lcf:
            r7 = r12
        Ld0:
            if (r7 != 0) goto Le4
            int r15 = r15 + 1
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r3.widget
            float[] r7 = r7.mWeight
            int r10 = r0.orientation
            r7 = r7[r10]
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto Le5
            float r17 = r17 + r7
            goto Le5
        Le4:
            int r14 = r14 + r11
        Le5:
            if (r13 >= r8) goto Lef
            if (r13 >= r6) goto Lef
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r3.end
            int r3 = r3.margin
            int r3 = -r3
            int r14 = r14 + r3
        Lef:
            int r13 = r13 + 1
            r7 = 8
            r11 = 2
            goto L70
        Lf6:
            if (r14 < r2) goto L101
            if (r15 != 0) goto Lfb
            goto L101
        Lfb:
            int r9 = r9 + 1
            r7 = 8
            goto L65
        L101:
            r3 = r16
            goto L109
        L104:
            r3 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L109:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r0.start
            int r7 = r7.value
            if (r1 == 0) goto L113
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r0.end
            int r7 = r7.value
        L113:
            r9 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r2) goto L12a
            r10 = 1073741824(0x40000000, float:2.0)
            if (r1 == 0) goto L123
            int r11 = r14 - r2
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 + r10
            goto L12a
        L123:
            int r11 = r14 - r2
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 - r10
        L12a:
            if (r15 <= 0) goto L212
            int r10 = r2 - r14
            float r10 = (float) r10
            float r11 = (float) r15
            float r11 = r10 / r11
            float r11 = r11 + r9
            int r11 = (int) r11
            r13 = 0
            r16 = 0
        L137:
            if (r13 >= r4) goto L1c7
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r12 = r0.widgets
            java.lang.Object r12 = r12.get(r13)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r12 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r12
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r12.widget
            int r9 = r9.getVisibility()
            r18 = r11
            r11 = 8
            if (r9 != r11) goto L14e
            goto L1b2
        L14e:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = r12.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r9 != r11) goto L1b2
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r9 = r12.dimension
            boolean r9 = r9.resolved
            if (r9 != 0) goto L1b2
            r9 = 0
            int r11 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r11 <= 0) goto L16f
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r12.widget
            float[] r11 = r11.mWeight
            int r9 = r0.orientation
            r9 = r11[r9]
            float r9 = r9 * r10
            float r9 = r9 / r17
            r11 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 + r11
            int r9 = (int) r9
            goto L171
        L16f:
            r9 = r18
        L171:
            int r11 = r0.orientation
            if (r11 != 0) goto L180
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r12.widget
            int r11 = r11.mMatchConstraintMaxWidth
            r19 = r10
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r12.widget
            int r10 = r10.mMatchConstraintMinWidth
            goto L18a
        L180:
            r19 = r10
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r12.widget
            int r11 = r10.mMatchConstraintMaxHeight
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r12.widget
            int r10 = r10.mMatchConstraintMinHeight
        L18a:
            r20 = r14
            int r14 = r12.matchConstraintsType
            r21 = r7
            r7 = 1
            if (r14 != r7) goto L19c
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r7 = r12.dimension
            int r7 = r7.wrapValue
            int r7 = java.lang.Math.min(r9, r7)
            goto L19d
        L19c:
            r7 = r9
        L19d:
            int r7 = java.lang.Math.max(r10, r7)
            if (r11 <= 0) goto L1a7
            int r7 = java.lang.Math.min(r11, r7)
        L1a7:
            if (r7 == r9) goto L1ac
            int r16 = r16 + 1
            r9 = r7
        L1ac:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r7 = r12.dimension
            r7.resolve(r9)
            goto L1b8
        L1b2:
            r21 = r7
            r19 = r10
            r20 = r14
        L1b8:
            int r13 = r13 + 1
            r11 = r18
            r10 = r19
            r14 = r20
            r7 = r21
            r9 = 1056964608(0x3f000000, float:0.5)
            r12 = 1
            goto L137
        L1c7:
            r21 = r7
            r20 = r14
            if (r16 <= 0) goto L203
            int r15 = r15 - r16
            r7 = 0
            r9 = 0
        L1d1:
            if (r7 >= r4) goto L201
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r10 = r0.widgets
            java.lang.Object r10 = r10.get(r7)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r10 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r10
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r10.widget
            int r11 = r11.getVisibility()
            r12 = 8
            if (r11 != r12) goto L1e6
            goto L1fe
        L1e6:
            if (r7 <= 0) goto L1ef
            if (r7 < r5) goto L1ef
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r11 = r10.start
            int r11 = r11.margin
            int r9 = r9 + r11
        L1ef:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r11 = r10.dimension
            int r11 = r11.value
            int r9 = r9 + r11
            if (r7 >= r8) goto L1fe
            if (r7 >= r6) goto L1fe
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r10 = r10.end
            int r10 = r10.margin
            int r10 = -r10
            int r9 = r9 + r10
        L1fe:
            int r7 = r7 + 1
            goto L1d1
        L201:
            r14 = r9
            goto L205
        L203:
            r14 = r20
        L205:
            int r7 = r0.chainStyle
            r9 = 2
            if (r7 != r9) goto L210
            if (r16 != 0) goto L210
            r7 = 0
            r0.chainStyle = r7
            goto L218
        L210:
            r7 = 0
            goto L218
        L212:
            r21 = r7
            r20 = r14
            r7 = 0
            r9 = 2
        L218:
            if (r14 <= r2) goto L21c
            r0.chainStyle = r9
        L21c:
            if (r3 <= 0) goto L224
            if (r15 != 0) goto L224
            if (r5 != r6) goto L224
            r0.chainStyle = r9
        L224:
            int r9 = r0.chainStyle
            r10 = 1
            if (r9 != r10) goto L2c7
            if (r3 <= r10) goto L22f
            int r2 = r2 - r14
            int r3 = r3 - r10
            int r2 = r2 / r3
            goto L236
        L22f:
            if (r3 != r10) goto L235
            int r2 = r2 - r14
            r3 = 2
            int r2 = r2 / r3
            goto L236
        L235:
            r2 = r7
        L236:
            if (r15 <= 0) goto L239
            r2 = r7
        L239:
            r3 = r7
            r7 = r21
        L23c:
            if (r3 >= r4) goto L40f
            if (r1 == 0) goto L245
            int r9 = r3 + 1
            int r9 = r4 - r9
            goto L246
        L245:
            r9 = r3
        L246:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r10 = r0.widgets
            java.lang.Object r9 = r10.get(r9)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r9 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r9
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r9.widget
            int r10 = r10.getVisibility()
            r11 = 8
            if (r10 != r11) goto L263
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r10 = r9.start
            r10.resolve(r7)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r9.end
            r9.resolve(r7)
            goto L2c3
        L263:
            if (r3 <= 0) goto L26a
            if (r1 == 0) goto L269
            int r7 = r7 - r2
            goto L26a
        L269:
            int r7 = r7 + r2
        L26a:
            if (r3 <= 0) goto L27b
            if (r3 < r5) goto L27b
            if (r1 == 0) goto L276
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r10 = r9.start
            int r10 = r10.margin
            int r7 = r7 - r10
            goto L27b
        L276:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r10 = r9.start
            int r10 = r10.margin
            int r7 = r7 + r10
        L27b:
            if (r1 == 0) goto L283
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r10 = r9.end
            r10.resolve(r7)
            goto L288
        L283:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r10 = r9.start
            r10.resolve(r7)
        L288:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r10 = r9.dimension
            int r10 = r10.value
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r9.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L29b
            int r11 = r9.matchConstraintsType
            r12 = 1
            if (r11 != r12) goto L29b
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r10 = r9.dimension
            int r10 = r10.wrapValue
        L29b:
            if (r1 == 0) goto L29f
            int r7 = r7 - r10
            goto L2a0
        L29f:
            int r7 = r7 + r10
        L2a0:
            if (r1 == 0) goto L2a8
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r10 = r9.start
            r10.resolve(r7)
            goto L2ad
        L2a8:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r10 = r9.end
            r10.resolve(r7)
        L2ad:
            r10 = 1
            r9.resolved = r10
            if (r3 >= r8) goto L2c3
            if (r3 >= r6) goto L2c3
            if (r1 == 0) goto L2bd
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r9.end
            int r9 = r9.margin
            int r9 = -r9
            int r7 = r7 - r9
            goto L2c3
        L2bd:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r9.end
            int r9 = r9.margin
            int r9 = -r9
            int r7 = r7 + r9
        L2c3:
            int r3 = r3 + 1
            goto L23c
        L2c7:
            if (r9 != 0) goto L35d
            int r2 = r2 - r14
            r9 = 1
            int r3 = r3 + r9
            int r2 = r2 / r3
            if (r15 <= 0) goto L2d0
            r2 = r7
        L2d0:
            r3 = r7
            r7 = r21
        L2d3:
            if (r3 >= r4) goto L40f
            if (r1 == 0) goto L2dc
            int r9 = r3 + 1
            int r9 = r4 - r9
            goto L2dd
        L2dc:
            r9 = r3
        L2dd:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r10 = r0.widgets
            java.lang.Object r9 = r10.get(r9)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r9 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r9
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r9.widget
            int r10 = r10.getVisibility()
            r11 = 8
            if (r10 != r11) goto L2fa
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r10 = r9.start
            r10.resolve(r7)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r9.end
            r9.resolve(r7)
            goto L359
        L2fa:
            if (r1 == 0) goto L2fe
            int r7 = r7 - r2
            goto L2ff
        L2fe:
            int r7 = r7 + r2
        L2ff:
            if (r3 <= 0) goto L310
            if (r3 < r5) goto L310
            if (r1 == 0) goto L30b
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r10 = r9.start
            int r10 = r10.margin
            int r7 = r7 - r10
            goto L310
        L30b:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r10 = r9.start
            int r10 = r10.margin
            int r7 = r7 + r10
        L310:
            if (r1 == 0) goto L318
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r10 = r9.end
            r10.resolve(r7)
            goto L31d
        L318:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r10 = r9.start
            r10.resolve(r7)
        L31d:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r10 = r9.dimension
            int r10 = r10.value
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r9.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L334
            int r11 = r9.matchConstraintsType
            r12 = 1
            if (r11 != r12) goto L334
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r11 = r9.dimension
            int r11 = r11.wrapValue
            int r10 = java.lang.Math.min(r10, r11)
        L334:
            if (r1 == 0) goto L338
            int r7 = r7 - r10
            goto L339
        L338:
            int r7 = r7 + r10
        L339:
            if (r1 == 0) goto L341
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r10 = r9.start
            r10.resolve(r7)
            goto L346
        L341:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r10 = r9.end
            r10.resolve(r7)
        L346:
            if (r3 >= r8) goto L359
            if (r3 >= r6) goto L359
            if (r1 == 0) goto L353
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r9.end
            int r9 = r9.margin
            int r9 = -r9
            int r7 = r7 - r9
            goto L359
        L353:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r9.end
            int r9 = r9.margin
            int r9 = -r9
            int r7 = r7 + r9
        L359:
            int r3 = r3 + 1
            goto L2d3
        L35d:
            r3 = 2
            if (r9 != r3) goto L40f
            int r3 = r0.orientation
            if (r3 != 0) goto L36b
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.widget
            float r3 = r3.getHorizontalBiasPercent()
            goto L371
        L36b:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.widget
            float r3 = r3.getVerticalBiasPercent()
        L371:
            if (r1 == 0) goto L377
            r9 = 1065353216(0x3f800000, float:1.0)
            float r3 = r9 - r3
        L377:
            int r2 = r2 - r14
            float r2 = (float) r2
            float r2 = r2 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            int r2 = (int) r2
            if (r2 < 0) goto L382
            if (r15 <= 0) goto L383
        L382:
            r2 = r7
        L383:
            if (r1 == 0) goto L388
            int r2 = r21 - r2
            goto L38a
        L388:
            int r2 = r21 + r2
        L38a:
            r3 = r7
        L38b:
            if (r3 >= r4) goto L40f
            if (r1 == 0) goto L394
            int r7 = r3 + 1
            int r7 = r4 - r7
            goto L395
        L394:
            r7 = r3
        L395:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r9 = r0.widgets
            java.lang.Object r7 = r9.get(r7)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r7 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r7
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r7.widget
            int r9 = r9.getVisibility()
            r10 = 8
            if (r9 != r10) goto L3b3
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r7.start
            r9.resolve(r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r7.end
            r7.resolve(r2)
            r12 = 1
            goto L40b
        L3b3:
            if (r3 <= 0) goto L3c4
            if (r3 < r5) goto L3c4
            if (r1 == 0) goto L3bf
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r7.start
            int r9 = r9.margin
            int r2 = r2 - r9
            goto L3c4
        L3bf:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r7.start
            int r9 = r9.margin
            int r2 = r2 + r9
        L3c4:
            if (r1 == 0) goto L3cc
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r7.end
            r9.resolve(r2)
            goto L3d1
        L3cc:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r7.start
            r9.resolve(r2)
        L3d1:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r9 = r7.dimension
            int r9 = r9.value
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r7.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L3e5
            int r11 = r7.matchConstraintsType
            r12 = 1
            if (r11 != r12) goto L3e6
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r9 = r7.dimension
            int r9 = r9.wrapValue
            goto L3e6
        L3e5:
            r12 = 1
        L3e6:
            if (r1 == 0) goto L3ea
            int r2 = r2 - r9
            goto L3eb
        L3ea:
            int r2 = r2 + r9
        L3eb:
            if (r1 == 0) goto L3f3
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r7.start
            r9.resolve(r2)
            goto L3f8
        L3f3:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r7.end
            r9.resolve(r2)
        L3f8:
            if (r3 >= r8) goto L40b
            if (r3 >= r6) goto L40b
            if (r1 == 0) goto L405
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r7.end
            int r7 = r7.margin
            int r7 = -r7
            int r2 = r2 - r7
            goto L40b
        L405:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r7.end
            int r7 = r7.margin
            int r7 = -r7
            int r2 = r2 + r7
        L40b:
            int r3 = r3 + 1
            goto L38b
        L40f:
            return
    }
}
