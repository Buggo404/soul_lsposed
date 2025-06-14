package androidx.constraintlayout.core.widgets.analyzer;

/* loaded from: classes.dex */
public class BasicMeasure {
    public static final int AT_MOST = Integer.MIN_VALUE;
    private static final boolean DEBUG = false;
    public static final int EXACTLY = 1073741824;
    public static final int FIXED = -3;
    public static final int MATCH_PARENT = -1;
    private static final int MODE_SHIFT = 30;
    public static final int UNSPECIFIED = 0;
    public static final int WRAP_CONTENT = -2;
    private androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer;
    private androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure mMeasure;
    private final java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> mVariableDimensionsWidgets;

    public static class Measure {
        public static int SELF_DIMENSIONS = 0;
        public static int TRY_GIVEN_DIMENSIONS = 1;
        public static int USE_GIVEN_DIMENSIONS = 2;
        public androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour horizontalBehavior;
        public int horizontalDimension;
        public int measureStrategy;
        public int measuredBaseline;
        public boolean measuredHasBaseline;
        public int measuredHeight;
        public boolean measuredNeedsSolverPass;
        public int measuredWidth;
        public androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour verticalBehavior;
        public int verticalDimension;

        static {
                return
        }

        public Measure() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public interface Measurer {
        void didMeasures();

        void measure(androidx.constraintlayout.core.widgets.ConstraintWidget r1, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure r2);
    }

    public BasicMeasure(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mVariableDimensionsWidgets = r0
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r0 = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure
            r0.<init>()
            r1.mMeasure = r0
            r1.constraintWidgetContainer = r2
            return
    }

