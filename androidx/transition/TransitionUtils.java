package androidx.transition;

/* loaded from: classes.dex */
class TransitionUtils {
    private static final boolean HAS_IS_ATTACHED_TO_WINDOW = false;
    private static final boolean HAS_OVERLAY = false;
    private static final boolean HAS_PICTURE_BITMAP = false;
    private static final int MAX_IMAGE_SIZE = 1048576;

    static class MatrixEvaluator implements android.animation.TypeEvaluator<android.graphics.Matrix> {
        final float[] mTempEndValues;
        final android.graphics.Matrix mTempMatrix;
        final float[] mTempStartValues;

        MatrixEvaluator() {
                r2 = this;
                r2.<init>()
                r0 = 9
                float[] r1 = new float[r0]
                r2.mTempStartValues = r1
                float[] r0 = new float[r0]
                r2.mTempEndValues = r0
                android.graphics.Matrix r0 = new android.graphics.Matrix
                r0.<init>()
                r2.mTempMatrix = r0
                return
        }

        /* renamed from: evaluate, reason: avoid collision after fix types in other method */
        public android.graphics.Matrix evaluate2(float r3, android.graphics.Matrix r4, android.graphics.Matrix r5) {
                r2 = this;
                float[] r0 = r2.mTempStartValues
                r4.getValues(r0)
                float[] r4 = r2.mTempEndValues
                r5.getValues(r4)
                r4 = 0
            Lb:
                r5 = 9
                if (r4 >= r5) goto L1f
                float[] r5 = r2.mTempEndValues
                r0 = r5[r4]
                float[] r1 = r2.mTempStartValues
                r1 = r1[r4]
                float r0 = r0 - r1
                float r0 = r0 * r3
                float r1 = r1 + r0
                r5[r4] = r1
                int r4 = r4 + 1
                goto Lb
            L1f:
                android.graphics.Matrix r3 = r2.mTempMatrix
                float[] r4 = r2.mTempEndValues
                r3.setValues(r4)
                android.graphics.Matrix r3 = r2.mTempMatrix
                return r3
        }

        @Override // android.animation.TypeEvaluator
        public /* bridge */ /* synthetic */ android.graphics.Matrix evaluate(float r1, android.graphics.Matrix r2, android.graphics.Matrix r3) {
                r0 = this;
                android.graphics.Matrix r2 = (android.graphics.Matrix) r2
                android.graphics.Matrix r3 = (android.graphics.Matrix) r3
                android.graphics.Matrix r1 = r0.evaluate2(r1, r2, r3)
                return r1
        }
    }

    static {
            r0 = 1
            androidx.transition.TransitionUtils.HAS_IS_ATTACHED_TO_WINDOW = r0
            androidx.transition.TransitionUtils.HAS_OVERLAY = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto Lc
            goto Ld
        Lc:
            r0 = 0
        Ld:
            androidx.transition.TransitionUtils.HAS_PICTURE_BITMAP = r0
            return
    }

