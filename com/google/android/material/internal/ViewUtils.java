package com.google.android.material.internal;

/* loaded from: classes.dex */
public class ViewUtils {





    public interface OnApplyWindowInsetsListener {
        androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View r1, androidx.core.view.WindowInsetsCompat r2, com.google.android.material.internal.ViewUtils.RelativePadding r3);
    }

    public static class RelativePadding {
        public int bottom;
        public int end;
        public int start;
        public int top;

        public RelativePadding(int r1, int r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.start = r1
                r0.top = r2
                r0.end = r3
                r0.bottom = r4
                return
        }

        public RelativePadding(com.google.android.material.internal.ViewUtils.RelativePadding r2) {
                r1 = this;
                r1.<init>()
                int r0 = r2.start
                r1.start = r0
                int r0 = r2.top
                r1.top = r0
                int r0 = r2.end
                r1.end = r0
                int r2 = r2.bottom
                r1.bottom = r2
                return
        }

        public void applyToView(android.view.View r5) {
                r4 = this;
                int r0 = r4.start
                int r1 = r4.top
                int r2 = r4.end
                int r3 = r4.bottom
                androidx.core.view.ViewCompat.setPaddingRelative(r5, r0, r1, r2, r3)
                return
        }
    }

    private ViewUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void addOnGlobalLayoutListener(android.view.View r0, android.view.ViewTreeObserver.OnGlobalLayoutListener r1) {
            if (r0 == 0) goto L9
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r0.addOnGlobalLayoutListener(r1)
        L9:
            return
    }

    public static void doOnApplyWindowInsets(android.view.View r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = 0
            doOnApplyWindowInsets(r1, r2, r3, r4, r0)
            return
    }

    public static void doOnApplyWindowInsets(android.view.View r2, android.util.AttributeSet r3, int r4, int r5, com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener r6) {
            android.content.Context r0 = r2.getContext()
            int[] r1 = com.google.android.material.C0479R.styleable.Insets
            android.content.res.TypedArray r3 = r0.obtainStyledAttributes(r3, r1, r4, r5)
            int r4 = com.google.android.material.C0479R.styleable.Insets_paddingBottomSystemWindowInsets
            r5 = 0
            boolean r4 = r3.getBoolean(r4, r5)
            int r0 = com.google.android.material.C0479R.styleable.Insets_paddingLeftSystemWindowInsets
            boolean r0 = r3.getBoolean(r0, r5)
            int r1 = com.google.android.material.C0479R.styleable.Insets_paddingRightSystemWindowInsets
            boolean r5 = r3.getBoolean(r1, r5)
            r3.recycle()
            com.google.android.material.internal.ViewUtils$2 r3 = new com.google.android.material.internal.ViewUtils$2
            r3.<init>(r4, r0, r5, r6)
            doOnApplyWindowInsets(r2, r3)
            return
    }

    public static void doOnApplyWindowInsets(android.view.View r5, com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener r6) {
            com.google.android.material.internal.ViewUtils$RelativePadding r0 = new com.google.android.material.internal.ViewUtils$RelativePadding
            int r1 = androidx.core.view.ViewCompat.getPaddingStart(r5)
            int r2 = r5.getPaddingTop()
            int r3 = androidx.core.view.ViewCompat.getPaddingEnd(r5)
            int r4 = r5.getPaddingBottom()
            r0.<init>(r1, r2, r3, r4)
            com.google.android.material.internal.ViewUtils$3 r1 = new com.google.android.material.internal.ViewUtils$3
            r1.<init>(r6, r0)
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(r5, r1)
            requestApplyInsetsWhenAttached(r5)
            return
    }

    public static float dpToPx(android.content.Context r1, int r2) {
            android.content.res.Resources r1 = r1.getResources()
            float r2 = (float) r2
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            r0 = 1
            float r1 = android.util.TypedValue.applyDimension(r0, r2, r1)
            return r1
    }

    public static android.view.ViewGroup getContentView(android.view.View r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            android.view.View r1 = r3.getRootView()
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r2 = r1.findViewById(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 == 0) goto L14
            return r2
        L14:
            if (r1 == r3) goto L1d
            boolean r3 = r1 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1d
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            return r1
        L1d:
            return r0
    }

    public static com.google.android.material.internal.ViewOverlayImpl getContentViewOverlay(android.view.View r0) {
            android.view.ViewGroup r0 = getContentView(r0)
            com.google.android.material.internal.ViewOverlayImpl r0 = getOverlay(r0)
            return r0
    }

    public static com.google.android.material.internal.ViewOverlayImpl getOverlay(android.view.View r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            com.google.android.material.internal.ViewOverlayApi18 r0 = new com.google.android.material.internal.ViewOverlayApi18
            r0.<init>(r1)
            return r0
    }

    public static float getParentAbsoluteElevation(android.view.View r2) {
            android.view.ViewParent r2 = r2.getParent()
            r0 = 0
        L5:
            boolean r1 = r2 instanceof android.view.View
            if (r1 == 0) goto L16
            r1 = r2
            android.view.View r1 = (android.view.View) r1
            float r1 = androidx.core.view.ViewCompat.getElevation(r1)
            float r0 = r0 + r1
            android.view.ViewParent r2 = r2.getParent()
            goto L5
        L16:
            return r0
    }

    public static boolean isLayoutRtl(android.view.View r1) {
            int r1 = androidx.core.view.ViewCompat.getLayoutDirection(r1)
            r0 = 1
            if (r1 != r0) goto L8
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static android.graphics.PorterDuff.Mode parseTintMode(int r1, android.graphics.PorterDuff.Mode r2) {
            r0 = 3
            if (r1 == r0) goto L1d
            r0 = 5
            if (r1 == r0) goto L1a
            r0 = 9
            if (r1 == r0) goto L17
            switch(r1) {
                case 14: goto L14;
                case 15: goto L11;
                case 16: goto Le;
                default: goto Ld;
            }
        Ld:
            return r2
        Le:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.ADD
            return r1
        L11:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SCREEN
            return r1
        L14:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
            return r1
        L17:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            return r1
        L1a:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            return r1
        L1d:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_OVER
            return r1
    }

    public static void removeOnGlobalLayoutListener(android.view.View r0, android.view.ViewTreeObserver.OnGlobalLayoutListener r1) {
            if (r0 == 0) goto L9
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            removeOnGlobalLayoutListener(r0, r1)
        L9:
            return
    }

    public static void removeOnGlobalLayoutListener(android.view.ViewTreeObserver r0, android.view.ViewTreeObserver.OnGlobalLayoutListener r1) {
            r0.removeOnGlobalLayoutListener(r1)
            return
    }

    public static void requestApplyInsetsWhenAttached(android.view.View r1) {
            boolean r0 = androidx.core.view.ViewCompat.isAttachedToWindow(r1)
            if (r0 == 0) goto La
            androidx.core.view.ViewCompat.requestApplyInsets(r1)
            goto L12
        La:
            com.google.android.material.internal.ViewUtils$4 r0 = new com.google.android.material.internal.ViewUtils$4
            r0.<init>()
            r1.addOnAttachStateChangeListener(r0)
        L12:
            return
    }

    public static void requestFocusAndShowKeyboard(android.view.View r1) {
            r1.requestFocus()
            com.google.android.material.internal.ViewUtils$1 r0 = new com.google.android.material.internal.ViewUtils$1
            r0.<init>(r1)
            r1.post(r0)
            return
    }
}