    private boolean measure(androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer r5, androidx.constraintlayout.core.widgets.ConstraintWidget r6, int r7) {
            r4 = this;
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r0 = r4.mMeasure
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r6.getHorizontalDimensionBehaviour()
            r0.horizontalBehavior = r1
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r0 = r4.mMeasure
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r6.getVerticalDimensionBehaviour()
            r0.verticalBehavior = r1
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r0 = r4.mMeasure
            int r1 = r6.getWidth()
            r0.horizontalDimension = r1
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r0 = r4.mMeasure
            int r1 = r6.getHeight()
            r0.verticalDimension = r1
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r0 = r4.mMeasure
            r1 = 0
            r0.measuredNeedsSolverPass = r1
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r0 = r4.mMeasure
            r0.measureStrategy = r7
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r7 = r4.mMeasure
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = r7.horizontalBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r2 = 1
            if (r7 != r0) goto L34
            r7 = r2
            goto L35
        L34:
            r7 = r1
        L35:
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r0 = r4.mMeasure
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r0.verticalBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r3) goto L3f
            r0 = r2
            goto L40
        L3f:
            r0 = r1
        L40:
            r3 = 0
            if (r7 == 0) goto L4b
            float r7 = r6.mDimensionRatio
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 <= 0) goto L4b
            r7 = r2
            goto L4c
        L4b:
            r7 = r1
        L4c:
            if (r0 == 0) goto L56
            float r0 = r6.mDimensionRatio
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L56
            r0 = r2
            goto L57
        L56:
            r0 = r1
        L57:
            r3 = 4
            if (r7 == 0) goto L66
            int[] r7 = r6.mResolvedMatchConstraintDefault
            r7 = r7[r1]
            if (r7 != r3) goto L66
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r7 = r4.mMeasure
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r7.horizontalBehavior = r1
        L66:
            if (r0 == 0) goto L74
            int[] r7 = r6.mResolvedMatchConstraintDefault
            r7 = r7[r2]
            if (r7 != r3) goto L74
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r7 = r4.mMeasure
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r7.verticalBehavior = r0
        L74:
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r7 = r4.mMeasure
            r5.measure(r6, r7)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r5 = r4.mMeasure
            int r5 = r5.measuredWidth
            r6.setWidth(r5)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r5 = r4.mMeasure
            int r5 = r5.measuredHeight
            r6.setHeight(r5)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r5 = r4.mMeasure
            boolean r5 = r5.measuredHasBaseline
            r6.setHasBaseline(r5)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r5 = r4.mMeasure
            int r5 = r5.measuredBaseline
            r6.setBaselineDistance(r5)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r5 = r4.mMeasure
            int r6 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS
            r5.measureStrategy = r6
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r5 = r4.mMeasure
            boolean r5 = r5.measuredNeedsSolverPass
            return r5
    }

    private void measureChildren(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r12) {
            r11 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r12.mChildren
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r12.optimizeFor(r1)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer r2 = r12.getMeasurer()
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r0) goto Lc4
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r5 = r12.mChildren
            java.lang.Object r5 = r5.get(r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r6 == 0) goto L22
            goto Lc0
        L22:
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r6 == 0) goto L28
            goto Lc0
        L28:
            boolean r6 = r5.isInVirtualLayout()
            if (r6 == 0) goto L30
            goto Lc0
        L30:
            if (r1 == 0) goto L4c
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r6 = r5.horizontalRun
            if (r6 == 0) goto L4c
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r6 = r5.verticalRun
            if (r6 == 0) goto L4c
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r6 = r5.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r6 = r6.dimension
            boolean r6 = r6.resolved
            if (r6 == 0) goto L4c
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r6 = r5.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r6 = r6.dimension
            boolean r6 = r6.resolved
            if (r6 == 0) goto L4c
            goto Lc0
        L4c:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = r5.getDimensionBehaviour(r3)
            r7 = 1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = r5.getDimensionBehaviour(r7)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r6 != r9) goto L67
            int r9 = r5.mMatchConstraintDefaultWidth
            if (r9 == r7) goto L67
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r8 != r9) goto L67
            int r9 = r5.mMatchConstraintDefaultHeight
            if (r9 == r7) goto L67
            r9 = r7
            goto L68
        L67:
            r9 = r3
        L68:
            if (r9 != 0) goto Laa
            boolean r10 = r12.optimizeFor(r7)
            if (r10 == 0) goto Laa
            boolean r10 = r5 instanceof androidx.constraintlayout.core.widgets.VirtualLayout
            if (r10 != 0) goto Laa
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r6 != r10) goto L87
            int r10 = r5.mMatchConstraintDefaultWidth
            if (r10 != 0) goto L87
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r8 == r10) goto L87
            boolean r10 = r5.isInHorizontalChain()
            if (r10 != 0) goto L87
            r9 = r7
        L87:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r8 != r10) goto L9a
            int r10 = r5.mMatchConstraintDefaultHeight
            if (r10 != 0) goto L9a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r6 == r10) goto L9a
            boolean r10 = r5.isInHorizontalChain()
            if (r10 != 0) goto L9a
            r9 = r7
        L9a:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r6 == r10) goto La2
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r8 != r6) goto Laa
        La2:
            float r6 = r5.mDimensionRatio
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto Laa
            goto Lab
        Laa:
            r7 = r9
        Lab:
            if (r7 == 0) goto Lae
            goto Lc0
        Lae:
            int r6 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS
            r11.measure(r2, r5, r6)
            androidx.constraintlayout.core.Metrics r5 = r12.mMetrics
            if (r5 == 0) goto Lc0
            androidx.constraintlayout.core.Metrics r5 = r12.mMetrics
            long r6 = r5.measuredWidgets
            r8 = 1
            long r6 = r6 + r8
            r5.measuredWidgets = r6
        Lc0:
            int r4 = r4 + 1
            goto L12
        Lc4:
            r2.didMeasures()
            return
    }

    private void solveLinearSystem(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r3, java.lang.String r4, int r5, int r6, int r7) {
            r2 = this;
            int r4 = r3.getMinWidth()
            int r0 = r3.getMinHeight()
            r1 = 0
            r3.setMinWidth(r1)
            r3.setMinHeight(r1)
            r3.setWidth(r6)
            r3.setHeight(r7)
            r3.setMinWidth(r4)
            r3.setMinHeight(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r3 = r2.constraintWidgetContainer
            r3.setPass(r5)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r3 = r2.constraintWidgetContainer
            r3.layout()
            return
    }

    public long solverMeasure(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33) {
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r28
            r4 = r30
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer r5 = r24.getMeasurer()
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r6 = r1.mChildren
            int r6 = r6.size()
            int r7 = r24.getWidth()
            int r8 = r24.getHeight()
            r9 = 128(0x80, float:1.794E-43)
            boolean r9 = androidx.constraintlayout.core.widgets.Optimizer.enabled(r2, r9)
            r10 = 0
            if (r9 != 0) goto L30
            r12 = 64
            boolean r2 = androidx.constraintlayout.core.widgets.Optimizer.enabled(r2, r12)
            if (r2 == 0) goto L2e
            goto L30
        L2e:
            r2 = r10
            goto L31
        L30:
            r2 = 1
        L31:
            if (r2 == 0) goto L8c
            r12 = r10
        L34:
            if (r12 >= r6) goto L8c
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r13 = r1.mChildren
            java.lang.Object r13 = r13.get(r12)
            androidx.constraintlayout.core.widgets.ConstraintWidget r13 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r13
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = r13.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r15 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r14 != r15) goto L48
            r14 = 1
            goto L49
        L48:
            r14 = r10
        L49:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r15 = r13.getVerticalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r15 != r11) goto L53
            r11 = 1
            goto L54
        L53:
            r11 = r10
        L54:
            if (r14 == 0) goto L63
            if (r11 == 0) goto L63
            float r11 = r13.getDimensionRatio()
            r14 = 0
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 <= 0) goto L63
            r11 = 1
            goto L64
        L63:
            r11 = r10
        L64:
            boolean r14 = r13.isInHorizontalChain()
            if (r14 == 0) goto L6e
            if (r11 == 0) goto L6e
        L6c:
            r2 = r10
            goto L8c
        L6e:
            boolean r14 = r13.isInVerticalChain()
            if (r14 == 0) goto L77
            if (r11 == 0) goto L77
            goto L6c
        L77:
            boolean r11 = r13 instanceof androidx.constraintlayout.core.widgets.VirtualLayout
            if (r11 == 0) goto L7c
            goto L6c
        L7c:
            boolean r11 = r13.isInHorizontalChain()
            if (r11 != 0) goto L6c
            boolean r11 = r13.isInVerticalChain()
            if (r11 == 0) goto L89
            goto L6c
        L89:
            int r12 = r12 + 1
            goto L34
        L8c:
            r11 = 1
            if (r2 == 0) goto L9b
            androidx.constraintlayout.core.Metrics r13 = androidx.constraintlayout.core.LinearSystem.sMetrics
            if (r13 == 0) goto L9b
            androidx.constraintlayout.core.Metrics r13 = androidx.constraintlayout.core.LinearSystem.sMetrics
            long r14 = r13.measures
            long r14 = r14 + r11
            r13.measures = r14
        L9b:
            r13 = 1073741824(0x40000000, float:2.0)
            if (r3 != r13) goto La1
            if (r4 == r13) goto La3
        La1:
            if (r9 == 0) goto La5
        La3:
            r14 = 1
            goto La6
        La5:
            r14 = r10
        La6:
            r2 = r2 & r14
            r14 = 2
            if (r2 == 0) goto L10e
            int r15 = r24.getMaxWidth()
            r11 = r29
            int r11 = java.lang.Math.min(r15, r11)
            int r12 = r24.getMaxHeight()
            r15 = r31
            int r12 = java.lang.Math.min(r12, r15)
            if (r3 != r13) goto Lcc
            int r15 = r24.getWidth()
            if (r15 == r11) goto Lcc
            r1.setWidth(r11)
            r24.invalidateGraph()
        Lcc:
            if (r4 != r13) goto Lda
            int r11 = r24.getHeight()
            if (r11 == r12) goto Lda
            r1.setHeight(r12)
            r24.invalidateGraph()
        Lda:
            if (r3 != r13) goto Le4
            if (r4 != r13) goto Le4
            boolean r9 = r1.directMeasure(r9)
            r12 = r14
            goto Lfe
        Le4:
            boolean r11 = r1.directMeasureSetup(r9)
            if (r3 != r13) goto Lf1
            boolean r12 = r1.directMeasureWithOrientation(r9, r10)
            r11 = r11 & r12
            r12 = 1
            goto Lf2
        Lf1:
            r12 = r10
        Lf2:
            if (r4 != r13) goto Lfd
            r15 = 1
            boolean r9 = r1.directMeasureWithOrientation(r9, r15)
            r9 = r9 & r11
            int r12 = r12 + 1
            goto Lfe
        Lfd:
            r9 = r11
        Lfe:
            if (r9 == 0) goto L110
            if (r3 != r13) goto L104
            r15 = 1
            goto L105
        L104:
            r15 = r10
        L105:
            if (r4 != r13) goto L109
            r3 = 1
            goto L10a
        L109:
            r3 = r10
        L10a:
            r1.updateFromRuns(r15, r3)
            goto L110
        L10e:
            r9 = r10
            r12 = r9
        L110:
            if (r9 == 0) goto L114
            if (r12 == r14) goto L327
        L114:
            int r3 = r24.getOptimizationLevel()
            if (r6 <= 0) goto L11d
            r23.measureChildren(r24)
        L11d:
            r23.updateHierarchy(r24)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r4 = r0.mVariableDimensionsWidgets
            int r4 = r4.size()
            if (r6 <= 0) goto L13a
            java.lang.String r6 = "First pass"
            r9 = 0
            r25 = r23
            r26 = r24
            r27 = r6
            r28 = r9
            r29 = r7
            r30 = r8
            r25.solveLinearSystem(r26, r27, r28, r29, r30)
        L13a:
            if (r4 <= 0) goto L323
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = r24.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r6 != r9) goto L146
            r15 = 1
            goto L147
        L146:
            r15 = r10
        L147:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = r24.getVerticalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r6 != r9) goto L151
            r6 = 1
            goto L152
        L151:
            r6 = r10
        L152:
            int r9 = r24.getWidth()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r11 = r0.constraintWidgetContainer
            int r11 = r11.getMinWidth()
            int r9 = java.lang.Math.max(r9, r11)
            int r11 = r24.getHeight()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r12 = r0.constraintWidgetContainer
            int r12 = r12.getMinHeight()
            int r11 = java.lang.Math.max(r11, r12)
            r12 = r10
            r13 = r12
        L170:
            if (r12 >= r4) goto L213
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r10 = r0.mVariableDimensionsWidgets
            java.lang.Object r10 = r10.get(r12)
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r10
            boolean r14 = r10 instanceof androidx.constraintlayout.core.widgets.VirtualLayout
            if (r14 != 0) goto L186
            r31 = r3
            r19 = r7
            r18 = r8
            goto L207
        L186:
            int r14 = r10.getWidth()
            r31 = r3
            int r3 = r10.getHeight()
            r18 = r8
            int r8 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS
            boolean r8 = r0.measure(r5, r10, r8)
            r8 = r8 | r13
            androidx.constraintlayout.core.Metrics r13 = r1.mMetrics
            if (r13 == 0) goto L1ac
            androidx.constraintlayout.core.Metrics r13 = r1.mMetrics
            r19 = r7
            r25 = r8
            long r7 = r13.measuredMatchWidgets
            r16 = 1
            long r7 = r7 + r16
            r13.measuredMatchWidgets = r7
            goto L1b0
        L1ac:
            r19 = r7
            r25 = r8
        L1b0:
            int r7 = r10.getWidth()
            int r8 = r10.getHeight()
            if (r7 == r14) goto L1db
            r10.setWidth(r7)
            if (r15 == 0) goto L1d9
            int r7 = r10.getRight()
            if (r7 <= r9) goto L1d9
            int r7 = r10.getRight()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r13 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r10.getAnchor(r13)
            int r13 = r13.getMargin()
            int r7 = r7 + r13
            int r7 = java.lang.Math.max(r9, r7)
            r9 = r7
        L1d9:
            r7 = 1
            goto L1dd
        L1db:
            r7 = r25
        L1dd:
            if (r8 == r3) goto L1ff
            r10.setHeight(r8)
            if (r6 == 0) goto L1fe
            int r3 = r10.getBottom()
            if (r3 <= r11) goto L1fe
            int r3 = r10.getBottom()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r10.getAnchor(r7)
            int r7 = r7.getMargin()
            int r3 = r3 + r7
            int r3 = java.lang.Math.max(r11, r3)
            r11 = r3
        L1fe:
            r7 = 1
        L1ff:
            androidx.constraintlayout.core.widgets.VirtualLayout r10 = (androidx.constraintlayout.core.widgets.VirtualLayout) r10
            boolean r3 = r10.needSolverPass()
            r13 = r7 | r3
        L207:
            int r12 = r12 + 1
            r3 = r31
            r8 = r18
            r7 = r19
            r10 = 0
            r14 = 2
            goto L170
        L213:
            r31 = r3
            r19 = r7
            r18 = r8
            r7 = r14
            r3 = 0
        L21b:
            if (r3 >= r7) goto L320
            r8 = 0
        L21e:
            if (r8 >= r4) goto L2f9
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r10 = r0.mVariableDimensionsWidgets
            java.lang.Object r10 = r10.get(r8)
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r10
            boolean r12 = r10 instanceof androidx.constraintlayout.core.widgets.Helper
            if (r12 == 0) goto L230
            boolean r12 = r10 instanceof androidx.constraintlayout.core.widgets.VirtualLayout
            if (r12 == 0) goto L255
        L230:
            boolean r12 = r10 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r12 == 0) goto L235
            goto L255
        L235:
            int r12 = r10.getVisibility()
            r14 = 8
            if (r12 != r14) goto L23e
            goto L255
        L23e:
            if (r2 == 0) goto L251
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r12 = r10.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r12 = r12.dimension
            boolean r12 = r12.resolved
            if (r12 == 0) goto L251
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r12 = r10.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r12 = r12.dimension
            boolean r12 = r12.resolved
            if (r12 == 0) goto L251
            goto L255
        L251:
            boolean r12 = r10 instanceof androidx.constraintlayout.core.widgets.VirtualLayout
            if (r12 == 0) goto L25f
        L255:
            r21 = r2
            r22 = r4
            r20 = r5
            r16 = 1
            goto L2ee
        L25f:
            int r12 = r10.getWidth()
            int r14 = r10.getHeight()
            int r7 = r10.getBaselineDistance()
            int r20 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS
            r21 = r2
            r2 = 1
            if (r3 != r2) goto L274
            int r20 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.USE_GIVEN_DIMENSIONS
        L274:
            r2 = r20
            boolean r2 = r0.measure(r5, r10, r2)
            r2 = r2 | r13
            androidx.constraintlayout.core.Metrics r13 = r1.mMetrics
            if (r13 == 0) goto L28e
            androidx.constraintlayout.core.Metrics r13 = r1.mMetrics
            r22 = r4
            r20 = r5
            long r4 = r13.measuredMatchWidgets
            r16 = 1
            long r4 = r4 + r16
            r13.measuredMatchWidgets = r4
            goto L294
        L28e:
            r22 = r4
            r20 = r5
            r16 = 1
        L294:
            int r4 = r10.getWidth()
            int r5 = r10.getHeight()
            if (r4 == r12) goto L2bd
            r10.setWidth(r4)
            if (r15 == 0) goto L2bc
            int r2 = r10.getRight()
            if (r2 <= r9) goto L2bc
            int r2 = r10.getRight()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r10.getAnchor(r4)
            int r4 = r4.getMargin()
            int r2 = r2 + r4
            int r9 = java.lang.Math.max(r9, r2)
        L2bc:
            r2 = 1
        L2bd:
            if (r5 == r14) goto L2df
            r10.setHeight(r5)
            if (r6 == 0) goto L2de
            int r2 = r10.getBottom()
            if (r2 <= r11) goto L2de
            int r2 = r10.getBottom()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r10.getAnchor(r4)
            int r4 = r4.getMargin()
            int r2 = r2 + r4
            int r2 = java.lang.Math.max(r11, r2)
            r11 = r2
        L2de:
            r2 = 1
        L2df:
            boolean r4 = r10.hasBaseline()
            if (r4 == 0) goto L2ed
            int r4 = r10.getBaselineDistance()
            if (r7 == r4) goto L2ed
            r13 = 1
            goto L2ee
        L2ed:
            r13 = r2
        L2ee:
            int r8 = r8 + 1
            r5 = r20
            r2 = r21
            r4 = r22
            r7 = 2
            goto L21e
        L2f9:
            r21 = r2
            r22 = r4
            r20 = r5
            r16 = 1
            if (r13 == 0) goto L320
            java.lang.String r2 = "intermediate pass"
            int r3 = r3 + 1
            r25 = r23
            r26 = r24
            r27 = r2
            r28 = r3
            r29 = r19
            r30 = r18
            r25.solveLinearSystem(r26, r27, r28, r29, r30)
            r5 = r20
            r2 = r21
            r4 = r22
            r7 = 2
            r13 = 0
            goto L21b
        L320:
            r2 = r31
            goto L324
        L323:
            r2 = r3
        L324:
            r1.setOptimizationLevel(r2)
        L327:
            r1 = 0
            return r1
    }

    public void updateHierarchy(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r6) {
            r5 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r5.mVariableDimensionsWidgets
            r0.clear()
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r6.mChildren
            int r0 = r0.size()
            r1 = 0
        Lc:
            if (r1 >= r0) goto L2e
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r2 = r6.mChildren
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = r2.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 == r4) goto L26
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = r2.getVerticalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 != r4) goto L2b
        L26:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r3 = r5.mVariableDimensionsWidgets
            r3.add(r2)
        L2b:
            int r1 = r1 + 1
            goto Lc
        L2e:
            r6.invalidateGraph()
            return
    }
}
