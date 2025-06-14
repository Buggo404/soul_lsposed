package androidx.constraintlayout.core.widgets;

/* loaded from: classes.dex */
public class Barrier extends androidx.constraintlayout.core.widgets.HelperWidget {
    public static final int BOTTOM = 3;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int TOP = 2;
    private static final boolean USE_RELAX_GONE = false;
    private static final boolean USE_RESOLUTION = true;
    private boolean mAllowsGoneWidget;
    private int mBarrierType;
    private int mMargin;
    boolean resolved;

    public Barrier() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mBarrierType = r0
            r1 = 1
            r2.mAllowsGoneWidget = r1
            r2.mMargin = r0
            r2.resolved = r0
            return
    }

    public Barrier(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mBarrierType = r0
            r1 = 1
            r2.mAllowsGoneWidget = r1
            r2.mMargin = r0
            r2.resolved = r0
            r2.setDebugName(r3)
            return
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(androidx.constraintlayout.core.LinearSystem r13, boolean r14) {
            r12 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r14 = r12.mListAnchors
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r12.mLeft
            r1 = 0
            r14[r1] = r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r14 = r12.mListAnchors
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r12.mTop
            r2 = 2
            r14[r2] = r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r14 = r12.mListAnchors
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r12.mRight
            r3 = 1
            r14[r3] = r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r14 = r12.mListAnchors
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r12.mBottom
            r4 = 3
            r14[r4] = r0
            r14 = r1
        L1d:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r12.mListAnchors
            int r0 = r0.length
            if (r14 >= r0) goto L33
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r12.mListAnchors
            r0 = r0[r14]
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r5 = r12.mListAnchors
            r5 = r5[r14]
            androidx.constraintlayout.core.SolverVariable r5 = r13.createObjectVariable(r5)
            r0.mSolverVariable = r5
            int r14 = r14 + 1
            goto L1d
        L33:
            int r14 = r12.mBarrierType
            if (r14 < 0) goto L21f
            r0 = 4
            if (r14 >= r0) goto L21f
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r14 = r12.mListAnchors
            int r5 = r12.mBarrierType
            r14 = r14[r5]
            boolean r5 = r12.resolved
            if (r5 != 0) goto L47
            r12.allSolved()
        L47:
            boolean r5 = r12.resolved
            if (r5 == 0) goto L7e
            r12.resolved = r1
            int r14 = r12.mBarrierType
            if (r14 == 0) goto L6b
            if (r14 != r3) goto L54
            goto L6b
        L54:
            if (r14 == r2) goto L58
            if (r14 != r4) goto L7d
        L58:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.mTop
            androidx.constraintlayout.core.SolverVariable r14 = r14.mSolverVariable
            int r0 = r12.f39mY
            r13.addEquality(r14, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.mBottom
            androidx.constraintlayout.core.SolverVariable r14 = r14.mSolverVariable
            int r0 = r12.f39mY
            r13.addEquality(r14, r0)
            goto L7d
        L6b:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.mLeft
            androidx.constraintlayout.core.SolverVariable r14 = r14.mSolverVariable
            int r0 = r12.f38mX
            r13.addEquality(r14, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.mRight
            androidx.constraintlayout.core.SolverVariable r14 = r14.mSolverVariable
            int r0 = r12.f38mX
            r13.addEquality(r14, r0)
        L7d:
            return
        L7e:
            r5 = r1
        L7f:
            int r6 = r12.mWidgetsCount
            if (r5 >= r6) goto Lcc
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r6 = r12.mWidgets
            r6 = r6[r5]
            boolean r7 = r12.mAllowsGoneWidget
            if (r7 != 0) goto L92
            boolean r7 = r6.allowedInBarrier()
            if (r7 != 0) goto L92
            goto Lc9
        L92:
            int r7 = r12.mBarrierType
            if (r7 == 0) goto L98
            if (r7 != r3) goto Lae
        L98:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = r6.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r7 != r8) goto Lae
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r6.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.mTarget
            if (r7 == 0) goto Lae
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r6.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.mTarget
            if (r7 == 0) goto Lae
        Lac:
            r5 = r3
            goto Lcd
        Lae:
            int r7 = r12.mBarrierType
            if (r7 == r2) goto Lb4
            if (r7 != r4) goto Lc9
        Lb4:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = r6.getVerticalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r7 != r8) goto Lc9
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r6.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.mTarget
            if (r7 == 0) goto Lc9
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r6.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r6.mTarget
            if (r6 == 0) goto Lc9
            goto Lac
        Lc9:
            int r5 = r5 + 1
            goto L7f
        Lcc:
            r5 = r1
        Lcd:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r12.mLeft
            boolean r6 = r6.hasCenteredDependents()
            if (r6 != 0) goto Le0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r12.mRight
            boolean r6 = r6.hasCenteredDependents()
            if (r6 == 0) goto Lde
            goto Le0
        Lde:
            r6 = r1
            goto Le1
        Le0:
            r6 = r3
        Le1:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r12.mTop
            boolean r7 = r7.hasCenteredDependents()
            if (r7 != 0) goto Lf4
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r12.mBottom
            boolean r7 = r7.hasCenteredDependents()
            if (r7 == 0) goto Lf2
            goto Lf4
        Lf2:
            r7 = r1
            goto Lf5
        Lf4:
            r7 = r3
        Lf5:
            if (r5 != 0) goto L10b
            int r8 = r12.mBarrierType
            if (r8 != 0) goto Lfd
            if (r6 != 0) goto L109
        Lfd:
            if (r8 != r2) goto L101
            if (r7 != 0) goto L109
        L101:
            if (r8 != r3) goto L105
            if (r6 != 0) goto L109
        L105:
            if (r8 != r4) goto L10b
            if (r7 == 0) goto L10b
        L109:
            r6 = r3
            goto L10c
        L10b:
            r6 = r1
        L10c:
            if (r6 != 0) goto L110
            r6 = r0
            goto L111
        L110:
            r6 = 5
        L111:
            r7 = r1
        L112:
            int r8 = r12.mWidgetsCount
            if (r7 >= r8) goto L17b
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r8 = r12.mWidgets
            r8 = r8[r7]
            boolean r9 = r12.mAllowsGoneWidget
            if (r9 != 0) goto L125
            boolean r9 = r8.allowedInBarrier()
            if (r9 != 0) goto L125
            goto L178
        L125:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r9 = r8.mListAnchors
            int r10 = r12.mBarrierType
            r9 = r9[r10]
            androidx.constraintlayout.core.SolverVariable r9 = r13.createObjectVariable(r9)
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r10 = r8.mListAnchors
            int r11 = r12.mBarrierType
            r10 = r10[r11]
            r10.mSolverVariable = r9
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r10 = r8.mListAnchors
            int r11 = r12.mBarrierType
            r10 = r10[r11]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r10.mTarget
            if (r10 == 0) goto L157
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r10 = r8.mListAnchors
            int r11 = r12.mBarrierType
            r10 = r10[r11]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r10.mTarget
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r10.mOwner
            if (r10 != r12) goto L157
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r8 = r8.mListAnchors
            int r10 = r12.mBarrierType
            r8 = r8[r10]
            int r8 = r8.mMargin
            int r8 = r8 + r1
            goto L158
        L157:
            r8 = r1
        L158:
            int r10 = r12.mBarrierType
            if (r10 == 0) goto L168
            if (r10 != r2) goto L15f
            goto L168
        L15f:
            androidx.constraintlayout.core.SolverVariable r10 = r14.mSolverVariable
            int r11 = r12.mMargin
            int r11 = r11 + r8
            r13.addGreaterBarrier(r10, r9, r11, r5)
            goto L170
        L168:
            androidx.constraintlayout.core.SolverVariable r10 = r14.mSolverVariable
            int r11 = r12.mMargin
            int r11 = r11 - r8
            r13.addLowerBarrier(r10, r9, r11, r5)
        L170:
            androidx.constraintlayout.core.SolverVariable r10 = r14.mSolverVariable
            int r11 = r12.mMargin
            int r11 = r11 + r8
            r13.addEquality(r10, r9, r11, r6)
        L178:
            int r7 = r7 + 1
            goto L112
        L17b:
            int r14 = r12.mBarrierType
            r5 = 8
            if (r14 != 0) goto L1a8
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.mRight
            androidx.constraintlayout.core.SolverVariable r14 = r14.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r12.mLeft
            androidx.constraintlayout.core.SolverVariable r2 = r2.mSolverVariable
            r13.addEquality(r14, r2, r1, r5)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.mLeft
            androidx.constraintlayout.core.SolverVariable r14 = r14.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r12.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mRight
            androidx.constraintlayout.core.SolverVariable r2 = r2.mSolverVariable
            r13.addEquality(r14, r2, r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.mLeft
            androidx.constraintlayout.core.SolverVariable r14 = r14.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r12.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mLeft
            androidx.constraintlayout.core.SolverVariable r0 = r0.mSolverVariable
            r13.addEquality(r14, r0, r1, r1)
            goto L21f
        L1a8:
            if (r14 != r3) goto L1d0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.mLeft
            androidx.constraintlayout.core.SolverVariable r14 = r14.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r12.mRight
            androidx.constraintlayout.core.SolverVariable r2 = r2.mSolverVariable
            r13.addEquality(r14, r2, r1, r5)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.mLeft
            androidx.constraintlayout.core.SolverVariable r14 = r14.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r12.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mLeft
            androidx.constraintlayout.core.SolverVariable r2 = r2.mSolverVariable
            r13.addEquality(r14, r2, r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.mLeft
            androidx.constraintlayout.core.SolverVariable r14 = r14.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r12.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mRight
            androidx.constraintlayout.core.SolverVariable r0 = r0.mSolverVariable
            r13.addEquality(r14, r0, r1, r1)
            goto L21f
        L1d0:
            if (r14 != r2) goto L1f8
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.mBottom
            androidx.constraintlayout.core.SolverVariable r14 = r14.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r12.mTop
            androidx.constraintlayout.core.SolverVariable r2 = r2.mSolverVariable
            r13.addEquality(r14, r2, r1, r5)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.mTop
            androidx.constraintlayout.core.SolverVariable r14 = r14.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r12.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mBottom
            androidx.constraintlayout.core.SolverVariable r2 = r2.mSolverVariable
            r13.addEquality(r14, r2, r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.mTop
            androidx.constraintlayout.core.SolverVariable r14 = r14.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r12.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTop
            androidx.constraintlayout.core.SolverVariable r0 = r0.mSolverVariable
            r13.addEquality(r14, r0, r1, r1)
            goto L21f
        L1f8:
            if (r14 != r4) goto L21f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.mTop
            androidx.constraintlayout.core.SolverVariable r14 = r14.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r12.mBottom
            androidx.constraintlayout.core.SolverVariable r2 = r2.mSolverVariable
            r13.addEquality(r14, r2, r1, r5)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.mTop
            androidx.constraintlayout.core.SolverVariable r14 = r14.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r12.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTop
            androidx.constraintlayout.core.SolverVariable r2 = r2.mSolverVariable
            r13.addEquality(r14, r2, r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.mTop
            androidx.constraintlayout.core.SolverVariable r14 = r14.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r12.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mBottom
            androidx.constraintlayout.core.SolverVariable r0 = r0.mSolverVariable
            r13.addEquality(r14, r0, r1, r1)
        L21f:
            return
    }

    public boolean allSolved() {
            r8 = this;
            r0 = 1
            r1 = 0
            r3 = r0
            r2 = r1
        L4:
            int r4 = r8.mWidgetsCount
            r5 = 3
            r6 = 2
            if (r2 >= r4) goto L37
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r4 = r8.mWidgets
            r4 = r4[r2]
            boolean r7 = r8.mAllowsGoneWidget
            if (r7 != 0) goto L19
            boolean r7 = r4.allowedInBarrier()
            if (r7 != 0) goto L19
            goto L34
        L19:
            int r7 = r8.mBarrierType
            if (r7 == 0) goto L1f
            if (r7 != r0) goto L27
        L1f:
            boolean r7 = r4.isResolvedHorizontally()
            if (r7 != 0) goto L27
        L25:
            r3 = r1
            goto L34
        L27:
            int r7 = r8.mBarrierType
            if (r7 == r6) goto L2d
            if (r7 != r5) goto L34
        L2d:
            boolean r4 = r4.isResolvedVertically()
            if (r4 != 0) goto L34
            goto L25
        L34:
            int r2 = r2 + 1
            goto L4
        L37:
            if (r3 == 0) goto Le8
            int r2 = r8.mWidgetsCount
            if (r2 <= 0) goto Le8
            r2 = r1
            r3 = r2
        L3f:
            int r4 = r8.mWidgetsCount
            if (r1 >= r4) goto Ld4
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r4 = r8.mWidgets
            r4 = r4[r1]
            boolean r7 = r8.mAllowsGoneWidget
            if (r7 != 0) goto L53
            boolean r7 = r4.allowedInBarrier()
            if (r7 != 0) goto L53
            goto Ld0
        L53:
            if (r3 != 0) goto L8b
            int r3 = r8.mBarrierType
            if (r3 != 0) goto L64
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r4.getAnchor(r2)
            int r2 = r2.getFinalValue()
            goto L8a
        L64:
            if (r3 != r0) goto L71
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r4.getAnchor(r2)
            int r2 = r2.getFinalValue()
            goto L8a
        L71:
            if (r3 != r6) goto L7e
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r4.getAnchor(r2)
            int r2 = r2.getFinalValue()
            goto L8a
        L7e:
            if (r3 != r5) goto L8a
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r4.getAnchor(r2)
            int r2 = r2.getFinalValue()
        L8a:
            r3 = r0
        L8b:
            int r7 = r8.mBarrierType
            if (r7 != 0) goto L9e
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.getAnchor(r7)
            int r4 = r4.getFinalValue()
            int r2 = java.lang.Math.min(r2, r4)
            goto Ld0
        L9e:
            if (r7 != r0) goto Laf
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.getAnchor(r7)
            int r4 = r4.getFinalValue()
            int r2 = java.lang.Math.max(r2, r4)
            goto Ld0
        Laf:
            if (r7 != r6) goto Lc0
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.getAnchor(r7)
            int r4 = r4.getFinalValue()
            int r2 = java.lang.Math.min(r2, r4)
            goto Ld0
        Lc0:
            if (r7 != r5) goto Ld0
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.getAnchor(r7)
            int r4 = r4.getFinalValue()
            int r2 = java.lang.Math.max(r2, r4)
        Ld0:
            int r1 = r1 + 1
            goto L3f
        Ld4:
            int r1 = r8.mMargin
            int r2 = r2 + r1
            int r1 = r8.mBarrierType
            if (r1 == 0) goto Le2
            if (r1 != r0) goto Lde
            goto Le2
        Lde:
            r8.setFinalVertical(r2, r2)
            goto Le5
        Le2:
            r8.setFinalHorizontal(r2, r2)
        Le5:
            r8.resolved = r0
            return r0
        Le8:
            return r1
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean allowedInBarrier() {
            r1 = this;
            r0 = 1
            return r0
    }

    @java.lang.Deprecated
    public boolean allowsGoneWidget() {
            r1 = this;
            boolean r0 = r1.mAllowsGoneWidget
            return r0
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(androidx.constraintlayout.core.widgets.ConstraintWidget r1, java.util.HashMap<androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.ConstraintWidget> r2) {
            r0 = this;
            super.copy(r1, r2)
            androidx.constraintlayout.core.widgets.Barrier r1 = (androidx.constraintlayout.core.widgets.Barrier) r1
            int r2 = r1.mBarrierType
            r0.mBarrierType = r2
            boolean r2 = r1.mAllowsGoneWidget
            r0.mAllowsGoneWidget = r2
            int r1 = r1.mMargin
            r0.mMargin = r1
            return
    }

    public boolean getAllowsGoneWidget() {
            r1 = this;
            boolean r0 = r1.mAllowsGoneWidget
            return r0
    }

    public int getBarrierType() {
            r1 = this;
            int r0 = r1.mBarrierType
            return r0
    }

    public int getMargin() {
            r1 = this;
            int r0 = r1.mMargin
            return r0
    }

    public int getOrientation() {
            r3 = this;
            int r0 = r3.mBarrierType
            if (r0 == 0) goto L10
            r1 = 1
            if (r0 == r1) goto L10
            r2 = 2
            if (r0 == r2) goto Lf
            r2 = 3
            if (r0 == r2) goto Lf
            r0 = -1
            return r0
        Lf:
            return r1
        L10:
            r0 = 0
            return r0
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean isResolvedHorizontally() {
            r1 = this;
            boolean r0 = r1.resolved
            return r0
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean isResolvedVertically() {
            r1 = this;
            boolean r0 = r1.resolved
            return r0
    }

    protected void markWidgets() {
            r6 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r6.mWidgetsCount
            if (r1 >= r2) goto L2d
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r2 = r6.mWidgets
            r2 = r2[r1]
            boolean r3 = r6.mAllowsGoneWidget
            if (r3 != 0) goto L15
            boolean r3 = r2.allowedInBarrier()
            if (r3 != 0) goto L15
            goto L2a
        L15:
            int r3 = r6.mBarrierType
            r4 = 1
            if (r3 == 0) goto L27
            if (r3 != r4) goto L1d
            goto L27
        L1d:
            r5 = 2
            if (r3 == r5) goto L23
            r5 = 3
            if (r3 != r5) goto L2a
        L23:
            r2.setInBarrier(r4, r4)
            goto L2a
        L27:
            r2.setInBarrier(r0, r4)
        L2a:
            int r1 = r1 + 1
            goto L2
        L2d:
            return
    }

    public void setAllowsGoneWidget(boolean r1) {
            r0 = this;
            r0.mAllowsGoneWidget = r1
            return
    }

    public void setBarrierType(int r1) {
            r0 = this;
            r0.mBarrierType = r1
            return
    }

    public void setMargin(int r1) {
            r0 = this;
            r0.mMargin = r1
            return
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[Barrier] "
            r0.<init>(r1)
            java.lang.String r1 = r4.getDebugName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " {"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
        L1a:
            int r2 = r4.mWidgetsCount
            if (r1 >= r2) goto L4f
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r2 = r4.mWidgets
            r2 = r2[r1]
            if (r1 <= 0) goto L37
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = ", "
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
        L37:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r2 = r2.getDebugName()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            int r1 = r1 + 1
            goto L1a
        L4f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "}"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
