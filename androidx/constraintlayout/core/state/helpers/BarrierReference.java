package androidx.constraintlayout.core.state.helpers;

/* loaded from: classes.dex */
public class BarrierReference extends androidx.constraintlayout.core.state.HelperReference {
    private androidx.constraintlayout.core.widgets.Barrier mBarrierWidget;
    private androidx.constraintlayout.core.state.State.Direction mDirection;
    private int mMargin;

    /* renamed from: androidx.constraintlayout.core.state.helpers.BarrierReference$1 */
    static /* synthetic */ class C01241 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$state$State$Direction = null;

        static {
                androidx.constraintlayout.core.state.State$Direction[] r0 = androidx.constraintlayout.core.state.State.Direction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.core.state.helpers.BarrierReference.C01241.$SwitchMap$androidx$constraintlayout$core$state$State$Direction = r0
                androidx.constraintlayout.core.state.State$Direction r1 = androidx.constraintlayout.core.state.State.Direction.LEFT     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.constraintlayout.core.state.helpers.BarrierReference.C01241.$SwitchMap$androidx$constraintlayout$core$state$State$Direction     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.core.state.State$Direction r1 = androidx.constraintlayout.core.state.State.Direction.START     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.constraintlayout.core.state.helpers.BarrierReference.C01241.$SwitchMap$androidx$constraintlayout$core$state$State$Direction     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.core.state.State$Direction r1 = androidx.constraintlayout.core.state.State.Direction.RIGHT     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.constraintlayout.core.state.helpers.BarrierReference.C01241.$SwitchMap$androidx$constraintlayout$core$state$State$Direction     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.constraintlayout.core.state.State$Direction r1 = androidx.constraintlayout.core.state.State.Direction.END     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.constraintlayout.core.state.helpers.BarrierReference.C01241.$SwitchMap$androidx$constraintlayout$core$state$State$Direction     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.constraintlayout.core.state.State$Direction r1 = androidx.constraintlayout.core.state.State.Direction.TOP     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = androidx.constraintlayout.core.state.helpers.BarrierReference.C01241.$SwitchMap$androidx$constraintlayout$core$state$State$Direction     // Catch: java.lang.NoSuchFieldError -> L49
                androidx.constraintlayout.core.state.State$Direction r1 = androidx.constraintlayout.core.state.State.Direction.BOTTOM     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                return
        }
    }

    public BarrierReference(androidx.constraintlayout.core.state.State r2) {
            r1 = this;
            androidx.constraintlayout.core.state.State$Helper r0 = androidx.constraintlayout.core.state.State.Helper.BARRIER
            r1.<init>(r2, r0)
            return
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
            r3 = this;
            r3.getHelperWidget()
            int[] r0 = androidx.constraintlayout.core.state.helpers.BarrierReference.C01241.$SwitchMap$androidx$constraintlayout$core$state$State$Direction
            androidx.constraintlayout.core.state.State$Direction r1 = r3.mDirection
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 3
            if (r0 == r1) goto L1d
            r2 = 4
            if (r0 == r2) goto L1d
            r2 = 5
            if (r0 == r2) goto L1b
            r2 = 6
            if (r0 == r2) goto L1e
            r1 = 0
            goto L1e
        L1b:
            r1 = 2
            goto L1e
        L1d:
            r1 = 1
        L1e:
            androidx.constraintlayout.core.widgets.Barrier r0 = r3.mBarrierWidget
            r0.setBarrierType(r1)
            androidx.constraintlayout.core.widgets.Barrier r0 = r3.mBarrierWidget
            int r1 = r3.mMargin
            r0.setMargin(r1)
            return
    }

    @Override // androidx.constraintlayout.core.state.HelperReference
    public androidx.constraintlayout.core.widgets.HelperWidget getHelperWidget() {
            r1 = this;
            androidx.constraintlayout.core.widgets.Barrier r0 = r1.mBarrierWidget
            if (r0 != 0) goto Lb
            androidx.constraintlayout.core.widgets.Barrier r0 = new androidx.constraintlayout.core.widgets.Barrier
            r0.<init>()
            r1.mBarrierWidget = r0
        Lb:
            androidx.constraintlayout.core.widgets.Barrier r0 = r1.mBarrierWidget
            return r0
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference
    public androidx.constraintlayout.core.state.ConstraintReference margin(int r1) {
            r0 = this;
            r0.mMargin = r1
            return r0
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference
    public androidx.constraintlayout.core.state.ConstraintReference margin(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.core.state.State r0 = r1.mState
            int r2 = r0.convertDimension(r2)
            r1.margin(r2)
            return r1
    }

    public void setBarrierDirection(androidx.constraintlayout.core.state.State.Direction r1) {
            r0 = this;
            r0.mDirection = r1
            return
    }
}