    private TransitionUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static android.view.View copyViewImage(android.view.ViewGroup r7, android.view.View r8, android.view.View r9) {
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            int r1 = r9.getScrollX()
            int r1 = -r1
            float r1 = (float) r1
            int r9 = r9.getScrollY()
            int r9 = -r9
            float r9 = (float) r9
            r0.setTranslate(r1, r9)
            androidx.transition.ViewUtils.transformMatrixToGlobal(r8, r0)
            androidx.transition.ViewUtils.transformMatrixToLocal(r7, r0)
            android.graphics.RectF r9 = new android.graphics.RectF
            int r1 = r8.getWidth()
            float r1 = (float) r1
            int r2 = r8.getHeight()
            float r2 = (float) r2
            r3 = 0
            r9.<init>(r3, r3, r1, r2)
            r0.mapRect(r9)
            float r1 = r9.left
            int r1 = java.lang.Math.round(r1)
            float r2 = r9.top
            int r2 = java.lang.Math.round(r2)
            float r3 = r9.right
            int r3 = java.lang.Math.round(r3)
            float r4 = r9.bottom
            int r4 = java.lang.Math.round(r4)
            android.widget.ImageView r5 = new android.widget.ImageView
            android.content.Context r6 = r8.getContext()
            r5.<init>(r6)
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.CENTER_CROP
            r5.setScaleType(r6)
            android.graphics.Bitmap r7 = createViewBitmap(r8, r0, r9, r7)
            if (r7 == 0) goto L5c
            r5.setImageBitmap(r7)
        L5c:
            int r7 = r3 - r1
            r8 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
            int r9 = r4 - r2
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r8)
            r5.measure(r7, r8)
            r5.layout(r1, r2, r3, r4)
            return r5
    }

    private static android.graphics.Bitmap createViewBitmap(android.view.View r8, android.graphics.Matrix r9, android.graphics.RectF r10, android.view.ViewGroup r11) {
            boolean r0 = androidx.transition.TransitionUtils.HAS_IS_ATTACHED_TO_WINDOW
            r1 = 0
            if (r0 == 0) goto L14
            boolean r0 = r8.isAttachedToWindow()
            r0 = r0 ^ 1
            if (r11 != 0) goto Lf
            r2 = r1
            goto L16
        Lf:
            boolean r2 = r11.isAttachedToWindow()
            goto L16
        L14:
            r0 = r1
            r2 = r0
        L16:
            boolean r3 = androidx.transition.TransitionUtils.HAS_OVERLAY
            r4 = 0
            if (r3 == 0) goto L32
            if (r0 == 0) goto L32
            if (r2 != 0) goto L20
            return r4
        L20:
            android.view.ViewParent r1 = r8.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r2 = r1.indexOfChild(r8)
            android.view.ViewGroupOverlay r5 = r11.getOverlay()
            r5.add(r8)
            goto L34
        L32:
            r2 = r1
            r1 = r4
        L34:
            float r5 = r10.width()
            int r5 = java.lang.Math.round(r5)
            float r6 = r10.height()
            int r6 = java.lang.Math.round(r6)
            if (r5 <= 0) goto L98
            if (r6 <= 0) goto L98
            int r4 = r5 * r6
            float r4 = (float) r4
            r7 = 1233125376(0x49800000, float:1048576.0)
            float r7 = r7 / r4
            r4 = 1065353216(0x3f800000, float:1.0)
            float r4 = java.lang.Math.min(r4, r7)
            float r5 = (float) r5
            float r5 = r5 * r4
            int r5 = java.lang.Math.round(r5)
            float r6 = (float) r6
            float r6 = r6 * r4
            int r6 = java.lang.Math.round(r6)
            float r7 = r10.left
            float r7 = -r7
            float r10 = r10.top
            float r10 = -r10
            r9.postTranslate(r7, r10)
            r9.postScale(r4, r4)
            boolean r10 = androidx.transition.TransitionUtils.HAS_PICTURE_BITMAP
            if (r10 == 0) goto L87
            android.graphics.Picture r10 = new android.graphics.Picture
            r10.<init>()
            android.graphics.Canvas r4 = r10.beginRecording(r5, r6)
            r4.concat(r9)
            r8.draw(r4)
            r10.endRecording()
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r10)
            goto L98
        L87:
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r5, r6, r10)
            android.graphics.Canvas r10 = new android.graphics.Canvas
            r10.<init>(r4)
            r10.concat(r9)
            r8.draw(r10)
        L98:
            if (r3 == 0) goto La6
            if (r0 == 0) goto La6
            android.view.ViewGroupOverlay r9 = r11.getOverlay()
            r9.remove(r8)
            r1.addView(r8, r2)
        La6:
            return r4
    }

    static android.animation.Animator mergeAnimators(android.animation.Animator r3, android.animation.Animator r4) {
            if (r3 != 0) goto L3
            return r4
        L3:
            if (r4 != 0) goto L6
            return r3
        L6:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r1 = 2
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r0.playTogether(r1)
            return r0
    }
}
