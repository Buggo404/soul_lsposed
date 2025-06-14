package androidx.recyclerview.widget;

/* loaded from: classes.dex */
class ViewBoundsCheck {
    static final int CVE_PVE_POS = 12;
    static final int CVE_PVS_POS = 8;
    static final int CVS_PVE_POS = 4;
    static final int CVS_PVS_POS = 0;

    /* renamed from: EQ */
    static final int f83EQ = 2;
    static final int FLAG_CVE_EQ_PVE = 8192;
    static final int FLAG_CVE_EQ_PVS = 512;
    static final int FLAG_CVE_GT_PVE = 4096;
    static final int FLAG_CVE_GT_PVS = 256;
    static final int FLAG_CVE_LT_PVE = 16384;
    static final int FLAG_CVE_LT_PVS = 1024;
    static final int FLAG_CVS_EQ_PVE = 32;
    static final int FLAG_CVS_EQ_PVS = 2;
    static final int FLAG_CVS_GT_PVE = 16;
    static final int FLAG_CVS_GT_PVS = 1;
    static final int FLAG_CVS_LT_PVE = 64;
    static final int FLAG_CVS_LT_PVS = 4;

    /* renamed from: GT */
    static final int f84GT = 1;

    /* renamed from: LT */
    static final int f85LT = 4;
    static final int MASK = 7;
    androidx.recyclerview.widget.ViewBoundsCheck.BoundFlags mBoundFlags;
    final androidx.recyclerview.widget.ViewBoundsCheck.Callback mCallback;

    static class BoundFlags {
        int mBoundFlags;
        int mChildEnd;
        int mChildStart;
        int mRvEnd;
        int mRvStart;

        BoundFlags() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mBoundFlags = r0
                return
        }

        void addFlags(int r2) {
                r1 = this;
                int r0 = r1.mBoundFlags
                r2 = r2 | r0
                r1.mBoundFlags = r2
                return
        }

        boolean boundsMatch() {
                r4 = this;
                int r0 = r4.mBoundFlags
                r1 = r0 & 7
                r2 = 0
                if (r1 == 0) goto L14
                int r1 = r4.mChildStart
                int r3 = r4.mRvStart
                int r1 = r4.compare(r1, r3)
                int r1 = r1 << r2
                r0 = r0 & r1
                if (r0 != 0) goto L14
                return r2
            L14:
                int r0 = r4.mBoundFlags
                r1 = r0 & 112(0x70, float:1.57E-43)
                if (r1 == 0) goto L28
                int r1 = r4.mChildStart
                int r3 = r4.mRvEnd
                int r1 = r4.compare(r1, r3)
                int r1 = r1 << 4
                r0 = r0 & r1
                if (r0 != 0) goto L28
                return r2
            L28:
                int r0 = r4.mBoundFlags
                r1 = r0 & 1792(0x700, float:2.511E-42)
                if (r1 == 0) goto L3c
                int r1 = r4.mChildEnd
                int r3 = r4.mRvStart
                int r1 = r4.compare(r1, r3)
                int r1 = r1 << 8
                r0 = r0 & r1
                if (r0 != 0) goto L3c
                return r2
            L3c:
                int r0 = r4.mBoundFlags
                r1 = r0 & 28672(0x7000, float:4.0178E-41)
                if (r1 == 0) goto L50
                int r1 = r4.mChildEnd
                int r3 = r4.mRvEnd
                int r1 = r4.compare(r1, r3)
                int r1 = r1 << 12
                r0 = r0 & r1
                if (r0 != 0) goto L50
                return r2
            L50:
                r0 = 1
                return r0
        }

        int compare(int r1, int r2) {
                r0 = this;
                if (r1 <= r2) goto L4
                r1 = 1
                return r1
            L4:
                if (r1 != r2) goto L8
                r1 = 2
                return r1
            L8:
                r1 = 4
                return r1
        }

        void resetFlags() {
                r1 = this;
                r0 = 0
                r1.mBoundFlags = r0
                return
        }

