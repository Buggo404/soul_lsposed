package androidx.constraintlayout.core.widgets;

/* loaded from: classes.dex */
public class ChainHead {
    private boolean mDefined;
    protected androidx.constraintlayout.core.widgets.ConstraintWidget mFirst;
    protected androidx.constraintlayout.core.widgets.ConstraintWidget mFirstMatchConstraintWidget;
    protected androidx.constraintlayout.core.widgets.ConstraintWidget mFirstVisibleWidget;
    protected boolean mHasComplexMatchWeights;
    protected boolean mHasDefinedWeights;
    protected boolean mHasRatio;
    protected boolean mHasUndefinedWeights;
    protected androidx.constraintlayout.core.widgets.ConstraintWidget mHead;
    private boolean mIsRtl;
    protected androidx.constraintlayout.core.widgets.ConstraintWidget mLast;
    protected androidx.constraintlayout.core.widgets.ConstraintWidget mLastMatchConstraintWidget;
    protected androidx.constraintlayout.core.widgets.ConstraintWidget mLastVisibleWidget;
    boolean mOptimizable;
    private int mOrientation;
    int mTotalMargins;
    int mTotalSize;
    protected float mTotalWeight;
    int mVisibleWidgets;
    protected java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> mWeightedMatchConstraintsWidgets;
    protected int mWidgetsCount;
    protected int mWidgetsMatchCount;

    public ChainHead(androidx.constraintlayout.core.widgets.ConstraintWidget r2, int r3, boolean r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mTotalWeight = r0
            r1.mFirst = r2
            r1.mOrientation = r3
            r1.mIsRtl = r4
            return
    }

