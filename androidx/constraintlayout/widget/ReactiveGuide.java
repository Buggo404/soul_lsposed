package androidx.constraintlayout.widget;

/* loaded from: classes.dex */
public class ReactiveGuide extends android.view.View implements androidx.constraintlayout.widget.SharedValues.SharedValuesListener {
    private boolean mAnimateChange;
    private boolean mApplyToAllConstraintSets;
    private int mApplyToConstraintSetId;
    private int mAttributeId;

    public ReactiveGuide(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = -1
            r0.mAttributeId = r1
            r1 = 0
            r0.mAnimateChange = r1
            r0.mApplyToConstraintSetId = r1
            r1 = 1
            r0.mApplyToAllConstraintSets = r1
            r1 = 8
            super.setVisibility(r1)
            r1 = 0
            r0.init(r1)
            return
    }

    public ReactiveGuide(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = -1
            r0.mAttributeId = r1
            r1 = 0
            r0.mAnimateChange = r1
            r0.mApplyToConstraintSetId = r1
            r1 = 1
            r0.mApplyToAllConstraintSets = r1
            r1 = 8
            super.setVisibility(r1)
            r0.init(r2)
            return
    }

    public ReactiveGuide(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = -1
            r0.mAttributeId = r1
            r1 = 0
            r0.mAnimateChange = r1
            r0.mApplyToConstraintSetId = r1
            r1 = 1
            r0.mApplyToAllConstraintSets = r1
            r1 = 8
            super.setVisibility(r1)
            r0.init(r2)
            return
    }

    public ReactiveGuide(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = -1
            r0.mAttributeId = r1
            r1 = 0
            r0.mAnimateChange = r1
            r0.mApplyToConstraintSetId = r1
            r1 = 1
            r0.mApplyToAllConstraintSets = r1
            r1 = 8
            super.setVisibility(r1)
            r0.init(r2)
            return
    }