        void setBounds(int r1, int r2, int r3, int r4) {
                r0 = this;
                r0.mRvStart = r1
                r0.mRvEnd = r2
                r0.mChildStart = r3
                r0.mChildEnd = r4
                return
        }
    }

    interface Callback {
        android.view.View getChildAt(int r1);

        int getChildEnd(android.view.View r1);

        int getChildStart(android.view.View r1);

        int getParentEnd();

        int getParentStart();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ViewBounds {
    }

    ViewBoundsCheck(androidx.recyclerview.widget.ViewBoundsCheck.Callback r1) {
            r0 = this;
            r0.<init>()
            r0.mCallback = r1
            androidx.recyclerview.widget.ViewBoundsCheck$BoundFlags r1 = new androidx.recyclerview.widget.ViewBoundsCheck$BoundFlags
            r1.<init>()
            r0.mBoundFlags = r1
            return
    }

    android.view.View findOneViewWithinBoundFlags(int r9, int r10, int r11, int r12) {
            r8 = this;
            androidx.recyclerview.widget.ViewBoundsCheck$Callback r0 = r8.mCallback
            int r0 = r0.getParentStart()
            androidx.recyclerview.widget.ViewBoundsCheck$Callback r1 = r8.mCallback
            int r1 = r1.getParentEnd()
            if (r10 <= r9) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = -1
        L11:
            r3 = 0
        L12:
            if (r9 == r10) goto L57
            androidx.recyclerview.widget.ViewBoundsCheck$Callback r4 = r8.mCallback
            android.view.View r4 = r4.getChildAt(r9)
            androidx.recyclerview.widget.ViewBoundsCheck$Callback r5 = r8.mCallback
            int r5 = r5.getChildStart(r4)
            androidx.recyclerview.widget.ViewBoundsCheck$Callback r6 = r8.mCallback
            int r6 = r6.getChildEnd(r4)
            androidx.recyclerview.widget.ViewBoundsCheck$BoundFlags r7 = r8.mBoundFlags
            r7.setBounds(r0, r1, r5, r6)
            if (r11 == 0) goto L40
            androidx.recyclerview.widget.ViewBoundsCheck$BoundFlags r5 = r8.mBoundFlags
            r5.resetFlags()
            androidx.recyclerview.widget.ViewBoundsCheck$BoundFlags r5 = r8.mBoundFlags
            r5.addFlags(r11)
            androidx.recyclerview.widget.ViewBoundsCheck$BoundFlags r5 = r8.mBoundFlags
            boolean r5 = r5.boundsMatch()
            if (r5 == 0) goto L40
            return r4
        L40:
            if (r12 == 0) goto L55
            androidx.recyclerview.widget.ViewBoundsCheck$BoundFlags r5 = r8.mBoundFlags
            r5.resetFlags()
            androidx.recyclerview.widget.ViewBoundsCheck$BoundFlags r5 = r8.mBoundFlags
            r5.addFlags(r12)
            androidx.recyclerview.widget.ViewBoundsCheck$BoundFlags r5 = r8.mBoundFlags
            boolean r5 = r5.boundsMatch()
            if (r5 == 0) goto L55
            r3 = r4
        L55:
            int r9 = r9 + r2
            goto L12
        L57:
            return r3
    }

    boolean isViewWithinBoundFlags(android.view.View r6, int r7) {
            r5 = this;
            androidx.recyclerview.widget.ViewBoundsCheck$BoundFlags r0 = r5.mBoundFlags
            androidx.recyclerview.widget.ViewBoundsCheck$Callback r1 = r5.mCallback
            int r1 = r1.getParentStart()
            androidx.recyclerview.widget.ViewBoundsCheck$Callback r2 = r5.mCallback
            int r2 = r2.getParentEnd()
            androidx.recyclerview.widget.ViewBoundsCheck$Callback r3 = r5.mCallback
            int r3 = r3.getChildStart(r6)
            androidx.recyclerview.widget.ViewBoundsCheck$Callback r4 = r5.mCallback
            int r6 = r4.getChildEnd(r6)
            r0.setBounds(r1, r2, r3, r6)
            if (r7 == 0) goto L30
            androidx.recyclerview.widget.ViewBoundsCheck$BoundFlags r6 = r5.mBoundFlags
            r6.resetFlags()
            androidx.recyclerview.widget.ViewBoundsCheck$BoundFlags r6 = r5.mBoundFlags
            r6.addFlags(r7)
            androidx.recyclerview.widget.ViewBoundsCheck$BoundFlags r6 = r5.mBoundFlags
            boolean r6 = r6.boundsMatch()
            return r6
        L30:
            r6 = 0
            return r6
    }
}
