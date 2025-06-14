package androidx.transition;

/* loaded from: classes.dex */
public class ChangeBounds extends androidx.transition.Transition {
    private static final android.util.Property<android.view.View, android.graphics.PointF> BOTTOM_RIGHT_ONLY_PROPERTY = null;
    private static final android.util.Property<androidx.transition.ChangeBounds.ViewBounds, android.graphics.PointF> BOTTOM_RIGHT_PROPERTY = null;
    private static final android.util.Property<android.graphics.drawable.Drawable, android.graphics.PointF> DRAWABLE_ORIGIN_PROPERTY = null;
    private static final android.util.Property<android.view.View, android.graphics.PointF> POSITION_PROPERTY = null;
    private static final java.lang.String PROPNAME_BOUNDS = "android:changeBounds:bounds";
    private static final java.lang.String PROPNAME_CLIP = "android:changeBounds:clip";
    private static final java.lang.String PROPNAME_PARENT = "android:changeBounds:parent";
    private static final java.lang.String PROPNAME_WINDOW_X = "android:changeBounds:windowX";
    private static final java.lang.String PROPNAME_WINDOW_Y = "android:changeBounds:windowY";
    private static final android.util.Property<android.view.View, android.graphics.PointF> TOP_LEFT_ONLY_PROPERTY = null;
    private static final android.util.Property<androidx.transition.ChangeBounds.ViewBounds, android.graphics.PointF> TOP_LEFT_PROPERTY = null;
    private static androidx.transition.RectEvaluator sRectEvaluator;
    private static final java.lang.String[] sTransitionProperties = null;
    private boolean mReparent;
    private boolean mResizeClip;
    private int[] mTempLocation;











    private static class ViewBounds {
        private int mBottom;
        private int mBottomRightCalls;
        private int mLeft;
        private int mRight;
        private int mTop;
        private int mTopLeftCalls;
        private android.view.View mView;

        ViewBounds(android.view.View r1) {
                r0 = this;
                r0.<init>()
                r0.mView = r1
                return
        }

        private void setLeftTopRightBottom() {
                r5 = this;
                android.view.View r0 = r5.mView
                int r1 = r5.mLeft
                int r2 = r5.mTop
                int r3 = r5.mRight
                int r4 = r5.mBottom
                androidx.transition.ViewUtils.setLeftTopRightBottom(r0, r1, r2, r3, r4)
                r0 = 0
                r5.mTopLeftCalls = r0
                r5.mBottomRightCalls = r0
                return
        }

        void setBottomRight(android.graphics.PointF r2) {
                r1 = this;
                float r0 = r2.x
                int r0 = java.lang.Math.round(r0)
                r1.mRight = r0
                float r2 = r2.y
                int r2 = java.lang.Math.round(r2)
                r1.mBottom = r2
                int r2 = r1.mBottomRightCalls
                int r2 = r2 + 1
                r1.mBottomRightCalls = r2
                int r0 = r1.mTopLeftCalls
                if (r0 != r2) goto L1d
                r1.setLeftTopRightBottom()
            L1d:
                return
        }

        void setTopLeft(android.graphics.PointF r2) {
                r1 = this;
                float r0 = r2.x
                int r0 = java.lang.Math.round(r0)
                r1.mLeft = r0
                float r2 = r2.y
                int r2 = java.lang.Math.round(r2)
                r1.mTop = r2
                int r2 = r1.mTopLeftCalls
                int r2 = r2 + 1
                r1.mTopLeftCalls = r2
                int r0 = r1.mBottomRightCalls
                if (r2 != r0) goto L1d
                r1.setLeftTopRightBottom()
            L1d:
                return
        }
    }