    private void defineChainProperties() {
            r13 = this;
            int r0 = r13.mOrientation
            r1 = 2
            int r0 = r0 * r1
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r13.mFirst
            r3 = 1
            r13.mOptimizable = r3
            r4 = 0
            r5 = r2
            r6 = r4
        Lc:
            if (r6 != 0) goto L14f
            int r7 = r13.mWidgetsCount
            int r7 = r7 + r3
            r13.mWidgetsCount = r7
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r7 = r2.mNextChainWidget
            int r8 = r13.mOrientation
            r9 = 0
            r7[r8] = r9
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r7 = r2.mListNextMatchConstraintsWidget
            int r8 = r13.mOrientation
            r7[r8] = r9
            int r7 = r2.getVisibility()
            r8 = 8
            if (r7 == r8) goto L11e
            int r7 = r13.mVisibleWidgets
            int r7 = r7 + r3
            r13.mVisibleWidgets = r7
            int r7 = r13.mOrientation
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = r2.getDimensionBehaviour(r7)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r7 == r8) goto L42
            int r7 = r13.mTotalSize
            int r8 = r13.mOrientation
            int r8 = r2.getLength(r8)
            int r7 = r7 + r8
            r13.mTotalSize = r7
        L42:
            int r7 = r13.mTotalSize
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r8 = r2.mListAnchors
            r8 = r8[r0]
            int r8 = r8.getMargin()
            int r7 = r7 + r8
            r13.mTotalSize = r7
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r8 = r2.mListAnchors
            int r10 = r0 + 1
            r8 = r8[r10]
            int r8 = r8.getMargin()
            int r7 = r7 + r8
            r13.mTotalSize = r7
            int r7 = r13.mTotalMargins
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r8 = r2.mListAnchors
            r8 = r8[r0]
            int r8 = r8.getMargin()
            int r7 = r7 + r8
            r13.mTotalMargins = r7
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r8 = r2.mListAnchors
            r8 = r8[r10]
            int r8 = r8.getMargin()
            int r7 = r7 + r8
            r13.mTotalMargins = r7
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r13.mFirstVisibleWidget
            if (r7 != 0) goto L7a
            r13.mFirstVisibleWidget = r2
        L7a:
            r13.mLastVisibleWidget = r2
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r7 = r2.mListDimensionBehaviors
            int r8 = r13.mOrientation
            r7 = r7[r8]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r7 != r8) goto L11e
            int[] r7 = r2.mResolvedMatchConstraintDefault
            int r8 = r13.mOrientation
            r7 = r7[r8]
            r8 = 0
            if (r7 == 0) goto La0
            int[] r7 = r2.mResolvedMatchConstraintDefault
            int r10 = r13.mOrientation
            r7 = r7[r10]
            r10 = 3
            if (r7 == r10) goto La0
            int[] r7 = r2.mResolvedMatchConstraintDefault
            int r10 = r13.mOrientation
            r7 = r7[r10]
            if (r7 != r1) goto Led
        La0:
            int r7 = r13.mWidgetsMatchCount
            int r7 = r7 + r3
            r13.mWidgetsMatchCount = r7
            float[] r7 = r2.mWeight
            int r10 = r13.mOrientation
            r7 = r7[r10]
            int r10 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r10 <= 0) goto Lba
            float r10 = r13.mTotalWeight
            float[] r11 = r2.mWeight
            int r12 = r13.mOrientation
            r11 = r11[r12]
            float r10 = r10 + r11
            r13.mTotalWeight = r10
        Lba:
            int r10 = r13.mOrientation
            boolean r10 = isMatchConstraintEqualityCandidate(r2, r10)
            if (r10 == 0) goto Ldb
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto Lc9
            r13.mHasUndefinedWeights = r3
            goto Lcb
        Lc9:
            r13.mHasDefinedWeights = r3
        Lcb:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r7 = r13.mWeightedMatchConstraintsWidgets
            if (r7 != 0) goto Ld6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r13.mWeightedMatchConstraintsWidgets = r7
        Ld6:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r7 = r13.mWeightedMatchConstraintsWidgets
            r7.add(r2)
        Ldb:
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r13.mFirstMatchConstraintWidget
            if (r7 != 0) goto Le1
            r13.mFirstMatchConstraintWidget = r2
        Le1:
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r13.mLastMatchConstraintWidget
            if (r7 == 0) goto Leb
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r7 = r7.mListNextMatchConstraintsWidget
            int r10 = r13.mOrientation
            r7[r10] = r2
        Leb:
            r13.mLastMatchConstraintWidget = r2
        Led:
            int r7 = r13.mOrientation
            if (r7 != 0) goto L103
            int r7 = r2.mMatchConstraintDefaultWidth
            if (r7 == 0) goto Lf8
            r13.mOptimizable = r4
            goto L114
        Lf8:
            int r7 = r2.mMatchConstraintMinWidth
            if (r7 != 0) goto L100
            int r7 = r2.mMatchConstraintMaxWidth
            if (r7 == 0) goto L114
        L100:
            r13.mOptimizable = r4
            goto L114
        L103:
            int r7 = r2.mMatchConstraintDefaultHeight
            if (r7 == 0) goto L10a
            r13.mOptimizable = r4
            goto L114
        L10a:
            int r7 = r2.mMatchConstraintMinHeight
            if (r7 != 0) goto L112
            int r7 = r2.mMatchConstraintMaxHeight
            if (r7 == 0) goto L114
        L112:
            r13.mOptimizable = r4
        L114:
            float r7 = r2.mDimensionRatio
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 == 0) goto L11e
            r13.mOptimizable = r4
            r13.mHasRatio = r3
        L11e:
            if (r5 == r2) goto L126
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r5 = r5.mNextChainWidget
            int r7 = r13.mOrientation
            r5[r7] = r2
        L126:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r5 = r2.mListAnchors
            int r7 = r0 + 1
            r5 = r5[r7]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto L146
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.mOwner
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r7 = r5.mListAnchors
            r7 = r7[r0]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.mTarget
            if (r7 == 0) goto L146
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r7 = r5.mListAnchors
            r7 = r7[r0]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.mTarget
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r7.mOwner
            if (r7 == r2) goto L145
            goto L146
        L145:
            r9 = r5
        L146:
            if (r9 == 0) goto L149
            goto L14b
        L149:
            r9 = r2
            r6 = r3
        L14b:
            r5 = r2
            r2 = r9
            goto Lc
        L14f:
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r13.mFirstVisibleWidget
            if (r1 == 0) goto L160
            int r5 = r13.mTotalSize
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            r1 = r1[r0]
            int r1 = r1.getMargin()
            int r5 = r5 - r1
            r13.mTotalSize = r5
        L160:
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r13.mLastVisibleWidget
            if (r1 == 0) goto L172
            int r5 = r13.mTotalSize
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            int r0 = r0 + r3
            r0 = r1[r0]
            int r0 = r0.getMargin()
            int r5 = r5 - r0
            r13.mTotalSize = r5
        L172:
            r13.mLast = r2
            int r0 = r13.mOrientation
            if (r0 != 0) goto L17f
            boolean r0 = r13.mIsRtl
            if (r0 == 0) goto L17f
            r13.mHead = r2
            goto L183
        L17f:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r13.mFirst
            r13.mHead = r0
        L183:
            boolean r0 = r13.mHasDefinedWeights
            if (r0 == 0) goto L18c
            boolean r0 = r13.mHasUndefinedWeights
            if (r0 == 0) goto L18c
            goto L18d
        L18c:
            r3 = r4
        L18d:
            r13.mHasComplexMatchWeights = r3
            return
    }

    private static boolean isMatchConstraintEqualityCandidate(androidx.constraintlayout.core.widgets.ConstraintWidget r2, int r3) {
            int r0 = r2.getVisibility()
            r1 = 8
            if (r0 == r1) goto L1f
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r2.mListDimensionBehaviors
            r0 = r0[r3]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r1) goto L1f
            int[] r0 = r2.mResolvedMatchConstraintDefault
            r0 = r0[r3]
            if (r0 == 0) goto L1d
            int[] r2 = r2.mResolvedMatchConstraintDefault
            r2 = r2[r3]
            r3 = 3
            if (r2 != r3) goto L1f
        L1d:
            r2 = 1
            goto L20
        L1f:
            r2 = 0
        L20:
            return r2
    }

    public void define() {
            r1 = this;
            boolean r0 = r1.mDefined
            if (r0 != 0) goto L7
            r1.defineChainProperties()
        L7:
            r0 = 1
            r1.mDefined = r0
            return
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getFirst() {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.mFirst
            return r0
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getFirstMatchConstraintWidget() {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.mFirstMatchConstraintWidget
            return r0
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getFirstVisibleWidget() {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.mFirstVisibleWidget
            return r0
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getHead() {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.mHead
            return r0
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getLast() {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.mLast
            return r0
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getLastMatchConstraintWidget() {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.mLastMatchConstraintWidget
            return r0
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getLastVisibleWidget() {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.mLastVisibleWidget
            return r0
    }

    public float getTotalWeight() {
            r1 = this;
            float r0 = r1.mTotalWeight
            return r0
    }
}
