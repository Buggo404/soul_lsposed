package androidx.viewpager2.widget;

/* loaded from: classes.dex */
final class AnimateLayoutChangeDetector {
    private static final android.view.ViewGroup.MarginLayoutParams ZERO_MARGIN_LAYOUT_PARAMS = null;
    private androidx.recyclerview.widget.LinearLayoutManager mLayoutManager;


    static {
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            r1 = -1
            r0.<init>(r1, r1)
            androidx.viewpager2.widget.AnimateLayoutChangeDetector.ZERO_MARGIN_LAYOUT_PARAMS = r0
            r1 = 0
            r0.setMargins(r1, r1, r1, r1)
            return
    }

    AnimateLayoutChangeDetector(androidx.recyclerview.widget.LinearLayoutManager r1) {
            r0 = this;
            r0.<init>()
            r0.mLayoutManager = r1
            return
    }

    private boolean arePagesLaidOutContiguously() {
            r11 = this;
            androidx.recyclerview.widget.LinearLayoutManager r0 = r11.mLayoutManager
            int r0 = r0.getChildCount()
            r1 = 1
            if (r0 != 0) goto La
            return r1
        La:
            androidx.recyclerview.widget.LinearLayoutManager r2 = r11.mLayoutManager
            int r2 = r2.getOrientation()
            r3 = 0
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r3
        L16:
            r4 = 2
            int[] r5 = new int[r4]
            r5[r1] = r4
            r5[r3] = r0
            java.lang.Class r4 = java.lang.Integer.TYPE
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r5)
            int[][] r4 = (int[][]) r4
            r5 = r3
        L26:
            if (r5 >= r0) goto L70
            androidx.recyclerview.widget.LinearLayoutManager r6 = r11.mLayoutManager
            android.view.View r6 = r6.getChildAt(r5)
            if (r6 == 0) goto L68
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            boolean r8 = r7 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r8 == 0) goto L3b
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
            goto L3d
        L3b:
            android.view.ViewGroup$MarginLayoutParams r7 = androidx.viewpager2.widget.AnimateLayoutChangeDetector.ZERO_MARGIN_LAYOUT_PARAMS
        L3d:
            r8 = r4[r5]
            if (r2 == 0) goto L48
            int r9 = r6.getLeft()
            int r10 = r7.leftMargin
            goto L4e
        L48:
            int r9 = r6.getTop()
            int r10 = r7.topMargin
        L4e:
            int r9 = r9 - r10
            r8[r3] = r9
            r8 = r4[r5]
            if (r2 == 0) goto L5c
            int r6 = r6.getRight()
            int r7 = r7.rightMargin
            goto L62
        L5c:
            int r6 = r6.getBottom()
            int r7 = r7.bottomMargin
        L62:
            int r6 = r6 + r7
            r8[r1] = r6
            int r5 = r5 + 1
            goto L26
        L68:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "null view contained in the view hierarchy"
            r0.<init>(r1)
            throw r0
        L70:
            androidx.viewpager2.widget.AnimateLayoutChangeDetector$1 r2 = new androidx.viewpager2.widget.AnimateLayoutChangeDetector$1
            r2.<init>(r11)
            java.util.Arrays.sort(r4, r2)
            r2 = r1
        L79:
            if (r2 >= r0) goto L8b
            int r5 = r2 + (-1)
            r5 = r4[r5]
            r5 = r5[r1]
            r6 = r4[r2]
            r6 = r6[r3]
            if (r5 == r6) goto L88
            return r3
        L88:
            int r2 = r2 + 1
            goto L79
        L8b:
            r2 = r4[r3]
            r5 = r2[r1]
            r2 = r2[r3]
            int r5 = r5 - r2
            if (r2 > 0) goto L9d
            int r0 = r0 - r1
            r0 = r4[r0]
            r0 = r0[r1]
            if (r0 >= r5) goto L9c
            goto L9d
        L9c:
            return r1
        L9d:
            return r3
    }

    private boolean hasRunningChangingLayoutTransition() {
            r4 = this;
            androidx.recyclerview.widget.LinearLayoutManager r0 = r4.mLayoutManager
            int r0 = r0.getChildCount()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L1b
            androidx.recyclerview.widget.LinearLayoutManager r3 = r4.mLayoutManager
            android.view.View r3 = r3.getChildAt(r2)
            boolean r3 = hasRunningChangingLayoutTransition(r3)
            if (r3 == 0) goto L18
            r0 = 1
            return r0
        L18:
            int r2 = r2 + 1
            goto L8
        L1b:
            return r1
    }

    private static boolean hasRunningChangingLayoutTransition(android.view.View r5) {
            boolean r0 = r5 instanceof android.view.ViewGroup
            r1 = 0
            if (r0 == 0) goto L2a
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.animation.LayoutTransition r0 = r5.getLayoutTransition()
            r2 = 1
            if (r0 == 0) goto L15
            boolean r0 = r0.isChangingLayout()
            if (r0 == 0) goto L15
            return r2
        L15:
            int r0 = r5.getChildCount()
            r3 = r1
        L1a:
            if (r3 >= r0) goto L2a
            android.view.View r4 = r5.getChildAt(r3)
            boolean r4 = hasRunningChangingLayoutTransition(r4)
            if (r4 == 0) goto L27
            return r2
        L27:
            int r3 = r3 + 1
            goto L1a
        L2a:
            return r1
    }

    boolean mayHaveInterferingAnimations() {
            r2 = this;
            boolean r0 = r2.arePagesLaidOutContiguously()
            r1 = 1
            if (r0 == 0) goto Lf
            androidx.recyclerview.widget.LinearLayoutManager r0 = r2.mLayoutManager
            int r0 = r0.getChildCount()
            if (r0 > r1) goto L16
        Lf:
            boolean r0 = r2.hasRunningChangingLayoutTransition()
            if (r0 == 0) goto L16
            goto L17
        L16:
            r1 = 0
        L17:
            return r1
    }
}
