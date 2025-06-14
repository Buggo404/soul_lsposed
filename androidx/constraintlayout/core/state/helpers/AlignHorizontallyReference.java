package androidx.constraintlayout.core.state.helpers;

/* loaded from: classes.dex */
public class AlignHorizontallyReference extends androidx.constraintlayout.core.state.HelperReference {
    private float mBias;

    public AlignHorizontallyReference(androidx.constraintlayout.core.state.State r2) {
            r1 = this;
            androidx.constraintlayout.core.state.State$Helper r0 = androidx.constraintlayout.core.state.State.Helper.ALIGN_VERTICALLY
            r1.<init>(r2, r0)
            r2 = 1056964608(0x3f000000, float:0.5)
            r1.mBias = r2
            return
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
            r4 = this;
            java.util.ArrayList<java.lang.Object> r0 = r4.mReferences
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.core.state.State r2 = r4.mState
            androidx.constraintlayout.core.state.ConstraintReference r1 = r2.constraints(r1)
            r1.clearHorizontal()
            java.lang.Object r2 = r4.mStartToStart
            if (r2 == 0) goto L23
            java.lang.Object r2 = r4.mStartToStart
            r1.startToStart(r2)
            goto L32
        L23:
            java.lang.Object r2 = r4.mStartToEnd
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r4.mStartToEnd
            r1.startToEnd(r2)
            goto L32
        L2d:
            java.lang.Integer r2 = androidx.constraintlayout.core.state.State.PARENT
            r1.startToStart(r2)
        L32:
            java.lang.Object r2 = r4.mEndToStart
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r4.mEndToStart
            r1.endToStart(r2)
            goto L4b
        L3c:
            java.lang.Object r2 = r4.mEndToEnd
            if (r2 == 0) goto L46
            java.lang.Object r2 = r4.mEndToEnd
            r1.endToEnd(r2)
            goto L4b
        L46:
            java.lang.Integer r2 = androidx.constraintlayout.core.state.State.PARENT
            r1.endToEnd(r2)
        L4b:
            float r2 = r4.mBias
            r3 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 == 0) goto L6
            r1.horizontalBias(r2)
            goto L6
        L57:
            return
    }
}
