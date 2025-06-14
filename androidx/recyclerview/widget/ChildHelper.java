package androidx.recyclerview.widget;

/* loaded from: classes.dex */
class ChildHelper {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "ChildrenHelper";
    final androidx.recyclerview.widget.ChildHelper.Bucket mBucket;
    final androidx.recyclerview.widget.ChildHelper.Callback mCallback;
    final java.util.List<android.view.View> mHiddenViews;

    static class Bucket {
        static final int BITS_PER_WORD = 64;
        static final long LAST_BIT = Long.MIN_VALUE;
        long mData;
        androidx.recyclerview.widget.ChildHelper.Bucket mNext;

        Bucket() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.mData = r0
                return
        }

        private void ensureNext() {
                r1 = this;
                androidx.recyclerview.widget.ChildHelper$Bucket r0 = r1.mNext
                if (r0 != 0) goto Lb
                androidx.recyclerview.widget.ChildHelper$Bucket r0 = new androidx.recyclerview.widget.ChildHelper$Bucket
                r0.<init>()
                r1.mNext = r0
            Lb:
                return
        }

        void clear(int r5) {
                r4 = this;
                r0 = 64
                if (r5 < r0) goto Ld
                androidx.recyclerview.widget.ChildHelper$Bucket r1 = r4.mNext
                if (r1 == 0) goto L16
                int r5 = r5 - r0
                r1.clear(r5)
                goto L16
            Ld:
                long r0 = r4.mData
                r2 = 1
                long r2 = r2 << r5
                long r2 = ~r2
                long r0 = r0 & r2
                r4.mData = r0
            L16:
                return
        }

        int countOnesBefore(int r7) {
                r6 = this;
                androidx.recyclerview.widget.ChildHelper$Bucket r0 = r6.mNext
                r1 = 64
                r2 = 1
                if (r0 != 0) goto L1c
                if (r7 < r1) goto L11
                long r0 = r6.mData
                int r7 = java.lang.Long.bitCount(r0)
                return r7
            L11:
                long r0 = r6.mData
                long r4 = r2 << r7
                long r4 = r4 - r2
                long r0 = r0 & r4
                int r7 = java.lang.Long.bitCount(r0)
                return r7
            L1c:
                if (r7 >= r1) goto L29
                long r0 = r6.mData
                long r4 = r2 << r7
                long r4 = r4 - r2
                long r0 = r0 & r4
                int r7 = java.lang.Long.bitCount(r0)
                return r7
            L29:
                int r7 = r7 - r1
                int r7 = r0.countOnesBefore(r7)
                long r0 = r6.mData
                int r0 = java.lang.Long.bitCount(r0)
                int r7 = r7 + r0
                return r7
        }

