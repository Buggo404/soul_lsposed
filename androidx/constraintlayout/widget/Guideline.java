package androidx.constraintlayout.widget;

/* loaded from: classes.dex */
public class Guideline extends android.view.View {
    private boolean mFilterRedundantCalls;

    public Guideline(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.mFilterRedundantCalls = r1
            r1 = 8
            super.setVisibility(r1)
            return
    }

    public Guideline(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 1
            r0.mFilterRedundantCalls = r1
            r1 = 8
            super.setVisibility(r1)
            return
    }

    public Guideline(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 1
            r0.mFilterRedundantCalls = r1
            r1 = 8
            super.setVisibility(r1)
            return
    }

    public Guideline(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 1
            r0.mFilterRedundantCalls = r1
            r1 = 8
            super.setVisibility(r1)
            return
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r1, int r2) {
            r0 = this;
            r1 = 0
            r0.setMeasuredDimension(r1, r1)
            return
    }

    public void setFilterRedundantCalls(boolean r1) {
            r0 = this;
            r0.mFilterRedundantCalls = r1
            return
    }

    public void setGuidelineBegin(int r3) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r0
            boolean r1 = r2.mFilterRedundantCalls
            if (r1 == 0) goto Lf
            int r1 = r0.guideBegin
            if (r1 != r3) goto Lf
            return
        Lf:
            r0.guideBegin = r3
            r2.setLayoutParams(r0)
            return
    }

    public void setGuidelineEnd(int r3) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r0
            boolean r1 = r2.mFilterRedundantCalls
            if (r1 == 0) goto Lf
            int r1 = r0.guideEnd
            if (r1 != r3) goto Lf
            return
        Lf:
            r0.guideEnd = r3
            r2.setLayoutParams(r0)
            return
    }

    public void setGuidelinePercent(float r3) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r0
            boolean r1 = r2.mFilterRedundantCalls
            if (r1 == 0) goto L11
            float r1 = r0.guidePercent
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L11
            return
        L11:
            r0.guidePercent = r3
            r2.setLayoutParams(r0)
            return
    }

    @Override // android.view.View
    public void setVisibility(int r1) {
            r0 = this;
            return
    }
}
