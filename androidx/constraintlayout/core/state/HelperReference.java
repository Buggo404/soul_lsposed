package androidx.constraintlayout.core.state;

/* loaded from: classes.dex */
public class HelperReference extends androidx.constraintlayout.core.state.ConstraintReference implements androidx.constraintlayout.core.state.helpers.Facade {
    private androidx.constraintlayout.core.widgets.HelperWidget mHelperWidget;
    protected java.util.ArrayList<java.lang.Object> mReferences;
    protected final androidx.constraintlayout.core.state.State mState;
    final androidx.constraintlayout.core.state.State.Helper mType;

    public HelperReference(androidx.constraintlayout.core.state.State r2, androidx.constraintlayout.core.state.State.Helper r3) {
            r1 = this;
            r1.<init>(r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mReferences = r0
            r1.mState = r2
            r1.mType = r3
            return
    }

    public androidx.constraintlayout.core.state.HelperReference add(java.lang.Object... r2) {
            r1 = this;
            java.util.ArrayList<java.lang.Object> r0 = r1.mReferences
            java.util.Collections.addAll(r0, r2)
            return r1
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
            r0 = this;
            return
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public androidx.constraintlayout.core.widgets.ConstraintWidget getConstraintWidget() {
            r1 = this;
            androidx.constraintlayout.core.widgets.HelperWidget r0 = r1.getHelperWidget()
            return r0
    }

    public androidx.constraintlayout.core.widgets.HelperWidget getHelperWidget() {
            r1 = this;
            androidx.constraintlayout.core.widgets.HelperWidget r0 = r1.mHelperWidget
            return r0
    }

    public androidx.constraintlayout.core.state.State.Helper getType() {
            r1 = this;
            androidx.constraintlayout.core.state.State$Helper r0 = r1.mType
            return r0
    }

    public void setHelperWidget(androidx.constraintlayout.core.widgets.HelperWidget r1) {
            r0 = this;
            r0.mHelperWidget = r1
            return
    }
}
