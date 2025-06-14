package androidx.constraintlayout.core.widgets;

/* loaded from: classes.dex */
public class Optimizer {
    static final int FLAG_CHAIN_DANGLING = 1;
    static final int FLAG_RECOMPUTE_BOUNDS = 2;
    static final int FLAG_USE_OPTIMIZE = 0;
    public static final int OPTIMIZATION_BARRIER = 2;
    public static final int OPTIMIZATION_CACHE_MEASURES = 256;
    public static final int OPTIMIZATION_CHAIN = 4;
    public static final int OPTIMIZATION_DEPENDENCY_ORDERING = 512;
    public static final int OPTIMIZATION_DIMENSIONS = 8;
    public static final int OPTIMIZATION_DIRECT = 1;
    public static final int OPTIMIZATION_GRAPH = 64;
    public static final int OPTIMIZATION_GRAPH_WRAP = 128;
    public static final int OPTIMIZATION_GROUPING = 1024;
    public static final int OPTIMIZATION_GROUPS = 32;
    public static final int OPTIMIZATION_NONE = 0;
    public static final int OPTIMIZATION_RATIO = 16;
    public static final int OPTIMIZATION_STANDARD = 257;
    static boolean[] flags;

    static {
            r0 = 3
            boolean[] r0 = new boolean[r0]
            androidx.constraintlayout.core.widgets.Optimizer.flags = r0
            return
    }

    public Optimizer() {
            r0 = this;
            r0.<init>()
            return
    }

    static void checkMatchParent(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5, androidx.constraintlayout.core.LinearSystem r6, androidx.constraintlayout.core.widgets.ConstraintWidget r7) {
            r0 = -1
            r7.mHorizontalResolution = r0
            r7.mVerticalResolution = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r5.mListDimensionBehaviors
            r1 = 0
            r0 = r0[r1]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r3 = 2
            if (r0 == r2) goto L4b
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r7.mListDimensionBehaviors
            r0 = r0[r1]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r0 != r1) goto L4b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r7.mLeft
            int r0 = r0.mMargin
            int r1 = r5.getWidth()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r7.mRight
            int r2 = r2.mMargin
            int r1 = r1 - r2
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r7.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r7.mLeft
            androidx.constraintlayout.core.SolverVariable r4 = r6.createObjectVariable(r4)
            r2.mSolverVariable = r4
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r7.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r7.mRight
            androidx.constraintlayout.core.SolverVariable r4 = r6.createObjectVariable(r4)
            r2.mSolverVariable = r4
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r7.mLeft
            androidx.constraintlayout.core.SolverVariable r2 = r2.mSolverVariable
            r6.addEquality(r2, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r7.mRight
            androidx.constraintlayout.core.SolverVariable r2 = r2.mSolverVariable
            r6.addEquality(r2, r1)
            r7.mHorizontalResolution = r3
            r7.setHorizontalDimension(r0, r1)
        L4b:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r5.mListDimensionBehaviors
            r1 = 1
            r0 = r0[r1]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 == r2) goto Lb0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r7.mListDimensionBehaviors
            r0 = r0[r1]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r0 != r1) goto Lb0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r7.mTop
            int r0 = r0.mMargin
            int r5 = r5.getHeight()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r7.mBottom
            int r1 = r1.mMargin
            int r5 = r5 - r1
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r7.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r7.mTop
            androidx.constraintlayout.core.SolverVariable r2 = r6.createObjectVariable(r2)
            r1.mSolverVariable = r2
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r7.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r7.mBottom
            androidx.constraintlayout.core.SolverVariable r2 = r6.createObjectVariable(r2)
            r1.mSolverVariable = r2
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r7.mTop
            androidx.constraintlayout.core.SolverVariable r1 = r1.mSolverVariable
            r6.addEquality(r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r7.mBottom
            androidx.constraintlayout.core.SolverVariable r1 = r1.mSolverVariable
            r6.addEquality(r1, r5)
            int r1 = r7.mBaselineDistance
            if (r1 > 0) goto L97
            int r1 = r7.getVisibility()
            r2 = 8
            if (r1 != r2) goto Lab
        L97:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r7.mBaseline
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r7.mBaseline
            androidx.constraintlayout.core.SolverVariable r2 = r6.createObjectVariable(r2)
            r1.mSolverVariable = r2
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r7.mBaseline
            androidx.constraintlayout.core.SolverVariable r1 = r1.mSolverVariable
            int r2 = r7.mBaselineDistance
            int r2 = r2 + r0
            r6.addEquality(r1, r2)
        Lab:
            r7.mVerticalResolution = r3
            r7.setVerticalDimension(r0, r5)
        Lb0:
            return
    }

    public static final boolean enabled(int r0, int r1) {
            r0 = r0 & r1
            if (r0 != r1) goto L5
            r0 = 1
            goto L6
        L5:
            r0 = 0
        L6:
            return r0
    }
}