    static {
            java.lang.String r0 = "android:changeBounds:windowX"
            java.lang.String r1 = "android:changeBounds:windowY"
            java.lang.String r2 = "android:changeBounds:bounds"
            java.lang.String r3 = "android:changeBounds:clip"
            java.lang.String r4 = "android:changeBounds:parent"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r0, r1}
            androidx.transition.ChangeBounds.sTransitionProperties = r0
            androidx.transition.ChangeBounds$1 r0 = new androidx.transition.ChangeBounds$1
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            java.lang.String r2 = "boundsOrigin"
            r0.<init>(r1, r2)
            androidx.transition.ChangeBounds.DRAWABLE_ORIGIN_PROPERTY = r0
            androidx.transition.ChangeBounds$2 r0 = new androidx.transition.ChangeBounds$2
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            java.lang.String r2 = "topLeft"
            r0.<init>(r1, r2)
            androidx.transition.ChangeBounds.TOP_LEFT_PROPERTY = r0
            androidx.transition.ChangeBounds$3 r0 = new androidx.transition.ChangeBounds$3
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            java.lang.String r3 = "bottomRight"
            r0.<init>(r1, r3)
            androidx.transition.ChangeBounds.BOTTOM_RIGHT_PROPERTY = r0
            androidx.transition.ChangeBounds$4 r0 = new androidx.transition.ChangeBounds$4
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            r0.<init>(r1, r3)
            androidx.transition.ChangeBounds.BOTTOM_RIGHT_ONLY_PROPERTY = r0
            androidx.transition.ChangeBounds$5 r0 = new androidx.transition.ChangeBounds$5
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            r0.<init>(r1, r2)
            androidx.transition.ChangeBounds.TOP_LEFT_ONLY_PROPERTY = r0
            androidx.transition.ChangeBounds$6 r0 = new androidx.transition.ChangeBounds$6
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            java.lang.String r2 = "position"
            r0.<init>(r1, r2)
            androidx.transition.ChangeBounds.POSITION_PROPERTY = r0
            androidx.transition.RectEvaluator r0 = new androidx.transition.RectEvaluator
            r0.<init>()
            androidx.transition.ChangeBounds.sRectEvaluator = r0
            return
    }

    public ChangeBounds() {
            r1 = this;
            r1.<init>()
            r0 = 2
            int[] r0 = new int[r0]
            r1.mTempLocation = r0
            r0 = 0
            r1.mResizeClip = r0
            r1.mReparent = r0
            return
    }

    public ChangeBounds(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            r0 = 2
            int[] r0 = new int[r0]
            r2.mTempLocation = r0
            r0 = 0
            r2.mResizeClip = r0
            r2.mReparent = r0
            int[] r1 = androidx.transition.Styleable.CHANGE_BOUNDS
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r1)
            android.content.res.XmlResourceParser r4 = (android.content.res.XmlResourceParser) r4
            java.lang.String r1 = "resizeClip"
            boolean r4 = androidx.core.content.res.TypedArrayUtils.getNamedBoolean(r3, r4, r1, r0, r0)
            r3.recycle()
            r2.setResizeClip(r4)
            return
    }

    private void captureValues(androidx.transition.TransitionValues r8) {
            r7 = this;
            android.view.View r0 = r8.view
            boolean r1 = androidx.core.view.ViewCompat.isLaidOut(r0)
            if (r1 != 0) goto L14
            int r1 = r0.getWidth()
            if (r1 != 0) goto L14
            int r1 = r0.getHeight()
            if (r1 == 0) goto L77
        L14:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.values
            android.graphics.Rect r2 = new android.graphics.Rect
            int r3 = r0.getLeft()
            int r4 = r0.getTop()
            int r5 = r0.getRight()
            int r6 = r0.getBottom()
            r2.<init>(r3, r4, r5, r6)
            java.lang.String r3 = "android:changeBounds:bounds"
            r1.put(r3, r2)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.values
            android.view.View r2 = r8.view
            android.view.ViewParent r2 = r2.getParent()
            java.lang.String r3 = "android:changeBounds:parent"
            r1.put(r3, r2)
            boolean r1 = r7.mReparent
            if (r1 == 0) goto L68
            android.view.View r1 = r8.view
            int[] r2 = r7.mTempLocation
            r1.getLocationInWindow(r2)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.values
            int[] r2 = r7.mTempLocation
            r3 = 0
            r2 = r2[r3]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "android:changeBounds:windowX"
            r1.put(r3, r2)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.values
            int[] r2 = r7.mTempLocation
            r3 = 1
            r2 = r2[r3]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "android:changeBounds:windowY"
            r1.put(r3, r2)
        L68:
            boolean r1 = r7.mResizeClip
            if (r1 == 0) goto L77
            java.util.Map<java.lang.String, java.lang.Object> r8 = r8.values
            java.lang.String r1 = "android:changeBounds:clip"
            android.graphics.Rect r0 = androidx.core.view.ViewCompat.getClipBounds(r0)
            r8.put(r1, r0)
        L77:
            return
    }

    private boolean parentMatches(android.view.View r4, android.view.View r5) {
            r3 = this;
            boolean r0 = r3.mReparent
            r1 = 1
            if (r0 == 0) goto L15
            androidx.transition.TransitionValues r0 = r3.getMatchedTransitionValues(r4, r1)
            r2 = 0
            if (r0 != 0) goto L11
            if (r4 != r5) goto Lf
            goto L15
        Lf:
            r1 = r2
            goto L15
        L11:
            android.view.View r4 = r0.view
            if (r5 != r4) goto Lf
        L15:
            return r1
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(androidx.transition.TransitionValues r1) {
            r0 = this;
            r0.captureValues(r1)
            return
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(androidx.transition.TransitionValues r1) {
            r0 = this;
            r0.captureValues(r1)
            return
    }

    @Override // androidx.transition.Transition
    public android.animation.Animator createAnimator(android.view.ViewGroup r19, androidx.transition.TransitionValues r20, androidx.transition.TransitionValues r21) {
            r18 = this;
            r8 = r18
            r0 = r20
            r1 = r21
            if (r0 == 0) goto L25d
            if (r1 != 0) goto Lc
            goto L25d
        Lc:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r0.values
            java.util.Map<java.lang.String, java.lang.Object> r4 = r1.values
            java.lang.String r5 = "android:changeBounds:parent"
            java.lang.Object r3 = r3.get(r5)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            java.lang.Object r4 = r4.get(r5)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            if (r3 == 0) goto L25b
            if (r4 != 0) goto L24
            goto L25b
        L24:
            android.view.View r9 = r1.view
            boolean r3 = r8.parentMatches(r3, r4)
            if (r3 == 0) goto L1b7
            java.util.Map<java.lang.String, java.lang.Object> r3 = r0.values
            java.lang.String r5 = "android:changeBounds:bounds"
            java.lang.Object r3 = r3.get(r5)
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            java.util.Map<java.lang.String, java.lang.Object> r6 = r1.values
            java.lang.Object r5 = r6.get(r5)
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            int r6 = r3.left
            int r7 = r5.left
            int r11 = r3.top
            int r12 = r5.top
            int r13 = r3.right
            int r14 = r5.right
            int r3 = r3.bottom
            int r15 = r5.bottom
            int r5 = r13 - r6
            int r2 = r3 - r11
            int r10 = r14 - r7
            int r4 = r15 - r12
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.values
            r16 = r9
            java.lang.String r9 = "android:changeBounds:clip"
            java.lang.Object r0 = r0.get(r9)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.values
            java.lang.Object r1 = r1.get(r9)
            r9 = r1
            android.graphics.Rect r9 = (android.graphics.Rect) r9
            if (r5 == 0) goto L6f
            if (r2 != 0) goto L73
        L6f:
            if (r10 == 0) goto L82
            if (r4 == 0) goto L82
        L73:
            if (r6 != r7) goto L7a
            if (r11 == r12) goto L78
            goto L7a
        L78:
            r1 = 0
            goto L7b
        L7a:
            r1 = 1
        L7b:
            if (r13 != r14) goto L7f
            if (r3 == r15) goto L83
        L7f:
            int r1 = r1 + 1
            goto L83
        L82:
            r1 = 0
        L83:
            if (r0 == 0) goto L8b
            boolean r17 = r0.equals(r9)
            if (r17 == 0) goto L8f
        L8b:
            if (r0 != 0) goto L91
            if (r9 == 0) goto L91
        L8f:
            int r1 = r1 + 1
        L91:
            if (r1 <= 0) goto L1f0
            r19 = r9
            boolean r9 = r8.mResizeClip
            r20 = r0
            r0 = 2
            if (r9 != 0) goto L12c
            r9 = r16
            androidx.transition.ViewUtils.setLeftTopRightBottom(r9, r6, r11, r13, r3)
            if (r1 != r0) goto Lff
            if (r5 != r10) goto Lbb
            if (r2 != r4) goto Lbb
            androidx.transition.PathMotion r0 = r18.getPathMotion()
            float r1 = (float) r6
            float r2 = (float) r11
            float r3 = (float) r7
            float r4 = (float) r12
            android.graphics.Path r0 = r0.getPath(r1, r2, r3, r4)
            android.util.Property<android.view.View, android.graphics.PointF> r1 = androidx.transition.ChangeBounds.POSITION_PROPERTY
            android.animation.ObjectAnimator r0 = androidx.transition.ObjectAnimatorUtils.ofPointF(r9, r1, r0)
            goto L19c
        Lbb:
            androidx.transition.ChangeBounds$ViewBounds r1 = new androidx.transition.ChangeBounds$ViewBounds
            r1.<init>(r9)
            androidx.transition.PathMotion r2 = r18.getPathMotion()
            float r4 = (float) r6
            float r5 = (float) r11
            float r6 = (float) r7
            float r7 = (float) r12
            android.graphics.Path r2 = r2.getPath(r4, r5, r6, r7)
            android.util.Property<androidx.transition.ChangeBounds$ViewBounds, android.graphics.PointF> r4 = androidx.transition.ChangeBounds.TOP_LEFT_PROPERTY
            android.animation.ObjectAnimator r2 = androidx.transition.ObjectAnimatorUtils.ofPointF(r1, r4, r2)
            androidx.transition.PathMotion r4 = r18.getPathMotion()
            float r5 = (float) r13
            float r3 = (float) r3
            float r6 = (float) r14
            float r7 = (float) r15
            android.graphics.Path r3 = r4.getPath(r5, r3, r6, r7)
            android.util.Property<androidx.transition.ChangeBounds$ViewBounds, android.graphics.PointF> r4 = androidx.transition.ChangeBounds.BOTTOM_RIGHT_PROPERTY
            android.animation.ObjectAnimator r3 = androidx.transition.ObjectAnimatorUtils.ofPointF(r1, r4, r3)
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            android.animation.Animator[] r0 = new android.animation.Animator[r0]
            r5 = 0
            r0[r5] = r2
            r2 = 1
            r0[r2] = r3
            r4.playTogether(r0)
            androidx.transition.ChangeBounds$7 r0 = new androidx.transition.ChangeBounds$7
            r0.<init>(r8, r1)
            r4.addListener(r0)
            r0 = r4
            goto L19c
        Lff:
            if (r6 != r7) goto L118
            if (r11 == r12) goto L104
            goto L118
        L104:
            androidx.transition.PathMotion r0 = r18.getPathMotion()
            float r1 = (float) r13
            float r2 = (float) r3
            float r3 = (float) r14
            float r4 = (float) r15
            android.graphics.Path r0 = r0.getPath(r1, r2, r3, r4)
            android.util.Property<android.view.View, android.graphics.PointF> r1 = androidx.transition.ChangeBounds.BOTTOM_RIGHT_ONLY_PROPERTY
            android.animation.ObjectAnimator r0 = androidx.transition.ObjectAnimatorUtils.ofPointF(r9, r1, r0)
            goto L19c
        L118:
            androidx.transition.PathMotion r0 = r18.getPathMotion()
            float r1 = (float) r6
            float r2 = (float) r11
            float r3 = (float) r7
            float r4 = (float) r12
            android.graphics.Path r0 = r0.getPath(r1, r2, r3, r4)
            android.util.Property<android.view.View, android.graphics.PointF> r1 = androidx.transition.ChangeBounds.TOP_LEFT_ONLY_PROPERTY
            android.animation.ObjectAnimator r0 = androidx.transition.ObjectAnimatorUtils.ofPointF(r9, r1, r0)
            goto L19c
        L12c:
            r9 = r16
            int r1 = java.lang.Math.max(r5, r10)
            int r3 = java.lang.Math.max(r2, r4)
            int r1 = r1 + r6
            int r3 = r3 + r11
            androidx.transition.ViewUtils.setLeftTopRightBottom(r9, r6, r11, r1, r3)
            if (r6 != r7) goto L142
            if (r11 == r12) goto L140
            goto L142
        L140:
            r11 = 0
            goto L155
        L142:
            androidx.transition.PathMotion r1 = r18.getPathMotion()
            float r3 = (float) r6
            float r6 = (float) r11
            float r11 = (float) r7
            float r13 = (float) r12
            android.graphics.Path r1 = r1.getPath(r3, r6, r11, r13)
            android.util.Property<android.view.View, android.graphics.PointF> r3 = androidx.transition.ChangeBounds.POSITION_PROPERTY
            android.animation.ObjectAnimator r1 = androidx.transition.ObjectAnimatorUtils.ofPointF(r9, r3, r1)
            r11 = r1
        L155:
            if (r20 != 0) goto L15e
            android.graphics.Rect r1 = new android.graphics.Rect
            r3 = 0
            r1.<init>(r3, r3, r5, r2)
            goto L161
        L15e:
            r3 = 0
            r1 = r20
        L161:
            if (r19 != 0) goto L169
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r3, r3, r10, r4)
            goto L16b
        L169:
            r2 = r19
        L16b:
            boolean r4 = r1.equals(r2)
            if (r4 != 0) goto L197
            androidx.core.view.ViewCompat.setClipBounds(r9, r1)
            androidx.transition.RectEvaluator r4 = androidx.transition.ChangeBounds.sRectEvaluator
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r3] = r1
            r1 = 1
            r0[r1] = r2
            java.lang.String r1 = "clipBounds"
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofObject(r9, r1, r4, r0)
            androidx.transition.ChangeBounds$8 r13 = new androidx.transition.ChangeBounds$8
            r0 = r13
            r1 = r18
            r2 = r9
            r3 = r19
            r4 = r7
            r5 = r12
            r6 = r14
            r7 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10.addListener(r13)
            r2 = r10
            goto L198
        L197:
            r2 = 0
        L198:
            android.animation.Animator r0 = androidx.transition.TransitionUtils.mergeAnimators(r11, r2)
        L19c:
            android.view.ViewParent r1 = r9.getParent()
            boolean r1 = r1 instanceof android.view.ViewGroup
            if (r1 == 0) goto L1b6
            android.view.ViewParent r1 = r9.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r2 = 1
            androidx.transition.ViewGroupUtils.suppressLayout(r1, r2)
            androidx.transition.ChangeBounds$9 r2 = new androidx.transition.ChangeBounds$9
            r2.<init>(r8, r1)
            r8.addListener(r2)
        L1b6:
            return r0
        L1b7:
            java.util.Map<java.lang.String, java.lang.Object> r2 = r0.values
            java.lang.String r3 = "android:changeBounds:windowX"
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.values
            java.lang.String r4 = "android:changeBounds:windowY"
            java.lang.Object r0 = r0.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.util.Map<java.lang.String, java.lang.Object> r5 = r1.values
            java.lang.Object r3 = r5.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.values
            java.lang.Object r1 = r1.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r2 != r3) goto L1f2
            if (r0 == r1) goto L1f0
            goto L1f2
        L1f0:
            r0 = 0
            return r0
        L1f2:
            int[] r4 = r8.mTempLocation
            r5 = r19
            r5.getLocationInWindow(r4)
            int r4 = r9.getWidth()
            int r6 = r9.getHeight()
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r6, r7)
            android.graphics.Canvas r6 = new android.graphics.Canvas
            r6.<init>(r4)
            r9.draw(r6)
            android.graphics.drawable.BitmapDrawable r6 = new android.graphics.drawable.BitmapDrawable
            r6.<init>(r4)
            float r7 = androidx.transition.ViewUtils.getTransitionAlpha(r9)
            r4 = 0
            androidx.transition.ViewUtils.setTransitionAlpha(r9, r4)
            androidx.transition.ViewOverlayImpl r4 = androidx.transition.ViewUtils.getOverlay(r19)
            r4.add(r6)
            androidx.transition.PathMotion r4 = r18.getPathMotion()
            int[] r10 = r8.mTempLocation
            r11 = 0
            r12 = r10[r11]
            int r2 = r2 - r12
            float r2 = (float) r2
            r11 = 1
            r10 = r10[r11]
            int r0 = r0 - r10
            float r0 = (float) r0
            int r3 = r3 - r12
            float r3 = (float) r3
            int r1 = r1 - r10
            float r1 = (float) r1
            android.graphics.Path r0 = r4.getPath(r2, r0, r3, r1)
            android.util.Property<android.graphics.drawable.Drawable, android.graphics.PointF> r1 = androidx.transition.ChangeBounds.DRAWABLE_ORIGIN_PROPERTY
            android.animation.PropertyValuesHolder r0 = androidx.transition.PropertyValuesHolderUtils.ofPointF(r1, r0)
            android.animation.PropertyValuesHolder[] r1 = new android.animation.PropertyValuesHolder[r11]
            r2 = 0
            r1[r2] = r0
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r6, r1)
            androidx.transition.ChangeBounds$10 r11 = new androidx.transition.ChangeBounds$10
            r0 = r11
            r1 = r18
            r2 = r19
            r3 = r6
            r4 = r9
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r10.addListener(r11)
            return r10
        L25b:
            r0 = 0
            return r0
        L25d:
            r0 = 0
            return r0
    }

    public boolean getResizeClip() {
            r1 = this;
            boolean r0 = r1.mResizeClip
            return r0
    }

    @Override // androidx.transition.Transition
    public java.lang.String[] getTransitionProperties() {
            r1 = this;
            java.lang.String[] r0 = androidx.transition.ChangeBounds.sTransitionProperties
            return r0
    }

    public void setResizeClip(boolean r1) {
            r0 = this;
            r0.mResizeClip = r1
            return
    }
}
