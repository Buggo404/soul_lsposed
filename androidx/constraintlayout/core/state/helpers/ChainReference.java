package androidx.constraintlayout.core.state.helpers;

/* loaded from: classes.dex */
public class ChainReference extends androidx.constraintlayout.core.state.HelperReference {
    protected float mBias;
    protected androidx.constraintlayout.core.state.State.Chain mStyle;

    public ChainReference(androidx.constraintlayout.core.state.State r1, androidx.constraintlayout.core.state.State.Helper r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.mBias = r1
            androidx.constraintlayout.core.state.State$Chain r1 = androidx.constraintlayout.core.state.State.Chain.SPREAD
            r0.mStyle = r1
            return
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference
    public /* bridge */ /* synthetic */ androidx.constraintlayout.core.state.ConstraintReference bias(float r1) {
            r0 = this;
            androidx.constraintlayout.core.state.helpers.ChainReference r1 = r0.bias(r1)
            return r1
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference
    public androidx.constraintlayout.core.state.helpers.ChainReference bias(float r1) {
            r0 = this;
            r0.mBias = r1
            return r0
    }

    public float getBias() {
            r1 = this;
            float r0 = r1.mBias
            return r0
    }

    public androidx.constraintlayout.core.state.State.Chain getStyle() {
            r1 = this;
            androidx.constraintlayout.core.state.State$Chain r0 = androidx.constraintlayout.core.state.State.Chain.SPREAD
            return r0
    }

    public androidx.constraintlayout.core.state.helpers.ChainReference style(androidx.constraintlayout.core.state.State.Chain r1) {
            r0 = this;
            r0.mStyle = r1
            return r0
    }
}
