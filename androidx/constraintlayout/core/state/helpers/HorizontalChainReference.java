package androidx.constraintlayout.core.state.helpers;

/* loaded from: classes.dex */
public class HorizontalChainReference extends androidx.constraintlayout.core.state.helpers.ChainReference {

    /* renamed from: androidx.constraintlayout.core.state.helpers.HorizontalChainReference$1 */
    static /* synthetic */ class C01251 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$state$State$Chain = null;

        static {
                androidx.constraintlayout.core.state.State$Chain[] r0 = androidx.constraintlayout.core.state.State.Chain.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.core.state.helpers.HorizontalChainReference.C01251.$SwitchMap$androidx$constraintlayout$core$state$State$Chain = r0
                androidx.constraintlayout.core.state.State$Chain r1 = androidx.constraintlayout.core.state.State.Chain.SPREAD     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.constraintlayout.core.state.helpers.HorizontalChainReference.C01251.$SwitchMap$androidx$constraintlayout$core$state$State$Chain     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.core.state.State$Chain r1 = androidx.constraintlayout.core.state.State.Chain.SPREAD_INSIDE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.constraintlayout.core.state.helpers.HorizontalChainReference.C01251.$SwitchMap$androidx$constraintlayout$core$state$State$Chain     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.core.state.State$Chain r1 = androidx.constraintlayout.core.state.State.Chain.PACKED     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    public HorizontalChainReference(androidx.constraintlayout.core.state.State r2) {
            r1 = this;
            androidx.constraintlayout.core.state.State$Helper r0 = androidx.constraintlayout.core.state.State.Helper.HORIZONTAL_CHAIN
            r1.<init>(r2, r0)
            return
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
            r5 = this;
            java.util.ArrayList<java.lang.Object> r0 = r5.mReferences
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.core.state.State r2 = r5.mState
            androidx.constraintlayout.core.state.ConstraintReference r1 = r2.constraints(r1)
            r1.clearHorizontal()
            goto L6
        L1a:
            java.util.ArrayList<java.lang.Object> r0 = r5.mReferences
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L22:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto La5
            java.lang.Object r3 = r0.next()
            androidx.constraintlayout.core.state.State r4 = r5.mState
            androidx.constraintlayout.core.state.ConstraintReference r3 = r4.constraints(r3)
            if (r2 != 0) goto L92
            java.lang.Object r2 = r5.mStartToStart
            if (r2 == 0) goto L4a
            java.lang.Object r2 = r5.mStartToStart
            androidx.constraintlayout.core.state.ConstraintReference r2 = r3.startToStart(r2)
            int r4 = r5.mMarginStart
            androidx.constraintlayout.core.state.ConstraintReference r2 = r2.margin(r4)
            int r4 = r5.mMarginStartGone
            r2.marginGone(r4)
            goto L91
        L4a:
            java.lang.Object r2 = r5.mStartToEnd
            if (r2 == 0) goto L60
            java.lang.Object r2 = r5.mStartToEnd
            androidx.constraintlayout.core.state.ConstraintReference r2 = r3.startToEnd(r2)
            int r4 = r5.mMarginStart
            androidx.constraintlayout.core.state.ConstraintReference r2 = r2.margin(r4)
            int r4 = r5.mMarginStartGone
            r2.marginGone(r4)
            goto L91
        L60:
            java.lang.Object r2 = r5.mLeftToLeft
            if (r2 == 0) goto L76
            java.lang.Object r2 = r5.mLeftToLeft
            androidx.constraintlayout.core.state.ConstraintReference r2 = r3.startToStart(r2)
            int r4 = r5.mMarginLeft
            androidx.constraintlayout.core.state.ConstraintReference r2 = r2.margin(r4)
            int r4 = r5.mMarginLeftGone
            r2.marginGone(r4)
            goto L91
        L76:
            java.lang.Object r2 = r5.mLeftToRight
            if (r2 == 0) goto L8c
            java.lang.Object r2 = r5.mLeftToRight
            androidx.constraintlayout.core.state.ConstraintReference r2 = r3.startToEnd(r2)
            int r4 = r5.mMarginLeft
            androidx.constraintlayout.core.state.ConstraintReference r2 = r2.margin(r4)
            int r4 = r5.mMarginLeftGone
            r2.marginGone(r4)
            goto L91
        L8c:
            java.lang.Integer r2 = androidx.constraintlayout.core.state.State.PARENT
            r3.startToStart(r2)
        L91:
            r2 = r3
        L92:
            if (r1 == 0) goto La2
            java.lang.Object r4 = r3.getKey()
            r1.endToStart(r4)
            java.lang.Object r1 = r1.getKey()
            r3.startToEnd(r1)
        La2:
            r1 = r3
            goto L22
        La5:
            if (r1 == 0) goto L104
            java.lang.Object r0 = r5.mEndToStart
            if (r0 == 0) goto Lbd
            java.lang.Object r0 = r5.mEndToStart
            androidx.constraintlayout.core.state.ConstraintReference r0 = r1.endToStart(r0)
            int r1 = r5.mMarginEnd
            androidx.constraintlayout.core.state.ConstraintReference r0 = r0.margin(r1)
            int r1 = r5.mMarginEndGone
            r0.marginGone(r1)
            goto L104
        Lbd:
            java.lang.Object r0 = r5.mEndToEnd
            if (r0 == 0) goto Ld3
            java.lang.Object r0 = r5.mEndToEnd
            androidx.constraintlayout.core.state.ConstraintReference r0 = r1.endToEnd(r0)
            int r1 = r5.mMarginEnd
            androidx.constraintlayout.core.state.ConstraintReference r0 = r0.margin(r1)
            int r1 = r5.mMarginEndGone
            r0.marginGone(r1)
            goto L104
        Ld3:
            java.lang.Object r0 = r5.mRightToLeft
            if (r0 == 0) goto Le9
            java.lang.Object r0 = r5.mRightToLeft
            androidx.constraintlayout.core.state.ConstraintReference r0 = r1.endToStart(r0)
            int r1 = r5.mMarginRight
            androidx.constraintlayout.core.state.ConstraintReference r0 = r0.margin(r1)
            int r1 = r5.mMarginRightGone
            r0.marginGone(r1)
            goto L104
        Le9:
            java.lang.Object r0 = r5.mRightToRight
            if (r0 == 0) goto Lff
            java.lang.Object r0 = r5.mRightToRight
            androidx.constraintlayout.core.state.ConstraintReference r0 = r1.endToEnd(r0)
            int r1 = r5.mMarginRight
            androidx.constraintlayout.core.state.ConstraintReference r0 = r0.margin(r1)
            int r1 = r5.mMarginRightGone
            r0.marginGone(r1)
            goto L104
        Lff:
            java.lang.Integer r0 = androidx.constraintlayout.core.state.State.PARENT
            r1.endToEnd(r0)
        L104:
            if (r2 != 0) goto L107
            return
        L107:
            float r0 = r5.mBias
            r1 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L114
            float r0 = r5.mBias
            r2.horizontalBias(r0)
        L114:
            int[] r0 = androidx.constraintlayout.core.state.helpers.HorizontalChainReference.C01251.$SwitchMap$androidx$constraintlayout$core$state$State$Chain
            androidx.constraintlayout.core.state.State$Chain r1 = r5.mStyle
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L130
            r3 = 2
            if (r0 == r3) goto L12c
            r1 = 3
            if (r0 == r1) goto L128
            goto L134
        L128:
            r2.setHorizontalChainStyle(r3)
            goto L134
        L12c:
            r2.setHorizontalChainStyle(r1)
            goto L134
        L130:
            r0 = 0
            r2.setHorizontalChainStyle(r0)
        L134:
            return
    }
}
