package androidx.transition;

/* loaded from: classes.dex */
class GhostViewPort extends android.view.ViewGroup implements androidx.transition.GhostView {
    private android.graphics.Matrix mMatrix;
    private final android.view.ViewTreeObserver.OnPreDrawListener mOnPreDrawListener;
    int mReferences;
    android.view.ViewGroup mStartParent;
    android.view.View mStartView;
    final android.view.View mView;


    GhostViewPort(android.view.View r2) {
            r1 = this;
            android.content.Context r0 = r2.getContext()
            r1.<init>(r0)
            androidx.transition.GhostViewPort$1 r0 = new androidx.transition.GhostViewPort$1
            r0.<init>(r1)
            r1.mOnPreDrawListener = r0
            r1.mView = r2
            r2 = 0
            r1.setWillNotDraw(r2)
            r2 = 2
            r0 = 0
            r1.setLayerType(r2, r0)
            return
    }

    static androidx.transition.GhostViewPort addGhost(android.view.View r4, android.view.ViewGroup r5, android.graphics.Matrix r6) {
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 == 0) goto L59
            androidx.transition.GhostViewHolder r0 = androidx.transition.GhostViewHolder.getHolder(r5)
            androidx.transition.GhostViewPort r1 = getGhostView(r4)
            if (r1 == 0) goto L21
            android.view.ViewParent r2 = r1.getParent()
            androidx.transition.GhostViewHolder r2 = (androidx.transition.GhostViewHolder) r2
            if (r2 == r0) goto L21
            int r3 = r1.mReferences
            r2.removeView(r1)
            r1 = 0
            goto L22
        L21:
            r3 = 0
        L22:
            if (r1 != 0) goto L4d
            if (r6 != 0) goto L2e
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            calculateMatrix(r4, r5, r6)
        L2e:
            androidx.transition.GhostViewPort r1 = new androidx.transition.GhostViewPort
            r1.<init>(r4)
            r1.setMatrix(r6)
            if (r0 != 0) goto L3e
            androidx.transition.GhostViewHolder r0 = new androidx.transition.GhostViewHolder
            r0.<init>(r5)
            goto L41
        L3e:
            r0.popToOverlayTop()
        L41:
            copySize(r5, r0)
            copySize(r5, r1)
            r0.addGhostView(r1)
            r1.mReferences = r3
            goto L52
        L4d:
            if (r6 == 0) goto L52
            r1.setMatrix(r6)
        L52:
            int r4 = r1.mReferences
            int r4 = r4 + 1
            r1.mReferences = r4
            return r1
        L59:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Ghosted views must be parented by a ViewGroup"
            r4.<init>(r5)
            throw r4
    }

    static void calculateMatrix(android.view.View r1, android.view.ViewGroup r2, android.graphics.Matrix r3) {
            android.view.ViewParent r1 = r1.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r3.reset()
            androidx.transition.ViewUtils.transformMatrixToGlobal(r1, r3)
            int r0 = r1.getScrollX()
            int r0 = -r0
            float r0 = (float) r0
            int r1 = r1.getScrollY()
            int r1 = -r1
            float r1 = (float) r1
            r3.preTranslate(r0, r1)
            androidx.transition.ViewUtils.transformMatrixToLocal(r2, r3)
            return
    }

    static void copySize(android.view.View r4, android.view.View r5) {
            int r0 = r5.getLeft()
            int r1 = r5.getTop()
            int r2 = r5.getLeft()
            int r3 = r4.getWidth()
            int r2 = r2 + r3
            int r3 = r5.getTop()
            int r4 = r4.getHeight()
            int r3 = r3 + r4
            androidx.transition.ViewUtils.setLeftTopRightBottom(r5, r0, r1, r2, r3)
            return
    }

    static androidx.transition.GhostViewPort getGhostView(android.view.View r1) {
            int r0 = androidx.transition.C0425R.id.ghost_view
            java.lang.Object r1 = r1.getTag(r0)
            androidx.transition.GhostViewPort r1 = (androidx.transition.GhostViewPort) r1
            return r1
    }

    static void removeGhost(android.view.View r1) {
            androidx.transition.GhostViewPort r1 = getGhostView(r1)
            if (r1 == 0) goto L17
            int r0 = r1.mReferences
            int r0 = r0 + (-1)
            r1.mReferences = r0
            if (r0 > 0) goto L17
            android.view.ViewParent r0 = r1.getParent()
            androidx.transition.GhostViewHolder r0 = (androidx.transition.GhostViewHolder) r0
            r0.removeView(r1)
        L17:
            return
    }

    static void setGhostView(android.view.View r1, androidx.transition.GhostViewPort r2) {
            int r0 = androidx.transition.C0425R.id.ghost_view
            r1.setTag(r0, r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            android.view.View r0 = r2.mView
            setGhostView(r0, r2)
            android.view.View r0 = r2.mView
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            android.view.ViewTreeObserver$OnPreDrawListener r1 = r2.mOnPreDrawListener
            r0.addOnPreDrawListener(r1)
            android.view.View r0 = r2.mView
            r1 = 4
            androidx.transition.ViewUtils.setTransitionVisibility(r0, r1)
            android.view.View r0 = r2.mView
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L2c
            android.view.View r0 = r2.mView
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            r0.invalidate()
        L2c:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r2 = this;
            android.view.View r0 = r2.mView
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            android.view.ViewTreeObserver$OnPreDrawListener r1 = r2.mOnPreDrawListener
            r0.removeOnPreDrawListener(r1)
            android.view.View r0 = r2.mView
            r1 = 0
            androidx.transition.ViewUtils.setTransitionVisibility(r0, r1)
            android.view.View r0 = r2.mView
            r1 = 0
            setGhostView(r0, r1)
            android.view.View r0 = r2.mView
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L2a
            android.view.View r0 = r2.mView
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            r0.invalidate()
        L2a:
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r5) {
            r4 = this;
            r0 = 1
            androidx.transition.CanvasUtils.enableZ(r5, r0)
            android.graphics.Matrix r0 = r4.mMatrix
            r5.setMatrix(r0)
            android.view.View r0 = r4.mView
            r1 = 0
            androidx.transition.ViewUtils.setTransitionVisibility(r0, r1)
            android.view.View r0 = r4.mView
            r0.invalidate()
            android.view.View r0 = r4.mView
            r2 = 4
            androidx.transition.ViewUtils.setTransitionVisibility(r0, r2)
            android.view.View r0 = r4.mView
            long r2 = r4.getDrawingTime()
            r4.drawChild(r5, r0, r2)
            androidx.transition.CanvasUtils.enableZ(r5, r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            return
    }

    @Override // androidx.transition.GhostView
    public void reserveEndViewTransition(android.view.ViewGroup r1, android.view.View r2) {
            r0 = this;
            r0.mStartParent = r1
            r0.mStartView = r2
            return
    }

    void setMatrix(android.graphics.Matrix r1) {
            r0 = this;
            r0.mMatrix = r1
            return
    }

    @Override // android.view.View, androidx.transition.GhostView
    public void setVisibility(int r2) {
            r1 = this;
            super.setVisibility(r2)
            android.view.View r0 = r1.mView
            androidx.transition.GhostViewPort r0 = getGhostView(r0)
            if (r0 != r1) goto L15
            if (r2 != 0) goto Lf
            r2 = 4
            goto L10
        Lf:
            r2 = 0
        L10:
            android.view.View r0 = r1.mView
            androidx.transition.ViewUtils.setTransitionVisibility(r0, r2)
        L15:
            return
    }
}