    private void changeValue(int r2, int r3, androidx.constraintlayout.motion.widget.MotionLayout r4, int r5) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintSet r0 = r4.getConstraintSet(r5)
            r0.setGuidelineEnd(r3, r2)
            r4.updateState(r5, r0)
            return
    }

    private void init(android.util.AttributeSet r5) {
            r4 = this;
            if (r5 == 0) goto L50
            android.content.Context r0 = r4.getContext()
            int[] r1 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_ReactiveGuide
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r1)
            int r0 = r5.getIndexCount()
            r1 = 0
        L11:
            if (r1 >= r0) goto L4d
            int r2 = r5.getIndex(r1)
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_valueId
            if (r2 != r3) goto L24
            int r3 = r4.mAttributeId
            int r2 = r5.getResourceId(r2, r3)
            r4.mAttributeId = r2
            goto L4a
        L24:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_animateChange
            if (r2 != r3) goto L31
            boolean r3 = r4.mAnimateChange
            boolean r2 = r5.getBoolean(r2, r3)
            r4.mAnimateChange = r2
            goto L4a
        L31:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.f62x2694048c
            if (r2 != r3) goto L3e
            int r3 = r4.mApplyToConstraintSetId
            int r2 = r5.getResourceId(r2, r3)
            r4.mApplyToConstraintSetId = r2
            goto L4a
        L3e:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.f61xfdeff96
            if (r2 != r3) goto L4a
            boolean r3 = r4.mApplyToAllConstraintSets
            boolean r2 = r5.getBoolean(r2, r3)
            r4.mApplyToAllConstraintSets = r2
        L4a:
            int r1 = r1 + 1
            goto L11
        L4d:
            r5.recycle()
        L50:
            int r5 = r4.mAttributeId
            r0 = -1
            if (r5 == r0) goto L5e
            androidx.constraintlayout.widget.SharedValues r5 = androidx.constraintlayout.widget.ConstraintLayout.getSharedValues()
            int r0 = r4.mAttributeId
            r5.addListener(r0, r4)
        L5e:
            return
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    public int getApplyToConstraintSetId() {
            r1 = this;
            int r0 = r1.mApplyToConstraintSetId
            return r0
    }

    public int getAttributeId() {
            r1 = this;
            int r0 = r1.mAttributeId
            return r0
    }

    public boolean isAnimatingChange() {
            r1 = this;
            boolean r0 = r1.mAnimateChange
            return r0
    }

    @Override // android.view.View
    protected void onMeasure(int r1, int r2) {
            r0 = this;
            r1 = 0
            r0.setMeasuredDimension(r1, r1)
            return
    }

    @Override // androidx.constraintlayout.widget.SharedValues.SharedValuesListener
    public void onNewValue(int r5, int r6, int r7) {
            r4 = this;
            r4.setGuidelineBegin(r6)
            int r5 = r4.getId()
            if (r5 > 0) goto La
            return
        La:
            android.view.ViewParent r7 = r4.getParent()
            boolean r7 = r7 instanceof androidx.constraintlayout.motion.widget.MotionLayout
            if (r7 == 0) goto L5e
            android.view.ViewParent r7 = r4.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r7 = (androidx.constraintlayout.motion.widget.MotionLayout) r7
            int r0 = r7.getCurrentState()
            int r1 = r4.mApplyToConstraintSetId
            if (r1 == 0) goto L21
            r0 = r1
        L21:
            boolean r1 = r4.mAnimateChange
            r2 = 0
            if (r1 == 0) goto L48
            boolean r1 = r4.mApplyToAllConstraintSets
            if (r1 == 0) goto L3b
            int[] r1 = r7.getConstraintSetIds()
        L2e:
            int r3 = r1.length
            if (r2 >= r3) goto L3b
            r3 = r1[r2]
            if (r3 == r0) goto L38
            r4.changeValue(r6, r5, r7, r3)
        L38:
            int r2 = r2 + 1
            goto L2e
        L3b:
            androidx.constraintlayout.widget.ConstraintSet r1 = r7.cloneConstraintSet(r0)
            r1.setGuidelineEnd(r5, r6)
            r5 = 1000(0x3e8, float:1.401E-42)
            r7.updateStateAnimate(r0, r1, r5)
            goto L5e
        L48:
            boolean r1 = r4.mApplyToAllConstraintSets
            if (r1 == 0) goto L5b
            int[] r0 = r7.getConstraintSetIds()
        L50:
            int r1 = r0.length
            if (r2 >= r1) goto L5e
            r1 = r0[r2]
            r4.changeValue(r6, r5, r7, r1)
            int r2 = r2 + 1
            goto L50
        L5b:
            r4.changeValue(r6, r5, r7, r0)
        L5e:
            return
    }

    public void setAnimateChange(boolean r1) {
            r0 = this;
            r0.mAnimateChange = r1
            return
    }

    public void setApplyToConstraintSetId(int r1) {
            r0 = this;
            r0.mApplyToConstraintSetId = r1
            return
    }

    public void setAttributeId(int r4) {
            r3 = this;
            androidx.constraintlayout.widget.SharedValues r0 = androidx.constraintlayout.widget.ConstraintLayout.getSharedValues()
            int r1 = r3.mAttributeId
            r2 = -1
            if (r1 == r2) goto Lc
            r0.removeListener(r1, r3)
        Lc:
            r3.mAttributeId = r4
            if (r4 == r2) goto L13
            r0.addListener(r4, r3)
        L13:
            return
    }

    public void setGuidelineBegin(int r2) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r0
            r0.guideBegin = r2
            r1.setLayoutParams(r0)
            return
    }

    public void setGuidelineEnd(int r2) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r0
            r0.guideEnd = r2
            r1.setLayoutParams(r0)
            return
    }

    public void setGuidelinePercent(float r2) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r0
            r0.guidePercent = r2
            r1.setLayoutParams(r0)
            return
    }

    @Override // android.view.View
    public void setVisibility(int r1) {
            r0 = this;
            return
    }
}