        boolean get(int r5) {
                r4 = this;
                r0 = 64
                if (r5 < r0) goto Lf
                r4.ensureNext()
                androidx.recyclerview.widget.ChildHelper$Bucket r1 = r4.mNext
                int r5 = r5 - r0
                boolean r5 = r1.get(r5)
                return r5
            Lf:
                long r0 = r4.mData
                r2 = 1
                long r2 = r2 << r5
                long r0 = r0 & r2
                r2 = 0
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 == 0) goto L1d
                r5 = 1
                goto L1e
            L1d:
                r5 = 0
            L1e:
                return r5
        }

        void insert(int r10, boolean r11) {
                r9 = this;
                r0 = 64
                if (r10 < r0) goto Le
                r9.ensureNext()
                androidx.recyclerview.widget.ChildHelper$Bucket r1 = r9.mNext
                int r10 = r10 - r0
                r1.insert(r10, r11)
                goto L42
            Le:
                long r0 = r9.mData
                r2 = -9223372036854775808
                long r2 = r2 & r0
                r4 = 0
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L1d
                r2 = r3
                goto L1e
            L1d:
                r2 = r4
            L1e:
                r5 = 1
                long r7 = r5 << r10
                long r7 = r7 - r5
                long r5 = r0 & r7
                long r7 = ~r7
                long r0 = r0 & r7
                long r0 = r0 << r3
                long r0 = r0 | r5
                r9.mData = r0
                if (r11 == 0) goto L31
                r9.set(r10)
                goto L34
            L31:
                r9.clear(r10)
            L34:
                if (r2 != 0) goto L3a
                androidx.recyclerview.widget.ChildHelper$Bucket r10 = r9.mNext
                if (r10 == 0) goto L42
            L3a:
                r9.ensureNext()
                androidx.recyclerview.widget.ChildHelper$Bucket r10 = r9.mNext
                r10.insert(r4, r2)
            L42:
                return
        }

        boolean remove(int r11) {
                r10 = this;
                r0 = 64
                if (r11 < r0) goto Lf
                r10.ensureNext()
                androidx.recyclerview.widget.ChildHelper$Bucket r1 = r10.mNext
                int r11 = r11 - r0
                boolean r11 = r1.remove(r11)
                return r11
            Lf:
                r0 = 1
                long r2 = r0 << r11
                long r4 = r10.mData
                long r6 = r4 & r2
                r8 = 0
                int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                r6 = 1
                r7 = 0
                if (r11 == 0) goto L21
                r11 = r6
                goto L22
            L21:
                r11 = r7
            L22:
                long r8 = ~r2
                long r4 = r4 & r8
                r10.mData = r4
                long r2 = r2 - r0
                long r0 = r4 & r2
                long r2 = ~r2
                long r2 = r2 & r4
                long r2 = java.lang.Long.rotateRight(r2, r6)
                long r0 = r0 | r2
                r10.mData = r0
                androidx.recyclerview.widget.ChildHelper$Bucket r0 = r10.mNext
                if (r0 == 0) goto L46
                boolean r0 = r0.get(r7)
                if (r0 == 0) goto L41
                r0 = 63
                r10.set(r0)
            L41:
                androidx.recyclerview.widget.ChildHelper$Bucket r0 = r10.mNext
                r0.remove(r7)
            L46:
                return r11
        }

        void reset() {
                r2 = this;
                r0 = 0
                r2.mData = r0
                androidx.recyclerview.widget.ChildHelper$Bucket r0 = r2.mNext
                if (r0 == 0) goto Lb
                r0.reset()
            Lb:
                return
        }

        void set(int r5) {
                r4 = this;
                r0 = 64
                if (r5 < r0) goto Le
                r4.ensureNext()
                androidx.recyclerview.widget.ChildHelper$Bucket r1 = r4.mNext
                int r5 = r5 - r0
                r1.set(r5)
                goto L16
            Le:
                long r0 = r4.mData
                r2 = 1
                long r2 = r2 << r5
                long r0 = r0 | r2
                r4.mData = r0
            L16:
                return
        }

        public java.lang.String toString() {
                r3 = this;
                androidx.recyclerview.widget.ChildHelper$Bucket r0 = r3.mNext
                if (r0 != 0) goto Lb
                long r0 = r3.mData
                java.lang.String r0 = java.lang.Long.toBinaryString(r0)
                goto L2e
            Lb:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                androidx.recyclerview.widget.ChildHelper$Bucket r1 = r3.mNext
                java.lang.String r1 = r1.toString()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "xx"
                java.lang.StringBuilder r0 = r0.append(r1)
                long r1 = r3.mData
                java.lang.String r1 = java.lang.Long.toBinaryString(r1)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
            L2e:
                return r0
        }
    }

    interface Callback {
        void addView(android.view.View r1, int r2);

        void attachViewToParent(android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3);

        void detachViewFromParent(int r1);

        android.view.View getChildAt(int r1);

        int getChildCount();

        androidx.recyclerview.widget.RecyclerView.ViewHolder getChildViewHolder(android.view.View r1);

        int indexOfChild(android.view.View r1);

        void onEnteredHiddenState(android.view.View r1);

        void onLeftHiddenState(android.view.View r1);

        void removeAllViews();

        void removeViewAt(int r1);
    }

    ChildHelper(androidx.recyclerview.widget.ChildHelper.Callback r1) {
            r0 = this;
            r0.<init>()
            r0.mCallback = r1
            androidx.recyclerview.widget.ChildHelper$Bucket r1 = new androidx.recyclerview.widget.ChildHelper$Bucket
            r1.<init>()
            r0.mBucket = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.mHiddenViews = r1
            return
    }

    private int getOffset(int r5) {
            r4 = this;
            r0 = -1
            if (r5 >= 0) goto L4
            return r0
        L4:
            androidx.recyclerview.widget.ChildHelper$Callback r1 = r4.mCallback
            int r1 = r1.getChildCount()
            r2 = r5
        Lb:
            if (r2 >= r1) goto L27
            androidx.recyclerview.widget.ChildHelper$Bucket r3 = r4.mBucket
            int r3 = r3.countOnesBefore(r2)
            int r3 = r2 - r3
            int r3 = r5 - r3
            if (r3 != 0) goto L25
        L19:
            androidx.recyclerview.widget.ChildHelper$Bucket r5 = r4.mBucket
            boolean r5 = r5.get(r2)
            if (r5 == 0) goto L24
            int r2 = r2 + 1
            goto L19
        L24:
            return r2
        L25:
            int r2 = r2 + r3
            goto Lb
        L27:
            return r0
    }

    private void hideViewInternal(android.view.View r2) {
            r1 = this;
            java.util.List<android.view.View> r0 = r1.mHiddenViews
            r0.add(r2)
            androidx.recyclerview.widget.ChildHelper$Callback r0 = r1.mCallback
            r0.onEnteredHiddenState(r2)
            return
    }

    private boolean unhideViewInternal(android.view.View r2) {
            r1 = this;
            java.util.List<android.view.View> r0 = r1.mHiddenViews
            boolean r0 = r0.remove(r2)
            if (r0 == 0) goto Lf
            androidx.recyclerview.widget.ChildHelper$Callback r0 = r1.mCallback
            r0.onLeftHiddenState(r2)
            r2 = 1
            return r2
        Lf:
            r2 = 0
            return r2
    }

    void addView(android.view.View r2, int r3, boolean r4) {
            r1 = this;
            if (r3 >= 0) goto L9
            androidx.recyclerview.widget.ChildHelper$Callback r3 = r1.mCallback
            int r3 = r3.getChildCount()
            goto Ld
        L9:
            int r3 = r1.getOffset(r3)
        Ld:
            androidx.recyclerview.widget.ChildHelper$Bucket r0 = r1.mBucket
            r0.insert(r3, r4)
            if (r4 == 0) goto L17
            r1.hideViewInternal(r2)
        L17:
            androidx.recyclerview.widget.ChildHelper$Callback r4 = r1.mCallback
            r4.addView(r2, r3)
            return
    }

    void addView(android.view.View r2, boolean r3) {
            r1 = this;
            r0 = -1
            r1.addView(r2, r0, r3)
            return
    }

    void attachViewToParent(android.view.View r2, int r3, android.view.ViewGroup.LayoutParams r4, boolean r5) {
            r1 = this;
            if (r3 >= 0) goto L9
            androidx.recyclerview.widget.ChildHelper$Callback r3 = r1.mCallback
            int r3 = r3.getChildCount()
            goto Ld
        L9:
            int r3 = r1.getOffset(r3)
        Ld:
            androidx.recyclerview.widget.ChildHelper$Bucket r0 = r1.mBucket
            r0.insert(r3, r5)
            if (r5 == 0) goto L17
            r1.hideViewInternal(r2)
        L17:
            androidx.recyclerview.widget.ChildHelper$Callback r5 = r1.mCallback
            r5.attachViewToParent(r2, r3, r4)
            return
    }

    void detachViewFromParent(int r2) {
            r1 = this;
            int r2 = r1.getOffset(r2)
            androidx.recyclerview.widget.ChildHelper$Bucket r0 = r1.mBucket
            r0.remove(r2)
            androidx.recyclerview.widget.ChildHelper$Callback r0 = r1.mCallback
            r0.detachViewFromParent(r2)
            return
    }

    android.view.View findHiddenNonRemovedView(int r6) {
            r5 = this;
            java.util.List<android.view.View> r0 = r5.mHiddenViews
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L2d
            java.util.List<android.view.View> r2 = r5.mHiddenViews
            java.lang.Object r2 = r2.get(r1)
            android.view.View r2 = (android.view.View) r2
            androidx.recyclerview.widget.ChildHelper$Callback r3 = r5.mCallback
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = r3.getChildViewHolder(r2)
            int r4 = r3.getLayoutPosition()
            if (r4 != r6) goto L2a
            boolean r4 = r3.isInvalid()
            if (r4 != 0) goto L2a
            boolean r3 = r3.isRemoved()
            if (r3 != 0) goto L2a
            return r2
        L2a:
            int r1 = r1 + 1
            goto L7
        L2d:
            r6 = 0
            return r6
    }

    android.view.View getChildAt(int r2) {
            r1 = this;
            int r2 = r1.getOffset(r2)
            androidx.recyclerview.widget.ChildHelper$Callback r0 = r1.mCallback
            android.view.View r2 = r0.getChildAt(r2)
            return r2
    }

    int getChildCount() {
            r2 = this;
            androidx.recyclerview.widget.ChildHelper$Callback r0 = r2.mCallback
            int r0 = r0.getChildCount()
            java.util.List<android.view.View> r1 = r2.mHiddenViews
            int r1 = r1.size()
            int r0 = r0 - r1
            return r0
    }

    android.view.View getUnfilteredChildAt(int r2) {
            r1 = this;
            androidx.recyclerview.widget.ChildHelper$Callback r0 = r1.mCallback
            android.view.View r2 = r0.getChildAt(r2)
            return r2
    }

    int getUnfilteredChildCount() {
            r1 = this;
            androidx.recyclerview.widget.ChildHelper$Callback r0 = r1.mCallback
            int r0 = r0.getChildCount()
            return r0
    }

    void hide(android.view.View r4) {
            r3 = this;
            androidx.recyclerview.widget.ChildHelper$Callback r0 = r3.mCallback
            int r0 = r0.indexOfChild(r4)
            if (r0 < 0) goto L11
            androidx.recyclerview.widget.ChildHelper$Bucket r1 = r3.mBucket
            r1.set(r0)
            r3.hideViewInternal(r4)
            return
        L11:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "view is not a child, cannot hide "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    int indexOfChild(android.view.View r3) {
            r2 = this;
            androidx.recyclerview.widget.ChildHelper$Callback r0 = r2.mCallback
            int r3 = r0.indexOfChild(r3)
            r0 = -1
            if (r3 != r0) goto La
            return r0
        La:
            androidx.recyclerview.widget.ChildHelper$Bucket r1 = r2.mBucket
            boolean r1 = r1.get(r3)
            if (r1 == 0) goto L13
            return r0
        L13:
            androidx.recyclerview.widget.ChildHelper$Bucket r0 = r2.mBucket
            int r0 = r0.countOnesBefore(r3)
            int r3 = r3 - r0
            return r3
    }

    boolean isHidden(android.view.View r2) {
            r1 = this;
            java.util.List<android.view.View> r0 = r1.mHiddenViews
            boolean r2 = r0.contains(r2)
            return r2
    }

    void removeAllViewsUnfiltered() {
            r3 = this;
            androidx.recyclerview.widget.ChildHelper$Bucket r0 = r3.mBucket
            r0.reset()
            java.util.List<android.view.View> r0 = r3.mHiddenViews
            int r0 = r0.size()
            int r0 = r0 + (-1)
        Ld:
            if (r0 < 0) goto L24
            androidx.recyclerview.widget.ChildHelper$Callback r1 = r3.mCallback
            java.util.List<android.view.View> r2 = r3.mHiddenViews
            java.lang.Object r2 = r2.get(r0)
            android.view.View r2 = (android.view.View) r2
            r1.onLeftHiddenState(r2)
            java.util.List<android.view.View> r1 = r3.mHiddenViews
            r1.remove(r0)
            int r0 = r0 + (-1)
            goto Ld
        L24:
            androidx.recyclerview.widget.ChildHelper$Callback r0 = r3.mCallback
            r0.removeAllViews()
            return
    }

    void removeView(android.view.View r3) {
            r2 = this;
            androidx.recyclerview.widget.ChildHelper$Callback r0 = r2.mCallback
            int r0 = r0.indexOfChild(r3)
            if (r0 >= 0) goto L9
            return
        L9:
            androidx.recyclerview.widget.ChildHelper$Bucket r1 = r2.mBucket
            boolean r1 = r1.remove(r0)
            if (r1 == 0) goto L14
            r2.unhideViewInternal(r3)
        L14:
            androidx.recyclerview.widget.ChildHelper$Callback r3 = r2.mCallback
            r3.removeViewAt(r0)
            return
    }

    void removeViewAt(int r3) {
            r2 = this;
            int r3 = r2.getOffset(r3)
            androidx.recyclerview.widget.ChildHelper$Callback r0 = r2.mCallback
            android.view.View r0 = r0.getChildAt(r3)
            if (r0 != 0) goto Ld
            return
        Ld:
            androidx.recyclerview.widget.ChildHelper$Bucket r1 = r2.mBucket
            boolean r1 = r1.remove(r3)
            if (r1 == 0) goto L18
            r2.unhideViewInternal(r0)
        L18:
            androidx.recyclerview.widget.ChildHelper$Callback r0 = r2.mCallback
            r0.removeViewAt(r3)
            return
    }

    boolean removeViewIfHidden(android.view.View r4) {
            r3 = this;
            androidx.recyclerview.widget.ChildHelper$Callback r0 = r3.mCallback
            int r0 = r0.indexOfChild(r4)
            r1 = -1
            r2 = 1
            if (r0 != r1) goto Le
            r3.unhideViewInternal(r4)
            return r2
        Le:
            androidx.recyclerview.widget.ChildHelper$Bucket r1 = r3.mBucket
            boolean r1 = r1.get(r0)
            if (r1 == 0) goto L24
            androidx.recyclerview.widget.ChildHelper$Bucket r1 = r3.mBucket
            r1.remove(r0)
            r3.unhideViewInternal(r4)
            androidx.recyclerview.widget.ChildHelper$Callback r4 = r3.mCallback
            r4.removeViewAt(r0)
            return r2
        L24:
            r4 = 0
            return r4
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            androidx.recyclerview.widget.ChildHelper$Bucket r1 = r2.mBucket
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", hidden list:"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.List<android.view.View> r1 = r2.mHiddenViews
            int r1 = r1.size()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    void unhide(android.view.View r4) {
            r3 = this;
            androidx.recyclerview.widget.ChildHelper$Callback r0 = r3.mCallback
            int r0 = r0.indexOfChild(r4)
            if (r0 < 0) goto L2e
            androidx.recyclerview.widget.ChildHelper$Bucket r1 = r3.mBucket
            boolean r1 = r1.get(r0)
            if (r1 == 0) goto L19
            androidx.recyclerview.widget.ChildHelper$Bucket r1 = r3.mBucket
            r1.clear(r0)
            r3.unhideViewInternal(r4)
            return
        L19:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "trying to unhide a view that was not hidden"
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L2e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "view is not a child, cannot hide "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }
}
