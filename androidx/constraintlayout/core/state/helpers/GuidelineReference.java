package androidx.constraintlayout.core.state.helpers;

/* loaded from: classes.dex */
public class GuidelineReference implements androidx.constraintlayout.core.state.helpers.Facade, androidx.constraintlayout.core.state.Reference {
    private java.lang.Object key;
    private int mEnd;
    private androidx.constraintlayout.core.widgets.Guideline mGuidelineWidget;
    private int mOrientation;
    private float mPercent;
    private int mStart;
    final androidx.constraintlayout.core.state.State mState;

    public GuidelineReference(androidx.constraintlayout.core.state.State r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mStart = r0
            r1.mEnd = r0
            r0 = 0
            r1.mPercent = r0
            r1.mState = r2
            return
    }

    @Override // androidx.constraintlayout.core.state.helpers.Facade, androidx.constraintlayout.core.state.Reference
    public void apply() {
            r2 = this;
            androidx.constraintlayout.core.widgets.Guideline r0 = r2.mGuidelineWidget
            int r1 = r2.mOrientation
            r0.setOrientation(r1)
            int r0 = r2.mStart
            r1 = -1
            if (r0 == r1) goto L12
            androidx.constraintlayout.core.widgets.Guideline r1 = r2.mGuidelineWidget
            r1.setGuideBegin(r0)
            goto L23
        L12:
            int r0 = r2.mEnd
            if (r0 == r1) goto L1c
            androidx.constraintlayout.core.widgets.Guideline r1 = r2.mGuidelineWidget
            r1.setGuideEnd(r0)
            goto L23
        L1c:
            androidx.constraintlayout.core.widgets.Guideline r0 = r2.mGuidelineWidget
            float r1 = r2.mPercent
            r0.setGuidePercent(r1)
        L23:
            return
    }

    public androidx.constraintlayout.core.state.helpers.GuidelineReference end(java.lang.Object r2) {
            r1 = this;
            r0 = -1
            r1.mStart = r0
            androidx.constraintlayout.core.state.State r0 = r1.mState
            int r2 = r0.convertDimension(r2)
            r1.mEnd = r2
            r2 = 0
            r1.mPercent = r2
            return r1
    }

    @Override // androidx.constraintlayout.core.state.helpers.Facade, androidx.constraintlayout.core.state.Reference
    public androidx.constraintlayout.core.widgets.ConstraintWidget getConstraintWidget() {
            r1 = this;
            androidx.constraintlayout.core.widgets.Guideline r0 = r1.mGuidelineWidget
            if (r0 != 0) goto Lb
            androidx.constraintlayout.core.widgets.Guideline r0 = new androidx.constraintlayout.core.widgets.Guideline
            r0.<init>()
            r1.mGuidelineWidget = r0
        Lb:
            androidx.constraintlayout.core.widgets.Guideline r0 = r1.mGuidelineWidget
            return r0
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public androidx.constraintlayout.core.state.helpers.Facade getFacade() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public java.lang.Object getKey() {
            r1 = this;
            java.lang.Object r0 = r1.key
            return r0
    }

    public int getOrientation() {
            r1 = this;
            int r0 = r1.mOrientation
            return r0
    }

    public androidx.constraintlayout.core.state.helpers.GuidelineReference percent(float r2) {
            r1 = this;
            r0 = -1
            r1.mStart = r0
            r1.mEnd = r0
            r1.mPercent = r2
            return r1
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void setConstraintWidget(androidx.constraintlayout.core.widgets.ConstraintWidget r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r0 == 0) goto L9
            androidx.constraintlayout.core.widgets.Guideline r2 = (androidx.constraintlayout.core.widgets.Guideline) r2
            r1.mGuidelineWidget = r2
            goto Lc
        L9:
            r2 = 0
            r1.mGuidelineWidget = r2
        Lc:
            return
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void setKey(java.lang.Object r1) {
            r0 = this;
            r0.key = r1
            return
    }

    public void setOrientation(int r1) {
            r0 = this;
            r0.mOrientation = r1
            return
    }

    public androidx.constraintlayout.core.state.helpers.GuidelineReference start(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.core.state.State r0 = r1.mState
            int r2 = r0.convertDimension(r2)
            r1.mStart = r2
            r2 = -1
            r1.mEnd = r2
            r2 = 0
            r1.mPercent = r2
            return r1
    }
}
